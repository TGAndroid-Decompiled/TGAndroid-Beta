package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline1;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticOutline0;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HintDialogCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.Cells.ShareTopicCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.RenderNodeWithHash;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda32;
import org.telegram.ui.MessageStatisticActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public class ShareAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private AnimatorSet animatorSet;
    private View bottomFadeView;
    private FrameLayout bulletinContainer;
    public FrameLayout bulletinContainer2;
    private BlurredBackgroundDrawable captionContainerBg;
    private float captionEditTextTopOffset;
    private float chatActivityEnterViewAnimateFromTop;
    private EditTextEmoji commentTextView;
    private int containerViewTop;
    private boolean copyLinkOnEnd;
    private float currentPanTranslationY;
    private boolean darkTheme;
    private ShareAlertDelegate delegate;
    private BlurredBackgroundDrawable emojiViewChildBg;
    private TLRPC.TL_exportedMessageLink exportedMessageLink;
    private BlurredBackgroundWithFadeDrawable fadeDrawable;
    public boolean forceDarkThemeForHint;
    private FrameLayout frameLayout;
    private FrameLayout frameLayout2;
    private boolean fullyShown;
    private RecyclerListView gridView;
    private int hasPoll;
    private IBlur3Capture iBlur3Capture;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryFade;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryFrostedLiquidGlass;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList<RectF> iBlur3Positions;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    private boolean includeStory;
    public boolean includeStoryFromMessage;
    private boolean isChannel;
    private int keyboardSize2;
    private float keyboardT;
    int lastOffset;
    private GridLayoutManager layoutManager;
    private LinearLayout linkContainer;
    private TextView linkCopyButton;
    private SimpleTextView linkTextView;
    private String[] linkToCopy;
    private ShareDialogsAdapter listAdapter;
    private boolean loadingLink;
    private Paint paint;
    private boolean panTranslationMoveLayout;
    private Activity parentActivity;
    private ChatActivity parentFragment;
    private FrameLayout pickerBottom;
    private FrameLayout pickerBottomLayout;
    private int previousScrollOffsetY;
    private ArrayList<DialogsSearchAdapter.RecentSearchObject> recentSearchObjects;
    private LongSparseArray recentSearchObjectsById;
    private RectF rect;
    RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
    private int scrollOffsetY;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private ShareSearchAdapter searchAdapter;
    private StickerEmptyView searchEmptyView;
    private RecyclerListView searchGridView;
    private boolean searchIsVisible;
    private FillLastGridLayoutManager searchLayoutManager;
    FragmentSearchField searchView;
    private boolean searchWasVisibleBeforeTopics;
    protected Map<TLRPC.Dialog, TLRPC.TL_forumTopic> selectedDialogTopics;
    protected LongSparseArray selectedDialogs;
    private TLRPC.Dialog selectedTopicDialog;
    private ActionBarPopupWindow sendPopupWindow;
    protected ArrayList<MessageObject> sendingMessageObjects;
    private String[] sendingText;
    private View[] shadow;
    private AnimatorSet[] shadowAnimation;
    private Drawable shadowDrawable;
    private ShareTopicsAdapter shareTopicsAdapter;
    private LinearLayout sharesCountLayout;
    private int shiftDp;
    private boolean showSendersName;
    private SizeNotifierFrameLayout sizeNotifierFrameLayout;
    TL_stories.StoryItem storyItem;
    private SwitchView switchView;
    private Insets systemInsets;
    private TextPaint textPaint;
    public int timestamp;
    public CheckBox2 timestampCheckbox;
    public FrameLayout timestampFrameLayout;
    public LinearLayout timestampLayout;
    public TextView timestampTextView;
    private ValueAnimator topBackgroundAnimator;
    private int topBeforeSwitch;
    private SpringAnimation topicsAnimation;
    ActionBar topicsBackActionBar;
    private RecyclerListView topicsGridView;
    private GridLayoutManager topicsLayoutManager;
    private boolean updateSearchAdapter;
    private ChatActivityEnterView.SendButton writeButton;
    private FrameLayout writeButtonContainer;

    public class AnonymousClass21 extends FrameLayout {
        public AnonymousClass21(Context context) {
            super(context);
        }

        public void lambda$onDraw$0(ValueAnimator valueAnimator) {
            ShareAlert.this.captionEditTextTopOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ShareAlert.this.frameLayout2.invalidate();
            invalidate();
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            ShareAlert.this.captionContainerBg.setBounds(0, (int) ShareAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
            ShareAlert.this.captionContainerBg.draw(canvas);
            canvas.save();
            canvas.clipRect(0.0f, ShareAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (ShareAlert.this.chatActivityEnterViewAnimateFromTop != 0.0f && ShareAlert.this.chatActivityEnterViewAnimateFromTop != ShareAlert.this.chatActivityEnterViewAnimateFromTop + ShareAlert.this.frameLayout2.getTop()) {
                if (ShareAlert.this.topBackgroundAnimator != null) {
                    ShareAlert.this.topBackgroundAnimator.cancel();
                }
                ShareAlert shareAlert = ShareAlert.this;
                shareAlert.captionEditTextTopOffset = shareAlert.chatActivityEnterViewAnimateFromTop - (ShareAlert.this.captionEditTextTopOffset + ShareAlert.this.frameLayout2.getTop());
                ShareAlert shareAlert2 = ShareAlert.this;
                shareAlert2.topBackgroundAnimator = ValueAnimator.ofFloat(shareAlert2.captionEditTextTopOffset, 0.0f);
                ShareAlert.this.topBackgroundAnimator.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 16));
                ShareAlert.this.topBackgroundAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                ShareAlert.this.topBackgroundAnimator.setDuration(200L);
                ShareAlert.this.topBackgroundAnimator.start();
                ShareAlert.this.chatActivityEnterViewAnimateFromTop = 0.0f;
            }
            ShareAlert.this.shadow[1].setTranslationY(ShareAlert.this.currentPanTranslationY + ShareAlert.this.captionEditTextTopOffset + (-(ShareAlert.this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + ((1.0f - getAlpha()) * (ShareAlert.this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
        }

        @Override
        public void setAlpha(float f) {
            super.setAlpha(f);
            invalidate();
        }

        @Override
        public void setVisibility(int i) {
            super.setVisibility(i);
            if (i != 0) {
                ShareAlert.this.shadow[1].setTranslationY(0.0f);
            }
        }
    }

    public class AnonymousClass22 extends EditTextEmoji {
        private ValueAnimator messageEditTextAnimator;
        private int messageEditTextPredrawHeigth;
        private int messageEditTextPredrawScrollY;
        private boolean shouldAnimateEditTextWithBounds;

        public AnonymousClass22(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, BaseFragment baseFragment, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context, sizeNotifierFrameLayout, baseFragment, i, z, resourcesProvider);
        }

        public static void lambda$dispatchDraw$0(EditTextCaption editTextCaption, ValueAnimator valueAnimator) {
            editTextCaption.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        @Override
        public void bottomPanelTranslationY(float f) {
            super.bottomPanelTranslationY(f);
            ShareAlert.this.updateBottomOverlay();
        }

        @Override
        public void createEmojiView() {
            super.createEmojiView();
            EmojiView emojiView = getEmojiView();
            if (emojiView != null) {
                emojiView.shouldLightenBackground = false;
                emojiView.fixBottomTabContainerTranslation = false;
                emojiView.setShouldDrawBackground(false);
                emojiView.setBottomInset(ShareAlert.this.systemInsets.bottom);
            }
            FrameLayout frameLayout = ShareAlert.this.timestampFrameLayout;
            if (frameLayout != null) {
                frameLayout.bringToFront();
            }
            if (ShareAlert.this.frameLayout2 != null) {
                ShareAlert.this.frameLayout2.bringToFront();
            }
            if (ShareAlert.this.writeButtonContainer != null) {
                ShareAlert.this.writeButtonContainer.bringToFront();
            }
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            if (this.shouldAnimateEditTextWithBounds) {
                EditTextCaption editText = ShareAlert.this.commentTextView.getEditText();
                editText.setOffsetY(editText.getOffsetY() - ((this.messageEditTextPredrawScrollY - editText.getScrollY()) + (this.messageEditTextPredrawHeigth - editText.getMeasuredHeight())));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
                valueAnimatorOfFloat.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(editText, 17));
                ValueAnimator valueAnimator = this.messageEditTextAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.messageEditTextAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                valueAnimatorOfFloat.start();
                this.shouldAnimateEditTextWithBounds = false;
            }
            super.dispatchDraw(canvas);
        }

        @Override
        public void hidePopup(boolean z) {
            super.hidePopup(z);
        }

        @Override
        public void onLineCountChanged(int i, int i2) {
            if (TextUtils.isEmpty(getEditText().getText())) {
                getEditText().animate().cancel();
                getEditText().setOffsetY(0.0f);
                this.shouldAnimateEditTextWithBounds = false;
            } else {
                this.shouldAnimateEditTextWithBounds = true;
                this.messageEditTextPredrawHeigth = getEditText().getMeasuredHeight();
                this.messageEditTextPredrawScrollY = getEditText().getScrollY();
                invalidate();
            }
            ShareAlert shareAlert = ShareAlert.this;
            shareAlert.chatActivityEnterViewAnimateFromTop = ShareAlert.this.captionEditTextTopOffset + shareAlert.frameLayout2.getTop();
            ShareAlert.this.frameLayout2.invalidate();
        }

        @Override
        public void showPopup(int i) {
            super.showPopup(i);
        }
    }

    public class AnonymousClass23 implements TextWatcher {
        public AnonymousClass23() {
        }

        public void lambda$afterTextChanged$0() {
            ShareAlert.this.updateSelectedCount(1);
        }

        @Override
        public void afterTextChanged(Editable editable) {
            AndroidUtilities.runOnUIThread(new ShareAlert$23$$ExternalSyntheticLambda0(this, 0));
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class AnonymousClass27 implements NotificationCenter.NotificationCenterDelegate {
        final View val$cell;
        final TLRPC.Dialog val$dialog;
        final AtomicReference val$timeoutRef;

        public AnonymousClass27(TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
            this.val$dialog = dialog;
            this.val$timeoutRef = atomicReference;
            this.val$cell = view;
        }

        public void lambda$didReceivedNotification$0(View view, int[] iArr, DynamicAnimation dynamicAnimation, float f, float f2) {
            ShareAlert.this.invalidateTopicsAnimation(view, iArr, f / 1000.0f);
        }

        public void lambda$didReceivedNotification$1(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            ShareAlert.this.gridView.setVisibility(8);
            ShareAlert.this.searchGridView.setVisibility(8);
            ShareAlert.this.searchView.setVisibility(8);
            ShareAlert.this.topicsAnimation = null;
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (((Long) objArr[0]).longValue() == (-this.val$dialog.id)) {
                boolean z = (ShareAlert.this.shareTopicsAdapter.topics == null && MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getTopicsController().getTopics(-this.val$dialog.id) != null) || this.val$timeoutRef.get() == null;
                ShareAlert.this.shareTopicsAdapter.topics = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getTopicsController().getTopics(-this.val$dialog.id);
                ShareAlert.this.shareTopicsAdapter.isBotForum = UserObject.isBotForum(((BottomSheet) ShareAlert.this).currentAccount, this.val$dialog.id);
                ShareAlert.this.shareTopicsAdapter.isBotForumWithManageTopics = UserObject.isBotForumWithEditableTopics(((BottomSheet) ShareAlert.this).currentAccount, this.val$dialog.id);
                if (z) {
                    ShareAlert.this.shareTopicsAdapter.notifyDataSetChanged();
                }
                if (ShareAlert.this.shareTopicsAdapter.topics != null) {
                    NotificationCenter.getInstance(((BottomSheet) ShareAlert.this).currentAccount).removeObserver(this, NotificationCenter.topicsDidLoaded);
                }
                if (z) {
                    ShareAlert.this.topicsGridView.setVisibility(0);
                    ShareAlert.this.topicsGridView.setAlpha(0.0f);
                    ShareAlert.this.topicsBackActionBar.setVisibility(0);
                    ShareAlert.this.topicsBackActionBar.setAlpha(0.0f);
                    if (UserObject.isBotForum(((BottomSheet) ShareAlert.this).currentAccount, this.val$dialog.id)) {
                        ShareAlert shareAlert = ShareAlert.this;
                        shareAlert.topicsBackActionBar.setTitle(DialogObject.getShortName(MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).getUser(Long.valueOf(this.val$dialog.id))));
                        ShareAlert.this.topicsBackActionBar.setSubtitle(LocaleController.getString(R.string.SelectChat));
                    } else if (ChatObject.isMonoForum(((BottomSheet) ShareAlert.this).currentAccount, this.val$dialog.id)) {
                        ShareAlert shareAlert2 = ShareAlert.this;
                        shareAlert2.topicsBackActionBar.setTitle(ForumUtilities.getMonoForumTitle(MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(-this.val$dialog.id)), ((BottomSheet) shareAlert2).currentAccount, false));
                        ShareAlert.this.topicsBackActionBar.setSubtitle(LocaleController.getString(R.string.SelectChat));
                    } else {
                        ShareAlert shareAlert3 = ShareAlert.this;
                        shareAlert3.topicsBackActionBar.setTitle(MessagesController.getInstance(((BottomSheet) shareAlert3).currentAccount).getChat(Long.valueOf(-this.val$dialog.id)).title);
                        ShareAlert.this.topicsBackActionBar.setSubtitle(LocaleController.getString(R.string.SelectTopic));
                    }
                    ShareAlert shareAlert4 = ShareAlert.this;
                    shareAlert4.searchWasVisibleBeforeTopics = shareAlert4.searchIsVisible;
                    if (ShareAlert.this.topicsAnimation != null) {
                        ShareAlert.this.topicsAnimation.cancel();
                    }
                    int[] iArr = new int[2];
                    ShareAlert shareAlert5 = ShareAlert.this;
                    SpringAnimation springAnimation = new SpringAnimation(new FloatValueHolder(0.0f));
                    SpringForce springForce = new SpringForce(1000.0f);
                    springForce.setStiffness((ShareAlert.this.parentFragment == null || !ShareAlert.this.parentFragment.shareAlertDebugTopicsSlowMotion) ? 800.0f : 10.0f);
                    springForce.setDampingRatio(1.0f);
                    springAnimation.mSpring = springForce;
                    shareAlert5.topicsAnimation = springAnimation;
                    ShareAlert.this.topicsAnimation.addUpdateListener(new ShareAlert$$ExternalSyntheticLambda9(this, this.val$cell, iArr, 1));
                    ShareAlert.this.topicsAnimation.addEndListener(new Bulletin$$ExternalSyntheticLambda3(this, 1));
                    ShareAlert.this.topicsAnimation.start();
                    if (this.val$timeoutRef.get() != null) {
                        AndroidUtilities.cancelRunOnUIThread((Runnable) this.val$timeoutRef.get());
                        this.val$timeoutRef.set(null);
                    }
                }
            }
        }
    }

    public static class DialogSearchResult {
        public int date;
        public TLRPC.Dialog dialog = new TLRPC.TL_dialog();
        public CharSequence name;
        public TLObject object;
    }

    public class ShareDialogsAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;
        private int currentCount;
        private ArrayList<TLRPC.Dialog> dialogs = new ArrayList<>();
        private LongSparseArray dialogsMap = new LongSparseArray();

        public class MyStoryDialog extends TLRPC.Dialog {
            private MyStoryDialog() {
                this.id = Long.MAX_VALUE;
            }
        }

        public ShareDialogsAdapter(Context context) {
            this.context = context;
            fetchDialogs();
        }

        public void fetchDialogs() {
            TLRPC.TL_chatAdminRights tL_chatAdminRights;
            this.dialogs.clear();
            this.dialogsMap.clear();
            long j = UserConfig.getInstance(((BottomSheet) ShareAlert.this).currentAccount).clientUserId;
            if (ShareAlert.this.includeStory) {
                MyStoryDialog myStoryDialog = new MyStoryDialog();
                this.dialogs.add(myStoryDialog);
                this.dialogsMap.put(myStoryDialog, myStoryDialog.id);
            }
            if (!MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).dialogsForward.isEmpty()) {
                TLRPC.Dialog dialog = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).dialogsForward.get(0);
                this.dialogs.add(dialog);
                this.dialogsMap.put(dialog, dialog.id);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getAllDialogs();
            for (int i = 0; i < allDialogs.size(); i++) {
                TLRPC.Dialog dialog2 = allDialogs.get(i);
                if (dialog2 instanceof TLRPC.TL_dialog) {
                    long j2 = dialog2.id;
                    if (j2 != j && !DialogObject.isEncryptedDialog(j2)) {
                        if (DialogObject.isUserDialog(dialog2.id)) {
                            if (dialog2.folder_id == 1) {
                                arrayList.add(dialog2);
                            } else {
                                this.dialogs.add(dialog2);
                            }
                            this.dialogsMap.put(dialog2, dialog2.id);
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(-dialog2.id));
                            if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog2.folder_id == 1) {
                                    arrayList.add(dialog2);
                                } else {
                                    this.dialogs.add(dialog2);
                                }
                                this.dialogsMap.put(dialog2, dialog2.id);
                            }
                        }
                    }
                }
            }
            this.dialogs.addAll(arrayList);
            if (ShareAlert.this.parentFragment != null) {
                int i2 = ShareAlert.this.parentFragment.shareAlertDebugMode;
                if (i2 == 1) {
                    ArrayList<TLRPC.Dialog> arrayList2 = this.dialogs;
                    ArrayList arrayList3 = new ArrayList(arrayList2.subList(0, Math.min(4, arrayList2.size())));
                    this.dialogs.clear();
                    this.dialogs.addAll(arrayList3);
                } else if (i2 == 2) {
                    while (!this.dialogs.isEmpty() && this.dialogs.size() < 80) {
                        ArrayList<TLRPC.Dialog> arrayList4 = this.dialogs;
                        arrayList4.add((TLRPC.Dialog) zzin.m(1, arrayList4));
                    }
                }
            }
            notifyDataSetChanged();
        }

        public TLRPC.Dialog getItem(int i) {
            int i2 = i - 1;
            if (i2 < 0 || i2 >= this.dialogs.size()) {
                return null;
            }
            return this.dialogs.get(i2);
        }

        @Override
        public int getItemCount() {
            int size = this.dialogs.size();
            return size != 0 ? size + 1 : size;
        }

        @Override
        public int getItemViewType(int i) {
            return i == 0 ? 1 : 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 1;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                ShareDialogCell shareDialogCell = (ShareDialogCell) viewHolder.itemView;
                TLRPC.Dialog item = getItem(i);
                if (item == null) {
                    return;
                }
                shareDialogCell.setTopic(ShareAlert.this.selectedDialogTopics.get(item), MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).isMonoForum(item.id), false);
                long j = item.id;
                shareDialogCell.setDialog(j, ShareAlert.this.selectedDialogs.indexOfKey(j) >= 0, null);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i != 0) {
                view = new View(this.context);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 56.0f : 109.0f)));
            } else {
                view = new ShareDialogCell(this.context, 0, ((BottomSheet) ShareAlert.this).resourcesProvider) {
                    @Override
                    public String repostToCustomName() {
                        return ShareAlert.this.includeStoryFromMessage ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
                    }
                };
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
            }
            return new RecyclerListView.Holder(view);
        }
    }

    public class ShareSearchAdapter extends RecyclerListView.SelectionAdapter {
        DialogsSearchAdapter.CategoryAdapterRecycler categoryAdapter;
        RecyclerView categoryListView;
        private Context context;
        int itemsCount;
        private int lastGlobalSearchId;
        int lastItemCont;
        private int lastLocalSearchId;
        private int lastReqId;
        private int lastSearchId;
        private String lastSearchText;
        private int reqId;
        private SearchAdapterHelper searchAdapterHelper;
        private Runnable searchRunnable;
        private Runnable searchRunnable2;
        private ArrayList<Object> searchResult = new ArrayList<>();
        int hintsCell = -1;
        int resentTitleCell = -1;
        int firstEmptyViewCell = -1;
        int recentDialogsStartRow = -1;
        int searchResultsStartRow = -1;
        int lastFilledItem = -1;
        boolean internalDialogsIsSearching = false;

        public ShareSearchAdapter(Context context) {
            this.context = context;
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(false) {
                @Override
                public boolean filter(TLObject tLObject) {
                    return !(tLObject instanceof TLRPC.Chat) || ChatObject.canWriteToChat((TLRPC.Chat) tLObject);
                }
            };
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() {
                @Override
                public boolean canApplySearchResults(int i) {
                    return i == ShareSearchAdapter.this.lastSearchId;
                }

                @Override
                public LongSparseArray getExcludeCallParticipants() {
                    return null;
                }

                @Override
                public LongSparseArray getExcludeUsers() {
                    return null;
                }

                @Override
                public void onDataSetChanged(int i) {
                    ShareSearchAdapter.this.lastGlobalSearchId = i;
                    if (ShareSearchAdapter.this.lastLocalSearchId != i) {
                        ShareSearchAdapter.this.searchResult.clear();
                    }
                    ShareSearchAdapter shareSearchAdapter = ShareSearchAdapter.this;
                    int i2 = shareSearchAdapter.lastItemCont;
                    if (shareSearchAdapter.getItemCount() != 0 || ShareSearchAdapter.this.searchAdapterHelper.isSearchInProgress()) {
                        ShareAlert.this.recyclerItemsEnterAnimator.showItemsAnimated(i2);
                    } else {
                        ShareSearchAdapter shareSearchAdapter2 = ShareSearchAdapter.this;
                        if (shareSearchAdapter2.internalDialogsIsSearching) {
                            ShareAlert.this.recyclerItemsEnterAnimator.showItemsAnimated(i2);
                        } else {
                            ShareAlert.this.searchEmptyView.showProgress(false, true);
                        }
                    }
                    ShareSearchAdapter.this.notifyDataSetChanged();
                    ShareAlert.this.checkCurrentList(true);
                }

                @Override
                public void onSetHashtags(ArrayList arrayList, HashMap map) {
                }
            });
        }

        public void lambda$onCreateViewHolder$5(View view, int i) {
            HintDialogCell hintDialogCell = (HintDialogCell) view;
            TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).hints.get(i);
            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
            TLRPC.Peer peer = tL_topPeer.peer;
            long j = peer.user_id;
            if (j == 0) {
                long j2 = peer.channel_id;
                if (j2 != 0) {
                    j = -j2;
                } else {
                    j2 = peer.chat_id;
                    if (j2 != 0) {
                        j = -j2;
                    } else {
                        j = 0;
                    }
                }
            }
            if (hintDialogCell.premiumBlocked) {
                ShareAlert.this.showPremiumBlockedToast(hintDialogCell, j);
                return;
            }
            tL_dialog.id = j;
            ShareAlert.this.selectDialog(null, tL_dialog);
            boolean z = ShareAlert.this.selectedDialogs.indexOfKey(j) >= 0;
            if (hintDialogCell.drawCheckbox) {
                hintDialogCell.checkBox.setChecked(z, true);
            }
        }

        public void lambda$searchDialogs$3(int i, String str) {
            this.searchRunnable2 = null;
            if (i != this.lastSearchId) {
                return;
            }
            this.searchAdapterHelper.queryServerSearch(str, true, true, true, true, false, 0L, false, 0, i);
        }

        public void lambda$searchDialogs$4(String str, int i) {
            this.searchRunnable = null;
            searchDialogsInternal(str, i);
            ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0 shareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0 = new ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0(i, str, this);
            this.searchRunnable2 = shareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0;
            AndroidUtilities.runOnUIThread(shareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0);
        }

        public static int lambda$searchDialogsInternal$0(Object obj, Object obj2) {
            int i = ((DialogSearchResult) obj).date;
            int i2 = ((DialogSearchResult) obj2).date;
            if (i < i2) {
                return 1;
            }
            return i > i2 ? -1 : 0;
        }

        public void lambda$searchDialogsInternal$1(String str, int i) {
            String[] strArr;
            String str2;
            int i2;
            TLRPC.TL_chatAdminRights tL_chatAdminRights;
            String[] strArr2;
            NativeByteBuffer nativeByteBufferByteBufferValue;
            TLRPC.User userTLdeserialize;
            DialogSearchResult dialogSearchResult;
            TLRPC.UserStatus userStatus;
            char c;
            try {
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    this.lastSearchId = -1;
                    updateSearchResults(new ArrayList<>(), this.lastSearchId);
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i3 = (translitString != null ? 1 : 0) + 1;
                String[] strArr3 = new String[i3];
                strArr3[0] = lowerCase;
                if (translitString != null) {
                    strArr3[1] = translitString;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                SQLiteCursor sQLiteCursorQueryFinalized = MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getDatabase().queryFinalized("SELECT did, date FROM dialogs ORDER BY date DESC LIMIT 400", new Object[0]);
                while (sQLiteCursorQueryFinalized.next()) {
                    long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                    DialogSearchResult dialogSearchResult2 = new DialogSearchResult();
                    dialogSearchResult2.date = sQLiteCursorQueryFinalized.intValue(1);
                    longSparseArray.put(dialogSearchResult2, jLongValue);
                    if (DialogObject.isUserDialog(jLongValue)) {
                        if (!arrayList.contains(Long.valueOf(jLongValue))) {
                            arrayList.add(Long.valueOf(jLongValue));
                        }
                    } else if (DialogObject.isChatDialog(jLongValue)) {
                        long j = -jLongValue;
                        if (!arrayList2.contains(Long.valueOf(j))) {
                            arrayList2.add(Long.valueOf(j));
                        }
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
                String str3 = ";;;";
                int i4 = 2;
                if (arrayList.isEmpty()) {
                    strArr = strArr3;
                    str2 = ";;;";
                    i2 = 0;
                } else {
                    SQLiteDatabase database = MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getDatabase();
                    Locale locale = Locale.US;
                    SQLiteCursor sQLiteCursorQueryFinalized2 = database.queryFinalized("SELECT data, status, name FROM users WHERE uid IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                    int i5 = 0;
                    while (sQLiteCursorQueryFinalized2.next()) {
                        String strStringValue = sQLiteCursorQueryFinalized2.stringValue(i4);
                        String translitString2 = LocaleController.getInstance().getTranslitString(strStringValue);
                        if (strStringValue.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int iLastIndexOf = strStringValue.lastIndexOf(str3);
                        String strSubstring = iLastIndexOf != -1 ? strStringValue.substring(iLastIndexOf + 3) : null;
                        int i6 = i5;
                        int i7 = 0;
                        char c2 = 0;
                        while (true) {
                            if (i7 < i3) {
                                int i8 = i7;
                                String str4 = strArr3[i8];
                                if (strStringValue.startsWith(str4)) {
                                    strArr2 = strArr3;
                                } else {
                                    strArr2 = strArr3;
                                    if (!strStringValue.contains(" " + str4)) {
                                        if (translitString2 != null) {
                                            if (!translitString2.startsWith(str4)) {
                                                if (translitString2.contains(" " + str4)) {
                                                }
                                            }
                                        }
                                        if (strSubstring != null && strSubstring.startsWith(str4)) {
                                            c2 = 2;
                                        }
                                    }
                                    if (c2 != 0) {
                                        nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized2.byteBufferValue(0);
                                        if (nativeByteBufferByteBufferValue != null) {
                                            userTLdeserialize = TLRPC.User.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                            nativeByteBufferByteBufferValue.reuse();
                                            dialogSearchResult = (DialogSearchResult) longSparseArray.get(userTLdeserialize.id);
                                            userStatus = userTLdeserialize.status;
                                            if (userStatus != null) {
                                                c = 1;
                                                userStatus.expires = sQLiteCursorQueryFinalized2.intValue(1);
                                            } else {
                                                c = 1;
                                            }
                                            if (c2 == c) {
                                                dialogSearchResult.name = AndroidUtilities.generateSearchName(userTLdeserialize.first_name, userTLdeserialize.last_name, str4);
                                            } else {
                                                dialogSearchResult.name = AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(userTLdeserialize), null, "@" + str4);
                                            }
                                            dialogSearchResult.object = userTLdeserialize;
                                            dialogSearchResult.dialog.id = userTLdeserialize.id;
                                            i5 = i6 + 1;
                                        }
                                        strArr3 = strArr2;
                                        str3 = str3;
                                        i4 = 2;
                                    } else {
                                        i7 = i8 + 1;
                                        strArr3 = strArr2;
                                    }
                                }
                                c2 = 1;
                                if (c2 != 0) {
                                    nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized2.byteBufferValue(0);
                                    if (nativeByteBufferByteBufferValue != null) {
                                        userTLdeserialize = TLRPC.User.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                        nativeByteBufferByteBufferValue.reuse();
                                        dialogSearchResult = (DialogSearchResult) longSparseArray.get(userTLdeserialize.id);
                                        userStatus = userTLdeserialize.status;
                                        if (userStatus != null) {
                                            c = 1;
                                            userStatus.expires = sQLiteCursorQueryFinalized2.intValue(1);
                                        } else {
                                            c = 1;
                                        }
                                        if (c2 == c) {
                                            dialogSearchResult.name = AndroidUtilities.generateSearchName(userTLdeserialize.first_name, userTLdeserialize.last_name, str4);
                                        } else {
                                            dialogSearchResult.name = AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(userTLdeserialize), null, "@" + str4);
                                        }
                                        dialogSearchResult.object = userTLdeserialize;
                                        dialogSearchResult.dialog.id = userTLdeserialize.id;
                                        i5 = i6 + 1;
                                    }
                                    strArr3 = strArr2;
                                    str3 = str3;
                                    i4 = 2;
                                } else {
                                    i7 = i8 + 1;
                                    strArr3 = strArr2;
                                }
                            } else {
                                strArr2 = strArr3;
                            }
                            i5 = i6;
                            strArr3 = strArr2;
                            str3 = str3;
                            i4 = 2;
                        }
                    }
                    strArr = strArr3;
                    str2 = str3;
                    sQLiteCursorQueryFinalized2.dispose();
                    i2 = i5;
                }
                if (!arrayList2.isEmpty()) {
                    SQLiteDatabase database2 = MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getDatabase();
                    Locale locale2 = Locale.US;
                    SQLiteCursor sQLiteCursorQueryFinalized3 = database2.queryFinalized("SELECT data, name FROM chats WHERE uid IN(" + TextUtils.join(",", arrayList2) + ")", new Object[0]);
                    while (sQLiteCursorQueryFinalized3.next()) {
                        String strStringValue2 = sQLiteCursorQueryFinalized3.stringValue(1);
                        String translitString3 = LocaleController.getInstance().getTranslitString(strStringValue2);
                        if (strStringValue2.equals(translitString3)) {
                            translitString3 = null;
                        }
                        int i9 = 0;
                        while (true) {
                            if (i9 < i3) {
                                String str5 = strArr[i9];
                                if (!strStringValue2.startsWith(str5)) {
                                    if (!strStringValue2.contains(" " + str5)) {
                                        if (translitString3 != null) {
                                            if (!translitString3.startsWith(str5)) {
                                                if (translitString3.contains(" " + str5)) {
                                                }
                                            }
                                        }
                                        i9++;
                                    }
                                }
                                NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized3.byteBufferValue(0);
                                if (nativeByteBufferByteBufferValue2 != null) {
                                    TLRPC.Chat chatTLdeserialize = TLRPC.Chat.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false);
                                    nativeByteBufferByteBufferValue2.reuse();
                                    if (chatTLdeserialize != null && !ChatObject.isNotInChat(chatTLdeserialize) && (!ChatObject.isChannel(chatTLdeserialize) || chatTLdeserialize.creator || (((tL_chatAdminRights = chatTLdeserialize.admin_rights) != null && tL_chatAdminRights.post_messages) || chatTLdeserialize.megagroup))) {
                                        DialogSearchResult dialogSearchResult3 = (DialogSearchResult) longSparseArray.get(-chatTLdeserialize.id);
                                        dialogSearchResult3.name = AndroidUtilities.generateSearchName(chatTLdeserialize.title, null, str5);
                                        dialogSearchResult3.object = chatTLdeserialize;
                                        dialogSearchResult3.dialog.id = -chatTLdeserialize.id;
                                        i2++;
                                    }
                                }
                            }
                        }
                    }
                    sQLiteCursorQueryFinalized3.dispose();
                }
                ArrayList<Object> arrayList3 = new ArrayList<>(i2);
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    DialogSearchResult dialogSearchResult4 = (DialogSearchResult) longSparseArray.valueAt(i10);
                    if (dialogSearchResult4.object != null && dialogSearchResult4.name != null) {
                        arrayList3.add(dialogSearchResult4);
                    }
                }
                SQLiteCursor sQLiteCursorQueryFinalized4 = MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getDatabase().queryFinalized("SELECT u.data, u.status, u.name, u.uid FROM users as u INNER JOIN contacts as c ON u.uid = c.uid", new Object[0]);
                while (sQLiteCursorQueryFinalized4.next()) {
                    if (longSparseArray.indexOfKey(sQLiteCursorQueryFinalized4.longValue(3)) < 0) {
                        String strStringValue3 = sQLiteCursorQueryFinalized4.stringValue(2);
                        String translitString4 = LocaleController.getInstance().getTranslitString(strStringValue3);
                        if (strStringValue3.equals(translitString4)) {
                            translitString4 = null;
                        }
                        String str6 = str2;
                        int iLastIndexOf2 = strStringValue3.lastIndexOf(str6);
                        String strSubstring2 = iLastIndexOf2 != -1 ? strStringValue3.substring(iLastIndexOf2 + 3) : null;
                        char c3 = 0;
                        for (int i11 = 0; i11 < i3; i11++) {
                            String str7 = strArr[i11];
                            if (strStringValue3.startsWith(str7)) {
                                c3 = 1;
                            } else {
                                if (strStringValue3.contains(" " + str7)) {
                                    c3 = 1;
                                } else {
                                    if (translitString4 != null) {
                                        if (!translitString4.startsWith(str7)) {
                                            if (translitString4.contains(" " + str7)) {
                                            }
                                        }
                                        c3 = 1;
                                    }
                                    if (strSubstring2 != null && strSubstring2.startsWith(str7)) {
                                        c3 = 2;
                                    }
                                }
                            }
                            if (c3 != 0) {
                                NativeByteBuffer nativeByteBufferByteBufferValue3 = sQLiteCursorQueryFinalized4.byteBufferValue(0);
                                if (nativeByteBufferByteBufferValue3 == null) {
                                    break;
                                }
                                TLRPC.User userTLdeserialize2 = TLRPC.User.TLdeserialize(nativeByteBufferByteBufferValue3, nativeByteBufferByteBufferValue3.readInt32(false), false);
                                nativeByteBufferByteBufferValue3.reuse();
                                DialogSearchResult dialogSearchResult5 = new DialogSearchResult();
                                TLRPC.UserStatus userStatus2 = userTLdeserialize2.status;
                                if (userStatus2 != null) {
                                    userStatus2.expires = sQLiteCursorQueryFinalized4.intValue(1);
                                }
                                dialogSearchResult5.dialog.id = userTLdeserialize2.id;
                                dialogSearchResult5.object = userTLdeserialize2;
                                if (c3 == 1) {
                                    dialogSearchResult5.name = AndroidUtilities.generateSearchName(userTLdeserialize2.first_name, userTLdeserialize2.last_name, str7);
                                } else {
                                    dialogSearchResult5.name = AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(userTLdeserialize2), null, "@" + str7);
                                }
                                arrayList3.add(dialogSearchResult5);
                                break;
                            }
                        }
                        str2 = str6;
                    }
                }
                sQLiteCursorQueryFinalized4.dispose();
                Collections.sort(arrayList3, new SeekBar$$ExternalSyntheticLambda0(11));
                updateSearchResults(arrayList3, i);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public void lambda$updateSearchResults$2(int i, ArrayList arrayList) {
            if (i != this.lastSearchId) {
                return;
            }
            getItemCount();
            this.internalDialogsIsSearching = false;
            this.lastLocalSearchId = i;
            if (this.lastGlobalSearchId != i) {
                this.searchAdapterHelper.clear();
            }
            if (ShareAlert.this.gridView.getAdapter() != ShareAlert.this.searchAdapter) {
                ShareAlert shareAlert = ShareAlert.this;
                shareAlert.topBeforeSwitch = shareAlert.getCurrentTop();
                ShareAlert.this.searchAdapter.notifyDataSetChanged();
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLObject tLObject = ((DialogSearchResult) arrayList.get(i2)).object;
                if (tLObject instanceof TLRPC.User) {
                    MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putUser((TLRPC.User) tLObject, true);
                } else if (tLObject instanceof TLRPC.Chat) {
                    MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putChat((TLRPC.Chat) tLObject, true);
                }
            }
            boolean z = !this.searchResult.isEmpty() && arrayList.isEmpty();
            if (this.searchResult.isEmpty()) {
                arrayList.isEmpty();
            }
            if (z) {
                ShareAlert shareAlert2 = ShareAlert.this;
                shareAlert2.topBeforeSwitch = shareAlert2.getCurrentTop();
            }
            this.searchResult = arrayList;
            this.searchAdapterHelper.mergeResults(arrayList, null);
            int i3 = this.lastItemCont;
            if (getItemCount() != 0 || this.searchAdapterHelper.isSearchInProgress() || this.internalDialogsIsSearching) {
                ShareAlert.this.recyclerItemsEnterAnimator.showItemsAnimated(i3);
            } else {
                ShareAlert.this.searchEmptyView.showProgress(false, true);
            }
            notifyDataSetChanged();
            ShareAlert.this.checkCurrentList(true);
        }

        private void searchDialogsInternal(String str, int i) {
            MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getStorageQueue().postRunnable(new ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0(this, str, i, 2));
        }

        private void updateSearchResults(ArrayList<Object> arrayList, int i) {
            AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda9(this, i, arrayList, 18));
        }

        public TLRPC.Dialog getItem(int i) {
            int i2 = this.recentDialogsStartRow;
            if (i >= i2 && i2 >= 0) {
                int i3 = i - i2;
                if (i3 >= 0 && i3 < ShareAlert.this.recentSearchObjects.size()) {
                    TLObject tLObject = ((DialogsSearchAdapter.RecentSearchObject) ShareAlert.this.recentSearchObjects.get(i3)).object;
                    TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                    if (tLObject instanceof TLRPC.User) {
                        tL_dialog.id = ((TLRPC.User) tLObject).id;
                        return tL_dialog;
                    }
                    if (tLObject instanceof TLRPC.Chat) {
                        tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                        return tL_dialog;
                    }
                }
                return null;
            }
            int i4 = i - 1;
            if (i4 < 0) {
                return null;
            }
            if (i4 < this.searchResult.size()) {
                return ((DialogSearchResult) this.searchResult.get(i4)).dialog;
            }
            int size = i4 - this.searchResult.size();
            ArrayList<TLObject> localServerSearch = this.searchAdapterHelper.getLocalServerSearch();
            if (size < localServerSearch.size()) {
                TLObject tLObject2 = localServerSearch.get(size);
                TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                if (tLObject2 instanceof TLRPC.User) {
                    tL_dialog2.id = ((TLRPC.User) tLObject2).id;
                    return tL_dialog2;
                }
                if (tLObject2 instanceof TLRPC.Chat) {
                    tL_dialog2.id = -((TLRPC.Chat) tLObject2).id;
                    return tL_dialog2;
                }
            }
            return null;
        }

        @Override
        public int getItemCount() {
            this.itemsCount = 0;
            this.hintsCell = -1;
            this.resentTitleCell = -1;
            this.recentDialogsStartRow = -1;
            this.searchResultsStartRow = -1;
            this.lastFilledItem = -1;
            if (TextUtils.isEmpty(this.lastSearchText)) {
                int i = this.itemsCount;
                this.firstEmptyViewCell = i;
                this.itemsCount = i + 2;
                this.hintsCell = i + 1;
                if (ShareAlert.this.recentSearchObjects.size() > 0) {
                    int i2 = this.itemsCount;
                    int i3 = i2 + 1;
                    this.itemsCount = i3;
                    this.resentTitleCell = i2;
                    this.recentDialogsStartRow = i3;
                    this.itemsCount = ShareAlert.this.recentSearchObjects.size() + i3;
                }
                int i4 = this.itemsCount;
                int i5 = i4 + 1;
                this.itemsCount = i5;
                this.lastFilledItem = i4;
                this.lastItemCont = i5;
                return i5;
            }
            int i6 = this.itemsCount;
            int i7 = i6 + 1;
            this.itemsCount = i7;
            this.firstEmptyViewCell = i6;
            this.searchResultsStartRow = i7;
            int size = this.searchAdapterHelper.getLocalServerSearch().size() + this.searchResult.size() + i7;
            this.itemsCount = size;
            if (size == 1) {
                this.firstEmptyViewCell = -1;
                this.itemsCount = 0;
                this.lastItemCont = 0;
                return 0;
            }
            int i8 = size + 1;
            this.itemsCount = i8;
            this.lastFilledItem = size;
            this.lastItemCont = i8;
            return i8;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == this.lastFilledItem) {
                return 4;
            }
            if (i == this.firstEmptyViewCell) {
                return 1;
            }
            if (i == this.hintsCell) {
                return 2;
            }
            if (i == this.resentTitleCell) {
                return 3;
            }
            return TextUtils.isEmpty(this.lastSearchText) ? 0 : 5;
        }

        public int getSpanSize(int i, int i2) {
            if (i2 == this.hintsCell || i2 == this.resentTitleCell || i2 == this.firstEmptyViewCell || i2 == this.lastFilledItem || getItemViewType(i2) == 0) {
                return i;
            }
            return 1;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return (viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 4) ? false : true;
        }

        public boolean isSearching() {
            return !TextUtils.isEmpty(this.lastSearchText);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
            String name;
            CharSequence charSequence;
            long j2;
            int iIndexOfIgnoreCase;
            Object obj;
            CharSequence charSequence2;
            int iIndexOfIgnoreCase2;
            if (viewHolder.getItemViewType() != 0 && viewHolder.getItemViewType() != 5) {
                if (viewHolder.getItemViewType() == 2) {
                    ((RecyclerListView) viewHolder.itemView).getAdapter().notifyDataSetChanged();
                    return;
                }
                return;
            }
            TLObject tLObject = null;
            name = null;
            String name2 = null;
            TLRPC.EncryptedChat encryptedChat = null;
            if (!TextUtils.isEmpty(this.lastSearchText)) {
                int size = i - 1;
                if (size < this.searchResult.size()) {
                    DialogSearchResult dialogSearchResult = (DialogSearchResult) this.searchResult.get(size);
                    j2 = dialogSearchResult.dialog.id;
                    charSequence = dialogSearchResult.name;
                } else {
                    size -= this.searchResult.size();
                    tLObject = this.searchAdapterHelper.getLocalServerSearch().get(size);
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        j = user.id;
                        name = ContactsController.formatName(user.first_name, user.last_name);
                    } else {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        j = -chat.id;
                        name = chat.title;
                    }
                    String lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                    if (TextUtils.isEmpty(lastFoundUsername) || name == null || (iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(name.toString(), lastFoundUsername)) == -1) {
                        charSequence = name;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(name);
                        spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, ((BottomSheet) ShareAlert.this).resourcesProvider), iIndexOfIgnoreCase, lastFoundUsername.length() + iIndexOfIgnoreCase, 33);
                        charSequence = spannableStringBuilder;
                    }
                    j2 = j;
                }
                TLObject tLObject2 = tLObject;
                View view = viewHolder.itemView;
                if (view instanceof ProfileSearchCell) {
                    ((ProfileSearchCell) view).setData(tLObject2, null, charSequence, null, false, false);
                    ((ProfileSearchCell) viewHolder.itemView).useSeparator = size < getItemCount() + (-2);
                    return;
                } else {
                    if (view instanceof ShareDialogCell) {
                        ((ShareDialogCell) view).setDialog(j2, ShareAlert.this.selectedDialogs.indexOfKey(j2) >= 0, charSequence);
                        return;
                    }
                    return;
                }
            }
            int i2 = this.recentDialogsStartRow;
            long j3 = 0;
            if (i2 < 0 || i < i2) {
                obj = null;
                charSequence2 = null;
            } else {
                Object obj2 = ((DialogsSearchAdapter.RecentSearchObject) ShareAlert.this.recentSearchObjects.get(i - i2)).object;
                if (obj2 instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) obj2;
                    j3 = user2.id;
                    name2 = ContactsController.formatName(user2.first_name, user2.last_name);
                } else if (obj2 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
                    j3 = -chat2.id;
                    name2 = chat2.title;
                } else if (obj2 instanceof TLRPC.TL_encryptedChat) {
                    encryptedChat = (TLRPC.TL_encryptedChat) obj2;
                    TLRPC.User user3 = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getUser(Long.valueOf(encryptedChat.user_id));
                    if (user3 != null) {
                        j3 = user3.id;
                        name2 = ContactsController.formatName(user3.first_name, user3.last_name);
                    }
                }
                String lastFoundUsername2 = this.searchAdapterHelper.getLastFoundUsername();
                if (TextUtils.isEmpty(lastFoundUsername2) || name2 == null || (iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(name2.toString(), lastFoundUsername2)) == -1) {
                    obj = obj2;
                    charSequence2 = name2;
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(name2);
                    spannableStringBuilder2.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, ((BottomSheet) ShareAlert.this).resourcesProvider), iIndexOfIgnoreCase2, lastFoundUsername2.length() + iIndexOfIgnoreCase2, 33);
                    obj = obj2;
                    charSequence2 = spannableStringBuilder2;
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
            View view2 = viewHolder.itemView;
            if (view2 instanceof ProfileSearchCell) {
                ((ProfileSearchCell) view2).setData(obj, encryptedChat2, charSequence2, null, false, false);
                ((ProfileSearchCell) viewHolder.itemView).useSeparator = i < getItemCount() + (-2);
            } else {
                CharSequence charSequence3 = charSequence2;
                if (view2 instanceof ShareDialogCell) {
                    ((ShareDialogCell) view2).setDialog(j3, ShareAlert.this.selectedDialogs.indexOfKey(j3) >= 0, charSequence3);
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View view2;
            if (i == 0) {
                ProfileSearchCell profileSearchCell = new ProfileSearchCell(this.context, ((BottomSheet) ShareAlert.this).resourcesProvider);
                profileSearchCell.customPaints = true;
                profileSearchCell.showPremiumBlocked = true;
                view = profileSearchCell;
            } else if (i != 2) {
                if (i == 3) {
                    GraySectionCell graySectionCell = new GraySectionCell(this.context, 16, ((BottomSheet) ShareAlert.this).resourcesProvider);
                    graySectionCell.setTextColor(Theme.key_graySectionText);
                    graySectionCell.setBackgroundColor(ShareAlert.this.getThemedColor(Theme.key_graySection));
                    graySectionCell.setText(LocaleController.getString(R.string.Recent));
                    view2 = graySectionCell;
                } else if (i == 4) {
                    view2 = new View(this.context) {
                        @Override
                        public void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(ShareAlert.this.searchLayoutManager.lastItemHeight, 1073741824));
                        }
                    };
                } else if (i != 5) {
                    View view3 = new View(this.context);
                    view3.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 56.0f : 109.0f)));
                    view2 = view3;
                } else {
                    ShareDialogCell shareDialogCell = new ShareDialogCell(this.context, 0, ((BottomSheet) ShareAlert.this).resourcesProvider);
                    shareDialogCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
                    view2 = shareDialogCell;
                }
                view = view2;
            } else {
                RecyclerListView recyclerListView = new RecyclerListView(this.context, ((BottomSheet) ShareAlert.this).resourcesProvider) {
                    @Override
                    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                        if (getParent() != null && getParent().getParent() != null) {
                            ViewParent parent = getParent().getParent();
                            boolean z = true;
                            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                                z = false;
                            }
                            parent.requestDisallowInterceptTouchEvent(z);
                        }
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                };
                this.categoryListView = recyclerListView;
                recyclerListView.lambda$onCellEnter$52(null);
                recyclerListView.setLayoutAnimation(null);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.context) {
                    {
                        super(1, false);
                    }

                    @Override
                    public boolean supportsPredictiveItemAnimations() {
                        return false;
                    }
                };
                linearLayoutManager.setOrientation(0);
                recyclerListView.setLayoutManager(linearLayoutManager);
                DialogsSearchAdapter.CategoryAdapterRecycler categoryAdapterRecycler = new DialogsSearchAdapter.CategoryAdapterRecycler(this.context, ((BottomSheet) ShareAlert.this).currentAccount, true, true, ((BottomSheet) ShareAlert.this).resourcesProvider) {
                    @Override
                    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                        TLRPC.Chat chat;
                        String firstName;
                        HintDialogCell hintDialogCell = (HintDialogCell) viewHolder.itemView;
                        TLRPC.User user = null;
                        if (ShareAlert.this.darkTheme || ShareAlert.this.forceDarkThemeForHint) {
                            int i3 = Theme.key_voipgroup_nameText;
                            int i4 = Theme.key_voipgroup_inviteMembersBackground;
                            hintDialogCell.nameTextView.setTextColor(Theme.getColor(null, i3, false));
                            hintDialogCell.backgroundColorKey = i4;
                            hintDialogCell.checkBox.setColor(Theme.key_dialogRoundCheckBox, i4, Theme.key_dialogRoundCheckBoxCheck);
                        }
                        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).hints.get(i2);
                        TLRPC.Peer peer = tL_topPeer.peer;
                        long j = peer.user_id;
                        if (j != 0) {
                            user = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getUser(Long.valueOf(tL_topPeer.peer.user_id));
                            chat = null;
                        } else {
                            long j2 = peer.channel_id;
                            if (j2 != 0) {
                                j = -j2;
                                chat = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
                            } else {
                                long j3 = peer.chat_id;
                                if (j3 != 0) {
                                    j = -j3;
                                    chat = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                                } else {
                                    chat = null;
                                    j = 0;
                                }
                            }
                        }
                        boolean z = j == hintDialogCell.getDialogId();
                        hintDialogCell.setTag(Long.valueOf(j));
                        if (user != null) {
                            firstName = UserObject.getFirstName(user);
                        } else {
                            firstName = chat != null ? chat.title : "";
                        }
                        hintDialogCell.setDialog(j, firstName);
                        boolean z2 = ShareAlert.this.selectedDialogs.indexOfKey(j) >= 0;
                        if (hintDialogCell.drawCheckbox) {
                            hintDialogCell.checkBox.setChecked(z2, z);
                        }
                    }
                };
                this.categoryAdapter = categoryAdapterRecycler;
                recyclerListView.setAdapter(categoryAdapterRecycler);
                recyclerListView.setOnItemClickListener(new StarAppsSheet$$ExternalSyntheticLambda0(this, 13));
                view = recyclerListView;
            }
            return new RecyclerListView.Holder(view);
        }

        public void searchDialogs(String str) {
            if (str == null || !str.equals(this.lastSearchText)) {
                this.lastSearchText = str;
                if (this.searchRunnable != null) {
                    Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                    this.searchRunnable = null;
                }
                Runnable runnable = this.searchRunnable2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.searchRunnable2 = null;
                }
                this.searchResult.clear();
                this.searchAdapterHelper.mergeResults(null);
                this.searchAdapterHelper.queryServerSearch(null, true, true, true, true, false, 0L, false, 0, 0);
                notifyDataSetChanged();
                ShareAlert.this.checkCurrentList(true);
                if (TextUtils.isEmpty(str)) {
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.topBeforeSwitch = shareAlert.getCurrentTop();
                    this.lastSearchId = -1;
                    this.internalDialogsIsSearching = false;
                } else {
                    this.internalDialogsIsSearching = true;
                    int i = this.lastSearchId + 1;
                    this.lastSearchId = i;
                    ShareAlert.this.searchEmptyView.showProgress(true, true);
                    DispatchQueue dispatchQueue = Utilities.searchQueue;
                    ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0 shareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0 = new ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0(this, str, i, 1);
                    this.searchRunnable = shareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0;
                    dispatchQueue.postRunnable(shareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0, 300L);
                }
                ShareAlert.this.checkCurrentList(false);
            }
        }
    }

    public class ShareTopicsAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;
        private boolean isBotForum;
        private boolean isBotForumWithManageTopics;
        private List<TLRPC.TL_forumTopic> topics;

        public ShareTopicsAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getItemCount() {
            List<TLRPC.TL_forumTopic> list = this.topics;
            return (list != null ? list.size() + 1 : 0) + (this.isBotForum ? 1 : 0);
        }

        public TLRPC.TL_forumTopic getItemTopic(int i) {
            int i2 = i - 1;
            if (this.isBotForum) {
                i2 = i - 2;
            }
            List<TLRPC.TL_forumTopic> list = this.topics;
            if (list == null || i2 < 0 || i2 >= list.size()) {
                return null;
            }
            return this.topics.get(i2);
        }

        @Override
        public int getItemViewType(int i) {
            return i == 0 ? 1 : 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 1;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                ShareTopicCell shareTopicCell = (ShareTopicCell) viewHolder.itemView;
                if (i == 1 && this.isBotForum) {
                    shareTopicCell.setAsNewBotForumTopic(this.isBotForumWithManageTopics);
                    return;
                }
                if (this.topics != null) {
                    TLRPC.TL_forumTopic itemTopic = getItemTopic(i);
                    TLRPC.Dialog dialog = ShareAlert.this.selectedTopicDialog;
                    boolean z = itemTopic != null && ShareAlert.this.selectedDialogs.indexOfKey((long) itemTopic.id) >= 0;
                    if (dialog == null) {
                        shareTopicCell.getClass();
                        return;
                    }
                    TLRPC.Chat chat = MessagesController.getInstance(shareTopicCell.currentAccount).getChat(Long.valueOf(-dialog.id));
                    long j = dialog.id;
                    int i2 = shareTopicCell.currentAccount;
                    TextView textView = shareTopicCell.nameTextView;
                    if (j > 0) {
                        textView.setText(itemTopic.title);
                    } else if (chat == null) {
                        textView.setText("");
                    } else if (chat.monoforum) {
                        textView.setText(MessagesController.getInstance(i2).getPeerName(DialogObject.getPeerDialogId(itemTopic.from_id)));
                    } else {
                        textView.setText(itemTopic.title);
                    }
                    boolean zIsMonoForum = ChatObject.isMonoForum(chat);
                    BackupImageView backupImageView = shareTopicCell.imageView;
                    if (zIsMonoForum) {
                        backupImageView.setAnimatedEmojiDrawable(null);
                        backupImageView.setImageDrawable(null);
                        long peerDialogId = DialogObject.getPeerDialogId(itemTopic.from_id);
                        boolean zIsUserDialog = DialogObject.isUserDialog(peerDialogId);
                        ShareTopicCell.AnonymousClass1 anonymousClass1 = shareTopicCell.avatarDrawable;
                        if (zIsUserDialog) {
                            TLRPC.User user = MessagesController.getInstance(i2).getUser(Long.valueOf(peerDialogId));
                            textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, shareTopicCell.resourcesProvider));
                            anonymousClass1.setInfo(i2, user);
                            if (user != null) {
                                textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                            } else {
                                textView.setText("");
                            }
                            backupImageView.setForUserOrChat(user, anonymousClass1);
                            backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i2).getChat(Long.valueOf(peerDialogId));
                            if (chat2 != null) {
                                textView.setText(chat2.title);
                            } else {
                                textView.setText("");
                            }
                            anonymousClass1.setInfo(i2, chat2);
                            backupImageView.setForUserOrChat(chat, anonymousClass1);
                        }
                    } else if (itemTopic.icon_emoji_id != 0) {
                        backupImageView.setImageDrawable(null);
                        backupImageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(13, UserConfig.selectedAccount, itemTopic.icon_emoji_id));
                    } else {
                        backupImageView.setAnimatedEmojiDrawable(null);
                        ForumBubbleDrawable forumBubbleDrawable = new ForumBubbleDrawable(itemTopic.icon_color);
                        LetterDrawable letterDrawable = new LetterDrawable(null, 1);
                        String upperCase = itemTopic.title.trim().toUpperCase();
                        letterDrawable.setTitle(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                        letterDrawable.scale = 1.8f;
                        CombinedDrawable combinedDrawable = new CombinedDrawable(forumBubbleDrawable, letterDrawable, 0, 0);
                        combinedDrawable.setFullsize(true);
                        backupImageView.setImageDrawable(combinedDrawable);
                    }
                    backupImageView.setRoundRadius((chat == null || !chat.forum || z) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
                    shareTopicCell.currentDialog = dialog.id;
                    shareTopicCell.currentTopic = itemTopic.id;
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shareTopicCell;
            if (i == 0 || i == 2) {
                shareTopicCell = new ShareTopicCell(this.context, ((BottomSheet) ShareAlert.this).resourcesProvider);
                shareTopicCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
            } else {
                shareTopicCell = new View(this.context);
                shareTopicCell.setLayoutParams(new RecyclerView.LayoutParams(-1, ActionBar.getCurrentActionBarHeight()));
            }
            return new RecyclerListView.Holder(shareTopicCell);
        }
    }

    public class SwitchView extends FrameLayout {
        private AnimatorSet animator;
        private int currentTab;
        private int lastColor;
        private SimpleTextView leftTab;
        private LinearGradient linearGradient;
        private Paint paint;
        private RectF rect;
        private SimpleTextView rightTab;
        private View searchBackground;
        private View slidingView;
        private float tabSwitchProgress;

        public SwitchView(Context context) {
            super(context);
            this.paint = new Paint(1);
            this.rect = new RectF();
            View view = new View(context);
            this.searchBackground = view;
            view.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), ShareAlert.this.getThemedColor(Theme.key_dialogSearchBackground)));
            addView(this.searchBackground, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
            View view2 = new View(context) {
                @Override
                public void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                    int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                    if (offsetColor != SwitchView.this.lastColor) {
                        SwitchView.this.linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP);
                        SwitchView.this.paint.setShader(SwitchView.this.linearGradient);
                    }
                    SwitchView.this.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(SwitchView.this.rect, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), SwitchView.this.paint);
                }

                @Override
                public void setTranslationX(float f) {
                    super.setTranslationX(f);
                    invalidate();
                }
            };
            this.slidingView = view2;
            addView(view2, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.leftTab = simpleTextView;
            int i = Theme.key_voipgroup_nameText;
            simpleTextView.setTextColor(ShareAlert.this.getThemedColor(i));
            this.leftTab.setTextSize(13);
            this.leftTab.setLeftDrawable(R.drawable.msg_tabs_mic1);
            this.leftTab.setText(LocaleController.getString(R.string.VoipGroupInviteCanSpeak));
            this.leftTab.setGravity(17);
            addView(this.leftTab, LayoutHelper.createFrame(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
            final int i2 = 0;
            this.leftTab.setOnClickListener(new View.OnClickListener(this) {
                public final ShareAlert.SwitchView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$new$0(view3);
                            break;
                        default:
                            this.f$0.lambda$new$1(view3);
                            break;
                    }
                }
            });
            SimpleTextView simpleTextView2 = new SimpleTextView(context);
            this.rightTab = simpleTextView2;
            simpleTextView2.setTextColor(ShareAlert.this.getThemedColor(i));
            this.rightTab.setTextSize(13);
            this.rightTab.setLeftDrawable(R.drawable.msg_tabs_mic2);
            this.rightTab.setText(LocaleController.getString(R.string.VoipGroupInviteListenOnly));
            this.rightTab.setGravity(17);
            addView(this.rightTab, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
            final int i3 = 1;
            this.rightTab.setOnClickListener(new View.OnClickListener(this) {
                public final ShareAlert.SwitchView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$new$0(view3);
                            break;
                        default:
                            this.f$0.lambda$new$1(view3);
                            break;
                    }
                }
            });
        }

        public void lambda$new$0(View view) {
            switchToTab(0);
        }

        public void lambda$new$1(View view) {
            switchToTab(1);
        }

        private void switchToTab(int i) {
            if (this.currentTab == i) {
                return;
            }
            this.currentTab = i;
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animator = animatorSet2;
            View view = this.slidingView;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, this.currentTab == 0 ? 0.0f : view.getMeasuredWidth()));
            this.animator.setDuration(180L);
            this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SwitchView.this.animator = null;
                }
            });
            this.animator.start();
            onTabSwitch(this.currentTab);
        }

        @Override
        public void onMeasure(int i, int i2) {
            int size = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(28.0f)) / 2;
            ((FrameLayout.LayoutParams) this.leftTab.getLayoutParams()).width = size;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.rightTab.getLayoutParams();
            layoutParams.width = size;
            layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.slidingView.getLayoutParams();
            layoutParams2.width = size;
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.slidingView.setTranslationX(this.currentTab == 0 ? 0.0f : layoutParams2.width);
            super.onMeasure(i, i2);
        }

        public void onTabSwitch(int i) {
        }
    }

    public ShareAlert(Context context, ArrayList<MessageObject> arrayList, String str, boolean z, String str2, boolean z2) {
        this(context, arrayList, str, z, str2, z2, null);
    }

    public void blur3_InvalidateBlur() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        this.iBlur3PositionMainTabs.set(0.0f, 0.0f, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        this.iBlur3PositionMainTabs.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        this.scrollableViewNoiseSuppressor.setupRenderNodes(1, this.iBlur3Positions);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public void checkCurrentList(boolean z) {
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.searchView.editText.getText()) || ((this.keyboardVisible && this.searchView.editText.hasFocus()) || this.searchWasVisibleBeforeTopics)) {
            this.updateSearchAdapter = true;
            if (this.selectedTopicDialog == null) {
                AndroidUtilities.updateViewVisibilityAnimated(this.gridView, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(this.searchGridView, true);
            }
        } else {
            if (this.selectedTopicDialog == null) {
                AndroidUtilities.updateViewVisibilityAnimated(this.gridView, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(this.searchGridView, false);
            }
            z2 = false;
        }
        if (this.searchIsVisible != z2 || z) {
            this.searchIsVisible = z2;
            this.searchAdapter.notifyDataSetChanged();
            this.listAdapter.notifyDataSetChanged();
            if (this.searchIsVisible) {
                if (this.lastOffset == Integer.MAX_VALUE) {
                    ((LinearLayoutManager) this.searchGridView.getLayoutManager()).scrollToPositionWithOffset(0, -this.searchGridView.getPaddingTop());
                } else {
                    ((LinearLayoutManager) this.searchGridView.getLayoutManager()).scrollToPositionWithOffset(0, this.lastOffset - this.searchGridView.getPaddingTop());
                }
                this.searchAdapter.searchDialogs(this.searchView.editText.getText().toString());
                return;
            }
            if (this.lastOffset == Integer.MAX_VALUE) {
                this.layoutManager.scrollToPositionWithOffset(0, 0);
            } else {
                this.layoutManager.scrollToPositionWithOffset(0, 0);
            }
        }
    }

    private void collapseTopics() {
        TLRPC.Dialog dialog = this.selectedTopicDialog;
        if (dialog == null) {
            return;
        }
        View view = null;
        this.selectedTopicDialog = null;
        for (int i = 0; i < getMainGridView().getChildCount(); i++) {
            View childAt = getMainGridView().getChildAt(i);
            if ((childAt instanceof ShareDialogCell) && ((ShareDialogCell) childAt).getCurrentDialog() == dialog.id) {
                view = childAt;
            }
        }
        if (view == null) {
            return;
        }
        SpringAnimation springAnimation = this.topicsAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        getMainGridView().setVisibility(0);
        this.searchView.setVisibility(0);
        if (this.searchIsVisible || this.searchWasVisibleBeforeTopics) {
            this.sizeNotifierFrameLayout.adjustPanLayoutHelper.ignoreOnce();
            this.searchView.editText.requestFocus();
            AndroidUtilities.showKeyboard(this.searchView.editText);
        }
        int[] iArr = new int[2];
        SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(1000.0f));
        SpringForce springForce = new SpringForce(0.0f);
        ChatActivity chatActivity = this.parentFragment;
        springForce.setStiffness((chatActivity == null || !chatActivity.shareAlertDebugTopicsSlowMotion) ? 800.0f : 10.0f);
        springForce.setDampingRatio(1.0f);
        springAnimation2.mSpring = springForce;
        this.topicsAnimation = springAnimation2;
        springAnimation2.addUpdateListener(new ShareAlert$$ExternalSyntheticLambda9(this, (ShareDialogCell) view, iArr, 0));
        this.topicsAnimation.addEndListener(new Bulletin$$ExternalSyntheticLambda3(this, 5));
        this.topicsAnimation.start();
    }

    private void copyLink(Context context) {
        boolean z = false;
        if (this.exportedMessageLink == null && this.linkToCopy[0] == null) {
            return;
        }
        try {
            String link = getLink();
            ClipboardManager clipboardManager = (ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard");
            if (link == null) {
                link = this.exportedMessageLink.link;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("label", link));
            ShareAlertDelegate shareAlertDelegate = this.delegate;
            if (shareAlertDelegate != null && shareAlertDelegate.didCopy()) {
                return;
            }
            if (this.parentActivity instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.exportedMessageLink;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z = true;
                }
                ((LaunchActivity) this.parentActivity).showBulletin(new LoginActivity$$ExternalSyntheticLambda32(z, 3));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static ShareAlert createShareAlert(Context context, MessageObject messageObject, String str, boolean z, String str2, boolean z2) {
        return new ShareAlert(context, null, messageObject != null ? MediaController$$ExternalSyntheticOutline1.m(messageObject) : null, str, null, z, str2, null, z2, false);
    }

    public int getCurrentTop() {
        if (this.gridView.getChildCount() == 0) {
            return -1000;
        }
        int top = 0;
        View childAt = this.gridView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.gridView.findContainingViewHolder(childAt);
        if (holder == null) {
            return -1000;
        }
        int paddingTop = this.gridView.getPaddingTop();
        if (holder.getLayoutPosition() == 0 && childAt.getTop() >= 0) {
            top = childAt.getTop();
        }
        return paddingTop - top;
    }

    private String getLink() {
        String string;
        SwitchView switchView = this.switchView;
        if (switchView != null) {
            string = this.linkToCopy[switchView.currentTab];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.exportedMessageLink;
            string = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            if (string == null) {
                string = this.linkToCopy[0];
            }
        }
        CheckBox2 checkBox2 = this.timestampCheckbox;
        if (checkBox2 != null && checkBox2.isChecked()) {
            try {
                string = Uri.parse(string).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.timestamp)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return string == null ? "" : string;
    }

    private RecyclerListView getMainGridView() {
        return (this.searchIsVisible || this.searchWasVisibleBeforeTopics) ? this.searchGridView : this.gridView;
    }

    public void invalidateTopicsAnimation(View view, int[] iArr, float f) {
        this.topicsGridView.setPivotX((view.getWidth() / 2.0f) + view.getX());
        this.topicsGridView.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f2 = 0.25f * f;
        float f3 = 0.75f + f2;
        this.topicsGridView.setScaleX(f3);
        this.topicsGridView.setScaleY(f3);
        this.topicsGridView.setAlpha(f);
        RecyclerListView mainGridView = getMainGridView();
        mainGridView.setPivotX((view.getWidth() / 2.0f) + view.getX());
        mainGridView.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f4 = f2 + 1.0f;
        mainGridView.setScaleX(f4);
        mainGridView.setScaleY(f4);
        float f5 = 1.0f - f;
        mainGridView.setAlpha(f5);
        FragmentSearchField fragmentSearchField = this.searchView;
        fragmentSearchField.setPivotX(fragmentSearchField.getWidth() / 2.0f);
        this.searchView.setPivotY(0.0f);
        float f6 = (0.1f * f5) + 0.9f;
        this.searchView.setScaleX(f6);
        this.searchView.setScaleY(f6);
        this.searchView.setAlpha(f5);
        this.topicsBackActionBar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f5);
        this.topicsBackActionBar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f5);
        this.topicsBackActionBar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f5);
        this.topicsBackActionBar.setAlpha(f);
        this.topicsGridView.getLocationInWindow(iArr);
        float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(f);
        for (int i = 0; i < mainGridView.getChildCount(); i++) {
            View childAt = mainGridView.getChildAt(i);
            if (childAt instanceof ShareDialogCell) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f5);
                }
            }
        }
        for (int i2 = 0; i2 < this.topicsGridView.getChildCount(); i2++) {
            View childAt2 = this.topicsGridView.getChildAt(i2);
            if (childAt2 instanceof ShareTopicCell) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) (Math.pow(d, 2.0d) * ((double) (-(childAt2.getX() - view.getX())))));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * ((double) (-((this.topicsGridView.getTranslationY() + childAt2.getY()) - view.getY())))));
            }
        }
        this.containerView.requestLayout();
        mainGridView.invalidate();
    }

    private boolean isBotForumWithNotEmptyTopics(TLRPC.User user) {
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id);
        return ((topics == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id)) ? false : true;
    }

    public void lambda$collapseTopics$22(View view, int[] iArr, DynamicAnimation dynamicAnimation, float f, float f2) {
        invalidateTopicsAnimation(view, iArr, f / 1000.0f);
    }

    public void lambda$collapseTopics$23(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        this.topicsGridView.setVisibility(8);
        this.topicsBackActionBar.setVisibility(8);
        this.shareTopicsAdapter.topics = null;
        this.shareTopicsAdapter.notifyDataSetChanged();
        this.topicsAnimation = null;
        this.searchWasVisibleBeforeTopics = false;
    }

    public static Bulletin lambda$copyLink$31(boolean z, BulletinFactory bulletinFactory) {
        return bulletinFactory.createCopyLinkBulletin(z);
    }

    public void lambda$new$0(TLObject tLObject, Context context) {
        if (tLObject != null) {
            this.exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject;
            updateLinkTextView();
            if (this.copyLinkOnEnd) {
                copyLink(context);
            }
        }
        this.loadingLink = false;
    }

    public void lambda$new$1(Context context, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda12(this, tLObject, context, 0));
    }

    public void lambda$new$10(View view) throws FileNotFoundException {
        if (this.selectedDialogs.size() == 0) {
            if (this.isChannel || this.linkToCopy[0] != null) {
                lambda$showGiftOfferSheet$15();
                PhotoViewer.getInstance().closePhoto(true, false);
                if (this.linkToCopy[0] != null || !this.loadingLink) {
                    copyLink(getContext());
                } else {
                    this.copyLinkOnEnd = true;
                    Toast.makeText(getContext(), LocaleController.getString(R.string.Loading), 0).show();
                }
            }
        }
    }

    public void lambda$new$11(View view) {
        if (this.selectedDialogs.size() == 0) {
            if (this.isChannel || this.linkToCopy[0] != null) {
                lambda$showGiftOfferSheet$15();
                if (this.linkToCopy[0] != null || !this.loadingLink) {
                    copyLink(getContext());
                } else {
                    this.copyLinkOnEnd = true;
                    Toast.makeText(getContext(), LocaleController.getString(R.string.Loading), 0).show();
                }
            }
        }
    }

    public void lambda$new$12(MessageObject messageObject, View view) {
        BaseFragment safeLastFragment = this.parentFragment;
        if (safeLastFragment == null) {
            safeLastFragment = LaunchActivity.getSafeLastFragment();
        }
        if (safeLastFragment == null) {
            return;
        }
        lambda$showGiftOfferSheet$15();
        safeLastFragment.presentFragment(new MessageStatisticActivity(messageObject));
    }

    public void lambda$new$13(View view) {
        if (this.selectedDialogs.size() == 0) {
            if (this.isChannel || this.linkToCopy[0] != null) {
                lambda$showGiftOfferSheet$15();
                if (this.linkToCopy[0] != null || !this.loadingLink) {
                    copyLink(getContext());
                } else {
                    this.copyLinkOnEnd = true;
                    Toast.makeText(getContext(), LocaleController.getString(R.string.Loading), 0).show();
                }
            }
        }
    }

    public void lambda$new$14(MessageObject messageObject, View view) {
        BaseFragment safeLastFragment = this.parentFragment;
        if (safeLastFragment == null) {
            safeLastFragment = LaunchActivity.getSafeLastFragment();
        }
        if (safeLastFragment == null) {
            return;
        }
        lambda$showGiftOfferSheet$15();
        safeLastFragment.presentFragment(new MessageStatisticActivity(messageObject));
    }

    public static boolean lambda$new$15(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$new$16(View view) {
        sendInternal(true);
    }

    public boolean lambda$new$17(View view) {
        return onSendLongClick(this.writeButton);
    }

    public void lambda$new$18(View view) {
        CheckBox2 checkBox2 = this.timestampCheckbox;
        checkBox2.setChecked(!checkBox2.isChecked(), true);
        updateLinkTextView();
    }

    public boolean lambda$new$2(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null) {
            return false;
        }
        if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        AndroidUtilities.hideKeyboard(this.searchView.editText);
        return false;
    }

    public void lambda$new$3() {
        this.updateSearchAdapter = true;
        this.searchView.editText.setText("");
        AndroidUtilities.showKeyboard(this.searchView.editText);
    }

    public static Integer lambda$new$4(Integer num) {
        return 0;
    }

    public void lambda$new$5(View view, int i) {
        if (this.shareTopicsAdapter.isBotForum && i == 1) {
            onTopicCreateCellClick();
            return;
        }
        TLRPC.TL_forumTopic itemTopic = this.shareTopicsAdapter.getItemTopic(i);
        if (itemTopic != null) {
            onTopicCellClick(itemTopic);
        }
    }

    public static Integer lambda$new$6(Integer num) {
        return 0;
    }

    public void lambda$new$7(View view, int i) {
        TLRPC.Dialog item;
        if (i >= 0 && (item = this.listAdapter.getItem(i)) != null) {
            selectDialog(view, item);
        }
    }

    public static Integer lambda$new$8(Integer num) {
        return 0;
    }

    public void lambda$new$9(View view, int i) {
        TLRPC.Dialog item;
        if (i >= 0 && (item = this.searchAdapter.getItem(i)) != null) {
            selectDialog(view, item);
        }
    }

    public void lambda$onSendLongClick$24(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
    }

    public void lambda$onSendLongClick$25(ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, View view) {
        this.showSendersName = true;
        actionBarMenuSubItem.setChecked(true);
        actionBarMenuSubItem2.setChecked(!this.showSendersName);
    }

    public void lambda$onSendLongClick$26(ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, View view) {
        this.showSendersName = false;
        actionBarMenuSubItem.setChecked(false);
        actionBarMenuSubItem2.setChecked(!this.showSendersName);
    }

    public void lambda$onSendLongClick$27(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
    }

    public void lambda$onSendLongClick$28(View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
        sendInternal(false);
    }

    public void lambda$onSendLongClick$29(View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
        sendInternal(true);
    }

    public void lambda$selectDialog$21(AtomicReference atomicReference, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        notificationCenterDelegate.didReceivedNotification(NotificationCenter.topicsDidLoaded, this.currentAccount, Long.valueOf(-dialog.id));
    }

    public void lambda$sendInternal$30(CharSequence[] charSequenceArr, ArrayList arrayList, boolean z, int i, HashMap map) {
        boolean z2;
        char c;
        MessageObject messageObject;
        SendMessagesHelper.SendMessageParams sendMessageParamsOf;
        HashMap map2 = map;
        long peerDialogId = 0;
        ?? r8 = 0;
        if (this.sendingMessageObjects != null) {
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            boolean z3 = false;
            while (i2 < this.selectedDialogs.size()) {
                long jKeyAt = this.selectedDialogs.keyAt(i2);
                boolean zIsMonoForum = MessagesController.getInstance(this.currentAccount).isMonoForum(jKeyAt);
                Long l = map2 == null ? 0L : (Long) map2.get(Long.valueOf(jKeyAt));
                if (l != null && l.longValue() > peerDialogId) {
                    z3 = true;
                }
                TLRPC.TL_forumTopic tL_forumTopic = this.selectedDialogTopics.get(this.selectedDialogs.get(jKeyAt));
                if (tL_forumTopic != null && zIsMonoForum) {
                    peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
                }
                MessageObject messageObject2 = (tL_forumTopic == null || zIsMonoForum) ? null : new MessageObject(this.currentAccount, tL_forumTopic.topicStartMessage, r8, r8);
                if (messageObject2 != null) {
                    messageObject2.isTopicMainMessage = true;
                }
                if (this.frameLayout2.getTag() == null || this.commentTextView.length() <= 0) {
                    i2 = i2;
                } else {
                    CharSequence charSequence = charSequenceArr[r8];
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf2 = SendMessagesHelper.SendMessageParams.of(charSequence == null ? null : charSequence.toString(), jKeyAt, messageObject2, messageObject2, null, true, arrayList, null, null, z, 0, 0, null, false);
                    sendMessageParamsOf2.payStars = l == null ? peerDialogId : l.longValue();
                    sendMessageParamsOf2.monoForumPeer = peerDialogId;
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf2);
                }
                int iSendMessage = SendMessagesHelper.getInstance(this.currentAccount).sendMessage(this.sendingMessageObjects, jKeyAt, !this.showSendersName, false, z, 0, 0, messageObject2, i, l == null ? peerDialogId : l.longValue(), peerDialogId, null);
                if (iSendMessage != 0) {
                    arrayList2.add(Long.valueOf(jKeyAt));
                }
                if (this.selectedDialogs.size() == 1) {
                    AlertsCreator.showSendMediaAlert(iSendMessage, this.parentFragment, null);
                    if (iSendMessage != 0) {
                        break;
                    }
                }
                i2++;
                peerDialogId = peerDialogId;
                r8 = 0;
            }
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                long jLongValue = ((Long) obj).longValue();
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.selectedDialogs.get(jLongValue);
                this.selectedDialogs.remove(jLongValue);
                if (dialog != null) {
                    this.selectedDialogTopics.remove(dialog);
                }
            }
            if (!this.selectedDialogs.isEmpty()) {
                onSend(this.selectedDialogs, this.sendingMessageObjects.size(), this.selectedDialogs.size() == 1 ? this.selectedDialogTopics.get(this.selectedDialogs.valueAt(0)) : null, true ^ z3);
            }
        } else {
            SwitchView switchView = this.switchView;
            int i4 = switchView != null ? switchView.currentTab : 0;
            if (this.storyItem != null) {
                boolean z4 = false;
                for (int i5 = 0; i5 < this.selectedDialogs.size(); i5++) {
                    long jKeyAt2 = this.selectedDialogs.keyAt(i5);
                    boolean zIsMonoForum2 = MessagesController.getInstance(this.currentAccount).isMonoForum(jKeyAt2);
                    Long l2 = map2 == null ? 0L : (Long) map2.get(Long.valueOf(jKeyAt2));
                    if (l2 != null && l2.longValue() > 0) {
                        z4 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic2 = this.selectedDialogTopics.get(this.selectedDialogs.get(jKeyAt2));
                    long peerDialogId2 = (tL_forumTopic2 == null || !zIsMonoForum2) ? 0L : DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                    MessageObject messageObject3 = (tL_forumTopic2 == null || zIsMonoForum2) ? null : new MessageObject(this.currentAccount, tL_forumTopic2.topicStartMessage, false, false);
                    if (this.storyItem != null) {
                        if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject4 = messageObject3;
                            messageObject3 = messageObject4;
                            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), jKeyAt2, null, messageObject4, null, true, null, null, null, z, 0, 0, null, false));
                        }
                        sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(null, jKeyAt2, messageObject3, messageObject3, null, true, null, null, null, z, 0, 0, null, false);
                        sendMessageParamsOf.sendingStory = this.storyItem;
                    } else if (this.frameLayout2.getTag() == null || this.commentTextView.length() <= 0) {
                        sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(this.sendingText[i4], jKeyAt2, messageObject3, messageObject3, null, true, null, null, null, z, 0, 0, null, false);
                    } else {
                        CharSequence charSequence2 = charSequenceArr[0];
                        sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(charSequence2 == null ? null : charSequence2.toString(), jKeyAt2, messageObject3, messageObject3, null, true, arrayList, null, null, z, 0, 0, null, false);
                    }
                    sendMessageParamsOf.payStars = l2 == null ? 0L : l2.longValue();
                    sendMessageParamsOf.monoForumPeer = peerDialogId2;
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf);
                }
                z2 = z4;
            } else if (this.sendingText[i4] != null) {
                int i6 = 0;
                boolean z5 = false;
                while (i6 < this.selectedDialogs.size()) {
                    long jKeyAt3 = this.selectedDialogs.keyAt(i6);
                    boolean zIsMonoForum3 = MessagesController.getInstance(this.currentAccount).isMonoForum(jKeyAt3);
                    Long l3 = map2 == null ? 0L : (Long) map2.get(Long.valueOf(jKeyAt3));
                    if (l3 != null && l3.longValue() > 0) {
                        z5 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic3 = this.selectedDialogTopics.get(this.selectedDialogs.get(jKeyAt3));
                    long peerDialogId3 = (tL_forumTopic3 == null || !zIsMonoForum3) ? 0L : DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    if (tL_forumTopic3 == null || zIsMonoForum3) {
                        c = 0;
                        messageObject = null;
                    } else {
                        c = 0;
                        messageObject = new MessageObject(this.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    }
                    if (this.frameLayout2.getTag() == null || this.commentTextView.length() <= 0) {
                        i6 = i6;
                    } else {
                        CharSequence charSequence3 = charSequenceArr[c];
                        SendMessagesHelper.SendMessageParams sendMessageParamsOf3 = SendMessagesHelper.SendMessageParams.of(charSequence3 == null ? null : charSequence3.toString(), jKeyAt3, messageObject, messageObject, null, true, arrayList, null, null, z, 0, 0, null, false);
                        sendMessageParamsOf3.payStars = l3 == null ? 0L : l3.longValue();
                        sendMessageParamsOf3.monoForumPeer = peerDialogId3;
                        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf3);
                    }
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf4 = SendMessagesHelper.SendMessageParams.of(this.sendingText[i4], jKeyAt3, messageObject, messageObject, null, true, null, null, null, z, 0, 0, null, false);
                    sendMessageParamsOf4.payStars = l3 == null ? 0L : l3.longValue();
                    sendMessageParamsOf4.monoForumPeer = peerDialogId3;
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf4);
                    i6++;
                    map2 = map;
                }
                z2 = z5;
            } else {
                z2 = false;
            }
            LongSparseArray longSparseArray = this.selectedDialogs;
            onSend(longSparseArray, 1, this.selectedDialogTopics.get(longSparseArray.valueAt(0)), !z2);
        }
        ShareAlertDelegate shareAlertDelegate = this.delegate;
        if (shareAlertDelegate != null) {
            shareAlertDelegate.didShare();
        }
        lambda$showGiftOfferSheet$15();
    }

    public static void lambda$showPremiumBlockedToast$19() {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            lastFragment.showAsSheet(new PremiumPreviewFragment("noncontacts"), bottomSheetParams);
        }
    }

    public void lambda$showPremiumBlockedToast$20() {
        UndoView$$ExternalSyntheticLambda7 undoView$$ExternalSyntheticLambda7 = new UndoView$$ExternalSyntheticLambda7(19);
        if (!isKeyboardVisible()) {
            lambda$showPremiumBlockedToast$19();
            return;
        }
        FragmentSearchField fragmentSearchField = this.searchView;
        if (fragmentSearchField != null) {
            AndroidUtilities.hideKeyboard(fragmentSearchField.editText);
        }
        AndroidUtilities.runOnUIThread(undoView$$ExternalSyntheticLambda7, 300L);
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        processLegacyContainerInsets(windowInsetsCompat.toWindowInsets());
        Insets insets = windowInsetsCompat.mImpl.getInsets(519);
        if (!this.systemInsets.equals(insets)) {
            this.systemInsets = insets;
            this.container.requestLayout();
        }
        return WindowInsetsCompat.CONSUMED;
    }

    private boolean onSendLongClick(View view) {
        ChatActivity chatActivity;
        if (this.parentActivity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        if (this.sendingMessageObjects != null) {
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.parentActivity, R.drawable.popup_fixed_alert2, this.resourcesProvider, 0);
            if (this.darkTheme) {
                actionBarPopupWindowLayout.setBackgroundColor(getThemedColor(Theme.key_voipgroup_inviteMembersBackground));
            }
            actionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindowLayout.setOnTouchListener(new View.OnTouchListener() {
                private Rect popupRect = new Rect();

                @Override
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    if (motionEvent.getActionMasked() != 0 || ShareAlert.this.sendPopupWindow == null || !ShareAlert.this.sendPopupWindow.isShowing()) {
                        return false;
                    }
                    view2.getHitRect(this.popupRect);
                    if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        return false;
                    }
                    ShareAlert.this.sendPopupWindow.dismiss();
                    return false;
                }
            });
            actionBarPopupWindowLayout.setDispatchKeyEventListener(new ShareAlert$$ExternalSyntheticLambda3(this, 0));
            actionBarPopupWindowLayout.setShownFromBottom(false);
            final ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(1, getContext(), this.resourcesProvider, true, false);
            if (this.darkTheme) {
                actionBarMenuSubItem.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            }
            actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem, LayoutHelper.createLinear(-1, 48));
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.ShowSendersName), 0);
            this.showSendersName = true;
            actionBarMenuSubItem.setChecked(true);
            final ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(1, getContext(), this.resourcesProvider, false, true);
            if (this.darkTheme) {
                actionBarMenuSubItem2.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            }
            actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem2, LayoutHelper.createLinear(-1, 48));
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.HideSendersName), 0);
            actionBarMenuSubItem2.setChecked(!this.showSendersName);
            final int i = 0;
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener(this) {
                public final ShareAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$onSendLongClick$25(actionBarMenuSubItem, actionBarMenuSubItem2, view2);
                            break;
                        default:
                            this.f$0.lambda$onSendLongClick$26(actionBarMenuSubItem, actionBarMenuSubItem2, view2);
                            break;
                    }
                }
            });
            final int i2 = 1;
            actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener(this) {
                public final ShareAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$onSendLongClick$25(actionBarMenuSubItem, actionBarMenuSubItem2, view2);
                            break;
                        default:
                            this.f$0.lambda$onSendLongClick$26(actionBarMenuSubItem, actionBarMenuSubItem2, view2);
                            break;
                    }
                }
            });
            actionBarPopupWindowLayout.setupRadialSelectors(getThemedColor(Theme.key_dialogButtonSelector));
            linearLayout.addView(actionBarPopupWindowLayout, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, -8.0f));
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.parentActivity, R.drawable.popup_fixed_alert2, this.resourcesProvider, 0);
        if (this.darkTheme) {
            actionBarPopupWindowLayout2.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_inviteMembersBackground, false));
        }
        actionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindowLayout2.setOnTouchListener(new View.OnTouchListener() {
            private Rect popupRect = new Rect();

            @Override
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0 || ShareAlert.this.sendPopupWindow == null || !ShareAlert.this.sendPopupWindow.isShowing()) {
                    return false;
                }
                view2.getHitRect(this.popupRect);
                if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                ShareAlert.this.sendPopupWindow.dismiss();
                return false;
            }
        });
        actionBarPopupWindowLayout2.setDispatchKeyEventListener(new ShareAlert$$ExternalSyntheticLambda3(this, 2));
        actionBarPopupWindowLayout2.setShownFromBottom(false);
        ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(0, getContext(), this.resourcesProvider, true, true);
        if (this.darkTheme) {
            actionBarMenuSubItem3.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            actionBarMenuSubItem3.setIconColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
        }
        actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off);
        actionBarMenuSubItem3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindowLayout2.addView((View) actionBarMenuSubItem3, LayoutHelper.createLinear(-1, 48));
        actionBarMenuSubItem3.setOnClickListener(new ShareAlert$$ExternalSyntheticLambda7(this, 0));
        ActionBarMenuSubItem actionBarMenuSubItem4 = new ActionBarMenuSubItem(0, getContext(), this.resourcesProvider, true, true);
        if (this.darkTheme) {
            actionBarMenuSubItem4.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            actionBarMenuSubItem4.setIconColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
        }
        actionBarMenuSubItem4.setTextAndIcon(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send);
        actionBarMenuSubItem4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindowLayout2.addView((View) actionBarMenuSubItem4, LayoutHelper.createLinear(-1, 48));
        actionBarMenuSubItem4.setOnClickListener(new ShareAlert$$ExternalSyntheticLambda7(this, 6));
        actionBarPopupWindowLayout2.setupRadialSelectors(getThemedColor(Theme.key_dialogButtonSelector));
        linearLayout.addView(actionBarPopupWindowLayout2, LayoutHelper.createLinear(-1, -2));
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(linearLayout, -2, -2);
        this.sendPopupWindow = actionBarPopupWindow;
        actionBarPopupWindow.setAnimationEnabled(false);
        this.sendPopupWindow.setAnimationStyle(R.style.PopupContextAnimation2);
        this.sendPopupWindow.setOutsideTouchable(true);
        this.sendPopupWindow.setClippingEnabled(true);
        this.sendPopupWindow.setInputMethodMode(2);
        this.sendPopupWindow.setSoftInputMode(0);
        this.sendPopupWindow.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.sendPopupWindow.setFocusable(true);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        this.sendPopupWindow.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!this.keyboardVisible || (chatActivity = this.parentFragment) == null || chatActivity.contentView.getMeasuredHeight() <= AndroidUtilities.dp(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f) : view.getMeasuredHeight() + iArr[1]);
        this.sendPopupWindow.dimBehind();
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    private void onTopicCellClick(TLRPC.TL_forumTopic tL_forumTopic) {
        TLRPC.Dialog dialog;
        if (tL_forumTopic == null || (dialog = this.selectedTopicDialog) == null) {
            return;
        }
        long j = dialog.id;
        boolean zIsMonoForum = MessagesController.getInstance(this.currentAccount).isMonoForum(j);
        TLRPC.Dialog dialog2 = this.selectedTopicDialog;
        this.selectedDialogs.put(dialog2, j);
        this.selectedDialogTopics.put(dialog2, tL_forumTopic);
        updateSelectedCount(2);
        if (this.searchIsVisible || this.searchWasVisibleBeforeTopics) {
            if (((TLRPC.Dialog) this.listAdapter.dialogsMap.get(dialog2.id)) == null) {
                this.listAdapter.dialogsMap.put(dialog2, dialog2.id);
                this.listAdapter.dialogs.add(!this.listAdapter.dialogs.isEmpty() ? 1 : 0, dialog2);
            }
            this.listAdapter.notifyDataSetChanged();
            this.updateSearchAdapter = false;
            this.searchView.editText.setText("");
            checkCurrentList(false);
        }
        for (int i = 0; i < getMainGridView().getChildCount(); i++) {
            View childAt = getMainGridView().getChildAt(i);
            if (childAt instanceof ShareDialogCell) {
                ShareDialogCell shareDialogCell = (ShareDialogCell) childAt;
                if (shareDialogCell.getCurrentDialog() == this.selectedTopicDialog.id) {
                    shareDialogCell.setTopic(tL_forumTopic, zIsMonoForum, true);
                    shareDialogCell.setChecked(true, true);
                }
            }
        }
        collapseTopics();
    }

    private void onTopicCreateCellClick() {
        TLRPC.Dialog dialog = this.selectedTopicDialog;
        if (dialog == null) {
            return;
        }
        this.selectedDialogs.put(dialog, dialog.id);
        this.selectedDialogTopics.remove(dialog);
        updateSelectedCount(2);
        if (this.searchIsVisible || this.searchWasVisibleBeforeTopics) {
            if (((TLRPC.Dialog) this.listAdapter.dialogsMap.get(dialog.id)) == null) {
                this.listAdapter.dialogsMap.put(dialog, dialog.id);
                this.listAdapter.dialogs.add(!this.listAdapter.dialogs.isEmpty() ? 1 : 0, dialog);
            }
            this.listAdapter.notifyDataSetChanged();
            this.updateSearchAdapter = false;
            this.searchView.editText.setText("");
            checkCurrentList(false);
        }
        for (int i = 0; i < getMainGridView().getChildCount(); i++) {
            View childAt = getMainGridView().getChildAt(i);
            if (childAt instanceof ShareDialogCell) {
                ShareDialogCell shareDialogCell = (ShareDialogCell) childAt;
                if (shareDialogCell.getCurrentDialog() == this.selectedTopicDialog.id) {
                    shareDialogCell.setTopic(null, false, true);
                    shareDialogCell.setChecked(true, true);
                }
            }
        }
        collapseTopics();
    }

    private void runShadowAnimation(final int i, final boolean z) {
        if ((!z || this.shadow[i].getTag() == null) && (z || this.shadow[i].getTag() != null)) {
            return;
        }
        this.shadow[i].setTag(z ? null : 1);
        if (z) {
            this.shadow[i].setVisibility(0);
        }
        AnimatorSet animatorSet = this.shadowAnimation[i];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.shadowAnimation[i] = new AnimatorSet();
        this.shadowAnimation[i].playTogether(ObjectAnimator.ofFloat(this.shadow[i], (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.shadowAnimation[i].setDuration(150L);
        this.shadowAnimation[i].addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animator) {
                if (ShareAlert.this.shadowAnimation[i] == null || !ShareAlert.this.shadowAnimation[i].equals(animator)) {
                    return;
                }
                ShareAlert.this.shadowAnimation[i] = null;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (ShareAlert.this.shadowAnimation[i] == null || !ShareAlert.this.shadowAnimation[i].equals(animator)) {
                    return;
                }
                if (!z) {
                    ShareAlert.this.shadow[i].setVisibility(4);
                }
                ShareAlert.this.shadowAnimation[i] = null;
            }
        });
        this.shadowAnimation[i].start();
    }

    public void selectDialog(View view, TLRPC.Dialog dialog) {
        DialogsSearchAdapter.CategoryAdapterRecycler categoryAdapterRecycler;
        int i;
        if (dialog instanceof ShareDialogsAdapter.MyStoryDialog) {
            onShareStory(view);
            return;
        }
        if (dialog != null && (((view instanceof ShareDialogCell) && ((ShareDialogCell) view).isBlocked()) || ((view instanceof ProfileSearchCell) && ((ProfileSearchCell) view).premiumBlocked))) {
            showPremiumBlockedToast(view, dialog.id);
            return;
        }
        if (this.topicsGridView.getVisibility() == 8 && this.parentActivity != null) {
            if (DialogObject.isChatDialog(dialog.id)) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
                if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.id, this.currentAccount) || (i = this.hasPoll) == 2 || i == 3)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.parentActivity, 0, null);
                    builder.setTitle(LocaleController.getString(R.string.SendMessageTitle));
                    int i2 = this.hasPoll;
                    if (i2 == 3) {
                        if (ChatObject.isActionBannedByDefault(chat, 10)) {
                            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedTodoAll));
                        } else {
                            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedTodo));
                        }
                    } else if (i2 != 2) {
                        builder.setMessage(LocaleController.getString(R.string.ChannelCantSendMessage));
                    } else if (this.isChannel) {
                        builder.setMessage(LocaleController.getString(R.string.PublicPollCantForward));
                    } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                        builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedPollsAll));
                    } else {
                        builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedPolls));
                    }
                    builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
                    builder.show();
                    return;
                }
            } else if (DialogObject.isEncryptedDialog(dialog.id) && this.hasPoll != 0) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this.parentActivity, 0, null);
                builder2.setTitle(LocaleController.getString(R.string.SendMessageTitle));
                int i3 = this.hasPoll;
                if (i3 == 3) {
                    builder2.setMessage(LocaleController.getString(R.string.TodoCantForwardSecretChat));
                } else if (i3 != 0) {
                    builder2.setMessage(LocaleController.getString(R.string.PollCantForwardSecretChat));
                } else {
                    builder2.setMessage(LocaleController.getString(R.string.InvoiceCantForwardSecretChat));
                }
                builder2.setNegativeButton(LocaleController.getString(R.string.OK), null);
                builder2.show();
                return;
            }
            if (this.selectedDialogs.indexOfKey(dialog.id) >= 0) {
                this.selectedDialogs.remove(dialog.id);
                this.selectedDialogTopics.remove(dialog);
                if (view instanceof ProfileSearchCell) {
                    CheckBox2 checkBox2 = ((ProfileSearchCell) view).checkBox;
                    if (checkBox2 != null) {
                        checkBox2.setChecked(false, true);
                    }
                } else if (view instanceof ShareDialogCell) {
                    ((ShareDialogCell) view).setChecked(false, true);
                }
                updateSelectedCount(1);
            } else {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
                TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
                if (isBotForumWithNotEmptyTopics(user) || (DialogObject.isChatDialog(dialog.id) && (ChatObject.isForum(chat2) || (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                    this.selectedTopicDialog = dialog;
                    this.topicsLayoutManager.scrollToPositionWithOffset(0, this.scrollOffsetY - this.topicsGridView.getPaddingTop());
                    AtomicReference atomicReference = new AtomicReference();
                    AnonymousClass27 anonymousClass27 = new AnonymousClass27(dialog, atomicReference, view);
                    atomicReference.set(new ShareAlert$$ExternalSyntheticLambda1(0, this, atomicReference, anonymousClass27, dialog));
                    NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                    int i4 = NotificationCenter.topicsDidLoaded;
                    notificationCenter.addObserver(anonymousClass27, i4);
                    if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.id) != null) {
                        anonymousClass27.didReceivedNotification(i4, this.currentAccount, Long.valueOf(-dialog.id));
                        return;
                    } else {
                        MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.id);
                        AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                this.selectedDialogs.put(dialog, dialog.id);
                if (view instanceof ProfileSearchCell) {
                    CheckBox2 checkBox3 = ((ProfileSearchCell) view).checkBox;
                    if (checkBox3 != null) {
                        checkBox3.setChecked(true, true);
                    }
                } else if (view instanceof ShareDialogCell) {
                    ((ShareDialogCell) view).setChecked(true, true);
                }
                updateSelectedCount(2);
                long j = UserConfig.getInstance(this.currentAccount).clientUserId;
                if (this.searchIsVisible) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) this.listAdapter.dialogsMap.get(dialog.id);
                    if (dialog2 == null) {
                        this.listAdapter.dialogsMap.put(dialog, dialog.id);
                        this.listAdapter.dialogs.add(1 ^ (this.listAdapter.dialogs.isEmpty() ? 1 : 0), dialog);
                    } else if (dialog2.id != j) {
                        this.listAdapter.dialogs.remove(dialog2);
                        this.listAdapter.dialogs.add(1 ^ (this.listAdapter.dialogs.isEmpty() ? 1 : 0), dialog2);
                    }
                    this.listAdapter.notifyDataSetChanged();
                    this.updateSearchAdapter = false;
                    this.searchView.editText.setText("");
                    checkCurrentList(false);
                    AndroidUtilities.hideKeyboard(this.searchView.editText);
                }
            }
            ShareSearchAdapter shareSearchAdapter = this.searchAdapter;
            if (shareSearchAdapter != null && (categoryAdapterRecycler = shareSearchAdapter.categoryAdapter) != null) {
                categoryAdapterRecycler.notifyItemRangeChanged(0, categoryAdapterRecycler.getItemCount());
            }
        }
    }

    private boolean showCommentTextView(final boolean z) {
        if (z == (this.frameLayout2.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.frameLayout2.setTag(z ? 1 : null);
        if (this.commentTextView.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.commentTextView.getEditText());
        }
        this.commentTextView.hidePopup(true);
        if (z) {
            this.frameLayout2.setVisibility(0);
            FrameLayout frameLayout = this.timestampFrameLayout;
            if (frameLayout != null && this.pickerBottom == null) {
                frameLayout.setVisibility(0);
            }
            this.writeButtonContainer.setVisibility(0);
        } else {
            FrameLayout frameLayout2 = this.pickerBottom;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
        }
        FrameLayout frameLayout3 = this.pickerBottom;
        if (frameLayout3 != null) {
            int i = z ? 4 : 1;
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            frameLayout3.setImportantForAccessibility(i);
        }
        LinearLayout linearLayout = this.sharesCountLayout;
        if (linearLayout != null) {
            int i2 = z ? 4 : 1;
            WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
            linearLayout.setImportantForAccessibility(i2);
        }
        this.animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout4 = this.frameLayout2;
        Property property = View.ALPHA;
        float fDp = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
        FrameLayout frameLayout5 = this.timestampFrameLayout;
        if (frameLayout5 != null && this.pickerBottom == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout5, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.writeButtonContainer, (Property<FrameLayout, Float>) View.SCALE_X, z ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(this.writeButtonContainer, (Property<FrameLayout, Float>) View.SCALE_Y, z ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(this.writeButtonContainer, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
        FrameLayout frameLayout6 = this.pickerBottom;
        if (frameLayout6 == null || frameLayout6.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.shadow[1], (Property<View, Float>) property, z ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout7 = this.pickerBottomLayout;
        if (frameLayout7 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.darkTheme && z) {
                fDp = AndroidUtilities.dp(this.timestampLayout != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout7, (Property<FrameLayout, Float>) property2, fDp));
        }
        this.animatorSet.playTogether(arrayList);
        this.animatorSet.setInterpolator(new DecelerateInterpolator());
        this.animatorSet.setDuration(180L);
        this.animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animator) {
                if (animator.equals(ShareAlert.this.animatorSet)) {
                    ShareAlert.this.animatorSet = null;
                }
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator.equals(ShareAlert.this.animatorSet)) {
                    if (!z) {
                        ShareAlert.this.frameLayout2.setVisibility(4);
                        ShareAlert shareAlert = ShareAlert.this;
                        if (shareAlert.timestampFrameLayout != null && shareAlert.pickerBottom == null) {
                            ShareAlert.this.timestampFrameLayout.setVisibility(4);
                        }
                        ShareAlert.this.writeButtonContainer.setVisibility(4);
                    } else if (ShareAlert.this.pickerBottom != null) {
                        ShareAlert.this.pickerBottom.setVisibility(4);
                    }
                    ShareAlert.this.animatorSet = null;
                }
            }
        });
        this.animatorSet.start();
        return true;
    }

    public void showPremiumBlockedToast(View view, long j) {
        int i = 0;
        int i2 = -this.shiftDp;
        this.shiftDp = i2;
        AndroidUtilities.shakeViewSpring(view, i2);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j))) : "";
        (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() ? BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new ShareAlert$$ExternalSyntheticLambda2(this, i))).show();
    }

    public void updateLayout() {
        if (this.panTranslationMoveLayout) {
            return;
        }
        RecyclerListView recyclerListView = this.searchIsVisible ? this.searchGridView : this.gridView;
        if (recyclerListView.getChildCount() <= 0) {
            return;
        }
        View childAt = recyclerListView.getChildAt(0);
        for (int i = 0; i < recyclerListView.getChildCount(); i++) {
            if (recyclerListView.getChildAt(i).getTop() < childAt.getTop()) {
                childAt = recyclerListView.getChildAt(i);
            }
        }
        RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerListView.findContainingViewHolder(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i2 = (top <= 0 || holder == null || holder.getAdapterPosition() != 0) ? 0 : top;
        if (top < 0 || holder == null || holder.getAdapterPosition() != 0) {
            this.lastOffset = Integer.MAX_VALUE;
            runShadowAnimation(0, true);
            top = i2;
        } else {
            this.lastOffset = childAt.getTop();
            runShadowAnimation(0, false);
        }
        if (this.topicsGridView.getVisibility() == 0) {
            RecyclerListView recyclerListView2 = this.topicsGridView;
            if (recyclerListView2.getChildCount() <= 0) {
                return;
            }
            View childAt2 = recyclerListView2.getChildAt(0);
            for (int i3 = 0; i3 < recyclerListView2.getChildCount(); i3++) {
                if (recyclerListView2.getChildAt(i3).getTop() < childAt2.getTop()) {
                    childAt2 = recyclerListView2.getChildAt(i3);
                }
            }
            RecyclerListView.Holder holder2 = (RecyclerListView.Holder) recyclerListView2.findContainingViewHolder(childAt2);
            int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
            int i4 = (top2 <= 0 || holder2 == null || holder2.getAdapterPosition() != 0) ? 0 : top2;
            if (top2 < 0 || holder2 == null || holder2.getAdapterPosition() != 0) {
                this.lastOffset = Integer.MAX_VALUE;
                runShadowAnimation(0, true);
                top2 = i4;
            } else {
                this.lastOffset = childAt2.getTop();
                runShadowAnimation(0, false);
            }
            top = AndroidUtilities.lerp(top, top2, this.topicsGridView.getAlpha());
        }
        int i5 = this.scrollOffsetY;
        if (i5 != top) {
            this.previousScrollOffsetY = i5;
            RecyclerListView recyclerListView3 = this.gridView;
            float f = top;
            int i6 = (int) (this.currentPanTranslationY + f);
            this.scrollOffsetY = i6;
            recyclerListView3.setTopGlowOffset(i6);
            RecyclerListView recyclerListView4 = this.searchGridView;
            int i7 = (int) (this.currentPanTranslationY + f);
            this.scrollOffsetY = i7;
            recyclerListView4.setTopGlowOffset(i7);
            RecyclerListView recyclerListView5 = this.topicsGridView;
            int i8 = (int) (f + this.currentPanTranslationY);
            this.scrollOffsetY = i8;
            recyclerListView5.setTopGlowOffset(i8);
            this.frameLayout.setTranslationY(this.scrollOffsetY + this.currentPanTranslationY);
            this.searchEmptyView.setTranslationY(this.scrollOffsetY + this.currentPanTranslationY);
            this.containerView.invalidate();
        }
    }

    public void updateLinkTextView() {
        if (this.linkTextView != null) {
            String link = getLink();
            if (link != null) {
                if (link.startsWith("https://")) {
                    link = link.substring(8);
                } else if (link.startsWith("http://")) {
                    link = link.substring(7);
                }
            }
            this.linkTextView.setText(link);
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.dialogsNeedReload;
        if (i == i3) {
            ShareDialogsAdapter shareDialogsAdapter = this.listAdapter;
            if (shareDialogsAdapter != null) {
                shareDialogsAdapter.fetchDialogs();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i3);
        }
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            AndroidUtilities.hideKeyboard(editTextEmoji.getEditText());
        }
        this.fullyShown = false;
        super.lambda$showGiftOfferSheet$15();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
    }

    public boolean doSend(LongSparseArray longSparseArray, TLRPC.TL_forumTopic tL_forumTopic) {
        return false;
    }

    @Override
    public int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.containerViewTop;
    }

    @Override
    public void lambda$openCrafting$8() {
        if (this.selectedTopicDialog != null) {
            collapseTopics();
            return;
        }
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji == null || !editTextEmoji.isPopupShowing()) {
            super.lambda$openCrafting$8();
        } else {
            this.commentTextView.hidePopup(true);
        }
    }

    public void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
    }

    public void onShareStory(View view) {
    }

    public void sendInternal(final boolean z) {
        int i;
        for (int i2 = 0; i2 < this.selectedDialogs.size(); i2++) {
            if (AlertsCreator.checkSlowMode(getContext(), this.currentAccount, this.selectedDialogs.keyAt(i2), this.frameLayout2.getTag() != null && this.commentTextView.length() > 0)) {
                return;
            }
        }
        int i3 = 0;
        final CharSequence[] charSequenceArr = {this.commentTextView.getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CheckBox2 checkBox2 = this.timestampCheckbox;
        final int i4 = (checkBox2 == null || !checkBox2.isChecked()) ? -1 : this.timestamp;
        ArrayList arrayList = new ArrayList();
        if (this.sendingMessageObjects != null) {
            i = 0;
            while (i3 < this.selectedDialogs.size()) {
                long jKeyAt = this.selectedDialogs.keyAt(i3);
                long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(jKeyAt);
                if (sendPaidMessagesStars <= 0) {
                    sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(jKeyAt));
                }
                if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0 && sendPaidMessagesStars > 0) {
                    i++;
                }
                if (sendPaidMessagesStars > 0) {
                    i++;
                }
                if (sendPaidMessagesStars > 0 && !arrayList.contains(Long.valueOf(jKeyAt))) {
                    arrayList.add(Long.valueOf(jKeyAt));
                }
                i3++;
            }
        } else {
            SwitchView switchView = this.switchView;
            int i5 = switchView != null ? switchView.currentTab : 0;
            if (this.storyItem != null) {
                int i6 = 0;
                for (int i7 = 0; i7 < this.selectedDialogs.size(); i7++) {
                    long jKeyAt2 = this.selectedDialogs.keyAt(i7);
                    long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(jKeyAt2);
                    if (sendPaidMessagesStars2 <= 0) {
                        sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(jKeyAt2));
                    }
                    if (this.storyItem != null && this.frameLayout2.getTag() != null && this.commentTextView.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
                        i6++;
                    }
                    if (sendPaidMessagesStars2 > 0) {
                        i6++;
                    }
                    if (sendPaidMessagesStars2 > 0 && !arrayList.contains(Long.valueOf(jKeyAt2))) {
                        arrayList.add(Long.valueOf(jKeyAt2));
                    }
                }
                i = i6;
            } else if (this.sendingText[i5] != null) {
                i = 0;
                while (i3 < this.selectedDialogs.size()) {
                    long jKeyAt3 = this.selectedDialogs.keyAt(i3);
                    long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(jKeyAt3);
                    if (sendPaidMessagesStars3 <= 0) {
                        sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(jKeyAt3));
                    }
                    if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0 && sendPaidMessagesStars3 > 0) {
                        i++;
                    }
                    if (sendPaidMessagesStars3 > 0) {
                        i++;
                    }
                    if (sendPaidMessagesStars3 > 0 && !arrayList.contains(Long.valueOf(jKeyAt3))) {
                        arrayList.add(Long.valueOf(jKeyAt3));
                    }
                    i3++;
                }
            } else {
                i = 0;
            }
        }
        AlertsCreator.ensurePaidMessagesMultiConfirmation(this.currentAccount, arrayList, i, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$sendInternal$30(charSequenceArr, entities, z, i4, (HashMap) obj);
            }
        });
    }

    public void setDelegate(ShareAlertDelegate shareAlertDelegate) {
        this.delegate = shareAlertDelegate;
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    public void setStoryToShare(TL_stories.StoryItem storyItem) {
        this.storyItem = storyItem;
    }

    public void updateBottomOverlay() {
        AdjustPanLayoutHelper adjustPanLayoutHelper;
        if (this.frameLayout2 == null) {
            return;
        }
        EditTextEmoji editTextEmoji = this.commentTextView;
        float fDp = 0.0f;
        if (editTextEmoji == null || !editTextEmoji.isPopupVisible()) {
            SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierFrameLayout;
            if (sizeNotifierFrameLayout != null && (adjustPanLayoutHelper = sizeNotifierFrameLayout.adjustPanLayoutHelper) != null && !adjustPanLayoutHelper.animationInProgress()) {
                this.keyboardT = this.keyboardSize2 > AndroidUtilities.dp(20.0f) ? 1.0f : 0.0f;
            }
        } else {
            this.keyboardT = this.commentTextView.getEmojiPaddingShown();
        }
        FrameLayout frameLayout = this.timestampFrameLayout;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            fDp = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.pickerBottom;
        if (frameLayout2 != null) {
            float f = -fDp;
            frameLayout2.setTranslationY(f);
            LinearLayout linearLayout = this.sharesCountLayout;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f);
            }
        }
        float f2 = -fDp;
        this.frameLayout2.setTranslationY(f2);
        this.writeButtonContainer.setTranslationY(f2);
    }

    public void updateSelectedCount(int i) {
        if (this.selectedDialogs.size() == 0) {
            showCommentTextView(false);
            return;
        }
        ArrayList<MessageObject> arrayList = this.sendingMessageObjects;
        int size = arrayList == null ? 1 : arrayList.size();
        if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0) {
            size++;
        }
        long j = 0;
        for (int i2 = 0; i2 < this.selectedDialogs.size(); i2++) {
            long j2 = ((TLRPC.Dialog) this.selectedDialogs.valueAt(i2)).id;
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j2);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j2));
            }
            j += sendPaidMessagesStars;
        }
        this.writeButton.setCount(Math.max(1, this.selectedDialogs.size()), i != 0);
        this.writeButton.setStarsPrice(j, size, i != 0);
        showCommentTextView(true);
        this.commentTextView.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), this.writeButton.width()), 0);
    }

    public ShareAlert(Context context, ArrayList<MessageObject> arrayList, String str, boolean z, String str2, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        this(context, null, arrayList, str, null, z, str2, null, z2, false, false, null, resourcesProvider);
    }

    public ShareAlert(Context context, ChatActivity chatActivity, ArrayList<MessageObject> arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3) {
        this(context, chatActivity, arrayList, str, str2, z, str3, str4, z2, z3, false, null, null);
    }

    public ShareAlert(Context context, ChatActivity chatActivity, ArrayList<MessageObject> arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, boolean z4, Integer num, Theme.ResourcesProvider resourcesProvider) {
        LinearLayout linearLayoutM;
        int i;
        super(context, true, resourcesProvider);
        int i2 = 3;
        final int i3 = 1;
        this.sendingText = new String[2];
        this.shadow = new View[2];
        this.shadowAnimation = new AnimatorSet[2];
        this.selectedDialogs = new LongSparseArray();
        this.selectedDialogTopics = new HashMap();
        this.containerViewTop = -1;
        final int i4 = 0;
        this.fullyShown = false;
        this.rect = new RectF();
        this.paint = new Paint(1);
        this.textPaint = new TextPaint(1);
        this.linkToCopy = new String[2];
        this.recentSearchObjects = new ArrayList<>();
        this.recentSearchObjectsById = new LongSparseArray();
        this.systemInsets = Insets.NONE;
        this.shiftDp = 4;
        this.showSendersName = true;
        this.lastOffset = Integer.MAX_VALUE;
        ArrayList<RectF> arrayList2 = new ArrayList<>();
        this.iBlur3Positions = arrayList2;
        RectF rectF = new RectF();
        this.iBlur3PositionMainTabs = rectF;
        arrayList2.add(rectF);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.iBlur3SourceColor = blurredBackgroundSourceColor;
        int i5 = Theme.key_windowBackgroundWhite;
        int themedColor = getThemedColor(i5);
        Paint paint = blurredBackgroundSourceColor.paint;
        paint.setColor(themedColor);
        if (Build.VERSION.SDK_INT >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor();
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setupRenderer(new RenderNodeWithHash.Renderer() {
                @Override
                public void renderNodeCalculateHash(IBlur3Hash iBlur3Hash) {
                    Blur3HashImpl blur3HashImpl = (Blur3HashImpl) iBlur3Hash;
                    blur3HashImpl.hash = MediaDataController.calcHash(blur3HashImpl.hash, ShareAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    ((Blur3HashImpl) iBlur3Hash).add(SharedConfig.chatBlurEnabled());
                }

                @Override
                public void renderNodeUpdateDisplayList(Canvas canvas) {
                    canvas.drawColor(ShareAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    if (SharedConfig.chatBlurEnabled()) {
                        ShareAlert.this.scrollableViewNoiseSuppressor.draw(canvas, -2);
                    }
                }
            });
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlassFrosted = blurredBackgroundSourceRenderNode2;
            blurredBackgroundSourceRenderNode2.setupRenderer(new RenderNodeWithHash.Renderer() {
                @Override
                public void renderNodeCalculateHash(IBlur3Hash iBlur3Hash) {
                    Blur3HashImpl blur3HashImpl = (Blur3HashImpl) iBlur3Hash;
                    blur3HashImpl.hash = MediaDataController.calcHash(blur3HashImpl.hash, ShareAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    ((Blur3HashImpl) iBlur3Hash).add(SharedConfig.chatBlurEnabled());
                }

                @Override
                public void renderNodeUpdateDisplayList(Canvas canvas) {
                    canvas.drawColor(ShareAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    if (SharedConfig.chatBlurEnabled()) {
                        ShareAlert.this.scrollableViewNoiseSuppressor.draw(canvas, -3);
                    }
                }
            });
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.iBlur3FactoryLiquidGlass = blurredBackgroundDrawableViewFactory;
            blurredBackgroundDrawableViewFactory.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode2);
            this.iBlur3FactoryFrostedLiquidGlass = blurredBackgroundDrawableViewFactory2;
            blurredBackgroundDrawableViewFactory2.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
            this.iBlur3FactoryLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
            this.iBlur3FactoryFrostedLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        }
        this.iBlur3FactoryFade = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        this.resourcesProvider = resourcesProvider;
        this.includeStory = z4;
        this.parentActivity = AndroidUtilities.findActivity(context);
        this.darkTheme = z3;
        if (z3) {
            this.resourcesProvider = new DarkThemeResourceProvider() {
                @Override
                public void appendColors() {
                    SparseIntArray sparseIntArray = this.sparseIntArray;
                    int i6 = Theme.key_windowBackgroundGray;
                    int i7 = Theme.key_dialogBackground;
                    sparseIntArray.put(i6, getColor(i7));
                    this.sparseIntArray.put(Theme.key_divider, -15264235);
                    this.sparseIntArray.put(Theme.key_chat_messagePanelIcons, Theme.multAlpha(0.45f, -1));
                    this.sparseIntArray.put(Theme.key_dialogBackgroundGray, 352321535);
                    this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, getColor(i7));
                }

                @Override
                public void applyServiceShaderMatrix(int i6, int i7, float f, float f2) {
                    Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, i6, i7, f, f2);
                }

                @Override
                public int getColorOrDefault(int i6) {
                    return getColor(i6);
                }

                @Override
                public int getCurrentColor(int i6) {
                    return getColor(i6);
                }

                @Override
                public boolean hasGradientService() {
                    return false;
                }

                @Override
                public boolean isDark() {
                    return Theme.currentTheme.isDark();
                }

                @Override
                public void setAnimatedColor(int i6, int i7) {
                }
            };
        }
        paint.setColor(getThemedColor(i5));
        this.parentFragment = chatActivity;
        this.shadowDrawable = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        int i6 = Theme.key_dialogBackground;
        this.behindKeyboardColorKey = i6;
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(i6), PorterDuff.Mode.MULTIPLY));
        this.occupyNavigationBarWithoutKeyboard = true;
        this.isFullscreen = z2;
        String[] strArr = this.linkToCopy;
        strArr[0] = str3;
        strArr[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            MessageObject messageObject = arrayList.get(0);
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(messageObject.getDialogId()));
            if (!TextUtils.isEmpty(publicUsername)) {
                String[] strArr2 = this.linkToCopy;
                StringBuilder sb = new StringBuilder("https://");
                Fragment$$ExternalSyntheticOutline0.m(sb, MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, "/");
                sb.append(messageObject.getId());
                strArr2[0] = sb.toString();
                if (arrayList.size() == 1 && messageObject.hasValidGroupId()) {
                    StringBuilder sb2 = new StringBuilder();
                    String[] strArr3 = this.linkToCopy;
                    strArr3[0] = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sb2, strArr3[0], "?single");
                }
            }
        }
        this.sendingMessageObjects = arrayList;
        this.searchAdapter = new ShareSearchAdapter(context);
        this.isChannel = z;
        String[] strArr4 = this.sendingText;
        strArr4[0] = str;
        strArr4[1] = str2;
        this.useSmoothKeyboard = true;
        super.setDelegate(new BottomSheet.BottomSheetDelegate() {
            @Override
            public void onOpenAnimationEnd() {
                ShareAlert.this.fullyShown = true;
            }
        });
        ArrayList<MessageObject> arrayList3 = this.sendingMessageObjects;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i7 = 0; i7 < size; i7++) {
                MessageObject messageObject2 = this.sendingMessageObjects.get(i7);
                if (messageObject2.isTodo()) {
                    this.hasPoll = 3;
                } else if (messageObject2.isPoll()) {
                    int i8 = messageObject2.isPublicPoll() ? 2 : 1;
                    this.hasPoll = i8;
                    if (i8 == 2) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (z) {
            this.loadingLink = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = arrayList.get(0).getId();
            tL_channels_exportMessageLink.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(arrayList.get(0).messageOwner.peer_id.channel_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_exportMessageLink, new ShareAlert$$ExternalSyntheticLambda13(i4, this, context));
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            private int fromOffsetTop;
            private int fromScrollY;
            private boolean fullHeight;
            private boolean lightStatusBar;
            private final AnimatedFloat pinnedToTop;
            private int previousTopOffset;
            private int toOffsetTop;
            private int toScrollY;
            private int topOffset;
            private boolean ignoreLayout = false;
            private RectF rect1 = new RectF();

            {
                this.adjustPanLayoutHelper = new AdjustPanLayoutHelper(this) {
                    {
                        boolean z5 = AdjustPanLayoutHelper.USE_ANDROID11_INSET_ANIMATOR;
                    }

                    @Override
                    public boolean heightAnimationEnabled() {
                        if (ShareAlert.this.isDismissed() || !ShareAlert.this.fullyShown) {
                            return false;
                        }
                        return !ShareAlert.this.commentTextView.isPopupVisible();
                    }

                    @Override
                    public void onPanTranslationUpdate(float f, float f2, boolean z5) {
                        ShareAlert.this.keyboardT = f2;
                        for (int i9 = 0; i9 < ((BottomSheet) ShareAlert.this).containerView.getChildCount(); i9++) {
                            View childAt = ((BottomSheet) ShareAlert.this).containerView.getChildAt(i9);
                            if (childAt != ShareAlert.this.pickerBottom && childAt != ShareAlert.this.bulletinContainer && childAt != ShareAlert.this.shadow[1] && childAt != ShareAlert.this.sharesCountLayout && childAt != ShareAlert.this.frameLayout2) {
                                ShareAlert shareAlert = ShareAlert.this;
                                if (childAt != shareAlert.timestampFrameLayout && childAt != shareAlert.writeButtonContainer) {
                                    childAt.setTranslationY(f);
                                }
                            }
                        }
                        ShareAlert.this.currentPanTranslationY = f;
                        if (AnonymousClass5.this.fromScrollY != -1) {
                            if (!z5) {
                                f2 = 1.0f - f2;
                            }
                            AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                            float f3 = 1.0f - f2;
                            ShareAlert.this.scrollOffsetY = (int) ((AnonymousClass5.this.toScrollY * f2) + (anonymousClass5.fromScrollY * f3));
                            float f4 = ((AnonymousClass5.this.fromScrollY - AnonymousClass5.this.toScrollY) * f3) + ShareAlert.this.currentPanTranslationY;
                            ShareAlert.this.gridView.setTranslationY(f4);
                            if (z5) {
                                ShareAlert.this.searchGridView.setTranslationY(f4);
                            } else {
                                ShareAlert.this.searchGridView.setTranslationY(f4 + ShareAlert.this.gridView.getPaddingTop());
                            }
                        } else if (AnonymousClass5.this.fromOffsetTop != -1) {
                            AnonymousClass5 anonymousClass6 = AnonymousClass5.this;
                            float f5 = 1.0f - f2;
                            ShareAlert.this.scrollOffsetY = (int) ((AnonymousClass5.this.toOffsetTop * f2) + (anonymousClass6.fromOffsetTop * f5));
                            if (!z5) {
                                f5 = f2;
                            }
                            if (z5) {
                                ShareAlert.this.gridView.setTranslationY(ShareAlert.this.currentPanTranslationY - ((AnonymousClass5.this.fromOffsetTop - AnonymousClass5.this.toOffsetTop) * f2));
                            } else {
                                ShareAlert.this.gridView.setTranslationY(((AnonymousClass5.this.toOffsetTop - AnonymousClass5.this.fromOffsetTop) * f5) + ShareAlert.this.currentPanTranslationY);
                            }
                        }
                        ShareAlert.this.gridView.setTopGlowOffset((int) (ShareAlert.this.currentPanTranslationY + ShareAlert.this.scrollOffsetY));
                        ShareAlert.this.frameLayout.setTranslationY(ShareAlert.this.currentPanTranslationY + ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.searchEmptyView.setTranslationY(ShareAlert.this.currentPanTranslationY + ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.frameLayout2.invalidate();
                        ShareAlert shareAlert2 = ShareAlert.this;
                        shareAlert2.setCurrentPanTranslationY(shareAlert2.currentPanTranslationY);
                        ShareAlert.this.updateBottomOverlay();
                        invalidate();
                    }

                    @Override
                    public void onTransitionEnd() {
                        ShareAlert shareAlert = ShareAlert.this;
                        shareAlert.keyboardT = ((shareAlert.commentTextView == null || !ShareAlert.this.commentTextView.isPopupVisible()) && ShareAlert.this.keyboardSize2 <= AndroidUtilities.dp(20.0f)) ? 0.0f : 1.0f;
                        ShareAlert.this.panTranslationMoveLayout = false;
                        ShareAlert shareAlert2 = ShareAlert.this;
                        shareAlert2.previousScrollOffsetY = shareAlert2.scrollOffsetY;
                        ShareAlert.this.gridView.setTopGlowOffset(ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.frameLayout.setTranslationY(ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.searchEmptyView.setTranslationY(ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.gridView.setTranslationY(0.0f);
                        ShareAlert.this.searchGridView.setTranslationY(0.0f);
                        ShareAlert.this.updateBottomOverlay();
                    }

                    @Override
                    public void onTransitionStart(boolean z5, int i9) {
                        if (ShareAlert.this.previousScrollOffsetY != ShareAlert.this.scrollOffsetY) {
                            AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                            anonymousClass5.fromScrollY = ShareAlert.this.previousScrollOffsetY;
                            AnonymousClass5 anonymousClass6 = AnonymousClass5.this;
                            anonymousClass6.toScrollY = ShareAlert.this.scrollOffsetY;
                            ShareAlert.this.panTranslationMoveLayout = true;
                            AnonymousClass5 anonymousClass7 = AnonymousClass5.this;
                            ShareAlert.this.scrollOffsetY = anonymousClass7.fromScrollY;
                        } else {
                            AnonymousClass5.this.fromScrollY = -1;
                        }
                        if (AnonymousClass5.this.topOffset != AnonymousClass5.this.previousTopOffset) {
                            AnonymousClass5.this.fromOffsetTop = 0;
                            AnonymousClass5.this.toOffsetTop = 0;
                            ShareAlert.this.panTranslationMoveLayout = true;
                            if (z5) {
                                AnonymousClass5 anonymousClass8 = AnonymousClass5.this;
                                AnonymousClass5.access$2212(anonymousClass8, anonymousClass8.topOffset - AnonymousClass5.this.previousTopOffset);
                            } else {
                                AnonymousClass5 anonymousClass9 = AnonymousClass5.this;
                                AnonymousClass5.access$2220(anonymousClass9, anonymousClass9.topOffset - AnonymousClass5.this.previousTopOffset);
                            }
                            AnonymousClass5 anonymousClass10 = AnonymousClass5.this;
                            ShareAlert.this.scrollOffsetY = z5 ? anonymousClass10.fromScrollY : anonymousClass10.toScrollY;
                        } else {
                            AnonymousClass5.this.fromOffsetTop = -1;
                        }
                        ShareAlert.this.gridView.setTopGlowOffset((int) (ShareAlert.this.currentPanTranslationY + ShareAlert.this.scrollOffsetY));
                        ShareAlert.this.frameLayout.setTranslationY(ShareAlert.this.currentPanTranslationY + ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.searchEmptyView.setTranslationY(ShareAlert.this.currentPanTranslationY + ShareAlert.this.scrollOffsetY);
                        invalidate();
                    }
                };
                this.lightStatusBar = AndroidUtilities.computePerceivedBrightness(ShareAlert.this.getThemedColor(Theme.key_dialogBackground)) > 0.721f;
                this.pinnedToTop = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            }

            public static int access$2212(AnonymousClass5 anonymousClass5, int i9) {
                int i10 = anonymousClass5.toOffsetTop + i9;
                anonymousClass5.toOffsetTop = i10;
                return i10;
            }

            public static int access$2220(AnonymousClass5 anonymousClass5, int i9) {
                int i10 = anonymousClass5.toOffsetTop - i9;
                anonymousClass5.toOffsetTop = i10;
                return i10;
            }

            private void onMeasureInternal(int i9, int i10) {
                int i11;
                int size2 = View.MeasureSpec.getSize(i9);
                int size3 = View.MeasureSpec.getSize(i10);
                int i12 = size2 - (((BottomSheet) ShareAlert.this).backgroundPaddingLeft * 2);
                ShareAlert.this.keyboardSize2 = measureKeyboardHeight();
                int i13 = 0;
                if (!ShareAlert.this.commentTextView.isWaitingForKeyboardOpen() && ShareAlert.this.keyboardSize2 <= AndroidUtilities.dp(20.0f) && !ShareAlert.this.commentTextView.isPopupShowing() && !ShareAlert.this.commentTextView.isAnimatePopupClosing()) {
                    this.ignoreLayout = true;
                    ShareAlert.this.commentTextView.hideEmojiView();
                    this.ignoreLayout = false;
                }
                this.ignoreLayout = true;
                if (ShareAlert.this.keyboardSize2 <= AndroidUtilities.dp(20.0f)) {
                    if (!AndroidUtilities.isInMultiwindow) {
                        size3 -= ((BottomSheet) ShareAlert.this).keyboardVisible ? 0 : ShareAlert.this.commentTextView.getEmojiPadding();
                        i10 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                    }
                    int i14 = ShareAlert.this.commentTextView.isPopupShowing() ? 8 : 0;
                    if (ShareAlert.this.pickerBottomLayout != null) {
                        ShareAlert.this.pickerBottomLayout.setVisibility(i14);
                    }
                } else {
                    if (!ShareAlert.this.commentTextView.isPopupVisible()) {
                        ShareAlert.this.commentTextView.hideEmojiView();
                    }
                    if (ShareAlert.this.pickerBottomLayout != null) {
                        ShareAlert.this.pickerBottomLayout.setVisibility(8);
                    }
                }
                int i15 = i10;
                this.ignoreLayout = false;
                int childCount = getChildCount();
                while (i13 < childCount) {
                    View childAt = getChildAt(i13);
                    if (childAt == null || childAt.getVisibility() == 8) {
                        i11 = i9;
                    } else if (ShareAlert.this.commentTextView == null || !ShareAlert.this.commentTextView.isPopupView(childAt)) {
                        i11 = i9;
                        measureChildWithMargins(childAt, i11, 0, i15, 0);
                    } else {
                        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), getPaddingTop() + (size3 - ShareAlert.this.systemInsets.top)), 1073741824));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size3 - ShareAlert.this.systemInsets.top), 1073741824));
                        }
                        i11 = i9;
                    }
                    i13++;
                    i9 = i11;
                }
                ShareAlert.this.updateBottomOverlay();
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                if (Build.VERSION.SDK_INT >= 31 && ShareAlert.this.scrollableViewNoiseSuppressor != null) {
                    ShareAlert.this.blur3_InvalidateBlur();
                    if (ShareAlert.this.iBlur3SourceGlassFrosted != null) {
                        ShareAlert.this.iBlur3SourceGlassFrosted.setSize(((BottomSheet) ShareAlert.this).containerView.getMeasuredWidth(), ((BottomSheet) ShareAlert.this).containerView.getMeasuredHeight());
                        ShareAlert.this.iBlur3SourceGlassFrosted.renderNodeWithHash.updateDisplayListIfNeeded();
                    }
                    if (ShareAlert.this.iBlur3SourceGlass != null) {
                        ShareAlert.this.iBlur3SourceGlass.setSize(((BottomSheet) ShareAlert.this).containerView.getMeasuredWidth(), ((BottomSheet) ShareAlert.this).containerView.getMeasuredHeight());
                        ShareAlert.this.iBlur3SourceGlass.renderNodeWithHash.updateDisplayListIfNeeded();
                    }
                }
                canvas.save();
                canvas.clipRect(0.0f, ShareAlert.this.currentPanTranslationY + getPaddingTop(), getMeasuredWidth(), ShareAlert.this.currentPanTranslationY + getMeasuredHeight() + AndroidUtilities.dp(50.0f));
                super.dispatchDraw(canvas);
                canvas.restore();
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (!(view instanceof EmojiView) || ShareAlert.this.emojiViewChildBg == null) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                ShareAlert.this.emojiViewChildBg.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(ShareAlert.this.emojiViewChildBg.boundProps.path);
                ShareAlert.this.emojiViewChildBg.draw(canvas);
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
            }

            @Override
            public void drawList(Canvas canvas, boolean z5, ArrayList<SizeNotifierFrameLayout.IViewWithInvalidateCallback> arrayList4) {
                if (ShareAlert.this.gridView.getVisibility() == 0 && ShareAlert.this.gridView.getAlpha() >= 0.0f) {
                    canvas.save();
                    canvas.translate(ShareAlert.this.gridView.getX(), ShareAlert.this.gridView.getY());
                    ShareAlert.this.gridView.draw(canvas);
                    canvas.restore();
                }
                if (ShareAlert.this.topicsGridView.getVisibility() == 0 && ShareAlert.this.topicsGridView.getAlpha() >= 0.0f) {
                    canvas.save();
                    canvas.translate(ShareAlert.this.topicsGridView.getX(), ShareAlert.this.topicsGridView.getY());
                    ShareAlert.this.topicsGridView.draw(canvas);
                    canvas.restore();
                }
                if (ShareAlert.this.searchGridView.getVisibility() != 0 || ShareAlert.this.searchGridView.getAlpha() < 0.0f) {
                    return;
                }
                canvas.save();
                canvas.translate(ShareAlert.this.searchGridView.getX(), ShareAlert.this.searchGridView.getY());
                ShareAlert.this.searchGridView.draw(canvas);
                canvas.restore();
            }

            @Override
            public Theme.ResourcesProvider getResourceProvider() {
                return ((BottomSheet) ShareAlert.this).resourcesProvider;
            }

            @Override
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                this.adjustPanLayoutHelper.setResizableView(this);
                this.adjustPanLayoutHelper.onAttach();
            }

            @Override
            public void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                this.adjustPanLayoutHelper.onDetach();
            }

            @Override
            public void onDraw(Canvas canvas) {
                float f;
                canvas.save();
                canvas.translate(0.0f, ShareAlert.this.currentPanTranslationY);
                int iDp = AndroidUtilities.dp(6.0f) + (ShareAlert.this.scrollOffsetY - ((BottomSheet) ShareAlert.this).backgroundPaddingTop) + this.topOffset;
                ShareAlert shareAlert = ShareAlert.this;
                int iLerp = shareAlert.containerViewTop = ((shareAlert.scrollOffsetY - ((BottomSheet) ShareAlert.this).backgroundPaddingTop) - AndroidUtilities.dp(13.0f)) + this.topOffset;
                int iDp2 = ((BottomSheet) ShareAlert.this).backgroundPaddingTop + AndroidUtilities.dp(60.0f) + getMeasuredHeight();
                if (((BottomSheet) ShareAlert.this).isFullscreen) {
                    f = 0.0f;
                } else {
                    iDp += ShareAlert.this.systemInsets.top;
                    boolean z5 = this.fullHeight && ((BottomSheet) ShareAlert.this).backgroundPaddingTop + iLerp < ShareAlert.this.systemInsets.top;
                    int i9 = iLerp + ShareAlert.this.systemInsets.top;
                    int i10 = -((BottomSheet) ShareAlert.this).backgroundPaddingTop;
                    f = this.pinnedToTop.set(z5);
                    iLerp = AndroidUtilities.lerp(i9, i10, f);
                }
                ShareAlert.this.shadowDrawable.setBounds(0, iLerp, getMeasuredWidth(), iDp2);
                ShareAlert.this.shadowDrawable.draw(canvas);
                ShareAlert shareAlert2 = ShareAlert.this;
                if (shareAlert2.bulletinContainer2 != null) {
                    if (iLerp > shareAlert2.systemInsets.top || ShareAlert.this.bulletinContainer2.getChildCount() <= 0) {
                        ShareAlert shareAlert3 = ShareAlert.this;
                        shareAlert3.bulletinContainer2.setTranslationY(Math.max(0, ((((BottomSheet) shareAlert3).backgroundPaddingTop + iLerp) - ShareAlert.this.bulletinContainer2.getTop()) - ShareAlert.this.bulletinContainer2.getMeasuredHeight()));
                    } else {
                        ShareAlert.this.bulletinContainer2.setTranslationY(0.0f);
                        Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
                        if (visibleBulletin != null) {
                            if (visibleBulletin.getLayout() != null) {
                                visibleBulletin.getLayout().setTop(true);
                            }
                            visibleBulletin.hide();
                        }
                    }
                }
                if (f < 1.0f) {
                    int iDp3 = AndroidUtilities.dp(36.0f);
                    this.rect1.set((getMeasuredWidth() - iDp3) / 2, iDp, (getMeasuredWidth() + iDp3) / 2, AndroidUtilities.dp(4.0f) + iDp);
                    Theme.dialogs_onlineCirclePaint.setColor(ShareAlert.this.getThemedColor(Theme.key_sheet_scrollUp));
                    Paint paint2 = Theme.dialogs_onlineCirclePaint;
                    paint2.setAlpha((int) ((1.0f - f) * paint2.getAlpha()));
                    canvas.drawRoundRect(this.rect1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    int systemUiVisibility = getSystemUiVisibility();
                    boolean z6 = this.lightStatusBar && ((float) 0) > ((float) ShareAlert.this.systemInsets.top) * 0.5f;
                    if (z6 != ((systemUiVisibility & 8192) > 0)) {
                        setSystemUiVisibility(z6 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
                    }
                }
                canvas.restore();
                this.previousTopOffset = this.topOffset;
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (this.fullHeight) {
                    if (motionEvent.getAction() == 0 && ShareAlert.this.scrollOffsetY != 0 && motionEvent.getY() < ShareAlert.this.scrollOffsetY - AndroidUtilities.dp(30.0f)) {
                        ShareAlert.this.lambda$showGiftOfferSheet$15();
                        return true;
                    }
                } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.topOffset - AndroidUtilities.dp(30.0f)) {
                    ShareAlert.this.lambda$showGiftOfferSheet$15();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public void onLayout(boolean z5, int i9, int i10, int i11, int i12) {
                int paddingRight;
                int i13;
                int paddingLeft;
                int i14;
                int i15;
                int paddingTop;
                int measuredHeight;
                int measuredHeight2;
                int childCount = getChildCount();
                int iMeasureKeyboardHeight = measureKeyboardHeight();
                int iMax = (((BottomSheet) ShareAlert.this).keyboardVisible || iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow) ? 0 : Math.max(ShareAlert.this.systemInsets.bottom, ShareAlert.this.commentTextView.getEmojiPadding());
                setBottomClip(iMax);
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight3 = childAt.getMeasuredHeight();
                        int i17 = layoutParams.gravity;
                        if (i17 == -1) {
                            i17 = 51;
                        }
                        int i18 = i17 & 112;
                        int i19 = i17 & 7;
                        if (i19 != 1) {
                            if (i19 != 5) {
                                paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                            } else {
                                paddingRight = (((i11 - i9) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                                i13 = ((BottomSheet) ShareAlert.this).backgroundPaddingLeft;
                            }
                            if (i18 != 16) {
                                if (i18 != 48) {
                                    paddingTop = this.topOffset + getPaddingTop() + layoutParams.topMargin;
                                } else if (i18 != 80) {
                                    paddingTop = layoutParams.topMargin;
                                } else {
                                    i14 = ((i12 - iMax) - i10) - measuredHeight3;
                                    i15 = layoutParams.bottomMargin;
                                }
                                if (ShareAlert.this.commentTextView != null && ShareAlert.this.commentTextView.isPopupView(childAt)) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    } else {
                                        measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                    paddingTop = measuredHeight - measuredHeight2;
                                }
                                if (childAt == ShareAlert.this.bottomFadeView) {
                                    paddingTop += ShareAlert.this.systemInsets.bottom;
                                }
                                childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                            } else {
                                i14 = ((((i12 - iMax) - (this.topOffset + i10)) - measuredHeight3) / 2) + layoutParams.topMargin;
                                i15 = layoutParams.bottomMargin;
                            }
                            paddingTop = i14 - i15;
                            if (ShareAlert.this.commentTextView != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                paddingTop = measuredHeight - measuredHeight2;
                            }
                            if (childAt == ShareAlert.this.bottomFadeView) {
                                paddingTop += ShareAlert.this.systemInsets.bottom;
                            }
                            childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                        } else {
                            paddingRight = (((i11 - i9) - measuredWidth) / 2) + layoutParams.leftMargin;
                            i13 = layoutParams.rightMargin;
                        }
                        paddingLeft = paddingRight - i13;
                        if (i18 != 16) {
                            if (i18 != 48) {
                                paddingTop = this.topOffset + getPaddingTop() + layoutParams.topMargin;
                            } else if (i18 != 80) {
                                paddingTop = layoutParams.topMargin;
                            } else {
                                i14 = ((i12 - iMax) - i10) - measuredHeight3;
                                i15 = layoutParams.bottomMargin;
                            }
                            if (ShareAlert.this.commentTextView != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                paddingTop = measuredHeight - measuredHeight2;
                            }
                            if (childAt == ShareAlert.this.bottomFadeView) {
                                paddingTop += ShareAlert.this.systemInsets.bottom;
                            }
                            childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                        } else {
                            i14 = ((((i12 - iMax) - (this.topOffset + i10)) - measuredHeight3) / 2) + layoutParams.topMargin;
                            i15 = layoutParams.bottomMargin;
                        }
                        paddingTop = i14 - i15;
                        if (ShareAlert.this.commentTextView != null) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            paddingTop = measuredHeight - measuredHeight2;
                        }
                        if (childAt == ShareAlert.this.bottomFadeView) {
                            paddingTop += ShareAlert.this.systemInsets.bottom;
                        }
                        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                    }
                }
                notifyHeightChanged();
                ShareAlert.this.updateBottomOverlay();
                ShareAlert.this.updateLayout();
            }

            @Override
            public void onMeasure(int i9, int i10) {
                int size2 = getLayoutParams().height > 0 ? getLayoutParams().height : View.MeasureSpec.getSize(i10);
                ShareAlert.this.layoutManager.setNeedFixGap(getLayoutParams().height <= 0);
                ShareAlert.this.searchLayoutManager.setNeedFixGap(getLayoutParams().height <= 0);
                if (!((BottomSheet) ShareAlert.this).isFullscreen) {
                    this.ignoreLayout = true;
                    setPadding(((BottomSheet) ShareAlert.this).backgroundPaddingLeft, ShareAlert.this.systemInsets.top, ((BottomSheet) ShareAlert.this).backgroundPaddingLeft, 0);
                    this.ignoreLayout = false;
                }
                int paddingTop = size2 - getPaddingTop();
                int iM = ((BottomSheet) ShareAlert.this).backgroundPaddingTop + RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(103.0f, Math.max(2, (int) Math.ceil(Math.max(ShareAlert.this.searchAdapter.getItemCount(), ShareAlert.this.listAdapter.getItemCount() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
                if (ShareAlert.this.topicsGridView.getVisibility() != 8) {
                    int iM2 = ((BottomSheet) ShareAlert.this).backgroundPaddingTop + RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(103.0f, Math.max(2, (int) Math.ceil((ShareAlert.this.shareTopicsAdapter.getItemCount() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
                    if (iM2 > iM) {
                        iM = AndroidUtilities.lerp(iM, iM2, ShareAlert.this.topicsGridView.getAlpha());
                    }
                }
                int i11 = iM < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
                int iDp = AndroidUtilities.dp((ShareAlert.this.timestampFrameLayout != null ? 48 : 0) + 100) + ShareAlert.this.systemInsets.bottom;
                if (ShareAlert.this.gridView.getPaddingTop() != i11 || ShareAlert.this.gridView.getPaddingBottom() != iDp) {
                    this.ignoreLayout = true;
                    ShareAlert.this.gridView.setPadding(0, i11, 0, iDp);
                    ShareAlert.this.topicsGridView.setPadding(0, i11, 0, iDp);
                    this.ignoreLayout = false;
                }
                if (((BottomSheet) ShareAlert.this).keyboardVisible && getLayoutParams().height <= 0 && ShareAlert.this.searchGridView.getPaddingTop() != i11) {
                    this.ignoreLayout = true;
                    ShareAlert.this.searchGridView.setPadding(0, 0, 0, AndroidUtilities.dp((ShareAlert.this.timestampFrameLayout == null ? 0 : 48) + 60) + ShareAlert.this.systemInsets.bottom);
                    this.ignoreLayout = false;
                }
                boolean z5 = iM >= size2;
                this.fullHeight = z5;
                this.topOffset = z5 ? 0 : size2 - iM;
                this.ignoreLayout = true;
                ShareAlert.this.checkCurrentList(false);
                this.ignoreLayout = false;
                setMeasuredDimension(View.MeasureSpec.getSize(i9), size2);
                onMeasureInternal(i9, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !ShareAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.sizeNotifierFrameLayout = sizeNotifierFrameLayout;
        this.containerView = sizeNotifierFrameLayout;
        this.iBlur3FactoryLiquidGlass.setSourceRootView(new ViewPositionWatcher(this.containerView), this.containerView);
        this.iBlur3FactoryFrostedLiquidGlass.setSourceRootView(new ViewPositionWatcher(this.containerView), this.containerView);
        this.iBlur3FactoryFade.setSourceRootView(new ViewPositionWatcher(this.containerView), this.containerView);
        this.containerView.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i9 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i9, 0, i9, this.systemInsets.bottom);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        int i10 = Theme.key_dialogBackground;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        if (this.darkTheme && this.linkToCopy[1] != null) {
            SwitchView switchView = new SwitchView(context) {
                @Override
                public void onTabSwitch(int i11) {
                    ShareAlert.this.updateLinkTextView();
                }
            };
            this.switchView = switchView;
            this.frameLayout.addView(switchView, LayoutHelper.createFrame(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        FragmentSearchField fragmentSearchField = new FragmentSearchField(context, this.resourcesProvider);
        this.searchView = fragmentSearchField;
        fragmentSearchField.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                if (!TextUtils.isEmpty(ShareAlert.this.searchView.editText.getText())) {
                    ShareAlert.this.checkCurrentList(false);
                }
                if (ShareAlert.this.updateSearchAdapter) {
                    String string = ShareAlert.this.searchView.editText.getText().toString();
                    if (string.length() != 0) {
                        if (ShareAlert.this.searchEmptyView != null) {
                            ShareAlert.this.searchEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
                        }
                    } else if (ShareAlert.this.gridView.getAdapter() != ShareAlert.this.listAdapter) {
                        int currentTop = ShareAlert.this.getCurrentTop();
                        ShareAlert.this.searchEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
                        ShareAlert.this.searchEmptyView.showProgress(false, true);
                        ShareAlert.this.checkCurrentList(false);
                        ShareAlert.this.listAdapter.notifyDataSetChanged();
                        if (currentTop > 0) {
                            ShareAlert.this.layoutManager.scrollToPositionWithOffset(0, -currentTop);
                        }
                    }
                    if (ShareAlert.this.searchAdapter != null) {
                        ShareAlert.this.searchAdapter.searchDialogs(string);
                    }
                }
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }
        });
        this.searchView.editText.setHint(LocaleController.getString(R.string.ShareSendTo));
        this.searchView.editText.setOnEditorActionListener(new ReportAlert$$ExternalSyntheticLambda0(this, 7));
        this.searchView.setCloseButtonOnClickListener(new ShareAlert$$ExternalSyntheticLambda2(this, i3));
        this.frameLayout.addView(this.searchView, LayoutHelper.createFrame(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        ActionBar actionBar = new ActionBar(context);
        this.topicsBackActionBar = actionBar;
        actionBar.setOccupyStatusBar(false);
        this.topicsBackActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ActionBar actionBar2 = this.topicsBackActionBar;
        int i11 = Theme.key_dialogTextBlack;
        actionBar2.setTitleColor(getThemedColor(i11));
        this.topicsBackActionBar.setSubtitleColor(getThemedColor(Theme.key_dialogTextGray2));
        this.topicsBackActionBar.setItemsColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2), false);
        this.topicsBackActionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarWhiteSelector), false);
        this.topicsBackActionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i12) {
                ShareAlert.this.lambda$openCrafting$8();
            }
        });
        this.topicsBackActionBar.setVisibility(8);
        this.frameLayout.addView(this.topicsBackActionBar, LayoutHelper.createFrame(-1, 58, 83));
        RecyclerListView recyclerListView = new RecyclerListView(context, this.resourcesProvider);
        this.topicsGridView = recyclerListView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(4);
        this.topicsLayoutManager = gridLayoutManager;
        recyclerListView.setLayoutManager(gridLayoutManager);
        this.topicsLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i12) {
                if (i12 == 0) {
                    return ShareAlert.this.topicsLayoutManager.getSpanCount();
                }
                return 1;
            }
        });
        this.topicsGridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i12, int i13) {
                if (i13 != 0) {
                    ShareAlert.this.updateLayout();
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.previousScrollOffsetY = shareAlert.scrollOffsetY;
                }
            }
        });
        RecyclerListView recyclerListView2 = this.topicsGridView;
        ShareTopicsAdapter shareTopicsAdapter = new ShareTopicsAdapter(context);
        this.shareTopicsAdapter = shareTopicsAdapter;
        recyclerListView2.setAdapter(shareTopicsAdapter);
        RecyclerListView recyclerListView3 = this.topicsGridView;
        int i12 = Theme.key_dialogScrollGlow;
        recyclerListView3.setGlowColor(getThemedColor(i12));
        this.topicsGridView.setVerticalScrollBarEnabled(false);
        this.topicsGridView.setHorizontalScrollBarEnabled(false);
        this.topicsGridView.setOverScrollMode(2);
        this.topicsGridView.setSelectorDrawableColor(0);
        this.topicsGridView.setItemSelectorColorProvider(new ShareAlert$$ExternalSyntheticLambda26(i4));
        this.topicsGridView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        this.topicsGridView.setClipToPadding(false);
        this.topicsGridView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerView.getChildViewHolder(view);
                if (holder == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                } else {
                    int adapterPosition = holder.getAdapterPosition() % 4;
                    rect.left = adapterPosition == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = adapterPosition != 3 ? AndroidUtilities.dp(4.0f) : 0;
                }
            }
        });
        this.topicsGridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
            public final ShareAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onItemClick(View view, int i13) {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$new$5(view, i13);
                        break;
                    case 1:
                        this.f$0.lambda$new$7(view, i13);
                        break;
                    default:
                        this.f$0.lambda$new$9(view, i13);
                        break;
                }
            }
        });
        this.topicsGridView.setVisibility(8);
        this.containerView.addView(this.topicsGridView, LayoutHelper.createFrame(-1, -1, 51));
        RecyclerListView recyclerListView4 = new RecyclerListView(context, this.resourcesProvider) {
            @Override
            public boolean allowSelectChildAtPosition(float f, float f2) {
                return f2 >= ((float) (AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 58.0f : 111.0f) + ShareAlert.this.systemInsets.top));
            }

            @Override
            public void draw(Canvas canvas) {
                if (ShareAlert.this.topicsGridView.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 58.0f : 111.0f) + ShareAlert.this.scrollOffsetY, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ShareAlert.this.topicsGridView.getVisibility() != 8) {
                    canvas.restore();
                }
            }
        };
        this.gridView = recyclerListView4;
        recyclerListView4.setSelectorDrawableColor(0);
        this.gridView.setItemSelectorColorProvider(new ShareAlert$$ExternalSyntheticLambda26(i2));
        this.gridView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        this.gridView.setClipToPadding(false);
        RecyclerListView recyclerListView5 = this.gridView;
        getContext();
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(4);
        this.layoutManager = gridLayoutManager2;
        recyclerListView5.setLayoutManager(gridLayoutManager2);
        RecyclerListView recyclerListView6 = this.gridView;
        ViewGroup viewGroup2 = this.containerView;
        Objects.requireNonNull(recyclerListView6);
        this.iBlur3Capture = new ViewGroupPartRenderer(recyclerListView6, viewGroup2, new EmojiView$$ExternalSyntheticLambda24(recyclerListView6));
        this.layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i13) {
                if (i13 == 0) {
                    return ShareAlert.this.layoutManager.getSpanCount();
                }
                return 1;
            }
        });
        this.gridView.setHorizontalScrollBarEnabled(false);
        this.gridView.setVerticalScrollBarEnabled(false);
        this.gridView.setOverScrollMode(2);
        this.gridView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerView.getChildViewHolder(view);
                if (holder == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                } else {
                    int adapterPosition = holder.getAdapterPosition() % 4;
                    rect.left = adapterPosition == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = adapterPosition != 3 ? AndroidUtilities.dp(4.0f) : 0;
                }
            }
        });
        this.containerView.addView(this.gridView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        RecyclerListView recyclerListView7 = this.gridView;
        ShareDialogsAdapter shareDialogsAdapter = new ShareDialogsAdapter(context);
        this.listAdapter = shareDialogsAdapter;
        recyclerListView7.setAdapter(shareDialogsAdapter);
        this.gridView.setGlowColor(getThemedColor(i12));
        this.gridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
            public final ShareAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onItemClick(View view, int i13) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$new$5(view, i13);
                        break;
                    case 1:
                        this.f$0.lambda$new$7(view, i13);
                        break;
                    default:
                        this.f$0.lambda$new$9(view, i13);
                        break;
                }
            }
        });
        this.gridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i13, int i14) {
                if (i14 != 0) {
                    ShareAlert.this.updateLayout();
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.previousScrollOffsetY = shareAlert.scrollOffsetY;
                }
                if (Bulletin.getVisibleBulletin() != null && Bulletin.getVisibleBulletin().getLayout() != null && (Bulletin.getVisibleBulletin().getLayout().getParent() instanceof View) && ((View) Bulletin.getVisibleBulletin().getLayout().getParent()).getParent() == ShareAlert.this.bulletinContainer2) {
                    Bulletin.hideVisible();
                }
                if (Build.VERSION.SDK_INT < 31 || ShareAlert.this.scrollableViewNoiseSuppressor == null) {
                    return;
                }
                ShareAlert.this.scrollableViewNoiseSuppressor.onScrolled(i13, i14);
                ShareAlert.this.blur3_InvalidateBlur();
            }
        });
        RecyclerListView recyclerListView8 = new RecyclerListView(context, this.resourcesProvider) {
            @Override
            public boolean allowSelectChildAtPosition(float f, float f2) {
                return f2 >= ((float) (AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 58.0f : 111.0f) + ShareAlert.this.systemInsets.top));
            }

            @Override
            public void draw(Canvas canvas) {
                if (ShareAlert.this.topicsGridView.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 58.0f : 111.0f) + ShareAlert.this.scrollOffsetY, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ShareAlert.this.topicsGridView.getVisibility() != 8) {
                    canvas.restore();
                }
            }
        };
        this.searchGridView = recyclerListView8;
        recyclerListView8.setItemSelectorColorProvider(new ShareAlert$$ExternalSyntheticLambda26(4));
        this.searchGridView.setSelectorDrawableColor(0);
        this.searchGridView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        this.searchGridView.setClipToPadding(false);
        RecyclerListView recyclerListView9 = this.searchGridView;
        FillLastGridLayoutManager fillLastGridLayoutManager = new FillLastGridLayoutManager(getContext(), 4, 0, this.searchGridView);
        this.searchLayoutManager = fillLastGridLayoutManager;
        recyclerListView9.setLayoutManager(fillLastGridLayoutManager);
        this.searchLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i13) {
                return ShareAlert.this.searchAdapter.getSpanSize(4, i13);
            }
        });
        final int i13 = 2;
        this.searchGridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
            public final ShareAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onItemClick(View view, int i14) {
                switch (i13) {
                    case 0:
                        this.f$0.lambda$new$5(view, i14);
                        break;
                    case 1:
                        this.f$0.lambda$new$7(view, i14);
                        break;
                    default:
                        this.f$0.lambda$new$9(view, i14);
                        break;
                }
            }
        });
        this.searchGridView.setHasFixedSize(true);
        this.searchGridView.lambda$onCellEnter$52(null);
        this.searchGridView.setHorizontalScrollBarEnabled(false);
        this.searchGridView.setVerticalScrollBarEnabled(false);
        this.searchGridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i14, int i15) {
                if (i15 != 0) {
                    ShareAlert.this.updateLayout();
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.previousScrollOffsetY = shareAlert.scrollOffsetY;
                }
            }
        });
        this.searchGridView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerView.getChildViewHolder(view);
                if (holder == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                    return;
                }
                if (holder.getItemViewType() != 5) {
                    rect.right = 0;
                    rect.left = 0;
                } else {
                    int adapterPosition = holder.getAdapterPosition() % 4;
                    rect.left = adapterPosition == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = adapterPosition != 3 ? AndroidUtilities.dp(4.0f) : 0;
                }
            }
        });
        this.searchGridView.setAdapter(this.searchAdapter);
        this.searchGridView.setGlowColor(getThemedColor(i12));
        this.recyclerItemsEnterAnimator = new RecyclerItemsEnterAnimator(this.searchGridView, true);
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, this.resourcesProvider);
        flickerLoadingView.setViewType(12);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, flickerLoadingView, 1, this.resourcesProvider);
        this.searchEmptyView = stickerEmptyView;
        stickerEmptyView.addView(flickerLoadingView, 0);
        this.searchEmptyView.setAnimateLayoutChange(true);
        this.searchEmptyView.showProgress(false, false);
        if (this.darkTheme) {
            this.searchEmptyView.title.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
        }
        this.searchEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
        this.searchGridView.setEmptyView(this.searchEmptyView);
        this.searchGridView.setHideIfEmpty(false);
        this.searchGridView.setAnimateEmptyView(true, 0);
        this.containerView.addView(this.searchEmptyView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.containerView.addView(this.searchGridView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context) {
            @Override
            public void draw(Canvas canvas) {
                super.draw(canvas);
                ShareAlert.this.fadeDrawable.setBounds(0, (getMeasuredHeight() - ShareAlert.this.systemInsets.bottom) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                ShareAlert.this.fadeDrawable.draw(canvas);
            }
        };
        this.bottomFadeView = view;
        this.containerView.addView(view, LayoutHelper.createFrame(-1, 300, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp((!this.darkTheme || this.linkToCopy[1] == null) ? 58.0f : 111.0f);
        this.shadow[0] = new View(context);
        View view2 = this.shadow[0];
        int i14 = Theme.key_dialogShadowLine;
        view2.setBackgroundColor(getThemedColor(i14));
        this.shadow[0].setAlpha(0.0f);
        this.shadow[0].setTag(1);
        this.containerView.addView(this.shadow[0], layoutParams);
        this.containerView.addView(this.frameLayout, LayoutHelper.createFrame(-1, (!this.darkTheme || this.linkToCopy[1] == null) ? 58 : 111, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.shadow[1] = new View(context);
        this.shadow[1].setBackgroundColor(getThemedColor(i14));
        this.shadow[1].setLayoutParams(layoutParams2);
        if (!this.isChannel && this.linkToCopy[0] == null) {
            this.shadow[1].setAlpha(0.0f);
        } else if (this.darkTheme) {
            this.pickerBottom = new FrameLayout(context);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.pickerBottomLayout = frameLayout2;
            this.pickerBottom.addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            this.pickerBottomLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -1, 119));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.linkContainer = linearLayout2;
            linearLayout2.setOrientation(0);
            ScaleStateListAnimator.apply(this.linkContainer, 0.015f, 1.2f);
            this.linkContainer.setOnClickListener(new ShareAlert$$ExternalSyntheticLambda7(this, i3));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.linkTextView = simpleTextView;
            simpleTextView.setTextSize(15);
            this.linkTextView.setTextColor(getThemedColor(Theme.key_share_linkText));
            this.linkTextView.setEllipsizeByGradient(true);
            updateLinkTextView();
            this.linkContainer.addView(this.linkTextView, LayoutHelper.createLinear(-1, 20, 1.0f, 23, 16, 0, 16, 0));
            TextView textView = new TextView(context);
            this.linkCopyButton = textView;
            textView.setTextSize(1, 14.0f);
            this.linkCopyButton.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            ArticleViewer$$ExternalSyntheticOutline0.m(R.string.Copy, this.linkCopyButton);
            this.linkCopyButton.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
            this.linkCopyButton.setTypeface(AndroidUtilities.bold());
            this.linkCopyButton.setGravity(17);
            TextView textView2 = this.linkCopyButton;
            int i15 = Theme.key_listSelector;
            textView2.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i15), 4, 4));
            this.linkContainer.addView(this.linkCopyButton, LayoutHelper.createLinear(-2, 28, 0.0f, 21, 0, 0, 7, 0));
            this.linkCopyButton.setOnClickListener(new ShareAlert$$ExternalSyntheticLambda7(this, 2));
            ScaleStateListAnimator.apply(this.linkCopyButton);
            this.containerView.addView(this.pickerBottom, LayoutHelper.createFrame(-1, 58, 83));
            ArrayList<MessageObject> arrayList4 = this.sendingMessageObjects;
            if (arrayList4 == null || arrayList4.size() <= 0 || this.sendingMessageObjects.get(0).messageOwner == null || this.sendingMessageObjects.get(0).messageOwner.forwards <= 0) {
                linearLayoutM = null;
                i = 11;
            } else {
                final MessageObject messageObject3 = this.sendingMessageObjects.get(0);
                if (!ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject3.getDialogId()))) || messageObject3.isForwarded()) {
                    linearLayoutM = null;
                    i = 11;
                } else {
                    linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context);
                    linearLayoutM.setOnClickListener(new View.OnClickListener(this) {
                        public final ShareAlert f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view3) {
                            switch (i4) {
                                case 0:
                                    this.f$0.lambda$new$12(messageObject3, view3);
                                    break;
                                default:
                                    this.f$0.lambda$new$14(messageObject3, view3);
                                    break;
                            }
                        }
                    });
                    linearLayoutM.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                    linearLayoutM.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i15), 6, 6));
                    ScaleStateListAnimator.apply(linearLayoutM);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.mini_stats_shares);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    int i16 = Theme.key_share_icon;
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), PorterDuff.Mode.SRC_IN));
                    linearLayoutM.addView(imageView, LayoutHelper.createLinear(-2, -2, 0.0f, 16));
                    TextView textView3 = new TextView(context);
                    textView3.setTextColor(getThemedColor(i16));
                    textView3.setTextSize(1, 15.0f);
                    textView3.setGravity(17);
                    textView3.setText(LocaleController.formatNumber(messageObject3.messageOwner.forwards, ','));
                    linearLayoutM.addView(textView3, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                    i = 8;
                }
            }
            linearLayout.addView(this.linkContainer, LayoutHelper.createLinear(-1, 42, 1.0f, 23, 11, 0, i, 0));
            if (linearLayoutM != null) {
                linearLayout.addView(linearLayoutM, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 0, 5, 8, 0));
            }
        } else {
            this.pickerBottom = new FrameLayout(context);
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.pickerBottomLayout = frameLayout3;
            this.pickerBottom.addView(frameLayout3, LayoutHelper.createFrame(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
            TextView textView4 = new TextView(context);
            int i17 = Theme.key_listSelector;
            textView4.setBackground(Theme.createSelectorDrawable(getThemedColor(i17), 2, AndroidUtilities.dp(22.0f)));
            textView4.setTextColor(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listeningText : Theme.key_dialogTextBlue2));
            textView4.setTextSize(1, 14.0f);
            textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setGravity(17);
            if (this.darkTheme && this.linkToCopy[1] != null) {
                ArticleViewer$$ExternalSyntheticOutline0.m(R.string.VoipGroupCopySpeakerLinkNoCaps, textView4);
            } else {
                ArticleViewer$$ExternalSyntheticOutline0.m(R.string.CopyLink, textView4);
            }
            textView4.setOnClickListener(new ShareAlert$$ExternalSyntheticLambda7(this, 3));
            this.pickerBottomLayout.addView(textView4, LayoutHelper.createFrame(-1, -1, 119));
            this.containerView.addView(this.pickerBottom, LayoutHelper.createFrame(-1, 58, 87));
            ArrayList<MessageObject> arrayList5 = this.sendingMessageObjects;
            if (arrayList5 != null && arrayList5.size() > 0 && this.sendingMessageObjects.get(0).messageOwner != null && this.sendingMessageObjects.get(0).messageOwner.forwards > 0) {
                final MessageObject messageObject4 = this.sendingMessageObjects.get(0);
                if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject4.getDialogId()))) && !messageObject4.isForwarded()) {
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    this.sharesCountLayout = linearLayout3;
                    linearLayout3.setOrientation(0);
                    this.sharesCountLayout.setGravity(16);
                    this.sharesCountLayout.setBackground(Theme.createSelectorDrawable(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listSelector : i17), 2, AndroidUtilities.dp(22.0f)));
                    this.pickerBottomLayout.addView(this.sharesCountLayout, LayoutHelper.createFrame(-2, 48.0f, 85, 6.0f, 0.0f, -6.0f, 0.0f));
                    this.sharesCountLayout.setOnClickListener(new View.OnClickListener(this) {
                        public final ShareAlert f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view3) {
                            switch (i3) {
                                case 0:
                                    this.f$0.lambda$new$12(messageObject4, view3);
                                    break;
                                default:
                                    this.f$0.lambda$new$14(messageObject4, view3);
                                    break;
                            }
                        }
                    });
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.share_arrow);
                    imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listeningText : Theme.key_dialogTextBlue2), PorterDuff.Mode.MULTIPLY));
                    this.sharesCountLayout.addView(imageView2, LayoutHelper.createLinear(-2, -1, 16, 20, 0, 0, 0));
                    TextView textView5 = new TextView(context);
                    textView5.setText(String.format("%d", Integer.valueOf(messageObject4.messageOwner.forwards)));
                    textView5.setTextSize(1, 14.0f);
                    textView5.setTextColor(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listeningText : Theme.key_dialogTextBlue2));
                    textView5.setGravity(16);
                    textView5.setTypeface(AndroidUtilities.bold());
                    this.sharesCountLayout.addView(textView5, LayoutHelper.createLinear(-2, -1, 16, 8, 0, 20, 0));
                }
            }
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.bulletinContainer = frameLayout4;
        this.containerView.addView(frameLayout4, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.pickerBottomLayout != null ? 48.0f : 0.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.bulletinContainer2 = frameLayout5;
        this.containerView.addView(frameLayout5, LayoutHelper.createFrame(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        AnonymousClass21 anonymousClass21 = new AnonymousClass21(context);
        this.frameLayout2 = anonymousClass21;
        anonymousClass21.setWillNotDraw(false);
        this.frameLayout2.setAlpha(0.0f);
        this.frameLayout2.setVisibility(4);
        this.containerView.addView(this.frameLayout2, LayoutHelper.createFrame(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        this.frameLayout2.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(i4));
        AndroidUtilities.setLightNavigationBar(this.container, AndroidUtilities.computePerceivedBrightness(getThemedColor(i10)) > 0.721f);
        AnonymousClass22 anonymousClass22 = new AnonymousClass22(context, this.sizeNotifierFrameLayout, null, 1, true, this.resourcesProvider);
        this.commentTextView = anonymousClass22;
        anonymousClass22.includeNavigationBar = true;
        if (this.darkTheme) {
            EditTextCaption editText = anonymousClass22.getEditText();
            int i18 = Theme.key_voipgroup_nameText;
            editText.setTextColor(getThemedColor(i18));
            this.commentTextView.getEditText().setCursorColor(getThemedColor(i18));
        }
        this.commentTextView.setHint(LocaleController.getString(R.string.ShareComment));
        this.commentTextView.onResume();
        this.commentTextView.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
        this.frameLayout2.addView(this.commentTextView, LayoutHelper.createFrame(-1, -2, 51));
        this.frameLayout2.setClipChildren(false);
        this.frameLayout2.setClipToPadding(false);
        this.commentTextView.setClipChildren(false);
        this.commentTextView.getEditText().addTextChangedListener(new AnonymousClass23());
        FrameLayout frameLayout6 = new FrameLayout(context) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ShareAlert.this.selectedDialogs.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
            }
        };
        this.writeButtonContainer = frameLayout6;
        frameLayout6.setFocusable(true);
        this.writeButtonContainer.setFocusableInTouchMode(true);
        this.writeButtonContainer.setVisibility(4);
        this.writeButtonContainer.setScaleX(0.2f);
        this.writeButtonContainer.setScaleY(0.2f);
        this.writeButtonContainer.setAlpha(0.0f);
        this.containerView.addView(this.writeButtonContainer, LayoutHelper.createFrame(110, 50, 85));
        ChatActivityEnterView.SendButton sendButton = new ChatActivityEnterView.SendButton(context, R.drawable.send_plane_24, this.resourcesProvider) {
            @Override
            public int getFillColor() {
                return ShareAlert.this.getThemedColor(Theme.key_dialogFloatingButton);
            }

            @Override
            public boolean isInScheduleMode() {
                return false;
            }

            @Override
            public boolean isInactive() {
                return false;
            }

            @Override
            public boolean isOpen() {
                return true;
            }

            @Override
            public boolean shouldDrawBackground() {
                return true;
            }
        };
        this.writeButton = sendButton;
        sendButton.setCircleSize(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(38.0f));
        this.writeButton.setCirclePadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(6.0f));
        ChatActivityEnterView.SendButton sendButton2 = this.writeButton;
        sendButton2.newCounterPos = true;
        this.writeButtonContainer.addView(sendButton2, LayoutHelper.createFrameMatchParent());
        this.writeButton.setOnClickListener(new ShareAlert$$ExternalSyntheticLambda7(this, 4));
        this.writeButton.setOnLongClickListener(new ShareAlert$$ExternalSyntheticLambda21(this, i4));
        this.textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.textPaint.setTypeface(AndroidUtilities.bold());
        if (num != null) {
            this.timestamp = num.intValue();
            this.timestampFrameLayout = new FrameLayout(context);
            LinearLayout linearLayout4 = new LinearLayout(context);
            this.timestampLayout = linearLayout4;
            linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            this.timestampLayout.setClipToPadding(false);
            this.timestampLayout.setOrientation(0);
            this.timestampLayout.setBackground(Theme.createRadSelectorDrawable(getThemedColor(Theme.key_listSelector), 6, 6));
            CheckBox2 checkBox2 = new CheckBox2(context, 24, this.resourcesProvider);
            this.timestampCheckbox = checkBox2;
            checkBox2.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
            this.timestampCheckbox.setDrawUnchecked(true);
            this.timestampCheckbox.setChecked(false, false);
            this.timestampCheckbox.setDrawBackgroundAsArc(10);
            this.timestampLayout.addView(this.timestampCheckbox, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
            TextView textView6 = new TextView(context);
            this.timestampTextView = textView6;
            textView6.setTextColor(getThemedColor(i11));
            this.timestampTextView.setTextSize(1, 14.0f);
            this.timestampTextView.setText(LocaleController.formatString(R.string.VideoShareAddTimestamp, AndroidUtilities.formatShortDuration(num.intValue())));
            this.timestampLayout.addView(this.timestampTextView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
            ScaleStateListAnimator.apply(this.timestampLayout, 0.025f, 1.5f);
            this.timestampLayout.setOnClickListener(new ShareAlert$$ExternalSyntheticLambda7(this, 5));
            this.timestampFrameLayout.addView(this.timestampLayout, LayoutHelper.createFrame(-2, -2, 17));
            if (this.pickerBottom == null) {
                View view3 = new View(context);
                view3.setBackgroundColor(getThemedColor(Theme.key_divider));
                this.timestampFrameLayout.addView(view3, LayoutHelper.createFrame(-1.0f, this.darkTheme ? 0.66f : 1.0f / AndroidUtilities.density, 55));
            }
            this.containerView.addView(this.timestampFrameLayout, LayoutHelper.createFrame(-1, 58, 83));
            if (this.pickerBottom == null) {
                this.timestampFrameLayout.setAlpha(0.0f);
                this.timestampFrameLayout.setVisibility(4);
            }
        }
        this.fadeDrawable = new BlurredBackgroundWithFadeDrawable(this.iBlur3FactoryFade.create(this.bottomFadeView, null));
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        this.fadeDrawable.setFadeHeight(AndroidUtilities.dp(72.0f), true);
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = this.iBlur3FactoryFrostedLiquidGlass.create(this.sizeNotifierFrameLayout, BlurredBackgroundProviderImpl.inputFieldShareAlert(this.resourcesProvider));
        this.emojiViewChildBg = blurredBackgroundDrawableCreate;
        blurredBackgroundDrawableCreate.inAppKeyboardOptimization = true;
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.emojiViewChildBg;
        blurredBackgroundDrawable.boundProps.liquidThickness = AndroidUtilities.dp(32.0f);
        blurredBackgroundDrawable.onBoundPropsChanged();
        BlurredBackgroundDrawable blurredBackgroundDrawable2 = this.emojiViewChildBg;
        blurredBackgroundDrawable2.boundProps.liquidIntensity = 0.4f;
        blurredBackgroundDrawable2.onBoundPropsChanged();
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate2 = this.iBlur3FactoryLiquidGlass.create(this.frameLayout2, BlurredBackgroundProviderImpl.inputFieldShareAlert(this.resourcesProvider));
        this.captionContainerBg = blurredBackgroundDrawableCreate2;
        blurredBackgroundDrawableCreate2.setRadius(AndroidUtilities.dp(22.0f));
        this.captionContainerBg.setPadding(AndroidUtilities.dp(9.0f));
        this.frameLayout2.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        FrameLayout frameLayout7 = this.pickerBottomLayout;
        if (frameLayout7 != null) {
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate3 = this.iBlur3FactoryLiquidGlass.create(frameLayout7, BlurredBackgroundProviderImpl.inputFieldShareAlert(this.resourcesProvider));
            blurredBackgroundDrawableCreate3.setPadding(AndroidUtilities.dp(9.0f));
            blurredBackgroundDrawableCreate3.setRadius(AndroidUtilities.dp(22.0f));
            this.pickerBottomLayout.setBackground(blurredBackgroundDrawableCreate3);
            this.pickerBottomLayout.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        FrameLayout frameLayout8 = this.timestampFrameLayout;
        if (frameLayout8 != null) {
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate4 = this.iBlur3FactoryLiquidGlass.create(frameLayout8, BlurredBackgroundProviderImpl.inputFieldShareAlert(this.resourcesProvider));
            blurredBackgroundDrawableCreate4.setPadding(AndroidUtilities.dp(9.0f));
            blurredBackgroundDrawableCreate4.setRadius(AndroidUtilities.dp(22.0f));
            this.timestampFrameLayout.setBackground(blurredBackgroundDrawableCreate4);
            this.timestampFrameLayout.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        updateSelectedCount(0);
        DialogsActivity.loadDialogs(AccountInstance.getInstance(this.currentAccount));
        if (this.listAdapter.dialogs.isEmpty()) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        }
        DialogsSearchAdapter.loadRecentSearch(this.currentAccount, 0, new DialogsSearchAdapter.OnRecentSearchLoaded() {
            @Override
            public void setRecentSearch(ArrayList<DialogsSearchAdapter.RecentSearchObject> arrayList6, LongSparseArray longSparseArray) {
                if (arrayList6 != null) {
                    int i19 = 0;
                    while (i19 < arrayList6.size()) {
                        TLObject tLObject = arrayList6.get(i19).object;
                        if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                            arrayList6.remove(i19);
                            i19--;
                        }
                        i19++;
                    }
                }
                ShareAlert.this.recentSearchObjects = arrayList6;
                ShareAlert.this.recentSearchObjectsById = longSparseArray;
                for (int i20 = 0; i20 < ShareAlert.this.recentSearchObjects.size(); i20++) {
                    DialogsSearchAdapter.RecentSearchObject recentSearchObject = (DialogsSearchAdapter.RecentSearchObject) ShareAlert.this.recentSearchObjects.get(i20);
                    TLObject tLObject2 = recentSearchObject.object;
                    if (tLObject2 instanceof TLRPC.User) {
                        MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putUser((TLRPC.User) recentSearchObject.object, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putChat((TLRPC.Chat) recentSearchObject.object, true);
                    } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                        MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putEncryptedChat((TLRPC.EncryptedChat) recentSearchObject.object, true);
                    }
                }
                ShareAlert.this.searchAdapter.notifyDataSetChanged();
            }
        });
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        AndroidUtilities.updateViewVisibilityAnimated(this.gridView, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.searchGridView, false, 1.0f, false);
        ViewCompat.setOnApplyWindowInsetsListener(getContainer(), new ShareAlert$$ExternalSyntheticLambda3(this, i3));
    }

    public interface ShareAlertDelegate {
        boolean didCopy();

        void didShare();

        public abstract class CC {
            public static boolean $default$didCopy(ShareAlertDelegate shareAlertDelegate) {
                return false;
            }

            public static void $default$didShare(ShareAlertDelegate shareAlertDelegate) {
            }
        }
    }
}
