package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputChannel;
import org.telegram.tgnet.TLRPC$TL_account_updateColor;
import org.telegram.tgnet.TLRPC$TL_channels_updateColor;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_peerColor;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.tl.TL_stories$TL_premium_boostsStatus;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.ThemePreviewMessagesCell;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.FilledTabsView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
public class PeerColorActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private static final float[] particles = {-18.0f, -24.66f, 24.0f, 0.4f, 5.33f, -53.0f, 28.0f, 0.38f, -4.0f, -86.0f, 19.0f, 0.18f, 31.0f, -30.0f, 21.0f, 0.35f, 12.0f, -3.0f, 24.0f, 0.18f, 30.0f, -73.0f, 19.0f, 0.3f, 43.0f, -101.0f, 16.0f, 0.1f, -50.0f, 1.33f, 20.0f, 0.22f, -58.0f, -33.0f, 24.0f, 0.22f, -35.0f, -62.0f, 25.0f, 0.22f, -59.0f, -88.0f, 19.0f, 0.18f, -86.0f, -61.0f, 19.0f, 0.1f, -90.0f, -14.33f, 19.66f, 0.18f};
    private FrameLayout actionBarContainer;
    private boolean applying;
    private boolean applyingName;
    private boolean applyingProfile;
    private ImageView backButton;
    private BaseFragment bulletinFragment;
    private View changeDayNightView;
    private ValueAnimator changeDayNightViewAnimator;
    private float changeDayNightViewProgress;
    private ColoredActionBar colorBar;
    private FrameLayout contentView;
    private final SparseIntArray currentColors = new SparseIntArray();
    private ImageView dayNightItem;
    private final long dialogId;
    private boolean forceDark;
    private final boolean isChannel;
    private boolean isDark;
    public boolean loading;
    private final Theme.MessageDrawable msgInDrawable;
    private final Theme.MessageDrawable msgInDrawableSelected;
    public Page namePage;
    private Theme.ResourcesProvider parentResourcesProvider;
    public Page profilePage;
    private boolean startAtProfile;
    private RLottieDrawable sunDrawable;
    private FilledTabsView tabsView;
    private SimpleTextView titleView;
    private ViewPagerFixed viewPager;

    public static boolean lambda$toggleTheme$11(View view, MotionEvent motionEvent) {
        return true;
    }

    public Page getCurrentPage() {
        return this.viewPager.getCurrentPosition() == 0 ? this.namePage : this.profilePage;
    }

    public class Page extends FrameLayout {
        private int actionBarHeight;
        private ButtonWithCounterView button;
        private FrameLayout buttonContainer;
        private CharSequence buttonLocked;
        int buttonRow;
        private CharSequence buttonUnlocked;
        int clearRow;
        int colorPickerRow;
        int iconRow;
        int info2Row;
        int infoRow;
        private RecyclerView.Adapter listAdapter;
        private RecyclerListView listView;
        private ThemePreviewMessagesCell messagesCellPreview;
        private PeerColorGrid peerColorPicker;
        int previewRow;
        private ProfilePreview profilePreview;
        int rowCount;
        private SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialog;
        private int selectedColor;
        private long selectedEmoji;
        private SetReplyIconCell setReplyIconCell;
        int shadowRow;
        private final int type;

        public Page(Context context, final int i) {
            super(context);
            this.selectedColor = -1;
            this.selectedEmoji = 0L;
            this.previewRow = -1;
            this.colorPickerRow = -1;
            this.infoRow = -1;
            this.iconRow = -1;
            this.info2Row = -1;
            this.buttonRow = -1;
            this.clearRow = -1;
            this.shadowRow = -1;
            this.type = i;
            if (i == 1) {
                if (PeerColorActivity.this.dialogId < 0) {
                    TLRPC$Chat chat = PeerColorActivity.this.getMessagesController().getChat(Long.valueOf(-PeerColorActivity.this.dialogId));
                    this.selectedColor = ChatObject.getProfileColorId(chat);
                    this.selectedEmoji = ChatObject.getProfileEmojiId(chat);
                } else {
                    TLRPC$User currentUser = PeerColorActivity.this.getUserConfig().getCurrentUser();
                    this.selectedColor = UserObject.getProfileColorId(currentUser);
                    this.selectedEmoji = UserObject.getProfileEmojiId(currentUser);
                }
            } else if (PeerColorActivity.this.dialogId < 0) {
                TLRPC$Chat chat2 = PeerColorActivity.this.getMessagesController().getChat(Long.valueOf(-PeerColorActivity.this.dialogId));
                this.selectedColor = ChatObject.getColorId(chat2);
                this.selectedEmoji = ChatObject.getEmojiId(chat2);
            } else {
                TLRPC$User currentUser2 = PeerColorActivity.this.getUserConfig().getCurrentUser();
                this.selectedColor = UserObject.getColorId(currentUser2);
                this.selectedEmoji = UserObject.getEmojiId(currentUser2);
            }
            RecyclerListView recyclerListView = new RecyclerListView(getContext(), PeerColorActivity.this.getResourceProvider(), PeerColorActivity.this) {
                @Override
                public void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, i3);
                    Page.this.updateButtonY();
                }

                @Override
                public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                    super.onLayout(z, i2, i3, i4, i5);
                    Page.this.updateButtonY();
                }
            };
            this.listView = recyclerListView;
            ((DefaultItemAnimator) recyclerListView.getItemAnimator()).setSupportsChangeAnimations(false);
            this.listView.setLayoutManager(new LinearLayoutManager(getContext()));
            RecyclerListView recyclerListView2 = this.listView;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(PeerColorActivity.this, i);
            this.listAdapter = anonymousClass2;
            recyclerListView2.setAdapter(anonymousClass2);
            this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i2) {
                    PeerColorActivity.Page.this.lambda$new$0(i, view, i2);
                }
            });
            addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.buttonContainer = frameLayout;
            frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.buttonContainer.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundGray));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_mini_lock2), 0, 1, 33);
            this.buttonUnlocked = LocaleController.getString(PeerColorActivity.this.isChannel ? R.string.ChannelColorApply : R.string.UserColorApplyIcon);
            this.buttonLocked = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append(this.buttonUnlocked);
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), PeerColorActivity.this.getResourceProvider());
            this.button = buttonWithCounterView;
            buttonWithCounterView.text.setHacks(true, true, true);
            this.button.setText((PeerColorActivity.this.isChannel || PeerColorActivity.this.getUserConfig().isPremium()) ? this.buttonUnlocked : this.buttonLocked, false);
            this.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PeerColorActivity.Page.this.lambda$new$1(view);
                }
            });
            this.buttonContainer.addView(this.button, LayoutHelper.createFrame(-1, 48.0f));
            addView(this.buttonContainer, LayoutHelper.createFrame(-1, -2, 80));
            this.listView.setOnScrollListener(new RecyclerView.OnScrollListener(PeerColorActivity.this) {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    Page.this.updateButtonY();
                }
            });
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setDurations(350L);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setSupportsChangeAnimations(false);
            this.listView.setItemAnimator(defaultItemAnimator);
            if (i == 1) {
                ProfilePreview profilePreview = new ProfilePreview(getContext());
                this.profilePreview = profilePreview;
                profilePreview.setColor(this.selectedColor, false);
                this.profilePreview.setEmoji(this.selectedEmoji, false);
                addView(this.profilePreview, LayoutHelper.createFrame(-1, -2, 55));
            }
            updateColors();
            updateRows();
            setWillNotDraw(false);
        }

        public class AnonymousClass2 extends RecyclerListView.SelectionAdapter {
            final int val$type;

            AnonymousClass2(PeerColorActivity peerColorActivity, int i) {
                this.val$type = i;
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return viewHolder.getItemViewType() == 3 || viewHolder.getItemViewType() == 6;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                TextCell textCell;
                if (i == 0) {
                    ThemePreviewMessagesCell themePreviewMessagesCell = Page.this.messagesCellPreview = new ThemePreviewMessagesCell(Page.this.getContext(), ((BaseFragment) PeerColorActivity.this).parentLayout, 3, PeerColorActivity.this.dialogId, ((BaseFragment) PeerColorActivity.this).resourceProvider);
                    if (Build.VERSION.SDK_INT >= 19) {
                        themePreviewMessagesCell.setImportantForAccessibility(4);
                    }
                    themePreviewMessagesCell.fragment = PeerColorActivity.this;
                    textCell = themePreviewMessagesCell;
                } else if (i == 1) {
                    Page page = Page.this;
                    Page page2 = Page.this;
                    final PeerColorGrid peerColorGrid = page.peerColorPicker = new PeerColorGrid(page2.getContext(), this.val$type, ((BaseFragment) PeerColorActivity.this).currentAccount);
                    peerColorGrid.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    peerColorGrid.setSelected(Page.this.selectedColor);
                    final int i2 = this.val$type;
                    peerColorGrid.setOnColorClick(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            PeerColorActivity.Page.AnonymousClass2.this.lambda$onCreateViewHolder$0(peerColorGrid, i2, (Integer) obj);
                        }
                    });
                    textCell = peerColorGrid;
                } else if (i == 3) {
                    Page page3 = Page.this;
                    Page page4 = Page.this;
                    SetReplyIconCell setReplyIconCell = page3.setReplyIconCell = new SetReplyIconCell(page4.getContext());
                    setReplyIconCell.update(false);
                    textCell = setReplyIconCell;
                } else if (i == 4) {
                    View view = new View(this, Page.this.getContext()) {
                        @Override
                        protected void onMeasure(int i3, int i4) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
                        }
                    };
                    view.setBackground(Theme.getThemedDrawableByKey(Page.this.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    textCell = view;
                } else if (i == 5) {
                    textCell = new View(this, Page.this.getContext()) {
                        @Override
                        protected void onMeasure(int i3, int i4) {
                            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                        }
                    };
                } else if (i != 6) {
                    textCell = new TextInfoPrivacyCell(Page.this.getContext(), PeerColorActivity.this.getResourceProvider());
                } else {
                    TextCell textCell2 = new TextCell(Page.this.getContext(), PeerColorActivity.this.getResourceProvider());
                    textCell2.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    textCell = textCell2;
                }
                return new RecyclerListView.Holder(textCell);
            }

            public void lambda$onCreateViewHolder$0(PeerColorGrid peerColorGrid, int i, Integer num) {
                Page.this.selectedColor = num.intValue();
                peerColorGrid.setSelected(num.intValue());
                Page.this.updateMessages();
                if (Page.this.setReplyIconCell != null) {
                    Page.this.setReplyIconCell.invalidate();
                }
                if (i == 1 && PeerColorActivity.this.colorBar != null) {
                    PeerColorActivity.this.colorBar.setColor(Page.this.selectedColor, true);
                }
                if (Page.this.profilePreview != null) {
                    Page.this.profilePreview.setColor(Page.this.selectedColor, true);
                }
                Page.this.checkResetColorButton();
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                int itemViewType = getItemViewType(i);
                if (itemViewType != 2) {
                    if (itemViewType != 6) {
                        return;
                    }
                    TextCell textCell = (TextCell) viewHolder.itemView;
                    textCell.updateColors();
                    textCell.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    Page page = Page.this;
                    if (i == page.clearRow) {
                        textCell.setText(LocaleController.getString(PeerColorActivity.this.isChannel ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                        return;
                    }
                    return;
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                Page page2 = Page.this;
                if (i == page2.infoRow) {
                    if (this.val$type == 0) {
                        textInfoPrivacyCell.setText(LocaleController.getString(PeerColorActivity.this.isChannel ? R.string.ChannelColorHint : R.string.UserColorHint));
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString(PeerColorActivity.this.isChannel ? R.string.ChannelProfileHint : R.string.UserProfileHint));
                    }
                    textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(Page.this.getContext(), Page.this.clearRow >= 0 ? R.drawable.greydivider : R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                } else if (i == page2.shadowRow) {
                    textInfoPrivacyCell.setText("");
                    textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(Page.this.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                }
            }

            @Override
            public int getItemCount() {
                return Page.this.rowCount;
            }

            @Override
            public int getItemViewType(int i) {
                Page page = Page.this;
                if (i == page.previewRow) {
                    return 0;
                }
                if (i != page.infoRow && i != page.info2Row && i != page.shadowRow) {
                    if (i == page.colorPickerRow) {
                        return 1;
                    }
                    if (i == page.iconRow) {
                        return 3;
                    }
                    if (i == page.buttonRow) {
                        return 5;
                    }
                    if (i == page.clearRow) {
                        return 6;
                    }
                    if (i == getItemCount() - 1) {
                        return 4;
                    }
                }
                return 2;
            }
        }

        public void lambda$new$0(int i, View view, int i2) {
            if (view instanceof SetReplyIconCell) {
                showSelectStatusDialog((SetReplyIconCell) view);
            } else if (i2 == this.clearRow) {
                this.selectedColor = -1;
                this.selectedEmoji = 0L;
                PeerColorGrid peerColorGrid = this.peerColorPicker;
                if (peerColorGrid != null) {
                    peerColorGrid.setSelected(-1);
                }
                updateMessages();
                if (i == 1) {
                    PeerColorActivity.this.namePage.updateMessages();
                }
                SetReplyIconCell setReplyIconCell = this.setReplyIconCell;
                if (setReplyIconCell != null) {
                    setReplyIconCell.update(true);
                }
                if (i == 1 && PeerColorActivity.this.colorBar != null) {
                    PeerColorActivity.this.colorBar.setColor(this.selectedColor, true);
                }
                ProfilePreview profilePreview = this.profilePreview;
                if (profilePreview != null) {
                    profilePreview.setColor(this.selectedColor, true);
                    this.profilePreview.setEmoji(this.selectedEmoji, true);
                }
                checkResetColorButton();
            }
        }

        public void lambda$new$1(View view) {
            PeerColorActivity.this.buttonClick();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (PeerColorActivity.this.getParentLayout() != null) {
                PeerColorActivity.this.getParentLayout().drawHeaderShadow(canvas, this.actionBarHeight);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            if (this.type == 0) {
                this.actionBarHeight = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) this.listView.getLayoutParams()).topMargin = this.actionBarHeight;
            } else {
                this.actionBarHeight = AndroidUtilities.dp(144.0f) + AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) this.listView.getLayoutParams()).topMargin = this.actionBarHeight;
                ((ViewGroup.MarginLayoutParams) this.profilePreview.getLayoutParams()).height = this.actionBarHeight;
            }
            super.onMeasure(i, i2);
        }

        public boolean hasUnsavedChanged() {
            if (PeerColorActivity.this.isChannel) {
                TLRPC$Chat chat = PeerColorActivity.this.getMessagesController().getChat(Long.valueOf(-PeerColorActivity.this.dialogId));
                if (chat == null) {
                    return false;
                }
                return this.type == 0 ? (this.selectedColor == ChatObject.getColorId(chat) && this.selectedEmoji == ChatObject.getEmojiId(chat)) ? false : true : (this.selectedColor == ChatObject.getProfileColorId(chat) && this.selectedEmoji == ChatObject.getProfileEmojiId(chat)) ? false : true;
            }
            TLRPC$User currentUser = PeerColorActivity.this.getUserConfig().getCurrentUser();
            if (currentUser == null) {
                return false;
            }
            return this.type == 0 ? (this.selectedColor == UserObject.getColorId(currentUser) && this.selectedEmoji == UserObject.getEmojiId(currentUser)) ? false : true : (this.selectedColor == UserObject.getProfileColorId(currentUser) && this.selectedEmoji == UserObject.getProfileEmojiId(currentUser)) ? false : true;
        }

        public void updateButtonY() {
            if (this.buttonContainer == null) {
                return;
            }
            int itemCount = this.listAdapter.getItemCount() - 1;
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
                View childAt = this.listView.getChildAt(i2);
                int childAdapterPosition = this.listView.getChildAdapterPosition(childAt);
                if (childAdapterPosition != -1 && childAdapterPosition <= itemCount) {
                    i = Math.max(i, childAt.getTop());
                    if (childAdapterPosition == itemCount) {
                        z = true;
                    }
                }
            }
            if (!z) {
                i = this.listView.getMeasuredHeight();
            }
            this.buttonContainer.setTranslationY(Math.max(0, i - (this.listView.getMeasuredHeight() - AndroidUtilities.dp(76.0f))));
        }

        public class SetReplyIconCell extends FrameLayout {
            private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable imageDrawable;
            private Text offText;
            private TextView textView;

            public SetReplyIconCell(Context context) {
                super(context);
                setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                TextView textView = new TextView(context);
                this.textView = textView;
                textView.setTextSize(1, 16.0f);
                this.textView.setTextColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                if (Page.this.type == 0) {
                    this.textView.setText(LocaleController.getString(PeerColorActivity.this.isChannel ? R.string.ChannelReplyIcon : R.string.UserReplyIcon));
                } else {
                    this.textView.setText(LocaleController.getString(PeerColorActivity.this.isChannel ? R.string.ChannelProfileIcon : R.string.UserProfileIcon));
                }
                addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
                this.imageDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, false, AndroidUtilities.dp(24.0f), 13);
            }

            public void updateColors() {
                this.textView.setTextColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            }

            public void update(boolean z) {
                if (Page.this.selectedEmoji != 0) {
                    this.imageDrawable.set(Page.this.selectedEmoji, z);
                    this.offText = null;
                    return;
                }
                this.imageDrawable.set((Drawable) null, z);
                if (this.offText == null) {
                    this.offText = new Text(LocaleController.getString(PeerColorActivity.this.isChannel ? R.string.ChannelReplyIconOff : R.string.UserReplyIconOff), 16.0f);
                }
            }

            public void updateImageBounds() {
                this.imageDrawable.setBounds((getWidth() - this.imageDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(21.0f), (getHeight() - this.imageDrawable.getIntrinsicHeight()) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + this.imageDrawable.getIntrinsicHeight()) / 2);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                updateImageBounds();
                this.imageDrawable.setColor(Integer.valueOf(getColor()));
                Text text = this.offText;
                if (text != null) {
                    text.draw(canvas, (getMeasuredWidth() - this.offText.getWidth()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText4), 1.0f);
                } else {
                    this.imageDrawable.draw(canvas);
                }
            }

            public int getColor() {
                MessagesController.PeerColor color;
                if (Page.this.selectedColor >= 0) {
                    if (Page.this.selectedColor >= 7) {
                        MessagesController.PeerColors peerColors = Page.this.type == 0 ? MessagesController.getInstance(((BaseFragment) PeerColorActivity.this).currentAccount).peerColors : MessagesController.getInstance(((BaseFragment) PeerColorActivity.this).currentAccount).profilePeerColors;
                        if (peerColors != null && (color = peerColors.getColor(Page.this.selectedColor)) != null) {
                            return color.getColor1();
                        }
                        return PeerColorActivity.this.getThemedColor(Theme.keys_avatar_nameInMessage[0]);
                    }
                    Page page = Page.this;
                    return PeerColorActivity.this.getThemedColor(Theme.keys_avatar_nameInMessage[page.selectedColor]);
                }
                PeerColorActivity peerColorActivity = PeerColorActivity.this;
                int i = Theme.key_actionBarDefault;
                if (AndroidUtilities.computePerceivedBrightness(peerColorActivity.getThemedColor(i)) > 0.8f) {
                    return Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, ((BaseFragment) PeerColorActivity.this).resourceProvider);
                }
                return AndroidUtilities.computePerceivedBrightness(PeerColorActivity.this.getThemedColor(i)) < 0.2f ? Theme.multAlpha(Theme.getColor(Theme.key_actionBarDefaultTitle, ((BaseFragment) PeerColorActivity.this).resourceProvider), 0.5f) : Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, ((BaseFragment) PeerColorActivity.this).resourceProvider), Theme.multAlpha(PeerColorActivity.adaptProfileEmojiColor(Theme.getColor(i, ((BaseFragment) PeerColorActivity.this).resourceProvider)), 0.7f));
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                this.imageDrawable.detach();
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                this.imageDrawable.attach();
            }
        }

        public void showSelectStatusDialog(final SetReplyIconCell setReplyIconCell) {
            int i;
            int i2;
            int dp;
            if (this.selectAnimatedEmojiDialog != null || setReplyIconCell == null) {
                return;
            }
            final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[1];
            int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
            int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = setReplyIconCell.imageDrawable;
            if (setReplyIconCell.imageDrawable != null) {
                setReplyIconCell.imageDrawable.play();
                setReplyIconCell.updateImageBounds();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(setReplyIconCell.imageDrawable.getBounds());
                if (this.type == 0) {
                    dp = ((-rect.centerY()) + AndroidUtilities.dp(12.0f)) - min;
                } else {
                    dp = (-(setReplyIconCell.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                }
                i = rect.centerX() - (AndroidUtilities.displaySize.x - min2);
                i2 = dp;
            } else {
                i = 0;
                i2 = 0;
            }
            int i3 = i2;
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = new SelectAnimatedEmojiDialog(PeerColorActivity.this, getContext(), true, Integer.valueOf(i), this.type == 0 ? 5 : 7, true, PeerColorActivity.this.getResourceProvider(), this.type == 0 ? 24 : 16, setReplyIconCell.getColor()) {
                @Override
                protected float getScrimDrawableTranslationY() {
                    return 0.0f;
                }

                @Override
                protected void onEmojiSelected(View view, Long l, TLRPC$Document tLRPC$Document, Integer num) {
                    Page.this.selectedEmoji = l == null ? 0L : l.longValue();
                    SetReplyIconCell setReplyIconCell2 = setReplyIconCell;
                    if (setReplyIconCell2 != null) {
                        setReplyIconCell2.update(true);
                    }
                    if (Page.this.profilePreview != null) {
                        Page.this.profilePreview.setEmoji(Page.this.selectedEmoji, true);
                    }
                    Page.this.updateMessages();
                    if (selectAnimatedEmojiDialogWindowArr[0] != null) {
                        Page.this.selectAnimatedEmojiDialog = null;
                        selectAnimatedEmojiDialogWindowArr[0].dismiss();
                    }
                }
            };
            selectAnimatedEmojiDialog.useAccentForPlus = true;
            long j = this.selectedEmoji;
            selectAnimatedEmojiDialog.setSelected(j == 0 ? null : Long.valueOf(j));
            selectAnimatedEmojiDialog.setSaveState(3);
            selectAnimatedEmojiDialog.setScrimDrawable(swapAnimatedEmojiDrawable, setReplyIconCell);
            SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(selectAnimatedEmojiDialog, -2, -2) {
                @Override
                public void dismiss() {
                    super.dismiss();
                    Page.this.selectAnimatedEmojiDialog = null;
                }
            };
            this.selectAnimatedEmojiDialog = selectAnimatedEmojiDialogWindow;
            selectAnimatedEmojiDialogWindowArr[0] = selectAnimatedEmojiDialogWindow;
            selectAnimatedEmojiDialogWindowArr[0].showAsDropDown(setReplyIconCell, 0, i3, 53);
            selectAnimatedEmojiDialogWindowArr[0].dimBehind();
        }

        public void checkResetColorButton() {
            int i;
            if (this.type != 1) {
                return;
            }
            int i2 = this.clearRow;
            updateRows();
            if (i2 >= 0 && this.clearRow < 0) {
                this.listAdapter.notifyItemRangeRemoved(i2, 2);
            } else if (i2 >= 0 || (i = this.clearRow) < 0) {
            } else {
                this.listAdapter.notifyItemRangeInserted(i, 2);
            }
        }

        private void updateRows() {
            this.rowCount = 0;
            int i = this.type;
            if (i == 0) {
                this.rowCount = 0 + 1;
                this.previewRow = 0;
            }
            int i2 = this.rowCount;
            int i3 = i2 + 1;
            this.rowCount = i3;
            this.colorPickerRow = i2;
            int i4 = i3 + 1;
            this.rowCount = i4;
            this.iconRow = i3;
            int i5 = i4 + 1;
            this.rowCount = i5;
            this.infoRow = i4;
            if (i == 1 && this.selectedColor >= 0) {
                int i6 = i5 + 1;
                this.rowCount = i6;
                this.clearRow = i5;
                this.rowCount = i6 + 1;
                this.shadowRow = i6;
            } else {
                this.clearRow = -1;
                this.shadowRow = -1;
            }
            int i7 = this.rowCount;
            this.rowCount = i7 + 1;
            this.buttonRow = i7;
        }

        public void updateMessages() {
            MessageObject messageObject;
            ThemePreviewMessagesCell themePreviewMessagesCell = this.messagesCellPreview;
            if (themePreviewMessagesCell != null) {
                ChatMessageCell[] cells = themePreviewMessagesCell.getCells();
                for (int i = 0; i < cells.length; i++) {
                    if (cells[i] != null && (messageObject = cells[i].getMessageObject()) != null) {
                        PeerColorGrid peerColorGrid = this.peerColorPicker;
                        if (peerColorGrid != null) {
                            messageObject.overrideLinkColor = peerColorGrid.getColorId();
                        }
                        PeerColorActivity peerColorActivity = PeerColorActivity.this;
                        Page page = peerColorActivity.profilePage;
                        if (page != null && page.selectedColor >= 0 && peerColorActivity.getMessagesController().profilePeerColors != null) {
                            messageObject.overrideProfilePeerColor = PeerColorActivity.this.getMessagesController().profilePeerColors.getColor(PeerColorActivity.this.profilePage.selectedColor);
                        } else {
                            messageObject.overrideProfilePeerColor = null;
                        }
                        messageObject.overrideLinkEmoji = this.selectedEmoji;
                        cells[i].setAvatar(messageObject);
                        cells[i].invalidate();
                    }
                }
            }
        }

        public void updateColors() {
            RecyclerListView recyclerListView = this.listView;
            PeerColorActivity peerColorActivity = PeerColorActivity.this;
            int i = Theme.key_windowBackgroundGray;
            recyclerListView.setBackgroundColor(peerColorActivity.getThemedColor(i));
            if (this.type == 1 && PeerColorActivity.this.colorBar != null) {
                PeerColorActivity.this.colorBar.setColor(this.selectedColor, true);
            }
            ButtonWithCounterView buttonWithCounterView = this.button;
            if (buttonWithCounterView != null) {
                buttonWithCounterView.updateColors();
            }
            ThemePreviewMessagesCell themePreviewMessagesCell = this.messagesCellPreview;
            if (themePreviewMessagesCell != null) {
                themePreviewMessagesCell.invalidate();
            }
            ProfilePreview profilePreview = this.profilePreview;
            if (profilePreview != null) {
                profilePreview.setColor(this.selectedColor, false);
            }
            this.buttonContainer.setBackgroundColor(PeerColorActivity.this.getThemedColor(i));
            AndroidUtilities.forEachViews((RecyclerView) this.listView, (Consumer<View>) new Consumer() {
                @Override
                public final void accept(Object obj) {
                    PeerColorActivity.Page.this.lambda$updateColors$2((View) obj);
                }
            });
        }

        public void lambda$updateColors$2(View view) {
            if (view instanceof PeerColorGrid) {
                view.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                ((PeerColorGrid) view).updateColors();
            } else if (view instanceof TextCell) {
                view.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                ((TextCell) view).updateColors();
            } else if (view instanceof SetReplyIconCell) {
                view.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                ((SetReplyIconCell) view).updateColors();
            }
        }

        public void premiumChanged() {
            if (this.button == null || PeerColorActivity.this.isChannel) {
                return;
            }
            this.button.setText(!PeerColorActivity.this.getUserConfig().isPremium() ? this.buttonLocked : this.buttonUnlocked, true);
        }
    }

    public void updateThemeColors() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PeerColorActivity.updateThemeColors():void");
    }

    public PeerColorActivity(long j) {
        boolean isCurrentThemeDark = Theme.isCurrentThemeDark();
        this.isDark = isCurrentThemeDark;
        this.forceDark = isCurrentThemeDark;
        this.dialogId = j;
        this.isChannel = j != 0;
        this.resourceProvider = new Theme.ResourcesProvider() {
            @Override
            public void applyServiceShaderMatrix(int i, int i2, float f, float f2) {
                Theme.applyServiceShaderMatrix(i, i2, f, f2);
            }

            @Override
            public ColorFilter getAnimatedEmojiColorFilter() {
                ColorFilter colorFilter;
                colorFilter = Theme.chat_animatedEmojiTextColorFilter;
                return colorFilter;
            }

            @Override
            public int getColorOrDefault(int i) {
                int color;
                color = getColor(i);
                return color;
            }

            @Override
            public int getCurrentColor(int i) {
                int color;
                color = getColor(i);
                return color;
            }

            @Override
            public boolean hasGradientService() {
                return Theme.ResourcesProvider.CC.$default$hasGradientService(this);
            }

            @Override
            public void setAnimatedColor(int i, int i2) {
                Theme.ResourcesProvider.CC.$default$setAnimatedColor(this, i, i2);
            }

            @Override
            public int getColor(int i) {
                int indexOfKey = PeerColorActivity.this.currentColors.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return PeerColorActivity.this.currentColors.valueAt(indexOfKey);
                }
                if (PeerColorActivity.this.parentResourcesProvider != null) {
                    return PeerColorActivity.this.parentResourcesProvider.getColor(i);
                }
                return Theme.getColor(i);
            }

            @Override
            public Drawable getDrawable(String str) {
                if (str.equals("drawableMsgIn")) {
                    return PeerColorActivity.this.msgInDrawable;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return PeerColorActivity.this.msgInDrawableSelected;
                }
                if (PeerColorActivity.this.parentResourcesProvider != null) {
                    return PeerColorActivity.this.parentResourcesProvider.getDrawable(str);
                }
                return Theme.getThemeDrawable(str);
            }

            @Override
            public Paint getPaint(String str) {
                Paint themePaint;
                themePaint = Theme.getThemePaint(str);
                return themePaint;
            }

            @Override
            public boolean isDark() {
                return PeerColorActivity.this.isDark;
            }
        };
        this.msgInDrawable = new Theme.MessageDrawable(0, false, false, this.resourceProvider);
        this.msgInDrawableSelected = new Theme.MessageDrawable(0, false, true, this.resourceProvider);
    }

    public PeerColorActivity startOnProfile() {
        this.startAtProfile = true;
        return this;
    }

    public PeerColorActivity setOnApplied(BaseFragment baseFragment) {
        this.bulletinFragment = baseFragment;
        return this;
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        Bulletin.addDelegate(this, new Bulletin.Delegate(this) {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean clipWithGradient(int i) {
                return true;
            }

            @Override
            public int getTopOffset(int i) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
            }

            @Override
            public void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }

            @Override
            public int getBottomOffset(int i) {
                return AndroidUtilities.dp(62.0f);
            }
        });
        getMediaDataController().loadReplyIcons();
        if (MessagesController.getInstance(this.currentAccount).peerColors == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            MessagesController.getInstance(this.currentAccount).loadAppConfig(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public View createView(Context context) {
        this.namePage = new Page(context, 0);
        this.profilePage = new Page(context, 1);
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                if (PeerColorActivity.this.actionBarContainer != null) {
                    ((ViewGroup.MarginLayoutParams) PeerColorActivity.this.actionBarContainer.getLayoutParams()).height = ActionBar.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) PeerColorActivity.this.actionBarContainer.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i, i2);
            }
        };
        frameLayout.setFitsSystemWindows(true);
        ColoredActionBar coloredActionBar = new ColoredActionBar(context);
        this.colorBar = coloredActionBar;
        Page page = this.profilePage;
        if (page != null) {
            coloredActionBar.setColor(page.selectedColor, false);
        }
        frameLayout.addView(this.colorBar, LayoutHelper.createFrame(-1, -2, 55));
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) {
            @Override
            protected void onTabAnimationUpdate(boolean z) {
                PeerColorActivity.this.tabsView.setSelected(PeerColorActivity.this.viewPager.getPositionAnimated());
                PeerColorActivity.this.colorBar.setProgressToGradient(PeerColorActivity.this.viewPager.getPositionAnimated());
            }
        };
        this.viewPager = viewPagerFixed;
        viewPagerFixed.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public void bindView(View view, int i, int i2) {
            }

            @Override
            public int getItemViewType(int i) {
                return i;
            }

            @Override
            public int getItemCount() {
                return PeerColorActivity.this.isChannel ? 1 : 2;
            }

            @Override
            public View createView(int i) {
                if (i == 0) {
                    return PeerColorActivity.this.namePage;
                }
                if (i == 1) {
                    return PeerColorActivity.this.profilePage;
                }
                return null;
            }
        });
        frameLayout.addView(this.viewPager, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.actionBarContainer = frameLayout2;
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, -2, 55));
        if (!this.isChannel) {
            FilledTabsView filledTabsView = new FilledTabsView(context);
            this.tabsView = filledTabsView;
            CharSequence[] charSequenceArr = new CharSequence[2];
            charSequenceArr[0] = LocaleController.getString(this.isChannel ? R.string.ChannelColorTabName : R.string.UserColorTabName);
            charSequenceArr[1] = LocaleController.getString(this.isChannel ? R.string.ChannelColorTabProfile : R.string.UserColorTabProfile);
            filledTabsView.setTabs(charSequenceArr);
            this.tabsView.onTabSelected(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    PeerColorActivity.this.lambda$createView$0((Integer) obj);
                }
            });
            this.actionBarContainer.addView(this.tabsView, LayoutHelper.createFrame(-1, 40, 17));
        } else {
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.titleView = simpleTextView;
            simpleTextView.setText(LocaleController.getString(R.string.ChannelColorTitle));
            this.titleView.setEllipsizeByGradient(true);
            this.titleView.setTextSize(20);
            this.titleView.setTextColor(getThemedColor(Theme.key_actionBarDefaultTitle));
            this.titleView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.actionBarContainer.addView(this.titleView, LayoutHelper.createFrame(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        if (this.startAtProfile && !this.isChannel) {
            this.viewPager.setPosition(1);
            FilledTabsView filledTabsView2 = this.tabsView;
            if (filledTabsView2 != null) {
                filledTabsView2.setSelected(1.0f);
            }
            ColoredActionBar coloredActionBar2 = this.colorBar;
            if (coloredActionBar2 != null) {
                coloredActionBar2.setProgressToGradient(1.0f);
            }
        }
        ImageView imageView = new ImageView(context);
        this.backButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.backButton;
        int i = Theme.key_actionBarWhiteSelector;
        imageView2.setBackground(Theme.createSelectorDrawable(getThemedColor(i), 1));
        this.backButton.setImageResource(R.drawable.ic_ab_back);
        this.backButton.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PeerColorActivity.this.lambda$createView$1(view);
            }
        });
        this.actionBarContainer.addView(this.backButton, LayoutHelper.createFrame(54, 54, 19));
        int i2 = R.raw.sun;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, "" + i2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.sunDrawable = rLottieDrawable;
        rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
        if (!this.isDark) {
            this.sunDrawable.setCustomEndFrame(0);
            this.sunDrawable.setCurrentFrame(0);
        } else {
            this.sunDrawable.setCurrentFrame(35);
            this.sunDrawable.setCustomEndFrame(36);
        }
        this.sunDrawable.beginApplyLayerColors();
        int color = Theme.getColor(Theme.key_chats_menuName);
        this.sunDrawable.setLayerColor("Sunny.**", color);
        this.sunDrawable.setLayerColor("Path 6.**", color);
        this.sunDrawable.setLayerColor("Path.**", color);
        this.sunDrawable.setLayerColor("Path 5.**", color);
        this.sunDrawable.commitApplyLayerColors();
        ImageView imageView3 = new ImageView(context);
        this.dayNightItem = imageView3;
        imageView3.setScaleType(ImageView.ScaleType.CENTER);
        this.dayNightItem.setBackground(Theme.createSelectorDrawable(getThemedColor(i), 1));
        this.dayNightItem.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.dayNightItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PeerColorActivity.this.lambda$createView$2(view);
            }
        });
        this.actionBarContainer.addView(this.dayNightItem, LayoutHelper.createFrame(54, 54, 21));
        this.dayNightItem.setImageDrawable(this.sunDrawable);
        this.colorBar.updateColors();
        this.contentView = frameLayout;
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public void lambda$createView$0(Integer num) {
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed != null) {
            viewPagerFixed.scrollToPosition(num.intValue());
        }
    }

    public void lambda$createView$1(View view) {
        if (onBackPressed()) {
            finishFragment();
        }
    }

    public void lambda$createView$2(View view) {
        toggleTheme();
    }

    public boolean hasUnsavedChanged() {
        return this.namePage.hasUnsavedChanged() || this.profilePage.hasUnsavedChanged();
    }

    private void showBoostLimit(final boolean z) {
        getMessagesController().getBoostsController().getBoostsStats(this.dialogId, new Consumer() {
            @Override
            public final void accept(Object obj) {
                PeerColorActivity.this.lambda$showBoostLimit$6(z, (TL_stories$TL_premium_boostsStatus) obj);
            }
        });
    }

    public void lambda$showBoostLimit$6(boolean z, final TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus) {
        if (z || tL_stories$TL_premium_boostsStatus.level < getMessagesController().channelColorLevelMin) {
            getMessagesController().getBoostsController().userCanBoostChannel(this.dialogId, tL_stories$TL_premium_boostsStatus, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    PeerColorActivity.this.lambda$showBoostLimit$5(tL_stories$TL_premium_boostsStatus, (ChannelBoostsController.CanApplyBoost) obj);
                }
            });
        } else {
            apply();
        }
    }

    public void lambda$showBoostLimit$5(TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (getContext() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(this, getContext(), 20, this.currentAccount, getResourceProvider());
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(tL_stories$TL_premium_boostsStatus, true);
        limitReachedBottomSheet.setDialogId(this.dialogId);
        limitReachedBottomSheet.showStatisticButtonInLink(new Runnable() {
            @Override
            public final void run() {
                PeerColorActivity.this.lambda$showBoostLimit$3();
            }
        });
        showDialog(limitReachedBottomSheet);
        this.loading = false;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PeerColorActivity.this.lambda$showBoostLimit$4();
            }
        }, 300L);
    }

    public void lambda$showBoostLimit$3() {
        TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -this.dialogId);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", true);
        TLRPC$ChatFull chatFull = getMessagesController().getChatFull(-this.dialogId);
        if (chatFull == null || !chatFull.can_view_stats) {
            bundle.putBoolean("only_boosts", true);
        }
        presentFragment(new StatisticActivity(bundle));
    }

    public void lambda$showBoostLimit$4() {
        getCurrentPage().button.setLoading(false);
    }

    @Override
    public boolean onBackPressed() {
        if (!this.isChannel && hasUnsavedChanged() && getUserConfig().isPremium()) {
            showUnsavedAlert();
            return false;
        }
        return super.onBackPressed();
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.isChannel && hasUnsavedChanged() && getUserConfig().isPremium()) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    private void showUnsavedAlert() {
        if (getVisibleDialog() != null) {
            return;
        }
        AlertDialog create = new AlertDialog.Builder(getContext(), getResourceProvider()).setTitle(LocaleController.getString(this.isChannel ? R.string.ChannelColorUnsaved : R.string.UserColorUnsaved)).setMessage(LocaleController.getString(this.isChannel ? R.string.ChannelColorUnsavedMessage : R.string.UserColorUnsavedMessage)).setNegativeButton(LocaleController.getString(R.string.Dismiss), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                PeerColorActivity.this.lambda$showUnsavedAlert$7(dialogInterface, i);
            }
        }).setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                PeerColorActivity.this.lambda$showUnsavedAlert$8(dialogInterface, i);
            }
        }).create();
        showDialog(create);
        ((TextView) create.getButton(-2)).setTextColor(getThemedColor(Theme.key_text_RedBold));
    }

    public void lambda$showUnsavedAlert$7(DialogInterface dialogInterface, int i) {
        finishFragment();
    }

    public void lambda$showUnsavedAlert$8(DialogInterface dialogInterface, int i) {
        buttonClick();
    }

    public void buttonClick() {
        if (this.loading) {
            return;
        }
        if (this.isChannel) {
            TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
            Page page = this.namePage;
            if (page != null && chat != null && page.selectedColor == ChatObject.getColorId(chat) && this.namePage.selectedEmoji == ChatObject.getEmojiId(chat)) {
                finishFragment();
                return;
            }
            this.loading = true;
            getCurrentPage().button.setLoading(true);
            showBoostLimit(false);
        } else if (!getUserConfig().isPremium()) {
            showDialog(new PremiumFeatureBottomSheet(this, 23, true));
        } else {
            apply();
            finishFragment();
            showBulletin();
        }
    }

    private void apply() {
        if (this.applying) {
            return;
        }
        if (this.isChannel || getUserConfig().isPremium()) {
            if (this.isChannel) {
                TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
                if (chat == null) {
                    return;
                }
                if (this.namePage.selectedColor == ChatObject.getColorId(chat) && this.namePage.selectedEmoji == ChatObject.getEmojiId(chat)) {
                    ButtonWithCounterView buttonWithCounterView = getCurrentPage().button;
                    this.loading = false;
                    buttonWithCounterView.setLoading(false);
                    finishFragment();
                    return;
                }
                TLRPC$TL_channels_updateColor tLRPC$TL_channels_updateColor = new TLRPC$TL_channels_updateColor();
                TLRPC$InputChannel inputChannel = getMessagesController().getInputChannel(-this.dialogId);
                tLRPC$TL_channels_updateColor.channel = inputChannel;
                if (inputChannel == null) {
                    return;
                }
                chat.flags2 |= 64;
                if (chat.color == null) {
                    chat.color = new TLRPC$TL_peerColor();
                }
                chat.flags2 |= 128;
                TLRPC$TL_peerColor tLRPC$TL_peerColor = chat.color;
                int i = this.namePage.selectedColor;
                tLRPC$TL_peerColor.color = i;
                tLRPC$TL_channels_updateColor.color = i;
                if (this.namePage.selectedEmoji != 0) {
                    chat.color.background_emoji_id = this.namePage.selectedEmoji;
                    tLRPC$TL_channels_updateColor.flags |= 1;
                    tLRPC$TL_channels_updateColor.background_emoji_id = this.namePage.selectedEmoji;
                } else {
                    chat.color.background_emoji_id = 0L;
                }
                ButtonWithCounterView buttonWithCounterView2 = getCurrentPage().button;
                this.loading = true;
                buttonWithCounterView2.setLoading(true);
                getMessagesController().putChat(chat, false);
                getUserConfig().saveConfig(true);
                getConnectionsManager().sendRequest(tLRPC$TL_channels_updateColor, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        PeerColorActivity.this.lambda$apply$10(tLObject, tLRPC$TL_error);
                    }
                });
            } else {
                TLRPC$User currentUser = getUserConfig().getCurrentUser();
                if (currentUser.color == null) {
                    TLRPC$TL_peerColor tLRPC$TL_peerColor2 = new TLRPC$TL_peerColor();
                    currentUser.color = tLRPC$TL_peerColor2;
                    tLRPC$TL_peerColor2.color = (int) (currentUser.id % 7);
                }
                if (this.namePage.selectedColor != UserObject.getColorId(currentUser) || this.namePage.selectedEmoji != UserObject.getEmojiId(currentUser)) {
                    this.applyingName = true;
                    TLRPC$TL_account_updateColor tLRPC$TL_account_updateColor = new TLRPC$TL_account_updateColor();
                    currentUser.flags2 |= LiteMode.FLAG_CHAT_BLUR;
                    TLRPC$TL_peerColor tLRPC$TL_peerColor3 = currentUser.color;
                    tLRPC$TL_peerColor3.flags |= 1;
                    tLRPC$TL_account_updateColor.flags |= 4;
                    int i2 = this.namePage.selectedColor;
                    tLRPC$TL_peerColor3.color = i2;
                    tLRPC$TL_account_updateColor.color = i2;
                    if (this.namePage.selectedEmoji != 0) {
                        tLRPC$TL_account_updateColor.flags |= 1;
                        TLRPC$TL_peerColor tLRPC$TL_peerColor4 = currentUser.color;
                        tLRPC$TL_peerColor4.flags |= 2;
                        long j = this.namePage.selectedEmoji;
                        tLRPC$TL_peerColor4.background_emoji_id = j;
                        tLRPC$TL_account_updateColor.background_emoji_id = j;
                    } else {
                        TLRPC$TL_peerColor tLRPC$TL_peerColor5 = currentUser.color;
                        tLRPC$TL_peerColor5.flags &= -3;
                        tLRPC$TL_peerColor5.background_emoji_id = 0L;
                    }
                    getConnectionsManager().sendRequest(tLRPC$TL_account_updateColor, null);
                }
                if (this.profilePage.selectedColor != UserObject.getProfileColorId(currentUser) || this.profilePage.selectedEmoji != UserObject.getProfileEmojiId(currentUser)) {
                    this.applyingProfile = true;
                    if (currentUser.profile_color == null) {
                        currentUser.profile_color = new TLRPC$TL_peerColor();
                    }
                    TLRPC$TL_account_updateColor tLRPC$TL_account_updateColor2 = new TLRPC$TL_account_updateColor();
                    tLRPC$TL_account_updateColor2.for_profile = true;
                    currentUser.flags2 |= LiteMode.FLAG_CALLS_ANIMATIONS;
                    if (this.profilePage.selectedColor < 0) {
                        currentUser.profile_color.flags &= -2;
                    } else {
                        TLRPC$TL_peerColor tLRPC$TL_peerColor6 = currentUser.profile_color;
                        tLRPC$TL_peerColor6.flags |= 1;
                        tLRPC$TL_account_updateColor2.flags |= 4;
                        int i3 = this.profilePage.selectedColor;
                        tLRPC$TL_peerColor6.color = i3;
                        tLRPC$TL_account_updateColor2.color = i3;
                    }
                    if (this.profilePage.selectedEmoji != 0) {
                        tLRPC$TL_account_updateColor2.flags |= 1;
                        TLRPC$TL_peerColor tLRPC$TL_peerColor7 = currentUser.profile_color;
                        tLRPC$TL_peerColor7.flags |= 2;
                        long j2 = this.profilePage.selectedEmoji;
                        tLRPC$TL_peerColor7.background_emoji_id = j2;
                        tLRPC$TL_account_updateColor2.background_emoji_id = j2;
                    } else {
                        TLRPC$TL_peerColor tLRPC$TL_peerColor8 = currentUser.profile_color;
                        tLRPC$TL_peerColor8.flags &= -3;
                        tLRPC$TL_peerColor8.background_emoji_id = 0L;
                    }
                    getConnectionsManager().sendRequest(tLRPC$TL_account_updateColor2, null);
                }
                getMessagesController().putUser(currentUser, false);
                getUserConfig().saveConfig(true);
            }
            this.applying = true;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS));
        }
    }

    public void lambda$apply$10(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PeerColorActivity.this.lambda$apply$9(tLRPC$TL_error);
            }
        });
    }

    public void lambda$apply$9(TLRPC$TL_error tLRPC$TL_error) {
        this.applying = false;
        if (tLRPC$TL_error != null && "BOOSTS_REQUIRED".equals(tLRPC$TL_error.text)) {
            showBoostLimit(true);
            return;
        }
        finishFragment();
        showBulletin();
    }

    private void showBulletin() {
        if (this.bulletinFragment != null) {
            if (this.applyingName && (!this.applyingProfile || getCurrentPage() == this.namePage)) {
                BulletinFactory.of(this.bulletinFragment).createSimpleBulletin(PeerColorDrawable.from(this.currentAccount, this.namePage.selectedColor), LocaleController.getString(this.isChannel ? R.string.ChannelColorApplied : R.string.UserColorApplied)).show();
            } else if (this.applyingProfile && (!this.applyingName || getCurrentPage() == this.profilePage)) {
                if (this.profilePage.selectedColor < 0) {
                    if (this.profilePage.selectedEmoji != 0) {
                        BulletinFactory.of(this.bulletinFragment).createStaticEmojiBulletin(AnimatedEmojiDrawable.findDocument(this.currentAccount, this.profilePage.selectedEmoji), LocaleController.getString(this.isChannel ? R.string.ChannelProfileColorEmojiApplied : R.string.UserProfileColorEmojiApplied)).show();
                    } else {
                        BulletinFactory.of(this.bulletinFragment).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(this.isChannel ? R.string.ChannelProfileColorResetApplied : R.string.UserProfileColorResetApplied)).show();
                    }
                } else {
                    BulletinFactory.of(this.bulletinFragment).createSimpleBulletin(PeerColorDrawable.fromProfile(this.currentAccount, this.profilePage.selectedColor), LocaleController.getString(this.isChannel ? R.string.ChannelProfileColorApplied : R.string.UserProfileColorApplied)).show();
                }
            }
            this.bulletinFragment = null;
        }
    }

    @Override
    public void onFragmentClosed() {
        super.onFragmentClosed();
        Bulletin.removeDelegate(this);
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                PeerColorActivity.this.updateColors();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        }, Theme.key_windowBackgroundWhite, Theme.key_windowBackgroundWhiteBlackText, Theme.key_windowBackgroundWhiteGrayText2, Theme.key_listSelector, Theme.key_windowBackgroundGray, Theme.key_windowBackgroundWhiteGrayText4, Theme.key_text_RedRegular, Theme.key_windowBackgroundChecked, Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void updateColors() {
        this.contentView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        SimpleTextView simpleTextView = this.titleView;
        if (simpleTextView != null) {
            simpleTextView.setTextColor(getThemedColor(Theme.key_actionBarDefaultTitle));
        }
        this.namePage.updateColors();
        this.profilePage.updateColors();
        ColoredActionBar coloredActionBar = this.colorBar;
        if (coloredActionBar != null) {
            coloredActionBar.updateColors();
        }
        setNavigationBarColor(getNavigationBarColor());
    }

    @Override
    @SuppressLint({"NotifyDataSetChanged"})
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 == this.currentAccount && i == NotificationCenter.currentUserPremiumStatusChanged) {
            this.namePage.premiumChanged();
            this.profilePage.premiumChanged();
        }
    }

    public static class ChangeNameColorCell extends View {
        private final Text buttonText;
        private PeerColorDrawable color1Drawable;
        private PeerColorDrawable color2Drawable;
        private final int currentAccount;
        private final Drawable drawable;
        private final boolean isChannel;
        private boolean needDivider;
        private final Theme.ResourcesProvider resourcesProvider;
        private Text userText;
        private final Paint userTextBackgroundPaint;
        private int userTextColorKey;

        public ChangeNameColorCell(int i, boolean z, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.userTextBackgroundPaint = new Paint(1);
            this.userTextColorKey = -1;
            this.currentAccount = i;
            this.isChannel = z;
            this.resourcesProvider = resourcesProvider;
            Drawable mutate = context.getResources().getDrawable(R.drawable.msg_palette).mutate();
            this.drawable = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4, resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.buttonText = new Text(LocaleController.getString(z ? R.string.ChangeChannelNameColor : R.string.ChangeUserNameColor), 16.0f);
            updateColors();
        }

        public void updateColors() {
            int i;
            this.drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(this.isChannel ? Theme.key_windowBackgroundWhiteGrayIcon : Theme.key_windowBackgroundWhiteBlueText4, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.buttonText.setColor(Theme.getColor(this.isChannel ? Theme.key_windowBackgroundWhiteBlackText : Theme.key_windowBackgroundWhiteBlueText4, this.resourcesProvider));
            if (this.userText == null || this.userTextBackgroundPaint == null || (i = this.userTextColorKey) == -1) {
                return;
            }
            int color = Theme.getColor(i, this.resourcesProvider);
            this.userText.setColor(color);
            this.userTextBackgroundPaint.setColor(Theme.multAlpha(color, 0.1f));
        }

        public void set(TLRPC$Chat tLRPC$Chat, boolean z) {
            int color;
            if (tLRPC$Chat == null) {
                return;
            }
            this.needDivider = z;
            this.userText = new Text(Emoji.replaceEmoji(tLRPC$Chat.title, Theme.chat_msgTextPaint.getFontMetricsInt(), false), 13.0f, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            int colorId = ChatObject.getColorId(tLRPC$Chat);
            if (colorId < 7) {
                int i = Theme.keys_avatar_nameInMessage[colorId];
                this.userTextColorKey = i;
                color = Theme.getColor(i, this.resourcesProvider);
            } else {
                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color2 = peerColors == null ? null : peerColors.getColor(colorId);
                if (color2 != null) {
                    this.userTextColorKey = -1;
                    color = color2.getColor1();
                } else {
                    int i2 = Theme.keys_avatar_nameInMessage[0];
                    this.userTextColorKey = i2;
                    color = Theme.getColor(i2, this.resourcesProvider);
                }
            }
            this.userText.setColor(color);
            this.userTextBackgroundPaint.setColor(Theme.multAlpha(color, 0.1f));
            this.color2Drawable = null;
            this.color1Drawable = null;
        }

        public void set(TLRPC$User tLRPC$User) {
            int color;
            if (tLRPC$User == null) {
                return;
            }
            String str = tLRPC$User.first_name;
            String trim = str == null ? "" : str.trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            this.userText = new Text(Emoji.replaceEmoji(trim, Theme.chat_msgTextPaint.getFontMetricsInt(), false), 13.0f, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            int colorId = UserObject.getColorId(tLRPC$User);
            if (colorId < 7) {
                int i = Theme.keys_avatar_nameInMessage[colorId];
                this.userTextColorKey = i;
                color = Theme.getColor(i, this.resourcesProvider);
            } else {
                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color2 = peerColors == null ? null : peerColors.getColor(colorId);
                if (color2 != null) {
                    this.userTextColorKey = -1;
                    color = color2.getColor1();
                } else {
                    int i2 = Theme.keys_avatar_nameInMessage[0];
                    this.userTextColorKey = i2;
                    color = Theme.getColor(i2, this.resourcesProvider);
                }
            }
            this.userText.setColor(color);
            this.userTextBackgroundPaint.setColor(Theme.multAlpha(color, 0.1f));
            this.color1Drawable = PeerColorDrawable.from(this.currentAccount, colorId).setRadius(AndroidUtilities.dp(11.0f));
            this.color2Drawable = UserObject.getProfileColorId(tLRPC$User) >= 0 ? PeerColorDrawable.fromProfile(this.currentAccount, UserObject.getProfileColorId(tLRPC$User)).setRadius(AndroidUtilities.dp(11.0f)) : null;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.needDivider ? 1 : 0), 1073741824));
        }

        private int rtl(int i) {
            return LocaleController.isRTL ? getMeasuredWidth() - i : i;
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            this.drawable.setBounds(rtl(AndroidUtilities.dp(64.0f) / 2) - (this.drawable.getIntrinsicWidth() / 2), (getMeasuredHeight() / 2) - (this.drawable.getIntrinsicHeight() / 2), rtl(AndroidUtilities.dp(64.0f) / 2) + (this.drawable.getIntrinsicWidth() / 2), (getMeasuredHeight() / 2) + (this.drawable.getIntrinsicHeight() / 2));
            this.drawable.draw(canvas);
            this.buttonText.ellipsize(getMeasuredWidth() - AndroidUtilities.dp(171.0f)).draw(canvas, LocaleController.isRTL ? (getMeasuredWidth() - this.buttonText.getWidth()) - AndroidUtilities.dp(71.0f) : AndroidUtilities.dp(71.0f), getMeasuredHeight() / 2.0f);
            if (this.color1Drawable != null && this.color2Drawable != null) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(16.0f);
                this.color2Drawable.setBounds(measuredWidth - AndroidUtilities.dp(11.0f), (getMeasuredHeight() - AndroidUtilities.dp(11.0f)) / 2, measuredWidth, (getMeasuredHeight() + AndroidUtilities.dp(11.0f)) / 2);
                PeerColorDrawable peerColorDrawable = this.color2Drawable;
                float dpf2 = AndroidUtilities.dpf2(3.0f);
                int i = Theme.key_windowBackgroundWhite;
                peerColorDrawable.stroke(dpf2, Theme.getColor(i, this.resourcesProvider));
                this.color2Drawable.draw(canvas);
                int dp = measuredWidth - AndroidUtilities.dp(18.0f);
                this.color1Drawable.setBounds(dp - AndroidUtilities.dp(11.0f), (getMeasuredHeight() - AndroidUtilities.dp(11.0f)) / 2, dp, (getMeasuredHeight() + AndroidUtilities.dp(11.0f)) / 2);
                this.color1Drawable.stroke(AndroidUtilities.dpf2(3.0f), Theme.getColor(i, this.resourcesProvider));
                this.color1Drawable.draw(canvas);
            } else if (this.userText != null) {
                int measuredWidth2 = (int) ((getMeasuredWidth() - AndroidUtilities.dp(116.0f)) - Math.min(this.buttonText.getWidth(), getMeasuredWidth() - AndroidUtilities.dp(164.0f)));
                int min = (int) Math.min(this.userText.getWidth(), measuredWidth2);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(LocaleController.isRTL ? AndroidUtilities.dp(15.0f) : (getMeasuredWidth() - AndroidUtilities.dp(33.0f)) - min, (getMeasuredHeight() - AndroidUtilities.dp(22.0f)) / 2.0f, LocaleController.isRTL ? AndroidUtilities.dp(33.0f) + min : getMeasuredWidth() - AndroidUtilities.dp(15.0f), (getMeasuredHeight() + AndroidUtilities.dp(22.0f)) / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.userTextBackgroundPaint);
                this.userText.ellipsize(measuredWidth2).draw(canvas, LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : (getMeasuredWidth() - AndroidUtilities.dp(24.0f)) - min, getMeasuredHeight() / 2.0f);
            }
            if (this.needDivider) {
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintDivider") : null;
                if (paint == null) {
                    paint = Theme.dividerPaint;
                }
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(64.0f) : 0), getMeasuredHeight() - 1, paint);
            }
        }
    }

    public class PeerColorGrid extends View {
        private final Paint backgroundPaint;
        private ColorButton[] buttons;
        private final int currentAccount;
        private final Paint dividerPaint;
        private Utilities.Callback<Integer> onColorClick;
        final int[] order;
        private ColorButton pressedButton;
        private int selectedColorId;
        private final int type;

        public class ColorButton {
            private final ButtonBounce bounce;
            private boolean hasColor2;
            private boolean hasColor3;
            public int id;
            private boolean selected;
            private final AnimatedFloat selectedT;
            private final Paint paint1 = new Paint(1);
            private final Paint paint2 = new Paint(1);
            private final Paint paint3 = new Paint(1);
            private final Path circlePath = new Path();
            private final Path color2Path = new Path();
            private final RectF bounds = new RectF();
            public final RectF clickBounds = new RectF();

            public ColorButton() {
                this.bounce = new ButtonBounce(PeerColorGrid.this);
                this.selectedT = new AnimatedFloat(PeerColorGrid.this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            }

            public void set(int i) {
                this.hasColor3 = false;
                this.hasColor2 = false;
                this.paint1.setColor(i);
            }

            public void set(MessagesController.PeerColor peerColor) {
                if (peerColor == null) {
                    return;
                }
                boolean z = PeerColorActivity.this.isDark;
                if (PeerColorGrid.this.type == 0) {
                    if (z && peerColor.hasColor2() && !peerColor.hasColor3()) {
                        this.paint1.setColor(peerColor.getColor2(z));
                        this.paint2.setColor(peerColor.getColor1(z));
                    } else {
                        this.paint1.setColor(peerColor.getColor1(z));
                        this.paint2.setColor(peerColor.getColor2(z));
                    }
                    this.paint3.setColor(peerColor.getColor3(z));
                    this.hasColor2 = peerColor.hasColor2(z);
                    this.hasColor3 = peerColor.hasColor3(z);
                    return;
                }
                this.paint1.setColor(peerColor.getColor1(z));
                this.paint2.setColor(peerColor.hasColor6(z) ? peerColor.getColor2(z) : peerColor.getColor1(z));
                this.hasColor2 = peerColor.hasColor6(z);
                this.hasColor3 = false;
            }

            public void setSelected(boolean z, boolean z2) {
                this.selected = z;
                if (!z2) {
                    this.selectedT.set(z, true);
                }
                PeerColorGrid.this.invalidate();
            }

            public void layout(RectF rectF) {
                this.bounds.set(rectF);
            }

            public void layoutClickBounds(RectF rectF) {
                this.clickBounds.set(rectF);
            }

            protected void draw(Canvas canvas) {
                canvas.save();
                float scale = this.bounce.getScale(0.05f);
                canvas.scale(scale, scale, this.bounds.centerX(), this.bounds.centerY());
                canvas.save();
                this.circlePath.rewind();
                this.circlePath.addCircle(this.bounds.centerX(), this.bounds.centerY(), Math.min(this.bounds.height() / 2.0f, this.bounds.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(this.circlePath);
                canvas.drawPaint(this.paint1);
                if (this.hasColor2) {
                    this.color2Path.rewind();
                    Path path = this.color2Path;
                    RectF rectF = this.bounds;
                    path.moveTo(rectF.right, rectF.top);
                    Path path2 = this.color2Path;
                    RectF rectF2 = this.bounds;
                    path2.lineTo(rectF2.right, rectF2.bottom);
                    Path path3 = this.color2Path;
                    RectF rectF3 = this.bounds;
                    path3.lineTo(rectF3.left, rectF3.bottom);
                    this.color2Path.close();
                    canvas.drawPath(this.color2Path, this.paint2);
                }
                canvas.restore();
                if (this.hasColor3) {
                    canvas.save();
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float width = (this.bounds.width() * 0.315f) / 2.0f;
                    rectF4.set(this.bounds.centerX() - width, this.bounds.centerY() - width, this.bounds.centerX() + width, this.bounds.centerY() + width);
                    canvas.rotate(45.0f, this.bounds.centerX(), this.bounds.centerY());
                    canvas.drawRoundRect(rectF4, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.paint3);
                    canvas.restore();
                }
                float f = this.selectedT.set(this.selected);
                if (f > 0.0f) {
                    PeerColorGrid.this.backgroundPaint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    PeerColorGrid.this.backgroundPaint.setColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    canvas.drawCircle(this.bounds.centerX(), this.bounds.centerY(), Math.min(this.bounds.height() / 2.0f, this.bounds.width() / 2.0f) + (PeerColorGrid.this.backgroundPaint.getStrokeWidth() * AndroidUtilities.lerp(0.5f, -2.0f, f)), PeerColorGrid.this.backgroundPaint);
                }
                canvas.restore();
            }

            public void setPressed(boolean z) {
                this.bounce.setPressed(z);
            }
        }

        public PeerColorGrid(Context context, int i, int i2) {
            super(context);
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.order = new int[]{5, 3, 1, 0, 2, 4, 6};
            this.dividerPaint = new Paint(1);
            this.selectedColorId = 0;
            this.type = i;
            this.currentAccount = i2;
        }

        public void updateColors() {
            if (this.buttons == null) {
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            MessagesController.PeerColors peerColors = this.type == 0 ? messagesController.peerColors : messagesController.profilePeerColors;
            int i = 0;
            while (true) {
                ColorButton[] colorButtonArr = this.buttons;
                if (i < colorButtonArr.length) {
                    if (i < 7 && this.type == 0) {
                        ColorButton colorButton = colorButtonArr[i];
                        int[] iArr = this.order;
                        colorButton.id = iArr[i];
                        colorButtonArr[i].set(Theme.getColor(Theme.keys_avatar_nameInMessage[iArr[i]], ((BaseFragment) PeerColorActivity.this).resourceProvider));
                    } else {
                        int i2 = i - (this.type != 0 ? 0 : 7);
                        if (peerColors != null && i2 >= 0 && i2 < peerColors.colors.size()) {
                            this.buttons[i].id = peerColors.colors.get(i2).id;
                            this.buttons[i].set(peerColors.colors.get(i2));
                        }
                    }
                    i++;
                } else {
                    invalidate();
                    return;
                }
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            MessagesController.PeerColors peerColors = this.type == 0 ? messagesController.peerColors : messagesController.profilePeerColors;
            int i4 = 7;
            int size2 = (peerColors == null ? 0 : peerColors.colors.size()) + 7;
            int i5 = this.type == 0 ? 7 : 8;
            float f = size;
            float f2 = i5;
            float f3 = i5 + 1;
            float min = Math.min(AndroidUtilities.dp(54.0f), f / ((f3 * 0.28947f) + f2));
            float min2 = Math.min(0.28947f * min, AndroidUtilities.dp(8.0f));
            float min3 = Math.min(0.31578946f * min, AndroidUtilities.dp(11.33f));
            setMeasuredDimension(size, (int) (((size2 / i5) * min) + ((i3 + 1) * min3)));
            ColorButton[] colorButtonArr = this.buttons;
            if (colorButtonArr == null || colorButtonArr.length != size2) {
                this.buttons = new ColorButton[size2];
                int i6 = 0;
                while (i6 < size2) {
                    this.buttons[i6] = new ColorButton();
                    if (i6 < i4 && this.type == 0) {
                        ColorButton[] colorButtonArr2 = this.buttons;
                        ColorButton colorButton = colorButtonArr2[i6];
                        int[] iArr = this.order;
                        colorButton.id = iArr[i6];
                        colorButtonArr2[i6].set(Theme.getColor(Theme.keys_avatar_nameInMessage[iArr[i6]]));
                    } else {
                        int i7 = i6 - (this.type == 0 ? 7 : 0);
                        if (peerColors != null && i7 >= 0 && i7 < peerColors.colors.size()) {
                            this.buttons[i6].id = peerColors.colors.get(i7).id;
                            this.buttons[i6].set(peerColors.colors.get(i7));
                        }
                    }
                    i6++;
                    i4 = 7;
                }
            }
            float f4 = ((f - ((f2 * min) + (f3 * min2))) / 2.0f) + min2;
            if (this.buttons != null) {
                float f5 = f4;
                float f6 = min3;
                for (int i8 = 0; i8 < this.buttons.length; i8++) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(f5, f6, f5 + min, f6 + min);
                    this.buttons[i8].layout(rectF);
                    rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                    this.buttons[i8].layoutClickBounds(rectF);
                    ColorButton[] colorButtonArr3 = this.buttons;
                    colorButtonArr3[i8].setSelected(colorButtonArr3[i8].id == this.selectedColorId, false);
                    if (i8 % i5 == i5 - 1) {
                        f6 += min + min3;
                        f5 = f4;
                    } else {
                        f5 += min + min2;
                    }
                }
            }
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            if (this.buttons != null) {
                int i = 0;
                while (true) {
                    ColorButton[] colorButtonArr = this.buttons;
                    if (i >= colorButtonArr.length) {
                        break;
                    }
                    colorButtonArr[i].draw(canvas);
                    i++;
                }
            }
            this.dividerPaint.setColor(PeerColorActivity.this.getThemedColor(Theme.key_divider));
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), this.dividerPaint);
        }

        public void setSelected(int i) {
            this.selectedColorId = i;
            if (this.buttons == null) {
                return;
            }
            int i2 = 0;
            while (true) {
                ColorButton[] colorButtonArr = this.buttons;
                if (i2 >= colorButtonArr.length) {
                    return;
                }
                colorButtonArr[i2].setSelected(colorButtonArr[i2].id == i, true);
                i2++;
            }
        }

        public int getColorId() {
            return this.selectedColorId;
        }

        public void setOnColorClick(Utilities.Callback<Integer> callback) {
            this.onColorClick = callback;
        }

        @Override
        public boolean dispatchTouchEvent(android.view.MotionEvent r7) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PeerColorActivity.PeerColorGrid.dispatchTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public static class PeerColorDrawable extends Drawable {
        private final Path clipCirclePath;
        private final Paint color1Paint;
        private final Paint color2Paint;
        private final Path color2Path;
        private final Paint color3Paint;
        private final boolean hasColor3;
        private float radius = AndroidUtilities.dpf2(10.6665f);
        private Paint strokePaint;

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public static PeerColorDrawable from(int i, int i2) {
            if (i2 < 7) {
                return new PeerColorDrawable(Theme.getColor(Theme.keys_avatar_nameInMessage[i2]), Theme.getColor(Theme.keys_avatar_nameInMessage[i2]), Theme.getColor(Theme.keys_avatar_nameInMessage[i2]));
            }
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i).peerColors;
            return from(peerColors == null ? null : peerColors.getColor(i2), false);
        }

        public static PeerColorDrawable fromProfile(int i, int i2) {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i).profilePeerColors;
            return from(peerColors == null ? null : peerColors.getColor(i2), true);
        }

        public static PeerColorDrawable from(MessagesController.PeerColor peerColor, boolean z) {
            if (peerColor == null) {
                return new PeerColorDrawable(0, 0, 0);
            }
            return new PeerColorDrawable(peerColor.getColor1(), (!z || peerColor.hasColor6(Theme.isCurrentThemeDark())) ? peerColor.getColor2() : peerColor.getColor1(), z ? peerColor.getColor1() : peerColor.getColor3());
        }

        public PeerColorDrawable setRadius(float f) {
            this.radius = f;
            initPath();
            return this;
        }

        public PeerColorDrawable stroke(float f, int i) {
            if (this.strokePaint == null) {
                Paint paint = new Paint(1);
                this.strokePaint = paint;
                paint.setStyle(Paint.Style.STROKE);
            }
            this.strokePaint.setStrokeWidth(f);
            this.strokePaint.setColor(i);
            return this;
        }

        public PeerColorDrawable(int i, int i2, int i3) {
            Paint paint = new Paint(1);
            this.color1Paint = paint;
            Paint paint2 = new Paint(1);
            this.color2Paint = paint2;
            Paint paint3 = new Paint(1);
            this.color3Paint = paint3;
            this.color2Path = new Path();
            this.clipCirclePath = new Path();
            this.hasColor3 = i3 != i;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            initPath();
        }

        private void initPath() {
            this.clipCirclePath.rewind();
            Path path = this.clipCirclePath;
            float f = this.radius;
            path.addCircle(f, f, f, Path.Direction.CW);
            this.color2Path.rewind();
            this.color2Path.moveTo(this.radius * 2.0f, 0.0f);
            Path path2 = this.color2Path;
            float f2 = this.radius;
            path2.lineTo(f2 * 2.0f, f2 * 2.0f);
            this.color2Path.lineTo(0.0f, this.radius * 2.0f);
            this.color2Path.close();
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.save();
            canvas.translate(getBounds().centerX() - this.radius, getBounds().centerY() - this.radius);
            Paint paint = this.strokePaint;
            if (paint != null) {
                float f = this.radius;
                canvas.drawCircle(f, f, f, paint);
            }
            canvas.clipPath(this.clipCirclePath);
            canvas.drawPaint(this.color1Paint);
            canvas.drawPath(this.color2Path, this.color2Paint);
            if (this.hasColor3) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.radius - AndroidUtilities.dp(3.66f), this.radius - AndroidUtilities.dp(3.66f), this.radius + AndroidUtilities.dp(3.66f), this.radius + AndroidUtilities.dp(3.66f));
                float f2 = this.radius;
                canvas.rotate(45.0f, f2, f2);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.color3Paint);
            }
            canvas.restore();
        }

        @Override
        public int getIntrinsicHeight() {
            return (int) (this.radius * 2.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return (int) (this.radius * 2.0f);
        }
    }

    public class ColoredActionBar extends View {
        private LinearGradient backgroundGradient;
        private int backgroundGradientColor1;
        private int backgroundGradientColor2;
        private int backgroundGradientHeight;
        private final Paint backgroundPaint;
        public int color1;
        private final AnimatedColor color1Animated;
        public int color2;
        private final AnimatedColor color2Animated;
        private int defaultColor;
        public boolean isDefault;
        private int lastBtnColor;
        private float progressToGradient;

        public ColoredActionBar(Context context) {
            super(context);
            this.progressToGradient = 0.0f;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.color1Animated = new AnimatedColor(this, 350L, cubicBezierInterpolator);
            this.color2Animated = new AnimatedColor(this, 350L, cubicBezierInterpolator);
            this.backgroundPaint = new Paint(1);
            this.lastBtnColor = 0;
            this.defaultColor = PeerColorActivity.this.getThemedColor(Theme.key_actionBarDefault);
            setColor(-1, false);
        }

        public void setColor(int i, boolean z) {
            this.isDefault = false;
            if (i >= 0) {
                MessagesController.PeerColors peerColors = MessagesController.getInstance(((BaseFragment) PeerColorActivity.this).currentAccount).profilePeerColors;
                MessagesController.PeerColor color = peerColors == null ? null : peerColors.getColor(i);
                if (color != null) {
                    this.color1 = color.getBgColor1(PeerColorActivity.this.isDark);
                    this.color2 = color.getBgColor2(PeerColorActivity.this.isDark);
                } else {
                    this.isDefault = true;
                    int themedColor = PeerColorActivity.this.getThemedColor(Theme.key_actionBarDefault);
                    this.color2 = themedColor;
                    this.color1 = themedColor;
                }
            } else {
                this.isDefault = true;
                int themedColor2 = PeerColorActivity.this.getThemedColor(Theme.key_actionBarDefault);
                this.color2 = themedColor2;
                this.color1 = themedColor2;
            }
            if (!z) {
                this.color1Animated.set(this.color1, true);
                this.color2Animated.set(this.color2, true);
            }
            PeerColorActivity.this.updateLightStatusBar();
            updateActionBarButtonsColor();
            invalidate();
        }

        public void setProgressToGradient(float f) {
            if (Math.abs(this.progressToGradient - f) > 0.001f) {
                this.progressToGradient = f;
                updateTabsViewBackground();
                updateActionBarButtonsColor();
                PeerColorActivity.this.updateLightStatusBar();
                invalidate();
            }
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            int i = this.color1Animated.set(this.color1);
            int i2 = this.color2Animated.set(this.color2);
            if (this.backgroundGradient == null || this.backgroundGradientColor1 != i || this.backgroundGradientColor2 != i2 || this.backgroundGradientHeight != getHeight()) {
                int height = getHeight();
                this.backgroundGradientHeight = height;
                this.backgroundGradientColor2 = i2;
                this.backgroundGradientColor1 = i;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{i2, i}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.backgroundGradient = linearGradient;
                this.backgroundPaint.setShader(linearGradient);
                updateTabsViewBackground();
                PeerColorActivity.this.updateLightStatusBar();
            }
            if (this.progressToGradient < 1.0f) {
                canvas.drawColor(this.defaultColor);
            }
            float f = this.progressToGradient;
            if (f > 0.0f) {
                this.backgroundPaint.setAlpha((int) (f * 255.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.backgroundPaint);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.statusBarHeight + AndroidUtilities.dp(144.0f), 1073741824));
        }

        public void updateColors() {
            this.defaultColor = PeerColorActivity.this.getThemedColor(Theme.key_actionBarDefault);
            updateTabsViewBackground();
            updateActionBarButtonsColor();
            PeerColorActivity.this.updateLightStatusBar();
            invalidate();
        }

        public void updateActionBarButtonsColor() {
            PeerColorActivity peerColorActivity = PeerColorActivity.this;
            int i = Theme.key_actionBarDefaultIcon;
            int blendARGB = ColorUtils.blendARGB(peerColorActivity.getThemedColor(i), this.isDefault ? PeerColorActivity.this.getThemedColor(i) : -1, this.progressToGradient);
            if (this.lastBtnColor != blendARGB) {
                if (PeerColorActivity.this.backButton != null) {
                    this.lastBtnColor = blendARGB;
                    PeerColorActivity.this.backButton.setColorFilter(new PorterDuffColorFilter(blendARGB, PorterDuff.Mode.SRC_IN));
                }
                if (PeerColorActivity.this.dayNightItem != null) {
                    this.lastBtnColor = blendARGB;
                    PeerColorActivity.this.dayNightItem.setColorFilter(new PorterDuffColorFilter(blendARGB, PorterDuff.Mode.SRC_IN));
                }
            }
        }

        public int getColor() {
            return ColorUtils.blendARGB(PeerColorActivity.this.getThemedColor(Theme.key_actionBarDefault), ColorUtils.blendARGB(this.color1Animated.get(), this.color2Animated.get(), 0.75f), this.progressToGradient);
        }

        private void updateTabsViewBackground() {
            int adaptHSV;
            int adaptHSV2;
            if (PeerColorActivity.this.tabsView == null) {
                return;
            }
            FilledTabsView filledTabsView = PeerColorActivity.this.tabsView;
            PeerColorActivity peerColorActivity = PeerColorActivity.this;
            int i = Theme.key_actionBarDefault;
            if (AndroidUtilities.computePerceivedBrightness(peerColorActivity.getThemedColor(i)) > 0.721f) {
                adaptHSV = PeerColorActivity.this.getThemedColor(Theme.key_actionBarDefaultIcon);
            } else {
                adaptHSV = Theme.adaptHSV(PeerColorActivity.this.getThemedColor(i), 0.08f, -0.08f);
            }
            if (AndroidUtilities.computePerceivedBrightness(ColorUtils.blendARGB(this.color1Animated.get(), this.color2Animated.get(), 0.75f)) > 0.721f) {
                adaptHSV2 = PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueIcon);
            } else {
                adaptHSV2 = Theme.adaptHSV(ColorUtils.blendARGB(this.color1Animated.get(), this.color2Animated.get(), 0.75f), 0.08f, -0.08f);
            }
            filledTabsView.setBackgroundColor(ColorUtils.blendARGB(adaptHSV, adaptHSV2, this.progressToGradient));
        }
    }

    public class ProfilePreview extends FrameLayout {
        private final AvatarDrawable avatarDrawable;
        private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emoji;
        private final ImageReceiver imageReceiver;
        private int lastColorId;
        private final RectF rectF;
        private final StoriesUtilities.StoryGradientTools storyGradient;
        private final SimpleTextView subtitleView;
        private final SimpleTextView titleView;

        public ProfilePreview(Context context) {
            super(context);
            String userName;
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.imageReceiver = imageReceiver;
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            this.avatarDrawable = avatarDrawable;
            this.emoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, false, AndroidUtilities.dp(20.0f), 13);
            this.storyGradient = new StoriesUtilities.StoryGradientTools((View) this, false);
            this.lastColorId = -1;
            this.rectF = new RectF();
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.titleView = simpleTextView;
            simpleTextView.setTextColor(-1);
            simpleTextView.setTextSize(20);
            simpleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            simpleTextView.setScrollNonFitText(true);
            addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, 83, 97.0f, 0.0f, 16.0f, 50.33f));
            SimpleTextView simpleTextView2 = new SimpleTextView(context);
            this.subtitleView = simpleTextView2;
            simpleTextView2.setTextSize(14);
            simpleTextView2.setTextColor(-2130706433);
            simpleTextView2.setScrollNonFitText(true);
            addView(simpleTextView2, LayoutHelper.createFrame(-1, -2.0f, 83, 97.0f, 0.0f, 16.0f, 30.66f));
            imageReceiver.setRoundRadius(AndroidUtilities.dp(54.0f));
            if (PeerColorActivity.this.isChannel) {
                TLRPC$Chat chat = MessagesController.getInstance(((BaseFragment) PeerColorActivity.this).currentAccount).getChat(Long.valueOf(-PeerColorActivity.this.dialogId));
                userName = chat == null ? "" : chat.title;
                avatarDrawable.setInfo(((BaseFragment) PeerColorActivity.this).currentAccount, chat);
                imageReceiver.setForUserOrChat(chat, avatarDrawable);
            } else {
                TLRPC$User currentUser = UserConfig.getInstance(((BaseFragment) PeerColorActivity.this).currentAccount).getCurrentUser();
                userName = UserObject.getUserName(currentUser);
                avatarDrawable.setInfo(((BaseFragment) PeerColorActivity.this).currentAccount, currentUser);
                imageReceiver.setForUserOrChat(currentUser, avatarDrawable);
            }
            try {
                userName = Emoji.replaceEmoji(userName, null, false);
            } catch (Exception unused) {
            }
            this.titleView.setText(userName);
            if (PeerColorActivity.this.isChannel) {
                TLRPC$Chat chat2 = MessagesController.getInstance(((BaseFragment) PeerColorActivity.this).currentAccount).getChat(Long.valueOf(-PeerColorActivity.this.dialogId));
                TLRPC$ChatFull chatFull = MessagesController.getInstance(((BaseFragment) PeerColorActivity.this).currentAccount).getChatFull(-PeerColorActivity.this.dialogId);
                if (chatFull != null && chatFull.participants_count > 0) {
                    if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        this.subtitleView.setText(LocaleController.formatPluralStringComma("Subscribers", chatFull.participants_count));
                    } else {
                        this.subtitleView.setText(LocaleController.formatPluralStringComma("Members", chatFull.participants_count));
                    }
                } else if (chat2 != null && chat2.participants_count > 0) {
                    if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        this.subtitleView.setText(LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count));
                    } else {
                        this.subtitleView.setText(LocaleController.formatPluralStringComma("Members", chat2.participants_count));
                    }
                } else {
                    boolean isPublic = ChatObject.isPublic(chat2);
                    if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        this.subtitleView.setText(LocaleController.getString(isPublic ? R.string.ChannelPublic : R.string.ChannelPrivate).toLowerCase());
                    } else {
                        this.subtitleView.setText(LocaleController.getString(isPublic ? R.string.MegaPublic : R.string.MegaPrivate).toLowerCase());
                    }
                }
            } else {
                this.subtitleView.setText(LocaleController.getString(R.string.Online));
            }
            setWillNotDraw(false);
        }

        public void updateAvatarDrawable(MessagesController.PeerColor peerColor) {
            if (PeerColorActivity.this.isChannel) {
                TLRPC$Chat chat = MessagesController.getInstance(((BaseFragment) PeerColorActivity.this).currentAccount).getChat(Long.valueOf(-PeerColorActivity.this.dialogId));
                if (chat != null) {
                    this.avatarDrawable.setInfo(chat.id, chat.title, null, null, Integer.valueOf(ChatObject.getColorId(chat)), peerColor);
                    return;
                }
                return;
            }
            TLRPC$User currentUser = UserConfig.getInstance(((BaseFragment) PeerColorActivity.this).currentAccount).getCurrentUser();
            if (currentUser != null) {
                this.avatarDrawable.setInfo(currentUser.id, currentUser.first_name, currentUser.last_name, null, Integer.valueOf(UserObject.getColorId(currentUser)), peerColor);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.emoji.attach();
            this.imageReceiver.onAttachedToWindow();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.emoji.detach();
            this.imageReceiver.onDetachedFromWindow();
        }

        public void setColor(int i, boolean z) {
            MessagesController.PeerColor color;
            MessagesController.PeerColors peerColors = MessagesController.getInstance(((BaseFragment) PeerColorActivity.this).currentAccount).profilePeerColors;
            if (peerColors == null) {
                color = null;
            } else {
                this.lastColorId = i;
                color = peerColors.getColor(i);
            }
            if (color != null) {
                this.emoji.setColor(Integer.valueOf(PeerColorActivity.adaptProfileEmojiColor(color.getBgColor1(PeerColorActivity.this.isDark))));
                int blendARGB = ColorUtils.blendARGB(color.getStoryColor1(PeerColorActivity.this.isDark), color.getStoryColor2(PeerColorActivity.this.isDark), 0.5f);
                PeerColorActivity peerColorActivity = PeerColorActivity.this;
                int i2 = Theme.key_actionBarDefault;
                if (Theme.hasHue(peerColorActivity.getThemedColor(i2))) {
                    this.subtitleView.setTextColor(Theme.changeColorAccent(PeerColorActivity.this.getThemedColor(i2), blendARGB, PeerColorActivity.this.getThemedColor(Theme.key_avatar_subtitleInProfileBlue), PeerColorActivity.this.isDark, blendARGB));
                } else {
                    this.subtitleView.setTextColor(blendARGB);
                }
                this.titleView.setTextColor(-1);
            } else {
                PeerColorActivity peerColorActivity2 = PeerColorActivity.this;
                int i3 = Theme.key_actionBarDefault;
                if (AndroidUtilities.computePerceivedBrightness(peerColorActivity2.getThemedColor(i3)) > 0.8f) {
                    this.emoji.setColor(Integer.valueOf(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, ((BaseFragment) PeerColorActivity.this).resourceProvider)));
                } else if (AndroidUtilities.computePerceivedBrightness(PeerColorActivity.this.getThemedColor(i3)) < 0.2f) {
                    this.emoji.setColor(Integer.valueOf(Theme.multAlpha(Theme.getColor(Theme.key_actionBarDefaultTitle, ((BaseFragment) PeerColorActivity.this).resourceProvider), 0.5f)));
                } else {
                    this.emoji.setColor(Integer.valueOf(PeerColorActivity.adaptProfileEmojiColor(Theme.getColor(i3, ((BaseFragment) PeerColorActivity.this).resourceProvider))));
                }
                this.subtitleView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubtitle, ((BaseFragment) PeerColorActivity.this).resourceProvider));
                this.titleView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultTitle, ((BaseFragment) PeerColorActivity.this).resourceProvider));
            }
            updateAvatarDrawable(color);
            this.storyGradient.setColorId(i, z);
            invalidate();
        }

        public void setEmoji(long j, boolean z) {
            if (j == 0) {
                this.emoji.set((Drawable) null, z);
            } else {
                this.emoji.set(j, z);
            }
            MessagesController.PeerColors peerColors = MessagesController.getInstance(((BaseFragment) PeerColorActivity.this).currentAccount).profilePeerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(this.lastColorId) : null;
            if (color != null) {
                this.emoji.setColor(Integer.valueOf(PeerColorActivity.adaptProfileEmojiColor(color.getBgColor1(PeerColorActivity.this.isDark))));
                return;
            }
            PeerColorActivity peerColorActivity = PeerColorActivity.this;
            int i = Theme.key_actionBarDefault;
            if (AndroidUtilities.computePerceivedBrightness(peerColorActivity.getThemedColor(i)) > 0.8f) {
                this.emoji.setColor(Integer.valueOf(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, ((BaseFragment) PeerColorActivity.this).resourceProvider)));
            } else if (AndroidUtilities.computePerceivedBrightness(PeerColorActivity.this.getThemedColor(i)) < 0.2f) {
                this.emoji.setColor(Integer.valueOf(Theme.multAlpha(Theme.getColor(Theme.key_actionBarDefaultTitle, ((BaseFragment) PeerColorActivity.this).resourceProvider), 0.5f)));
            } else {
                this.emoji.setColor(Integer.valueOf(PeerColorActivity.adaptProfileEmojiColor(Theme.getColor(i, ((BaseFragment) PeerColorActivity.this).resourceProvider))));
            }
        }

        @Override
        protected void dispatchDraw(final Canvas canvas) {
            this.rectF.set(AndroidUtilities.dp(20.33f), getHeight() - AndroidUtilities.dp(78.66f), AndroidUtilities.dp(20.33f) + AndroidUtilities.dp(53.33f), getHeight() - AndroidUtilities.dp(25.33f));
            this.imageReceiver.setImageCoords(this.rectF);
            this.imageReceiver.draw(canvas);
            canvas.drawCircle(this.rectF.centerX(), this.rectF.centerY(), (this.rectF.width() / 2.0f) + AndroidUtilities.dp(4.0f), this.storyGradient.getPaint(this.rectF));
            PeerColorActivity.drawProfileIconPattern(getWidth() - AndroidUtilities.dp(46.0f), getHeight(), 1.0f, new Utilities.Callback4() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                    PeerColorActivity.ProfilePreview.this.lambda$dispatchDraw$0(canvas, (Float) obj, (Float) obj2, (Float) obj3, (Float) obj4);
                }
            });
            super.dispatchDraw(canvas);
        }

        public void lambda$dispatchDraw$0(Canvas canvas, Float f, Float f2, Float f3, Float f4) {
            this.emoji.setAlpha((int) (f4.floatValue() * 255.0f));
            this.emoji.setBounds((int) (f.floatValue() - (f3.floatValue() * 0.45f)), (int) (f2.floatValue() - (f3.floatValue() * 0.45f)), (int) (f.floatValue() + (f3.floatValue() * 0.45f)), (int) (f2.floatValue() + (f3.floatValue() * 0.45f)));
            this.emoji.draw(canvas);
        }
    }

    public static int adaptProfileEmojiColor(int i) {
        return Theme.adaptHSV(i, 0.5f, (AndroidUtilities.computePerceivedBrightness(i) > 0.2f ? 1 : (AndroidUtilities.computePerceivedBrightness(i) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f);
    }

    public static void drawProfileIconPattern(float f, float f2, float f3, Utilities.Callback4<Float, Float, Float, Float> callback4) {
        int i = 0;
        while (true) {
            float[] fArr = particles;
            if (i >= fArr.length) {
                return;
            }
            callback4.run(Float.valueOf((AndroidUtilities.dp(fArr[i]) * f3) + f), Float.valueOf((AndroidUtilities.dp(fArr[i + 1]) * f3) + f2), Float.valueOf(AndroidUtilities.dpf2(fArr[i + 2])), Float.valueOf(fArr[i + 3]));
            i += 4;
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void toggleTheme() {
        FrameLayout frameLayout = (FrameLayout) getParentActivity().getWindow().getDecorView();
        final Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        final Canvas canvas = new Canvas(createBitmap);
        this.dayNightItem.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.dayNightItem.setAlpha(1.0f);
        final Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        final Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.dayNightItem.getLocationInWindow(iArr);
        final float f = iArr[0];
        final float f2 = iArr[1];
        final float measuredWidth = f + (this.dayNightItem.getMeasuredWidth() / 2.0f);
        final float measuredHeight = f2 + (this.dayNightItem.getMeasuredHeight() / 2.0f);
        final float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        View view = new View(getContext()) {
            @Override
            protected void onDraw(Canvas canvas2) {
                super.onDraw(canvas2);
                if (PeerColorActivity.this.isDark) {
                    if (PeerColorActivity.this.changeDayNightViewProgress > 0.0f) {
                        canvas.drawCircle(measuredWidth, measuredHeight, max * PeerColorActivity.this.changeDayNightViewProgress, paint);
                    }
                    canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint2);
                } else {
                    canvas2.drawCircle(measuredWidth, measuredHeight, max * (1.0f - PeerColorActivity.this.changeDayNightViewProgress), paint2);
                }
                canvas2.save();
                canvas2.translate(f, f2);
                PeerColorActivity.this.dayNightItem.draw(canvas2);
                canvas2.restore();
            }
        };
        this.changeDayNightView = view;
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean lambda$toggleTheme$11;
                lambda$toggleTheme$11 = PeerColorActivity.lambda$toggleTheme$11(view2, motionEvent);
                return lambda$toggleTheme$11;
            }
        });
        this.changeDayNightViewProgress = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.changeDayNightViewAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            boolean changedNavigationBarColor = false;

            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PeerColorActivity.this.changeDayNightViewProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PeerColorActivity.this.changeDayNightView.invalidate();
                if (this.changedNavigationBarColor || PeerColorActivity.this.changeDayNightViewProgress <= 0.5f) {
                    return;
                }
                this.changedNavigationBarColor = true;
            }
        });
        this.changeDayNightViewAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (PeerColorActivity.this.changeDayNightView != null) {
                    if (PeerColorActivity.this.changeDayNightView.getParent() != null) {
                        ((ViewGroup) PeerColorActivity.this.changeDayNightView.getParent()).removeView(PeerColorActivity.this.changeDayNightView);
                    }
                    PeerColorActivity.this.changeDayNightView = null;
                }
                PeerColorActivity.this.changeDayNightViewAnimator = null;
                super.onAnimationEnd(animator);
            }
        });
        this.changeDayNightViewAnimator.setDuration(400L);
        this.changeDayNightViewAnimator.setInterpolator(Easings.easeInOutQuad);
        this.changeDayNightViewAnimator.start();
        frameLayout.addView(this.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PeerColorActivity.this.lambda$toggleTheme$12();
            }
        });
    }

    public void lambda$toggleTheme$12() {
        this.isDark = !this.isDark;
        updateThemeColors();
        setForceDark(this.isDark, true);
        updateColors();
    }

    @Override
    public boolean isLightStatusBar() {
        ColoredActionBar coloredActionBar = this.colorBar;
        if (coloredActionBar == null) {
            return super.isLightStatusBar();
        }
        return ColorUtils.calculateLuminance(coloredActionBar.getColor()) > 0.699999988079071d;
    }

    public void updateLightStatusBar() {
        if (getParentActivity() == null) {
            return;
        }
        AndroidUtilities.setLightStatusBar(getParentActivity().getWindow(), isLightStatusBar());
    }

    public void setForceDark(boolean z, boolean z2) {
        if (this.forceDark == z) {
            return;
        }
        this.forceDark = z;
        if (z2) {
            RLottieDrawable rLottieDrawable = this.sunDrawable;
            rLottieDrawable.setCustomEndFrame(z ? rLottieDrawable.getFramesCount() : 0);
            RLottieDrawable rLottieDrawable2 = this.sunDrawable;
            if (rLottieDrawable2 != null) {
                rLottieDrawable2.start();
                return;
            }
            return;
        }
        int framesCount = z ? this.sunDrawable.getFramesCount() - 1 : 0;
        this.sunDrawable.setCurrentFrame(framesCount, false, true);
        this.sunDrawable.setCustomEndFrame(framesCount);
        ImageView imageView = this.dayNightItem;
        if (imageView != null) {
            imageView.invalidate();
        }
    }
}
