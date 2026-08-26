package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import com.google.android.gms.internal.mlkit_vision_common.zzlj;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.CacheControlActivity;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell$SpansContainer$2;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrimOptions$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda13;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.PollItemMenu;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda22;
import org.telegram.ui.QrActivity;
import org.telegram.ui.SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda54;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.TodoItemMenu;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda13;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda9;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda25;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda4;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda42;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;
import org.telegram.ui.VoIPFragment$12$$ExternalSyntheticLambda0;
import org.telegram.ui.WebviewActivity;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;

public final class StoryPrivacyBottomSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public int activePage;
    public boolean allowComments;
    public boolean allowCover;
    public boolean allowScreenshots;
    public final boolean allowSmallChats;
    public final Paint backgroundPaint;
    public boolean canChangePeer;
    public int commentsPrice;
    public BitmapDrawable coverDrawable;
    public final ArrayList excludedContacts;
    public final ArrayList excludedEveryone;
    public final HashMap excludedEveryoneByGroup;
    public int excludedEveryoneCount;
    public boolean isEdit;
    public boolean isLive;
    public boolean isRtmpStream;
    public boolean keepOnMyPage;
    public boolean liveSettings;
    public boolean loadedContacts;
    public final ArrayList messageUsers;
    public Utilities.Callback onDismiss;
    public DoneCallback onDone;
    public StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda6 onDone2;
    public StoryRecorder$$ExternalSyntheticLambda19 onSelectedAlbums;
    public Utilities.Callback onSelectedPeer;
    public final HashSet selectedAlbums;
    public final ArrayList selectedContacts;
    public final HashMap selectedContactsByGroup;
    public int selectedContactsCount;
    public TLRPC.InputPeer selectedPeer;
    public int selectedType;
    public HashMap smallChatsParticipantsCount;
    public boolean startedFromSendAsMessage;
    public int storiesCount;
    public int storyPeriod;
    public PollItemMenu.AnonymousClass3 viewPager;
    public ArrayList warnUsers;
    public StoryRecorder$$ExternalSyntheticLambda7 whenCoverClicked;

    public final class ChoosePeerSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
        public final Adapter adapter;
        public final int currentAccount;
        public final TextView headerView;
        public final RecyclerListView listView;
        public final Utilities.Callback onPeerSelected;
        public ArrayList peers;
        public final TLRPC.InputPeer selectedPeer;

        public final class Adapter extends RecyclerListView.SelectionAdapter {
            public Adapter() {
            }

            @Override
            public final int getItemCount() {
                return ChoosePeerSheet.this.peers.size() + 2;
            }

            @Override
            public final int getItemViewType(int i) {
                if (i == 0) {
                    return 0;
                }
                return i == 1 ? 1 : 2;
            }

            @Override
            public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return viewHolder.mItemViewType == 2;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                boolean z;
                if (viewHolder.mItemViewType == 2) {
                    UserCell userCell = (UserCell) viewHolder.itemView;
                    userCell.setIsSendAs(true, true);
                    ChoosePeerSheet choosePeerSheet = ChoosePeerSheet.this;
                    TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) choosePeerSheet.peers.get(i - 2);
                    boolean z2 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
                    int i2 = choosePeerSheet.currentAccount;
                    if (z2) {
                        userCell.setUser(UserConfig.getInstance(i2).getCurrentUser());
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                        userCell.setUser(MessagesController.getInstance(i2).getUser(Long.valueOf(inputPeer.user_id)));
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                        userCell.setChat(0, MessagesController.getInstance(i2).getChat(Long.valueOf(inputPeer.chat_id)));
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                        userCell.setChat(0, MessagesController.getInstance(i2).getChat(Long.valueOf(inputPeer.channel_id)));
                    }
                    userCell.checkBox.setVisibility(8);
                    userCell.radioButton.setVisibility(0);
                    TLRPC.InputPeer inputPeer2 = choosePeerSheet.selectedPeer;
                    if (inputPeer2 == null && i == 2) {
                        z = true;
                    } else {
                        if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? UserConfig.getInstance(i2).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2)) == (z2 ? UserConfig.getInstance(i2).getClientUserId() : DialogObject.getPeerDialogId(inputPeer))) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    userCell.setChecked(z, false);
                    userCell.setDivider(i != getItemCount() - 1);
                }
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View userCell;
                ChoosePeerSheet choosePeerSheet = ChoosePeerSheet.this;
                if (i == 0 || i == 1) {
                    View view = new View(choosePeerSheet.getContext());
                    view.setLayoutParams(new RecyclerView.LayoutParams(-1, i == 0 ? (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f) : AndroidUtilities.dp(54.0f)));
                    userCell = view;
                } else {
                    userCell = new UserCell(choosePeerSheet.getContext(), ((BottomSheet) choosePeerSheet).resourcesProvider);
                }
                return new RecyclerListView.Holder(userCell);
            }
        }

        public ChoosePeerSheet(Context context, final int i, boolean z, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider, false, false);
            fixNavigationBar();
            MessagesController.getInstance(i).getStoriesController().loadSendAs();
            this.currentAccount = i;
            this.peers = MessagesController.getInstance(i).getStoriesController().sendAs;
            this.selectedPeer = inputPeer;
            this.onPeerSelected = callback;
            this.containerView = new FrameLayout(context) {
                public final Paint backgroundPaint = new Paint(1);
                public final AnimatedFloat statusBarT = new AnimatedFloat(this, 0, 350, CubicBezierInterpolator.EASE_OUT_QUINT);

                @Override
                public final void dispatchDraw(Canvas canvas) {
                    Paint paint = this.backgroundPaint;
                    paint.setColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
                    ChoosePeerSheet choosePeerSheet = ChoosePeerSheet.this;
                    float fMax = Math.max(0.0f, choosePeerSheet.top$1());
                    boolean z2 = fMax < ((float) AndroidUtilities.statusBarHeight);
                    AnimatedFloat animatedFloat = this.statusBarT;
                    float fLerp = AndroidUtilities.lerp(fMax, 0.0f, animatedFloat.set(z2));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(((BottomSheet) choosePeerSheet).backgroundPaddingLeft, fLerp, getWidth() - ((BottomSheet) choosePeerSheet).backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + getHeight());
                    float fDp = (1.0f - animatedFloat.value) * AndroidUtilities.dp(14.0f);
                    canvas.drawRoundRect(rectF, fDp, fDp, paint);
                    choosePeerSheet.headerView.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + fLerp));
                    canvas.save();
                    canvas.clipRect(((BottomSheet) choosePeerSheet).backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight, getWidth() - ((BottomSheet) choosePeerSheet).backgroundPaddingLeft, getHeight());
                    super.dispatchDraw(canvas);
                    canvas.restore();
                }

                @Override
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    float y = motionEvent.getY();
                    ChoosePeerSheet choosePeerSheet = ChoosePeerSheet.this;
                    if (y >= choosePeerSheet.top$1()) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    choosePeerSheet.lambda$showGiftOfferSheet$15();
                    return true;
                }
            };
            RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider);
            this.listView = recyclerListView;
            int i2 = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i2, 0, i2, 0);
            Adapter adapter = new Adapter();
            this.adapter = adapter;
            recyclerListView.setAdapter(adapter);
            recyclerListView.setLayoutManager(new LinearLayoutManager(1, false));
            this.containerView.addView(recyclerListView, LayoutHelper.createFrame(-1, -1, 119));
            recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(int i3, View view) {
                    StoryPrivacyBottomSheet.ChoosePeerSheet choosePeerSheet = this.f$0;
                    if (i3 <= 1) {
                        choosePeerSheet.getClass();
                        return;
                    }
                    TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) choosePeerSheet.peers.get(i3 - 2);
                    long j = inputPeer2.channel_id;
                    Utilities.Callback callback2 = callback;
                    if (j == 0 && inputPeer2.chat_id == 0) {
                        callback2.run(inputPeer2);
                        choosePeerSheet.lambda$showGiftOfferSheet$15();
                        return;
                    }
                    Context context2 = choosePeerSheet.getContext();
                    Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                    AlertDialog alertDialog = new AlertDialog(context2, 3, resourcesProvider2);
                    AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                    AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                    AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 200L);
                    MessagesController.getInstance(i).getStoriesController().canSendStoryFor(DialogObject.getPeerDialogId(inputPeer2), new LinkManager$$ExternalSyntheticLambda13(alertDialog, callback2, inputPeer2, 6), true, resourcesProvider2);
                    choosePeerSheet.lambda$showGiftOfferSheet$15();
                }
            });
            recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public final void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    ((BottomSheet) ChoosePeerSheet.this).containerView.invalidate();
                }
            });
            TextView textView = new TextView(getContext());
            this.headerView = textView;
            OKLCH.m(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider, textView, 20.0f);
            textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
            textView.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(z ? R.string.StoryPrivacyPublishLiveAs : R.string.StoryPrivacyPublishAs));
            this.containerView.addView(textView, LayoutHelper.createFrame(-2.0f, -1));
        }

        @Override
        public final boolean canDismissWithSwipe() {
            return top$1() > ((float) ((int) (((float) AndroidUtilities.displaySize.y) * 0.5f)));
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.storiesSendAsUpdate) {
                this.peers = MessagesController.getInstance(this.currentAccount).getStoriesController().sendAs;
                this.adapter.mObservable.notifyChanged();
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesSendAsUpdate);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
        }

        public final float top$1() {
            float measuredHeight = this.containerView.getMeasuredHeight();
            int i = 0;
            while (true) {
                RecyclerListView recyclerListView = this.listView;
                if (i >= recyclerListView.getChildCount()) {
                    return measuredHeight;
                }
                View childAt = recyclerListView.getChildAt(i);
                if (childAt != null) {
                    recyclerListView.getClass();
                    int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                    if (childAdapterPosition != -1 && childAdapterPosition > 0) {
                        measuredHeight = Math.min(AndroidUtilities.lerp(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
                    }
                }
                i++;
            }
        }
    }

    public interface DoneCallback {
        void done(StoryPrivacy storyPrivacy, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.InputPeer inputPeer, int i, ButtonWithCounterView$$ExternalSyntheticLambda3 buttonWithCounterView$$ExternalSyntheticLambda3, VoIPFragment$12$$ExternalSyntheticLambda0 voIPFragment$12$$ExternalSyntheticLambda0);
    }

    public final class HeaderCell extends FrameLayout {
        public final BackDrawable backDrawable;
        public final ImageView closeView;
        public final Paint dividerPaint;
        public StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 onCloseClickListener;
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView textView;

        public HeaderCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.dividerPaint = new Paint(1);
            this.resourcesProvider = resourcesProvider;
            TextView textView = new TextView(context);
            this.textView = textView;
            zzkh.m(20.0f, textView);
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            boolean z = LocaleController.isRTL;
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 23, z ? 16.0f : 53.0f, 0.0f, z ? 53.0f : 16.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.closeView = imageView;
            BackDrawable backDrawable = new BackDrawable(false);
            this.backDrawable = backDrawable;
            imageView.setImageDrawable(backDrawable);
            backDrawable.color = -1;
            backDrawable.invalidateSelf();
            backDrawable.rotatedColor = -1;
            backDrawable.invalidateSelf();
            backDrawable.animationTime = 220.0f;
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
            imageView.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(this, 28));
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            Paint paint = this.dividerPaint;
            paint.setColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
            canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        }

        public final void setCloseImageVisible(boolean z) {
            this.closeView.setVisibility(z ? 0 : 8);
            TextView textView = this.textView;
            boolean z2 = LocaleController.isRTL;
            textView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, 23, (z2 || !z) ? 22.0f : 53.0f, 0.0f, (z2 && z) ? 53.0f : 22.0f, 0.0f));
        }

        public final void setText(String str) {
            this.textView.setText(str);
        }
    }

    public final class HeaderCell2 extends LinearLayout {
        public final TextView subtitleTextView;
        public final TextView titleTextView;

        public HeaderCell2(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
            super(context);
            setOrientation(1);
            TextView textView = new TextView(context);
            this.titleTextView = textView;
            zzlj.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 20.0f);
            addView(textView, LayoutHelper.createLinear(-1, -2, 55, 27, 16, 27, z ? 4 : 13));
            TextView textView2 = new TextView(context);
            this.subtitleTextView = textView2;
            OKLCH.m(Theme.key_dialogTextGray2, resourcesProvider, textView2, 14.0f);
            if (z) {
                addView(textView2, LayoutHelper.createLinear(-1, -2, 55, 27, 0, 27, 13));
            }
        }
    }

    public final class ItemInner extends AdapterWithDiffUtils.Item {
        public TLRPC.Chat chat;
        public boolean checked;
        public BitmapDrawable drawable;
        public boolean halfChecked;
        public int id;
        public int padHeight;
        public boolean red;
        public int resId;
        public boolean sendAs;
        public int subtractHeight;
        public CharSequence text;
        public Object text2;
        public int type;
        public int typeCount;
        public TLRPC.User user;

        public ItemInner(int i, boolean z) {
            super(i, z);
            this.padHeight = -1;
        }

        public static ItemInner asHeader() {
            return new ItemInner(0, false);
        }

        public static ItemInner asPad() {
            ItemInner itemInner = new ItemInner(-1, false);
            itemInner.subtractHeight = -1;
            return itemInner;
        }

        public static ItemInner asSearchField() {
            return new ItemInner(1, false);
        }

        public static ItemInner asSection() {
            return new ItemInner(2, false);
        }

        public static ItemInner asShadow(CharSequence charSequence) {
            ItemInner itemInner = new ItemInner(6, false);
            itemInner.text = charSequence;
            return itemInner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ItemInner.class != obj.getClass()) {
                return false;
            }
            ItemInner itemInner = (ItemInner) obj;
            int i = this.viewType;
            if (i != itemInner.viewType) {
                return false;
            }
            if (i == -1 && (this.subtractHeight != itemInner.subtractHeight || this.padHeight != itemInner.padHeight)) {
                return false;
            }
            if (i == 3 && (this.user != itemInner.user || this.chat != itemInner.chat || this.type != itemInner.type || this.typeCount != itemInner.typeCount || this.checked != itemInner.checked || this.red != itemInner.red || this.sendAs != itemInner.sendAs)) {
                return false;
            }
            if (i == 0 && this.resId != itemInner.resId) {
                return false;
            }
            if (i == 2 && !TextUtils.equals(this.text, itemInner.text)) {
                return false;
            }
            if (this.viewType == 8 && !TextUtils.equals(this.text, itemInner.text)) {
                return false;
            }
            int i2 = this.viewType;
            if ((i2 == 4 || i2 == 11) && !(TextUtils.equals(this.text, itemInner.text) && TextUtils.equals(this.text2, itemInner.text2))) {
                return false;
            }
            if (this.viewType == 6 && (!TextUtils.equals(this.text, itemInner.text) || this.resId != itemInner.resId)) {
                return false;
            }
            if (this.viewType == 7 && (this.resId != itemInner.resId || !TextUtils.equals(this.text, itemInner.text) || this.checked != itemInner.checked)) {
                return false;
            }
            if (this.viewType != 9 || (this.id == itemInner.id && this.drawable == itemInner.drawable && TextUtils.equals(this.text, itemInner.text) && TextUtils.equals(this.text2, itemInner.text2))) {
                return this.viewType != 10 || this.id == itemInner.id;
            }
            return false;
        }
    }

    public final class Page extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
        public final Adapter adapter;
        public final ArrayList atTop;
        public final ButtonWithCounterView button;
        public final ButtonWithCounterView button2;
        public final ButtonContainer buttonContainer;
        public final LongSparseArray changelog;
        public boolean containsHeader;
        public final FrameLayout contentView;
        public final HeaderCell headerView;
        public boolean isActionBar;
        public final ArrayList items;
        public int keyboardHeight;
        public boolean keyboardMoving;
        public int lastSelectedType;
        public final LinearLayoutManager layoutManager;
        public final RecyclerListView listView;
        public final ArrayList oldItems;
        public int pageType;
        public AlertDialog progressDialog;
        public String query;
        public boolean scrolling;
        public final AnonymousClass1 searchField;
        public ValueAnimator searchFieldAnimator;
        public boolean searchTranslationAnimating;
        public float searchTranslationAnimatingTo;
        public final GraySectionCell sectionCell;
        public final ArrayList selectedUsers;
        public final HashMap selectedUsersByGroup;
        public final View underKeyboardView;
        public long waitingForChatId;
        public boolean wasAtTop;
        public boolean wasKeyboardVisible;

        public final class AnonymousClass1 extends SearchUsersCell {
            public AnonymousClass1(Context context, Theme.ResourcesProvider resourcesProvider, StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1) {
                super(context, resourcesProvider, storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1);
            }

            @Override
            public final void setContainerHeight(float f) {
                super.setContainerHeight(f);
                Page page = Page.this;
                GraySectionCell graySectionCell = page.sectionCell;
                float y = getY();
                FrameLayout frameLayout = page.contentView;
                graySectionCell.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.containerHeight) + (y - (frameLayout == null ? 0 : frameLayout.getPaddingTop()))) - 1.0f);
                FrameLayout frameLayout2 = page.contentView;
                if (frameLayout2 != null) {
                    frameLayout2.invalidate();
                }
            }

            @Override
            public final void setTranslationY(float f) {
                super.setTranslationY(f);
                Page page = Page.this;
                GraySectionCell graySectionCell = page.sectionCell;
                float y = getY();
                FrameLayout frameLayout = page.contentView;
                graySectionCell.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.containerHeight) + (y - (frameLayout == null ? 0 : frameLayout.getPaddingTop()))) - 1.0f);
                FrameLayout frameLayout2 = page.contentView;
                if (frameLayout2 != null) {
                    frameLayout2.invalidate();
                }
            }
        }

        public final class Adapter extends AdapterWithDiffUtils {
            public final Context context;
            public RecyclerListView listView;
            public final Theme.ResourcesProvider resourcesProvider;
            public final AnonymousClass1 searchField;

            public Adapter(Context context, Theme.ResourcesProvider resourcesProvider, AnonymousClass1 anonymousClass1, PeerStoriesView$8$$ExternalSyntheticLambda54 peerStoriesView$8$$ExternalSyntheticLambda54) {
                this.context = context;
                this.resourcesProvider = resourcesProvider;
                this.searchField = anonymousClass1;
            }

            @Override
            public final int getItemCount() {
                ArrayList arrayList = Page.this.items;
                if (arrayList == null) {
                    return 0;
                }
                return arrayList.size();
            }

            @Override
            public final int getItemViewType(int i) {
                Page page = Page.this;
                ArrayList arrayList = page.items;
                if (arrayList == null || i < 0 || i >= arrayList.size()) {
                    return -1;
                }
                return ((ItemInner) page.items.get(i)).viewType;
            }

            @Override
            public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                int i = viewHolder.mItemViewType;
                return (i == 3 && StoryPrivacyBottomSheet.this.canChangePeer) || i == 7 || i == 9 || i == 10;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                int iMax;
                int i2;
                boolean z = true;
                z = true;
                Page page = Page.this;
                ArrayList arrayList = page.items;
                if (arrayList == null || i < 0 || i >= arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = page.items;
                ItemInner itemInner = (ItemInner) arrayList2.get(i);
                int i3 = viewHolder.mItemViewType;
                int i4 = i + 1;
                ItemInner itemInner2 = i4 < arrayList2.size() ? (ItemInner) arrayList2.get(i4) : null;
                boolean z2 = itemInner2 != null && ((i2 = itemInner2.viewType) == i3 || (i2 == 9 && itemInner2.id == 1));
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                View view = viewHolder.itemView;
                if (i3 == 3) {
                    UserCell userCell = (UserCell) view;
                    boolean z3 = itemInner.sendAs;
                    userCell.setIsSendAs(z3, !z3);
                    int i5 = itemInner.type;
                    float f = 1.0f;
                    if (i5 > 0) {
                        userCell.setType(i5, itemInner.user, itemInner.typeCount);
                        userCell.setCheckboxAlpha(1.0f, false);
                    } else {
                        TLRPC.User user = itemInner.user;
                        if (user != null) {
                            userCell.setUser(user);
                            if (itemInner.halfChecked && !itemInner.checked) {
                                f = 0.5f;
                            }
                            userCell.setCheckboxAlpha(f, false);
                        } else {
                            TLRPC.Chat chat = itemInner.chat;
                            if (chat != null) {
                                userCell.setChat(StoryPrivacyBottomSheet.access$9900(storyPrivacyBottomSheet, chat), chat);
                            }
                        }
                    }
                    if (!itemInner.checked && !itemInner.halfChecked) {
                        z = false;
                    }
                    userCell.setChecked(z, false);
                    userCell.setDivider(z2);
                    userCell.setRedCheckbox(itemInner.red);
                    userCell.drawArrow = storyPrivacyBottomSheet.canChangePeer;
                    return;
                }
                if (i3 == 2) {
                    return;
                }
                if (i3 == 0) {
                    view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
                    return;
                }
                if (i3 == -1) {
                    if (itemInner.subtractHeight > 0) {
                        RecyclerListView recyclerListView = this.listView;
                        iMax = Math.max(((recyclerListView == null || recyclerListView.getMeasuredHeight() <= 0) ? AndroidUtilities.displaySize.y : this.listView.getMeasuredHeight() + page.keyboardHeight) - itemInner.subtractHeight, AndroidUtilities.dp(120.0f));
                        view.setTag(33);
                    } else {
                        iMax = itemInner.padHeight;
                        if (iMax >= 0) {
                            view.setTag(null);
                        } else {
                            iMax = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new RecyclerView.LayoutParams(-1, iMax));
                    return;
                }
                if (i3 == 1) {
                    view.setLayoutParams(new RecyclerView.LayoutParams(-1, Math.min(AndroidUtilities.dp(150.0f), this.searchField.resultContainerHeight)));
                    return;
                }
                if (i3 == 4) {
                    HeaderCell2 headerCell2 = (HeaderCell2) view;
                    CharSequence charSequence = itemInner.text;
                    ?? r0 = itemInner.text2;
                    headerCell2.titleTextView.setText(charSequence);
                    headerCell2.subtitleTextView.setText((CharSequence) r0);
                    return;
                }
                if (i3 == 11) {
                    HeaderCell2 headerCell3 = (HeaderCell2) view;
                    headerCell3.titleTextView.setText(itemInner.text);
                    headerCell3.subtitleTextView.setText((CharSequence) null);
                    return;
                }
                if (i3 == 5) {
                    try {
                        ((StickerEmptyView) view).stickerView.getImageReceiver().startAnimation();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                if (i3 == 6) {
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                    if (itemInner.text == null) {
                        textInfoPrivacyCell.setFixedSize(12);
                        textInfoPrivacyCell.setText(null);
                        return;
                    } else {
                        textInfoPrivacyCell.setFixedSize(0);
                        textInfoPrivacyCell.setText(itemInner.text);
                        return;
                    }
                }
                if (i3 == 7) {
                    int i6 = itemInner.resId;
                    if (i6 == 0) {
                        ((TextCell) view).setTextAndCheck(itemInner.text, storyPrivacyBottomSheet.allowScreenshots, z2);
                        return;
                    } else if (i6 == 1) {
                        ((TextCell) view).setTextAndCheck(itemInner.text, storyPrivacyBottomSheet.keepOnMyPage, z2);
                        return;
                    } else {
                        if (i6 == 2) {
                            ((TextCell) view).setTextAndCheck(itemInner.text, storyPrivacyBottomSheet.allowComments, z2);
                            return;
                        }
                        return;
                    }
                }
                if (i3 == 9) {
                    BitmapDrawable bitmapDrawable = itemInner.drawable;
                    if (bitmapDrawable != null) {
                        ((TextCell) view).setTextAndValueDrawable(itemInner.text, bitmapDrawable, z2);
                        return;
                    } else {
                        ((TextCell) view).setTextAndValue(itemInner.text, itemInner.text2, false, z2);
                        return;
                    }
                }
                if (i3 == 8) {
                    ((org.telegram.ui.Cells.HeaderCell) view).setText(itemInner.text);
                    return;
                }
                if (i3 == 10) {
                    int i7 = (int) MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).starsPaidMessageAmountMax;
                    int[] iArrCut = SlideIntChooseView.cut(i7, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int iClamp = Utilities.clamp(storyPrivacyBottomSheet.commentsPrice, i7, 0);
                    TopicsFragment$$ExternalSyntheticLambda25 topicsFragment$$ExternalSyntheticLambda25 = new TopicsFragment$$ExternalSyntheticLambda25(true ? 1 : 0);
                    SlideIntChooseView.Options options = new SlideIntChooseView.Options();
                    options.steps = iArrCut;
                    options.betweenSteps = 20;
                    options.toString = topicsFragment$$ExternalSyntheticLambda25;
                    ((SlideIntChooseView) view).set(iClamp, options, new VoIPFragment$$ExternalSyntheticLambda7(this, 19));
                }
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                TextCell textCell;
                View slideIntChooseView;
                View headerCell2;
                Context context = this.context;
                if (i == -1) {
                    slideIntChooseView = new PadView(context);
                } else if (i == 0) {
                    View view = new View(context);
                    view.setTag(35);
                    slideIntChooseView = view;
                } else if (i == 1) {
                    View view2 = new View(context);
                    view2.setTag(34);
                    slideIntChooseView = view2;
                } else {
                    Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                    if (i == 3) {
                        slideIntChooseView = new UserCell(context, resourcesProvider);
                    } else {
                        if (i == 4) {
                            headerCell2 = new HeaderCell2(context, resourcesProvider, true);
                        } else if (i == 11) {
                            slideIntChooseView = new HeaderCell2(context, resourcesProvider, false);
                        } else if (i == 8) {
                            org.telegram.ui.Cells.HeaderCell headerCell = new org.telegram.ui.Cells.HeaderCell(context, resourcesProvider);
                            headerCell.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
                            slideIntChooseView = headerCell;
                        } else if (i == 5) {
                            StickerEmptyView stickerEmptyView = new StickerEmptyView(1, resourcesProvider, context, null);
                            stickerEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
                            stickerEmptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                            stickerEmptyView.linearLayout.setTranslationY(AndroidUtilities.dp(24.0f));
                            headerCell2 = stickerEmptyView;
                        } else if (i == 6) {
                            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, resourcesProvider);
                            textInfoPrivacyCell.setBackgroundColor(-15921907);
                            slideIntChooseView = textInfoPrivacyCell;
                        } else {
                            if (i == 7) {
                                textCell = new TextCell(23, this.context, this.resourcesProvider, true, true);
                            } else if (i == 9) {
                                textCell = new TextCell(23, this.context, this.resourcesProvider, true, false);
                            } else {
                                slideIntChooseView = i == 10 ? new SlideIntChooseView(context, resourcesProvider) : new PaymentFormActivity.AnonymousClass2(context, 27);
                            }
                            slideIntChooseView = textCell;
                        }
                        slideIntChooseView = headerCell2;
                    }
                }
                return new RecyclerListView.Holder(slideIntChooseView);
            }
        }

        public final class ButtonContainer extends LinearLayout {
            public final AnimatedFloat alpha;
            public ValueAnimator animator;
            public final Paint dividerPaint;
            public ValueAnimator hideAnimator;
            public float translationY;
            public float translationY2;

            public ButtonContainer(Context context) {
                super(context);
                this.dividerPaint = new Paint(1);
                this.alpha = new AnimatedFloat(this);
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                Paint paint = this.dividerPaint;
                int i = Theme.key_windowBackgroundGray;
                Page page = Page.this;
                paint.setColor(Theme.getColor(i, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider));
                paint.setAlpha((int) (this.alpha.set(page.listView.canScrollVertically(1) ? 1.0f : 0.0f, false) * 255.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
            }

            public final void hide(boolean z, boolean z2) {
                ValueAnimator valueAnimator = this.hideAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (!z2) {
                    setVisibility(z ? 8 : 0);
                    float measuredHeight = z ? getMeasuredHeight() : 0.0f;
                    this.translationY2 = measuredHeight;
                    super.setTranslationY(measuredHeight + this.translationY);
                    return;
                }
                setVisibility(0);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.translationY2, z ? getMeasuredHeight() : 0.0f);
                this.hideAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new StoryPrivacyBottomSheet$Page$ButtonContainer$$ExternalSyntheticLambda0(this, 0));
                this.hideAnimator.addListener(new TodoItemMenu.AnonymousClass15(12, this, z));
                this.hideAnimator.setDuration(320L);
                this.hideAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.hideAnimator.start();
            }

            public final void lambda$hide$0(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.translationY2 = fFloatValue;
                super.setTranslationY(fFloatValue + this.translationY);
            }

            public final void lambda$translateY$1(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = this.translationY2;
                this.translationY = fFloatValue;
                super.setTranslationY(f + fFloatValue);
            }

            @Override
            public final void setTranslationY(float f) {
                float f2 = this.translationY2;
                this.translationY = f;
                super.setTranslationY(f2 + f);
            }
        }

        public final class PadView extends View {
        }

        public Page(Context context) {
            super(context);
            this.changelog = new LongSparseArray();
            this.selectedUsers = new ArrayList();
            this.selectedUsersByGroup = new HashMap();
            this.atTop = new ArrayList();
            this.oldItems = new ArrayList();
            this.items = new ArrayList();
            this.lastSelectedType = -1;
            GraySectionCell graySectionCell = new GraySectionCell(context, 16, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider);
            this.sectionCell = graySectionCell;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider, new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1(this, 4));
            this.searchField = anonymousClass1;
            int i = Theme.key_dialogBackground;
            anonymousClass1.setBackgroundColor(StoryPrivacyBottomSheet.this.getThemedColor(i));
            anonymousClass1.setOnSearchTextChange(new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda6(this, 0));
            HeaderCell headerCell = new HeaderCell(context, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider);
            this.headerView = headerCell;
            headerCell.onCloseClickListener = new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1(this, 5);
            FrameLayout frameLayout = new FrameLayout(context);
            this.contentView = frameLayout;
            frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
            frameLayout.setClipToPadding(true);
            addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
            RecyclerListView recyclerListView = new RecyclerListView(context, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider);
            this.listView = recyclerListView;
            recyclerListView.setClipToPadding(false);
            recyclerListView.setTranslateSelector(true);
            Adapter adapter = new Adapter(context, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider, anonymousClass1, new PeerStoriesView$8$$ExternalSyntheticLambda54(StoryPrivacyBottomSheet.this, 2));
            this.adapter = adapter;
            recyclerListView.setAdapter(adapter);
            adapter.listView = recyclerListView;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
            this.layoutManager = linearLayoutManager;
            recyclerListView.setLayoutManager(linearLayoutManager);
            recyclerListView.setOnScrollListener(new CacheControlActivity.AnonymousClass5(this, 2));
            recyclerListView.setOnItemClickListener(new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(24, this, context));
            frameLayout.addView(recyclerListView, LayoutHelper.createFrame(-1.0f, -1));
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
                @Override
                public final boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder) {
                    return true;
                }

                @Override
                public final void onAddAnimationUpdate() {
                    Page page = Page.this;
                    ((BottomSheet) StoryPrivacyBottomSheet.this).containerView.invalidate();
                    page.contentView.invalidate();
                }

                @Override
                public final void onChangeAnimationUpdate() {
                    Page page = Page.this;
                    ((BottomSheet) StoryPrivacyBottomSheet.this).containerView.invalidate();
                    page.contentView.invalidate();
                }

                @Override
                public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    Page page = Page.this;
                    ((BottomSheet) StoryPrivacyBottomSheet.this).containerView.invalidate();
                    page.contentView.invalidate();
                    page.listView.invalidate();
                }

                @Override
                public final void onRemoveAnimationUpdate() {
                    Page page = Page.this;
                    ((BottomSheet) StoryPrivacyBottomSheet.this).containerView.invalidate();
                    page.contentView.invalidate();
                }
            };
            defaultItemAnimator.setDurations(350L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.delayAnimations = false;
            defaultItemAnimator.mSupportsChangeAnimations = false;
            recyclerListView.setItemAnimator(defaultItemAnimator);
            frameLayout.addView(anonymousClass1, LayoutHelper.createFrame(-1, -2, 55));
            frameLayout.addView(graySectionCell, LayoutHelper.createFrame(-1, 32, 55));
            addView(headerCell, LayoutHelper.createFrame(-1, -2, 55));
            ButtonContainer buttonContainer = new ButtonContainer(context);
            this.buttonContainer = buttonContainer;
            buttonContainer.setClickable(true);
            buttonContainer.setOrientation(1);
            buttonContainer.setPadding(((BottomSheet) StoryPrivacyBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((BottomSheet) StoryPrivacyBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            buttonContainer.setBackgroundColor(Theme.getColor(i, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider, true);
            this.button = buttonWithCounterView;
            buttonWithCounterView.setOnClickListener(new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda3(this, 1));
            buttonWithCounterView.setRoundRadius(24);
            buttonContainer.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 87));
            ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider, false);
            this.button2 = buttonWithCounterView2;
            buttonWithCounterView2.setOnClickListener(new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda3(this, 2));
            buttonWithCounterView2.setRoundRadius(24);
            buttonContainer.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 87, 0, 8, 0, 0));
            View view = new View(context);
            this.underKeyboardView = view;
            view.setBackgroundColor(Theme.getColor(i, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider));
            addView(view, LayoutHelper.createFrame(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
            addView(buttonContainer, LayoutHelper.createFrame(-1, -2, 87));
        }

        public final void applyBlocklist(boolean z) {
            if (this.pageType != 6) {
                return;
            }
            ArrayList arrayList = this.selectedUsers;
            arrayList.clear();
            arrayList.addAll(MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).getStoriesController().blocklist);
            int i = 0;
            while (true) {
                LongSparseArray longSparseArray = this.changelog;
                if (i >= longSparseArray.size()) {
                    break;
                }
                long jKeyAt = longSparseArray.keyAt(i);
                if (!((Boolean) longSparseArray.valueAt(i)).booleanValue()) {
                    arrayList.remove(Long.valueOf(jKeyAt));
                } else if (!arrayList.contains(Long.valueOf(jKeyAt))) {
                    arrayList.add(Long.valueOf(jKeyAt));
                }
                i++;
            }
            if (z) {
                updateItems(true, true);
                updateButton(true);
                updateCheckboxes$1(true);
            }
        }

        public final void bind(int i) {
            this.pageType = i;
            this.changelog.clear();
            ArrayList arrayList = this.selectedUsers;
            arrayList.clear();
            HashMap map = this.selectedUsersByGroup;
            map.clear();
            StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
            if (i == 4) {
                arrayList.addAll(storyPrivacyBottomSheet.excludedEveryone);
                map.putAll(storyPrivacyBottomSheet.excludedEveryoneByGroup);
            } else if (i == 5) {
                arrayList.addAll(storyPrivacyBottomSheet.messageUsers);
            } else if (i == 1) {
                ArrayList arrayListAccess$6500 = StoryPrivacyBottomSheet.access$6500(storyPrivacyBottomSheet);
                for (int iM = 0; iM < arrayListAccess$6500.size(); iM = MessagesController$$ExternalSyntheticOutline2.m(((TLRPC.User) arrayListAccess$6500.get(iM)).id, arrayList, iM, 1)) {
                }
            } else if (i == 2) {
                arrayList.addAll(storyPrivacyBottomSheet.excludedContacts);
            } else if (i == 3) {
                arrayList.addAll(storyPrivacyBottomSheet.selectedContacts);
                map.putAll(storyPrivacyBottomSheet.selectedContactsByGroup);
            } else if (i == 6) {
                applyBlocklist(false);
            }
            LinearLayoutManager linearLayoutManager = this.layoutManager;
            this.adapter.getClass();
            linearLayoutManager.setReverseLayout(false);
            updateSpans(false);
            AnonymousClass1 anonymousClass1 = this.searchField;
            anonymousClass1.setText("");
            anonymousClass1.setVisibility(i == 0 ? 8 : 0);
            anonymousClass1.scroll = true;
            this.query = null;
            updateItems(false, true);
            updateButton(false);
            updateCheckboxes$1(false);
            int i2 = this.pageType;
            RecyclerListView recyclerListView = this.listView;
            if (i2 != 0) {
                recyclerListView.scrollToPosition(0);
            }
            recyclerListView.requestLayout();
            this.lastSelectedType = -1;
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            TLRPC.ChatFull chatFull;
            AlertDialog alertDialog;
            if (i != NotificationCenter.chatInfoDidLoad || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (alertDialog = this.progressDialog) == null || this.waitingForChatId != chatFull.id) {
                return;
            }
            alertDialog.dismissUnless(350L);
            this.progressDialog = null;
            this.waitingForChatId = -1L;
            selectChat(chatFull.id, chatFull.participants);
        }

        public final float getSearchFieldTop() {
            int i = 0;
            float f = -BotFullscreenButtons$$ExternalSyntheticOutline1.m(Math.min(AndroidUtilities.dp(150.0f), this.searchField.resultContainerHeight), 150.0f, 0);
            while (true) {
                RecyclerListView recyclerListView = this.listView;
                if (i >= recyclerListView.getChildCount()) {
                    return f;
                }
                View childAt = recyclerListView.getChildAt(i);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                    return Math.max(f, childAt.getY());
                }
                i++;
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        }

        @Override
        public final void onClick(View view) {
            AnonymousClass1 anonymousClass1 = this.searchField;
            if (!anonymousClass1.allSpans.contains(view)) {
                return;
            }
            GroupCreateSpan groupCreateSpan = (GroupCreateSpan) view;
            if (!groupCreateSpan.deleting) {
                GroupCreateSpan groupCreateSpan2 = anonymousClass1.currentDeletingSpan;
                if (groupCreateSpan2 != null) {
                    groupCreateSpan2.cancelDeleteAnimation();
                    anonymousClass1.currentDeletingSpan = null;
                }
                anonymousClass1.currentDeletingSpan = groupCreateSpan;
                groupCreateSpan.startDeleteAnimation();
                return;
            }
            anonymousClass1.currentDeletingSpan = null;
            SearchUsersCell.SpansContainer spansContainer = anonymousClass1.spansContainer;
            SearchUsersCell searchUsersCell = (SearchUsersCell) spansContainer.this$0;
            searchUsersCell.ignoreScrollEvent = true;
            searchUsersCell.allSpans.remove(groupCreateSpan);
            groupCreateSpan.setOnClickListener(null);
            spansContainer.setupEndValues();
            spansContainer.animationStarted = false;
            AnimatorSet animatorSet = new AnimatorSet();
            spansContainer.currentAnimation = animatorSet;
            animatorSet.addListener(new QrActivity.AnonymousClass4(20, spansContainer, groupCreateSpan));
            ArrayList arrayList = spansContainer.removingSpans;
            arrayList.clear();
            arrayList.add(groupCreateSpan);
            ArrayList arrayList2 = spansContainer.animAddingSpans;
            arrayList2.clear();
            spansContainer.animRemovingSpans.clear();
            arrayList2.add(groupCreateSpan);
            ArrayList arrayList3 = spansContainer.animators;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 1.0f, 0.0f));
            spansContainer.requestLayout();
            long uid = groupCreateSpan.getUid();
            Iterator it = this.selectedUsersByGroup.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                ArrayList arrayList4 = this.selectedUsers;
                if (!zHasNext) {
                    arrayList4.remove(Long.valueOf(uid));
                    updateCheckboxes$1(true);
                    updateButton(true);
                    return;
                } else {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((ArrayList) entry.getValue()).contains(Long.valueOf(uid))) {
                        it.remove();
                        arrayList4.addAll((Collection) entry.getValue());
                        arrayList4.remove(Long.valueOf(uid));
                    }
                }
            }
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int i3 = 0;
            StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
            if (((BottomSheet) storyPrivacyBottomSheet).keyboardHeight > 0) {
                this.keyboardHeight = ((BottomSheet) storyPrivacyBottomSheet).keyboardHeight;
            }
            super.onMeasure(i, i2);
            this.contentView.setPadding(0, AndroidUtilities.statusBarHeight + (this.pageType == 0 ? 0 : AndroidUtilities.dp(56.0f)), 0, 0);
            boolean z = this.wasKeyboardVisible;
            boolean z2 = ((BottomSheet) storyPrivacyBottomSheet).keyboardVisible;
            RecyclerListView recyclerListView = this.listView;
            ButtonContainer buttonContainer = this.buttonContainer;
            if (z != z2) {
                float searchFieldTop = getSearchFieldTop();
                if (((BottomSheet) storyPrivacyBottomSheet).keyboardVisible && searchFieldTop + Math.min(AndroidUtilities.dp(150.0f), this.searchField.resultContainerHeight) > recyclerListView.getPaddingTop()) {
                    LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(getContext(), 2, 0.7f);
                    linearSmoothScrollerCustom.mTargetPosition = 1;
                    linearSmoothScrollerCustom.offset = -AndroidUtilities.dp(56.0f);
                    this.layoutManager.startSmoothScroll(linearSmoothScrollerCustom);
                }
                int i4 = this.pageType;
                View view = this.underKeyboardView;
                if (i4 == 0) {
                    buttonContainer.setTranslationY(((BottomSheet) storyPrivacyBottomSheet).keyboardVisible ? this.keyboardHeight : 0.0f);
                    view.setTranslationY(((BottomSheet) storyPrivacyBottomSheet).keyboardVisible ? this.keyboardHeight : 0.0f);
                } else {
                    float f = ((BottomSheet) storyPrivacyBottomSheet).keyboardVisible ? this.keyboardHeight : -this.keyboardHeight;
                    ValueAnimator valueAnimator = buttonContainer.animator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        buttonContainer.animator = null;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
                    buttonContainer.animator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new StoryPrivacyBottomSheet$Page$ButtonContainer$$ExternalSyntheticLambda0(buttonContainer, 1));
                    buttonContainer.animator.addListener(new WebviewActivity.AnonymousClass3.AnonymousClass1(buttonContainer, 6));
                    buttonContainer.animator.setDuration(250L);
                    ValueAnimator valueAnimator2 = buttonContainer.animator;
                    CubicBezierInterpolator cubicBezierInterpolator = AdjustPanLayoutHelper.keyboardInterpolator;
                    valueAnimator2.setInterpolator(cubicBezierInterpolator);
                    buttonContainer.animator.start();
                    view.setTranslationY(((BottomSheet) storyPrivacyBottomSheet).keyboardVisible ? this.keyboardHeight : -this.keyboardHeight);
                    this.keyboardMoving = true;
                    view.animate().translationY(0.0f).setDuration(250L).setInterpolator(cubicBezierInterpolator).withEndAction(new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1(this, i3)).start();
                }
                this.wasKeyboardVisible = ((BottomSheet) storyPrivacyBottomSheet).keyboardVisible;
            }
            recyclerListView.setPadding(0, 0, 0, buttonContainer.getMeasuredHeight());
        }

        public final void selectChat(long j, TLRPC.ChatParticipants chatParticipants) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i = this.pageType;
            int i2 = 0;
            boolean z = i == 1 || i == 2;
            StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
            if (chatParticipants != null && chatParticipants.participants != null) {
                for (int i3 = 0; i3 < chatParticipants.participants.size(); i3++) {
                    long j2 = chatParticipants.participants.get(i3).user_id;
                    TLRPC.User user = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).getUser(Long.valueOf(j2));
                    if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.id != 777000 && j2 != 0) {
                        if (!z || user.contact) {
                            arrayList.add(Long.valueOf(j2));
                        } else {
                            arrayList2.add(Long.valueOf(j2));
                        }
                        this.selectedUsers.remove(Long.valueOf(j2));
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                this.selectedUsersByGroup.put(Long.valueOf(j), arrayList);
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    this.changelog.put(Boolean.TRUE, ((Long) obj).longValue());
                }
                updateSpans(true);
                updateButton(true);
                updateCheckboxes$1(true);
                this.searchField.scroll = true;
                return;
            }
            if (arrayList.isEmpty()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider);
                builder.alertDialog.message = "All group members are not in your contact list.";
                builder.setNegativeButton("Cancel", null);
                builder.show();
                return;
            }
            AlertDialog.Builder builder2 = new AlertDialog.Builder(getContext(), 0, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider);
            builder2.alertDialog.message = arrayList2.size() + " members are not in your contact list";
            builder2.setPositiveButton("Add " + arrayList.size() + " contacts", new ProfileActivity$$ExternalSyntheticLambda22(this, j, arrayList, 10));
            builder2.setNegativeButton("Cancel", null);
            builder2.show();
        }

        public final void updateButton(boolean z) {
            int i = this.pageType;
            ButtonWithCounterView buttonWithCounterView = this.button2;
            ButtonWithCounterView buttonWithCounterView2 = this.button;
            StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
            int i2 = 0;
            if (i == 0) {
                buttonWithCounterView2.setShowZero(false);
                buttonWithCounterView2.setEnabled(true);
                buttonWithCounterView2.setCount(0, z);
                if (storyPrivacyBottomSheet.liveSettings || storyPrivacyBottomSheet.isEdit) {
                    buttonWithCounterView2.setText(LocaleController.getString(R.string.StoryPrivacyButtonSave), z, true);
                } else {
                    int i3 = storyPrivacyBottomSheet.storiesCount;
                    if (i3 == 1) {
                        buttonWithCounterView2.setText(LocaleController.getString(storyPrivacyBottomSheet.isLive ? R.string.StoryLivePrivacyButtonPost : R.string.StoryPrivacyButtonPost), z, true);
                    } else {
                        buttonWithCounterView2.setText(LocaleController.formatPluralStringComma("StoryPrivacyButtonPostMultiple", i3), z, true);
                    }
                }
                buttonWithCounterView.setVisibility(8);
                return;
            }
            ArrayList arrayList = this.selectedUsers;
            if (i == 1) {
                buttonWithCounterView2.setShowZero(false);
                buttonWithCounterView2.setEnabled(true);
                buttonWithCounterView2.setText(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z, true);
                buttonWithCounterView2.setCount(arrayList.size(), z);
                buttonWithCounterView.setVisibility(8);
                return;
            }
            ButtonContainer buttonContainer = this.buttonContainer;
            if (i == 3) {
                int i4 = StoryPrivacyBottomSheet.$r8$clinit;
                storyPrivacyBottomSheet.getClass();
                int size = StoryPrivacyBottomSheet.mergeUsers(arrayList, this.selectedUsersByGroup).size();
                storyPrivacyBottomSheet.selectedContactsCount = size;
                buttonWithCounterView2.setText(LocaleController.getString(R.string.StoryPrivacyButtonSave), z, true);
                buttonWithCounterView2.setShowZero(false);
                buttonContainer.hide(size <= 0, z);
                buttonWithCounterView2.setCount(size, z);
                buttonWithCounterView2.setEnabled(size > 0);
                buttonWithCounterView.setVisibility(8);
                return;
            }
            if (i == 2) {
                buttonWithCounterView2.setShowZero(false);
                buttonWithCounterView2.setEnabled(true);
                if (arrayList.isEmpty()) {
                    buttonWithCounterView2.setText(LocaleController.getString(R.string.StoryPrivacyButtonSave), z, true);
                    buttonWithCounterView2.setCount(0, z);
                } else {
                    buttonWithCounterView2.setText(LocaleController.getString(R.string.StoryPrivacyButtonExcludeContacts), z, true);
                    buttonWithCounterView2.setCount(arrayList.size(), z);
                }
                buttonWithCounterView.setVisibility(8);
                return;
            }
            if (i == 5) {
                buttonWithCounterView2.setShowZero(true);
                buttonWithCounterView2.setEnabled(!arrayList.isEmpty());
                buttonWithCounterView2.setCount(arrayList.size(), z);
                buttonWithCounterView.setVisibility(8);
                return;
            }
            if (i != 6) {
                if (i == 4) {
                    int size2 = StoryPrivacyBottomSheet.mergeUsers(storyPrivacyBottomSheet.excludedEveryone, storyPrivacyBottomSheet.excludedEveryoneByGroup).size();
                    storyPrivacyBottomSheet.excludedEveryoneCount = size2;
                    buttonWithCounterView2.setText(LocaleController.getString(R.string.StoryPrivacyButtonSave), z, true);
                    buttonWithCounterView2.setShowZero(false);
                    buttonContainer.hide(false, z);
                    buttonWithCounterView2.setCount(size2, z);
                    buttonWithCounterView2.setEnabled(true);
                    buttonWithCounterView.setVisibility(8);
                    return;
                }
                return;
            }
            buttonWithCounterView2.setShowZero(false);
            buttonWithCounterView2.setEnabled(true);
            buttonWithCounterView2.setText(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z, true);
            StoriesController storiesController = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).getStoriesController();
            if (!storiesController.blocklistFull) {
                while (true) {
                    LongSparseArray longSparseArray = this.changelog;
                    if (i2 >= longSparseArray.size()) {
                        break;
                    }
                    long jKeyAt = longSparseArray.keyAt(i2);
                    ((Boolean) longSparseArray.valueAt(i2)).getClass();
                    storiesController.blocklist.contains(Long.valueOf(jKeyAt));
                    i2++;
                }
            } else {
                buttonWithCounterView2.setCount(arrayList.size(), z);
            }
            buttonWithCounterView.setVisibility(8);
        }

        public final void updateCheckboxes$1(boolean z) {
            ArrayList arrayList;
            int childAdapterPosition;
            int i = this.pageType;
            HashMap map = this.selectedUsersByGroup;
            ArrayList arrayList2 = this.selectedUsers;
            StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
            if (i == 4) {
                storyPrivacyBottomSheet.excludedEveryone.clear();
                HashMap map2 = storyPrivacyBottomSheet.excludedEveryoneByGroup;
                map2.clear();
                storyPrivacyBottomSheet.excludedEveryone.addAll(arrayList2);
                map2.putAll(map);
            } else if (i == 2) {
                storyPrivacyBottomSheet.excludedContacts.clear();
                storyPrivacyBottomSheet.excludedContacts.addAll(arrayList2);
            } else if (i == 3) {
                storyPrivacyBottomSheet.selectedContacts.clear();
                HashMap map3 = storyPrivacyBottomSheet.selectedContactsByGroup;
                map3.clear();
                storyPrivacyBottomSheet.selectedContacts.addAll(arrayList2);
                map3.putAll(map);
            } else if (i == 0) {
                storyPrivacyBottomSheet.messageUsers.clear();
                storyPrivacyBottomSheet.messageUsers.addAll(arrayList2);
            }
            if (this.pageType == 3 && (storyPrivacyBottomSheet.selectedType != 3 || (arrayList2.isEmpty() && map.isEmpty()))) {
                if (arrayList2.isEmpty() && map.isEmpty()) {
                    int i2 = this.lastSelectedType;
                    if (i2 != -1) {
                        storyPrivacyBottomSheet.selectedType = i2;
                    }
                } else {
                    this.lastSelectedType = storyPrivacyBottomSheet.selectedType;
                    storyPrivacyBottomSheet.selectedType = 3;
                }
            }
            int i3 = StoryPrivacyBottomSheet.$r8$clinit;
            storyPrivacyBottomSheet.getClass();
            HashSet hashSetMergeUsers = StoryPrivacyBottomSheet.mergeUsers(arrayList2, map);
            int i4 = 0;
            while (true) {
                arrayList = this.items;
                if (i4 >= arrayList.size()) {
                    break;
                }
                ItemInner itemInner = (ItemInner) arrayList.get(i4);
                if (itemInner != null) {
                    int i5 = itemInner.type;
                    if (i5 > 0) {
                        itemInner.checked = storyPrivacyBottomSheet.selectedType == i5;
                        itemInner.halfChecked = false;
                    } else {
                        TLRPC.User user = itemInner.user;
                        if (user != null) {
                            boolean zContains = arrayList2.contains(Long.valueOf(user.id));
                            itemInner.checked = zContains;
                            itemInner.halfChecked = !zContains && hashSetMergeUsers.contains(Long.valueOf(itemInner.user.id));
                        } else {
                            TLRPC.Chat chat = itemInner.chat;
                            if (chat != null) {
                                itemInner.checked = map.containsKey(Long.valueOf(chat.id));
                                itemInner.halfChecked = false;
                            }
                        }
                    }
                }
                i4++;
            }
            int i6 = 0;
            while (true) {
                RecyclerListView recyclerListView = this.listView;
                if (i6 >= recyclerListView.getChildCount()) {
                    updateSectionCell(z);
                    return;
                }
                View childAt = recyclerListView.getChildAt(i6);
                if ((childAt instanceof UserCell) && (childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt)) >= 0 && childAdapterPosition < arrayList.size() && ((UserCell) childAt) != null) {
                    ItemInner itemInner2 = (ItemInner) arrayList.get(childAdapterPosition);
                    UserCell userCell = (UserCell) childAt;
                    userCell.setChecked(itemInner2.checked || itemInner2.halfChecked, z);
                    TLRPC.Chat chat2 = itemInner2.chat;
                    float f = 1.0f;
                    if (chat2 != null) {
                        userCell.setCheckboxAlpha(StoryPrivacyBottomSheet.access$9900(storyPrivacyBottomSheet, chat2) > 200 ? 0.3f : 1.0f, z);
                    } else {
                        if (itemInner2.halfChecked && !itemInner2.checked) {
                            f = 0.5f;
                        }
                        userCell.setCheckboxAlpha(f, z);
                    }
                }
                i6++;
            }
        }

        public final void updateItems(boolean z, boolean z2) {
            float f;
            float fDp;
            float fDp2;
            boolean zIsEmpty;
            StoryPrivacyBottomSheet storyPrivacyBottomSheet;
            Adapter adapter;
            String lowerCase;
            int i;
            boolean z3;
            boolean z4;
            ArrayList arrayListAccess$9200;
            ArrayList arrayList;
            HashMap map;
            ArrayList arrayList2;
            int i2;
            boolean z5;
            int i3;
            RecyclerListView recyclerListView;
            float fDp3;
            float f2;
            int i4;
            TLObject tLObject;
            int i5;
            TLRPC.Chat chat;
            String lowerCase2;
            String lowerCase3;
            ArrayList<TLRPC.TL_username> arrayList3;
            int i6;
            TLRPC.TL_username tL_username;
            boolean z6;
            String lowerCase4;
            String str;
            int i7;
            boolean z7;
            boolean zContains;
            boolean z8;
            int i8;
            boolean z9;
            int i9;
            int i10;
            TLObject tLObject2;
            boolean z10;
            float f3;
            int i11;
            int i12;
            StoryPrivacyBottomSheet storyPrivacyBottomSheet2;
            int i13;
            int i14;
            boolean z11;
            int iDp;
            boolean zContains2;
            boolean z12;
            int i15;
            boolean z13;
            int i16;
            TLObject tLObject3;
            boolean zContainsKey;
            boolean z14;
            boolean zIsChannelAndNotMegaGroup;
            int i17;
            int i18;
            String pluralString;
            float f4;
            boolean z15;
            boolean z16;
            String str2;
            int i19;
            String pluralString2;
            int i20;
            TLRPC.InputPeer inputPeer;
            long clientUserId;
            StringBuilder sb;
            HashSet hashSet;
            Iterator it;
            StoriesController.StoryAlbum storyAlbumFindById;
            String pluralString3;
            int i21;
            ArrayList arrayList4 = this.oldItems;
            arrayList4.clear();
            ArrayList arrayList5 = this.items;
            arrayList4.addAll(arrayList5);
            arrayList5.clear();
            int i22 = this.pageType;
            GraySectionCell graySectionCell = this.sectionCell;
            StoryPrivacyBottomSheet storyPrivacyBottomSheet3 = StoryPrivacyBottomSheet.this;
            if (i22 != 0) {
                f = 56.0f;
                HeaderCell headerCell = this.headerView;
                if (i22 == 1) {
                    headerCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsTitle));
                    headerCell.setCloseImageVisible(true);
                    headerCell.backDrawable.setRotation(0.0f, false);
                    arrayList5.add(ItemInner.asPad());
                    arrayList5.add(ItemInner.asHeader());
                    float fDp4 = AndroidUtilities.dp(56.0f) + 0.0f;
                    arrayList5.size();
                    arrayList5.add(ItemInner.asSearchField());
                    float fDp5 = fDp4 + AndroidUtilities.dp(150.0f);
                    arrayList5.add(ItemInner.asSection());
                    fDp2 = fDp5 + AndroidUtilities.dp(32.0f);
                    graySectionCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsSubtitle));
                    updateSectionCell(z);
                    this.containsHeader = true;
                } else if (i22 == 2) {
                    headerCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsTitle));
                    headerCell.setCloseImageVisible(true);
                    headerCell.backDrawable.setRotation(0.0f, false);
                    arrayList5.add(ItemInner.asPad());
                    arrayList5.add(ItemInner.asHeader());
                    float fDp6 = AndroidUtilities.dp(56.0f) + 0.0f;
                    arrayList5.size();
                    arrayList5.add(ItemInner.asSearchField());
                    float fDp7 = fDp6 + AndroidUtilities.dp(150.0f);
                    arrayList5.add(ItemInner.asSection());
                    fDp2 = fDp7 + AndroidUtilities.dp(32.0f);
                    graySectionCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsSubtitle));
                    updateSectionCell(z);
                    this.containsHeader = true;
                } else if (i22 == 3) {
                    headerCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsTitle));
                    headerCell.setCloseImageVisible(true);
                    headerCell.backDrawable.setRotation(0.0f, false);
                    arrayList5.add(ItemInner.asPad());
                    arrayList5.add(ItemInner.asHeader());
                    float fDp8 = AndroidUtilities.dp(56.0f) + 0.0f;
                    arrayList5.size();
                    arrayList5.add(ItemInner.asSearchField());
                    float fDp9 = fDp8 + AndroidUtilities.dp(150.0f);
                    arrayList5.add(ItemInner.asSection());
                    fDp2 = fDp9 + AndroidUtilities.dp(32.0f);
                    graySectionCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsSubtitle));
                    updateSectionCell(z);
                    this.containsHeader = true;
                } else {
                    if (i22 != 5) {
                        if (i22 == 6) {
                            headerCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistTitle));
                            headerCell.setCloseImageVisible(true);
                            headerCell.backDrawable.setRotation(0.0f, false);
                            arrayList5.add(ItemInner.asPad());
                            arrayList5.add(ItemInner.asHeader());
                            float fDp10 = AndroidUtilities.dp(56.0f) + 0.0f;
                            arrayList5.size();
                            arrayList5.add(ItemInner.asSearchField());
                            float fDp11 = fDp10 + AndroidUtilities.dp(150.0f);
                            arrayList5.add(ItemInner.asSection());
                            fDp2 = fDp11 + AndroidUtilities.dp(32.0f);
                            graySectionCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistSubtitle));
                            updateSectionCell(z);
                            this.containsHeader = true;
                        } else if (i22 == 4) {
                            headerCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneTitle));
                            headerCell.setCloseImageVisible(true);
                            headerCell.backDrawable.setRotation(0.0f, false);
                            arrayList5.add(ItemInner.asPad());
                            arrayList5.add(ItemInner.asHeader());
                            float fDp12 = AndroidUtilities.dp(56.0f) + 0.0f;
                            arrayList5.size();
                            arrayList5.add(ItemInner.asSearchField());
                            float fDp13 = fDp12 + AndroidUtilities.dp(150.0f);
                            arrayList5.add(ItemInner.asSection());
                            fDp = fDp13 + AndroidUtilities.dp(32.0f);
                            graySectionCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneSubtitle));
                            updateSectionCell(z);
                            this.containsHeader = true;
                        }
                        zIsEmpty = TextUtils.isEmpty(this.query);
                        if (this.pageType != 0) {
                            lowerCase = AndroidUtilities.translitSafe(this.query).toLowerCase();
                            i = this.pageType;
                            if (i == 5) {
                                arrayListAccess$9200 = StoryPrivacyBottomSheet.access$9000(storyPrivacyBottomSheet3);
                            } else {
                                if (i != 1 || i == 2) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (storyPrivacyBottomSheet3.allowSmallChats || !(i == 3 || i == 6)) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                arrayListAccess$9200 = StoryPrivacyBottomSheet.access$9200(storyPrivacyBottomSheet3, z3, z4);
                            }
                            arrayList = this.selectedUsers;
                            map = this.selectedUsersByGroup;
                            storyPrivacyBottomSheet3.getClass();
                            HashSet hashSetMergeUsers = StoryPrivacyBottomSheet.mergeUsers(arrayList, map);
                            arrayList2 = this.atTop;
                            if (zIsEmpty) {
                                if (!z) {
                                    arrayList2.clear();
                                    for (i16 = 0; i16 < arrayListAccess$9200.size(); i16++) {
                                        tLObject3 = (TLObject) arrayListAccess$9200.get(i16);
                                        if (tLObject3 instanceof TLRPC.User) {
                                            zContainsKey = arrayList.contains(Long.valueOf(((TLRPC.User) tLObject3).id));
                                        } else if (tLObject3 instanceof TLRPC.Chat) {
                                            zContainsKey = map.containsKey(Long.valueOf(((TLRPC.Chat) tLObject3).id));
                                        } else {
                                            zContainsKey = false;
                                        }
                                        if (zContainsKey) {
                                            arrayList2.add(tLObject3);
                                        }
                                    }
                                }
                                i9 = 0;
                                i10 = 0;
                                while (i9 < arrayList2.size()) {
                                    tLObject2 = (TLObject) arrayList2.get(i9);
                                    if (tLObject2 instanceof TLRPC.User) {
                                        TLRPC.User user = (TLRPC.User) tLObject2;
                                        int i23 = i9;
                                        i12 = i10;
                                        zContains2 = arrayList.contains(Long.valueOf(user.id));
                                        i11 = i23;
                                        storyPrivacyBottomSheet2 = storyPrivacyBottomSheet3;
                                        if (zContains2 && hashSetMergeUsers.contains(Long.valueOf(user.id))) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        z10 = zIsEmpty;
                                        f3 = fDp;
                                        ItemInner itemInner = new ItemInner(3, true);
                                        itemInner.user = user;
                                        itemInner.checked = zContains2;
                                        itemInner.halfChecked = z12;
                                        i15 = this.pageType;
                                        if (i15 != 2 || i15 == 4) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        itemInner.red = z13;
                                        arrayList5.add(itemInner);
                                        iDp = AndroidUtilities.dp(f);
                                    } else {
                                        z10 = zIsEmpty;
                                        f3 = fDp;
                                        i11 = i9;
                                        i12 = i10;
                                        storyPrivacyBottomSheet2 = storyPrivacyBottomSheet3;
                                        if (tLObject2 instanceof TLRPC.Chat) {
                                            TLRPC.Chat chat2 = (TLRPC.Chat) tLObject2;
                                            boolean zContainsKey2 = map.containsKey(Long.valueOf(chat2.id));
                                            ItemInner itemInner2 = new ItemInner(3, true);
                                            itemInner2.chat = chat2;
                                            itemInner2.checked = zContainsKey2;
                                            i14 = this.pageType;
                                            if (i14 != 2 || i14 == 4) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            itemInner2.red = z11;
                                            arrayList5.add(itemInner2);
                                            iDp = AndroidUtilities.dp(f);
                                        } else {
                                            i13 = i12;
                                            fDp = f3;
                                        }
                                        i9 = i11 + 1;
                                        storyPrivacyBottomSheet3 = storyPrivacyBottomSheet2;
                                        i10 = i13;
                                        zIsEmpty = z10;
                                    }
                                    fDp = f3 + iDp;
                                    i13 = i12 + 1;
                                    i9 = i11 + 1;
                                    storyPrivacyBottomSheet3 = storyPrivacyBottomSheet2;
                                    i10 = i13;
                                    zIsEmpty = z10;
                                }
                                i2 = i10;
                            } else {
                                i2 = 0;
                            }
                            z5 = zIsEmpty;
                            storyPrivacyBottomSheet = storyPrivacyBottomSheet3;
                            i3 = 0;
                            while (i3 < arrayListAccess$9200.size()) {
                                tLObject = (TLObject) arrayListAccess$9200.get(i3);
                                if (z5 || !arrayList2.contains(tLObject)) {
                                    if (TextUtils.isEmpty(lowerCase)) {
                                        i5 = i3;
                                        z6 = true;
                                    } else if (tLObject instanceof TLRPC.User) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        lowerCase4 = AndroidUtilities.translitSafe(UserObject.getUserName(user2)).toLowerCase();
                                        if (!lowerCase4.startsWith(lowerCase) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", lowerCase, lowerCase4)) {
                                            i5 = i3;
                                        } else {
                                            String lowerCase5 = AndroidUtilities.translitSafe(UserObject.getPublicUsername(user2)).toLowerCase();
                                            if (lowerCase5.startsWith(lowerCase) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", lowerCase, lowerCase5)) {
                                                i5 = i3;
                                            } else {
                                                ArrayList<TLRPC.TL_username> arrayList6 = user2.usernames;
                                                if (arrayList6 != null) {
                                                    int i24 = 0;
                                                    while (true) {
                                                        if (i24 < arrayList6.size()) {
                                                            TLRPC.TL_username tL_username2 = arrayList6.get(i24);
                                                            i5 = i3;
                                                            if (!tL_username2.active || !AndroidUtilities.translitSafe(tL_username2.username).toLowerCase().startsWith(lowerCase)) {
                                                                i24++;
                                                                i3 = i5;
                                                            }
                                                        }
                                                    }
                                                }
                                                i5 = i3;
                                                z6 = false;
                                            }
                                        }
                                        z6 = true;
                                    } else {
                                        i5 = i3;
                                        if (tLObject instanceof TLRPC.Chat) {
                                            chat = (TLRPC.Chat) tLObject;
                                            lowerCase2 = AndroidUtilities.translitSafe(chat.title).toLowerCase();
                                            if (!lowerCase2.startsWith(lowerCase) && !SavedMessagesController$$ExternalSyntheticOutline0.m(" ", lowerCase, lowerCase2)) {
                                                lowerCase3 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat)).toLowerCase();
                                                if (!lowerCase3.startsWith(lowerCase) && !SavedMessagesController$$ExternalSyntheticOutline0.m(" ", lowerCase, lowerCase3)) {
                                                    arrayList3 = chat.usernames;
                                                    if (arrayList3 != null) {
                                                        i6 = 0;
                                                        while (true) {
                                                            if (i6 < arrayList3.size()) {
                                                                tL_username = arrayList3.get(i6);
                                                                if (tL_username.active || !AndroidUtilities.translitSafe(tL_username.username).toLowerCase().startsWith(lowerCase)) {
                                                                    i6++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z6 = true;
                                        }
                                        z6 = false;
                                    }
                                    if (z6) {
                                        if (tLObject instanceof TLRPC.User) {
                                            TLRPC.User user3 = (TLRPC.User) tLObject;
                                            zContains = arrayList.contains(Long.valueOf(user3.id));
                                            if (zContains && hashSetMergeUsers.contains(Long.valueOf(user3.id))) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            str = lowerCase;
                                            ItemInner itemInner3 = new ItemInner(3, true);
                                            itemInner3.user = user3;
                                            itemInner3.checked = zContains;
                                            itemInner3.halfChecked = z8;
                                            i8 = this.pageType;
                                            if (i8 != 2 || i8 == 4) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            itemInner3.red = z9;
                                            arrayList5.add(itemInner3);
                                            fDp += AndroidUtilities.dp(f);
                                            i2++;
                                        } else {
                                            str = lowerCase;
                                            if (tLObject instanceof TLRPC.Chat) {
                                                TLRPC.Chat chat3 = (TLRPC.Chat) tLObject;
                                                boolean zContainsKey3 = map.containsKey(Long.valueOf(chat3.id));
                                                ItemInner itemInner4 = new ItemInner(3, true);
                                                itemInner4.chat = chat3;
                                                itemInner4.checked = zContainsKey3;
                                                i7 = this.pageType;
                                                if (i7 != 2 || i7 == 4) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                itemInner4.red = z7;
                                                arrayList5.add(itemInner4);
                                                fDp += AndroidUtilities.dp(f);
                                                i2++;
                                            }
                                            i3 = i5 + 1;
                                            lowerCase = str;
                                        }
                                    }
                                    i3 = i5 + 1;
                                    lowerCase = str;
                                } else {
                                    i5 = i3;
                                }
                                str = lowerCase;
                                i3 = i5 + 1;
                                lowerCase = str;
                            }
                            if (!z5) {
                                if (i2 == 0) {
                                    arrayList5.add(new ItemInner(5, false));
                                    fDp += AndroidUtilities.dp(150.0f);
                                }
                                recyclerListView = this.listView;
                                if (recyclerListView != null) {
                                    int measuredHeight = (recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop()) - recyclerListView.getPaddingBottom();
                                    if (((BottomSheet) storyPrivacyBottomSheet).keyboardVisible) {
                                        i4 = this.keyboardHeight;
                                    } else {
                                        i4 = 0;
                                    }
                                    fDp3 = measuredHeight + i4;
                                } else {
                                    fDp3 = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(f)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                                }
                                f2 = fDp3 - fDp;
                                if (f2 > 0.0f) {
                                    ItemInner itemInner5 = new ItemInner(-1, false);
                                    itemInner5.padHeight = (int) f2;
                                    arrayList5.add(itemInner5);
                                }
                            }
                        } else {
                            storyPrivacyBottomSheet = storyPrivacyBottomSheet3;
                        }
                        if (this.layoutManager.mReverseLayout) {
                            Collections.reverse(arrayList5);
                        }
                        adapter = this.adapter;
                        if (adapter != null) {
                            if (z || storyPrivacyBottomSheet.selectedType == 0) {
                                adapter.notifyDataSetChanged();
                            } else {
                                adapter.setItems(arrayList4, arrayList5);
                            }
                        }
                        this.contentView.invalidate();
                    }
                    headerCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageTitle));
                    headerCell.setCloseImageVisible(storyPrivacyBottomSheet3.startedFromSendAsMessage);
                    headerCell.backDrawable.setRotation(0.0f, false);
                    arrayList5.add(ItemInner.asPad());
                    arrayList5.add(ItemInner.asHeader());
                    float fDp14 = AndroidUtilities.dp(56.0f) + 0.0f;
                    arrayList5.size();
                    arrayList5.add(ItemInner.asSearchField());
                    float fDp15 = fDp14 + AndroidUtilities.dp(150.0f);
                    arrayList5.add(ItemInner.asSection());
                    fDp2 = fDp15 + AndroidUtilities.dp(32.0f);
                    graySectionCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageSubtitle));
                    updateSectionCell(z);
                    this.containsHeader = true;
                }
                fDp = fDp2;
                zIsEmpty = TextUtils.isEmpty(this.query);
                if (this.pageType != 0) {
                    lowerCase = AndroidUtilities.translitSafe(this.query).toLowerCase();
                    i = this.pageType;
                    if (i == 5) {
                        arrayListAccess$9200 = StoryPrivacyBottomSheet.access$9000(storyPrivacyBottomSheet3);
                    } else {
                        if (i != 1) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (storyPrivacyBottomSheet3.allowSmallChats) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        arrayListAccess$9200 = StoryPrivacyBottomSheet.access$9200(storyPrivacyBottomSheet3, z3, z4);
                    }
                    arrayList = this.selectedUsers;
                    map = this.selectedUsersByGroup;
                    storyPrivacyBottomSheet3.getClass();
                    HashSet hashSetMergeUsers2 = StoryPrivacyBottomSheet.mergeUsers(arrayList, map);
                    arrayList2 = this.atTop;
                    if (zIsEmpty) {
                        if (!z) {
                            arrayList2.clear();
                            while (i16 < arrayListAccess$9200.size()) {
                                tLObject3 = (TLObject) arrayListAccess$9200.get(i16);
                                if (tLObject3 instanceof TLRPC.User) {
                                    zContainsKey = arrayList.contains(Long.valueOf(((TLRPC.User) tLObject3).id));
                                } else if (tLObject3 instanceof TLRPC.Chat) {
                                    zContainsKey = map.containsKey(Long.valueOf(((TLRPC.Chat) tLObject3).id));
                                } else {
                                    zContainsKey = false;
                                }
                                if (zContainsKey) {
                                    arrayList2.add(tLObject3);
                                }
                            }
                        }
                        i9 = 0;
                        i10 = 0;
                        while (i9 < arrayList2.size()) {
                            tLObject2 = (TLObject) arrayList2.get(i9);
                            if (tLObject2 instanceof TLRPC.User) {
                                TLRPC.User user4 = (TLRPC.User) tLObject2;
                                int i25 = i9;
                                i12 = i10;
                                zContains2 = arrayList.contains(Long.valueOf(user4.id));
                                i11 = i25;
                                storyPrivacyBottomSheet2 = storyPrivacyBottomSheet3;
                                if (zContains2) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                z10 = zIsEmpty;
                                f3 = fDp;
                                ItemInner itemInner6 = new ItemInner(3, true);
                                itemInner6.user = user4;
                                itemInner6.checked = zContains2;
                                itemInner6.halfChecked = z12;
                                i15 = this.pageType;
                                if (i15 != 2) {
                                    z13 = true;
                                } else {
                                    z13 = true;
                                }
                                itemInner6.red = z13;
                                arrayList5.add(itemInner6);
                                iDp = AndroidUtilities.dp(f);
                            } else {
                                z10 = zIsEmpty;
                                f3 = fDp;
                                i11 = i9;
                                i12 = i10;
                                storyPrivacyBottomSheet2 = storyPrivacyBottomSheet3;
                                if (tLObject2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat4 = (TLRPC.Chat) tLObject2;
                                    boolean zContainsKey4 = map.containsKey(Long.valueOf(chat4.id));
                                    ItemInner itemInner7 = new ItemInner(3, true);
                                    itemInner7.chat = chat4;
                                    itemInner7.checked = zContainsKey4;
                                    i14 = this.pageType;
                                    if (i14 != 2) {
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                    }
                                    itemInner7.red = z11;
                                    arrayList5.add(itemInner7);
                                    iDp = AndroidUtilities.dp(f);
                                } else {
                                    i13 = i12;
                                    fDp = f3;
                                }
                                i9 = i11 + 1;
                                storyPrivacyBottomSheet3 = storyPrivacyBottomSheet2;
                                i10 = i13;
                                zIsEmpty = z10;
                            }
                            fDp = f3 + iDp;
                            i13 = i12 + 1;
                            i9 = i11 + 1;
                            storyPrivacyBottomSheet3 = storyPrivacyBottomSheet2;
                            i10 = i13;
                            zIsEmpty = z10;
                        }
                        i2 = i10;
                    } else {
                        i2 = 0;
                    }
                    z5 = zIsEmpty;
                    storyPrivacyBottomSheet = storyPrivacyBottomSheet3;
                    i3 = 0;
                    while (i3 < arrayListAccess$9200.size()) {
                        tLObject = (TLObject) arrayListAccess$9200.get(i3);
                        if (z5) {
                            if (TextUtils.isEmpty(lowerCase)) {
                                i5 = i3;
                                z6 = true;
                            } else if (tLObject instanceof TLRPC.User) {
                                TLRPC.User user5 = (TLRPC.User) tLObject;
                                lowerCase4 = AndroidUtilities.translitSafe(UserObject.getUserName(user5)).toLowerCase();
                                if (lowerCase4.startsWith(lowerCase)) {
                                    i5 = i3;
                                } else {
                                    i5 = i3;
                                }
                                z6 = true;
                            } else {
                                i5 = i3;
                                if (tLObject instanceof TLRPC.Chat) {
                                    chat = (TLRPC.Chat) tLObject;
                                    lowerCase2 = AndroidUtilities.translitSafe(chat.title).toLowerCase();
                                    if (!lowerCase2.startsWith(lowerCase)) {
                                        lowerCase3 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat)).toLowerCase();
                                        if (!lowerCase3.startsWith(lowerCase)) {
                                            arrayList3 = chat.usernames;
                                            if (arrayList3 != null) {
                                                i6 = 0;
                                                while (true) {
                                                    if (i6 < arrayList3.size()) {
                                                        tL_username = arrayList3.get(i6);
                                                        if (tL_username.active) {
                                                        }
                                                        i6++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z6 = true;
                                }
                                z6 = false;
                            }
                            if (z6) {
                                str = lowerCase;
                            } else if (tLObject instanceof TLRPC.User) {
                                TLRPC.User user6 = (TLRPC.User) tLObject;
                                zContains = arrayList.contains(Long.valueOf(user6.id));
                                if (zContains) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                str = lowerCase;
                                ItemInner itemInner8 = new ItemInner(3, true);
                                itemInner8.user = user6;
                                itemInner8.checked = zContains;
                                itemInner8.halfChecked = z8;
                                i8 = this.pageType;
                                if (i8 != 2) {
                                    z9 = true;
                                } else {
                                    z9 = true;
                                }
                                itemInner8.red = z9;
                                arrayList5.add(itemInner8);
                                fDp += AndroidUtilities.dp(f);
                                i2++;
                            } else {
                                str = lowerCase;
                                if (tLObject instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat5 = (TLRPC.Chat) tLObject;
                                    boolean zContainsKey5 = map.containsKey(Long.valueOf(chat5.id));
                                    ItemInner itemInner9 = new ItemInner(3, true);
                                    itemInner9.chat = chat5;
                                    itemInner9.checked = zContainsKey5;
                                    i7 = this.pageType;
                                    if (i7 != 2) {
                                        z7 = true;
                                    } else {
                                        z7 = true;
                                    }
                                    itemInner9.red = z7;
                                    arrayList5.add(itemInner9);
                                    fDp += AndroidUtilities.dp(f);
                                    i2++;
                                }
                            }
                        } else {
                            if (TextUtils.isEmpty(lowerCase)) {
                                i5 = i3;
                                z6 = true;
                            } else if (tLObject instanceof TLRPC.User) {
                                TLRPC.User user7 = (TLRPC.User) tLObject;
                                lowerCase4 = AndroidUtilities.translitSafe(UserObject.getUserName(user7)).toLowerCase();
                                if (lowerCase4.startsWith(lowerCase)) {
                                    i5 = i3;
                                } else {
                                    i5 = i3;
                                }
                                z6 = true;
                            } else {
                                i5 = i3;
                                if (tLObject instanceof TLRPC.Chat) {
                                    chat = (TLRPC.Chat) tLObject;
                                    lowerCase2 = AndroidUtilities.translitSafe(chat.title).toLowerCase();
                                    if (!lowerCase2.startsWith(lowerCase)) {
                                        lowerCase3 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat)).toLowerCase();
                                        if (!lowerCase3.startsWith(lowerCase)) {
                                            arrayList3 = chat.usernames;
                                            if (arrayList3 != null) {
                                                i6 = 0;
                                                while (true) {
                                                    if (i6 < arrayList3.size()) {
                                                        tL_username = arrayList3.get(i6);
                                                        if (tL_username.active) {
                                                        }
                                                        i6++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z6 = true;
                                }
                                z6 = false;
                            }
                            if (z6) {
                                str = lowerCase;
                            } else if (tLObject instanceof TLRPC.User) {
                                TLRPC.User user8 = (TLRPC.User) tLObject;
                                zContains = arrayList.contains(Long.valueOf(user8.id));
                                if (zContains) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                str = lowerCase;
                                ItemInner itemInner10 = new ItemInner(3, true);
                                itemInner10.user = user8;
                                itemInner10.checked = zContains;
                                itemInner10.halfChecked = z8;
                                i8 = this.pageType;
                                if (i8 != 2) {
                                    z9 = true;
                                } else {
                                    z9 = true;
                                }
                                itemInner10.red = z9;
                                arrayList5.add(itemInner10);
                                fDp += AndroidUtilities.dp(f);
                                i2++;
                            } else {
                                str = lowerCase;
                                if (tLObject instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat6 = (TLRPC.Chat) tLObject;
                                    boolean zContainsKey6 = map.containsKey(Long.valueOf(chat6.id));
                                    ItemInner itemInner11 = new ItemInner(3, true);
                                    itemInner11.chat = chat6;
                                    itemInner11.checked = zContainsKey6;
                                    i7 = this.pageType;
                                    if (i7 != 2) {
                                        z7 = true;
                                    } else {
                                        z7 = true;
                                    }
                                    itemInner11.red = z7;
                                    arrayList5.add(itemInner11);
                                    fDp += AndroidUtilities.dp(f);
                                    i2++;
                                }
                            }
                        }
                        i3 = i5 + 1;
                        lowerCase = str;
                    }
                    if (!z5) {
                        if (i2 == 0) {
                            arrayList5.add(new ItemInner(5, false));
                            fDp += AndroidUtilities.dp(150.0f);
                        }
                        recyclerListView = this.listView;
                        if (recyclerListView != null) {
                            int measuredHeight2 = (recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop()) - recyclerListView.getPaddingBottom();
                            if (((BottomSheet) storyPrivacyBottomSheet).keyboardVisible) {
                                i4 = this.keyboardHeight;
                            } else {
                                i4 = 0;
                            }
                            fDp3 = measuredHeight2 + i4;
                        } else {
                            fDp3 = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(f)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                        }
                        f2 = fDp3 - fDp;
                        if (f2 > 0.0f) {
                            ItemInner itemInner12 = new ItemInner(-1, false);
                            itemInner12.padHeight = (int) f2;
                            arrayList5.add(itemInner12);
                        }
                    }
                } else {
                    storyPrivacyBottomSheet = storyPrivacyBottomSheet3;
                }
                if (this.layoutManager.mReverseLayout) {
                    Collections.reverse(arrayList5);
                }
                adapter = this.adapter;
                if (adapter != null) {
                    if (z) {
                        adapter.notifyDataSetChanged();
                    } else {
                        adapter.notifyDataSetChanged();
                    }
                }
                this.contentView.invalidate();
            }
            this.containsHeader = false;
            graySectionCell.setVisibility(8);
            ArrayList arrayList7 = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet3).currentAccount).getStoriesController().sendAs;
            f = 56.0f;
            ItemInner itemInner13 = new ItemInner(-1, false);
            itemInner13.subtractHeight = 24;
            arrayList5.add(itemInner13);
            if (storyPrivacyBottomSheet3.liveSettings) {
                String string = LocaleController.getString(R.string.LiveStorySettingsHeader);
                ItemInner itemInner14 = new ItemInner(11, false);
                itemInner14.text = string;
                arrayList5.add(itemInner14);
                itemInner13.subtractHeight = AndroidUtilities.dp(72.0f) + itemInner13.subtractHeight;
            } else {
                if (storyPrivacyBottomSheet3.canChangePeer && (storyPrivacyBottomSheet3.isEdit || arrayList7 == null || arrayList7.size() <= 1)) {
                    String string2 = storyPrivacyBottomSheet3.isEdit ? LocaleController.getString(R.string.StoryPrivacyAlertEditTitle) : LocaleController.getString(storyPrivacyBottomSheet3.isLive ? R.string.StoryLivePrivacyAlertTitle : R.string.StoryPrivacyAlertTitle);
                    if (storyPrivacyBottomSheet3.isLive) {
                        pluralString = LocaleController.getString(R.string.StoryLivePrivacyAlertSubtitleProfile);
                    } else {
                        int i26 = storyPrivacyBottomSheet3.storyPeriod;
                        pluralString = i26 != Integer.MAX_VALUE ? LocaleController.formatPluralString("StoryPrivacyAlertSubtitle", i26 / 3600, new Object[0]) : LocaleController.getString(R.string.StoryPrivacyAlertSubtitleProfile);
                    }
                    ItemInner itemInner15 = new ItemInner(4, false);
                    itemInner15.text = string2;
                    itemInner15.text2 = pluralString;
                    arrayList5.add(itemInner15);
                    itemInner13.subtractHeight = AndroidUtilities.dp(72.0f) + itemInner13.subtractHeight;
                } else {
                    String string3 = LocaleController.getString(storyPrivacyBottomSheet3.isLive ? R.string.StoryLivePrivacyPublishAs : R.string.StoryPrivacyPublishAs);
                    ItemInner itemInner16 = new ItemInner(8, false);
                    itemInner16.text = string3;
                    arrayList5.add(itemInner16);
                    itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                    TLRPC.InputPeer inputPeer2 = storyPrivacyBottomSheet3.selectedPeer;
                    if (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) {
                        TLRPC.User currentUser = UserConfig.getInstance(((BottomSheet) storyPrivacyBottomSheet3).currentAccount).getCurrentUser();
                        ItemInner itemInner17 = new ItemInner(3, true);
                        itemInner17.user = currentUser;
                        itemInner17.checked = false;
                        itemInner17.halfChecked = false;
                        itemInner17.sendAs = true;
                        arrayList5.add(itemInner17);
                        itemInner13.subtractHeight = AndroidUtilities.dp(62.0f) + itemInner13.subtractHeight;
                    } else if (inputPeer2 instanceof TLRPC.TL_inputPeerUser) {
                        TLRPC.User user9 = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet3).currentAccount).getUser(Long.valueOf(storyPrivacyBottomSheet3.selectedPeer.user_id));
                        ItemInner itemInner18 = new ItemInner(3, true);
                        itemInner18.user = user9;
                        itemInner18.checked = false;
                        itemInner18.halfChecked = false;
                        itemInner18.sendAs = true;
                        arrayList5.add(itemInner18);
                        itemInner13.subtractHeight = AndroidUtilities.dp(62.0f) + itemInner13.subtractHeight;
                    } else {
                        if (inputPeer2 instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat chat7 = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet3).currentAccount).getChat(Long.valueOf(storyPrivacyBottomSheet3.selectedPeer.channel_id));
                            ItemInner itemInner19 = new ItemInner(3, true);
                            itemInner19.chat = chat7;
                            itemInner19.checked = false;
                            itemInner19.sendAs = true;
                            arrayList5.add(itemInner19);
                            zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat7);
                            itemInner13.subtractHeight = AndroidUtilities.dp(104.0f) + itemInner13.subtractHeight;
                        } else {
                            if (inputPeer2 instanceof TLRPC.TL_inputPeerChat) {
                                TLRPC.Chat chat8 = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet3).currentAccount).getChat(Long.valueOf(storyPrivacyBottomSheet3.selectedPeer.chat_id));
                                ItemInner itemInner20 = new ItemInner(3, true);
                                itemInner20.chat = chat8;
                                itemInner20.checked = false;
                                itemInner20.sendAs = true;
                                arrayList5.add(itemInner20);
                                itemInner13.subtractHeight = AndroidUtilities.dp(104.0f) + itemInner13.subtractHeight;
                                zIsChannelAndNotMegaGroup = false;
                            }
                            ItemInner itemInnerAsShadow = ItemInner.asShadow(null);
                            if (z14) {
                                i17 = 1;
                            } else {
                                i17 = 2;
                            }
                            itemInnerAsShadow.resId = i17;
                            arrayList5.add(itemInnerAsShadow);
                            itemInner13.subtractHeight = AndroidUtilities.dp(12.0f) + itemInner13.subtractHeight;
                            if (z14) {
                                if (storyPrivacyBottomSheet3.isLive) {
                                    i18 = R.string.StoryLivePrivacyWhoCanView;
                                } else {
                                    i18 = R.string.StoryPrivacyWhoCanView;
                                }
                                String string4 = LocaleController.getString(i18);
                                ItemInner itemInner21 = new ItemInner(8, false);
                                itemInner21.text = string4;
                                arrayList5.add(itemInner21);
                                itemInner13.subtractHeight = AndroidUtilities.dp(40.0f) + itemInner13.subtractHeight;
                            }
                        }
                        z14 = false;
                        ItemInner itemInnerAsShadow2 = ItemInner.asShadow(null);
                        if (z14) {
                            i17 = 1;
                        } else {
                            i17 = 2;
                        }
                        itemInnerAsShadow2.resId = i17;
                        arrayList5.add(itemInnerAsShadow2);
                        itemInner13.subtractHeight = AndroidUtilities.dp(12.0f) + itemInner13.subtractHeight;
                        if (z14) {
                            if (storyPrivacyBottomSheet3.isLive) {
                                i18 = R.string.StoryLivePrivacyWhoCanView;
                            } else {
                                i18 = R.string.StoryPrivacyWhoCanView;
                            }
                            String string5 = LocaleController.getString(i18);
                            ItemInner itemInner22 = new ItemInner(8, false);
                            itemInner22.text = string5;
                            arrayList5.add(itemInner22);
                            itemInner13.subtractHeight = AndroidUtilities.dp(40.0f) + itemInner13.subtractHeight;
                        }
                    }
                    zIsChannelAndNotMegaGroup = false;
                    z14 = true;
                    ItemInner itemInnerAsShadow3 = ItemInner.asShadow(null);
                    if (z14) {
                        i17 = 1;
                    } else {
                        i17 = 2;
                    }
                    itemInnerAsShadow3.resId = i17;
                    arrayList5.add(itemInnerAsShadow3);
                    itemInner13.subtractHeight = AndroidUtilities.dp(12.0f) + itemInner13.subtractHeight;
                    if (z14) {
                        if (storyPrivacyBottomSheet3.isLive) {
                            i18 = R.string.StoryLivePrivacyWhoCanView;
                        } else {
                            i18 = R.string.StoryPrivacyWhoCanView;
                        }
                        String string6 = LocaleController.getString(i18);
                        ItemInner itemInner23 = new ItemInner(8, false);
                        itemInner23.text = string6;
                        arrayList5.add(itemInner23);
                        itemInner13.subtractHeight = AndroidUtilities.dp(40.0f) + itemInner13.subtractHeight;
                    }
                }
                if (z14 || storyPrivacyBottomSheet3.liveSettings) {
                    f4 = 80.0f;
                } else {
                    boolean z17 = storyPrivacyBottomSheet3.selectedType == 4;
                    int i27 = storyPrivacyBottomSheet3.excludedEveryoneCount;
                    f4 = 80.0f;
                    ItemInner itemInner24 = new ItemInner(3, false);
                    itemInner24.type = 4;
                    itemInner24.checked = z17;
                    itemInner24.typeCount = i27;
                    arrayList5.add(itemInner24);
                    itemInner13.subtractHeight = AndroidUtilities.dp(56.0f) + itemInner13.subtractHeight;
                    if (storyPrivacyBottomSheet3.excludedEveryoneCount == 1) {
                        ArrayList arrayList8 = storyPrivacyBottomSheet3.excludedEveryone;
                        if (arrayList8.size() != 1) {
                            for (ArrayList arrayList9 : storyPrivacyBottomSheet3.excludedEveryoneByGroup.values()) {
                                if (arrayList9.size() >= 1) {
                                    itemInner24.user = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet3).currentAccount).getUser((Long) arrayList9.get(0));
                                    break;
                                }
                            }
                        } else {
                            itemInner24.user = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet3).currentAccount).getUser((Long) arrayList8.get(0));
                        }
                    }
                    boolean z18 = storyPrivacyBottomSheet3.selectedType == 2;
                    ArrayList arrayList10 = storyPrivacyBottomSheet3.excludedContacts;
                    int size = arrayList10.size();
                    ItemInner itemInner25 = new ItemInner(3, false);
                    itemInner25.type = 2;
                    itemInner25.checked = z18;
                    itemInner25.typeCount = size;
                    arrayList5.add(itemInner25);
                    itemInner13.subtractHeight = AndroidUtilities.dp(56.0f) + itemInner13.subtractHeight;
                    if (arrayList10.size() == 1) {
                        itemInner25.user = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet3).currentAccount).getUser((Long) arrayList10.get(0));
                    }
                    ArrayList arrayListAccess$6500 = StoryPrivacyBottomSheet.access$6500(storyPrivacyBottomSheet3);
                    boolean z19 = storyPrivacyBottomSheet3.selectedType == 1;
                    int size2 = arrayListAccess$6500.size();
                    ItemInner itemInner26 = new ItemInner(3, false);
                    itemInner26.type = 1;
                    itemInner26.checked = z19;
                    itemInner26.typeCount = size2;
                    arrayList5.add(itemInner26);
                    itemInner13.subtractHeight = AndroidUtilities.dp(56.0f) + itemInner13.subtractHeight;
                    if (arrayListAccess$6500.size() == 1 && (arrayListAccess$6500.get(0) instanceof TLRPC.User)) {
                        itemInner26.user = (TLRPC.User) arrayListAccess$6500.get(0);
                    }
                    boolean z20 = storyPrivacyBottomSheet3.selectedType == 3;
                    int i28 = storyPrivacyBottomSheet3.selectedContactsCount;
                    ItemInner itemInner27 = new ItemInner(3, false);
                    itemInner27.type = 3;
                    itemInner27.checked = z20;
                    itemInner27.typeCount = i28;
                    arrayList5.add(itemInner27);
                    itemInner13.subtractHeight = AndroidUtilities.dp(56.0f) + itemInner13.subtractHeight;
                    if (storyPrivacyBottomSheet3.selectedContactsCount == 1) {
                        ArrayList arrayList11 = storyPrivacyBottomSheet3.selectedContacts;
                        if (arrayList11.size() != 1) {
                            for (ArrayList arrayList12 : storyPrivacyBottomSheet3.selectedContactsByGroup.values()) {
                                if (arrayList12.size() >= 1) {
                                    itemInner27.user = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet3).currentAccount).getUser((Long) arrayList12.get(0));
                                    break;
                                }
                            }
                        } else {
                            itemInner27.user = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet3).currentAccount).getUser((Long) arrayList11.get(0));
                        }
                    }
                    int i29 = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet3).currentAccount).getStoriesController().blocklistCount;
                    arrayList5.add(ItemInner.asShadow(AndroidUtilities.replaceSingleTag(i29 <= 0 ? LocaleController.getString(storyPrivacyBottomSheet3.isLive ? R.string.StoryLiveBlockListEmpty : R.string.StoryBlockListEmpty) : LocaleController.formatPluralString(storyPrivacyBottomSheet3.isLive ? "StoryLiveBlockList" : "StoryBlockList", i29, new Object[0]), Theme.key_chat_messageLinkIn, 0, new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1(this, 3), ((BottomSheet) storyPrivacyBottomSheet3).resourcesProvider)));
                    itemInner13.subtractHeight = AndroidUtilities.dp(80.0f) + itemInner13.subtractHeight;
                }
                if (!storyPrivacyBottomSheet3.isEdit) {
                    if (storyPrivacyBottomSheet3.isLive && !storyPrivacyBottomSheet3.liveSettings) {
                        if (storyPrivacyBottomSheet3.isRtmpStream) {
                            String string7 = LocaleController.getString(R.string.LiveStoryRTMPSettings);
                            ItemInner itemInner28 = new ItemInner(9, false);
                            itemInner28.text = string7;
                            itemInner28.text2 = "";
                            itemInner28.id = 5;
                            arrayList5.add(itemInner28);
                            itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                            String string8 = LocaleController.getString(R.string.LiveStoryRTMPDisable);
                            ItemInner itemInner29 = new ItemInner(9, false);
                            itemInner29.text = string8;
                            itemInner29.text2 = "";
                            itemInner29.id = 6;
                            arrayList5.add(itemInner29);
                            itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                            arrayList5.add(ItemInner.asShadow(null));
                            itemInner13.subtractHeight = AndroidUtilities.dp(12.0f) + itemInner13.subtractHeight;
                        } else {
                            String string9 = LocaleController.getString(R.string.LiveStoryRTMPEnable);
                            ItemInner itemInner30 = new ItemInner(9, false);
                            itemInner30.text = string9;
                            itemInner30.text2 = "";
                            itemInner30.id = 5;
                            arrayList5.add(itemInner30);
                            itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                            arrayList5.add(ItemInner.asShadow(LocaleController.getString(R.string.LiveStoryRTMPEnableInfo)));
                            itemInner13.subtractHeight = AndroidUtilities.dp(30.0f) + itemInner13.subtractHeight;
                        }
                    }
                    if (storyPrivacyBottomSheet3.isLive) {
                        String string10 = LocaleController.getString(R.string.StoryLiveAllowComments);
                        boolean z21 = storyPrivacyBottomSheet3.allowComments;
                        ItemInner itemInner31 = new ItemInner(7, false);
                        itemInner31.resId = 2;
                        itemInner31.text = string10;
                        itemInner31.checked = z21;
                        arrayList5.add(itemInner31);
                        itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                    }
                    if (!storyPrivacyBottomSheet3.liveSettings) {
                        String string11 = LocaleController.getString(R.string.StoryAllowScreenshots);
                        boolean z22 = storyPrivacyBottomSheet3.allowScreenshots;
                        ItemInner itemInner32 = new ItemInner(7, false);
                        itemInner32.resId = 0;
                        itemInner32.text = string11;
                        itemInner32.checked = z22;
                        arrayList5.add(itemInner32);
                        itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                    }
                    if (!storyPrivacyBottomSheet3.isLive && !storyPrivacyBottomSheet3.liveSettings) {
                        if (z14) {
                            i21 = R.string.StoryKeep;
                        } else if (zIsChannelAndNotMegaGroup) {
                            i21 = R.string.StoryKeepChannel;
                        } else {
                            i21 = R.string.StoryKeepGroup;
                        }
                        String string12 = LocaleController.getString(i21);
                        boolean z23 = storyPrivacyBottomSheet3.keepOnMyPage;
                        ItemInner itemInner33 = new ItemInner(7, false);
                        itemInner33.resId = 1;
                        itemInner33.text = string12;
                        itemInner33.checked = z23;
                        arrayList5.add(itemInner33);
                        itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                    }
                }
                z15 = storyPrivacyBottomSheet3.isLive;
                if (!z15 || storyPrivacyBottomSheet3.liveSettings) {
                    arrayList5.add(ItemInner.asShadow(null));
                    itemInner13.subtractHeight = AndroidUtilities.dp(12.0f) + itemInner13.subtractHeight;
                } else if (!storyPrivacyBottomSheet3.isEdit && storyPrivacyBottomSheet3.allowCover && storyPrivacyBottomSheet3.whenCoverClicked != null) {
                    if (z15) {
                        pluralString3 = LocaleController.getString(z14 ? R.string.StoryLiveKeepInfo : zIsChannelAndNotMegaGroup ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    } else {
                        String str3 = z14 ? "StoryKeepInfo" : zIsChannelAndNotMegaGroup ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i30 = storyPrivacyBottomSheet3.storyPeriod;
                        if (i30 == Integer.MAX_VALUE) {
                            i30 = 86400;
                        }
                        pluralString3 = LocaleController.formatPluralString(str3, i30 / 3600, new Object[0]);
                    }
                    arrayList5.add(ItemInner.asShadow(pluralString3));
                    itemInner13.subtractHeight = AndroidUtilities.dp(f4) + itemInner13.subtractHeight;
                }
                if (storyPrivacyBottomSheet3.keepOnMyPage && !storyPrivacyBottomSheet3.isLive && !storyPrivacyBottomSheet3.liveSettings) {
                    inputPeer = storyPrivacyBottomSheet3.selectedPeer;
                    if (inputPeer != null) {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer);
                    } else {
                        clientUserId = UserConfig.getInstance(((BottomSheet) storyPrivacyBottomSheet3).currentAccount).getClientUserId();
                    }
                    storyPrivacyBottomSheet3.getStoriesController().getStoryAlbumsList(clientUserId, true);
                    sb = new StringBuilder();
                    hashSet = storyPrivacyBottomSheet3.selectedAlbums;
                    if (hashSet.isEmpty()) {
                        sb.append(LocaleController.getString(R.string.StoriesAlbumNameAllStories));
                    } else if (hashSet.size() < 3) {
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            storyAlbumFindById = storyPrivacyBottomSheet3.getStoriesController().getStoryAlbumsList(clientUserId, true).findById(((Integer) it.next()).intValue());
                            if (storyAlbumFindById != null) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(storyAlbumFindById.title);
                            }
                        }
                    } else {
                        sb.append(LocaleController.formatPluralString("StoriesAlbumCount", hashSet.size(), new Object[0]));
                    }
                    String string13 = LocaleController.getString(R.string.StoriesAlbum);
                    ItemInner itemInner34 = new ItemInner(9, false);
                    itemInner34.text = string13;
                    itemInner34.text2 = sb;
                    itemInner34.id = 1;
                    arrayList5.add(itemInner34);
                    itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                }
                if (!storyPrivacyBottomSheet3.isEdit && ((!storyPrivacyBottomSheet3.allowCover || storyPrivacyBottomSheet3.whenCoverClicked == null) && !(z16 = storyPrivacyBottomSheet3.isLive) && !storyPrivacyBottomSheet3.liveSettings)) {
                    if (z16) {
                        if (z14) {
                            i20 = R.string.StoryLiveKeepInfo;
                        } else if (zIsChannelAndNotMegaGroup) {
                            i20 = R.string.StoryLiveKeepChannelInfo;
                        } else {
                            i20 = R.string.StoryLiveKeepGroupInfo;
                        }
                        pluralString2 = LocaleController.getString(i20);
                    } else {
                        if (z14) {
                            str2 = "StoryKeepInfo";
                        } else if (zIsChannelAndNotMegaGroup) {
                            str2 = "StoryKeepChannelInfo";
                        } else {
                            str2 = "StoryKeepGroupInfo";
                        }
                        i19 = storyPrivacyBottomSheet3.storyPeriod;
                        if (i19 == Integer.MAX_VALUE) {
                            i19 = 86400;
                        }
                        pluralString2 = LocaleController.formatPluralString(str2, i19 / 3600, new Object[0]);
                    }
                    arrayList5.add(ItemInner.asShadow(pluralString2));
                    itemInner13.subtractHeight = AndroidUtilities.dp(f4) + itemInner13.subtractHeight;
                }
                if (storyPrivacyBottomSheet3.keepOnMyPage && storyPrivacyBottomSheet3.allowCover && storyPrivacyBottomSheet3.whenCoverClicked != null) {
                    String string14 = LocaleController.getString(R.string.StoryEditCover);
                    BitmapDrawable bitmapDrawable = storyPrivacyBottomSheet3.coverDrawable;
                    ItemInner itemInner35 = new ItemInner(9, false);
                    itemInner35.text = string14;
                    itemInner35.drawable = bitmapDrawable;
                    itemInner35.id = 0;
                    arrayList5.add(itemInner35);
                    itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                    arrayList5.add(ItemInner.asShadow(LocaleController.getString(R.string.StoryEditCoverInfo)));
                    itemInner13.subtractHeight = AndroidUtilities.dp(72.0f) + itemInner13.subtractHeight;
                }
                if (storyPrivacyBottomSheet3.liveSettings) {
                    String string15 = LocaleController.getString(R.string.LiveStoryRTMPSettings);
                    ItemInner itemInner36 = new ItemInner(9, false);
                    itemInner36.text = string15;
                    itemInner36.text2 = "";
                    itemInner36.id = 5;
                    arrayList5.add(itemInner36);
                    itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                    arrayList5.add(ItemInner.asShadow(null));
                    itemInner13.subtractHeight = AndroidUtilities.dp(52.0f) + itemInner13.subtractHeight;
                }
                if (storyPrivacyBottomSheet3.isLive && storyPrivacyBottomSheet3.allowComments) {
                    String string16 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                    ItemInner itemInner37 = new ItemInner(8, false);
                    itemInner37.text = string16;
                    arrayList5.add(itemInner37);
                    itemInner13.subtractHeight = AndroidUtilities.dp(40.0f) + itemInner13.subtractHeight;
                    ItemInner itemInner38 = new ItemInner(10, false);
                    itemInner38.id = 8;
                    arrayList5.add(itemInner38);
                    itemInner13.subtractHeight = AndroidUtilities.dp(75.0f) + itemInner13.subtractHeight;
                    arrayList5.add(ItemInner.asShadow(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                    itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                }
            }
            zIsChannelAndNotMegaGroup = false;
            z14 = true;
            if (z14) {
                f4 = 80.0f;
            } else {
                f4 = 80.0f;
            }
            if (!storyPrivacyBottomSheet3.isEdit) {
                if (storyPrivacyBottomSheet3.isLive) {
                    if (storyPrivacyBottomSheet3.isRtmpStream) {
                        String string17 = LocaleController.getString(R.string.LiveStoryRTMPSettings);
                        ItemInner itemInner210 = new ItemInner(9, false);
                        itemInner210.text = string17;
                        itemInner210.text2 = "";
                        itemInner210.id = 5;
                        arrayList5.add(itemInner210);
                        itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                        String string18 = LocaleController.getString(R.string.LiveStoryRTMPDisable);
                        ItemInner itemInner211 = new ItemInner(9, false);
                        itemInner211.text = string18;
                        itemInner211.text2 = "";
                        itemInner211.id = 6;
                        arrayList5.add(itemInner211);
                        itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                        arrayList5.add(ItemInner.asShadow(null));
                        itemInner13.subtractHeight = AndroidUtilities.dp(12.0f) + itemInner13.subtractHeight;
                    } else {
                        String string19 = LocaleController.getString(R.string.LiveStoryRTMPEnable);
                        ItemInner itemInner39 = new ItemInner(9, false);
                        itemInner39.text = string19;
                        itemInner39.text2 = "";
                        itemInner39.id = 5;
                        arrayList5.add(itemInner39);
                        itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                        arrayList5.add(ItemInner.asShadow(LocaleController.getString(R.string.LiveStoryRTMPEnableInfo)));
                        itemInner13.subtractHeight = AndroidUtilities.dp(30.0f) + itemInner13.subtractHeight;
                    }
                }
                if (storyPrivacyBottomSheet3.isLive) {
                    String string110 = LocaleController.getString(R.string.StoryLiveAllowComments);
                    boolean z24 = storyPrivacyBottomSheet3.allowComments;
                    ItemInner itemInner310 = new ItemInner(7, false);
                    itemInner310.resId = 2;
                    itemInner310.text = string110;
                    itemInner310.checked = z24;
                    arrayList5.add(itemInner310);
                    itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                }
                if (!storyPrivacyBottomSheet3.liveSettings) {
                    String string111 = LocaleController.getString(R.string.StoryAllowScreenshots);
                    boolean z25 = storyPrivacyBottomSheet3.allowScreenshots;
                    ItemInner itemInner311 = new ItemInner(7, false);
                    itemInner311.resId = 0;
                    itemInner311.text = string111;
                    itemInner311.checked = z25;
                    arrayList5.add(itemInner311);
                    itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                }
                if (!storyPrivacyBottomSheet3.isLive) {
                    if (z14) {
                        i21 = R.string.StoryKeep;
                    } else if (zIsChannelAndNotMegaGroup) {
                        i21 = R.string.StoryKeepChannel;
                    } else {
                        i21 = R.string.StoryKeepGroup;
                    }
                    String string112 = LocaleController.getString(i21);
                    boolean z26 = storyPrivacyBottomSheet3.keepOnMyPage;
                    ItemInner itemInner312 = new ItemInner(7, false);
                    itemInner312.resId = 1;
                    itemInner312.text = string112;
                    itemInner312.checked = z26;
                    arrayList5.add(itemInner312);
                    itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                }
            }
            z15 = storyPrivacyBottomSheet3.isLive;
            if (z15) {
                arrayList5.add(ItemInner.asShadow(null));
                itemInner13.subtractHeight = AndroidUtilities.dp(12.0f) + itemInner13.subtractHeight;
            } else {
                arrayList5.add(ItemInner.asShadow(null));
                itemInner13.subtractHeight = AndroidUtilities.dp(12.0f) + itemInner13.subtractHeight;
            }
            if (storyPrivacyBottomSheet3.keepOnMyPage) {
                inputPeer = storyPrivacyBottomSheet3.selectedPeer;
                if (inputPeer != null) {
                    clientUserId = DialogObject.getPeerDialogId(inputPeer);
                } else {
                    clientUserId = UserConfig.getInstance(((BottomSheet) storyPrivacyBottomSheet3).currentAccount).getClientUserId();
                }
                storyPrivacyBottomSheet3.getStoriesController().getStoryAlbumsList(clientUserId, true);
                sb = new StringBuilder();
                hashSet = storyPrivacyBottomSheet3.selectedAlbums;
                if (hashSet.isEmpty()) {
                    sb.append(LocaleController.getString(R.string.StoriesAlbumNameAllStories));
                } else if (hashSet.size() < 3) {
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        storyAlbumFindById = storyPrivacyBottomSheet3.getStoriesController().getStoryAlbumsList(clientUserId, true).findById(((Integer) it.next()).intValue());
                        if (storyAlbumFindById != null) {
                            if (sb.length() != 0) {
                                sb.append(", ");
                            }
                            sb.append(storyAlbumFindById.title);
                        }
                    }
                } else {
                    sb.append(LocaleController.formatPluralString("StoriesAlbumCount", hashSet.size(), new Object[0]));
                }
                String string113 = LocaleController.getString(R.string.StoriesAlbum);
                ItemInner itemInner313 = new ItemInner(9, false);
                itemInner313.text = string113;
                itemInner313.text2 = sb;
                itemInner313.id = 1;
                arrayList5.add(itemInner313);
                itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
            }
            if (!storyPrivacyBottomSheet3.isEdit) {
                if (z16) {
                    if (z14) {
                        i20 = R.string.StoryLiveKeepInfo;
                    } else if (zIsChannelAndNotMegaGroup) {
                        i20 = R.string.StoryLiveKeepChannelInfo;
                    } else {
                        i20 = R.string.StoryLiveKeepGroupInfo;
                    }
                    pluralString2 = LocaleController.getString(i20);
                } else {
                    if (z14) {
                        str2 = "StoryKeepInfo";
                    } else if (zIsChannelAndNotMegaGroup) {
                        str2 = "StoryKeepChannelInfo";
                    } else {
                        str2 = "StoryKeepGroupInfo";
                    }
                    i19 = storyPrivacyBottomSheet3.storyPeriod;
                    if (i19 == Integer.MAX_VALUE) {
                        i19 = 86400;
                    }
                    pluralString2 = LocaleController.formatPluralString(str2, i19 / 3600, new Object[0]);
                }
                arrayList5.add(ItemInner.asShadow(pluralString2));
                itemInner13.subtractHeight = AndroidUtilities.dp(f4) + itemInner13.subtractHeight;
            }
            if (storyPrivacyBottomSheet3.keepOnMyPage) {
                String string114 = LocaleController.getString(R.string.StoryEditCover);
                BitmapDrawable bitmapDrawable2 = storyPrivacyBottomSheet3.coverDrawable;
                ItemInner itemInner314 = new ItemInner(9, false);
                itemInner314.text = string114;
                itemInner314.drawable = bitmapDrawable2;
                itemInner314.id = 0;
                arrayList5.add(itemInner314);
                itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                arrayList5.add(ItemInner.asShadow(LocaleController.getString(R.string.StoryEditCoverInfo)));
                itemInner13.subtractHeight = AndroidUtilities.dp(72.0f) + itemInner13.subtractHeight;
            }
            if (storyPrivacyBottomSheet3.liveSettings) {
                String string115 = LocaleController.getString(R.string.LiveStoryRTMPSettings);
                ItemInner itemInner315 = new ItemInner(9, false);
                itemInner315.text = string115;
                itemInner315.text2 = "";
                itemInner315.id = 5;
                arrayList5.add(itemInner315);
                itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
                arrayList5.add(ItemInner.asShadow(null));
                itemInner13.subtractHeight = AndroidUtilities.dp(52.0f) + itemInner13.subtractHeight;
            }
            if (storyPrivacyBottomSheet3.isLive) {
                String string116 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                ItemInner itemInner316 = new ItemInner(8, false);
                itemInner316.text = string116;
                arrayList5.add(itemInner316);
                itemInner13.subtractHeight = AndroidUtilities.dp(40.0f) + itemInner13.subtractHeight;
                ItemInner itemInner317 = new ItemInner(10, false);
                itemInner317.id = 8;
                arrayList5.add(itemInner317);
                itemInner13.subtractHeight = AndroidUtilities.dp(75.0f) + itemInner13.subtractHeight;
                arrayList5.add(ItemInner.asShadow(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                itemInner13.subtractHeight = AndroidUtilities.dp(50.0f) + itemInner13.subtractHeight;
            }
            fDp = 0.0f;
            zIsEmpty = TextUtils.isEmpty(this.query);
            if (this.pageType != 0) {
                lowerCase = AndroidUtilities.translitSafe(this.query).toLowerCase();
                i = this.pageType;
                if (i == 5) {
                    arrayListAccess$9200 = StoryPrivacyBottomSheet.access$9000(storyPrivacyBottomSheet3);
                } else {
                    if (i != 1) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (storyPrivacyBottomSheet3.allowSmallChats) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    arrayListAccess$9200 = StoryPrivacyBottomSheet.access$9200(storyPrivacyBottomSheet3, z3, z4);
                }
                arrayList = this.selectedUsers;
                map = this.selectedUsersByGroup;
                storyPrivacyBottomSheet3.getClass();
                HashSet hashSetMergeUsers3 = StoryPrivacyBottomSheet.mergeUsers(arrayList, map);
                arrayList2 = this.atTop;
                if (zIsEmpty) {
                    if (!z) {
                        arrayList2.clear();
                        while (i16 < arrayListAccess$9200.size()) {
                            tLObject3 = (TLObject) arrayListAccess$9200.get(i16);
                            if (tLObject3 instanceof TLRPC.User) {
                                zContainsKey = arrayList.contains(Long.valueOf(((TLRPC.User) tLObject3).id));
                            } else if (tLObject3 instanceof TLRPC.Chat) {
                                zContainsKey = map.containsKey(Long.valueOf(((TLRPC.Chat) tLObject3).id));
                            } else {
                                zContainsKey = false;
                            }
                            if (zContainsKey) {
                                arrayList2.add(tLObject3);
                            }
                        }
                    }
                    i9 = 0;
                    i10 = 0;
                    while (i9 < arrayList2.size()) {
                        tLObject2 = (TLObject) arrayList2.get(i9);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user10 = (TLRPC.User) tLObject2;
                            int i210 = i9;
                            i12 = i10;
                            zContains2 = arrayList.contains(Long.valueOf(user10.id));
                            i11 = i210;
                            storyPrivacyBottomSheet2 = storyPrivacyBottomSheet3;
                            if (zContains2) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            z10 = zIsEmpty;
                            f3 = fDp;
                            ItemInner itemInner40 = new ItemInner(3, true);
                            itemInner40.user = user10;
                            itemInner40.checked = zContains2;
                            itemInner40.halfChecked = z12;
                            i15 = this.pageType;
                            if (i15 != 2) {
                                z13 = true;
                            } else {
                                z13 = true;
                            }
                            itemInner40.red = z13;
                            arrayList5.add(itemInner40);
                            iDp = AndroidUtilities.dp(f);
                        } else {
                            z10 = zIsEmpty;
                            f3 = fDp;
                            i11 = i9;
                            i12 = i10;
                            storyPrivacyBottomSheet2 = storyPrivacyBottomSheet3;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat9 = (TLRPC.Chat) tLObject2;
                                boolean zContainsKey7 = map.containsKey(Long.valueOf(chat9.id));
                                ItemInner itemInner41 = new ItemInner(3, true);
                                itemInner41.chat = chat9;
                                itemInner41.checked = zContainsKey7;
                                i14 = this.pageType;
                                if (i14 != 2) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                itemInner41.red = z11;
                                arrayList5.add(itemInner41);
                                iDp = AndroidUtilities.dp(f);
                            } else {
                                i13 = i12;
                                fDp = f3;
                            }
                            i9 = i11 + 1;
                            storyPrivacyBottomSheet3 = storyPrivacyBottomSheet2;
                            i10 = i13;
                            zIsEmpty = z10;
                        }
                        fDp = f3 + iDp;
                        i13 = i12 + 1;
                        i9 = i11 + 1;
                        storyPrivacyBottomSheet3 = storyPrivacyBottomSheet2;
                        i10 = i13;
                        zIsEmpty = z10;
                    }
                    i2 = i10;
                } else {
                    i2 = 0;
                }
                z5 = zIsEmpty;
                storyPrivacyBottomSheet = storyPrivacyBottomSheet3;
                i3 = 0;
                while (i3 < arrayListAccess$9200.size()) {
                    tLObject = (TLObject) arrayListAccess$9200.get(i3);
                    if (z5) {
                        if (TextUtils.isEmpty(lowerCase)) {
                            i5 = i3;
                            z6 = true;
                        } else if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user11 = (TLRPC.User) tLObject;
                            lowerCase4 = AndroidUtilities.translitSafe(UserObject.getUserName(user11)).toLowerCase();
                            if (lowerCase4.startsWith(lowerCase)) {
                                i5 = i3;
                            } else {
                                i5 = i3;
                            }
                            z6 = true;
                        } else {
                            i5 = i3;
                            if (tLObject instanceof TLRPC.Chat) {
                                chat = (TLRPC.Chat) tLObject;
                                lowerCase2 = AndroidUtilities.translitSafe(chat.title).toLowerCase();
                                if (!lowerCase2.startsWith(lowerCase)) {
                                    lowerCase3 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat)).toLowerCase();
                                    if (!lowerCase3.startsWith(lowerCase)) {
                                        arrayList3 = chat.usernames;
                                        if (arrayList3 != null) {
                                            i6 = 0;
                                            while (true) {
                                                if (i6 < arrayList3.size()) {
                                                    tL_username = arrayList3.get(i6);
                                                    if (tL_username.active) {
                                                    }
                                                    i6++;
                                                }
                                            }
                                        }
                                    }
                                }
                                z6 = true;
                            }
                            z6 = false;
                        }
                        if (z6) {
                            str = lowerCase;
                        } else if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user12 = (TLRPC.User) tLObject;
                            zContains = arrayList.contains(Long.valueOf(user12.id));
                            if (zContains) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            str = lowerCase;
                            ItemInner itemInner110 = new ItemInner(3, true);
                            itemInner110.user = user12;
                            itemInner110.checked = zContains;
                            itemInner110.halfChecked = z8;
                            i8 = this.pageType;
                            if (i8 != 2) {
                                z9 = true;
                            } else {
                                z9 = true;
                            }
                            itemInner110.red = z9;
                            arrayList5.add(itemInner110);
                            fDp += AndroidUtilities.dp(f);
                            i2++;
                        } else {
                            str = lowerCase;
                            if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat10 = (TLRPC.Chat) tLObject;
                                boolean zContainsKey8 = map.containsKey(Long.valueOf(chat10.id));
                                ItemInner itemInner111 = new ItemInner(3, true);
                                itemInner111.chat = chat10;
                                itemInner111.checked = zContainsKey8;
                                i7 = this.pageType;
                                if (i7 != 2) {
                                    z7 = true;
                                } else {
                                    z7 = true;
                                }
                                itemInner111.red = z7;
                                arrayList5.add(itemInner111);
                                fDp += AndroidUtilities.dp(f);
                                i2++;
                            }
                        }
                    } else {
                        if (TextUtils.isEmpty(lowerCase)) {
                            i5 = i3;
                            z6 = true;
                        } else if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user13 = (TLRPC.User) tLObject;
                            lowerCase4 = AndroidUtilities.translitSafe(UserObject.getUserName(user13)).toLowerCase();
                            if (lowerCase4.startsWith(lowerCase)) {
                                i5 = i3;
                            } else {
                                i5 = i3;
                            }
                            z6 = true;
                        } else {
                            i5 = i3;
                            if (tLObject instanceof TLRPC.Chat) {
                                chat = (TLRPC.Chat) tLObject;
                                lowerCase2 = AndroidUtilities.translitSafe(chat.title).toLowerCase();
                                if (!lowerCase2.startsWith(lowerCase)) {
                                    lowerCase3 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat)).toLowerCase();
                                    if (!lowerCase3.startsWith(lowerCase)) {
                                        arrayList3 = chat.usernames;
                                        if (arrayList3 != null) {
                                            i6 = 0;
                                            while (true) {
                                                if (i6 < arrayList3.size()) {
                                                    tL_username = arrayList3.get(i6);
                                                    if (tL_username.active) {
                                                    }
                                                    i6++;
                                                }
                                            }
                                        }
                                    }
                                }
                                z6 = true;
                            }
                            z6 = false;
                        }
                        if (z6) {
                            str = lowerCase;
                        } else if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user14 = (TLRPC.User) tLObject;
                            zContains = arrayList.contains(Long.valueOf(user14.id));
                            if (zContains) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            str = lowerCase;
                            ItemInner itemInner112 = new ItemInner(3, true);
                            itemInner112.user = user14;
                            itemInner112.checked = zContains;
                            itemInner112.halfChecked = z8;
                            i8 = this.pageType;
                            if (i8 != 2) {
                                z9 = true;
                            } else {
                                z9 = true;
                            }
                            itemInner112.red = z9;
                            arrayList5.add(itemInner112);
                            fDp += AndroidUtilities.dp(f);
                            i2++;
                        } else {
                            str = lowerCase;
                            if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat11 = (TLRPC.Chat) tLObject;
                                boolean zContainsKey9 = map.containsKey(Long.valueOf(chat11.id));
                                ItemInner itemInner113 = new ItemInner(3, true);
                                itemInner113.chat = chat11;
                                itemInner113.checked = zContainsKey9;
                                i7 = this.pageType;
                                if (i7 != 2) {
                                    z7 = true;
                                } else {
                                    z7 = true;
                                }
                                itemInner113.red = z7;
                                arrayList5.add(itemInner113);
                                fDp += AndroidUtilities.dp(f);
                                i2++;
                            }
                        }
                    }
                    i3 = i5 + 1;
                    lowerCase = str;
                }
                if (!z5) {
                    if (i2 == 0) {
                        arrayList5.add(new ItemInner(5, false));
                        fDp += AndroidUtilities.dp(150.0f);
                    }
                    recyclerListView = this.listView;
                    if (recyclerListView != null) {
                        int measuredHeight3 = (recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop()) - recyclerListView.getPaddingBottom();
                        if (((BottomSheet) storyPrivacyBottomSheet).keyboardVisible) {
                            i4 = this.keyboardHeight;
                        } else {
                            i4 = 0;
                        }
                        fDp3 = measuredHeight3 + i4;
                    } else {
                        fDp3 = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(f)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                    }
                    f2 = fDp3 - fDp;
                    if (f2 > 0.0f) {
                        ItemInner itemInner114 = new ItemInner(-1, false);
                        itemInner114.padHeight = (int) f2;
                        arrayList5.add(itemInner114);
                    }
                }
            } else {
                storyPrivacyBottomSheet = storyPrivacyBottomSheet3;
            }
            if (this.layoutManager.mReverseLayout) {
                Collections.reverse(arrayList5);
            }
            adapter = this.adapter;
            if (adapter != null) {
                if (z) {
                    adapter.notifyDataSetChanged();
                } else {
                    adapter.notifyDataSetChanged();
                }
            }
            this.contentView.invalidate();
        }

        public final void updateSectionCell(boolean z) {
            int i = 0;
            GraySectionCell graySectionCell = this.sectionCell;
            if (graySectionCell == null) {
                return;
            }
            int i2 = StoryPrivacyBottomSheet.$r8$clinit;
            StoryPrivacyBottomSheet.this.getClass();
            if (StoryPrivacyBottomSheet.mergeUsers(this.selectedUsers, this.selectedUsersByGroup).size() > 0) {
                graySectionCell.setRightText(LocaleController.getString(R.string.UsersDeselectAll), new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda3(this, i));
                return;
            }
            if (z) {
                graySectionCell.setRightText(null);
                return;
            }
            GraySectionCell.AnonymousClass1 anonymousClass1 = graySectionCell.rightTextView;
            anonymousClass1.setText(null, false, true);
            anonymousClass1.setOnClickListener(null);
            anonymousClass1.setVisibility(0);
        }

        public final void updateSpans(boolean z) {
            AnonymousClass1 anonymousClass1;
            ArrayList arrayList;
            Property property;
            Property property2;
            Property property3;
            int i = 0;
            ArrayList arrayList2 = this.selectedUsers;
            HashMap map = this.selectedUsersByGroup;
            int i2 = StoryPrivacyBottomSheet.$r8$clinit;
            StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
            storyPrivacyBottomSheet.getClass();
            HashSet<Long> hashSetMergeUsers = StoryPrivacyBottomSheet.mergeUsers(arrayList2, map);
            int i3 = this.pageType;
            if (i3 == 3) {
                storyPrivacyBottomSheet.selectedContactsCount = hashSetMergeUsers.size();
            } else if (i3 == 4) {
                storyPrivacyBottomSheet.excludedEveryoneCount = hashSetMergeUsers.size();
            }
            MessagesController messagesController = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount);
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int i4 = 0;
            while (true) {
                anonymousClass1 = this.searchField;
                int size = anonymousClass1.allSpans.size();
                arrayList = anonymousClass1.allSpans;
                if (i4 >= size) {
                    break;
                }
                GroupCreateSpan groupCreateSpan = (GroupCreateSpan) arrayList.get(i4);
                if (!hashSetMergeUsers.contains(Long.valueOf(groupCreateSpan.getUid()))) {
                    arrayList3.add(groupCreateSpan);
                }
                i4++;
            }
            for (Long l : hashSetMergeUsers) {
                long jLongValue = l.longValue();
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        Object user = jLongValue >= 0 ? messagesController.getUser(l) : messagesController.getChat(l);
                        if (user != null) {
                            GroupCreateSpan groupCreateSpan2 = new GroupCreateSpan(getContext(), user, null, true, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider);
                            groupCreateSpan2.setOnClickListener(this);
                            arrayList4.add(groupCreateSpan2);
                            break;
                        }
                        break;
                    }
                    if (((GroupCreateSpan) arrayList.get(i5)).getUid() == jLongValue) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            if (arrayList3.isEmpty() && arrayList4.isEmpty()) {
                return;
            }
            SearchUsersCell.SpansContainer spansContainer = anonymousClass1.spansContainer;
            SearchUsersCell searchUsersCell = (SearchUsersCell) spansContainer.this$0;
            searchUsersCell.ignoreScrollEvent = true;
            ArrayList arrayList5 = searchUsersCell.allSpans;
            arrayList5.removeAll(arrayList3);
            arrayList5.addAll(arrayList4);
            ArrayList arrayList6 = spansContainer.removingSpans;
            arrayList6.clear();
            arrayList6.addAll(arrayList3);
            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                ((GroupCreateSpan) arrayList3.get(i6)).setOnClickListener(null);
            }
            spansContainer.setupEndValues();
            if (z) {
                spansContainer.animationStarted = false;
                AnimatorSet animatorSet = new AnimatorSet();
                spansContainer.currentAnimation = animatorSet;
                animatorSet.addListener(new SearchUsersCell.SpansContainer.AnonymousClass2(spansContainer, arrayList3, i));
                ArrayList arrayList7 = spansContainer.animators;
                arrayList7.clear();
                ArrayList arrayList8 = spansContainer.animAddingSpans;
                arrayList8.clear();
                ArrayList arrayList9 = spansContainer.animRemovingSpans;
                arrayList9.clear();
                int i7 = 0;
                while (true) {
                    int size2 = arrayList3.size();
                    property = View.ALPHA;
                    property2 = View.SCALE_Y;
                    property3 = View.SCALE_X;
                    if (i7 >= size2) {
                        break;
                    }
                    GroupCreateSpan groupCreateSpan3 = (GroupCreateSpan) arrayList3.get(i7);
                    arrayList9.add(groupCreateSpan3);
                    arrayList7.add(ObjectAnimator.ofFloat(groupCreateSpan3, (Property<GroupCreateSpan, Float>) property3, 1.0f, 0.01f));
                    arrayList7.add(ObjectAnimator.ofFloat(groupCreateSpan3, (Property<GroupCreateSpan, Float>) property2, 1.0f, 0.01f));
                    arrayList7.add(ObjectAnimator.ofFloat(groupCreateSpan3, (Property<GroupCreateSpan, Float>) property, 1.0f, 0.0f));
                    i7++;
                }
                for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                    GroupCreateSpan groupCreateSpan4 = (GroupCreateSpan) arrayList4.get(i8);
                    arrayList8.add(groupCreateSpan4);
                    arrayList7.add(ObjectAnimator.ofFloat(groupCreateSpan4, (Property<GroupCreateSpan, Float>) property3, 0.01f, 1.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(groupCreateSpan4, (Property<GroupCreateSpan, Float>) property2, 0.01f, 1.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(groupCreateSpan4, (Property<GroupCreateSpan, Float>) property, 0.0f, 1.0f));
                }
            } else {
                for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                    spansContainer.removeView((View) arrayList3.get(i9));
                }
                arrayList6.clear();
                spansContainer.currentAnimation = null;
                spansContainer.animationStarted = false;
                searchUsersCell.editText.setAllowDrawCursor(true);
            }
            while (i < arrayList4.size()) {
                spansContainer.addView((View) arrayList4.get(i));
                i++;
            }
            spansContainer.requestLayout();
        }

        public final void updateTops() {
            boolean z = false;
            float searchFieldTop = getSearchFieldTop();
            boolean z2 = this.scrolling;
            AnonymousClass1 anonymousClass1 = this.searchField;
            if (z2 || this.keyboardMoving || getTranslationX() != 0.0f) {
                this.searchTranslationAnimating = false;
                ValueAnimator valueAnimator = this.searchFieldAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.searchFieldAnimator = null;
                }
                anonymousClass1.setTranslationY(searchFieldTop);
            } else if (!this.searchTranslationAnimating || Math.abs(this.searchTranslationAnimatingTo - searchFieldTop) > 1.0f) {
                this.searchTranslationAnimating = true;
                ValueAnimator valueAnimator2 = this.searchFieldAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.searchFieldAnimator = null;
                }
                float translationY = anonymousClass1.getTranslationY();
                this.searchTranslationAnimatingTo = searchFieldTop;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationY, searchFieldTop);
                this.searchFieldAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(this, 15));
                this.searchFieldAnimator.addListener(new WebviewActivity.AnonymousClass3.AnonymousClass1(this, 5));
                this.searchFieldAnimator.setInterpolator(new LinearInterpolator());
                this.searchFieldAnimator.setDuration(180L);
                this.searchFieldAnimator.start();
            }
            boolean z3 = this.containsHeader;
            HeaderCell headerCell = this.headerView;
            if (!z3) {
                headerCell.setVisibility(8);
                return;
            }
            headerCell.setVisibility(0);
            float paddingTop = -headerCell.getHeight();
            int i = 0;
            while (true) {
                RecyclerListView recyclerListView = this.listView;
                if (i >= recyclerListView.getChildCount()) {
                    z = true;
                    break;
                }
                View childAt = recyclerListView.getChildAt(i);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                    paddingTop = this.contentView.getPaddingTop() + childAt.getY();
                    break;
                }
                i++;
            }
            if (this.isActionBar != z) {
                this.isActionBar = z;
                headerCell.backDrawable.setRotation((z || this.pageType != 0) ? 0.0f : 1.0f, true);
            }
            headerCell.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, paddingTop));
        }
    }

    public final class UserCell extends FrameLayout {
        public Paint arrowPaint;
        public Path arrowPath;
        public final AvatarDrawable avatarDrawable;
        public final CheckBox2 checkBox;
        public long dialogId;
        public final Paint dividerPaint;
        public boolean drawArrow;
        public final BackupImageView imageView;
        public final boolean[] isOnline;
        public boolean needCheck;
        public boolean needDivider;
        public final RadioButton radioButton;
        public final Theme.ResourcesProvider resourcesProvider;
        public boolean sendAs;
        public final SimpleTextView subtitleTextView;
        public final SimpleTextView titleTextView;

        public UserCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            this.avatarDrawable = avatarDrawable;
            this.dividerPaint = new Paint(1);
            this.sendAs = false;
            this.needCheck = true;
            this.drawArrow = true;
            this.isOnline = new boolean[1];
            this.resourcesProvider = resourcesProvider;
            avatarDrawable.roundRadius = AndroidUtilities.dp(40.0f);
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
            addView(backupImageView);
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.titleTextView = simpleTextView;
            simpleTextView.setTypeface(AndroidUtilities.bold());
            simpleTextView.setTextSize(16);
            int i = Theme.key_dialogTextBlack;
            simpleTextView.setTextColor(Theme.getColor(i, resourcesProvider));
            simpleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            NotificationCenter.listenEmojiLoading(simpleTextView);
            addView(simpleTextView);
            SimpleTextView simpleTextView2 = new SimpleTextView(context);
            this.subtitleTextView = simpleTextView2;
            simpleTextView2.setTextSize(14);
            simpleTextView2.setTextColor(Theme.getColor(i, resourcesProvider));
            simpleTextView2.setGravity(LocaleController.isRTL ? 5 : 3);
            NotificationCenter.listenEmojiLoading(simpleTextView2);
            addView(simpleTextView2);
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            int i2 = Theme.key_dialogRoundCheckBox;
            int i3 = Theme.key_checkboxDisabled;
            int i4 = Theme.key_dialogRoundCheckBoxCheck;
            CheckBoxBase checkBoxBase = checkBox2.checkBoxBase;
            checkBoxBase.setColor(i2, i3, i4);
            checkBox2.setDrawUnchecked(true);
            checkBox2.setDrawBackgroundAsArc(10);
            addView(checkBox2);
            checkBoxBase.setChecked(-1, false, false);
            checkBox2.setVisibility(8);
            RadioButton radioButton = new RadioButton(context);
            this.radioButton = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            int color = Theme.getColor(i3, resourcesProvider);
            int color2 = Theme.getColor(Theme.key_dialogRadioBackgroundChecked, resourcesProvider);
            radioButton.color = color;
            radioButton.checkedColor = color2;
            radioButton.invalidate();
            addView(radioButton);
            radioButton.setVisibility(8);
            updateLayouts();
        }

        private void setSubtitle(CharSequence charSequence) {
            SimpleTextView simpleTextView = this.titleTextView;
            SimpleTextView simpleTextView2 = this.subtitleTextView;
            if (charSequence == null) {
                simpleTextView.setTranslationY(0.0f);
                simpleTextView2.setVisibility(8);
            } else {
                simpleTextView.setTranslationY(AndroidUtilities.dp(-9.0f));
                simpleTextView2.setTranslationY(AndroidUtilities.dp(12.0f));
                simpleTextView2.setText(charSequence, false);
                simpleTextView2.setVisibility(0);
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            Canvas canvas2;
            Paint paint;
            super.onDraw(canvas);
            if (this.needDivider) {
                Paint paint2 = this.dividerPaint;
                paint2.setColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
                if (LocaleController.isRTL) {
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(105.0f), getHeight(), paint2);
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(AndroidUtilities.dp(105.0f), getHeight() - 1, getWidth(), getHeight(), paint2);
                }
            } else {
                canvas2 = canvas;
            }
            Path path = this.arrowPath;
            if (path == null || (paint = this.arrowPaint) == null || this.needCheck || !this.sendAs || !this.drawArrow) {
                return;
            }
            canvas2.drawPath(path, paint);
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean z;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            CheckBox2 checkBox2 = this.checkBox;
            boolean z2 = false;
            if (checkBox2 != null) {
                try {
                    if (checkBox2.getVisibility() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (Exception unused) {
                    return;
                }
            } else {
                z = false;
            }
            RadioButton radioButton = this.radioButton;
            if (radioButton != null && radioButton.getVisibility() == 0) {
                z2 = true;
            }
            if (z || z2) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(z ? checkBox2.checkBoxBase.isChecked : radioButton.isChecked);
                accessibilityNodeInfo.setClassName(z ? "android.widget.CheckBox" : "android.widget.RadioButton");
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((!this.sendAs || this.needCheck) ? 56.0f : 62.0f), 1073741824));
            if (this.needCheck || !this.sendAs) {
                return;
            }
            Path path = this.arrowPath;
            if (path == null) {
                this.arrowPath = new Path();
            } else {
                path.rewind();
            }
            float fDp = LocaleController.isRTL ? AndroidUtilities.dp(31.0f) : getMeasuredWidth() - AndroidUtilities.dp(31.0f);
            float measuredHeight = getMeasuredHeight() / 2.0f;
            float f = LocaleController.isRTL ? -1.0f : 1.0f;
            this.arrowPath.moveTo(fDp, measuredHeight - AndroidUtilities.dp(6.0f));
            this.arrowPath.lineTo((f * AndroidUtilities.dp(6.0f)) + fDp, measuredHeight);
            this.arrowPath.lineTo(fDp, measuredHeight + AndroidUtilities.dp(6.0f));
            if (this.arrowPaint == null) {
                Paint paint = new Paint(1);
                this.arrowPaint = paint;
                paint.setStyle(Paint.Style.STROKE);
                this.arrowPaint.setStrokeCap(Paint.Cap.ROUND);
            }
            this.arrowPaint.setStrokeWidth(AndroidUtilities.dpf2(1.86f));
            this.arrowPaint.setColor(Theme.multAlpha(0.3f, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider)));
        }

        public void set(Object obj) {
            boolean z = obj instanceof TLRPC.User;
            SimpleTextView simpleTextView = this.titleTextView;
            if (z) {
                simpleTextView.setTypeface(AndroidUtilities.bold());
                simpleTextView.setTranslationX(0.0f);
                setUser((TLRPC.User) obj);
            } else if (obj instanceof TLRPC.Chat) {
                simpleTextView.setTypeface(AndroidUtilities.bold());
                simpleTextView.setTranslationX(0.0f);
                setChat(0, (TLRPC.Chat) obj);
            } else if (obj instanceof String) {
                simpleTextView.setTypeface(null);
                simpleTextView.setTranslationX((-AndroidUtilities.dp(52.0f)) * (LocaleController.isRTL ? -1 : 1));
                simpleTextView.setText((String) obj, false);
            }
        }

        public final void setChat(int i, TLRPC.Chat chat) {
            String lowerCase;
            this.dialogId = chat == null ? 0L : -chat.id;
            AvatarDrawable avatarDrawable = this.avatarDrawable;
            avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
            BackupImageView backupImageView = this.imageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(ChatObject.isForum(chat) ? 12.0f : 20.0f));
            backupImageView.imageReceiver.setForUserOrChat(chat, avatarDrawable);
            backupImageView.onNewImageSet();
            String str = chat.title;
            SimpleTextView simpleTextView = this.titleTextView;
            simpleTextView.setText(Emoji.replaceEmoji(str, simpleTextView.getPaint().getFontMetricsInt(), false), false);
            boolean[] zArr = this.isOnline;
            zArr[0] = false;
            if (this.sendAs) {
                if (i <= 0) {
                    i = chat.participants_count;
                }
                boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (i >= 1) {
                    lowerCase = LocaleController.formatPluralString(zIsChannelAndNotMegaGroup ? "Subscribers" : "Members", i, new Object[0]);
                } else {
                    lowerCase = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup);
                }
            } else if (!ChatObject.isChannel(chat) || chat.megagroup) {
                if (i >= 1) {
                    lowerCase = LocaleController.formatPluralStringComma("Members", i - 1);
                } else if (chat.has_geo) {
                    lowerCase = LocaleController.getString(R.string.MegaLocation);
                } else {
                    lowerCase = !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
                }
            } else if (i >= 1) {
                lowerCase = LocaleController.formatPluralStringComma("Subscribers", i - 1);
            } else {
                lowerCase = !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
            }
            setSubtitle(lowerCase);
            this.subtitleTextView.setTextColor(Theme.getColor(zArr[0] ? Theme.key_dialogTextBlue2 : Theme.key_dialogTextGray3, this.resourcesProvider));
            this.checkBox.setVisibility(this.needCheck ? 0 : 8);
            this.radioButton.setVisibility(8);
            setCheckboxAlpha(i > 200 ? 0.3f : 1.0f, false);
        }

        public final void setCheckboxAlpha(float f, boolean z) {
            RadioButton radioButton = this.radioButton;
            CheckBox2 checkBox2 = this.checkBox;
            if (!z) {
                checkBox2.animate().cancel();
                checkBox2.setAlpha(f);
                radioButton.animate().cancel();
                radioButton.setAlpha(f);
                return;
            }
            if (Math.abs(checkBox2.getAlpha() - f) > 0.1d) {
                checkBox2.animate().cancel();
                checkBox2.animate().alpha(f).start();
            }
            if (Math.abs(radioButton.getAlpha() - f) > 0.1d) {
                radioButton.animate().cancel();
                radioButton.animate().alpha(f).start();
            }
        }

        public final void setChecked(boolean z, boolean z2) {
            CheckBox2 checkBox2 = this.checkBox;
            if (checkBox2.getVisibility() == 0) {
                checkBox2.checkBoxBase.setChecked(-1, z, z2);
            }
            RadioButton radioButton = this.radioButton;
            if (radioButton.getVisibility() == 0) {
                radioButton.setChecked(z, z2);
            }
        }

        public void setDivider(boolean z) {
            this.needDivider = z;
            setWillNotDraw(!z && (this.needCheck || !this.sendAs));
        }

        public final void setIsSendAs(boolean z, boolean z2) {
            this.sendAs = z;
            if (z2 != this.needCheck) {
                this.needCheck = z2;
                updateLayouts();
            }
            if (!this.needCheck) {
                this.radioButton.setVisibility(8);
                this.checkBox.setVisibility(8);
            }
            setWillNotDraw(!this.needDivider && (this.needCheck || !this.sendAs));
        }

        public void setRedCheckbox(boolean z) {
            CheckBox2 checkBox2 = this.checkBox;
            checkBox2.checkBoxBase.setColor(z ? Theme.key_color_red : Theme.key_dialogRoundCheckBox, Theme.key_checkboxDisabled, Theme.key_dialogRoundCheckBoxCheck);
        }

        public final void setType(int i, TLRPC.User user, int i2) {
            SimpleTextView simpleTextView = this.titleTextView;
            SimpleTextView simpleTextView2 = this.subtitleTextView;
            AvatarDrawable avatarDrawable = this.avatarDrawable;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (i == 4) {
                simpleTextView.setText(LocaleController.getString(R.string.StoryPrivacyOptionEveryone), false);
                if (i2 == 1 && user != null) {
                    setSubtitle(withArrow(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), simpleTextView2.getPaint().getFontMetricsInt(), false)));
                } else if (i2 > 0) {
                    setSubtitle(withArrow(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i2, new Object[0])));
                } else {
                    setSubtitle(withArrow(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
                }
                simpleTextView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlue2, resourcesProvider));
                avatarDrawable.setAvatarType(7);
                avatarDrawable.setColor(-15292942, -15630089);
            } else if (i == 2) {
                simpleTextView.setText(LocaleController.getString(R.string.StoryPrivacyOptionContacts), false);
                if (i2 == 1 && user != null) {
                    setSubtitle(withArrow(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), simpleTextView2.getPaint().getFontMetricsInt(), false)));
                } else if (i2 > 0) {
                    setSubtitle(withArrow(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i2, new Object[0])));
                } else {
                    setSubtitle(withArrow(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
                }
                simpleTextView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlue2, resourcesProvider));
                avatarDrawable.setAvatarType(4);
                avatarDrawable.setColor(-3905294, -6923014);
            } else if (i == 1) {
                simpleTextView.setText(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends), false);
                if (i2 == 1 && user != null) {
                    setSubtitle(withArrow(Emoji.replaceEmoji(UserObject.getUserName(user), simpleTextView2.getPaint().getFontMetricsInt(), false)));
                } else if (i2 > 0) {
                    setSubtitle(withArrow(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i2, new Object[0])));
                } else {
                    setSubtitle(withArrow(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriendsDetail)));
                }
                simpleTextView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlue2, resourcesProvider));
                avatarDrawable.setAvatarType(15);
                avatarDrawable.setColor(-7808710, -13781445);
            } else if (i == 3) {
                simpleTextView.setText(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts), false);
                if (i2 == 1 && user != null) {
                    setSubtitle(withArrow(Emoji.replaceEmoji(UserObject.getUserName(user), simpleTextView2.getPaint().getFontMetricsInt(), false)));
                } else if (i2 > 0) {
                    setSubtitle(withArrow(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i2, new Object[0])));
                } else {
                    setSubtitle(withArrow(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContactsDetail)));
                }
                simpleTextView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlue2, resourcesProvider));
                avatarDrawable.setAvatarType(6);
                avatarDrawable.setColor(-18621, -618956);
            }
            this.checkBox.setVisibility(8);
            this.radioButton.setVisibility(this.needCheck ? 0 : 8);
            BackupImageView backupImageView = this.imageView;
            backupImageView.setImageDrawable(avatarDrawable);
            backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        }

        public void setUser(TLRPC.User user) {
            this.dialogId = user == null ? 0L : user.id;
            AvatarDrawable avatarDrawable = this.avatarDrawable;
            avatarDrawable.setInfo(UserConfig.selectedAccount, user);
            BackupImageView backupImageView = this.imageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
            backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
            backupImageView.onNewImageSet();
            String userName = UserObject.getUserName(user);
            SimpleTextView simpleTextView = this.titleTextView;
            simpleTextView.setText(Emoji.replaceEmoji(userName, simpleTextView.getPaint().getFontMetricsInt(), false), false);
            boolean[] zArr = this.isOnline;
            zArr[0] = false;
            boolean z = this.sendAs;
            SimpleTextView simpleTextView2 = this.subtitleTextView;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (z) {
                setSubtitle(LocaleController.getString(R.string.VoipGroupPersonalAccount));
                simpleTextView2.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, resourcesProvider));
            } else {
                setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
                simpleTextView2.setTextColor(Theme.getColor(zArr[0] ? Theme.key_dialogTextBlue2 : Theme.key_dialogTextGray3, resourcesProvider));
            }
            CheckBox2 checkBox2 = this.checkBox;
            checkBox2.setVisibility(this.needCheck ? 0 : 8);
            checkBox2.setAlpha(1.0f);
            this.radioButton.setVisibility(8);
        }

        public final void updateLayouts() {
            float f;
            float f2;
            float f3;
            float f4;
            int i = (LocaleController.isRTL ? 5 : 3) | 16;
            boolean z = this.needCheck;
            this.imageView.setLayoutParams(LayoutHelper.createFrame(40, 40.0f, i, z ? 53.0f : 16.0f, 0.0f, z ? 53.0f : 16.0f, 0.0f));
            boolean z2 = LocaleController.isRTL;
            int i2 = (z2 ? 5 : 3) | 16;
            if (z2) {
                f = 20.0f;
            } else {
                f = this.needCheck ? 105 : 68;
            }
            if (z2) {
                f2 = this.needCheck ? 105 : 68;
            } else {
                f2 = 20.0f;
            }
            this.titleTextView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, i2, f, 0.0f, f2, 0.0f));
            boolean z3 = LocaleController.isRTL;
            int i3 = (z3 ? 5 : 3) | 16;
            if (z3) {
                f3 = 20.0f;
            } else {
                f3 = this.needCheck ? 105 : 68;
            }
            if (z3) {
                f4 = this.needCheck ? 105 : 68;
            } else {
                f4 = 20.0f;
            }
            this.subtitleTextView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, i3, f3, 0.0f, f4, 0.0f));
            this.checkBox.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            this.radioButton.setLayoutParams(LayoutHelper.createFrame(22, 22.0f, (LocaleController.isRTL ? 5 : 3) | 16, 14.0f, 0.0f, 15.0f, 0.0f));
        }

        public final SpannableStringBuilder withArrow(CharSequence charSequence) {
            SpannableString spannableString = new SpannableString(">");
            Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(2, drawable);
            drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
            spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
            return spannableStringBuilder;
        }
    }

    public StoryPrivacyBottomSheet(final Context context, int i, DarkThemeResourceProvider darkThemeResourceProvider) {
        super(context, darkThemeResourceProvider, true, false);
        this.excludedEveryone = new ArrayList();
        this.excludedEveryoneByGroup = new HashMap();
        this.excludedEveryoneCount = 0;
        this.excludedContacts = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.selectedContacts = arrayList;
        this.selectedContactsByGroup = new HashMap();
        this.selectedContactsCount = 0;
        this.selectedAlbums = new HashSet();
        this.allowComments = true;
        this.allowScreenshots = true;
        this.keepOnMyPage = false;
        this.allowCover = true;
        this.canChangePeer = true;
        this.isRtmpStream = false;
        this.commentsPrice = 0;
        this.storiesCount = 1;
        this.messageUsers = new ArrayList();
        this.activePage = 1;
        this.selectedType = 4;
        this.smallChatsParticipantsCount = new HashMap();
        this.storyPeriod = 86400;
        this.backgroundPaint = new Paint(1);
        this.allowSmallChats = true;
        this.isEdit = false;
        this.storyPeriod = i;
        String string = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_contacts", null);
        if (string != null) {
            String[] strArrSplit = string.split(",");
            arrayList.clear();
            for (String str : strArrSplit) {
                try {
                    this.selectedContacts.add(Long.valueOf(Long.parseLong(str)));
                } catch (Exception unused) {
                }
            }
        }
        String string2 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_grpcontacts", null);
        if (string2 != null) {
            String[] strArrSplit2 = string2.split(";");
            this.selectedContactsByGroup.clear();
            for (String str2 : strArrSplit2) {
                String[] strArrSplit3 = str2.split(",");
                if (strArrSplit3.length > 0) {
                    try {
                        long j = Long.parseLong(strArrSplit3[0]);
                        ArrayList arrayList2 = new ArrayList();
                        for (int i2 = 1; i2 < strArrSplit3.length; i2++) {
                            arrayList2.add(Long.valueOf(Long.parseLong(strArrSplit3[i2])));
                        }
                        this.selectedContactsByGroup.put(Long.valueOf(j), arrayList2);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        String string3 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_everyoneexcept", null);
        if (string3 != null) {
            String[] strArrSplit4 = string3.split(",");
            this.excludedEveryone.clear();
            for (String str3 : strArrSplit4) {
                try {
                    this.excludedEveryone.add(Long.valueOf(Long.parseLong(str3)));
                } catch (Exception unused3) {
                }
            }
        }
        String string4 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_grpeveryoneexcept", null);
        if (string4 != null) {
            String[] strArrSplit5 = string4.split(";");
            this.excludedEveryoneByGroup.clear();
            for (String str4 : strArrSplit5) {
                String[] strArrSplit6 = str4.split(",");
                if (strArrSplit6.length > 0) {
                    try {
                        long j2 = Long.parseLong(strArrSplit6[0]);
                        ArrayList arrayList3 = new ArrayList();
                        for (int i3 = 1; i3 < strArrSplit6.length; i3++) {
                            arrayList3.add(Long.valueOf(Long.parseLong(strArrSplit6[i3])));
                        }
                        this.excludedEveryoneByGroup.put(Long.valueOf(j2), arrayList3);
                    } catch (Exception unused4) {
                    }
                }
            }
        }
        String string5 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_excluded", null);
        if (string5 != null) {
            String[] strArrSplit7 = string5.split(",");
            this.excludedContacts.clear();
            for (String str5 : strArrSplit7) {
                try {
                    this.excludedContacts.add(Long.valueOf(Long.parseLong(str5)));
                } catch (Exception unused5) {
                }
            }
        }
        this.selectedContactsCount = mergeUsers(this.selectedContacts, this.selectedContactsByGroup).size();
        this.excludedEveryoneCount = mergeUsers(this.excludedEveryone, this.excludedEveryoneByGroup).size();
        this.allowScreenshots = !MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_noforwards", false);
        this.keepOnMyPage = MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_keep", true);
        init$2(context);
        final int i4 = 0;
        this.viewPager.setAdapter(new ViewPagerFixed.Adapter(this) {
            public final StoryPrivacyBottomSheet this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void bindView(View view, int i5, int i6) {
                switch (i4) {
                    case 0:
                        ((Page) view).bind(i6);
                        break;
                    default:
                        ((Page) view).bind(i6);
                        break;
                }
            }

            @Override
            public final View createView(int i5) {
                switch (i4) {
                    case 0:
                        break;
                }
                return this.this$0.new Page(context);
            }

            @Override
            public final int getItemCount() {
                switch (i4) {
                    case 0:
                        return 2;
                    default:
                        return 1;
                }
            }

            @Override
            public final int getItemViewType(int i5) {
                switch (i4) {
                    case 0:
                        if (i5 == 0) {
                            return 0;
                        }
                        return this.this$0.activePage;
                    default:
                        return 5;
                }
            }
        });
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new TodoItemMenu$$ExternalSyntheticLambda9(2, this, messagesStorage));
        MessagesController.getInstance(this.currentAccount).getStoriesController().loadBlocklist();
        MessagesController.getInstance(this.currentAccount).getStoriesController().loadSendAs();
    }

    public static ArrayList access$6500(StoryPrivacyBottomSheet storyPrivacyBottomSheet) {
        TLRPC.User user;
        ArrayList contacts = storyPrivacyBottomSheet.getContacts();
        int i = 0;
        while (i < contacts.size()) {
            TLObject tLObject = (TLObject) contacts.get(i);
            if ((tLObject instanceof TLRPC.User) && ((user = (TLRPC.User) tLObject) == null || !user.close_friend)) {
                contacts.remove(i);
                i--;
            }
            i++;
        }
        return contacts;
    }

    public static ArrayList access$9000(StoryPrivacyBottomSheet storyPrivacyBottomSheet) {
        TLRPC.Chat chat;
        storyPrivacyBottomSheet.getClass();
        ArrayList arrayList = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(storyPrivacyBottomSheet.currentAccount);
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        for (int i = 0; i < allDialogs.size(); i++) {
            TLRPC.Dialog dialog = allDialogs.get(i);
            if (messagesController.canAddToForward(dialog)) {
                if (DialogObject.isUserDialog(dialog.id)) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(dialog.id));
                    if (user != null && !user.bot && user.id != 777000 && !UserObject.isUserSelf(user)) {
                        arrayList.add(user);
                    }
                } else if (DialogObject.isChatDialog(dialog.id) && (chat = messagesController.getChat(Long.valueOf(-dialog.id))) != null && !ChatObject.isForum(chat)) {
                    arrayList.add(chat);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList access$9200(StoryPrivacyBottomSheet storyPrivacyBottomSheet, boolean z, boolean z2) {
        TLRPC.User user;
        TLRPC.Chat chat;
        MessagesController messagesController = MessagesController.getInstance(storyPrivacyBottomSheet.currentAccount);
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        ConcurrentHashMap<Long, TLRPC.TL_contact> concurrentHashMap = ContactsController.getInstance(storyPrivacyBottomSheet.currentAccount).contactsDict;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            if (!storyPrivacyBottomSheet.loadedContacts) {
                ContactsController.getInstance(storyPrivacyBottomSheet.currentAccount).loadContacts(false, 0L);
            }
            storyPrivacyBottomSheet.loadedContacts = true;
        }
        for (int i = 0; i < allDialogs.size(); i++) {
            TLRPC.Dialog dialog = allDialogs.get(i);
            if (DialogObject.isUserDialog(dialog.id)) {
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(dialog.id));
                if (user2 != null && !user2.bot && user2.id != 777000 && !UserObject.isUserSelf(user2) && !user2.deleted && (!z || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(user2.id)) != null))) {
                    map.put(Long.valueOf(user2.id), Boolean.TRUE);
                    arrayList.add(user2);
                }
            } else if (z2 && DialogObject.isChatDialog(dialog.id) && (chat = messagesController.getChat(Long.valueOf(-dialog.id))) != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                map.put(Long.valueOf(-chat.id), Boolean.TRUE);
                arrayList.add(chat);
            }
        }
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<Long, TLRPC.TL_contact>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Long key = it.next().getKey();
                key.getClass();
                if (!map.containsKey(key) && (user = messagesController.getUser(key)) != null && !user.bot && user.id != 777000 && !UserObject.isUserSelf(user)) {
                    arrayList.add(user);
                    map.put(Long.valueOf(user.id), Boolean.TRUE);
                }
            }
        }
        return arrayList;
    }

    public static int access$9900(StoryPrivacyBottomSheet storyPrivacyBottomSheet, TLRPC.Chat chat) {
        Integer num;
        int i;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(storyPrivacyBottomSheet.currentAccount).getChatFull(chat.id);
        if (chatFull != null && (i = chatFull.participants_count) > 0) {
            return i;
        }
        HashMap map = storyPrivacyBottomSheet.smallChatsParticipantsCount;
        return (map == null || (num = (Integer) map.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public static HashSet mergeUsers(ArrayList arrayList, HashMap map) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                hashSet.addAll((ArrayList) it.next());
            }
        }
        return hashSet;
    }

    public final void allowCover(boolean z) {
        this.allowCover = z;
        PollItemMenu.AnonymousClass3 anonymousClass3 = this.viewPager;
        if (anonymousClass3 != null) {
            for (View view : anonymousClass3.getViewPages()) {
                if (view instanceof Page) {
                    ((Page) view).updateButton(false);
                }
            }
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof Page) {
            return ((Page) currentView).wasAtTop;
        }
        return true;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    public final void closeKeyboard() {
        Page.AnonymousClass1 anonymousClass1;
        for (View view : this.viewPager.getViewPages()) {
            if ((view instanceof Page) && (anonymousClass1 = ((Page) view).searchField) != null) {
                AndroidUtilities.hideKeyboard(anonymousClass1.editText);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        PollItemMenu.AnonymousClass3 anonymousClass3 = this.viewPager;
        if (anonymousClass3 == null) {
            return;
        }
        int i3 = 0;
        if (i == NotificationCenter.contactsDidLoad) {
            View[] viewPages = anonymousClass3.getViewPages();
            View view = viewPages[0];
            if (view instanceof Page) {
                ((Page) view).updateItems(true, true);
            }
            View view2 = viewPages[1];
            if (view2 instanceof Page) {
                ((Page) view2).updateItems(true, true);
                return;
            }
            return;
        }
        if (i != NotificationCenter.storiesBlocklistUpdate) {
            if (i == NotificationCenter.storiesSendAsUpdate) {
                View[] viewPages2 = anonymousClass3.getViewPages();
                while (i3 < viewPages2.length) {
                    View view3 = viewPages2[i3];
                    if (view3 instanceof Page) {
                        Page page = (Page) view3;
                        if (page.pageType == 0) {
                            page.updateItems(true, true);
                        }
                    }
                    i3++;
                }
                return;
            }
            return;
        }
        View[] viewPages3 = anonymousClass3.getViewPages();
        while (i3 < viewPages3.length) {
            View view4 = viewPages3[i3];
            if (view4 instanceof Page) {
                Page page2 = (Page) view4;
                int i4 = page2.pageType;
                if (i4 == 6) {
                    page2.applyBlocklist(true);
                } else if (i4 == 0) {
                    page2.updateItems(true, true);
                }
            }
            i3++;
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        StoryPrivacy storyPrivacy;
        Utilities.Callback callback = this.onDismiss;
        ArrayList arrayList = this.excludedContacts;
        HashMap map = this.excludedEveryoneByGroup;
        ArrayList arrayList2 = this.excludedEveryone;
        HashMap map2 = this.selectedContactsByGroup;
        ArrayList arrayList3 = this.selectedContacts;
        if (callback != null) {
            int i = this.selectedType;
            if (i == 3) {
                storyPrivacy = new StoryPrivacy(this.selectedType, this.currentAccount, new ArrayList(mergeUsers(arrayList3, map2)));
                ArrayList arrayList4 = storyPrivacy.selectedUserIds;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap map3 = storyPrivacy.selectedUserIdsByGroup;
                map3.clear();
                map3.putAll(map2);
            } else if (i == 4) {
                storyPrivacy = new StoryPrivacy(this.selectedType, this.currentAccount, new ArrayList(mergeUsers(arrayList2, map)));
                ArrayList arrayList5 = storyPrivacy.selectedUserIds;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap map4 = storyPrivacy.selectedUserIdsByGroup;
                map4.clear();
                map4.putAll(map);
            } else {
                storyPrivacy = i == 2 ? new StoryPrivacy(i, this.currentAccount, arrayList) : new StoryPrivacy(i, this.currentAccount, (ArrayList) null);
            }
            this.onDismiss.run(storyPrivacy);
            this.onDismiss = null;
        }
        Bulletin.removeDelegate(this.container);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map2.entrySet()) {
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append(entry.getKey());
            sb.append(",");
            sb.append(TextUtils.join(",", (Iterable) entry.getValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry2 : map.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(";");
            }
            sb2.append(entry2.getKey());
            sb2.append(",");
            sb2.append(TextUtils.join(",", (Iterable) entry2.getValue()));
        }
        AiTonesController$$ExternalSyntheticOutline0.m(this.currentAccount).putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb2.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.allowScreenshots).putBoolean("story_keep", this.keepOnMyPage).apply();
        super.lambda$showGiftOfferSheet$15();
    }

    @Override
    public final void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
        super.dismissInternal();
    }

    public final void done(StoryPrivacy storyPrivacy, Runnable runnable, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (this.warnUsers != null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            for (int i = 0; i < this.warnUsers.size(); i++) {
                String str = (String) this.warnUsers.get(i);
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(user.id));
                    if (user2 != null) {
                        user = user2;
                    }
                    if (!user.bot && !storyPrivacy.containsUser(user)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (arrayList.isEmpty() || z) {
            View view = this.viewPager.getViewPages()[0];
            ButtonWithCounterView buttonWithCounterView = view instanceof Page ? ((Page) view).button : null;
            if (buttonWithCounterView != null) {
                buttonWithCounterView.setLoading(true);
            }
            DoneCallback doneCallback = this.onDone;
            if (doneCallback != null) {
                doneCallback.done(storyPrivacy, this.allowComments, this.allowScreenshots, this.keepOnMyPage, this.isRtmpStream, this.selectedPeer, this.commentsPrice, new ButtonWithCounterView$$ExternalSyntheticLambda3(buttonWithCounterView, runnable, 1), new VoIPFragment$12$$ExternalSyntheticLambda0(buttonWithCounterView, 15));
                return;
            } else {
                runnable.run();
                return;
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i2 = 0; i2 < Math.min(2, arrayList.size()); i2++) {
            if (i2 > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            SpannableString spannableString = new SpannableString("@" + ((String) arrayList.get(i2)));
            spannableString.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        String string = LocaleController.getString(R.string.StoryRestrictions);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryRestrictionsInfo), spannableStringBuilder);
        builder.setPositiveButton(LocaleController.getString(R.string.Proceed), new VoIPFragment$$ExternalSyntheticLambda42(this, storyPrivacy, runnable, 23));
        ArticleViewer.IBlock.CC.m(R.string.Cancel, builder, (AlertDialog.OnButtonClickListener) null);
    }

    public final ArrayList getContacts() {
        TLRPC.User user;
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.TL_contact> arrayList2 = ContactsController.getInstance(this.currentAccount).contacts;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            ContactsController.getInstance(this.currentAccount).loadContacts(false, 0L);
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        if (arrayList2 != null) {
            for (int i = 0; i < arrayList2.size(); i++) {
                TLRPC.TL_contact tL_contact = arrayList2.get(i);
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && !UserObject.isUserSelf(user) && !user.bot && user.id != 777000) {
                    arrayList.add(user);
                }
            }
        }
        return arrayList;
    }

    public final StoriesController getStoriesController() {
        return MessagesController.getInstance(this.currentAccount).getStoriesController();
    }

    public final void init$2(Context context) {
        Bulletin.addDelegate(this.container, new LaunchActivity.AnonymousClass7(12));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesSendAsUpdate);
        int i = Theme.key_dialogBackground;
        this.backgroundPaint.setColor(Theme.getColor(i, this.resourcesProvider));
        fixNavigationBar(Theme.getColor(i, this.resourcesProvider));
        this.containerView = new CommunitySheet.ContainerView(this, context);
        PollItemMenu.AnonymousClass3 anonymousClass3 = new PollItemMenu.AnonymousClass3(this, context, 6);
        this.viewPager = anonymousClass3;
        int i2 = this.backgroundPaddingLeft;
        anonymousClass3.setPadding(i2, 0, i2, 0);
        this.containerView.addView(this.viewPager, LayoutHelper.createFrame(-1, -1, 119));
    }

    public final void isEdit(boolean z) {
        this.isEdit = z;
        PollItemMenu.AnonymousClass3 anonymousClass3 = this.viewPager;
        if (anonymousClass3 != null) {
            for (View view : anonymousClass3.getViewPages()) {
                if (view instanceof Page) {
                    Page page = (Page) view;
                    page.updateItems(false, true);
                    page.updateButton(false);
                }
            }
        }
    }

    @Override
    public final void lambda$openCrafting$8() {
        if (this.viewPager.getCurrentPosition() <= 0) {
            super.lambda$openCrafting$8();
            return;
        }
        closeKeyboard();
        PollItemMenu.AnonymousClass3 anonymousClass3 = this.viewPager;
        anonymousClass3.scrollToPosition$1(anonymousClass3.getCurrentPosition() - 1);
    }

    public final void setCount(int i) {
        this.storiesCount = i;
        PollItemMenu.AnonymousClass3 anonymousClass3 = this.viewPager;
        if (anonymousClass3 != null) {
            for (View view : anonymousClass3.getViewPages()) {
                if (view instanceof Page) {
                    ((Page) view).updateButton(false);
                }
            }
        }
    }

    public final void setCover(Bitmap bitmap) {
        this.coverDrawable = bitmap == null ? null : new BitmapDrawable(bitmap);
        PollItemMenu.AnonymousClass3 anonymousClass3 = this.viewPager;
        if (anonymousClass3 != null) {
            for (View view : anonymousClass3.getViewPages()) {
                if (view instanceof Page) {
                    Page page = (Page) view;
                    page.updateItems(false, true);
                    page.updateButton(false);
                }
            }
        }
    }

    public final void setPeer(TLRPC.InputPeer inputPeer) {
        this.selectedPeer = inputPeer;
        this.selectedAlbums.clear();
        View[] viewPages = this.viewPager.getViewPages();
        View view = viewPages[0];
        if (view instanceof Page) {
            Page page = (Page) view;
            page.bind(page.pageType);
        }
        View view2 = viewPages[1];
        if (view2 instanceof Page) {
            Page page2 = (Page) view2;
            page2.bind(page2.pageType);
        }
    }

    public final void setValue(StoryPrivacy storyPrivacy) {
        if (storyPrivacy == null) {
            return;
        }
        int i = storyPrivacy.type;
        this.selectedType = i;
        ArrayList arrayList = storyPrivacy.selectedUserIds;
        if (i == 2) {
            ArrayList arrayList2 = this.excludedContacts;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        } else {
            HashMap map = storyPrivacy.selectedUserIdsByGroup;
            if (i == 3) {
                ArrayList arrayList3 = this.selectedContacts;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                HashMap map2 = this.selectedContactsByGroup;
                map2.clear();
                map2.putAll(map);
                this.selectedContactsCount = mergeUsers(arrayList3, map2).size();
            } else if (i == 4) {
                ArrayList arrayList4 = this.excludedEveryone;
                arrayList4.clear();
                arrayList4.addAll(arrayList);
                HashMap map3 = this.excludedEveryoneByGroup;
                map3.clear();
                map3.putAll(map);
                this.excludedEveryoneCount = mergeUsers(arrayList4, map3).size();
            }
        }
        if (i == 5) {
            this.startedFromSendAsMessage = true;
            this.activePage = 5;
            ArrayList arrayList5 = this.messageUsers;
            arrayList5.clear();
            arrayList5.addAll(storyPrivacy.sendToUsers);
            this.viewPager.setPosition(1);
        }
        View[] viewPages = this.viewPager.getViewPages();
        View view = viewPages[0];
        if (view instanceof Page) {
            Page page = (Page) view;
            page.bind(page.pageType);
        }
        View view2 = viewPages[1];
        if (view2 instanceof Page) {
            Page page2 = (Page) view2;
            page2.bind(page2.pageType);
        }
    }

    public abstract class SearchUsersCell extends ScrollView {
        public final ArrayList allSpans;
        public final LinearGradient bottomGradient;
        public final AnimatedFloat bottomGradientAlpha;
        public final Matrix bottomGradientMatrix;
        public final Paint bottomGradientPaint;
        public float containerHeight;
        public GroupCreateSpan currentDeletingSpan;
        public final UsersSelectActivity.AnonymousClass4 editText;
        public int fieldY;
        public final int hintTextWidth;
        public boolean ignoreScrollEvent;
        public boolean ignoreTextChange;
        public Utilities.Callback onSearchTextChange;
        public int resultContainerHeight;
        public boolean scroll;
        public final SpansContainer spansContainer;
        public final LinearGradient topGradient;
        public final AnimatedFloat topGradientAlpha;
        public final Matrix topGradientMatrix;
        public final Paint topGradientPaint;
        public final StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 updateHeight;

        public SearchUsersCell(Context context, Theme.ResourcesProvider resourcesProvider, StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1) {
            super(context);
            this.allSpans = new ArrayList();
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.topGradientAlpha = new AnimatedFloat(this, 0L, 300L, cubicBezierInterpolator);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
            this.topGradient = linearGradient;
            Paint paint = new Paint(1);
            this.topGradientPaint = paint;
            this.topGradientMatrix = new Matrix();
            this.bottomGradientAlpha = new AnimatedFloat(this, 0L, 300L, cubicBezierInterpolator);
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
            this.bottomGradient = linearGradient2;
            Paint paint2 = new Paint(1);
            this.bottomGradientPaint = paint2;
            this.bottomGradientMatrix = new Matrix();
            paint.setShader(linearGradient);
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint.setXfermode(new PorterDuffXfermode(mode));
            paint2.setShader(linearGradient2);
            paint2.setXfermode(new PorterDuffXfermode(mode));
            this.updateHeight = storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1;
            setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this, Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            SpansContainer spansContainer = new SpansContainer(this, context);
            this.spansContainer = spansContainer;
            addView(spansContainer, LayoutHelper.createFrame(-2.0f, -1));
            UsersSelectActivity.AnonymousClass4 anonymousClass4 = new UsersSelectActivity.AnonymousClass4(this, context, 11);
            this.editText = anonymousClass4;
            if (Build.VERSION.SDK_INT >= 25) {
                anonymousClass4.setRevealOnFocusHint(false);
            }
            anonymousClass4.setTextSize(1, 16.0f);
            anonymousClass4.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
            anonymousClass4.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            int i = Theme.key_groupcreate_cursor;
            anonymousClass4.setCursorColor(Theme.getColor(i, resourcesProvider));
            anonymousClass4.setHandlesColor(Theme.getColor(i, resourcesProvider));
            anonymousClass4.setCursorWidth(1.5f);
            anonymousClass4.setInputType(anonymousClass4.getInputType() | 176);
            anonymousClass4.setSingleLine(true);
            anonymousClass4.setBackgroundDrawable(null);
            anonymousClass4.setVerticalScrollBarEnabled(false);
            anonymousClass4.setHorizontalScrollBarEnabled(false);
            anonymousClass4.setTextIsSelectable(false);
            anonymousClass4.setPadding(0, 0, 0, 0);
            anonymousClass4.setImeOptions(268435462);
            anonymousClass4.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            spansContainer.addView(anonymousClass4);
            int i2 = R.string.Search;
            anonymousClass4.setHintText(LocaleController.getString(i2));
            this.hintTextWidth = (int) anonymousClass4.getPaint().measureText(LocaleController.getString(i2));
            anonymousClass4.addTextChangedListener(new TextWatcher() {
                @Override
                public final void afterTextChanged(Editable editable) {
                    Utilities.Callback callback;
                    SearchUsersCell searchUsersCell = SearchUsersCell.this;
                    if (searchUsersCell.ignoreTextChange || (callback = searchUsersCell.onSearchTextChange) == null || editable == null) {
                        return;
                    }
                    callback.run(editable.toString());
                }

                @Override
                public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                }

                @Override
                public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                }
            });
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            int scrollY = getScrollY();
            float f = scrollY;
            canvas.saveLayerAlpha(0.0f, f, getWidth(), getHeight() + scrollY, 255, 31);
            super.dispatchDraw(canvas);
            canvas.save();
            float f2 = this.topGradientAlpha.set(canScrollVertically(-1));
            Matrix matrix = this.topGradientMatrix;
            matrix.reset();
            matrix.postTranslate(0.0f, f);
            this.topGradient.setLocalMatrix(matrix);
            Paint paint = this.topGradientPaint;
            paint.setAlpha((int) (f2 * 255.0f));
            canvas.drawRect(0.0f, f, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
            float f3 = this.bottomGradientAlpha.set(canScrollVertically(1));
            Matrix matrix2 = this.bottomGradientMatrix;
            matrix2.reset();
            matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
            this.bottomGradient.setLocalMatrix(matrix2);
            Paint paint2 = this.bottomGradientPaint;
            paint2.setAlpha((int) (f3 * 255.0f));
            canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, paint2);
            canvas.restore();
            canvas.restore();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), Integer.MIN_VALUE));
        }

        @Override
        public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
            if (this.ignoreScrollEvent) {
                this.ignoreScrollEvent = false;
                return false;
            }
            rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
            rect.top = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.fieldY, 20.0f, rect.top);
            rect.bottom = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.fieldY, 50.0f, rect.bottom);
            return super.requestChildRectangleOnScreen(view, rect, z);
        }

        public void setContainerHeight(float f) {
            this.containerHeight = f;
            SpansContainer spansContainer = this.spansContainer;
            if (spansContainer != null) {
                spansContainer.requestLayout();
            }
        }

        public void setOnSearchTextChange(Utilities.Callback<String> callback) {
            this.onSearchTextChange = callback;
        }

        public void setText(CharSequence charSequence) {
            this.ignoreTextChange = true;
            this.editText.setText(charSequence);
            this.ignoreTextChange = false;
        }

        public final class SpansContainer extends ViewGroup {
            public final int $r8$classId = 1;
            public final ArrayList animAddingSpans;
            public final ArrayList animRemovingSpans;
            public boolean animationStarted;
            public final ArrayList animators;
            public AnimatorSet currentAnimation;
            public final ArrayList removingSpans;
            public final ScrollView this$0;

            public final class AnonymousClass2 extends AnimatorListenerAdapter {
                public final int $r8$classId;
                public final SpansContainer this$1;
                public final ArrayList val$toDelete;

                public AnonymousClass2(SpansContainer spansContainer, ArrayList arrayList, int i) {
                    this.$r8$classId = i;
                    this.this$1 = spansContainer;
                    this.val$toDelete = arrayList;
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    switch (this.$r8$classId) {
                        case 0:
                            int i = 0;
                            while (true) {
                                ArrayList arrayList = this.val$toDelete;
                                int size = arrayList.size();
                                SpansContainer spansContainer = this.this$1;
                                if (i >= size) {
                                    spansContainer.getClass();
                                    spansContainer.removingSpans.clear();
                                    spansContainer.currentAnimation = null;
                                    spansContainer.animationStarted = false;
                                    SearchUsersCell searchUsersCell = (SearchUsersCell) spansContainer.this$0;
                                    searchUsersCell.editText.setAllowDrawCursor(true);
                                    StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 = searchUsersCell.updateHeight;
                                    if (storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 != null) {
                                        storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1.run();
                                    }
                                    if (searchUsersCell.scroll) {
                                        searchUsersCell.fullScroll(130);
                                        searchUsersCell.scroll = false;
                                    }
                                } else {
                                    spansContainer.removeView((View) arrayList.get(i));
                                    i++;
                                }
                                break;
                            }
                            break;
                        default:
                            int i2 = 0;
                            while (true) {
                                ArrayList arrayList2 = this.val$toDelete;
                                int size2 = arrayList2.size();
                                SpansContainer spansContainer2 = this.this$1;
                                if (i2 >= size2) {
                                    spansContainer2.removingSpans.clear();
                                    spansContainer2.currentAnimation = null;
                                    spansContainer2.animationStarted = false;
                                    SearchUsersCell searchUsersCell2 = (SearchUsersCell) spansContainer2.this$0;
                                    searchUsersCell2.editText.setAllowDrawCursor(true);
                                    StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda2 = searchUsersCell2.updateHeight;
                                    if (storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda2 != null) {
                                        storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda2.run();
                                    }
                                    if (searchUsersCell2.scroll) {
                                        searchUsersCell2.fullScroll(130);
                                        searchUsersCell2.scroll = false;
                                    }
                                } else {
                                    spansContainer2.removeView((View) arrayList2.get(i2));
                                    i2++;
                                }
                                break;
                            }
                            break;
                    }
                }
            }

            public SpansContainer(SelectorSearchCell selectorSearchCell, Context context) {
                super(context);
                this.this$0 = selectorSearchCell;
                this.animAddingSpans = new ArrayList();
                this.animRemovingSpans = new ArrayList();
                this.animators = new ArrayList();
                this.removingSpans = new ArrayList();
            }

            @Override
            public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                switch (this.$r8$classId) {
                    case 0:
                        int childCount = getChildCount();
                        for (int i5 = 0; i5 < childCount; i5++) {
                            View childAt = getChildAt(i5);
                            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        }
                        break;
                    default:
                        int childCount2 = getChildCount();
                        for (int i6 = 0; i6 < childCount2; i6++) {
                            View childAt2 = getChildAt(i6);
                            childAt2.layout(0, 0, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight());
                        }
                        break;
                }
            }

            @Override
            public final void onMeasure(int i, int i2) {
                int iM$2;
                ?? r6;
                int i3;
                float f;
                boolean z;
                float f2;
                int i4;
                char c;
                int iM$3;
                int i5;
                int iM;
                int i6;
                ScrollView scrollView;
                int i7;
                ScrollView scrollView2 = this.this$0;
                int i8 = Integer.MIN_VALUE;
                int i9 = 1073741824;
                Property property = View.TRANSLATION_X;
                Property property2 = View.TRANSLATION_Y;
                ArrayList arrayList = this.animators;
                ArrayList arrayList2 = this.removingSpans;
                switch (this.$r8$classId) {
                    case 0:
                        int size = View.MeasureSpec.getSize(i);
                        int iDp = size - AndroidUtilities.dp(14.0f);
                        int iDp2 = AndroidUtilities.dp(10.0f);
                        int iDp3 = AndroidUtilities.dp(10.0f);
                        int i10 = 0;
                        int iM2 = 0;
                        int iM3 = 0;
                        for (int childCount = getChildCount(); i10 < childCount; childCount = childCount) {
                            View childAt = getChildAt(i10);
                            if (childAt instanceof GroupCreateSpan) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                                boolean zContains = arrayList2.contains(childAt);
                                if (zContains || childAt.getMeasuredWidth() + iM2 <= iDp) {
                                    f = 4.0f;
                                } else {
                                    f = 4.0f;
                                    iDp2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredHeight(), 4.0f, iDp2);
                                    iM2 = 0;
                                }
                                if (childAt.getMeasuredWidth() + iM3 > iDp) {
                                    iDp3 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredHeight(), f, iDp3);
                                    iM3 = 0;
                                }
                                int iDp4 = AndroidUtilities.dp(7.0f) + iM2;
                                if (this.animationStarted) {
                                    z = zContains;
                                } else if (zContains) {
                                    childAt.setTranslationX(AndroidUtilities.dp(7.0f) + iM3);
                                    childAt.setTranslationY(iDp3);
                                    z = zContains;
                                } else if (arrayList2.isEmpty()) {
                                    z = zContains;
                                    childAt.setTranslationX(iDp4);
                                    childAt.setTranslationY(iDp2);
                                } else {
                                    float f3 = iDp4;
                                    z = zContains;
                                    if (childAt.getTranslationX() != f3) {
                                        i4 = 1;
                                        c = 0;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, f3));
                                    } else {
                                        i4 = 1;
                                        c = 0;
                                    }
                                    float f4 = iDp2;
                                    if (childAt.getTranslationY() != f4) {
                                        float[] fArr = new float[i4];
                                        fArr[c] = f4;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, fArr));
                                    }
                                }
                                if (z) {
                                    f2 = 4.0f;
                                } else {
                                    f2 = 4.0f;
                                    iM2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredWidth(), 4.0f, iM2);
                                }
                                iM3 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredWidth(), f2, iM3);
                            }
                            i10++;
                        }
                        if (AndroidUtilities.isTablet()) {
                            iM$2 = AndroidUtilities.dp(394.0f) / 3;
                        } else {
                            Point point = AndroidUtilities.displaySize;
                            iM$2 = OKLCH.m$2(136.0f, Math.min(point.x, point.y), 3);
                        }
                        if (iDp - iM2 < iM$2) {
                            iDp2 += AndroidUtilities.dp(36.0f);
                            iM2 = 0;
                        }
                        if (iDp - iM3 < iM$2) {
                            iDp3 += AndroidUtilities.dp(36.0f);
                        }
                        SearchUsersCell searchUsersCell = (SearchUsersCell) scrollView2;
                        searchUsersCell.editText.measure(View.MeasureSpec.makeMeasureSpec(iDp - iM2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                        UsersSelectActivity.AnonymousClass4 anonymousClass4 = searchUsersCell.editText;
                        anonymousClass4.setHintVisible(anonymousClass4.getMeasuredWidth() > searchUsersCell.hintTextWidth, true);
                        if (!this.animationStarted) {
                            int iDp5 = AndroidUtilities.dp(38.0f) + iDp3;
                            int iDp6 = AndroidUtilities.dp(16.0f) + iM2;
                            searchUsersCell.fieldY = iDp2;
                            AnimatorSet animatorSet = this.currentAnimation;
                            StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 = searchUsersCell.updateHeight;
                            if (animatorSet != null) {
                                int iDp7 = AndroidUtilities.dp(38.0f) + iDp2;
                                searchUsersCell.resultContainerHeight = iDp7;
                                float f5 = searchUsersCell.containerHeight;
                                float f6 = iDp7;
                                if (f5 != f6) {
                                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f5, f6);
                                    valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(searchUsersCell, 16));
                                    arrayList.add(valueAnimatorOfFloat);
                                }
                                float f7 = iDp6;
                                if (anonymousClass4.getTranslationX() != f7) {
                                    i3 = 1;
                                    r6 = 0;
                                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass4, (Property<UsersSelectActivity.AnonymousClass4, Float>) property, f7));
                                } else {
                                    r6 = 0;
                                    i3 = 1;
                                }
                                float translationY = anonymousClass4.getTranslationY();
                                float f8 = searchUsersCell.fieldY;
                                if (translationY != f8) {
                                    float[] fArr2 = new float[i3];
                                    fArr2[r6] = f8;
                                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass4, (Property<UsersSelectActivity.AnonymousClass4, Float>) property2, fArr2));
                                }
                                anonymousClass4.setAllowDrawCursor(r6);
                                this.currentAnimation.playTogether(arrayList);
                                this.currentAnimation.setDuration(180L);
                                this.currentAnimation.setInterpolator(new LinearInterpolator());
                                this.currentAnimation.start();
                                this.animationStarted = true;
                                if (storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 != null) {
                                    storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1.run();
                                }
                            } else {
                                searchUsersCell.resultContainerHeight = iDp5;
                                searchUsersCell.containerHeight = iDp5;
                                anonymousClass4.setTranslationX(iDp6);
                                anonymousClass4.setTranslationY(searchUsersCell.fieldY);
                                if (storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 != null) {
                                    storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1.run();
                                }
                                if (searchUsersCell.scroll) {
                                    post(new VoIPFragment$12$$ExternalSyntheticLambda0(this, 16));
                                    searchUsersCell.scroll = false;
                                }
                            }
                        } else if (this.currentAnimation != null) {
                            if (!searchUsersCell.ignoreScrollEvent && arrayList2.isEmpty()) {
                                anonymousClass4.bringPointIntoView(anonymousClass4.getSelectionStart());
                            }
                            if (searchUsersCell.scroll) {
                                searchUsersCell.fullScroll(130);
                                searchUsersCell.scroll = false;
                            }
                        }
                        setMeasuredDimension(size, (int) searchUsersCell.containerHeight);
                        break;
                    default:
                        int childCount2 = getChildCount();
                        int size2 = View.MeasureSpec.getSize(i);
                        int iDp8 = size2 - AndroidUtilities.dp(28.0f);
                        int iDp9 = AndroidUtilities.dp(10.0f);
                        int iDp10 = AndroidUtilities.dp(10.0f);
                        int iDp11 = iDp9;
                        int i11 = 0;
                        int i12 = 0;
                        int iM4 = 0;
                        while (i11 < childCount2) {
                            View childAt2 = getChildAt(i11);
                            if (childAt2 instanceof GroupCreateSpan) {
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size2, i8), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), i9));
                                boolean zContains2 = arrayList2.contains(childAt2);
                                if (zContains2 || childAt2.getMeasuredWidth() + i12 <= iDp8) {
                                    iM = i12;
                                } else {
                                    iDp11 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt2.getMeasuredHeight(), 4.0f, iDp11);
                                    iM = 0;
                                }
                                if (childAt2.getMeasuredWidth() + iM4 > iDp8) {
                                    iDp10 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt2.getMeasuredHeight(), 4.0f, iDp10);
                                    i6 = 0;
                                } else {
                                    i6 = iM4;
                                }
                                int iDp12 = AndroidUtilities.dp(14.0f) + iM;
                                if (this.animationStarted) {
                                    scrollView = scrollView2;
                                } else if (zContains2) {
                                    childAt2.setTranslationX(AndroidUtilities.dp(14.0f) + i6);
                                    childAt2.setTranslationY(iDp10);
                                    scrollView = scrollView2;
                                } else if (arrayList2.isEmpty()) {
                                    scrollView = scrollView2;
                                    childAt2.setTranslationX(iDp12);
                                    childAt2.setTranslationY(iDp11);
                                } else {
                                    float f9 = iDp12;
                                    scrollView = scrollView2;
                                    if (childAt2.getTranslationX() != f9) {
                                        i7 = 1;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property, f9));
                                    } else {
                                        i7 = 1;
                                    }
                                    float f10 = iDp11;
                                    if (childAt2.getTranslationY() != f10) {
                                        float[] fArr3 = new float[i7];
                                        fArr3[0] = f10;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property2, fArr3));
                                    }
                                }
                                if (!zContains2) {
                                    iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt2.getMeasuredWidth(), 6.0f, iM);
                                }
                                iM4 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt2.getMeasuredWidth(), 6.0f, i6);
                                i12 = iM;
                            } else {
                                childCount2 = childCount2;
                                scrollView = scrollView2;
                            }
                            i11++;
                            iDp8 = iDp8;
                            childCount2 = childCount2;
                            scrollView2 = scrollView;
                            i8 = Integer.MIN_VALUE;
                            i9 = 1073741824;
                        }
                        int i13 = iDp8;
                        ScrollView scrollView3 = scrollView2;
                        if (AndroidUtilities.isTablet()) {
                            iM$3 = AndroidUtilities.dp(376.0f) / 3;
                        } else {
                            Point point2 = AndroidUtilities.displaySize;
                            iM$3 = OKLCH.m$2(154.0f, Math.min(point2.x, point2.y), 3);
                        }
                        if (i13 - i12 < iM$3) {
                            iDp11 += AndroidUtilities.dp(36.0f);
                            i12 = 0;
                        }
                        if (i13 - iM4 < iM$3) {
                            iDp10 += AndroidUtilities.dp(36.0f);
                        }
                        SelectorSearchCell selectorSearchCell = (SelectorSearchCell) scrollView3;
                        selectorSearchCell.editText.measure(View.MeasureSpec.makeMeasureSpec(i13 - i12, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                        UsersSelectActivity.AnonymousClass4 anonymousClass5 = selectorSearchCell.editText;
                        anonymousClass5.setHintVisible(anonymousClass5.getMeasuredWidth() > selectorSearchCell.hintTextWidth, true);
                        if (!this.animationStarted) {
                            int iDp13 = AndroidUtilities.dp(38.0f) + iDp10;
                            int iDp14 = AndroidUtilities.dp(16.0f) + i12;
                            selectorSearchCell.fieldY = iDp11;
                            if (this.currentAnimation != null) {
                                int iDp15 = AndroidUtilities.dp(38.0f) + iDp11;
                                float f11 = selectorSearchCell.containerHeight;
                                float f12 = iDp15;
                                if (f11 != f12) {
                                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f11, f12);
                                    valueAnimatorOfFloat2.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(selectorSearchCell, 2));
                                    arrayList.add(valueAnimatorOfFloat2);
                                }
                                float f13 = iDp14;
                                if (anonymousClass5.getTranslationX() != f13) {
                                    i5 = 1;
                                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass5, (Property<UsersSelectActivity.AnonymousClass4, Float>) property, f13));
                                } else {
                                    i5 = 1;
                                }
                                float translationY2 = anonymousClass5.getTranslationY();
                                float f14 = selectorSearchCell.fieldY;
                                if (translationY2 != f14) {
                                    float[] fArr4 = new float[i5];
                                    fArr4[0] = f14;
                                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass5, (Property<UsersSelectActivity.AnonymousClass4, Float>) property2, fArr4));
                                }
                                anonymousClass5.setAllowDrawCursor(false);
                                this.currentAnimation.playTogether(arrayList);
                                this.currentAnimation.setDuration(180L);
                                this.currentAnimation.setInterpolator(new LinearInterpolator());
                                this.currentAnimation.start();
                                this.animationStarted = true;
                            } else {
                                selectorSearchCell.containerHeight = iDp13;
                                anonymousClass5.setTranslationX(iDp14);
                                anonymousClass5.setTranslationY(selectorSearchCell.fieldY);
                            }
                        } else if (this.currentAnimation != null && !selectorSearchCell.ignoreScrollEvent && arrayList2.isEmpty()) {
                            anonymousClass5.bringPointIntoView(anonymousClass5.getSelectionStart());
                        }
                        setMeasuredDimension(size2, (int) selectorSearchCell.containerHeight);
                        break;
                }
            }

            public void removeAllSpans() {
                SearchUsersCell searchUsersCell = (SearchUsersCell) this.this$0;
                int i = 1;
                searchUsersCell.ignoreScrollEvent = true;
                ArrayList arrayList = searchUsersCell.allSpans;
                ArrayList arrayList2 = new ArrayList(arrayList);
                ArrayList arrayList3 = this.removingSpans;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                arrayList.clear();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    ((GroupCreateSpan) arrayList2.get(i2)).setOnClickListener(null);
                }
                setupEndValues();
                this.animationStarted = false;
                AnimatorSet animatorSet = new AnimatorSet();
                this.currentAnimation = animatorSet;
                animatorSet.addListener(new AnonymousClass2(this, arrayList2, i));
                ArrayList arrayList4 = this.animators;
                arrayList4.clear();
                ArrayList arrayList5 = this.animAddingSpans;
                arrayList5.clear();
                this.animRemovingSpans.clear();
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    GroupCreateSpan groupCreateSpan = (GroupCreateSpan) arrayList2.get(i3);
                    arrayList5.add(groupCreateSpan);
                    arrayList4.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 1.0f, 0.01f));
                    arrayList4.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 1.0f, 0.01f));
                    arrayList4.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 1.0f, 0.0f));
                }
                requestLayout();
            }

            public void removeSpan(GroupCreateSpan groupCreateSpan) {
                SelectorSearchCell selectorSearchCell = (SelectorSearchCell) this.this$0;
                selectorSearchCell.ignoreScrollEvent = true;
                selectorSearchCell.allSpans.remove(groupCreateSpan);
                groupCreateSpan.setOnClickListener(null);
                setupEndValues();
                this.animationStarted = false;
                AnimatorSet animatorSet = new AnimatorSet();
                this.currentAnimation = animatorSet;
                animatorSet.addListener(new ChatActivity.AnonymousClass74(this, groupCreateSpan, false, 25));
                ArrayList arrayList = this.removingSpans;
                arrayList.clear();
                arrayList.add(groupCreateSpan);
                ArrayList arrayList2 = this.animAddingSpans;
                arrayList2.clear();
                this.animRemovingSpans.clear();
                arrayList2.add(groupCreateSpan);
                ArrayList arrayList3 = this.animators;
                arrayList3.clear();
                arrayList3.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 1.0f, 0.01f));
                arrayList3.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 1.0f, 0.01f));
                arrayList3.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 1.0f, 0.0f));
                requestLayout();
            }

            public final void setupEndValues() {
                switch (this.$r8$classId) {
                    case 0:
                        AnimatorSet animatorSet = this.currentAnimation;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            ArrayList arrayList = this.animAddingSpans;
                            if (i2 >= arrayList.size()) {
                                while (true) {
                                    ArrayList arrayList2 = this.animRemovingSpans;
                                    if (i >= arrayList2.size()) {
                                        arrayList.clear();
                                        arrayList2.clear();
                                    } else {
                                        ((View) arrayList2.get(i)).setScaleX(0.0f);
                                        ((View) arrayList2.get(i)).setScaleY(0.0f);
                                        ((View) arrayList2.get(i)).setAlpha(0.0f);
                                        i++;
                                    }
                                }
                            } else {
                                ((View) arrayList.get(i2)).setScaleX(1.0f);
                                ((View) arrayList.get(i2)).setScaleY(1.0f);
                                ((View) arrayList.get(i2)).setAlpha(1.0f);
                                i2++;
                            }
                            break;
                        }
                        break;
                    default:
                        AnimatorSet animatorSet2 = this.currentAnimation;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                        }
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            ArrayList arrayList3 = this.animAddingSpans;
                            if (i4 >= arrayList3.size()) {
                                while (true) {
                                    ArrayList arrayList4 = this.animRemovingSpans;
                                    if (i3 >= arrayList4.size()) {
                                        arrayList3.clear();
                                        arrayList4.clear();
                                    } else {
                                        ((View) arrayList4.get(i3)).setScaleX(0.0f);
                                        ((View) arrayList4.get(i3)).setScaleY(0.0f);
                                        ((View) arrayList4.get(i3)).setAlpha(0.0f);
                                        i3++;
                                    }
                                }
                            } else {
                                ((View) arrayList3.get(i4)).setScaleX(1.0f);
                                ((View) arrayList3.get(i4)).setScaleY(1.0f);
                                ((View) arrayList3.get(i4)).setAlpha(1.0f);
                                i4++;
                            }
                            break;
                        }
                        break;
                }
            }

            public SpansContainer(SearchUsersCell searchUsersCell, Context context) {
                super(context);
                this.this$0 = searchUsersCell;
                this.animAddingSpans = new ArrayList();
                this.animRemovingSpans = new ArrayList();
                this.animators = new ArrayList();
                this.removingSpans = new ArrayList();
            }

            public void removeAllSpans(boolean z) {
                SelectorSearchCell selectorSearchCell = (SelectorSearchCell) this.this$0;
                int i = 1;
                selectorSearchCell.ignoreScrollEvent = true;
                ArrayList arrayList = selectorSearchCell.allSpans;
                ArrayList arrayList2 = new ArrayList(arrayList);
                ArrayList arrayList3 = this.removingSpans;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                arrayList.clear();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    ((GroupCreateSpan) arrayList2.get(i2)).setOnClickListener(null);
                }
                setupEndValues();
                if (z) {
                    this.animationStarted = false;
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.currentAnimation = animatorSet;
                    animatorSet.addListener(new SelectorSearchCell$SpansContainer$2(this, arrayList2, i));
                    ArrayList arrayList4 = this.animators;
                    arrayList4.clear();
                    ArrayList arrayList5 = this.animAddingSpans;
                    arrayList5.clear();
                    this.animRemovingSpans.clear();
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        GroupCreateSpan groupCreateSpan = (GroupCreateSpan) arrayList2.get(i3);
                        arrayList5.add(groupCreateSpan);
                        arrayList4.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 1.0f, 0.01f));
                        arrayList4.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 1.0f, 0.01f));
                        arrayList4.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 1.0f, 0.0f));
                    }
                } else {
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        removeView((View) arrayList2.get(i4));
                    }
                    arrayList3.clear();
                    this.currentAnimation = null;
                    this.animationStarted = false;
                    selectorSearchCell.editText.setAllowDrawCursor(true);
                }
                requestLayout();
            }
        }
    }

    public final class StoryPrivacy {
        public final ArrayList rules;
        public final ArrayList selectedInputUsers;
        public final ArrayList selectedUserIds;
        public final HashMap selectedUserIdsByGroup;
        public final ArrayList sendToUsers;
        public final int type;

        public StoryPrivacy(int i, ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            this.rules = arrayList2;
            this.selectedUserIds = new ArrayList();
            this.selectedUserIdsByGroup = new HashMap();
            this.selectedInputUsers = new ArrayList();
            this.sendToUsers = new ArrayList();
            int i2 = 0;
            if (containsRule(arrayList, TLRPC.TL_privacyValueAllowAll.class) != null) {
                this.type = 4;
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = (TLRPC.TL_privacyValueDisallowUsers) containsRule(arrayList, TLRPC.TL_privacyValueDisallowUsers.class);
                if (tL_privacyValueDisallowUsers != null) {
                    TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                    MessagesController messagesController = MessagesController.getInstance(i);
                    while (i2 < tL_privacyValueDisallowUsers.users.size()) {
                        Long l = tL_privacyValueDisallowUsers.users.get(i2);
                        TLRPC.InputUser inputUser = messagesController.getInputUser(l.longValue());
                        if (!(inputUser instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                            this.selectedUserIds.add(l);
                            this.selectedInputUsers.add(inputUser);
                        }
                        i2++;
                    }
                    this.rules.add(tL_inputPrivacyValueDisallowUsers);
                    return;
                }
                return;
            }
            if (containsRule(arrayList, TLRPC.TL_privacyValueAllowCloseFriends.class) != null) {
                this.type = 1;
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
                return;
            }
            TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) containsRule(arrayList, TLRPC.TL_privacyValueAllowUsers.class);
            if (tL_privacyValueAllowUsers != null) {
                this.type = 3;
                TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                MessagesController messagesController2 = MessagesController.getInstance(i);
                while (i2 < tL_privacyValueAllowUsers.users.size()) {
                    Long l2 = tL_privacyValueAllowUsers.users.get(i2);
                    TLRPC.InputUser inputUser2 = messagesController2.getInputUser(l2.longValue());
                    if (inputUser2 != null && !(inputUser2 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueAllowUsers.users.add(inputUser2);
                        this.selectedUserIds.add(l2);
                        this.selectedInputUsers.add(inputUser2);
                    }
                    i2++;
                }
                this.rules.add(tL_inputPrivacyValueAllowUsers);
                return;
            }
            if (containsRule(arrayList, TLRPC.TL_privacyValueAllowContacts.class) == null) {
                this.type = 4;
                return;
            }
            this.type = 2;
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
            TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers2 = (TLRPC.TL_privacyValueDisallowUsers) containsRule(arrayList, TLRPC.TL_privacyValueDisallowUsers.class);
            if (tL_privacyValueDisallowUsers2 != null) {
                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                MessagesController messagesController3 = MessagesController.getInstance(i);
                while (i2 < tL_privacyValueDisallowUsers2.users.size()) {
                    Long l3 = tL_privacyValueDisallowUsers2.users.get(i2);
                    TLRPC.InputUser inputUser3 = messagesController3.getInputUser(l3.longValue());
                    if (!(inputUser3 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueDisallowUsers2.users.add(inputUser3);
                        this.selectedUserIds.add(l3);
                        this.selectedInputUsers.add(inputUser3);
                    }
                    i2++;
                }
                this.rules.add(tL_inputPrivacyValueDisallowUsers2);
            }
        }

        public static TLRPC.PrivacyRule containsRule(ArrayList arrayList, Class cls) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i);
                if (cls.isInstance(privacyRule)) {
                    return privacyRule;
                }
            }
            return null;
        }

        public final boolean containsUser(TLRPC.User user) {
            if (user == null) {
                return false;
            }
            ArrayList arrayList = this.selectedUserIds;
            int i = this.type;
            if (i == 4) {
                return !arrayList.contains(Long.valueOf(user.id));
            }
            if (i == 2) {
                return !arrayList.contains(Long.valueOf(user.id)) && user.contact;
            }
            if (i == 1) {
                return user.close_friend;
            }
            if (i == 3) {
                if (arrayList.contains(Long.valueOf(user.id))) {
                    return true;
                }
                Iterator it = this.selectedUserIdsByGroup.values().iterator();
                while (it.hasNext()) {
                    if (((ArrayList) it.next()).contains(Long.valueOf(user.id))) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final String toString() {
            TLRPC.InputPrivacyRule inputPrivacyRule;
            int size;
            ArrayList arrayList = this.sendToUsers;
            if (!arrayList.isEmpty()) {
                return LocaleController.formatPluralString("StoryPrivacyRecipients", arrayList.size(), new Object[0]);
            }
            ArrayList arrayList2 = this.rules;
            if (arrayList2.isEmpty()) {
                return LocaleController.getString(R.string.StoryPrivacyNone);
            }
            TLRPC.InputPrivacyRule inputPrivacyRule2 = (TLRPC.InputPrivacyRule) arrayList2.get(0);
            int i = this.type;
            if (i == 4) {
                inputPrivacyRule = arrayList2.size() >= 2 ? (TLRPC.InputPrivacyRule) arrayList2.get(1) : null;
                return (!(inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) || (size = ((TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule).users.size()) <= 0) ? LocaleController.getString(R.string.StoryPrivacyEveryone) : LocaleController.formatPluralString("StoryPrivacyEveryoneExclude", size, new Object[0]);
            }
            if (i == 1) {
                return LocaleController.getString(R.string.StoryPrivacyCloseFriends);
            }
            if (i == 3 && (inputPrivacyRule2 instanceof TLRPC.TL_inputPrivacyValueAllowUsers)) {
                return LocaleController.formatPluralString("StoryPrivacyContacts", ((TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule2).users.size(), new Object[0]);
            }
            if (i == 2) {
                inputPrivacyRule = arrayList2.size() >= 2 ? (TLRPC.InputPrivacyRule) arrayList2.get(1) : null;
                if (!(inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers)) {
                    return LocaleController.getString(R.string.StoryPrivacyAllContacts);
                }
                int size2 = ((TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule).users.size();
                return size2 > 0 ? LocaleController.formatPluralString("StoryPrivacyContactsExclude", size2, new Object[0]) : LocaleController.getString(R.string.StoryPrivacyAllContacts);
            }
            if (i != 0) {
                return LocaleController.getString(R.string.StoryPrivacyNone);
            }
            if (!(inputPrivacyRule2 instanceof TLRPC.TL_inputPrivacyValueAllowUsers)) {
                return LocaleController.getString(R.string.StoryPrivacyNone);
            }
            int size3 = ((TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule2).users.size();
            return size3 <= 0 ? LocaleController.getString(R.string.StoryPrivacyNone) : LocaleController.formatPluralString("StoryPrivacyContacts", size3, new Object[0]);
        }

        public StoryPrivacy() {
            ArrayList arrayList = new ArrayList();
            this.rules = arrayList;
            this.selectedUserIds = new ArrayList();
            this.selectedUserIdsByGroup = new HashMap();
            this.selectedInputUsers = new ArrayList();
            this.sendToUsers = new ArrayList();
            this.type = 4;
            arrayList.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        }

        public StoryPrivacy(int i, int i2, ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            this.rules = arrayList2;
            this.selectedUserIds = new ArrayList();
            this.selectedUserIdsByGroup = new HashMap();
            this.selectedInputUsers = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            this.sendToUsers = arrayList3;
            this.type = i;
            int i3 = 0;
            if (i == 4) {
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                if (i2 < 0 || arrayList == null || arrayList.isEmpty()) {
                    return;
                }
                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                while (i3 < arrayList.size()) {
                    Long l = (Long) arrayList.get(i3);
                    long jLongValue = l.longValue();
                    this.selectedUserIds.add(l);
                    TLRPC.InputUser inputUser = MessagesController.getInstance(i2).getInputUser(jLongValue);
                    if (inputUser != null && !(inputUser instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                        this.selectedInputUsers.add(inputUser);
                    }
                    i3++;
                }
                this.rules.add(tL_inputPrivacyValueDisallowUsers);
                return;
            }
            if (i == 1) {
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
                return;
            }
            if (i == 2) {
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                if (i2 < 0 || arrayList == null || arrayList.isEmpty()) {
                    return;
                }
                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                while (i3 < arrayList.size()) {
                    Long l2 = (Long) arrayList.get(i3);
                    long jLongValue2 = l2.longValue();
                    this.selectedUserIds.add(l2);
                    TLRPC.InputUser inputUser2 = MessagesController.getInstance(i2).getInputUser(jLongValue2);
                    if (inputUser2 != null && !(inputUser2 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueDisallowUsers2.users.add(inputUser2);
                        this.selectedInputUsers.add(inputUser2);
                    }
                    i3++;
                }
                this.rules.add(tL_inputPrivacyValueDisallowUsers2);
                return;
            }
            if (i != 3) {
                if (i != 5 || arrayList == null) {
                    return;
                }
                arrayList3.addAll(arrayList);
                return;
            }
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
            if (i2 >= 0 && arrayList != null && !arrayList.isEmpty()) {
                while (i3 < arrayList.size()) {
                    Long l3 = (Long) arrayList.get(i3);
                    long jLongValue3 = l3.longValue();
                    this.selectedUserIds.add(l3);
                    TLRPC.InputUser inputUser3 = MessagesController.getInstance(i2).getInputUser(jLongValue3);
                    if (inputUser3 != null && !(inputUser3 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueAllowUsers.users.add(inputUser3);
                        this.selectedInputUsers.add(inputUser3);
                    }
                    i3++;
                }
            }
            this.rules.add(tL_inputPrivacyValueAllowUsers);
        }

        public StoryPrivacy(int i, ArrayList arrayList, int i2) {
            ArrayList arrayList2 = new ArrayList();
            this.rules = arrayList2;
            this.selectedUserIds = new ArrayList();
            this.selectedUserIdsByGroup = new HashMap();
            this.selectedInputUsers = new ArrayList();
            this.sendToUsers = new ArrayList();
            this.type = i;
            int i3 = 0;
            if (i == 4) {
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                if (arrayList.isEmpty()) {
                    return;
                }
                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                while (i3 < arrayList.size()) {
                    TLRPC.InputUser inputUser = (TLRPC.InputUser) arrayList.get(i3);
                    if (inputUser != null) {
                        tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                        this.selectedUserIds.add(Long.valueOf(inputUser.user_id));
                        this.selectedInputUsers.add(inputUser);
                    }
                    i3++;
                }
                this.rules.add(tL_inputPrivacyValueDisallowUsers);
                return;
            }
            if (i == 1) {
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
                return;
            }
            if (i == 2) {
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                if (arrayList.isEmpty()) {
                    return;
                }
                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                while (i3 < arrayList.size()) {
                    TLRPC.InputUser inputUser2 = (TLRPC.InputUser) arrayList.get(i3);
                    if (inputUser2 != null) {
                        tL_inputPrivacyValueDisallowUsers2.users.add(inputUser2);
                        this.selectedUserIds.add(Long.valueOf(inputUser2.user_id));
                        this.selectedInputUsers.add(inputUser2);
                    }
                    i3++;
                }
                this.rules.add(tL_inputPrivacyValueDisallowUsers2);
                return;
            }
            if (i != 3) {
                if (i == 5) {
                    while (i3 < arrayList.size()) {
                        TLRPC.InputUser inputUser3 = (TLRPC.InputUser) arrayList.get(i3);
                        if (inputUser3 != null) {
                            this.sendToUsers.add(Long.valueOf(inputUser3.user_id));
                        }
                        i3++;
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
            if (!arrayList.isEmpty()) {
                while (i3 < arrayList.size()) {
                    TLRPC.InputUser inputUser4 = (TLRPC.InputUser) arrayList.get(i3);
                    if (inputUser4 != null) {
                        tL_inputPrivacyValueAllowUsers.users.add(inputUser4);
                        this.selectedUserIds.add(Long.valueOf(inputUser4.user_id));
                        this.selectedInputUsers.add(inputUser4);
                    }
                    i3++;
                }
            }
            this.rules.add(tL_inputPrivacyValueAllowUsers);
        }
    }

    public StoryPrivacyBottomSheet(final Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider, true, false);
        this.excludedEveryone = new ArrayList();
        this.excludedEveryoneByGroup = new HashMap();
        this.excludedEveryoneCount = 0;
        this.excludedContacts = new ArrayList();
        this.selectedContacts = new ArrayList();
        this.selectedContactsByGroup = new HashMap();
        this.selectedContactsCount = 0;
        this.selectedAlbums = new HashSet();
        this.allowComments = true;
        this.allowScreenshots = true;
        this.keepOnMyPage = false;
        this.allowCover = true;
        this.canChangePeer = true;
        this.isRtmpStream = false;
        this.commentsPrice = 0;
        this.storiesCount = 1;
        this.messageUsers = new ArrayList();
        this.activePage = 1;
        this.selectedType = 4;
        this.smallChatsParticipantsCount = new HashMap();
        this.storyPeriod = 86400;
        this.backgroundPaint = new Paint(1);
        this.allowSmallChats = true;
        this.isEdit = false;
        init$2(context);
        final int i = 1;
        this.viewPager.setAdapter(new ViewPagerFixed.Adapter(this) {
            public final StoryPrivacyBottomSheet this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void bindView(View view, int i5, int i6) {
                switch (i) {
                    case 0:
                        ((Page) view).bind(i6);
                        break;
                    default:
                        ((Page) view).bind(i6);
                        break;
                }
            }

            @Override
            public final View createView(int i5) {
                switch (i) {
                    case 0:
                        break;
                }
                return this.this$0.new Page(context);
            }

            @Override
            public final int getItemCount() {
                switch (i) {
                    case 0:
                        return 2;
                    default:
                        return 1;
                }
            }

            @Override
            public final int getItemViewType(int i5) {
                switch (i) {
                    case 0:
                        if (i5 == 0) {
                            return 0;
                        }
                        return this.this$0.activePage;
                    default:
                        return 5;
                }
            }
        });
    }
}
