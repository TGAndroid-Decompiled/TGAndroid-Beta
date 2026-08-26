package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.PhoneNumberUtils;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.Base64;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.cast.framework.media.zzq;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.internal.zah;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.internal.clearcut.zze;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import com.google.android.gms.internal.mlkit_language_id_common.zzit;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import com.google.android.gms.internal.safetynet.zzi;
import com.google.android.gms.internal.safetynet.zzp;
import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetApi$AttestationResponse;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import me.vkryl.android.animator.FactorAnimator;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarConstructorFragment;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.CustomPhoneKeyboardView;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.HashtagActivity;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.InviteMembersBottomSheet;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.LoginOrView;
import org.telegram.ui.Components.MediaActivity;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.Views.PipettePickerView;
import org.telegram.ui.Components.Paint.Views.TextPaintView;
import org.telegram.ui.Components.PasscodeView;
import org.telegram.ui.Components.PhotoViewerCoverEditor;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.PollVotesAlert;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.ProxyDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SearchTagsList;
import org.telegram.ui.Components.SectionsScrollView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SlideView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TextViewSwitcher;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.ThemeSmallPreviewView;
import org.telegram.ui.Components.TopicsTabsView;
import org.telegram.ui.Components.TransformableLoginButtonView;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.Components.UpdateAppAlertDialog;
import org.telegram.ui.Components.UsersAlertBase;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Components.voip.VoIPBackgroundProvider;
import org.telegram.ui.Components.voip.VoIPStatusTextView;
import org.telegram.ui.Components.voip.VoIPToggleButton;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Stars.ExplainStarsSheet;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;
import org.telegram.ui.bots.BotShareSheet$$ExternalSyntheticLambda10;
import org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda3;
import org.telegram.ui.web.WebActionBar;

public final class LoginActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public static final int SHOW_DELAY;
    public int activityMode;
    public ImageView backButtonView;
    public View cachedFragmentView;
    public AlertDialog cancelDeleteProgressDialog;
    public TLRPC.TL_auth_sentCode cancelDeletionCode;
    public Bundle cancelDeletionParams;
    public String cancelDeletionPhone;
    public boolean checkPermissions;
    public boolean checkShowPermissions;
    public int currentConnectionState;
    public int currentDoneType;
    public TLRPC.TL_help_termsOfService currentTermsOfService;
    public int currentViewNum;
    public boolean customKeyboardWasVisible;
    public final boolean[] doneButtonVisible;
    public AnimatorSet doneItemAnimation;
    public final boolean[] doneProgressVisible;
    public final Runnable[] editDoneCallback;
    public Runnable emailChangeFinishCallback;
    public boolean emailChangeIsSuggestion;
    public boolean emailChangeNonSkippable;
    public TextView emailChangeSkipButton;
    public DialogsActivity$$ExternalSyntheticLambda27 emailChangeSkipCallback;
    public PhotoViewer.AnonymousClass14 floatingAutoAnimator;
    public FragmentFloatingButton floatingButton;
    public TransformableLoginButtonView floatingButtonIcon;
    public boolean forceDisableSafetyNet;
    public boolean isRequestingFirebaseSms;
    public ValueAnimator keyboardAnimator;
    public LoginActivity$PhoneView$$ExternalSyntheticLambda6 keyboardHideCallback;
    public LinearLayout keyboardLinearLayout;
    public CustomPhoneKeyboardView keyboardView;
    public boolean needRequestPermissions;
    public boolean newAccount;
    public boolean paid;
    public boolean pendingSwitchingAccount;
    public Dialog permissionsDialog;
    public final ArrayList permissionsItems;
    public Dialog permissionsShowDialog;
    public final ArrayList permissionsShowItems;
    public PhoneNumberConfirmView phoneNumberConfirmView;
    public final boolean[] postedEditDoneCallback;
    public int progressRequestId;
    public ImageView proxyButtonView;
    public boolean proxyButtonVisible;
    public ProxyDrawable proxyDrawable;
    public RadialProgressView radialProgressView;
    public boolean restoringState;
    public final AnimatorSet[] showDoneAnimation;
    public LoginActivity$$ExternalSyntheticLambda8 showProxyButtonDelayed;
    public AnonymousClass2 sizeNotifierFrameLayout;
    public AnonymousClass4 slideViewsContainer;
    public boolean syncContacts;
    public boolean testBackend;
    public final SlideView[] views;

    public final class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onItemClick(int i) {
            Runnable runnable;
            switch (this.$r8$classId) {
                case 0:
                    LoginActivity loginActivity = (LoginActivity) this.this$0;
                    if (i == 1) {
                        loginActivity.onDoneButtonPressed();
                        break;
                    } else if (i == -1 && loginActivity.onBackPressed(true)) {
                        loginActivity.finishFragment();
                        break;
                    }
                    break;
                case 1:
                    if (i == -1) {
                        ((HashtagActivity) this.this$0).finishFragment();
                    }
                    break;
                case 2:
                    if (i == -1 && (runnable = ((PhotoViewerCoverEditor) this.this$0).close) != null) {
                        AndroidUtilities.runOnUIThread(runnable);
                        break;
                    }
                    break;
                case 3:
                    if (i == -1) {
                        ((PollVotesAlert) this.this$0).lambda$showGiftOfferSheet$15();
                    }
                    break;
                case 4:
                    if (i == -1) {
                        ((PremiumFeatureBottomSheet) this.this$0).lambda$showGiftOfferSheet$15();
                    }
                    break;
                case 5:
                    if (i == -1) {
                        ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = (ChatCustomReactionsEditActivity) this.this$0;
                        if (!chatCustomReactionsEditActivity.checkChangesBeforeExit(true)) {
                            chatCustomReactionsEditActivity.finishFragment();
                        }
                    }
                    break;
                case 6:
                    ((ShareAlert) this.this$0).lambda$openCrafting$8();
                    break;
                case 7:
                    if (i == -1) {
                        ((UniversalFragment) this.this$0).finishFragment();
                    }
                    break;
                case 8:
                    if (i == -1) {
                        ((GroupCallActivity.AnonymousClass47) this.this$0).dismiss(false, false);
                    }
                    break;
                case 9:
                    if (i == -1) {
                        ((VoIPFragment.AnonymousClass24) this.this$0).dismiss(false, false);
                    }
                    break;
                case 10:
                    if (i == -1) {
                        ((CountrySelectActivity) this.this$0).finishFragment();
                    }
                    break;
                case 11:
                    if (i == -1) {
                        ((DataAutoDownloadActivity) this.this$0).finishFragment();
                    }
                    break;
                case 12:
                    if (i == -1) {
                        ((DataSettingsActivity) this.this$0).finishFragment();
                    }
                    break;
                case 13:
                    if (i == -1) {
                        ((DataUsage2Activity) this.this$0).finishFragment();
                    }
                    break;
                case 14:
                    if (i == -1) {
                        ((DialogOrContactPickerActivity) this.this$0).finishFragment();
                    }
                    break;
                case 15:
                    if (i == -1) {
                        ((EnableTopicsActivity) this.this$0).finishFragment();
                    }
                    break;
                case 16:
                    FilterChatlistActivity filterChatlistActivity = (FilterChatlistActivity) this.this$0;
                    if (i == -1) {
                        if (filterChatlistActivity.checkDiscard$8(true)) {
                            filterChatlistActivity.finishFragment();
                        }
                    } else if (i == 1) {
                        if (Math.abs(filterChatlistActivity.doneButtonAlpha - 1.0f) < 0.1f) {
                            filterChatlistActivity.save$1();
                        } else if (Math.abs(filterChatlistActivity.doneButtonAlpha - 0.5f) < 0.1f) {
                            for (int i2 = 0; i2 < filterChatlistActivity.listView.getChildCount(); i2++) {
                                View childAt = filterChatlistActivity.listView.getChildAt(i2);
                                filterChatlistActivity.listView.getClass();
                                if (RecyclerView.getChildAdapterPosition(childAt) == filterChatlistActivity.chatsHeaderRow && (childAt instanceof FolderBottomSheet.HeaderCell)) {
                                    int i3 = -filterChatlistActivity.shiftDp;
                                    filterChatlistActivity.shiftDp = i3;
                                    AndroidUtilities.shakeViewSpring(childAt, i3);
                                }
                            }
                        }
                    }
                    break;
                case 17:
                    FilterCreateActivity filterCreateActivity = (FilterCreateActivity) this.this$0;
                    if (i == -1) {
                        if (filterCreateActivity.checkDiscard$9(true)) {
                            filterCreateActivity.finishFragment();
                        }
                    } else if (i == 1) {
                        filterCreateActivity.processDone$15();
                    }
                    break;
                case 18:
                    if (i == -1) {
                        ((FiltersSetupActivity) this.this$0).finishFragment();
                    }
                    break;
                case 19:
                    if (i == -1) {
                        ((ResaleGiftsFragment) this.this$0).finishFragment();
                    }
                    break;
                case 20:
                    if (i == -1) {
                        ((GradientHeaderActivity) this.this$0).finishFragment();
                    }
                    break;
                case 21:
                    GroupCreateActivity groupCreateActivity = (GroupCreateActivity) this.this$0;
                    if (i == -1) {
                        if (groupCreateActivity.checkDiscard$3(true)) {
                            groupCreateActivity.finishFragment();
                        }
                    } else if (i == 1) {
                        groupCreateActivity.onDonePressed();
                    }
                    break;
                case 22:
                    if (i == -1) {
                        ((GroupCreateFinalActivity) this.this$0).finishFragment();
                    }
                    break;
                case 23:
                    if (i == -1) {
                        ((GroupInviteActivity) this.this$0).finishFragment();
                    }
                    break;
                case 24:
                    if (i == -1) {
                        ((GroupStickersActivity) this.this$0).finishFragment();
                    }
                    break;
                case 25:
                    if (i == -1) {
                        ((IdenticonActivity) this.this$0).finishFragment();
                    }
                    break;
                case 26:
                    if (i == -1) {
                        ((InviteContactsActivity) this.this$0).finishFragment();
                    }
                    break;
                case 27:
                    if (i == -1) {
                        ((LanguageSelectActivity) this.this$0).finishFragment();
                    }
                    break;
                case 28:
                    if (i == -1) {
                        LinkEditActivity linkEditActivity = (LinkEditActivity) this.this$0;
                        linkEditActivity.finishFragment();
                        AndroidUtilities.hideKeyboard(linkEditActivity.usesEditText);
                    }
                    break;
                default:
                    if (i == -1) {
                        ((LiteModeSettingsActivity) this.this$0).finishFragment();
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass2 extends SizeNotifierFrameLayout {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass2(Object obj, Context context, int i) {
            super(context, null);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            CallLogActivity callLogActivity;
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
            ContactsActivity contactsActivity;
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor2;
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor3;
            StatisticActivity statisticActivity;
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor4;
            switch (this.$r8$classId) {
                case 1:
                    if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor = (callLogActivity = (CallLogActivity) this.this$0).scrollableViewNoiseSuppressor) != null) {
                        callLogActivity.blur3_InvalidateBlur();
                        int measuredWidth = getMeasuredWidth();
                        int measuredHeight = getMeasuredHeight();
                        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = callLogActivity.iBlur3SourceGlassFrosted;
                        if (blurredBackgroundSourceRenderNode != null && !blurredBackgroundSourceRenderNode.inRecording) {
                            RecordingCanvas recordingCanvasBeginRecording = blurredBackgroundSourceRenderNode.beginRecording(measuredWidth, measuredHeight);
                            recordingCanvasBeginRecording.drawColor(callLogActivity.getThemedColor(Theme.key_windowBackgroundGray));
                            if (SharedConfig.chatBlurEnabled()) {
                                downscaleScrollableNoiseSuppressor.draw(recordingCanvasBeginRecording, -3);
                            }
                            blurredBackgroundSourceRenderNode.endRecording();
                        }
                        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = callLogActivity.iBlur3SourceGlass;
                        if (blurredBackgroundSourceRenderNode2 != null && !blurredBackgroundSourceRenderNode2.inRecording) {
                            RecordingCanvas recordingCanvasBeginRecording2 = blurredBackgroundSourceRenderNode2.beginRecording(measuredWidth, measuredHeight);
                            recordingCanvasBeginRecording2.drawColor(callLogActivity.getThemedColor(Theme.key_windowBackgroundGray));
                            if (SharedConfig.chatBlurEnabled()) {
                                downscaleScrollableNoiseSuppressor.draw(recordingCanvasBeginRecording2, -2);
                            }
                            blurredBackgroundSourceRenderNode2.endRecording();
                        }
                    }
                    super.dispatchDraw(canvas);
                    break;
                case 2:
                    if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor2 = (contactsActivity = (ContactsActivity) this.this$0).scrollableViewNoiseSuppressor) != null) {
                        contactsActivity.blur3_InvalidateBlur$3();
                        int measuredWidth2 = getMeasuredWidth();
                        int measuredHeight2 = getMeasuredHeight();
                        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode3 = contactsActivity.iBlur3SourceGlassFrosted;
                        if (blurredBackgroundSourceRenderNode3 != null && !blurredBackgroundSourceRenderNode3.inRecording) {
                            RecordingCanvas recordingCanvasBeginRecording3 = blurredBackgroundSourceRenderNode3.beginRecording(measuredWidth2, measuredHeight2);
                            recordingCanvasBeginRecording3.drawColor(contactsActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                            if (SharedConfig.chatBlurEnabled()) {
                                downscaleScrollableNoiseSuppressor2.draw(recordingCanvasBeginRecording3, -3);
                            }
                            blurredBackgroundSourceRenderNode3.endRecording();
                        }
                        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode4 = contactsActivity.iBlur3SourceGlass;
                        if (blurredBackgroundSourceRenderNode4 != null && !blurredBackgroundSourceRenderNode4.inRecording) {
                            RecordingCanvas recordingCanvasBeginRecording4 = blurredBackgroundSourceRenderNode4.beginRecording(measuredWidth2, measuredHeight2);
                            recordingCanvasBeginRecording4.drawColor(contactsActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                            if (SharedConfig.chatBlurEnabled()) {
                                downscaleScrollableNoiseSuppressor2.draw(recordingCanvasBeginRecording4, -2);
                            }
                            blurredBackgroundSourceRenderNode4.endRecording();
                        }
                    }
                    super.dispatchDraw(canvas);
                    break;
                case 3:
                case 4:
                case 5:
                default:
                    super.dispatchDraw(canvas);
                    break;
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    SettingsActivity settingsActivity = (SettingsActivity) this.this$0;
                    if (i >= 31 && (downscaleScrollableNoiseSuppressor3 = settingsActivity.scrollableViewNoiseSuppressor) != null) {
                        settingsActivity.blur3_InvalidateBlur$9();
                        int measuredWidth3 = getMeasuredWidth();
                        int measuredHeight3 = getMeasuredHeight();
                        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode5 = settingsActivity.iBlur3SourceGlassFrosted;
                        if (blurredBackgroundSourceRenderNode5 != null && !blurredBackgroundSourceRenderNode5.inRecording) {
                            RecordingCanvas recordingCanvasBeginRecording5 = blurredBackgroundSourceRenderNode5.beginRecording(measuredWidth3, measuredHeight3);
                            recordingCanvasBeginRecording5.drawColor(settingsActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                            if (SharedConfig.chatBlurEnabled()) {
                                downscaleScrollableNoiseSuppressor3.draw(recordingCanvasBeginRecording5, -3);
                            }
                            blurredBackgroundSourceRenderNode5.endRecording();
                        }
                        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode6 = settingsActivity.iBlur3SourceGlass;
                        if (blurredBackgroundSourceRenderNode6 != null && !blurredBackgroundSourceRenderNode6.inRecording) {
                            RecordingCanvas recordingCanvasBeginRecording6 = blurredBackgroundSourceRenderNode6.beginRecording(measuredWidth3, measuredHeight3);
                            recordingCanvasBeginRecording6.drawColor(settingsActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                            if (SharedConfig.chatBlurEnabled()) {
                                downscaleScrollableNoiseSuppressor3.draw(recordingCanvasBeginRecording6, -2);
                            }
                            blurredBackgroundSourceRenderNode6.endRecording();
                        }
                    }
                    super.dispatchDraw(canvas);
                    if (!settingsActivity.hasMainTabs) {
                        AndroidUtilities.drawNavigationBarProtection(canvas, this, settingsActivity.getThemedColor(Theme.key_windowBackgroundWhite), settingsActivity.navigationBarHeight);
                    }
                    break;
                case 7:
                    if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor4 = (statisticActivity = (StatisticActivity) this.this$0).scrollableViewNoiseSuppressor) != null) {
                        StatisticActivity.access$200(statisticActivity);
                        int measuredWidth4 = getMeasuredWidth();
                        int measuredHeight4 = getMeasuredHeight();
                        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode7 = statisticActivity.iBlur3SourceGlassFrosted;
                        if (blurredBackgroundSourceRenderNode7 != null && !blurredBackgroundSourceRenderNode7.inRecording) {
                            RecordingCanvas recordingCanvasBeginRecording7 = blurredBackgroundSourceRenderNode7.beginRecording(measuredWidth4, measuredHeight4);
                            recordingCanvasBeginRecording7.drawColor(statisticActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                            if (SharedConfig.chatBlurEnabled()) {
                                downscaleScrollableNoiseSuppressor4.draw(recordingCanvasBeginRecording7, -3);
                            }
                            blurredBackgroundSourceRenderNode7.endRecording();
                        }
                        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode8 = statisticActivity.iBlur3SourceGlass;
                        if (blurredBackgroundSourceRenderNode8 != null && !blurredBackgroundSourceRenderNode8.inRecording) {
                            RecordingCanvas recordingCanvasBeginRecording8 = blurredBackgroundSourceRenderNode8.beginRecording(measuredWidth4, measuredHeight4);
                            recordingCanvasBeginRecording8.drawColor(statisticActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                            if (SharedConfig.chatBlurEnabled()) {
                                downscaleScrollableNoiseSuppressor4.draw(recordingCanvasBeginRecording8, -2);
                            }
                            blurredBackgroundSourceRenderNode8.endRecording();
                        }
                    }
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
            switch (this.$r8$classId) {
                case 1:
                    if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
                        CallLogActivity callLogActivity = (CallLogActivity) this.this$0;
                        if (callLogActivity.iBlur3SourceGlassFrosted != null) {
                            canvas.save();
                            canvas.translate(0.0f, -f);
                            callLogActivity.iBlur3SourceGlassFrosted.draw(canvas, rect.left, rect.top + f, rect.right, rect.bottom + f);
                            canvas.restore();
                            int alpha = paint.getAlpha();
                            paint.setAlpha(178);
                            canvas.drawRect(rect, paint);
                            paint.setAlpha(alpha);
                        }
                    }
                    canvas.drawRect(rect, paint);
                    break;
                case 2:
                    if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
                        ContactsActivity contactsActivity = (ContactsActivity) this.this$0;
                        if (contactsActivity.iBlur3SourceGlassFrosted != null) {
                            canvas.save();
                            canvas.translate(0.0f, -f);
                            contactsActivity.iBlur3SourceGlassFrosted.draw(canvas, rect.left, rect.top + f, rect.right, rect.bottom + f);
                            canvas.restore();
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha(178);
                            canvas.drawRect(rect, paint);
                            paint.setAlpha(alpha2);
                        }
                    }
                    canvas.drawRect(rect, paint);
                    break;
                case 3:
                case 4:
                case 5:
                default:
                    super.drawBlurRect(canvas, f, rect, paint, z);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
                        SettingsActivity settingsActivity = (SettingsActivity) this.this$0;
                        if (settingsActivity.iBlur3SourceGlassFrosted != null) {
                            canvas.save();
                            canvas.translate(0.0f, -f);
                            settingsActivity.iBlur3SourceGlassFrosted.draw(canvas, rect.left, rect.top + f, rect.right, rect.bottom + f);
                            canvas.restore();
                            int alpha3 = paint.getAlpha();
                            paint.setAlpha(178);
                            canvas.drawRect(rect, paint);
                            paint.setAlpha(alpha3);
                        }
                    }
                    canvas.drawRect(rect, paint);
                    break;
                case 7:
                    if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
                        StatisticActivity statisticActivity = (StatisticActivity) this.this$0;
                        if (statisticActivity.iBlur3SourceGlassFrosted != null) {
                            canvas.save();
                            canvas.translate(0.0f, -f);
                            statisticActivity.iBlur3SourceGlassFrosted.draw(canvas, rect.left, rect.top + f, rect.right, rect.bottom + f);
                            canvas.restore();
                            int alpha4 = paint.getAlpha();
                            paint.setAlpha(178);
                            canvas.drawRect(rect, paint);
                            paint.setAlpha(alpha4);
                        }
                    }
                    canvas.drawRect(rect, paint);
                    break;
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int measuredWidth;
            int i7;
            int i8;
            int measuredHeight;
            switch (this.$r8$classId) {
                case 1:
                    super.onLayout(z, i, i2, i3, i4);
                    CallLogActivity callLogActivity = (CallLogActivity) this.this$0;
                    callLogActivity.floatingButton.setTranslationY(((-callLogActivity.navigationBarHeight) - callLogActivity.additionFloatingButtonOffset) - callLogActivity.additionalFloatingTranslation);
                    callLogActivity.checkUi_listClip();
                    break;
                case 2:
                    super.onLayout(z, i, i2, i3, i4);
                    ContactsActivity contactsActivity = (ContactsActivity) this.this$0;
                    StickerEmptyView stickerEmptyView = contactsActivity.emptyView;
                    if (stickerEmptyView != null) {
                        stickerEmptyView.setKeyboardHeight(Math.max(contactsActivity.navigationBarHeight + contactsActivity.additionNavigationBarHeight, contactsActivity.imeInsetAnimatedHeight), false);
                    }
                    FragmentFloatingButton.setAnimatedVisibility(contactsActivity.searchItem, (1.0f - contactsActivity.animatorSearchHasQuery.floatValue) * (1.0f - contactsActivity.animatorSearchFieldVisible.floatValue));
                    contactsActivity.checkUi_sortItem();
                    contactsActivity.checkUi_floatingButtonPosition();
                    ContactsActivity.access$3100(contactsActivity);
                    break;
                case 3:
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
                case 4:
                    LinkEditActivity linkEditActivity = (LinkEditActivity) this.this$0;
                    int scrollY = linkEditActivity.scrollView.getScrollY();
                    super.onLayout(z, i, i2, i3, i4);
                    if (scrollY != linkEditActivity.scrollView.getScrollY()) {
                        SectionsScrollView sectionsScrollView = linkEditActivity.scrollView;
                        sectionsScrollView.setTranslationY(sectionsScrollView.getScrollY() - scrollY);
                        linkEditActivity.scrollView.animate().cancel();
                        linkEditActivity.scrollView.animate().translationY(0.0f).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
                    }
                    break;
                case 5:
                    int childCount = getChildCount();
                    int iMeasureKeyboardHeight = measureKeyboardHeight();
                    int iDp = AndroidUtilities.dp(20.0f);
                    PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.this$0;
                    int emojiPadding = iMeasureKeyboardHeight <= iDp ? popupNotificationActivity.chatActivityEnterView.getEmojiPadding() : 0;
                    for (int i9 = 0; i9 < childCount; i9++) {
                        View childAt = getChildAt(i9);
                        if (childAt.getVisibility() != 8) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                            int measuredWidth2 = childAt.getMeasuredWidth();
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i10 = layoutParams.gravity;
                            if (i10 == -1) {
                                i10 = 51;
                            }
                            int i11 = i10 & 112;
                            int i12 = i10 & 7;
                            if (i12 != 1) {
                                if (i12 != 5) {
                                    measuredWidth = layoutParams.leftMargin;
                                } else {
                                    i5 = i3 - measuredWidth2;
                                    i6 = layoutParams.rightMargin;
                                }
                                if (i11 != 16) {
                                    if (i11 != 80) {
                                        measuredHeight = layoutParams.topMargin;
                                    } else {
                                        i7 = ((i4 - emojiPadding) - i2) - measuredHeight2;
                                        i8 = layoutParams.bottomMargin;
                                    }
                                    if (popupNotificationActivity.chatActivityEnterView.isPopupView(childAt)) {
                                        if (emojiPadding != 0) {
                                            measuredHeight = getMeasuredHeight() - emojiPadding;
                                        } else {
                                            measuredHeight = getMeasuredHeight();
                                        }
                                    } else if (childAt == popupNotificationActivity.chatActivityEnterView.recordCircle) {
                                        measuredHeight = ((popupNotificationActivity.popupContainer.getMeasuredHeight() + popupNotificationActivity.popupContainer.getTop()) - childAt.getMeasuredHeight()) - layoutParams.bottomMargin;
                                        measuredWidth = ((popupNotificationActivity.popupContainer.getMeasuredWidth() + popupNotificationActivity.popupContainer.getLeft()) - childAt.getMeasuredWidth()) - layoutParams.rightMargin;
                                    }
                                    childAt.layout(measuredWidth, measuredHeight, measuredWidth2 + measuredWidth, measuredHeight2 + measuredHeight);
                                } else {
                                    i7 = ((((i4 - emojiPadding) - i2) - measuredHeight2) / 2) + layoutParams.topMargin;
                                    i8 = layoutParams.bottomMargin;
                                }
                                measuredHeight = i7 - i8;
                                if (popupNotificationActivity.chatActivityEnterView.isPopupView(childAt)) {
                                    if (emojiPadding != 0) {
                                        measuredHeight = getMeasuredHeight() - emojiPadding;
                                    } else {
                                        measuredHeight = getMeasuredHeight();
                                    }
                                } else if (childAt == popupNotificationActivity.chatActivityEnterView.recordCircle) {
                                    measuredHeight = ((popupNotificationActivity.popupContainer.getMeasuredHeight() + popupNotificationActivity.popupContainer.getTop()) - childAt.getMeasuredHeight()) - layoutParams.bottomMargin;
                                    measuredWidth = ((popupNotificationActivity.popupContainer.getMeasuredWidth() + popupNotificationActivity.popupContainer.getLeft()) - childAt.getMeasuredWidth()) - layoutParams.rightMargin;
                                }
                                childAt.layout(measuredWidth, measuredHeight, measuredWidth2 + measuredWidth, measuredHeight2 + measuredHeight);
                            } else {
                                i5 = (((i3 - i) - measuredWidth2) / 2) + layoutParams.leftMargin;
                                i6 = layoutParams.rightMargin;
                            }
                            measuredWidth = i5 - i6;
                            if (i11 != 16) {
                                if (i11 != 80) {
                                    measuredHeight = layoutParams.topMargin;
                                } else {
                                    i7 = ((i4 - emojiPadding) - i2) - measuredHeight2;
                                    i8 = layoutParams.bottomMargin;
                                }
                                if (popupNotificationActivity.chatActivityEnterView.isPopupView(childAt)) {
                                    if (emojiPadding != 0) {
                                        measuredHeight = getMeasuredHeight() - emojiPadding;
                                    } else {
                                        measuredHeight = getMeasuredHeight();
                                    }
                                } else if (childAt == popupNotificationActivity.chatActivityEnterView.recordCircle) {
                                    measuredHeight = ((popupNotificationActivity.popupContainer.getMeasuredHeight() + popupNotificationActivity.popupContainer.getTop()) - childAt.getMeasuredHeight()) - layoutParams.bottomMargin;
                                    measuredWidth = ((popupNotificationActivity.popupContainer.getMeasuredWidth() + popupNotificationActivity.popupContainer.getLeft()) - childAt.getMeasuredWidth()) - layoutParams.rightMargin;
                                }
                                childAt.layout(measuredWidth, measuredHeight, measuredWidth2 + measuredWidth, measuredHeight2 + measuredHeight);
                            } else {
                                i7 = ((((i4 - emojiPadding) - i2) - measuredHeight2) / 2) + layoutParams.topMargin;
                                i8 = layoutParams.bottomMargin;
                            }
                            measuredHeight = i7 - i8;
                            if (popupNotificationActivity.chatActivityEnterView.isPopupView(childAt)) {
                                if (emojiPadding != 0) {
                                    measuredHeight = getMeasuredHeight() - emojiPadding;
                                } else {
                                    measuredHeight = getMeasuredHeight();
                                }
                            } else if (childAt == popupNotificationActivity.chatActivityEnterView.recordCircle) {
                                measuredHeight = ((popupNotificationActivity.popupContainer.getMeasuredHeight() + popupNotificationActivity.popupContainer.getTop()) - childAt.getMeasuredHeight()) - layoutParams.bottomMargin;
                                measuredWidth = ((popupNotificationActivity.popupContainer.getMeasuredWidth() + popupNotificationActivity.popupContainer.getLeft()) - childAt.getMeasuredWidth()) - layoutParams.rightMargin;
                            }
                            childAt.layout(measuredWidth, measuredHeight, measuredWidth2 + measuredWidth, measuredHeight2 + measuredHeight);
                        }
                    }
                    notifyHeightChanged();
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    LoginActivity loginActivity = (LoginActivity) this.this$0;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) loginActivity.floatingButton.getLayoutParams();
                    int iDp = loginActivity.isCustomKeyboardVisible() ? AndroidUtilities.dp(226.0f) : 0;
                    if (loginActivity.isCustomKeyboardVisible() && measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                        iDp -= measureKeyboardHeight();
                    }
                    Bulletin bulletin = Bulletin.visibleBulletin;
                    if (bulletin == null || !bulletin.showing) {
                        marginLayoutParams.bottomMargin = AndroidUtilities.dp(14.0f) + iDp;
                    } else {
                        super.onMeasure(i, i2);
                        marginLayoutParams.bottomMargin = zzlb.m(Bulletin.visibleBulletin.layout.getMeasuredHeight() + AndroidUtilities.dp(14.0f), 10.0f, iDp);
                    }
                    int i3 = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                    ((ViewGroup.MarginLayoutParams) loginActivity.backButtonView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i3;
                    ((ViewGroup.MarginLayoutParams) loginActivity.proxyButtonView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i3;
                    ((ViewGroup.MarginLayoutParams) loginActivity.radialProgressView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i3;
                    TextView textView = loginActivity.emailChangeSkipButton;
                    if (textView != null) {
                        ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i3;
                    }
                    if (measureKeyboardHeight() > AndroidUtilities.dp(20.0f) && loginActivity.keyboardView.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !loginActivity.customKeyboardWasVisible) {
                        ValueAnimator valueAnimator = loginActivity.keyboardAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        loginActivity.keyboardView.setVisibility(8);
                    }
                    super.onMeasure(i, i2);
                    break;
                case 1:
                    CallLogActivity callLogActivity = (CallLogActivity) this.this$0;
                    measureChildWithMargins(((BaseFragment) callLogActivity).actionBar, i, 0, i2, 0);
                    ((ViewGroup.MarginLayoutParams) callLogActivity.topPanelLayout.getLayoutParams()).topMargin = ((BaseFragment) callLogActivity).actionBar.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                    ((ViewGroup.MarginLayoutParams) callLogActivity.emptyView.getLayoutParams()).topMargin = ((BaseFragment) callLogActivity).actionBar.getMeasuredHeight();
                    ((ViewGroup.MarginLayoutParams) callLogActivity.headerShadowView.getLayoutParams()).topMargin = ((BaseFragment) callLogActivity).actionBar.getMeasuredHeight();
                    callLogActivity.checkUi_listViewPadding();
                    super.onMeasure(i, i2);
                    break;
                case 2:
                    ContactsActivity contactsActivity = (ContactsActivity) this.this$0;
                    measureChildWithMargins(((BaseFragment) contactsActivity).actionBar, i, 0, i2, 0);
                    ((ViewGroup.MarginLayoutParams) contactsActivity.emptyView.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + ((BaseFragment) contactsActivity).actionBar.getMeasuredHeight();
                    ((ViewGroup.MarginLayoutParams) contactsActivity.headerShadowView.getLayoutParams()).topMargin = ((BaseFragment) contactsActivity).actionBar.getMeasuredHeight();
                    contactsActivity.checkUi_listViewPadding$2();
                    super.onMeasure(i, i2);
                    break;
                case 3:
                    ResaleGiftsFragment resaleGiftsFragment = (ResaleGiftsFragment) this.this$0;
                    ((FrameLayout.LayoutParams) resaleGiftsFragment.filterScrollView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + (((BaseFragment) resaleGiftsFragment).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                    ((FrameLayout.LayoutParams) resaleGiftsFragment.filtersDivider.getLayoutParams()).topMargin = AndroidUtilities.dp(47.0f) + ActionBar.getCurrentActionBarHeight() + (((BaseFragment) resaleGiftsFragment).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                    ((FrameLayout.LayoutParams) resaleGiftsFragment.listView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + (((BaseFragment) resaleGiftsFragment).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                    ((FrameLayout.LayoutParams) resaleGiftsFragment.emptyView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + (((BaseFragment) resaleGiftsFragment).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                    super.onMeasure(i, i2);
                    break;
                case 4:
                    super.onMeasure(i, i2);
                    measureKeyboardHeight();
                    int i4 = this.keyboardHeight;
                    LinkEditActivity linkEditActivity = (LinkEditActivity) this.this$0;
                    if (i4 != 0 && i4 < AndroidUtilities.dp(20.0f)) {
                        linkEditActivity.usesEditText.clearFocus();
                        linkEditActivity.nameEditText.clearFocus();
                    }
                    linkEditActivity.buttonLayout.setVisibility(this.keyboardHeight > AndroidUtilities.dp(20.0f) ? 8 : 0);
                    break;
                case 5:
                    View.MeasureSpec.getMode(i);
                    View.MeasureSpec.getMode(i2);
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i2);
                    setMeasuredDimension(size, size2);
                    int iMeasureKeyboardHeight = measureKeyboardHeight();
                    int iDp2 = AndroidUtilities.dp(20.0f);
                    PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.this$0;
                    if (iMeasureKeyboardHeight <= iDp2) {
                        size2 -= popupNotificationActivity.chatActivityEnterView.getEmojiPadding();
                    }
                    int i5 = size2;
                    int childCount = getChildCount();
                    for (int i6 = 0; i6 < childCount; i6++) {
                        View childAt = getChildAt(i6);
                        if (childAt.getVisibility() != 8) {
                            if (popupNotificationActivity.chatActivityEnterView.isPopupView(childAt)) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                            } else if (childAt == popupNotificationActivity.chatActivityEnterView.recordCircle) {
                                measureChildWithMargins(childAt, i, 0, i2, 0);
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f) + i5), 1073741824));
                            }
                        }
                    }
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public void updateColors$1() {
            switch (this.$r8$classId) {
                case 6:
                    ((SettingsActivity) this.this$0).updateColors$1();
                    break;
            }
        }
    }

    public final class AnonymousClass3 extends ScrollView {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass3(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = notificationCenterDelegate;
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 4:
                    int action = motionEvent.getAction();
                    float f = ((InviteContactsActivity) this.this$0).animatorSelectorContainerHeight.factor;
                    float y = motionEvent.getY();
                    if (action != 0 || y <= f) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    return false;
                default:
                    return super.dispatchTouchEvent(motionEvent);
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            switch (this.$r8$classId) {
                case 1:
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    AlertDialog alertDialog = (AlertDialog) this.this$0;
                    if (alertDialog.shadow[0].getPaint().getAlpha() != 0) {
                        alertDialog.shadow[0].setBounds(0, getScrollY(), getMeasuredWidth(), AndroidUtilities.dp(3.0f) + getScrollY());
                        alertDialog.shadow[0].draw(canvas);
                    }
                    if (alertDialog.shadow[1].getPaint().getAlpha() != 0) {
                        alertDialog.shadow[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                        alertDialog.shadow[1].draw(canvas);
                    }
                    return zDrawChild;
                default:
                    return super.drawChild(canvas, view, j);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 2:
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i2);
                    boolean zIsTablet = AndroidUtilities.isTablet();
                    InviteMembersBottomSheet inviteMembersBottomSheet = (InviteMembersBottomSheet) this.this$0;
                    if (zIsTablet || size2 > size) {
                        inviteMembersBottomSheet.maxSize = AndroidUtilities.dp(144.0f);
                    } else {
                        inviteMembersBottomSheet.maxSize = AndroidUtilities.dp(56.0f);
                    }
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(inviteMembersBottomSheet.maxSize, Integer.MIN_VALUE));
                    break;
                case 3:
                    super.onMeasure(i, i2);
                    setMeasuredDimension(((GroupCallActivity.AnonymousClass61) this.this$0).getMeasuredWidth(), getMeasuredHeight());
                    break;
                case 4:
                default:
                    super.onMeasure(i, i2);
                    break;
                case 5:
                    ((PassportActivity) this.this$0).scrollHeight = View.MeasureSpec.getSize(i2) - AndroidUtilities.dp(30.0f);
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public boolean onRequestFocusInDescendants(int i, Rect rect) {
            switch (this.$r8$classId) {
                case 5:
                    return false;
                default:
                    return super.onRequestFocusInDescendants(i, rect);
            }
        }

        @Override
        public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
            switch (this.$r8$classId) {
                case 0:
                    int i = ((LoginActivity) this.this$0).currentViewNum;
                    if (i == 1 || i == 2 || i == 4) {
                        rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                    }
                    return super.requestChildRectangleOnScreen(view, rect, z);
                case 1:
                case 2:
                case 3:
                default:
                    return super.requestChildRectangleOnScreen(view, rect, z);
                case 4:
                    InviteContactsActivity inviteContactsActivity = (InviteContactsActivity) this.this$0;
                    if (inviteContactsActivity.ignoreScrollEvent) {
                        inviteContactsActivity.ignoreScrollEvent = false;
                        return false;
                    }
                    rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                    rect.top = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(inviteContactsActivity.fieldY, 20.0f, rect.top);
                    rect.bottom = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(inviteContactsActivity.fieldY, 50.0f, rect.bottom);
                    return super.requestChildRectangleOnScreen(view, rect, z);
                case 5:
                    int i2 = ((PassportActivity) this.this$0).currentViewNum;
                    if (i2 == 1 || i2 == 2 || i2 == 4) {
                        rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                    }
                    return super.requestChildRectangleOnScreen(view, rect, z);
                case 6:
                    UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.this$0;
                    if (usersSelectActivity.ignoreScrollEvent) {
                        usersSelectActivity.ignoreScrollEvent = false;
                        return false;
                    }
                    rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                    rect.top = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(usersSelectActivity.fieldY, 20.0f, rect.top);
                    rect.bottom = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(usersSelectActivity.fieldY, 50.0f, rect.bottom);
                    return super.requestChildRectangleOnScreen(view, rect, z);
            }
        }

        public AnonymousClass3(Context context, int i, GroupCallActivity.AnonymousClass61 anonymousClass61) {
            super(context, null, 0, i);
            this.$r8$classId = 3;
            this.this$0 = anonymousClass61;
        }
    }

    public final class AnonymousClass4 extends FrameLayout {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass4(Object obj, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
            switch (this.$r8$classId) {
                case 8:
                    return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
                default:
                    return super.dispatchApplyWindowInsets(windowInsets);
            }
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            ViewPagerFixed.AnonymousClass3 anonymousClass3;
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
            InviteContactsActivity inviteContactsActivity;
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor2;
            ChatMessageCell chatMessageCell;
            ImageReceiver imageReceiver;
            int x;
            switch (this.$r8$classId) {
                case 3:
                    super.dispatchDraw(canvas);
                    DataUsage2Activity dataUsage2Activity = (DataUsage2Activity) this.this$0;
                    if (dataUsage2Activity.getParentLayout() != null && (anonymousClass3 = dataUsage2Activity.tabsView) != null) {
                        float measuredHeight = anonymousClass3.getMeasuredHeight();
                        canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, Theme.dividerPaint);
                        break;
                    }
                    break;
                case 5:
                    int i = Build.VERSION.SDK_INT;
                    GroupCreateActivity groupCreateActivity = (GroupCreateActivity) this.this$0;
                    if (i >= 31 && (downscaleScrollableNoiseSuppressor = groupCreateActivity.scrollableViewNoiseSuppressor) != null) {
                        groupCreateActivity.blur3_InvalidateBlur$5();
                        int measuredWidth = getMeasuredWidth();
                        int measuredHeight2 = getMeasuredHeight();
                        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = groupCreateActivity.iBlur3SourceGlassFrosted;
                        if (blurredBackgroundSourceRenderNode != null && !blurredBackgroundSourceRenderNode.inRecording && blurredBackgroundSourceRenderNode.needUpdateDisplayList(measuredWidth, measuredHeight2)) {
                            downscaleScrollableNoiseSuppressor.draw(blurredBackgroundSourceRenderNode.beginRecording(measuredWidth, measuredHeight2), -3);
                            blurredBackgroundSourceRenderNode.endRecording();
                        }
                    }
                    super.dispatchDraw(canvas);
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, groupCreateActivity.getThemedColor(Theme.key_windowBackgroundWhite), groupCreateActivity.navigationBarHeight);
                    break;
                case 7:
                    if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor2 = (inviteContactsActivity = (InviteContactsActivity) this.this$0).scrollableViewNoiseSuppressor) != null) {
                        inviteContactsActivity.blur3_InvalidateBlur$6();
                        int measuredWidth2 = getMeasuredWidth();
                        int measuredHeight3 = getMeasuredHeight();
                        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = inviteContactsActivity.iBlur3SourceGlassFrosted;
                        if (blurredBackgroundSourceRenderNode2 != null && !blurredBackgroundSourceRenderNode2.inRecording && blurredBackgroundSourceRenderNode2.needUpdateDisplayList(measuredWidth2, measuredHeight3)) {
                            downscaleScrollableNoiseSuppressor2.draw(blurredBackgroundSourceRenderNode2.beginRecording(measuredWidth2, measuredHeight3), -3);
                            blurredBackgroundSourceRenderNode2.endRecording();
                        }
                    }
                    super.dispatchDraw(canvas);
                    break;
                case 8:
                    super.dispatchDraw(canvas);
                    LaunchActivity launchActivity = (LaunchActivity) this.this$0;
                    View view = launchActivity.rippleAbove;
                    if (view != null && view.getBackground() != null) {
                        if (launchActivity.tempLocation == null) {
                            launchActivity.tempLocation = new int[2];
                        }
                        launchActivity.rippleAbove.getLocationInWindow(launchActivity.tempLocation);
                        int[] iArr = launchActivity.tempLocation;
                        int i2 = iArr[0];
                        int i3 = iArr[1];
                        getLocationInWindow(iArr);
                        int[] iArr2 = launchActivity.tempLocation;
                        int i4 = i2 - iArr2[0];
                        int i5 = i3 - iArr2[1];
                        canvas.save();
                        canvas.translate(i4, i5);
                        launchActivity.rippleAbove.getBackground().draw(canvas);
                        canvas.restore();
                        break;
                    }
                    break;
                case 10:
                    int i6 = Theme.key_windowBackgroundGray;
                    MainTabsActivity mainTabsActivity = (MainTabsActivity) this.this$0;
                    int themedColor = mainTabsActivity.getThemedColor(i6);
                    int i7 = Theme.key_windowBackgroundWhite;
                    int themedColor2 = mainTabsActivity.getThemedColor(i7);
                    ViewPagerActivity.ViewPagerActivityPagerLayout viewPagerActivityPagerLayout = mainTabsActivity.viewPager;
                    int iBlendARGB = ColorUtils.blendARGB(viewPagerActivityPagerLayout != null ? viewPagerActivityPagerLayout.getMeasuredWidth() == 0 ? MathUtils.clamp(1 - Math.abs(viewPagerActivityPagerLayout.getCurrentPosition()), 0, 1) : MathUtils.clamp(1.0f - Math.abs(viewPagerActivityPagerLayout.getPositionAnimated() - 0), 0.0f, 1.0f) : 1.0f, themedColor, themedColor2);
                    int i8 = mainTabsActivity.insetLeft;
                    if (i8 != 0) {
                        canvas.drawRect(0.0f, 0.0f, i8, getHeight(), Theme.fillingPaint(iBlendARGB));
                    }
                    if (mainTabsActivity.insetRight != 0) {
                        canvas.drawRect(getWidth() - mainTabsActivity.insetRight, 0.0f, getWidth(), getHeight(), Theme.fillingPaint(iBlendARGB));
                    }
                    super.dispatchDraw(canvas);
                    mainTabsActivity.blur3_invalidateBlur();
                    BlurredBackgroundSourceColor blurredBackgroundSourceColor = mainTabsActivity.iBlur3SourceColor;
                    int themedColor3 = mainTabsActivity.getThemedColor(i6);
                    int themedColor4 = mainTabsActivity.getThemedColor(i7);
                    ViewPagerActivity.ViewPagerActivityPagerLayout viewPagerActivityPagerLayout2 = mainTabsActivity.viewPager;
                    blurredBackgroundSourceColor.paint.setColor(ColorUtils.blendARGB(viewPagerActivityPagerLayout2 != null ? viewPagerActivityPagerLayout2.getMeasuredWidth() == 0 ? MathUtils.clamp(1 - Math.abs(viewPagerActivityPagerLayout2.getCurrentPosition()), 0, 1) : MathUtils.clamp(1.0f - Math.abs(viewPagerActivityPagerLayout2.getPositionAnimated() - 0), 0.0f, 1.0f) : 1.0f, themedColor3, themedColor4));
                    View view2 = mainTabsActivity.fadeView;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    break;
                case 15:
                    super.dispatchDraw(canvas);
                    ChatActivity chatActivity = ((PhotoViewer) this.this$0).parentChatActivity;
                    if (chatActivity != null) {
                        chatActivity.createUndoView();
                        UndoView undoView = chatActivity.undoView;
                        if (undoView != null && undoView.getVisibility() == 0) {
                            canvas.save();
                            View view3 = (View) undoView.getParent();
                            canvas.clipRect(view3.getX(), view3.getY(), view3.getX() + view3.getWidth(), view3.getY() + view3.getHeight());
                            canvas.translate(undoView.getX(), undoView.getY());
                            undoView.draw(canvas);
                            canvas.restore();
                            invalidate();
                            break;
                        }
                    }
                    break;
                case 18:
                    SecretVoicePlayer secretVoicePlayer = (SecretVoicePlayer) this.this$0;
                    if (secretVoicePlayer.openProgress > 0.0f && secretVoicePlayer.blurBitmapPaint != null) {
                        secretVoicePlayer.blurMatrix.reset();
                        float width = getWidth() / secretVoicePlayer.blurBitmap.getWidth();
                        secretVoicePlayer.blurMatrix.postScale(width, width);
                        secretVoicePlayer.blurBitmapShader.setLocalMatrix(secretVoicePlayer.blurMatrix);
                        secretVoicePlayer.blurBitmapPaint.setAlpha((int) (secretVoicePlayer.openProgress * 255.0f));
                        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), secretVoicePlayer.blurBitmapPaint);
                    }
                    if (secretVoicePlayer.setCellInvisible && (chatMessageCell = secretVoicePlayer.cell) != null) {
                        chatMessageCell.setVisibility(4);
                        secretVoicePlayer.setCellInvisible = false;
                    }
                    super.dispatchDraw(canvas);
                    break;
                case 19:
                    SelectAnimatedEmojiDialog.AnonymousClass17.AnonymousClass1 anonymousClass1 = (SelectAnimatedEmojiDialog.AnonymousClass17.AnonymousClass1) this.this$0;
                    if (anonymousClass1.blurBitmap != null && anonymousClass1.blurBitmapPaint != null) {
                        canvas.save();
                        canvas.scale(12.0f, 12.0f);
                        anonymousClass1.blurBitmapPaint.setAlpha((int) (anonymousClass1.showT * 255.0f));
                        canvas.drawBitmap(anonymousClass1.blurBitmap, 0.0f, 0.0f, anonymousClass1.blurBitmapPaint);
                        canvas.restore();
                    }
                    super.dispatchDraw(canvas);
                    Rect rect = anonymousClass1.current;
                    SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji = anonymousClass1.imageViewEmoji;
                    if (imageViewEmoji != null) {
                        Drawable drawable = imageViewEmoji.drawable;
                        if (drawable != null) {
                            boolean z = anonymousClass1.changeToScrimColor;
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                            if (z) {
                                drawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(anonymousClass1.showT, selectAnimatedEmojiDialog.scrimColor, selectAnimatedEmojiDialog.accentColor), PorterDuff.Mode.MULTIPLY));
                            } else {
                                drawable.setColorFilter(selectAnimatedEmojiDialog.premiumStarColorFilter);
                            }
                            drawable.setAlpha((int) ((1.0f - anonymousClass1.showT) * 255.0f));
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(rect);
                            float f = imageViewEmoji.pressedProgress;
                            float fMax = (f != 0.0f || imageViewEmoji.selectedProgress > 0.0f) ? (((1.0f - Math.max(imageViewEmoji.selectedProgress * 0.8f, f)) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                            Rect rect2 = AndroidUtilities.rectTmp2;
                            rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * fMax)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * fMax)), (int) (((rectF.width() / 2.0f) * fMax) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * fMax) + rectF.centerY()));
                            float f2 = 1.0f - ((1.0f - anonymousClass1.showT) * (1.0f - imageViewEmoji.skewAlpha));
                            canvas.save();
                            if (f2 < 1.0f) {
                                canvas.translate(rect2.left, rect2.top);
                                canvas.scale(1.0f, f2, 0.0f, 0.0f);
                                canvas.skew((1.0f - f2) * (1.0f - ((imageViewEmoji.skewIndex * 2.0f) / 8.0f)), 0.0f);
                                canvas.translate(-rect2.left, -rect2.top);
                            }
                            canvas.clipRect(0.0f, 0.0f, getWidth(), (anonymousClass1.showT * AndroidUtilities.dp(45.0f)) + anonymousClass1.clipBottom);
                            drawable.setBounds(rect2);
                            drawable.draw(canvas);
                            canvas.restore();
                            int i9 = imageViewEmoji.skewIndex;
                            if (i9 == 0) {
                                rect2.offset(AndroidUtilities.dp(f2 * 8.0f), 0);
                            } else if (i9 == 1) {
                                rect2.offset(AndroidUtilities.dp(f2 * 4.0f), 0);
                            } else if (i9 == 6) {
                                rect2.offset(-AndroidUtilities.dp(f2 * (-4.0f)), 0);
                            } else if (i9 == 7) {
                                rect2.offset(AndroidUtilities.dp(f2 * (-8.0f)), 0);
                            }
                            canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - anonymousClass1.showT) * 255.0f), 31);
                            canvas.clipRect(rect2);
                            canvas.translate((int) (selectAnimatedEmojiDialog.contentView.getX() + selectAnimatedEmojiDialog.bottomGradientView.getX() + anonymousClass1.parentDialogX), selectAnimatedEmojiDialog.contentView.getY() + ((int) selectAnimatedEmojiDialog.bottomGradientView.getY()) + anonymousClass1.parentDialogY);
                            selectAnimatedEmojiDialog.bottomGradientView.draw(canvas);
                            canvas.restore();
                        } else if (imageViewEmoji.isDefaultReaction && (imageReceiver = imageViewEmoji.imageReceiver) != null) {
                            imageReceiver.setAlpha(1.0f - anonymousClass1.showT);
                            imageViewEmoji.imageReceiver.setImageCoords(rect);
                            imageViewEmoji.imageReceiver.draw(canvas);
                        }
                    }
                    ImageReceiver imageReceiver2 = anonymousClass1.imageReceiver;
                    if (imageReceiver2 != null) {
                        imageReceiver2.setAlpha(anonymousClass1.showT);
                        imageReceiver2.setImageCoords(rect);
                        imageReceiver2.draw(canvas);
                    }
                    break;
                case 22:
                    PeerStoriesView peerStoriesView = (PeerStoriesView) this.this$0;
                    if (peerStoriesView.selfAvatarsContainer.getVisibility() == 0 && peerStoriesView.selfAvatarsContainer.getLayoutParams().width != (x = (int) (((peerStoriesView.selfStatusView.getX() + peerStoriesView.selfStatusView.getMeasuredWidth()) - peerStoriesView.selfAvatarsContainer.getX()) + AndroidUtilities.dp(10.0f)))) {
                        peerStoriesView.selfAvatarsContainer.getLayoutParams().width = x;
                        peerStoriesView.selfAvatarsContainer.invalidate();
                        peerStoriesView.selfAvatarsContainer.requestLayout();
                    }
                    super.dispatchDraw(canvas);
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            switch (this.$r8$classId) {
                case 2:
                    if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                        return super.dispatchKeyEvent(keyEvent);
                    }
                    ContentPreviewViewer contentPreviewViewer = (ContentPreviewViewer) this.this$0;
                    if (contentPreviewViewer.isStickerEditor || contentPreviewViewer.menuVisible) {
                        contentPreviewViewer.closeWithMenu();
                        return true;
                    }
                    contentPreviewViewer.close();
                    return true;
                case 15:
                    keyEvent.getKeyCode();
                    PhotoViewer photoViewer = (PhotoViewer) this.this$0;
                    if (!photoViewer.muteVideo && photoViewer.sendPhotoType != 1 && photoViewer.isCurrentVideo && photoViewer.videoPlayer != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
                        photoViewer.videoPlayer.setVolume(1.0f);
                    }
                    return super.dispatchKeyEvent(keyEvent);
                default:
                    return super.dispatchKeyEvent(keyEvent);
            }
        }

        @Override
        public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) throws Throwable {
            switch (this.$r8$classId) {
                case 15:
                    if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                        return super.dispatchKeyEventPreIme(keyEvent);
                    }
                    PhotoViewer photoViewer = (PhotoViewer) this.this$0;
                    if (photoViewer.textSelectionHelper.isInSelectionMode()) {
                        photoViewer.textSelectionHelper.clear(false);
                    }
                    if (photoViewer.isCaptionOpen()) {
                        photoViewer.closeCaptionEnter(true);
                    } else {
                        if (!ContentPreviewViewer.getInstance().isVisible) {
                            PhotoViewer.getInstance().closePhoto(true, false);
                            return true;
                        }
                        ContentPreviewViewer.getInstance().closeWithMenu();
                    }
                    return false;
                case 18:
                    if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                        return super.dispatchKeyEventPreIme(keyEvent);
                    }
                    ((SecretVoicePlayer) this.this$0).dismiss();
                    return true;
                default:
                    return super.dispatchKeyEventPreIme(keyEvent);
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            MessageObject messageObject;
            switch (this.$r8$classId) {
                case 15:
                    PhotoViewer photoViewer = (PhotoViewer) this.this$0;
                    if (photoViewer.videoPlayerControlVisible && photoViewer.isPlaying) {
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 0) {
                            AndroidUtilities.cancelRunOnUIThread(photoViewer.hideActionBarRunnable);
                        } else if (actionMasked == 1 || actionMasked == 3) {
                            messageObject = photoViewer.currentMessageObject;
                            if (messageObject != null || !messageObject.isSponsored()) {
                                photoViewer.scheduleActionBarHide(3000);
                            }
                        } else if (actionMasked == 5) {
                            AndroidUtilities.cancelRunOnUIThread(photoViewer.hideActionBarRunnable);
                        } else if (actionMasked == 6) {
                            messageObject = photoViewer.currentMessageObject;
                            if (messageObject != null) {
                                photoViewer.scheduleActionBarHide(3000);
                            } else {
                                photoViewer.scheduleActionBarHide(3000);
                            }
                        }
                    }
                    return super.dispatchTouchEvent(motionEvent);
                case 20:
                    if (((StarsIntroActivity) this.this$0).twoButtons) {
                        return false;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                case 23:
                    if (((TONIntroActivity) this.this$0).twoButtons) {
                        return false;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                default:
                    return super.dispatchTouchEvent(motionEvent);
            }
        }

        @Override
        public void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 15:
                    if (!((PhotoViewer) this.this$0).windowViewSkipRender) {
                        super.draw(canvas);
                        break;
                    }
                    break;
                default:
                    super.draw(canvas);
                    break;
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            switch (this.$r8$classId) {
                case 15:
                    try {
                        return super.drawChild(canvas, view, j);
                    } catch (Throwable unused) {
                        return false;
                    }
                case 24:
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    ThemePreviewActivity themePreviewActivity = (ThemePreviewActivity) this.this$0;
                    if (view == ((BaseFragment) themePreviewActivity).actionBar && ((BaseFragment) themePreviewActivity).parentLayout != null) {
                        INavigationLayout iNavigationLayout = ((BaseFragment) themePreviewActivity).parentLayout;
                        int measuredHeight = ((BaseFragment) themePreviewActivity).actionBar.getVisibility() == 0 ? ((BaseFragment) themePreviewActivity).actionBar.getMeasuredHeight() : 0;
                        iNavigationLayout.getClass();
                        ((ActionBarLayout) iNavigationLayout).drawHeaderShadow(canvas, 255, measuredHeight);
                    }
                    return zDrawChild;
                case 25:
                    TopicsFragment topicsFragment = (TopicsFragment) this.this$0;
                    if (view == topicsFragment.searchTabsView && topicsFragment.isInPreviewMode()) {
                        ((ActionBarLayout) topicsFragment.getParentLayout()).drawHeaderShadow(canvas, (int) (topicsFragment.searchAnimationProgress * 255.0f), (int) (topicsFragment.searchTabsView.getY() + topicsFragment.searchTabsView.getMeasuredHeight()));
                    }
                    return super.drawChild(canvas, view, j);
                default:
                    return super.drawChild(canvas, view, j);
            }
        }

        @Override
        public void onAttachedToWindow() {
            switch (this.$r8$classId) {
                case 11:
                    super.onAttachedToWindow();
                    AndroidUtilities.runOnUIThread(((ManageLinksActivity) this.this$0).updateTimerRunnable, 500L);
                    break;
                case 15:
                    super.onAttachedToWindow();
                    PhotoViewer photoViewer = (PhotoViewer) this.this$0;
                    photoViewer.centerImage.onAttachedToWindow();
                    photoViewer.leftImage.onAttachedToWindow();
                    photoViewer.rightImage.onAttachedToWindow();
                    photoViewer.attachedToWindow = true;
                    break;
                case 19:
                    super.onAttachedToWindow();
                    ImageReceiver imageReceiver = ((SelectAnimatedEmojiDialog.AnonymousClass17.AnonymousClass1) this.this$0).imageReceiver;
                    if (imageReceiver != null) {
                        imageReceiver.onAttachedToWindow();
                    }
                    break;
                default:
                    super.onAttachedToWindow();
                    break;
            }
        }

        @Override
        public void onConfigurationChanged(Configuration configuration) {
            switch (this.$r8$classId) {
                case 19:
                    break;
                default:
                    super.onConfigurationChanged(configuration);
                    break;
            }
        }

        @Override
        public void onDetachedFromWindow() {
            switch (this.$r8$classId) {
                case 11:
                    super.onDetachedFromWindow();
                    AndroidUtilities.cancelRunOnUIThread(((ManageLinksActivity) this.this$0).updateTimerRunnable);
                    break;
                case 15:
                    super.onDetachedFromWindow();
                    PhotoViewer photoViewer = (PhotoViewer) this.this$0;
                    photoViewer.centerImage.onDetachedFromWindow();
                    photoViewer.leftImage.onDetachedFromWindow();
                    photoViewer.rightImage.onDetachedFromWindow();
                    photoViewer.attachedToWindow = false;
                    photoViewer.wasLayout = false;
                    break;
                case 19:
                    super.onDetachedFromWindow();
                    ImageReceiver imageReceiver = ((SelectAnimatedEmojiDialog.AnonymousClass17.AnonymousClass1) this.this$0).imageReceiver;
                    if (imageReceiver != null) {
                        imageReceiver.onDetachedFromWindow();
                    }
                    break;
                default:
                    super.onDetachedFromWindow();
                    break;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            Canvas canvas2;
            switch (this.$r8$classId) {
                case 15:
                    PhotoViewer photoViewer = (PhotoViewer) this.this$0;
                    PhotoViewer.AnonymousClass32 anonymousClass32 = photoViewer.stickerMakerBackgroundView;
                    if (anonymousClass32 == null || anonymousClass32.getVisibility() != 0) {
                        canvas2 = canvas;
                    } else {
                        View view = (View) photoViewer.stickerMakerBackgroundView.getParent();
                        float fMin = Math.min(photoViewer.stickerMakerBackgroundView.getAlpha(), view != null ? view.getAlpha() : 1.0f);
                        if (fMin > 0.0f) {
                            canvas2 = canvas;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (fMin * 255.0f), 31);
                            photoViewer.stickerMakerBackgroundView.draw(canvas2);
                            canvas2.restore();
                        } else {
                            canvas2 = canvas;
                        }
                    }
                    if (photoViewer.isVisible) {
                        Paint paint = photoViewer.blackPaint;
                        paint.setAlpha(photoViewer.backgroundDrawable.getAlpha());
                        canvas2.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() + photoViewer.insets.bottom, paint);
                    }
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            switch (this.$r8$classId) {
                case 13:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((PhotoAlbumPickerActivity) this.this$0).selectedPhotos.size(), new Object[0]));
                    accessibilityNodeInfo.setClassName(Button.class.getName());
                    accessibilityNodeInfo.setLongClickable(true);
                    accessibilityNodeInfo.setClickable(true);
                    break;
                case 14:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((PhotoPickerActivity) this.this$0).selectedPhotos.size(), new Object[0]));
                    accessibilityNodeInfo.setClassName(Button.class.getName());
                    accessibilityNodeInfo.setLongClickable(true);
                    accessibilityNodeInfo.setClickable(true);
                    break;
                default:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    break;
            }
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 15:
                    return ((PhotoViewer) this.this$0).isVisible && super.onInterceptTouchEvent(motionEvent);
                case 16:
                    return ((PopupNotificationActivity) this.this$0).checkTransitionAnimation() || ((PopupNotificationActivity) getContext()).onTouchEventMy(motionEvent);
                default:
                    return super.onInterceptTouchEvent(motionEvent);
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            Activity activity;
            switch (this.$r8$classId) {
                case 0:
                    super.onLayout(z, i, i2, i3, i4);
                    LoginActivity loginActivity = (LoginActivity) this.this$0;
                    for (SlideView slideView : loginActivity.views) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) slideView.getLayoutParams();
                        int iDp = AndroidUtilities.dp(16.0f) + getHeight();
                        if (!slideView.hasCustomKeyboard() && loginActivity.keyboardView.getVisibility() == 0) {
                            iDp += AndroidUtilities.dp(230.0f);
                        }
                        slideView.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, iDp);
                    }
                    break;
                case 5:
                    super.onLayout(z, i, i2, i3, i4);
                    GroupCreateActivity groupCreateActivity = (GroupCreateActivity) this.this$0;
                    groupCreateActivity.checkUi_bottomButtons();
                    FragmentFloatingButton fragmentFloatingButton = groupCreateActivity.floatingButton;
                    if (fragmentFloatingButton != null) {
                        fragmentFloatingButton.setTranslationY(-Math.max(groupCreateActivity.navigationBarHeight, groupCreateActivity.imeInsetAnimatedHeight));
                    }
                    FragmentSearchField fragmentSearchField = groupCreateActivity.searchField;
                    FactorAnimator factorAnimator = groupCreateActivity.animatorSelectorContainerHeight;
                    fragmentSearchField.setTranslationY(factorAnimator.factor);
                    groupCreateActivity.checkUi_listClip$1();
                    groupCreateActivity.headerShadowView.setTranslationY(AndroidUtilities.dp(48.0f) + factorAnimator.factor);
                    break;
                case 6:
                    super.onLayout(z, i, i2, i3, i4);
                    IdenticonActivity identiconActivity = (IdenticonActivity) this.this$0;
                    TextView textView = identiconActivity.codeTextView;
                    if (textView != null) {
                        int measuredWidth = ((identiconActivity.codeTextView.getMeasuredWidth() / 2) + textView.getLeft()) - (identiconActivity.emojiTextView.getMeasuredWidth() / 2);
                        int top = (identiconActivity.linearLayout1.getTop() + ((identiconActivity.codeTextView.getMeasuredHeight() - identiconActivity.emojiTextView.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                        TextView textView2 = identiconActivity.emojiTextView;
                        textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, identiconActivity.emojiTextView.getMeasuredHeight() + top);
                    }
                    break;
                case 7:
                    super.onLayout(z, i, i2, i3, i4);
                    InviteContactsActivity inviteContactsActivity = (InviteContactsActivity) this.this$0;
                    FragmentFloatingButton fragmentFloatingButton2 = inviteContactsActivity.floatingButton;
                    if (fragmentFloatingButton2 != null) {
                        fragmentFloatingButton2.setTranslationY(-Math.max(inviteContactsActivity.navigationBarHeight, inviteContactsActivity.imeInsetAnimatedHeight));
                    }
                    inviteContactsActivity.checkUi_searchFieldY$2();
                    break;
                case 10:
                    super.onLayout(z, i, i2, i3, i4);
                    MainTabsActivity mainTabsActivity = (MainTabsActivity) this.this$0;
                    mainTabsActivity.checkUi_tabsPosition();
                    mainTabsActivity.checkUi_fadeView$1();
                    break;
                case 15:
                    PhotoViewer photoViewer = (PhotoViewer) this.this$0;
                    photoViewer.animatingImageView.layout(getPaddingLeft(), 0, photoViewer.animatingImageView.getMeasuredWidth() + getPaddingLeft(), photoViewer.animatingImageView.getMeasuredHeight());
                    photoViewer.containerView.layout(getPaddingLeft(), 0, photoViewer.containerView.getMeasuredWidth() + getPaddingLeft(), photoViewer.containerView.getMeasuredHeight());
                    photoViewer.navigationBar.layout(getPaddingLeft(), photoViewer.containerView.getMeasuredHeight(), photoViewer.navigationBar.getMeasuredWidth(), photoViewer.navigationBar.getMeasuredHeight() + photoViewer.containerView.getMeasuredHeight());
                    photoViewer.wasLayout = true;
                    if (z) {
                        if (!photoViewer.dontResetZoomOnFirstLayout) {
                            float fScale1 = photoViewer.scale1(true);
                            photoViewer.scale = fScale1;
                            photoViewer.translationX = 0.0f;
                            photoViewer.translationY = 0.0f;
                            photoViewer.updateMinMax(fScale1);
                        }
                        CheckBox checkBox = photoViewer.checkImageView;
                        if (checkBox != null) {
                            checkBox.post(new PhotoViewer$$ExternalSyntheticLambda21(this, 23));
                        }
                    }
                    if (photoViewer.dontResetZoomOnFirstLayout) {
                        photoViewer.setScaleToFill();
                        photoViewer.dontResetZoomOnFirstLayout = false;
                    }
                    break;
                case 17:
                    SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.this$0;
                    WindowInsets windowInsets = secretMediaViewer.lastInsets;
                    int systemWindowInsetLeft = windowInsets != null ? windowInsets.getSystemWindowInsetLeft() : 0;
                    IntroActivity.AnonymousClass1 anonymousClass1 = secretMediaViewer.containerView;
                    anonymousClass1.layout(systemWindowInsetLeft, 0, anonymousClass1.getMeasuredWidth() + systemWindowInsetLeft, secretMediaViewer.containerView.getMeasuredHeight());
                    if (z) {
                        if (secretMediaViewer.imageMoveAnimation == null) {
                            secretMediaViewer.scale = 1.0f;
                            secretMediaViewer.translationX = 0.0f;
                            secretMediaViewer.translationY = 0.0f;
                        }
                        secretMediaViewer.updateMinMax$1(secretMediaViewer.scale);
                    }
                    break;
                case 18:
                    super.onLayout(z, i, i2, i3, i4);
                    ((SecretVoicePlayer) this.this$0).setupTranslation();
                    break;
                case 19:
                    super.onLayout(z, i, i2, i3, i4);
                    SelectAnimatedEmojiDialog.AnonymousClass17.AnonymousClass1 anonymousClass2 = (SelectAnimatedEmojiDialog.AnonymousClass17.AnonymousClass1) this.this$0;
                    Context context = anonymousClass2.getContext();
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            activity = null;
                        } else if (context instanceof Activity) {
                            activity = (Activity) context;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                    if (activity != null) {
                        View decorView = activity.getWindow().getDecorView();
                        Bitmap bitmap = anonymousClass2.blurBitmap;
                        if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || anonymousClass2.blurBitmap.getHeight() != decorView.getMeasuredHeight()) {
                            anonymousClass2.prepareBlurBitmap();
                        }
                        break;
                    }
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    super.onMeasure(i, i2);
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    LoginActivity loginActivity = (LoginActivity) this.this$0;
                    for (SlideView slideView : loginActivity.views) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) slideView.getLayoutParams();
                        int iDp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                        if (!slideView.hasCustomKeyboard() && loginActivity.keyboardView.getVisibility() == 0) {
                            iDp += AndroidUtilities.dp(230.0f);
                        }
                        slideView.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
                    }
                    break;
                case 3:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
                    break;
                case 4:
                    super.onMeasure(i, i2);
                    ((GiftSheet.GiftCell) this.this$0).priceBackground.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    break;
                case 5:
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i2);
                    boolean zIsTablet = AndroidUtilities.isTablet();
                    GroupCreateActivity groupCreateActivity = (GroupCreateActivity) this.this$0;
                    if (zIsTablet || size2 > size) {
                        groupCreateActivity.maxSize = AndroidUtilities.dp(144.0f);
                    } else {
                        groupCreateActivity.maxSize = AndroidUtilities.dp(56.0f);
                    }
                    measureChildWithMargins(((BaseFragment) groupCreateActivity).actionBar, i, 0, i2, 0);
                    ((ViewGroup.MarginLayoutParams) groupCreateActivity.emptyView.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + ((BaseFragment) groupCreateActivity).actionBar.getMeasuredHeight();
                    ((ViewGroup.MarginLayoutParams) groupCreateActivity.headerShadowView.getLayoutParams()).topMargin = ((BaseFragment) groupCreateActivity).actionBar.getMeasuredHeight();
                    ((ViewGroup.MarginLayoutParams) groupCreateActivity.searchField.getLayoutParams()).topMargin = ((BaseFragment) groupCreateActivity).actionBar.getMeasuredHeight();
                    ((ViewGroup.MarginLayoutParams) groupCreateActivity.spansContainer.getLayoutParams()).topMargin = ((BaseFragment) groupCreateActivity).actionBar.getMeasuredHeight();
                    groupCreateActivity.spansContainer.getLayoutParams().height = groupCreateActivity.maxSize;
                    ((ViewGroup.MarginLayoutParams) groupCreateActivity.actionBarBackgroundView.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + ((BaseFragment) groupCreateActivity).actionBar.getMeasuredHeight() + groupCreateActivity.maxSize;
                    groupCreateActivity.checkUi_listViewPadding$3();
                    super.onMeasure(i, i2);
                    break;
                case 7:
                    int size3 = View.MeasureSpec.getSize(i);
                    int size4 = View.MeasureSpec.getSize(i2);
                    boolean zIsTablet2 = AndroidUtilities.isTablet();
                    InviteContactsActivity inviteContactsActivity = (InviteContactsActivity) this.this$0;
                    if (zIsTablet2 || size4 > size3) {
                        inviteContactsActivity.maxSize = AndroidUtilities.dp(144.0f);
                    } else {
                        inviteContactsActivity.maxSize = AndroidUtilities.dp(56.0f);
                    }
                    measureChildWithMargins(((BaseFragment) inviteContactsActivity).actionBar, i, 0, i2, 0);
                    ((ViewGroup.MarginLayoutParams) inviteContactsActivity.emptyView.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + ((BaseFragment) inviteContactsActivity).actionBar.getMeasuredHeight();
                    inviteContactsActivity.searchField.getLayoutParams().height = AndroidUtilities.dp(18.0f) + inviteContactsActivity.maxSize;
                    inviteContactsActivity.checkUi_listViewPadding$4();
                    super.onMeasure(i, i2);
                    break;
                case 9:
                    super.onMeasure(i, i2);
                    LocationActivity.MapOverlayView mapOverlayView = ((LocationActivity) this.this$0).overlayView;
                    if (mapOverlayView != null) {
                        mapOverlayView.updatePositions();
                    }
                    break;
                case 12:
                    PeerColorActivity peerColorActivity = (PeerColorActivity) this.this$0;
                    FrameLayout frameLayout = peerColorActivity.actionBarContainer;
                    if (frameLayout != null) {
                        ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = ActionBar.getCurrentActionBarHeight();
                        ((ViewGroup.MarginLayoutParams) peerColorActivity.actionBarContainer.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                    }
                    super.onMeasure(i, i2);
                    break;
                case 15:
                    int size5 = View.MeasureSpec.getSize(i);
                    int size6 = View.MeasureSpec.getSize(i2);
                    PhotoViewer photoViewer = (PhotoViewer) this.this$0;
                    if (!photoViewer.inBubbleMode && AndroidUtilities.incorrectDisplaySizeFix) {
                        int i3 = AndroidUtilities.displaySize.y;
                        if (size6 > i3) {
                            size6 = i3;
                        }
                        size6 += AndroidUtilities.statusBarHeight;
                    }
                    setMeasuredDimension(size5, size6);
                    int i4 = size6 - photoViewer.insets.bottom;
                    int paddingRight = size5 - (getPaddingRight() + getPaddingLeft());
                    int paddingBottom = i4 - getPaddingBottom();
                    ViewGroup.LayoutParams layoutParams = photoViewer.animatingImageView.getLayoutParams();
                    photoViewer.animatingImageView.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(layoutParams.height, Integer.MIN_VALUE));
                    photoViewer.containerView.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
                    photoViewer.navigationBar.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(photoViewer.navigationBarHeight, 1073741824));
                    break;
                case 17:
                    int size7 = View.MeasureSpec.getSize(i);
                    int size8 = View.MeasureSpec.getSize(i2);
                    SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.this$0;
                    WindowInsets windowInsets = secretMediaViewer.lastInsets;
                    if (windowInsets != null) {
                        if (AndroidUtilities.incorrectDisplaySizeFix) {
                            int i5 = AndroidUtilities.displaySize.y;
                            if (size8 > i5) {
                                size8 = i5;
                            }
                            size8 += AndroidUtilities.statusBarHeight;
                        }
                        size8 -= windowInsets.getSystemWindowInsetBottom();
                        size7 -= windowInsets.getSystemWindowInsetRight();
                    } else {
                        int i6 = AndroidUtilities.displaySize.y;
                        if (size8 > i6) {
                            size8 = i6;
                        }
                    }
                    setMeasuredDimension(size7, size8);
                    WindowInsets windowInsets2 = secretMediaViewer.lastInsets;
                    if (windowInsets2 != null) {
                        size7 -= windowInsets2.getSystemWindowInsetLeft();
                    }
                    secretMediaViewer.containerView.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                    break;
                case 19:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
                    break;
                case 24:
                    int size9 = View.MeasureSpec.getSize(i);
                    int size10 = View.MeasureSpec.getSize(i2);
                    setMeasuredDimension(size9, size10);
                    ThemePreviewActivity themePreviewActivity = (ThemePreviewActivity) this.this$0;
                    measureChildWithMargins(((BaseFragment) themePreviewActivity).actionBar, i, 0, i2, 0);
                    int measuredHeight2 = ((BaseFragment) themePreviewActivity).actionBar.getMeasuredHeight();
                    if (((BaseFragment) themePreviewActivity).actionBar.getVisibility() == 0) {
                        size10 -= measuredHeight2;
                    }
                    ((FrameLayout.LayoutParams) themePreviewActivity.listView.getLayoutParams()).topMargin = measuredHeight2;
                    themePreviewActivity.listView.measure(View.MeasureSpec.makeMeasureSpec(size9, 1073741824), View.MeasureSpec.makeMeasureSpec(size10, 1073741824));
                    measureChildWithMargins(themePreviewActivity.floatingButton, i, 0, i2, 0);
                    break;
                case 26:
                    super.onMeasure(i, i2);
                    ((ViewGroup.MarginLayoutParams) ((TwoStepVerificationSetupActivity) this.this$0).radialProgressView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 2:
                    super.onSizeChanged(i, i2, i3, i4);
                    ContentPreviewViewer contentPreviewViewer = (ContentPreviewViewer) this.this$0;
                    Blur3Utils.checkBitmapSourceMatrixScale(contentPreviewViewer.scrimBlur3SourceBitmap, contentPreviewViewer.windowView);
                    contentPreviewViewer.scrimBlur3Factory.invalidateAllLinkedViews();
                    break;
                default:
                    super.onSizeChanged(i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 1:
                    ((VoIPFragment.AnonymousClass24) this.this$0).scrollGestureDetector.onTouchEvent(motionEvent);
                    return super.onTouchEvent(motionEvent);
                case 15:
                    PhotoViewer photoViewer = (PhotoViewer) this.this$0;
                    return photoViewer.isVisible && PhotoViewer.access$1000(photoViewer, motionEvent);
                case 16:
                    return ((PopupNotificationActivity) this.this$0).checkTransitionAnimation() || ((PopupNotificationActivity) getContext()).onTouchEventMy(motionEvent);
                default:
                    return super.onTouchEvent(motionEvent);
            }
        }

        @Override
        public void requestDisallowInterceptTouchEvent(boolean z) {
            switch (this.$r8$classId) {
                case 16:
                    ((PopupNotificationActivity) getContext()).onTouchEventMy(null);
                    super.requestDisallowInterceptTouchEvent(z);
                    break;
                default:
                    super.requestDisallowInterceptTouchEvent(z);
                    break;
            }
        }

        @Override
        public void requestLayout() {
            switch (this.$r8$classId) {
                case 15:
                    super.requestLayout();
                    AndroidUtilities.printStackTrace("requestLayout");
                    break;
                default:
                    super.requestLayout();
                    break;
            }
        }

        public AnonymousClass4(Context context, String str, DarkThemeResourceProvider darkThemeResourceProvider) {
            super(context);
            this.$r8$classId = 21;
            int iDp = AndroidUtilities.dp(12.0f);
            int i = Theme.key_dialogTextBlack;
            setBackground(Theme.createRoundRectDrawable(iDp, Theme.multAlpha(0.06f, darkThemeResourceProvider.getColor(i))));
            LinearLayout linearLayoutM = zzkf.m(context, 1);
            addView(linearLayoutM, LayoutHelper.createFrame(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
            AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, true);
            this.this$0 = animatedTextView;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = animatedTextView.drawable;
            animatedTextDrawable.moveAmplitude = 0.6f;
            animatedTextDrawable.animateDuration = 450L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            animatedTextView.setTextSize(AndroidUtilities.dp(17.0f));
            animatedTextView.setTextColor(darkThemeResourceProvider.getColor(i));
            animatedTextView.setScaleProperty(0.7f);
            animatedTextView.setGravity(17);
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setAllowCancel(true);
            linearLayoutM.addView(animatedTextView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(darkThemeResourceProvider.getColor(i));
            textView.setGravity(17);
            linearLayoutM.addView(textView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            textView.setText(str);
        }

        public AnonymousClass4(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.$r8$classId = 27;
            WebActionBar.AnonymousClass4 anonymousClass4 = new WebActionBar.AnonymousClass4(context, 4);
            this.this$0 = anonymousClass4;
            anonymousClass4.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            anonymousClass4.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            anonymousClass4.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
            anonymousClass4.setTextSize(1, 16.0f);
            anonymousClass4.setMaxLines(Integer.MAX_VALUE);
            anonymousClass4.setBackground(null);
            anonymousClass4.setImeOptions(anonymousClass4.getImeOptions() | 268435456);
            anonymousClass4.setInputType(anonymousClass4.getInputType() | 16384);
            anonymousClass4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            anonymousClass4.setMinHeight(AndroidUtilities.dp(50.0f));
            addView(anonymousClass4, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        }

        private final void onConfigurationChanged$org$telegram$ui$SelectAnimatedEmojiDialog$SelectStatusDurationDialog$ContentView(Configuration configuration) {
        }

        public AnonymousClass4(Context context, ThemePreviewActivity themePreviewActivity) {
            super(context);
            this.$r8$classId = 24;
            this.this$0 = themePreviewActivity;
        }
    }

    public final class AnonymousClass7 implements TextWatcher {
        public final int $r8$classId;
        public Object val$editText;
        public final Object val$timeoutCallbackRef;

        public AnonymousClass7(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.val$timeoutCallbackRef = obj;
            this.val$editText = obj2;
        }

        @Override
        public final void afterTextChanged(Editable editable) {
            RecyclerView.ViewHolder childViewHolder;
            Object obj = this.val$timeoutCallbackRef;
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 1:
                    ChatAttachAlertPollLayout.ListAdapter.AnonymousClass3 anonymousClass3 = (ChatAttachAlertPollLayout.ListAdapter.AnonymousClass3) this.val$editText;
                    if (anonymousClass3.getTag() == null) {
                        ChatAttachAlertPollLayout.ListAdapter listAdapter = (ChatAttachAlertPollLayout.ListAdapter) obj;
                        ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = chatAttachAlertPollLayout.listView.findViewHolderForAdapterPosition(chatAttachAlertPollLayout.solutionRow);
                        if (viewHolderFindViewHolderForAdapterPosition != null && ChatAttachAlertPollLayout.this.suggestEmojiPanel != null) {
                            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan);
                            }
                            Emoji.replaceEmoji(editable, anonymousClass3.getEditField().getPaint().getFontMetricsInt(), false);
                            ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDirection(1);
                            ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDelegate(anonymousClass3);
                            ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(viewHolderFindViewHolderForAdapterPosition.itemView.getY());
                            ChatAttachAlertPollLayout.this.suggestEmojiPanel.fireUpdate();
                        }
                        ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = ChatAttachAlertPollLayout.this;
                        chatAttachAlertPollLayout2.solutionString = editable;
                        if (viewHolderFindViewHolderForAdapterPosition != null) {
                            ChatAttachAlertPollLayout.access$5700(chatAttachAlertPollLayout2, viewHolderFindViewHolderForAdapterPosition.itemView, chatAttachAlertPollLayout2.solutionRow);
                        }
                        ChatAttachAlertPollLayout.this.checkDoneButton$1();
                        break;
                    }
                    break;
                case 2:
                    ChatAttachAlertPollLayout.ListAdapter listAdapter2 = (ChatAttachAlertPollLayout.ListAdapter) obj;
                    MessageSeenView.AnonymousClass1 anonymousClass1 = ChatAttachAlertPollLayout.this.listView;
                    ChatAttachAlertPollLayout.ListAdapter.AnonymousClass6 anonymousClass6 = (ChatAttachAlertPollLayout.ListAdapter.AnonymousClass6) this.val$editText;
                    View viewFindContainingItemView = anonymousClass1.findContainingItemView(anonymousClass6);
                    childViewHolder = viewFindContainingItemView != null ? anonymousClass1.getChildViewHolder(viewFindContainingItemView) : null;
                    if (childViewHolder != null) {
                        int adapterPosition = childViewHolder.getAdapterPosition();
                        ChatAttachAlertPollLayout chatAttachAlertPollLayout3 = ChatAttachAlertPollLayout.this;
                        int i = adapterPosition - chatAttachAlertPollLayout3.answerStartRow;
                        if (i >= 0 && i < chatAttachAlertPollLayout3.answers.length) {
                            if (chatAttachAlertPollLayout3.suggestEmojiPanel != null) {
                                for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                    editable.removeSpan(imageSpan2);
                                }
                                Emoji.replaceEmoji(editable, anonymousClass6.getEditField().getPaint().getFontMetricsInt(), false);
                                View view = childViewHolder.itemView;
                                float y = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                                if (y > 0.0f) {
                                    ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDirection(0);
                                    ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(y);
                                } else {
                                    ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDirection(1);
                                    ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(view.getY());
                                }
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDelegate(anonymousClass6);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.fireUpdate();
                            }
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout4 = ChatAttachAlertPollLayout.this;
                            chatAttachAlertPollLayout4.answers[i] = editable;
                            ChatAttachAlertPollLayout.access$5700(chatAttachAlertPollLayout4, anonymousClass6, adapterPosition);
                            ChatAttachAlertPollLayout.this.checkDoneButton$1();
                            break;
                        }
                    }
                    break;
                case 3:
                    ColorPickerBottomSheet.SliderCell sliderCell = (ColorPickerBottomSheet.SliderCell) obj;
                    if (!sliderCell.isInvalidatingColor && ((String) this.val$editText) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.val$editText).toString(), editable.toString())) {
                        int iClamp = MathUtils.clamp(Integer.parseInt(editable.toString()), 0, 255);
                        int i2 = sliderCell.mode;
                        ColorPickerBottomSheet colorPickerBottomSheet = ColorPickerBottomSheet.this;
                        int iArgb = i2 != 1 ? i2 != 2 ? Color.argb(Color.alpha(colorPickerBottomSheet.mColor), iClamp, Color.green(colorPickerBottomSheet.mColor), Color.blue(colorPickerBottomSheet.mColor)) : Color.argb(Color.alpha(colorPickerBottomSheet.mColor), Color.red(colorPickerBottomSheet.mColor), Color.green(colorPickerBottomSheet.mColor), iClamp) : Color.argb(Color.alpha(colorPickerBottomSheet.mColor), Color.red(colorPickerBottomSheet.mColor), iClamp, Color.blue(colorPickerBottomSheet.mColor));
                        int i3 = ColorPickerBottomSheet.$r8$clinit;
                        colorPickerBottomSheet.onSetColor(iArgb, 5);
                    }
                    break;
                case 4:
                    ((String[]) this.val$editText)[0] = editable.toString();
                    ((ResaleGiftsFragment.AnonymousClass9) obj).adapter.update(true);
                    break;
                case 5:
                    ((String[]) this.val$editText)[0] = editable.toString();
                    ((ResaleGiftsFragment.AnonymousClass5) obj).adapter.update(true);
                    break;
                case 6:
                    ((String[]) this.val$editText)[0] = editable.toString();
                    ((ResaleGiftsFragment.AnonymousClass7) obj).adapter.update(true);
                    break;
                case 7:
                    ((String[]) this.val$editText)[0] = editable.toString();
                    ((ResaleGiftsFragment.SelectGiftSheet.AnonymousClass1) obj).adapter.update(true);
                    break;
                case 8:
                    ((String[]) this.val$editText)[0] = editable.toString();
                    ((ResaleGiftsFragment.SelectGiftSheet.AnonymousClass3) obj).adapter.update(true);
                    break;
                case 9:
                    ((String[]) this.val$editText)[0] = editable.toString();
                    ((ResaleGiftsFragment.SelectGiftSheet.AnonymousClass5) obj).adapter.update(true);
                    break;
                case 10:
                    PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                    if (passcodeActivity.type == 1 && passcodeActivity.passcodeSetStep == 0) {
                        if (TextUtils.isEmpty(editable) && passcodeActivity.passwordButton.getVisibility() != 8) {
                            if (((AtomicBoolean) this.val$editText).get()) {
                                passcodeActivity.passwordButton.callOnClick();
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.passwordButton, false, 0.1f, true);
                            break;
                        } else if (!TextUtils.isEmpty(editable) && passcodeActivity.passwordButton.getVisibility() != 0) {
                            AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.passwordButton, true, 0.1f, true);
                            break;
                        }
                    }
                    break;
                case 11:
                    PollCreateActivity.ListAdapter.AnonymousClass1 anonymousClass2 = (PollCreateActivity.ListAdapter.AnonymousClass1) this.val$editText;
                    if (anonymousClass2.getTag() == null) {
                        PollCreateActivity.ListAdapter listAdapter3 = (PollCreateActivity.ListAdapter) obj;
                        PollCreateActivity pollCreateActivity = PollCreateActivity.this;
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = pollCreateActivity.listView.findViewHolderForAdapterPosition(pollCreateActivity.questionRow);
                        if (viewHolderFindViewHolderForAdapterPosition2 != null && PollCreateActivity.this.suggestEmojiPanel != null) {
                            for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan3);
                            }
                            Emoji.replaceEmoji(editable, anonymousClass2.getEditField().getPaint().getFontMetricsInt(), false);
                            PollCreateActivity.this.suggestEmojiPanel.setDirection(1);
                            PollCreateActivity.this.suggestEmojiPanel.setDelegate(anonymousClass2);
                            PollCreateActivity.this.suggestEmojiPanel.setTranslationY(viewHolderFindViewHolderForAdapterPosition2.itemView.getY());
                            PollCreateActivity.this.suggestEmojiPanel.fireUpdate();
                        }
                        PollCreateActivity pollCreateActivity2 = PollCreateActivity.this;
                        pollCreateActivity2.questionString = editable;
                        if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                            PollCreateActivity.access$5500(pollCreateActivity2, viewHolderFindViewHolderForAdapterPosition2.itemView, pollCreateActivity2.questionRow);
                        }
                        PollCreateActivity.this.checkDoneButton$2();
                        break;
                    }
                    break;
                case 12:
                    PollCreateActivity.ListAdapter.AnonymousClass3 anonymousClass4 = (PollCreateActivity.ListAdapter.AnonymousClass3) this.val$editText;
                    if (anonymousClass4.getTag() == null) {
                        PollCreateActivity.ListAdapter listAdapter4 = (PollCreateActivity.ListAdapter) obj;
                        PollCreateActivity pollCreateActivity3 = PollCreateActivity.this;
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition3 = pollCreateActivity3.listView.findViewHolderForAdapterPosition(pollCreateActivity3.questionRow);
                        if (viewHolderFindViewHolderForAdapterPosition3 != null && PollCreateActivity.this.suggestEmojiPanel != null) {
                            for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan4);
                            }
                            Emoji.replaceEmoji(editable, anonymousClass4.getEditField().getPaint().getFontMetricsInt(), false);
                            PollCreateActivity.this.suggestEmojiPanel.setDirection(1);
                            PollCreateActivity.this.suggestEmojiPanel.setDelegate(anonymousClass4);
                            PollCreateActivity.this.suggestEmojiPanel.setTranslationY(viewHolderFindViewHolderForAdapterPosition3.itemView.getY());
                            PollCreateActivity.this.suggestEmojiPanel.fireUpdate();
                        }
                        PollCreateActivity pollCreateActivity4 = PollCreateActivity.this;
                        pollCreateActivity4.solutionString = editable;
                        if (viewHolderFindViewHolderForAdapterPosition3 != null) {
                            PollCreateActivity.access$5500(pollCreateActivity4, viewHolderFindViewHolderForAdapterPosition3.itemView, pollCreateActivity4.solutionRow);
                        }
                        PollCreateActivity.this.checkDoneButton$2();
                        break;
                    }
                    break;
                default:
                    PollCreateActivity.ListAdapter listAdapter5 = (PollCreateActivity.ListAdapter) obj;
                    MessageSeenView.AnonymousClass1 anonymousClass5 = PollCreateActivity.this.listView;
                    PollCreateActivity.ListAdapter.AnonymousClass5 anonymousClass7 = (PollCreateActivity.ListAdapter.AnonymousClass5) this.val$editText;
                    View viewFindContainingItemView2 = anonymousClass5.findContainingItemView(anonymousClass7);
                    childViewHolder = viewFindContainingItemView2 != null ? anonymousClass5.getChildViewHolder(viewFindContainingItemView2) : null;
                    if (childViewHolder != null) {
                        int adapterPosition2 = childViewHolder.getAdapterPosition();
                        PollCreateActivity pollCreateActivity5 = PollCreateActivity.this;
                        int i4 = adapterPosition2 - pollCreateActivity5.answerStartRow;
                        if (i4 >= 0 && i4 < pollCreateActivity5.answers.length) {
                            if (pollCreateActivity5.suggestEmojiPanel != null) {
                                for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                    editable.removeSpan(imageSpan5);
                                }
                                Emoji.replaceEmoji(editable, anonymousClass7.getEditField().getPaint().getFontMetricsInt(), false);
                                View view2 = childViewHolder.itemView;
                                float y2 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                                if (y2 > 0.0f) {
                                    PollCreateActivity.this.suggestEmojiPanel.setDirection(0);
                                    PollCreateActivity.this.suggestEmojiPanel.setTranslationY(y2);
                                } else {
                                    PollCreateActivity.this.suggestEmojiPanel.setDirection(1);
                                    PollCreateActivity.this.suggestEmojiPanel.setTranslationY(view2.getY());
                                }
                                PollCreateActivity.this.suggestEmojiPanel.setDelegate(anonymousClass7);
                                PollCreateActivity.this.suggestEmojiPanel.fireUpdate();
                            }
                            PollCreateActivity pollCreateActivity6 = PollCreateActivity.this;
                            pollCreateActivity6.answers[i4] = editable;
                            PollCreateActivity.access$5500(pollCreateActivity6, anonymousClass7, i4);
                            PollCreateActivity.this.checkDoneButton$2();
                            break;
                        }
                    }
                    break;
            }
        }

        @Override
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            switch (this.$r8$classId) {
                case 0:
                    AtomicReference atomicReference = (AtomicReference) this.val$timeoutCallbackRef;
                    EditText editText = (EditText) this.val$editText;
                    editText.post(new LinkManager$$ExternalSyntheticLambda21(this, editText, atomicReference, 11));
                    break;
                case 3:
                    this.val$editText = charSequence.toString();
                    break;
            }
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = this.$r8$classId;
        }

        public AnonymousClass7(Object obj, Object obj2, boolean z, int i) {
            this.$r8$classId = i;
            this.val$editText = obj;
            this.val$timeoutCallbackRef = obj2;
        }

        public AnonymousClass7(ColorPickerBottomSheet.SliderCell sliderCell) {
            this.$r8$classId = 3;
            this.val$timeoutCallbackRef = sliderCell;
        }

        private final void afterTextChanged$org$telegram$ui$LoginActivity$7(Editable editable) {
        }

        private final void beforeTextChanged$org$telegram$ui$Components$ChatAttachAlertPollLayout$ListAdapter$4(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Components$ChatAttachAlertPollLayout$ListAdapter$7(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$10(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$6(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$8(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$SelectGiftSheet$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$SelectGiftSheet$4(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$SelectGiftSheet$6(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$PasscodeActivity$5(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$PollCreateActivity$ListAdapter$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$PollCreateActivity$ListAdapter$4(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$PollCreateActivity$ListAdapter$6(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Components$ChatAttachAlertPollLayout$ListAdapter$4(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Components$ChatAttachAlertPollLayout$ListAdapter$7(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Components$Paint$ColorPickerBottomSheet$SliderCell$1(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$10(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$6(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$8(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$SelectGiftSheet$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$SelectGiftSheet$4(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$SelectGiftSheet$6(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$LoginActivity$7(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$PasscodeActivity$5(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$PollCreateActivity$ListAdapter$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$PollCreateActivity$ListAdapter$4(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$PollCreateActivity$ListAdapter$6(int i, int i2, int i3, CharSequence charSequence) {
        }
    }

    public final class AnonymousClass8 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Object this$0;
        public boolean val$floating;
        public final boolean val$show;

        public AnonymousClass8(Object obj, boolean z, boolean z2, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$floating = z;
            this.val$show = z2;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    LoginActivity loginActivity = (LoginActivity) this.this$0;
                    AnimatorSet[] animatorSetArr = loginActivity.showDoneAnimation;
                    boolean z = this.val$floating;
                    AnimatorSet animatorSet = animatorSetArr[!z ? 1 : 0];
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        loginActivity.showDoneAnimation[!z ? 1 : 0] = null;
                        break;
                    }
                    break;
                case 1:
                case 3:
                default:
                    super.onAnimationCancel(animator);
                    break;
                case 2:
                    this.val$floating = true;
                    ActionBarLayout actionBarLayout = (ActionBarLayout) this.this$0;
                    actionBarLayout.predictiveBackInProgress = false;
                    actionBarLayout.containerView.setAlpha(1.0f);
                    ActionBarLayout.access$1300(actionBarLayout, true);
                    actionBarLayout.backAnimator = null;
                    break;
                case 4:
                    ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.this$0;
                    if (animator.equals(chatAttachAlert.commentsAnimator)) {
                        chatAttachAlert.commentsAnimator = null;
                    }
                    break;
                case 5:
                    ((MediaActivity.AnonymousClass6) this.this$0).actionModeAnimation = null;
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            ChatAttachAlert.AttachAlertLayout attachAlertLayout;
            ActionBarMenuItem actionBarMenuItem;
            switch (this.$r8$classId) {
                case 0:
                    LoginActivity loginActivity = (LoginActivity) this.this$0;
                    AnimatorSet[] animatorSetArr = loginActivity.showDoneAnimation;
                    boolean z = this.val$floating;
                    AnimatorSet animatorSet = animatorSetArr[!z ? 1 : 0];
                    if (animatorSet != null && animatorSet.equals(animator) && !this.val$show && z && loginActivity.floatingButtonIcon.getAlpha() != 1.0f) {
                        loginActivity.floatingButtonIcon.setAlpha(1.0f);
                        loginActivity.floatingButtonIcon.setScaleX(1.0f);
                        loginActivity.floatingButtonIcon.setScaleY(1.0f);
                        loginActivity.floatingButtonIcon.setVisibility(0);
                        break;
                    }
                    break;
                case 1:
                    ActionBar actionBar = (ActionBar) this.this$0;
                    SimpleTextView simpleTextView = actionBar.titleTextView[1];
                    if (simpleTextView != null && simpleTextView.getParent() != null) {
                        ((ViewGroup) actionBar.titleTextView[1].getParent()).removeView(actionBar.titleTextView[1]);
                    }
                    actionBar.titleTextView[1] = null;
                    actionBar.titleAnimationRunning = false;
                    if (this.val$floating && this.val$show) {
                        actionBar.subtitleTextView.setVisibility(8);
                    }
                    actionBar.requestLayout();
                    break;
                case 2:
                    if (!this.val$floating) {
                        ActionBarLayout actionBarLayout = (ActionBarLayout) this.this$0;
                        actionBarLayout.predictiveBackInProgress = false;
                        actionBarLayout.containerView.setAlpha(1.0f);
                        ActionBarLayout.access$1300(actionBarLayout, this.val$show);
                        actionBarLayout.backAnimator = null;
                        break;
                    }
                    break;
                case 3:
                    AvatarConstructorFragment avatarConstructorFragment = (AvatarConstructorFragment) this.this$0;
                    avatarConstructorFragment.expandAnimator = null;
                    boolean z2 = this.val$floating;
                    avatarConstructorFragment.setProgressToExpand(z2 ? 1.0f : 0.0f, false);
                    if (this.val$show) {
                        AvatarConstructorFragment.AnonymousClass5 anonymousClass5 = avatarConstructorFragment.previewView;
                        anonymousClass5.overrideExpandProgress = -1.0f;
                        anonymousClass5.setExpanded(z2);
                    }
                    break;
                case 4:
                    ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.this$0;
                    if (animator.equals(chatAttachAlert.commentsAnimator)) {
                        boolean z3 = this.val$floating;
                        if (!z3) {
                            if (!chatAttachAlert.isSoundPicker) {
                                chatAttachAlert.frameLayout2.setVisibility(4);
                            }
                            chatAttachAlert.writeButtonContainer.setVisibility(4);
                        } else if (chatAttachAlert.typeButtonsAvailable && ((attachAlertLayout = chatAttachAlert.currentAttachLayout) == null || attachAlertLayout.shouldHideBottomButtons())) {
                            chatAttachAlert.buttonsRecyclerViewWrapper.setVisibility(4);
                        }
                        if (this.val$show) {
                            chatAttachAlert.updatedTopCaptionHeight();
                            chatAttachAlert.topCommentContainer.setVisibility(z3 ? 0 : 8);
                        }
                        chatAttachAlert.commentsAnimator = null;
                    }
                    break;
                default:
                    MediaActivity.AnonymousClass6 anonymousClass6 = (MediaActivity.AnonymousClass6) this.this$0;
                    if (anonymousClass6.actionModeAnimation != null) {
                        anonymousClass6.actionModeAnimation = null;
                        MediaActivity mediaActivity = MediaActivity.this;
                        if (this.val$floating) {
                            mediaActivity.titlesContainer.setVisibility(4);
                            ActionBarMenuItem actionBarMenuItem2 = mediaActivity.optionsItem;
                            if (actionBarMenuItem2 != null) {
                                actionBarMenuItem2.setVisibility(8);
                            }
                            break;
                        } else {
                            mediaActivity.selectedTextView.setVisibility(4);
                            FrameLayout frameLayout = mediaActivity.buttonContainer;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(4);
                            }
                            ActionBarMenuItem actionBarMenuItem3 = mediaActivity.deleteItem;
                            if (actionBarMenuItem3 != null) {
                                actionBarMenuItem3.setVisibility(8);
                            }
                            if (this.val$show && (actionBarMenuItem = mediaActivity.optionsItem) != null) {
                                actionBarMenuItem.setVisibility(8);
                                break;
                            }
                        }
                    }
                    break;
            }
        }

        public AnonymousClass8(ActionBarLayout actionBarLayout, boolean z) {
            this.$r8$classId = 2;
            this.this$0 = actionBarLayout;
            this.val$show = z;
        }
    }

    public final class AnonymousClass9 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Object this$0;
        public final boolean val$show;

        public AnonymousClass9(int i, Object obj, boolean z) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$show = z;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 3:
                    PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.this$0;
                    if (animator.equals(pipRoundVideoView.hideShowAnimation)) {
                        pipRoundVideoView.hideShowAnimation = null;
                    }
                    break;
                case 8:
                    ((SharedMediaLayout) this.this$0).actionModeAnimation = null;
                    break;
                case 9:
                    ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) this.this$0;
                    AnimatorSet animatorSet = editorAlert.shadowAnimation[0];
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        editorAlert.shadowAnimation[0] = null;
                        break;
                    }
                    break;
                case 13:
                    UpdateAppAlertDialog updateAppAlertDialog = (UpdateAppAlertDialog) this.this$0;
                    AnimatorSet animatorSet2 = updateAppAlertDialog.shadowAnimation;
                    if (animatorSet2 != null && animatorSet2.equals(animator)) {
                        updateAppAlertDialog.shadowAnimation = null;
                        break;
                    }
                    break;
                case 14:
                    UsersAlertBase usersAlertBase = (UsersAlertBase) this.this$0;
                    AnimatorSet animatorSet3 = usersAlertBase.shadowAnimation;
                    if (animatorSet3 != null && animatorSet3.equals(animator)) {
                        usersAlertBase.shadowAnimation = null;
                        break;
                    }
                    break;
                case 16:
                    ((ContactAddActivity) this.this$0).avatarAnimation = null;
                    break;
                case 20:
                    ((GroupCreateFinalActivity) this.this$0).avatarAnimation = null;
                    break;
                case 22:
                    PhotoPickerActivity photoPickerActivity = (PhotoPickerActivity) this.this$0;
                    if (animator.equals(photoPickerActivity.animatorSet)) {
                        photoPickerActivity.animatorSet = null;
                    }
                    break;
                case 28:
                    ((SettingsActivity) this.this$0).avatarAnimation = null;
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            Drawable[] drawableArr;
            Drawable drawable;
            RadialProgressView radialProgressView;
            ChannelCreateActivity.AnonymousClass5 anonymousClass5;
            ProfileActivity.AnonymousClass22 anonymousClass22;
            switch (this.$r8$classId) {
                case 0:
                    boolean z = this.val$show;
                    LoginActivity loginActivity = (LoginActivity) this.this$0;
                    if (!z) {
                        loginActivity.radialProgressView.setVisibility(4);
                    }
                    AnimatorSet animatorSet = loginActivity.doneItemAnimation;
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        loginActivity.doneItemAnimation = null;
                        break;
                    }
                    break;
                case 1:
                    PipettePickerView pipettePickerView = (PipettePickerView) this.this$0;
                    ColorPickerBottomSheet.this.pipetteDelegate.onStopColorPipette();
                    if (this.val$show) {
                        pipettePickerView.colorListener.accept(Integer.valueOf(pipettePickerView.mColor));
                    }
                    if (pipettePickerView.getParent() != null) {
                        ((ViewGroup) pipettePickerView.getParent()).removeView(pipettePickerView);
                    }
                    break;
                case 2:
                    float f = this.val$show ? 1.0f : 0.0f;
                    PasscodeView passcodeView = (PasscodeView) this.this$0;
                    passcodeView.numbersFrameLayout.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f));
                    float fLerp = AndroidUtilities.lerp(0.8f, 1.0f, f);
                    PhotoViewer.AnonymousClass19 anonymousClass19 = passcodeView.numbersFrameLayout;
                    anonymousClass19.setScaleY(fLerp);
                    anonymousClass19.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f));
                    TextView textView = passcodeView.passcodeTextView;
                    textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f));
                    textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f));
                    textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f));
                    passcodeView.passwordEditText2.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f));
                    break;
                case 3:
                    PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.this$0;
                    if (animator.equals(pipRoundVideoView.hideShowAnimation)) {
                        if (!this.val$show) {
                            pipRoundVideoView.close(false);
                        }
                        pipRoundVideoView.hideShowAnimation = null;
                    }
                    break;
                case 4:
                    boolean z2 = this.val$show;
                    LimitPreviewView limitPreviewView = (LimitPreviewView) this.this$0;
                    if (z2) {
                        limitPreviewView.animatingRotation = false;
                    }
                    Runnable runnable = limitPreviewView.animateStarRatingRunnable;
                    if (runnable != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable);
                        limitPreviewView.animateStarRatingRunnable.run();
                    }
                    break;
                case 5:
                    float f2 = this.val$show ? 1.0f : 0.0f;
                    PremiumButtonView premiumButtonView = (PremiumButtonView) this.this$0;
                    premiumButtonView.loadingT = f2;
                    premiumButtonView.buttonTextView.invalidate();
                    PremiumButtonView.AnonymousClass1 anonymousClass1 = premiumButtonView.overlayTextView;
                    if (anonymousClass1 != null) {
                        anonymousClass1.invalidate();
                    }
                    break;
                case 6:
                    CustomEmojiReactionsWindow customEmojiReactionsWindow = (CustomEmojiReactionsWindow) this.this$0;
                    customEmojiReactionsWindow.updateContainersAlpha();
                    customEmojiReactionsWindow.updateContentPosition();
                    boolean z3 = this.val$show;
                    CustomEmojiReactionsWindow.access$600(customEmojiReactionsWindow, z3);
                    customEmojiReactionsWindow.selectAnimatedEmojiDialog.invalidateOutline();
                    customEmojiReactionsWindow.enterTransitionProgress = z3 ? 1.0f : 0.0f;
                    if (z3) {
                        customEmojiReactionsWindow.enterTransitionFinished = true;
                        customEmojiReactionsWindow.containerView.invalidate();
                    }
                    float fClamp = Utilities.clamp(customEmojiReactionsWindow.enterTransitionProgress, 1.0f, 0.0f);
                    ReactionsContainerLayout reactionsContainerLayout = customEmojiReactionsWindow.reactionsContainerLayout;
                    reactionsContainerLayout.setCustomEmojiEnterProgress(fClamp);
                    if (!z3) {
                        reactionsContainerLayout.setImportantForAccessibility(0);
                        reactionsContainerLayout.setSkipDraw(false);
                        customEmojiReactionsWindow.removeView();
                        Runtime.getRuntime().gc();
                        int i = customEmojiReactionsWindow.type;
                        reactionsContainerLayout.setCustomEmojiReactionsBackground((i == 4 || i == 5) ? false : true);
                    }
                    customEmojiReactionsWindow.transition = false;
                    break;
                case 7:
                    SearchTagsList searchTagsList = (SearchTagsList) this.this$0;
                    if (animator == searchTagsList.actionBarTagsAnimator) {
                        boolean z4 = this.val$show;
                        float f3 = z4 ? 1.0f : 0.0f;
                        searchTagsList.actionBarTagsT = f3;
                        searchTagsList.setShown(f3);
                        if (!z4) {
                            searchTagsList.setVisibility(8);
                        }
                        searchTagsList.onShownUpdate(true);
                        break;
                    }
                    break;
                case 8:
                    SharedMediaLayout sharedMediaLayout = (SharedMediaLayout) this.this$0;
                    if (sharedMediaLayout.actionModeAnimation != null) {
                        sharedMediaLayout.actionModeAnimation = null;
                        if (!this.val$show) {
                            sharedMediaLayout.actionModeLayout.setVisibility(4);
                        }
                        break;
                    }
                    break;
                case 9:
                    ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) this.this$0;
                    AnimatorSet animatorSet2 = editorAlert.shadowAnimation[0];
                    if (animatorSet2 != null && animatorSet2.equals(animator)) {
                        if (!this.val$show) {
                            editorAlert.shadow[0].setVisibility(4);
                        }
                        editorAlert.shadowAnimation[0] = null;
                        break;
                    }
                    break;
                case 10:
                    super.onAnimationEnd(animator);
                    float f4 = this.val$show ? 1.0f : 0.0f;
                    ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) this.this$0;
                    themeSmallPreviewView.selectionProgress = f4;
                    themeSmallPreviewView.invalidate();
                    break;
                case 11:
                    float f5 = this.val$show ? 1.0f : 0.0f;
                    TopicsTabsView.HorizontalTabView horizontalTabView = (TopicsTabsView.HorizontalTabView) this.this$0;
                    horizontalTabView.selectT = f5;
                    horizontalTabView.updateTextColor();
                    break;
                case 12:
                    float f6 = this.val$show ? 1.0f : 0.0f;
                    TopicsTabsView.VerticalTabView verticalTabView = (TopicsTabsView.VerticalTabView) this.this$0;
                    verticalTabView.selectT = f6;
                    verticalTabView.updateState();
                    verticalTabView.updateImageColor();
                    break;
                case 13:
                    UpdateAppAlertDialog updateAppAlertDialog = (UpdateAppAlertDialog) this.this$0;
                    AnimatorSet animatorSet3 = updateAppAlertDialog.shadowAnimation;
                    if (animatorSet3 != null && animatorSet3.equals(animator)) {
                        if (!this.val$show) {
                            updateAppAlertDialog.shadow.setVisibility(4);
                        }
                        updateAppAlertDialog.shadowAnimation = null;
                        break;
                    }
                    break;
                case 14:
                    UsersAlertBase usersAlertBase = (UsersAlertBase) this.this$0;
                    AnimatorSet animatorSet4 = usersAlertBase.shadowAnimation;
                    if (animatorSet4 != null && animatorSet4.equals(animator)) {
                        if (!this.val$show) {
                            usersAlertBase.shadow.setVisibility(4);
                        }
                        usersAlertBase.shadowAnimation = null;
                        break;
                    }
                    break;
                case 15:
                    VoIPToggleButton voIPToggleButton = (VoIPToggleButton) this.this$0;
                    voIPToggleButton.replaceAnimator = null;
                    if (this.val$show) {
                        TextView[] textViewArr = voIPToggleButton.textView;
                        TextView textView2 = textViewArr[0];
                        textViewArr[0] = textViewArr[1];
                        textViewArr[1] = textView2;
                        textView2.setVisibility(8);
                    }
                    if (!voIPToggleButton.iconChangeColor && (drawable = (drawableArr = voIPToggleButton.icon)[1]) != null) {
                        drawableArr[0] = drawable;
                        drawableArr[1] = null;
                    }
                    voIPToggleButton.iconChangeColor = false;
                    if (!voIPToggleButton.checkable) {
                        voIPToggleButton.backgroundColor = voIPToggleButton.animateToBackgroundColor;
                    }
                    voIPToggleButton.replaceProgress = 0.0f;
                    voIPToggleButton.invalidate();
                    break;
                case 16:
                    ContactAddActivity contactAddActivity = (ContactAddActivity) this.this$0;
                    if (contactAddActivity.avatarAnimation != null && (radialProgressView = contactAddActivity.avatarProgressView) != null) {
                        if (!this.val$show) {
                            radialProgressView.setVisibility(4);
                            contactAddActivity.avatarOverlay.setVisibility(4);
                        }
                        contactAddActivity.avatarAnimation = null;
                        break;
                    }
                    break;
                case 17:
                    float f7 = this.val$show ? 1.0f : 0.0f;
                    EnableTopicsActivity.TopicsLayoutSwitcher topicsLayoutSwitcher = (EnableTopicsActivity.TopicsLayoutSwitcher) this.this$0;
                    topicsLayoutSwitcher.tabsAlpha = f7;
                    BackupImageView backupImageView = topicsLayoutSwitcher.leftImageView;
                    int i2 = Theme.key_windowBackgroundWhiteGrayText5;
                    int color = Theme.getColor(i2, topicsLayoutSwitcher.resourcesProvider);
                    int i3 = Theme.key_featuredStickers_addButton;
                    int iBlendARGB = ColorUtils.blendARGB(topicsLayoutSwitcher.tabsAlpha, color, Theme.getColor(i3, topicsLayoutSwitcher.resourcesProvider));
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    backupImageView.setColorFilter(new PorterDuffColorFilter(iBlendARGB, mode));
                    topicsLayoutSwitcher.leftImageView.invalidate();
                    topicsLayoutSwitcher.rightImageView.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(1.0f - topicsLayoutSwitcher.tabsAlpha, Theme.getColor(i2, topicsLayoutSwitcher.resourcesProvider), Theme.getColor(i3, topicsLayoutSwitcher.resourcesProvider)), mode));
                    topicsLayoutSwitcher.rightImageView.invalidate();
                    break;
                case 18:
                    float f8 = this.val$show ? 1.0f : 0.0f;
                    FilterCreateActivity.LinkCell linkCell = (FilterCreateActivity.LinkCell) this.this$0;
                    linkCell.revokeT = f8;
                    linkCell.invalidate();
                    break;
                case 19:
                    GroupCallActivity groupCallActivity = (GroupCallActivity) this.this$0;
                    groupCallActivity.subtitleYAnimator = null;
                    groupCallActivity.actionBar.getSubtitleTextView().setTranslationY(this.val$show ? 0.0f : AndroidUtilities.dp(20.0f));
                    break;
                case 20:
                    GroupCreateFinalActivity groupCreateFinalActivity = (GroupCreateFinalActivity) this.this$0;
                    if (groupCreateFinalActivity.avatarAnimation != null && (anonymousClass5 = groupCreateFinalActivity.avatarEditor) != null) {
                        if (this.val$show) {
                            anonymousClass5.setVisibility(4);
                        } else {
                            groupCreateFinalActivity.avatarProgressView.setVisibility(4);
                        }
                        groupCreateFinalActivity.avatarAnimation = null;
                        break;
                    }
                    break;
                case 21:
                    if (!this.val$show) {
                        ((PasscodeActivity) this.this$0).keyboardView.setVisibility(8);
                    }
                    break;
                case 22:
                    PhotoPickerActivity photoPickerActivity = (PhotoPickerActivity) this.this$0;
                    if (animator.equals(photoPickerActivity.animatorSet)) {
                        if (!this.val$show) {
                            photoPickerActivity.frameLayout2.setVisibility(4);
                            photoPickerActivity.writeButtonContainer.setVisibility(4);
                        }
                        photoPickerActivity.animatorSet = null;
                    }
                    break;
                case 23:
                    ((PollItemMenu) this.this$0).openProgress2 = this.val$show ? 1.0f : 0.0f;
                    break;
                case 24:
                    ProfileActivity.PagerIndicatorView pagerIndicatorView = (ProfileActivity.PagerIndicatorView) this.this$0;
                    if (pagerIndicatorView.isIndicatorVisible) {
                        ActionBarMenuItem actionBarMenuItem = ProfileActivity.this.searchItem;
                        if (actionBarMenuItem != null) {
                            actionBarMenuItem.setClickable(false);
                        }
                        ProfileActivity profileActivity = ProfileActivity.this;
                        if (profileActivity.editItemVisible) {
                            profileActivity.editItem.setVisibility(8);
                        }
                        ProfileActivity profileActivity2 = ProfileActivity.this;
                        if (profileActivity2.callItemVisible) {
                            profileActivity2.callItem.setVisibility(8);
                        }
                        ProfileActivity profileActivity3 = ProfileActivity.this;
                        if (profileActivity3.videoCallItemVisible) {
                            profileActivity3.videoCallItem.setVisibility(8);
                        }
                    } else {
                        pagerIndicatorView.setVisibility(8);
                    }
                    ProfileActivity.this.updateStoriesViewBounds(false);
                    break;
                case 25:
                    boolean z5 = this.val$show;
                    ProxyListActivity.TextDetailProxyCell textDetailProxyCell = (ProxyListActivity.TextDetailProxyCell) this.this$0;
                    if (z5) {
                        textDetailProxyCell.checkImageView.setVisibility(8);
                    } else {
                        textDetailProxyCell.checkBox.setVisibility(8);
                    }
                    break;
                case 26:
                    float f9 = this.val$show ? 1.0f : 0.0f;
                    SecretVoicePlayer secretVoicePlayer = (SecretVoicePlayer) this.this$0;
                    secretVoicePlayer.openProgress2 = f9;
                    if (secretVoicePlayer.isRound) {
                        secretVoicePlayer.myCell.invalidate();
                    }
                    break;
                case 27:
                    float f10 = this.val$show ? 1.0f : 0.0f;
                    SelectAnimatedEmojiDialog.SelectStatusDurationDialog selectStatusDurationDialog = (SelectAnimatedEmojiDialog.SelectStatusDurationDialog) this.this$0;
                    selectStatusDurationDialog.showMenuT = f10;
                    ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = selectStatusDurationDialog.menuView;
                    actionBarPopupWindowLayout.setBackScaleY(f10);
                    actionBarPopupWindowLayout.setAlpha(CubicBezierInterpolator.EASE_OUT.getInterpolation(selectStatusDurationDialog.showMenuT));
                    int itemsCount = actionBarPopupWindowLayout.getItemsCount();
                    for (int i4 = 0; i4 < itemsCount; i4++) {
                        float fCascade = AndroidUtilities.cascade(selectStatusDurationDialog.showMenuT, i4, itemsCount, 4.0f);
                        actionBarPopupWindowLayout.linearLayout.getChildAt(i4).setTranslationY((1.0f - fCascade) * AndroidUtilities.dp(-12.0f));
                        actionBarPopupWindowLayout.linearLayout.getChildAt(i4).setAlpha(fCascade);
                    }
                    selectStatusDurationDialog.showMenuAnimator = null;
                    break;
                case 28:
                    SettingsActivity settingsActivity = (SettingsActivity) this.this$0;
                    if (settingsActivity.avatarAnimation != null && (anonymousClass22 = settingsActivity.avatarProgressView) != null) {
                        if (!this.val$show) {
                            anonymousClass22.setVisibility(4);
                        }
                        settingsActivity.avatarAnimation = null;
                        break;
                    }
                    break;
                default:
                    float f11 = this.val$show ? 1.0f : 0.0f;
                    DialogStoriesCell dialogStoriesCell = (DialogStoriesCell) this.this$0;
                    dialogStoriesCell.collapsedProgress2 = f11;
                    dialogStoriesCell.checkCollapsedProgress();
                    break;
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    if (this.val$show) {
                        ((LoginActivity) this.this$0).radialProgressView.setVisibility(0);
                    }
                    break;
                case 21:
                    if (this.val$show) {
                        ((PasscodeActivity) this.this$0).keyboardView.setVisibility(0);
                    }
                    break;
                case 24:
                    ProfileActivity.PagerIndicatorView pagerIndicatorView = (ProfileActivity.PagerIndicatorView) this.this$0;
                    ActionBarMenuItem actionBarMenuItem = ProfileActivity.this.searchItem;
                    if (actionBarMenuItem != null && !this.val$show) {
                        actionBarMenuItem.setClickable(true);
                    }
                    ProfileActivity profileActivity = ProfileActivity.this;
                    if (profileActivity.editItemVisible) {
                        profileActivity.editItem.setVisibility(0);
                    }
                    ProfileActivity profileActivity2 = ProfileActivity.this;
                    if (profileActivity2.callItemVisible) {
                        profileActivity2.callItem.setVisibility(0);
                    }
                    ProfileActivity profileActivity3 = ProfileActivity.this;
                    if (profileActivity3.videoCallItemVisible) {
                        profileActivity3.videoCallItem.setVisibility(0);
                    }
                    pagerIndicatorView.setVisibility(0);
                    ProfileActivity.this.updateStoriesViewBounds(false);
                    break;
                case 25:
                    boolean z = this.val$show;
                    ProxyListActivity.TextDetailProxyCell textDetailProxyCell = (ProxyListActivity.TextDetailProxyCell) this.this$0;
                    if (!z) {
                        textDetailProxyCell.checkImageView.setAlpha(0.0f);
                        textDetailProxyCell.checkImageView.setVisibility(0);
                    } else {
                        textDetailProxyCell.checkBox.setAlpha(0.0f);
                        textDetailProxyCell.checkBox.setVisibility(0);
                    }
                    break;
                case 29:
                    super.onAnimationStart(animator);
                    try {
                        ((DialogStoriesCell) this.this$0).performHapticFeedback(3);
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                default:
                    super.onAnimationStart(animator);
                    break;
            }
        }
    }

    public final class LoginActivityEmailCodeView extends SlideView {
        public final FrameLayout cantAccessEmailFrameLayout;
        public final ArticleViewer.AnonymousClass9 cantAccessEmailView;
        public final PasscodeActivity.AnonymousClass8 codeFieldContainer;
        public final SpoilersTextView confirmTextView;
        public Bundle currentParams;
        public String email;
        public String emailPhone;
        public final ArticleViewer.AnonymousClass9 emailResetInView;
        public final LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2 errorColorTimeout;
        public final LoginActivitySmsView.AnonymousClass4 errorViewSwitcher;
        public GoogleSignInAccount googleAccount;
        public final RLottieImageView inboxImageView;
        public boolean isFromSetup;
        public final boolean isSetup;
        public int length;
        public final LoginOrView loginOrView;
        public boolean nextPressed;
        public String phone;
        public String phoneHash;
        public boolean postedErrorColorTimeout;
        public String requestPhone;
        public boolean requestingEmailReset;
        public final LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2 resendCodeTimeout;
        public final TextView resendCodeView;
        public final FrameLayout resendFrameLayout;
        public int resetAvailablePeriod;
        public int resetPendingDate;
        public boolean resetRequestPending;
        public final TextView signInWithGoogleView;
        public final TextView titleView;
        public final LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2 updateResetPendingDateCallback;
        public final TextView wrongCodeView;

        public LoginActivityEmailCodeView(Context context, boolean z) {
            int i;
            super(context);
            this.errorColorTimeout = new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2(this, 0);
            this.resendCodeTimeout = new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2(this, 6);
            this.updateResetPendingDateCallback = new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2(this, 7);
            this.isSetup = z;
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.inboxImageView = rLottieImageView;
            if (!z || LoginActivity.this.activityMode == 3) {
                rLottieImageView.setAnimation(R.raw.email_check_inbox, 120, 120, null);
            } else {
                rLottieImageView.setAnimation(R.raw.email_setup_heart, 120, 120, null);
            }
            rLottieImageView.setAutoRepeat(false);
            frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(120, 120, 1));
            if (AndroidUtilities.isSmallScreen()) {
                i = 8;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y || AndroidUtilities.isTablet()) {
                    i = 0;
                } else {
                    i = 8;
                }
            }
            frameLayout.setVisibility(i);
            addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            zzkk.m(18.0f, 1, textView);
            textView.setText(LocaleController.getString(LoginActivity.this.activityMode == 3 ? R.string.CheckYourNewEmail : z ? R.string.VerificationCode : R.string.CheckYourEmail));
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            SpoilersTextView spoilersTextView = new SpoilersTextView(context, null, false);
            this.confirmTextView = spoilersTextView;
            spoilersTextView.setTextSize(1, 14.0f);
            spoilersTextView.setGravity(17);
            spoilersTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(spoilersTextView, LayoutHelper.createLinear(-2, -2, 1, 24, 8, 24, 0));
            PasscodeActivity.AnonymousClass8 anonymousClass8 = new PasscodeActivity.AnonymousClass8(this, context, 1);
            this.codeFieldContainer = anonymousClass8;
            addView(anonymousClass8, LayoutHelper.createLinear(-2, 42, 1, 0, z ? 48 : 32, 0, 0));
            TextView textView2 = new TextView(context);
            this.signInWithGoogleView = textView2;
            textView2.setGravity(17);
            textView2.setTextSize(1, 14.0f);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            textView2.setMaxLines(2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            Drawable drawable = context.getDrawable(R.drawable.googleg_standard_color_18);
            drawable.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
            spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
            spannableStringBuilder.setSpan(new CountrySelectActivity.AnonymousClass5(2), 1, 2, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
            textView2.setText(spannableStringBuilder);
            final int i2 = 0;
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityEmailCodeView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            final LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView = this.f$0;
                            loginActivityEmailCodeView.getClass();
                            NotificationCenter.getGlobalInstance().addObserver(new NotificationCenter.NotificationCenterDelegate() {
                                @Override
                                public final void didReceivedNotification(int i3, int i4, Object... objArr) {
                                    LoginActivityEmailCodeView loginActivityEmailCodeView2 = LoginActivityEmailCodeView.this;
                                    int iIntValue = ((Integer) objArr[0]).intValue();
                                    ((Integer) objArr[1]).getClass();
                                    Intent intent = (Intent) objArr[2];
                                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
                                    if (iIntValue == 200) {
                                        try {
                                            loginActivityEmailCodeView2.googleAccount = (GoogleSignInAccount) GoogleSignIn.getSignedInAccountFromIntent(intent).getResult(ApiException.class);
                                            loginActivityEmailCodeView2.onNextPressed(null);
                                        } catch (ApiException e) {
                                            FileLog.e(e);
                                        }
                                    }
                                }
                            }, NotificationCenter.onActivityResultReceived);
                            Context context2 = loginActivityEmailCodeView.getContext();
                            HashSet hashSet = new HashSet();
                            HashMap map = new HashMap();
                            String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
                            zzah.checkNotEmpty(str);
                            hashSet.add(GoogleSignInOptions.zab);
                            if (hashSet.contains(GoogleSignInOptions.zae)) {
                                Scope scope = GoogleSignInOptions.zad;
                                if (hashSet.contains(scope)) {
                                    hashSet.remove(scope);
                                }
                            }
                            hashSet.add(GoogleSignInOptions.zac);
                            zze client = GoogleSignIn.getClient(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, map, null));
                            client.signOut().addOnCompleteListener(new DialogsActivity$$ExternalSyntheticLambda89(23, loginActivityEmailCodeView, client));
                            break;
                        case 1:
                            this.f$0.requestEmailReset();
                            break;
                        default:
                            LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView2 = this.f$0;
                            TextView textView3 = loginActivityEmailCodeView2.resendCodeView;
                            if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                loginActivityEmailCodeView2.showResendCodeView(false);
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = loginActivityEmailCodeView2.requestPhone;
                                tL_auth_resendCode.phone_code_hash = loginActivityEmailCodeView2.phoneHash;
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", loginActivityEmailCodeView2.phone);
                                bundle.putString("ephone", loginActivityEmailCodeView2.emailPhone);
                                bundle.putString("phoneFormated", loginActivityEmailCodeView2.requestPhone);
                                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new LinkManager$$ExternalSyntheticLambda0(loginActivityEmailCodeView2, bundle, tL_auth_resendCode, 9), 10);
                                break;
                            }
                            break;
                    }
                }
            });
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.cantAccessEmailFrameLayout = frameLayout2;
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, (LoginActivity.this.activityMode == 3 || z) ? false : true, 1.0f, false);
            ArticleViewer.AnonymousClass9 anonymousClass9 = new ArticleViewer.AnonymousClass9(context, 17);
            this.cantAccessEmailView = anonymousClass9;
            anonymousClass9.setText(LocaleController.getString(R.string.LoginCantAccessThisEmail));
            anonymousClass9.setGravity(17);
            anonymousClass9.setTextSize(1, 14.0f);
            anonymousClass9.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            anonymousClass9.setMaxLines(2);
            anonymousClass9.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(24, this, context));
            frameLayout2.addView(anonymousClass9);
            ArticleViewer.AnonymousClass9 anonymousClass10 = new ArticleViewer.AnonymousClass9(context, 18);
            this.emailResetInView = anonymousClass10;
            anonymousClass10.setGravity(17);
            anonymousClass10.setTextSize(1, 14.0f);
            anonymousClass10.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            anonymousClass10.setMaxLines(3);
            final int i3 = 1;
            anonymousClass10.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityEmailCodeView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            final LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView = this.f$0;
                            loginActivityEmailCodeView.getClass();
                            NotificationCenter.getGlobalInstance().addObserver(new NotificationCenter.NotificationCenterDelegate() {
                                @Override
                                public final void didReceivedNotification(int i4, int i5, Object... objArr) {
                                    LoginActivityEmailCodeView loginActivityEmailCodeView2 = LoginActivityEmailCodeView.this;
                                    int iIntValue = ((Integer) objArr[0]).intValue();
                                    ((Integer) objArr[1]).getClass();
                                    Intent intent = (Intent) objArr[2];
                                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
                                    if (iIntValue == 200) {
                                        try {
                                            loginActivityEmailCodeView2.googleAccount = (GoogleSignInAccount) GoogleSignIn.getSignedInAccountFromIntent(intent).getResult(ApiException.class);
                                            loginActivityEmailCodeView2.onNextPressed(null);
                                        } catch (ApiException e) {
                                            FileLog.e(e);
                                        }
                                    }
                                }
                            }, NotificationCenter.onActivityResultReceived);
                            Context context2 = loginActivityEmailCodeView.getContext();
                            HashSet hashSet = new HashSet();
                            HashMap map = new HashMap();
                            String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
                            zzah.checkNotEmpty(str);
                            hashSet.add(GoogleSignInOptions.zab);
                            if (hashSet.contains(GoogleSignInOptions.zae)) {
                                Scope scope = GoogleSignInOptions.zad;
                                if (hashSet.contains(scope)) {
                                    hashSet.remove(scope);
                                }
                            }
                            hashSet.add(GoogleSignInOptions.zac);
                            zze client = GoogleSignIn.getClient(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, map, null));
                            client.signOut().addOnCompleteListener(new DialogsActivity$$ExternalSyntheticLambda89(23, loginActivityEmailCodeView, client));
                            break;
                        case 1:
                            this.f$0.requestEmailReset();
                            break;
                        default:
                            LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView2 = this.f$0;
                            TextView textView3 = loginActivityEmailCodeView2.resendCodeView;
                            if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                loginActivityEmailCodeView2.showResendCodeView(false);
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = loginActivityEmailCodeView2.requestPhone;
                                tL_auth_resendCode.phone_code_hash = loginActivityEmailCodeView2.phoneHash;
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", loginActivityEmailCodeView2.phone);
                                bundle.putString("ephone", loginActivityEmailCodeView2.emailPhone);
                                bundle.putString("phoneFormated", loginActivityEmailCodeView2.requestPhone);
                                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new LinkManager$$ExternalSyntheticLambda0(loginActivityEmailCodeView2, bundle, tL_auth_resendCode, 9), 10);
                                break;
                            }
                            break;
                    }
                }
            });
            anonymousClass10.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
            anonymousClass10.setVisibility(8);
            frameLayout2.addView(anonymousClass10);
            TextView textView3 = new TextView(context);
            this.resendCodeView = textView3;
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            textView3.setMaxLines(2);
            textView3.setText(LocaleController.getString(R.string.ResendCode));
            final int i4 = 2;
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityEmailCodeView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            final LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView = this.f$0;
                            loginActivityEmailCodeView.getClass();
                            NotificationCenter.getGlobalInstance().addObserver(new NotificationCenter.NotificationCenterDelegate() {
                                @Override
                                public final void didReceivedNotification(int i5, int i6, Object... objArr) {
                                    LoginActivityEmailCodeView loginActivityEmailCodeView2 = LoginActivityEmailCodeView.this;
                                    int iIntValue = ((Integer) objArr[0]).intValue();
                                    ((Integer) objArr[1]).getClass();
                                    Intent intent = (Intent) objArr[2];
                                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
                                    if (iIntValue == 200) {
                                        try {
                                            loginActivityEmailCodeView2.googleAccount = (GoogleSignInAccount) GoogleSignIn.getSignedInAccountFromIntent(intent).getResult(ApiException.class);
                                            loginActivityEmailCodeView2.onNextPressed(null);
                                        } catch (ApiException e) {
                                            FileLog.e(e);
                                        }
                                    }
                                }
                            }, NotificationCenter.onActivityResultReceived);
                            Context context2 = loginActivityEmailCodeView.getContext();
                            HashSet hashSet = new HashSet();
                            HashMap map = new HashMap();
                            String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
                            zzah.checkNotEmpty(str);
                            hashSet.add(GoogleSignInOptions.zab);
                            if (hashSet.contains(GoogleSignInOptions.zae)) {
                                Scope scope = GoogleSignInOptions.zad;
                                if (hashSet.contains(scope)) {
                                    hashSet.remove(scope);
                                }
                            }
                            hashSet.add(GoogleSignInOptions.zac);
                            zze client = GoogleSignIn.getClient(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, map, null));
                            client.signOut().addOnCompleteListener(new DialogsActivity$$ExternalSyntheticLambda89(23, loginActivityEmailCodeView, client));
                            break;
                        case 1:
                            this.f$0.requestEmailReset();
                            break;
                        default:
                            LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView2 = this.f$0;
                            TextView textView4 = loginActivityEmailCodeView2.resendCodeView;
                            if (textView4.getVisibility() == 0 && textView4.getAlpha() == 1.0f) {
                                loginActivityEmailCodeView2.showResendCodeView(false);
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = loginActivityEmailCodeView2.requestPhone;
                                tL_auth_resendCode.phone_code_hash = loginActivityEmailCodeView2.phoneHash;
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", loginActivityEmailCodeView2.phone);
                                bundle.putString("ephone", loginActivityEmailCodeView2.emailPhone);
                                bundle.putString("phoneFormated", loginActivityEmailCodeView2.requestPhone);
                                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new LinkManager$$ExternalSyntheticLambda0(loginActivityEmailCodeView2, bundle, tL_auth_resendCode, 9), 10);
                                break;
                            }
                            break;
                    }
                }
            });
            AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 1.0f, false);
            LoginOrView loginOrView = new LoginOrView(context);
            this.loginOrView = loginOrView;
            new PhotoViewer.AnonymousClass14(loginOrView);
            LoginActivitySmsView.AnonymousClass4 anonymousClass4 = new LoginActivitySmsView.AnonymousClass4(context, 1);
            this.errorViewSwitcher = anonymousClass4;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
            CubicBezierInterpolator cubicBezierInterpolator = Easings.easeInOutQuad;
            animationLoadAnimation.setInterpolator(cubicBezierInterpolator);
            anonymousClass4.setInAnimation(animationLoadAnimation);
            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
            animationLoadAnimation2.setInterpolator(cubicBezierInterpolator);
            anonymousClass4.setOutAnimation(animationLoadAnimation2);
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.resendFrameLayout = frameLayout3;
            frameLayout3.addView(textView3, LayoutHelper.createFrame(-2, -2, 17));
            anonymousClass4.addView(frameLayout3);
            TextView textView4 = new TextView(context);
            this.wrongCodeView = textView4;
            textView4.setText(LocaleController.getString("WrongCode", R.string.WrongCode));
            textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView4.setTextSize(1, 15.0f);
            textView4.setGravity(49);
            textView4.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            anonymousClass4.addView(textView4);
            FrameLayout frameLayout4 = new FrameLayout(context);
            if (z) {
                frameLayout4.addView(anonymousClass4, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
            } else {
                frameLayout4.addView(anonymousClass4, LayoutHelper.createFrame(-1, -2, 48));
                frameLayout4.addView(frameLayout2, LayoutHelper.createFrame(-1, -2, 48));
                frameLayout4.addView(loginOrView, LayoutHelper.createFrame(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, 16.0f));
                frameLayout4.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
            }
            addView(frameLayout4, LayoutHelper.createLinear(1.0f, -1, 0));
        }

        public final void animateSuccess$1(Runnable runnable) {
            if (this.googleAccount != null) {
                runnable.run();
                return;
            }
            int i = 0;
            while (true) {
                PasscodeActivity.AnonymousClass8 anonymousClass8 = this.codeFieldContainer;
                CodeNumberField[] codeNumberFieldArr = anonymousClass8.codeField;
                if (i >= codeNumberFieldArr.length) {
                    anonymousClass8.postDelayed(new LinkManager$$ExternalSyntheticLambda2(6, this, runnable), (((long) codeNumberFieldArr.length) * 75) + 400);
                    return;
                } else {
                    anonymousClass8.postDelayed(new OAuthSheet$$ExternalSyntheticLambda17(this, i, 17), ((long) i) * 75);
                    i++;
                }
            }
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString(R.string.VerificationCode);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            removeCallbacks(this.errorColorTimeout);
            removeCallbacks(this.resendCodeTimeout);
        }

        @Override
        public final void onHide() {
            if (this.resetPendingDate != 0) {
                AndroidUtilities.cancelRunOnUIThread(this.updateResetPendingDateCallback);
            }
        }

        @Override
        public final void onNextPressed(String str) {
            TLObject tLObject;
            if (this.nextPressed) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.resendCodeTimeout);
            PasscodeActivity.AnonymousClass8 anonymousClass8 = this.codeFieldContainer;
            anonymousClass8.isFocusSuppressed = true;
            CodeNumberField[] codeNumberFieldArr = anonymousClass8.codeField;
            if (codeNumberFieldArr != null) {
                for (CodeNumberField codeNumberField : codeNumberFieldArr) {
                    CodeNumberField.animateSpring(codeNumberField.focusedSpringAnimation, 0.0f);
                }
            }
            String code = anonymousClass8.getCode();
            int length = code.length();
            LoginActivity loginActivity = LoginActivity.this;
            if (length == 0 && this.googleAccount == null) {
                if (loginActivity.getParentActivity() == null) {
                    return;
                }
                try {
                    anonymousClass8.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (CodeNumberField codeNumberField2 : anonymousClass8.codeField) {
                    CodeNumberField.animateSpring(codeNumberField2.errorSpringAnimation, 100.0f);
                }
                anonymousClass8.codeField[0].requestFocus();
                AndroidUtilities.shakeViewSpring(anonymousClass8, new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2(this, 2));
                return;
            }
            this.nextPressed = true;
            loginActivity.needShowProgress(0, true);
            if (loginActivity.activityMode == 3) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = code;
                verifyemail.verification = tL_emailVerificationCode;
                tLObject = verifyemail;
            } else if (this.isFromSetup) {
                TL_account.verifyEmail verifyemail2 = new TL_account.verifyEmail();
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.requestPhone;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.phoneHash;
                verifyemail2.purpose = tL_emailVerifyPurposeLoginSetup;
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode2 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode2.code = code;
                verifyemail2.verification = tL_emailVerificationCode2;
                tLObject = verifyemail2;
            } else {
                TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                tL_auth_signIn.phone_number = this.requestPhone;
                tL_auth_signIn.phone_code_hash = this.phoneHash;
                if (this.googleAccount != null) {
                    TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                    tL_emailVerificationGoogle.token = this.googleAccount.zae;
                    tL_auth_signIn.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn.flags = 2 | tL_auth_signIn.flags;
                tLObject = tL_auth_signIn;
            }
            anonymousClass8.isFocusSuppressed = true;
            CodeNumberField[] codeNumberFieldArr2 = anonymousClass8.codeField;
            if (codeNumberFieldArr2 != null) {
                for (CodeNumberField codeNumberField3 : codeNumberFieldArr2) {
                    CodeNumberField.animateSpring(codeNumberField3.focusedSpringAnimation, 0.0f);
                }
            }
            ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(tLObject, new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda0(this, code, 0), 10);
        }

        @Override
        public final void onShow() {
            if (this.resetRequestPending) {
                this.resetRequestPending = false;
            } else {
                AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2(this, 8), LoginActivity.SHOW_DELAY);
            }
        }

        public final void requestEmailReset() {
            if (this.requestingEmailReset) {
                return;
            }
            this.requestingEmailReset = true;
            Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            bundle.putString("ephone", this.emailPhone);
            bundle.putString("phoneFormated", this.requestPhone);
            TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
            tL_auth_resetLoginEmail.phone_number = this.requestPhone;
            tL_auth_resetLoginEmail.phone_code_hash = this.phoneHash;
            LoginActivity.this.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda10(this, bundle, tL_auth_resetLoginEmail, 0), 10);
        }

        @Override
        public final void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("emailcode_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            String string = bundle.getString("emailcode_code");
            if (string != null) {
                this.codeFieldContainer.setText(string);
            }
        }

        @Override
        public final void saveStateParams(Bundle bundle) {
            String code = this.codeFieldContainer.getCode();
            if (code != null && code.length() != 0) {
                bundle.putString("emailcode_code", code);
            }
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("emailcode_params", bundle2);
            }
        }

        @Override
        public final void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            this.currentParams = bundle;
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = this.currentParams.getString("phoneHash");
            this.phone = this.currentParams.getString("phone");
            this.emailPhone = this.currentParams.getString("ephone");
            this.isFromSetup = this.currentParams.getBoolean("setup");
            this.length = this.currentParams.getInt("length");
            this.email = this.currentParams.getString("email");
            this.resetAvailablePeriod = this.currentParams.getInt("resetAvailablePeriod");
            this.resetPendingDate = this.currentParams.getInt("resetPendingDate");
            LoginActivity loginActivity = LoginActivity.this;
            int i = loginActivity.activityMode;
            FrameLayout frameLayout = this.cantAccessEmailFrameLayout;
            SpoilersTextView spoilersTextView = this.confirmTextView;
            int i2 = 8;
            if (i == 3) {
                spoilersTextView.setText(LocaleController.formatString(R.string.CheckYourNewEmailSubtitle, this.email));
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
            } else if (this.isSetup) {
                spoilersTextView.setText(LocaleController.formatString(R.string.VerificationCodeSubtitle, this.email));
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
            } else {
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, false);
                this.cantAccessEmailView.setVisibility(this.resetPendingDate == 0 ? 0 : 8);
                this.emailResetInView.setVisibility(this.resetPendingDate != 0 ? 0 : 8);
                if (this.resetPendingDate != 0) {
                    updateResetPendingDate();
                }
            }
            int i3 = this.length;
            PasscodeActivity.AnonymousClass8 anonymousClass8 = this.codeFieldContainer;
            anonymousClass8.setNumbersCount(i3, 1);
            for (CodeNumberField codeNumberField : anonymousClass8.codeField) {
                codeNumberField.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                codeNumberField.addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 23));
                codeNumberField.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, 6));
            }
            anonymousClass8.setText("");
            if (!this.isFromSetup && loginActivity.activityMode != 3) {
                String string = this.currentParams.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int iIndexOf = string.indexOf(42);
                int iLastIndexOf = string.lastIndexOf(42);
                if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                    textStyleRun.flags |= 256;
                    textStyleRun.start = iIndexOf;
                    int i4 = iLastIndexOf + 1;
                    textStyleRun.end = i4;
                    spannableStringBuilder.setSpan(new TextStyleSpan(textStyleRun, 0), iIndexOf, i4, 0);
                }
                spoilersTextView.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                i2 = 0;
            }
            this.loginOrView.setVisibility(i2);
            this.signInWithGoogleView.setVisibility(i2);
            CodeNumberField codeNumberField2 = anonymousClass8.codeField[0];
            if (!loginActivity.isCustomKeyboardVisible()) {
                AndroidUtilities.showKeyboard(codeNumberField2);
            }
            anonymousClass8.requestFocus();
            if (!z && bundle.containsKey("nextType")) {
                AndroidUtilities.runOnUIThread(this.resendCodeTimeout, bundle.getInt("timeout"));
            }
            if (this.resetPendingDate != 0) {
                AndroidUtilities.runOnUIThread(this.updateResetPendingDateCallback, 1000L);
            }
        }

        public final void showResendCodeView(boolean z) {
            AndroidUtilities.updateViewVisibilityAnimated(this.resendCodeView, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.cantAccessEmailFrameLayout, (z || LoginActivity.this.activityMode == 3 || this.isSetup) ? false : true);
            LoginOrView loginOrView = this.loginOrView;
            if (loginOrView.getVisibility() != 8) {
                loginOrView.setLayoutParams(LayoutHelper.createFrame(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, z ? 8.0f : 16.0f));
                loginOrView.requestLayout();
            }
        }

        @Override
        public final void updateColors$1() {
            this.titleView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            SpoilersTextView spoilersTextView = this.confirmTextView;
            int i = Theme.key_windowBackgroundWhiteGrayText6;
            spoilersTextView.setTextColor(Theme.getColor(null, i, false));
            TextView textView = this.signInWithGoogleView;
            int i2 = Theme.key_windowBackgroundWhiteBlueText4;
            textView.setTextColor(Theme.getColor(null, i2, false));
            this.loginOrView.updateColors();
            this.resendCodeView.setTextColor(Theme.getColor(null, i2, false));
            this.cantAccessEmailView.setTextColor(Theme.getColor(null, i2, false));
            this.emailResetInView.setTextColor(Theme.getColor(null, i, false));
            this.wrongCodeView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            this.codeFieldContainer.invalidate();
        }

        public final void updateResetPendingDate() {
            String string;
            int i = 1;
            int iCurrentTimeMillis = (int) (((long) this.resetPendingDate) - (System.currentTimeMillis() / 1000));
            int i2 = this.resetPendingDate;
            ArticleViewer.AnonymousClass9 anonymousClass9 = this.emailResetInView;
            if (i2 <= 0 || iCurrentTimeMillis <= 0) {
                anonymousClass9.setVisibility(0);
                anonymousClass9.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
                AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2(this, i), 1000L);
                return;
            }
            int i3 = R.string.LoginEmailResetInTime;
            int i4 = iCurrentTimeMillis / 86400;
            int i5 = iCurrentTimeMillis % 86400;
            int i6 = i5 / 3600;
            int i7 = i5 % 3600;
            int i8 = i7 / 60;
            int i9 = i7 % 60;
            if (i6 >= 16) {
                i4++;
            }
            if (i4 != 0) {
                string = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i4, new Object[0]));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(i6 != 0 ? String.format(Locale.ROOT, "%02d:", Integer.valueOf(i6)) : "");
                Locale locale = Locale.ROOT;
                sb.append(String.format(locale, "%02d:", Integer.valueOf(i8)));
                sb.append(String.format(locale, "%02d", Integer.valueOf(i9)));
                string = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, sb.toString());
            }
            String string2 = LocaleController.formatString(i3, string);
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string2);
            int iIndexOf = string2.indexOf(42);
            int iLastIndexOf = string2.lastIndexOf(42);
            if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                spannableStringBuilderValueOf.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
                spannableStringBuilderValueOf.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                spannableStringBuilderValueOf.setSpan(new ForegroundColorSpan(LoginActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText4)), iIndexOf, iLastIndexOf - 1, 33);
            }
            anonymousClass9.setText(spannableStringBuilderValueOf);
            AndroidUtilities.runOnUIThread(this.updateResetPendingDateCallback, 1000L);
        }
    }

    public final class LoginActivityNewPasswordView extends SlideView {
        public final TextView cancelButton;
        public final EditTextBoldCursor[] codeField;
        public final TextView confirmTextView;
        public Bundle currentParams;
        public TL_account.Password currentPassword;
        public final int currentStage;
        public String emailCode;
        public boolean isPasswordVisible;
        public String newPassword;
        public boolean nextPressed;
        public final OutlineTextContainerView[] outlineFields;
        public final ImageView passwordButton;
        public String passwordString;
        public final TextView titleTextView;

        public LoginActivityNewPasswordView(Context context, int i) {
            super(context);
            this.currentStage = i;
            setOrientation(1);
            int i2 = i == 1 ? 1 : 2;
            this.codeField = new EditTextBoldCursor[i2];
            this.outlineFields = new OutlineTextContainerView[i2];
            TextView textView = new TextView(context);
            this.titleTextView = textView;
            float f = 18.0f;
            textView.setTextSize(1, 18.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView.setGravity(49);
            textView.setText(LocaleController.getString(R.string.SetNewPassword));
            addView(textView, LayoutHelper.createLinear(-2, -2, 1, 8, AndroidUtilities.isSmallScreen() ? 16 : 72, 8, 0));
            TextView textView2 = new TextView(context);
            this.confirmTextView = textView2;
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity(1);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 8, 6, 8, 16));
            final int i3 = 0;
            while (i3 < this.codeField.length) {
                OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context, null);
                this.outlineFields[i3] = outlineTextContainerView;
                outlineTextContainerView.setText(LocaleController.getString(i == 0 ? i3 == 0 ? R.string.PleaseEnterNewFirstPasswordHint : R.string.PleaseEnterNewSecondPasswordHint : R.string.PasswordHintPlaceholder));
                this.codeField[i3] = new EditTextBoldCursor(context);
                this.codeField[i3].setCursorSize(AndroidUtilities.dp(20.0f));
                this.codeField[i3].setCursorWidth(1.5f);
                this.codeField[i3].setImeOptions(268435461);
                this.codeField[i3].setTextSize(1, f);
                this.codeField[i3].setMaxLines(1);
                this.codeField[i3].setBackground(null);
                int iDp = AndroidUtilities.dp(16.0f);
                this.codeField[i3].setPadding(iDp, iDp, iDp, iDp);
                if (i == 0) {
                    this.codeField[i3].setInputType(129);
                    this.codeField[i3].setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                this.codeField[i3].setTypeface(Typeface.DEFAULT);
                this.codeField[i3].setGravity(LocaleController.isRTL ? 5 : 3);
                EditTextBoldCursor editTextBoldCursor = this.codeField[i3];
                boolean z = i3 == 0 && i == 0;
                editTextBoldCursor.addTextChangedListener(new TextPaintView.AnonymousClass2(this, z));
                this.codeField[i3].setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(outlineTextContainerView, 7));
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setGravity(16);
                    linearLayout.addView(this.codeField[i3], LayoutHelper.createLinear(1.0f, 0, -2));
                    ImageView imageView = new ImageView(context);
                    this.passwordButton = imageView;
                    imageView.setImageResource(R.drawable.msg_message);
                    AndroidUtilities.updateViewVisibilityAnimated(imageView, true, 0.1f, false);
                    final int i4 = 0;
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final LoginActivity.LoginActivityNewPasswordView f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i4) {
                                case 0:
                                    LoginActivity.LoginActivityNewPasswordView loginActivityNewPasswordView = this.f$0;
                                    loginActivityNewPasswordView.isPasswordVisible = !loginActivityNewPasswordView.isPasswordVisible;
                                    int i5 = 0;
                                    while (true) {
                                        EditTextBoldCursor[] editTextBoldCursorArr = loginActivityNewPasswordView.codeField;
                                        if (i5 >= editTextBoldCursorArr.length) {
                                            ImageView imageView2 = loginActivityNewPasswordView.passwordButton;
                                            imageView2.setTag(Boolean.valueOf(loginActivityNewPasswordView.isPasswordVisible));
                                            imageView2.setColorFilter(Theme.getColor(null, loginActivityNewPasswordView.isPasswordVisible ? Theme.key_windowBackgroundWhiteInputFieldActivated : Theme.key_windowBackgroundWhiteHintText, false));
                                        } else {
                                            int selectionStart = editTextBoldCursorArr[i5].getSelectionStart();
                                            int selectionEnd = editTextBoldCursorArr[i5].getSelectionEnd();
                                            editTextBoldCursorArr[i5].setInputType((loginActivityNewPasswordView.isPasswordVisible ? 144 : 128) | 1);
                                            editTextBoldCursorArr[i5].setSelection(selectionStart, selectionEnd);
                                            i5++;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    LoginActivity.LoginActivityNewPasswordView loginActivityNewPasswordView2 = this.f$0;
                                    if (loginActivityNewPasswordView2.currentStage != 0) {
                                        loginActivityNewPasswordView2.recoverPassword(loginActivityNewPasswordView2.newPassword, null);
                                    } else {
                                        loginActivityNewPasswordView2.recoverPassword(null, null);
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(imageView, LayoutHelper.createLinearRelatively(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                    outlineTextContainerView.addView(linearLayout, LayoutHelper.createFrame(-2.0f, -1));
                } else {
                    outlineTextContainerView.addView(this.codeField[i3], LayoutHelper.createFrame(-2.0f, -1));
                }
                outlineTextContainerView.attachedEditText = this.codeField[i3];
                outlineTextContainerView.invalidate();
                addView(outlineTextContainerView, LayoutHelper.createLinear(-1, -2, 1, 16, 16, 16, 0));
                this.codeField[i3].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView3, int i5, KeyEvent keyEvent) {
                        LoginActivity.LoginActivityNewPasswordView loginActivityNewPasswordView = this.f$0;
                        if (i3 == 0) {
                            EditTextBoldCursor[] editTextBoldCursorArr = loginActivityNewPasswordView.codeField;
                            if (editTextBoldCursorArr.length == 2) {
                                editTextBoldCursorArr[1].requestFocus();
                                return true;
                            }
                        }
                        if (i5 == 5) {
                            loginActivityNewPasswordView.onNextPressed(null);
                            return true;
                        }
                        loginActivityNewPasswordView.getClass();
                        return false;
                    }
                });
                i3++;
                f = 18.0f;
            }
            if (i == 0) {
                this.confirmTextView.setText(LocaleController.getString("PleaseEnterNewFirstPasswordLogin", R.string.PleaseEnterNewFirstPasswordLogin));
            } else {
                this.confirmTextView.setText(LocaleController.getString("PasswordHintTextLogin", R.string.PasswordHintTextLogin));
            }
            TextView textView3 = new TextView(context);
            this.cancelButton = textView3;
            textView3.setGravity(19);
            textView3.setTextSize(1, 15.0f);
            textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView3.setText(LocaleController.getString(R.string.YourEmailSkip));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(textView3, LayoutHelper.createFrame(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
            addView(frameLayout, LayoutHelper.createLinear(-1, -1, 80));
            new PhotoViewer.AnonymousClass14(textView3);
            final int i5 = 1;
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityNewPasswordView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            LoginActivity.LoginActivityNewPasswordView loginActivityNewPasswordView = this.f$0;
                            loginActivityNewPasswordView.isPasswordVisible = !loginActivityNewPasswordView.isPasswordVisible;
                            int i6 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = loginActivityNewPasswordView.codeField;
                                if (i6 >= editTextBoldCursorArr.length) {
                                    ImageView imageView2 = loginActivityNewPasswordView.passwordButton;
                                    imageView2.setTag(Boolean.valueOf(loginActivityNewPasswordView.isPasswordVisible));
                                    imageView2.setColorFilter(Theme.getColor(null, loginActivityNewPasswordView.isPasswordVisible ? Theme.key_windowBackgroundWhiteInputFieldActivated : Theme.key_windowBackgroundWhiteHintText, false));
                                } else {
                                    int selectionStart = editTextBoldCursorArr[i6].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i6].getSelectionEnd();
                                    editTextBoldCursorArr[i6].setInputType((loginActivityNewPasswordView.isPasswordVisible ? 144 : 128) | 1);
                                    editTextBoldCursorArr[i6].setSelection(selectionStart, selectionEnd);
                                    i6++;
                                }
                                break;
                            }
                            break;
                        default:
                            LoginActivity.LoginActivityNewPasswordView loginActivityNewPasswordView2 = this.f$0;
                            if (loginActivityNewPasswordView2.currentStage != 0) {
                                loginActivityNewPasswordView2.recoverPassword(loginActivityNewPasswordView2.newPassword, null);
                            } else {
                                loginActivityNewPasswordView2.recoverPassword(null, null);
                            }
                            break;
                    }
                }
            });
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("NewPassword", R.string.NewPassword);
        }

        @Override
        public final boolean needBackButton() {
            return true;
        }

        @Override
        public final boolean onBackPressed(boolean z) {
            LoginActivity.this.needHideProgress(true, true);
            this.currentParams = null;
            this.nextPressed = false;
            return true;
        }

        @Override
        public final void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public final void onNextPressed(String str) {
            if (this.nextPressed) {
                return;
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.codeField;
            String string = editTextBoldCursorArr[0].getText().toString();
            int length = string.length();
            LoginActivity loginActivity = LoginActivity.this;
            if (length == 0) {
                if (loginActivity.getParentActivity() == null) {
                    return;
                }
                try {
                    editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.shakeView(editTextBoldCursorArr[0]);
                return;
            }
            if (this.currentStage != 0) {
                this.nextPressed = true;
                loginActivity.needShowProgress(0, true);
                recoverPassword(this.newPassword, string);
            } else {
                if (!string.equals(editTextBoldCursorArr[1].getText().toString())) {
                    if (loginActivity.getParentActivity() == null) {
                        return;
                    }
                    try {
                        editTextBoldCursorArr[1].performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    AndroidUtilities.shakeView(editTextBoldCursorArr[1]);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("emailCode", this.emailCode);
                bundle.putString("new_password", string);
                bundle.putString("password", this.passwordString);
                loginActivity.setPage(10, true, bundle, false);
            }
        }

        @Override
        public final void onShow() {
            AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda6(this, 16), LoginActivity.SHOW_DELAY);
        }

        public final void recoverPassword(String str, String str2) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.emailCode;
            if (!TextUtils.isEmpty(str)) {
                tL_auth_recoverPassword.flags |= 1;
                TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
                tL_auth_recoverPassword.new_settings = passwordinputsettings;
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = str2 != null ? str2 : "";
                passwordinputsettings.new_algo = this.currentPassword.new_algo;
            }
            Utilities.globalQueue.postRunnable(new LinkManager$$ExternalSyntheticLambda12(this, str, str2, tL_auth_recoverPassword, 10));
        }

        @Override
        public final void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.currentStage);
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
        }

        @Override
        public final void saveStateParams(Bundle bundle) {
            if (this.currentParams != null) {
                bundle.putBundle("recoveryview_params" + this.currentStage, this.currentParams);
            }
        }

        @Override
        public final void setParams(Bundle bundle, boolean z) {
            EditTextBoldCursor[] editTextBoldCursorArr;
            if (bundle == null) {
                return;
            }
            int i = 0;
            while (true) {
                editTextBoldCursorArr = this.codeField;
                if (i >= editTextBoldCursorArr.length) {
                    break;
                }
                editTextBoldCursorArr[i].setText("");
                i++;
            }
            this.currentParams = bundle;
            this.emailCode = bundle.getString("emailCode");
            String string = this.currentParams.getString("password");
            this.passwordString = string;
            if (string != null) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                TL_account.Password passwordTLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                this.currentPassword = passwordTLdeserialize;
                TwoStepVerificationActivity.initPasswordNewAlgo(passwordTLdeserialize);
            }
            this.newPassword = this.currentParams.getString("new_password");
            EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
            if (!LoginActivity.this.isCustomKeyboardVisible()) {
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            }
            editTextBoldCursorArr[0].requestFocus();
        }

        @Override
        public final void updateColors$1() {
            this.titleTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            this.confirmTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
            for (EditTextBoldCursor editTextBoldCursor : this.codeField) {
                editTextBoldCursor.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
                editTextBoldCursor.setCursorColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false));
            }
            for (OutlineTextContainerView outlineTextContainerView : this.outlineFields) {
                outlineTextContainerView.updateColor();
            }
            this.cancelButton.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            ImageView imageView = this.passwordButton;
            if (imageView != null) {
                imageView.setColorFilter(Theme.getColor(null, this.isPasswordVisible ? Theme.key_windowBackgroundWhiteInputFieldActivated : Theme.key_windowBackgroundWhiteHintText, false));
                imageView.setBackground(Theme.createSelectorDrawable(LoginActivity.this.getThemedColor(Theme.key_listSelector), 1, -1));
            }
        }
    }

    public final class LoginActivityPasswordView extends SlideView {
        public final TextView cancelButton;
        public final EditTextBoldCursor codeField;
        public final TextView confirmTextView;
        public Bundle currentParams;
        public TL_account.Password currentPassword;
        public final RLottieImageView lockImageView;
        public boolean nextPressed;
        public final OutlineTextContainerView outlineCodeField;
        public String passwordString;
        public String phoneCode;
        public String phoneHash;
        public String requestPhone;
        public final TextView titleView;

        public LoginActivityPasswordView(Context context) {
            int i;
            super(context);
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.lockImageView = rLottieImageView;
            rLottieImageView.setAnimation(R.raw.tsv_setup_intro, 120, 120, null);
            rLottieImageView.setAutoRepeat(false);
            frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(120, 120, 1));
            if (AndroidUtilities.isSmallScreen()) {
                i = 8;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y || AndroidUtilities.isTablet()) {
                    i = 0;
                } else {
                    i = 8;
                }
            }
            frameLayout.setVisibility(i);
            addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            zzkk.m(18.0f, 1, textView);
            textView.setText(LocaleController.getString(R.string.YourPasswordHeader));
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.confirmTextView = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView2.setText(LocaleController.getString(R.string.LoginPasswordTextShort));
            addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 12, 8, 12, 0));
            OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context, null);
            this.outlineCodeField = outlineTextContainerView;
            outlineTextContainerView.setText(LocaleController.getString(R.string.EnterPassword));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.codeField = editTextBoldCursor;
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setBackground(null);
            editTextBoldCursor.setImeOptions(268435461);
            editTextBoldCursor.setTextSize(1, 18.0f);
            editTextBoldCursor.setMaxLines(1);
            int iDp = AndroidUtilities.dp(16.0f);
            editTextBoldCursor.setPadding(iDp, iDp, iDp, iDp);
            editTextBoldCursor.setInputType(129);
            editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editTextBoldCursor.setTypeface(Typeface.DEFAULT);
            editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
            editTextBoldCursor.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, 8));
            outlineTextContainerView.attachedEditText = editTextBoldCursor;
            outlineTextContainerView.invalidate();
            outlineTextContainerView.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, -2, 48));
            editTextBoldCursor.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, 16));
            addView(outlineTextContainerView, LayoutHelper.createLinear(-1, -2, 1, 16, 32, 16, 0));
            TextView textView3 = new TextView(context);
            this.cancelButton = textView3;
            textView3.setGravity(19);
            textView3.setText(LocaleController.getString(R.string.ForgotPassword));
            textView3.setTextSize(1, 15.0f);
            textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.addView(textView3, LayoutHelper.createFrame(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
            addView(frameLayout2, LayoutHelper.createLinear(-1, -1, 80));
            new PhotoViewer.AnonymousClass14(textView3);
            textView3.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(25, this, context));
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("LoginPassword", R.string.LoginPassword);
        }

        @Override
        public final boolean needBackButton() {
            return true;
        }

        @Override
        public final boolean onBackPressed(boolean z) {
            this.nextPressed = false;
            LoginActivity.this.needHideProgress(true, true);
            this.currentParams = null;
            return true;
        }

        @Override
        public final void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public final void onNextPressed(String str) {
            if (this.nextPressed || this.currentPassword == null) {
                return;
            }
            String string = this.codeField.getText().toString();
            if (string.length() == 0) {
                if (LoginActivity.this.getParentActivity() == null) {
                    return;
                }
                LoginActivity.onFieldError(this.outlineCodeField, true);
            } else {
                this.nextPressed = true;
                LoginActivity.this.needShowProgress(0, true);
                Utilities.globalQueue.postRunnable(new LinkManager$$ExternalSyntheticLambda2(8, this, string));
            }
        }

        @Override
        public final void onShow() {
            AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda6(this, 17), LoginActivity.SHOW_DELAY);
        }

        @Override
        public final void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("passview_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            String string = bundle.getString("passview_code");
            if (string != null) {
                this.codeField.setText(string);
            }
        }

        @Override
        public final void saveStateParams(Bundle bundle) {
            String string = this.codeField.getText().toString();
            if (string.length() != 0) {
                bundle.putString("passview_code", string);
            }
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("passview_params", bundle2);
            }
        }

        @Override
        public final void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            boolean zIsEmpty = bundle.isEmpty();
            EditTextBoldCursor editTextBoldCursor = this.codeField;
            if (zIsEmpty) {
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                return;
            }
            editTextBoldCursor.setText("");
            this.currentParams = bundle;
            String string = bundle.getString("password");
            this.passwordString = string;
            if (string != null) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                this.currentPassword = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            }
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = bundle.getString("phoneHash");
            this.phoneCode = bundle.getString("code");
            TL_account.Password password = this.currentPassword;
            if (password == null || TextUtils.isEmpty(password.hint)) {
                editTextBoldCursor.setHint((CharSequence) null);
            } else {
                editTextBoldCursor.setHint(this.currentPassword.hint);
            }
        }

        @Override
        public final void updateColors$1() {
            TextView textView = this.titleView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(null, i, false));
            this.confirmTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
            EditTextBoldCursor editTextBoldCursor = this.codeField;
            editTextBoldCursor.setTextColor(Theme.getColor(null, i, false));
            editTextBoldCursor.setCursorColor(Theme.getColor(null, i, false));
            editTextBoldCursor.setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
            this.cancelButton.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            this.outlineCodeField.updateColor();
        }
    }

    public final class LoginActivityPhraseView extends SlideView {
        public String beginning;
        public final LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1 checkPasteRunnable;
        public final UsersSelectActivity.AnonymousClass4 codeField;
        public final TextView confirmTextView;
        public Bundle currentParams;
        public final int currentType;
        public final LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1 dismissField;
        public String emailPhone;
        public boolean errorShown;
        public final TextView errorTextView;
        public final RLottieImageView imageView;
        public final TextView infoTextView;
        public boolean isResendingCode;
        public double lastCurrentTime;
        public TLRPC.TL_auth_sentCode nextCodeAuth;
        public Bundle nextCodeParams;
        public boolean nextPressed;
        public int nextType;
        public final OutlineTextContainerView outlineField;
        public boolean pasteShown;
        public final TextView pasteTextView;
        public boolean pasted;
        public String phone;
        public String phoneHash;
        public int prevType;
        public final LoadingTextView prevTypeTextView;
        public String requestPhone;
        public float shiftDp;
        public int time;
        public final LoginActivitySmsView.AnonymousClass3 timeText;
        public Timer timeTimer;
        public final Object timerSync;
        public final TextView titleTextView;

        public final class AnonymousClass4 extends TimerTask {
            public AnonymousClass4() {
            }

            @Override
            public final void run() {
                if (LoginActivityPhraseView.this.timeTimer == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda6(this, 20));
            }
        }

        public LoginActivityPhraseView(Context context, int i) {
            boolean z;
            super(context);
            this.pasteShown = true;
            this.errorShown = false;
            this.pasted = false;
            this.timerSync = new Object();
            this.time = 60000;
            this.checkPasteRunnable = new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1(this, 0);
            this.dismissField = new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1(this, 2);
            this.shiftDp = -3.0f;
            this.currentType = i;
            boolean z2 = i != 16;
            setOrientation(1);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            rLottieImageView.setAnimation(R.raw.bubble, 95, 95, null);
            if (AndroidUtilities.isSmallScreen()) {
                z = true;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y || AndroidUtilities.isTablet()) {
                    z = false;
                } else {
                    z = true;
                }
            }
            rLottieImageView.setVisibility(z ? 8 : 0);
            addView(rLottieImageView, LayoutHelper.createLinear(95, 95, 1, 0, 10, 0, 5));
            TextView textView = new TextView(context);
            this.titleTextView = textView;
            textView.setTextSize(1, 18.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView.setGravity(49);
            textView.setText(LocaleController.getString(!z2 ? R.string.SMSWordTitle : R.string.SMSPhraseTitle));
            addView(textView, LayoutHelper.createLinear(-2, -2, 1, 8, z ? 25 : 0, 8, 0));
            TextView textView2 = new TextView(context);
            this.confirmTextView = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 8, 5, 8, 16));
            OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context, null);
            this.outlineField = outlineTextContainerView;
            outlineTextContainerView.setText(LocaleController.getString(!z2 ? R.string.SMSWord : R.string.SMSPhrase));
            UsersSelectActivity.AnonymousClass4 anonymousClass4 = new UsersSelectActivity.AnonymousClass4(this, context, 9);
            this.codeField = anonymousClass4;
            anonymousClass4.setSingleLine();
            anonymousClass4.setLines(1);
            anonymousClass4.setCursorSize(AndroidUtilities.dp(20.0f));
            anonymousClass4.setCursorWidth(1.5f);
            anonymousClass4.setImeOptions(268435461);
            anonymousClass4.setTextSize(1, 18.0f);
            anonymousClass4.setMaxLines(1);
            anonymousClass4.setBackground(null);
            anonymousClass4.setHint(LocaleController.getString(!z2 ? R.string.SMSWordHint : R.string.SMSPhraseHint));
            anonymousClass4.addTextChangedListener(new EditTextCell.AnonymousClass3(this));
            anonymousClass4.setEllipsizeByGradient(true);
            anonymousClass4.setInputType(1);
            anonymousClass4.setTypeface(Typeface.DEFAULT);
            anonymousClass4.setGravity(LocaleController.isRTL ? 5 : 3);
            anonymousClass4.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, 9));
            TextView textView3 = new TextView(context);
            this.pasteTextView = textView3;
            zzkk.m(12.0f, 1, textView3);
            textView3.setPadding(zzlm.m(10.0f, R.string.Paste, textView3), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setGravity(17);
            int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2, ((BaseFragment) LoginActivity.this).resourceProvider);
            textView3.setTextColor(color);
            int iDp = AndroidUtilities.dp(6.0f);
            int iMultAlpha = Theme.multAlpha(0.12f, color);
            int iMultAlpha2 = Theme.multAlpha(0.15f, color);
            textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, iMultAlpha, iMultAlpha2, iMultAlpha2));
            ScaleStateListAnimator.apply(textView3, 0.1f, 1.5f);
            anonymousClass4.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f));
            final int i2 = 0;
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityPhraseView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    CharSequence charSequenceCoerceToText;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode;
                    switch (i2) {
                        case 0:
                            LoginActivity.LoginActivityPhraseView loginActivityPhraseView = this.f$0;
                            try {
                                charSequenceCoerceToText = ((ClipboardManager) loginActivityPhraseView.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(loginActivityPhraseView.getContext());
                            } catch (Exception e) {
                                FileLog.e(e);
                                charSequenceCoerceToText = null;
                            }
                            if (charSequenceCoerceToText != null) {
                                UsersSelectActivity.AnonymousClass4 anonymousClass5 = loginActivityPhraseView.codeField;
                                Editable text = anonymousClass5.getText();
                                loginActivityPhraseView.pasted = true;
                                if (text != null) {
                                    int iMax = Math.max(0, anonymousClass5.getSelectionStart());
                                    text.replace(iMax, Math.max(iMax, anonymousClass5.getSelectionEnd()), charSequenceCoerceToText);
                                }
                            }
                            loginActivityPhraseView.checkPaste(true);
                            break;
                        case 1:
                            this.f$0.onBackPressed(true);
                            break;
                        default:
                            final LoginActivity.LoginActivityPhraseView loginActivityPhraseView2 = this.f$0;
                            if (loginActivityPhraseView2.time <= 0 || loginActivityPhraseView2.timeTimer == null) {
                                Bundle bundle = loginActivityPhraseView2.nextCodeParams;
                                LoginActivity loginActivity = LoginActivity.this;
                                if (bundle != null && (tL_auth_sentCode = loginActivityPhraseView2.nextCodeAuth) != null) {
                                    loginActivity.fillNextCodeParams(bundle, tL_auth_sentCode, true);
                                    break;
                                } else {
                                    int i3 = loginActivityPhraseView2.nextType;
                                    LoginActivity.LoginActivitySmsView.AnonymousClass3 anonymousClass3 = loginActivityPhraseView2.timeText;
                                    if (i3 == 4 || i3 == 2 || i3 == 11 || i3 == 15) {
                                        loginActivityPhraseView2.isResendingCode = true;
                                        anonymousClass3.invalidate();
                                        anonymousClass3.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                                        anonymousClass3.setTextSize(1, 15.0f);
                                        int i4 = loginActivityPhraseView2.nextType;
                                        if (i4 == 4 || i4 == 11) {
                                            anonymousClass3.setText(LocaleController.getString(R.string.Calling));
                                        } else {
                                            anonymousClass3.setText(LocaleController.getString(R.string.SendingSms));
                                        }
                                        final Bundle bundle2 = new Bundle();
                                        bundle2.putString("phone", loginActivityPhraseView2.phone);
                                        bundle2.putString("ephone", loginActivityPhraseView2.emailPhone);
                                        bundle2.putString("phoneFormated", loginActivityPhraseView2.requestPhone);
                                        bundle2.putInt("prevType", loginActivityPhraseView2.currentType);
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = loginActivityPhraseView2.requestPhone;
                                        tL_auth_resendCode.phone_code_hash = loginActivityPhraseView2.phoneHash;
                                        final int i5 = 0;
                                        ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                switch (i5) {
                                                    case 0:
                                                        LoginActivity.LoginActivityPhraseView loginActivityPhraseView3 = loginActivityPhraseView2;
                                                        loginActivityPhraseView3.getClass();
                                                        AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda13(loginActivityPhraseView3, tLObject, bundle2, tL_error));
                                                        break;
                                                    default:
                                                        LoginActivity.LoginActivityPhraseView loginActivityPhraseView4 = loginActivityPhraseView2;
                                                        loginActivityPhraseView4.getClass();
                                                        AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda13(loginActivityPhraseView4, tL_error, bundle2, tLObject));
                                                        break;
                                                }
                                            }
                                        }, 10);
                                        break;
                                    } else if (i3 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!loginActivityPhraseView2.nextPressed && !loginActivityPhraseView2.isResendingCode && !loginActivity.isRequestingFirebaseSms) {
                                            loginActivityPhraseView2.isResendingCode = true;
                                            anonymousClass3.invalidate();
                                            anonymousClass3.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", loginActivityPhraseView2.phone);
                                            bundle3.putString("ephone", loginActivityPhraseView2.emailPhone);
                                            bundle3.putString("phoneFormated", loginActivityPhraseView2.requestPhone);
                                            loginActivityPhraseView2.nextPressed = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = loginActivityPhraseView2.requestPhone;
                                            tL_auth_resendCode2.phone_code_hash = loginActivityPhraseView2.phoneHash;
                                            final int i6 = 1;
                                            loginActivity.needShowProgress(ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(tL_auth_resendCode2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i6) {
                                                        case 0:
                                                            LoginActivity.LoginActivityPhraseView loginActivityPhraseView3 = loginActivityPhraseView2;
                                                            loginActivityPhraseView3.getClass();
                                                            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda13(loginActivityPhraseView3, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            LoginActivity.LoginActivityPhraseView loginActivityPhraseView4 = loginActivityPhraseView2;
                                                            loginActivityPhraseView4.getClass();
                                                            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda13(loginActivityPhraseView4, tL_error, bundle3, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            outlineTextContainerView.addView(anonymousClass4, LayoutHelper.createFrame(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            outlineTextContainerView.attachedEditText = anonymousClass4;
            outlineTextContainerView.invalidate();
            outlineTextContainerView.addView(textView3, LayoutHelper.createFrame(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(outlineTextContainerView, LayoutHelper.createLinear(-1, -2, 1));
            addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1, 16, 3, 16, 0));
            anonymousClass4.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, 17));
            FrameLayout frameLayout = new FrameLayout(context);
            linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
            LoadingTextView loadingTextView = new LoadingTextView(LoginActivity.this, context);
            this.prevTypeTextView = loadingTextView;
            int i3 = Theme.key_windowBackgroundWhiteValueText;
            loadingTextView.setLinkTextColor(Theme.getColor(null, i3, false));
            loadingTextView.setTextColor(LoginActivity.this.getThemedColor(i3));
            loadingTextView.setTextSize(1, 14.0f);
            loadingTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            loadingTextView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            final int i4 = 1;
            loadingTextView.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityPhraseView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    CharSequence charSequenceCoerceToText;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode;
                    switch (i4) {
                        case 0:
                            LoginActivity.LoginActivityPhraseView loginActivityPhraseView = this.f$0;
                            try {
                                charSequenceCoerceToText = ((ClipboardManager) loginActivityPhraseView.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(loginActivityPhraseView.getContext());
                            } catch (Exception e) {
                                FileLog.e(e);
                                charSequenceCoerceToText = null;
                            }
                            if (charSequenceCoerceToText != null) {
                                UsersSelectActivity.AnonymousClass4 anonymousClass5 = loginActivityPhraseView.codeField;
                                Editable text = anonymousClass5.getText();
                                loginActivityPhraseView.pasted = true;
                                if (text != null) {
                                    int iMax = Math.max(0, anonymousClass5.getSelectionStart());
                                    text.replace(iMax, Math.max(iMax, anonymousClass5.getSelectionEnd()), charSequenceCoerceToText);
                                }
                            }
                            loginActivityPhraseView.checkPaste(true);
                            break;
                        case 1:
                            this.f$0.onBackPressed(true);
                            break;
                        default:
                            final LoginActivity.LoginActivityPhraseView loginActivityPhraseView2 = this.f$0;
                            if (loginActivityPhraseView2.time <= 0 || loginActivityPhraseView2.timeTimer == null) {
                                Bundle bundle = loginActivityPhraseView2.nextCodeParams;
                                LoginActivity loginActivity = LoginActivity.this;
                                if (bundle != null && (tL_auth_sentCode = loginActivityPhraseView2.nextCodeAuth) != null) {
                                    loginActivity.fillNextCodeParams(bundle, tL_auth_sentCode, true);
                                    break;
                                } else {
                                    int i5 = loginActivityPhraseView2.nextType;
                                    LoginActivity.LoginActivitySmsView.AnonymousClass3 anonymousClass3 = loginActivityPhraseView2.timeText;
                                    if (i5 == 4 || i5 == 2 || i5 == 11 || i5 == 15) {
                                        loginActivityPhraseView2.isResendingCode = true;
                                        anonymousClass3.invalidate();
                                        anonymousClass3.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                                        anonymousClass3.setTextSize(1, 15.0f);
                                        int i6 = loginActivityPhraseView2.nextType;
                                        if (i6 == 4 || i6 == 11) {
                                            anonymousClass3.setText(LocaleController.getString(R.string.Calling));
                                        } else {
                                            anonymousClass3.setText(LocaleController.getString(R.string.SendingSms));
                                        }
                                        final Bundle bundle2 = new Bundle();
                                        bundle2.putString("phone", loginActivityPhraseView2.phone);
                                        bundle2.putString("ephone", loginActivityPhraseView2.emailPhone);
                                        bundle2.putString("phoneFormated", loginActivityPhraseView2.requestPhone);
                                        bundle2.putInt("prevType", loginActivityPhraseView2.currentType);
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = loginActivityPhraseView2.requestPhone;
                                        tL_auth_resendCode.phone_code_hash = loginActivityPhraseView2.phoneHash;
                                        final int i7 = 0;
                                        ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                switch (i7) {
                                                    case 0:
                                                        LoginActivity.LoginActivityPhraseView loginActivityPhraseView3 = loginActivityPhraseView2;
                                                        loginActivityPhraseView3.getClass();
                                                        AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda13(loginActivityPhraseView3, tLObject, bundle2, tL_error));
                                                        break;
                                                    default:
                                                        LoginActivity.LoginActivityPhraseView loginActivityPhraseView4 = loginActivityPhraseView2;
                                                        loginActivityPhraseView4.getClass();
                                                        AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda13(loginActivityPhraseView4, tL_error, bundle2, tLObject));
                                                        break;
                                                }
                                            }
                                        }, 10);
                                        break;
                                    } else if (i5 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!loginActivityPhraseView2.nextPressed && !loginActivityPhraseView2.isResendingCode && !loginActivity.isRequestingFirebaseSms) {
                                            loginActivityPhraseView2.isResendingCode = true;
                                            anonymousClass3.invalidate();
                                            anonymousClass3.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", loginActivityPhraseView2.phone);
                                            bundle3.putString("ephone", loginActivityPhraseView2.emailPhone);
                                            bundle3.putString("phoneFormated", loginActivityPhraseView2.requestPhone);
                                            loginActivityPhraseView2.nextPressed = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = loginActivityPhraseView2.requestPhone;
                                            tL_auth_resendCode2.phone_code_hash = loginActivityPhraseView2.phoneHash;
                                            final int i8 = 1;
                                            loginActivity.needShowProgress(ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(tL_auth_resendCode2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i8) {
                                                        case 0:
                                                            LoginActivity.LoginActivityPhraseView loginActivityPhraseView3 = loginActivityPhraseView2;
                                                            loginActivityPhraseView3.getClass();
                                                            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda13(loginActivityPhraseView3, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            LoginActivity.LoginActivityPhraseView loginActivityPhraseView4 = loginActivityPhraseView2;
                                                            loginActivityPhraseView4.getClass();
                                                            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda13(loginActivityPhraseView4, tL_error, bundle3, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            addView(loadingTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 18, 0, 0));
            loadingTextView.setVisibility(8);
            TextView textView4 = new TextView(context);
            this.errorTextView = textView4;
            textView4.setPivotX(0.0f);
            textView4.setPivotY(0.0f);
            textView4.setText(LocaleController.getString(!z2 ? R.string.SMSWordError : R.string.SMSPhraseError));
            textView4.setTextColor(LoginActivity.this.getThemedColor(Theme.key_text_RedRegular));
            textView4.setTextSize(1, 13.0f);
            frameLayout.addView(textView4, LayoutHelper.createFrame(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
            textView4.setAlpha(0.0f);
            textView4.setScaleX(0.8f);
            textView4.setScaleY(0.8f);
            textView4.setTranslationY(-AndroidUtilities.dp(4.0f));
            TextView textView5 = new TextView(context);
            this.infoTextView = textView5;
            textView5.setPivotX(0.0f);
            textView5.setPivotY(0.0f);
            textView5.setText(LocaleController.getString(!z2 ? R.string.SMSWordPasteHint : R.string.SMSPhrasePasteHint));
            textView5.setTextColor(LoginActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
            textView5.setTextSize(1, 13.0f);
            frameLayout.addView(textView5, LayoutHelper.createFrame(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
            LoginActivitySmsView.AnonymousClass3 anonymousClass3 = new LoginActivitySmsView.AnonymousClass3(this, context);
            this.timeText = anonymousClass3;
            anonymousClass3.setLinkTextColor(Theme.getColor(null, i3, false));
            anonymousClass3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            anonymousClass3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            anonymousClass3.setTextSize(1, 15.0f);
            anonymousClass3.setGravity(19);
            final int i5 = 2;
            anonymousClass3.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityPhraseView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    CharSequence charSequenceCoerceToText;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode;
                    switch (i5) {
                        case 0:
                            LoginActivity.LoginActivityPhraseView loginActivityPhraseView = this.f$0;
                            try {
                                charSequenceCoerceToText = ((ClipboardManager) loginActivityPhraseView.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(loginActivityPhraseView.getContext());
                            } catch (Exception e) {
                                FileLog.e(e);
                                charSequenceCoerceToText = null;
                            }
                            if (charSequenceCoerceToText != null) {
                                UsersSelectActivity.AnonymousClass4 anonymousClass5 = loginActivityPhraseView.codeField;
                                Editable text = anonymousClass5.getText();
                                loginActivityPhraseView.pasted = true;
                                if (text != null) {
                                    int iMax = Math.max(0, anonymousClass5.getSelectionStart());
                                    text.replace(iMax, Math.max(iMax, anonymousClass5.getSelectionEnd()), charSequenceCoerceToText);
                                }
                            }
                            loginActivityPhraseView.checkPaste(true);
                            break;
                        case 1:
                            this.f$0.onBackPressed(true);
                            break;
                        default:
                            final LoginActivity.LoginActivityPhraseView loginActivityPhraseView2 = this.f$0;
                            if (loginActivityPhraseView2.time <= 0 || loginActivityPhraseView2.timeTimer == null) {
                                Bundle bundle = loginActivityPhraseView2.nextCodeParams;
                                LoginActivity loginActivity = LoginActivity.this;
                                if (bundle != null && (tL_auth_sentCode = loginActivityPhraseView2.nextCodeAuth) != null) {
                                    loginActivity.fillNextCodeParams(bundle, tL_auth_sentCode, true);
                                    break;
                                } else {
                                    int i6 = loginActivityPhraseView2.nextType;
                                    LoginActivity.LoginActivitySmsView.AnonymousClass3 anonymousClass6 = loginActivityPhraseView2.timeText;
                                    if (i6 == 4 || i6 == 2 || i6 == 11 || i6 == 15) {
                                        loginActivityPhraseView2.isResendingCode = true;
                                        anonymousClass6.invalidate();
                                        anonymousClass6.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                                        anonymousClass6.setTextSize(1, 15.0f);
                                        int i7 = loginActivityPhraseView2.nextType;
                                        if (i7 == 4 || i7 == 11) {
                                            anonymousClass6.setText(LocaleController.getString(R.string.Calling));
                                        } else {
                                            anonymousClass6.setText(LocaleController.getString(R.string.SendingSms));
                                        }
                                        final Bundle bundle2 = new Bundle();
                                        bundle2.putString("phone", loginActivityPhraseView2.phone);
                                        bundle2.putString("ephone", loginActivityPhraseView2.emailPhone);
                                        bundle2.putString("phoneFormated", loginActivityPhraseView2.requestPhone);
                                        bundle2.putInt("prevType", loginActivityPhraseView2.currentType);
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = loginActivityPhraseView2.requestPhone;
                                        tL_auth_resendCode.phone_code_hash = loginActivityPhraseView2.phoneHash;
                                        final int i8 = 0;
                                        ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                switch (i8) {
                                                    case 0:
                                                        LoginActivity.LoginActivityPhraseView loginActivityPhraseView3 = loginActivityPhraseView2;
                                                        loginActivityPhraseView3.getClass();
                                                        AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda13(loginActivityPhraseView3, tLObject, bundle2, tL_error));
                                                        break;
                                                    default:
                                                        LoginActivity.LoginActivityPhraseView loginActivityPhraseView4 = loginActivityPhraseView2;
                                                        loginActivityPhraseView4.getClass();
                                                        AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda13(loginActivityPhraseView4, tL_error, bundle2, tLObject));
                                                        break;
                                                }
                                            }
                                        }, 10);
                                        break;
                                    } else if (i6 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!loginActivityPhraseView2.nextPressed && !loginActivityPhraseView2.isResendingCode && !loginActivity.isRequestingFirebaseSms) {
                                            loginActivityPhraseView2.isResendingCode = true;
                                            anonymousClass6.invalidate();
                                            anonymousClass6.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", loginActivityPhraseView2.phone);
                                            bundle3.putString("ephone", loginActivityPhraseView2.emailPhone);
                                            bundle3.putString("phoneFormated", loginActivityPhraseView2.requestPhone);
                                            loginActivityPhraseView2.nextPressed = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = loginActivityPhraseView2.requestPhone;
                                            tL_auth_resendCode2.phone_code_hash = loginActivityPhraseView2.phoneHash;
                                            final int i9 = 1;
                                            loginActivity.needShowProgress(ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(tL_auth_resendCode2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i9) {
                                                        case 0:
                                                            LoginActivity.LoginActivityPhraseView loginActivityPhraseView3 = loginActivityPhraseView2;
                                                            loginActivityPhraseView3.getClass();
                                                            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda13(loginActivityPhraseView3, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            LoginActivity.LoginActivityPhraseView loginActivityPhraseView4 = loginActivityPhraseView2;
                                                            loginActivityPhraseView4.getClass();
                                                            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda13(loginActivityPhraseView4, tL_error, bundle3, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.addView(anonymousClass3, LayoutHelper.createFrame(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
            addView(frameLayout2, LayoutHelper.createLinear(-1, -1, 80));
            new PhotoViewer.AnonymousClass14(anonymousClass3);
        }

        public final void animateError(boolean z) {
            this.errorShown = z;
            float f = 0.0f;
            float f2 = z ? 1.0f : 0.0f;
            OutlineTextContainerView.animateSpring(this.outlineField.errorSpring, f2);
            float f3 = (f2 * 0.1f) + 0.9f;
            ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.errorTextView.animate().scaleX(f3).scaleY(f3).alpha(f2).translationY((1.0f - f2) * AndroidUtilities.dp(-5.0f));
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            OKLCH.m(viewPropertyAnimatorTranslationY, cubicBezierInterpolator, 290L);
            if (this.pasteShown && !this.errorShown) {
                f = 1.0f;
            }
            float f4 = (0.1f * f) + 0.9f;
            this.infoTextView.animate().scaleX(f4).scaleY(f4).alpha(f).translationY((1.0f - f) * AndroidUtilities.dp(this.errorShown ? 5.0f : -5.0f)).setInterpolator(cubicBezierInterpolator).setDuration(290L).start();
        }

        public final void checkPaste(boolean z) {
            LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1 loginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1 = this.checkPasteRunnable;
            AndroidUtilities.cancelRunOnUIThread(loginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1);
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            boolean z2 = TextUtils.isEmpty(this.codeField.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip();
            if (this.pasteShown != z2) {
                this.pasteShown = z2;
                TextView textView = this.pasteTextView;
                TextView textView2 = this.infoTextView;
                float f = 0.9f;
                float fDp = 0.0f;
                if (z) {
                    ViewPropertyAnimator viewPropertyAnimatorScaleY = textView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.7f).scaleY(z2 ? 1.0f : 0.7f);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    OKLCH.m(viewPropertyAnimatorScaleY, cubicBezierInterpolator, 300L);
                    ViewPropertyAnimator viewPropertyAnimatorScaleX = textView2.animate().scaleX((!this.pasteShown || this.errorShown) ? 0.9f : 1.0f);
                    if (this.pasteShown && !this.errorShown) {
                        f = 1.0f;
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAlpha = viewPropertyAnimatorScaleX.scaleY(f).alpha((!this.pasteShown || this.errorShown) ? 0.0f : 1.0f);
                    if (!this.pasteShown || this.errorShown) {
                        fDp = AndroidUtilities.dp(this.errorShown ? 5.0f : -5.0f);
                    }
                    viewPropertyAnimatorAlpha.translationY(fDp).setInterpolator(cubicBezierInterpolator).setDuration(300L).start();
                } else {
                    textView.setAlpha(z2 ? 1.0f : 0.0f);
                    textView.setScaleX(z2 ? 1.0f : 0.7f);
                    textView.setScaleY(z2 ? 1.0f : 0.7f);
                    textView2.setScaleX((!this.pasteShown || this.errorShown) ? 0.9f : 1.0f);
                    if (this.pasteShown && !this.errorShown) {
                        f = 1.0f;
                    }
                    textView2.setScaleY(f);
                    textView2.setAlpha((!this.pasteShown || this.errorShown) ? 0.0f : 1.0f);
                    if (!this.pasteShown || this.errorShown) {
                        fDp = AndroidUtilities.dp(this.errorShown ? 5.0f : -5.0f);
                    }
                    textView2.setTranslationY(fDp);
                }
            }
            AndroidUtilities.runOnUIThread(loginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1, 5000L);
        }

        public final void destroyTimer$2() {
            LoginActivitySmsView.AnonymousClass3 anonymousClass3 = this.timeText;
            int i = Theme.key_windowBackgroundWhiteGrayText;
            anonymousClass3.setTextColor(Theme.getColor(null, i, false));
            this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i));
            try {
                synchronized (this.timerSync) {
                    try {
                        Timer timer = this.timeTimer;
                        if (timer != null) {
                            timer.cancel();
                            this.timeTimer = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("NewPassword", R.string.NewPassword);
        }

        @Override
        public final boolean needBackButton() {
            return true;
        }

        @Override
        public final boolean onBackPressed(boolean z) {
            LoginActivity loginActivity = LoginActivity.this;
            loginActivity.needHideProgress(true, true);
            int i = this.prevType;
            if (i != 0) {
                loginActivity.setPage(i, true, null, true);
                return false;
            }
            this.currentParams = null;
            this.nextPressed = false;
            return true;
        }

        @Override
        public final void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public final void onHide() {
            AndroidUtilities.cancelRunOnUIThread(this.checkPasteRunnable);
        }

        public final void onInputError(boolean z) {
            UsersSelectActivity.AnonymousClass4 anonymousClass4 = this.codeField;
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            try {
                anonymousClass4.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            boolean z2 = this.currentType != 16;
            TextView textView = this.errorTextView;
            if (z) {
                textView.setText(LocaleController.getString(!z2 ? R.string.SMSWordBeginningError : R.string.SMSPhraseBeginningError));
            } else if (TextUtils.isEmpty(anonymousClass4.getText())) {
                textView.setText("");
            } else {
                textView.setText(LocaleController.getString(!z2 ? R.string.SMSWordError : R.string.SMSPhraseError));
            }
            if (!this.errorShown && !this.pasted) {
                AndroidUtilities.shakeViewSpring(anonymousClass4, this.shiftDp);
                AndroidUtilities.shakeViewSpring(textView, this.shiftDp);
            }
            LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1 loginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1 = this.dismissField;
            AndroidUtilities.cancelRunOnUIThread(loginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1);
            animateError(true);
            AndroidUtilities.runOnUIThread(loginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1, 10000L);
            this.shiftDp = -this.shiftDp;
        }

        @Override
        public final void onNextPressed(String str) {
            boolean zEquals;
            if (this.nextPressed) {
                return;
            }
            String string = this.codeField.getText().toString();
            if (string.length() == 0) {
                onInputError(false);
                return;
            }
            if (this.beginning == null) {
                zEquals = true;
            } else {
                int length = string.length();
                int i = 0;
                while (i < length && string.charAt(i) <= ' ') {
                    i++;
                }
                String lowerCase = ((i > 0 || length < string.length()) ? string.substring(i, length) : string).toLowerCase();
                String lowerCase2 = this.beginning.toLowerCase();
                int iMin = Math.min(lowerCase.length(), lowerCase2.length());
                if (iMin <= 0) {
                    zEquals = true;
                } else {
                    zEquals = TextUtils.equals(lowerCase.substring(0, iMin), lowerCase2.substring(0, iMin));
                }
            }
            if (!zEquals) {
                onInputError(true);
                return;
            }
            this.nextPressed = true;
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.requestPhone;
            tL_auth_signIn.phone_code = string;
            tL_auth_signIn.phone_code_hash = this.phoneHash;
            tL_auth_signIn.flags |= 1;
            LoginActivity loginActivity = LoginActivity.this;
            loginActivity.needShowProgress(loginActivity.getConnectionsManager().sendRequest(tL_auth_signIn, new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda0(this, tL_auth_signIn, 0), 10), true);
            loginActivity.showDoneButton(true, true);
        }

        @Override
        public final void onResume() {
            checkPaste(true);
        }

        @Override
        public final void onShow() {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1(this, 3), LoginActivity.SHOW_DELAY);
        }

        @Override
        public final void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.currentType);
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
        }

        @Override
        public final void saveStateParams(Bundle bundle) {
            if (this.currentParams != null) {
                bundle.putBundle("recoveryview_word" + this.currentType, this.currentParams);
            }
        }

        @Override
        public final void setParams(Bundle bundle, boolean z) {
            int i;
            LoginActivitySmsView.AnonymousClass3 anonymousClass3 = this.timeText;
            if (bundle == null) {
                if (this.nextCodeParams == null || this.nextCodeAuth == null) {
                    return;
                }
                anonymousClass3.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                int i2 = this.nextType;
                if (i2 == 17) {
                    i = R.string.ReturnEnteringPhrase;
                } else if (i2 == 16) {
                    i = R.string.ReturnEnteringWord;
                } else {
                    i = i2 == 3 ? R.string.ReturnPhoneCall : R.string.ReturnEnteringSMS;
                }
                anonymousClass3.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                return;
            }
            UsersSelectActivity.AnonymousClass4 anonymousClass4 = this.codeField;
            anonymousClass4.setText("");
            this.currentParams = bundle;
            this.beginning = null;
            this.nextType = bundle.getInt("nextType");
            this.prevType = bundle.getInt("prevType", 0);
            this.emailPhone = bundle.getString("ephone");
            if (this.currentParams.containsKey("beginning")) {
                this.beginning = this.currentParams.getString("beginning");
            }
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = bundle.getString("phoneHash");
            this.phone = this.currentParams.getString("phone");
            this.time = bundle.getInt("timeout");
            int i3 = this.prevType;
            LoadingTextView loadingTextView = this.prevTypeTextView;
            if (i3 == 17) {
                loadingTextView.setVisibility(0);
                loadingTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else if (i3 == 16) {
                loadingTextView.setVisibility(0);
                loadingTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else if (i3 == 1 || i3 == 2 || i3 == 4 || i3 == 3 || i3 == 15) {
                loadingTextView.setVisibility(0);
                loadingTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringCode), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else {
                loadingTextView.setVisibility(8);
            }
            this.nextCodeParams = null;
            this.nextCodeAuth = null;
            this.nextPressed = false;
            this.isResendingCode = false;
            LoginActivity loginActivity = LoginActivity.this;
            loginActivity.isRequestingFirebaseSms = false;
            anonymousClass3.invalidate();
            boolean z2 = this.currentType != 16;
            String str = "+" + PhoneFormat.getInstance().format(PhoneFormat.stripExceptNumbers(this.phone, false));
            String str2 = this.beginning;
            TextView textView = this.confirmTextView;
            if (str2 == null) {
                zzko.m(!z2 ? R.string.SMSWordText : R.string.SMSPhraseText, new Object[]{str}, textView);
            } else {
                zzko.m(!z2 ? R.string.SMSWordBeginningText : R.string.SMSPhraseBeginningText, new Object[]{str, str2}, textView);
            }
            if (!loginActivity.isCustomKeyboardVisible()) {
                AndroidUtilities.showKeyboard(anonymousClass4);
            }
            anonymousClass4.requestFocus();
            RLottieImageView rLottieImageView = this.imageView;
            if (rLottieImageView.getAnimatedDrawable() != null) {
                rLottieImageView.getAnimatedDrawable().setCurrentFrame(0, false, false);
            }
            AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda6(rLottieImageView, 18), 500L);
            checkPaste(false);
            animateError(false);
            this.lastCurrentTime = System.currentTimeMillis();
            int i4 = Theme.key_windowBackgroundWhiteGrayText;
            anonymousClass3.setTextColor(Theme.getColor(null, i4, false));
            int i5 = this.nextType;
            if (i5 != 2 && i5 != 4 && i5 != 3) {
                anonymousClass3.setVisibility(8);
                return;
            }
            if (this.timeTimer != null) {
                return;
            }
            anonymousClass3.setTextColor(Theme.getColor(null, i4, false));
            anonymousClass3.setTag(R.id.color_key_tag, Integer.valueOf(i4));
            Timer timer = new Timer();
            this.timeTimer = timer;
            timer.schedule(new AnonymousClass4(), 0L, 1000L);
        }

        @Override
        public final void updateColors$1() {
            TextView textView = this.titleTextView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            LoginActivity loginActivity = LoginActivity.this;
            textView.setTextColor(loginActivity.getThemedColor(i));
            this.confirmTextView.setTextColor(loginActivity.getThemedColor(Theme.key_windowBackgroundWhiteGrayText6));
            int themedColor = loginActivity.getThemedColor(i);
            UsersSelectActivity.AnonymousClass4 anonymousClass4 = this.codeField;
            anonymousClass4.setTextColor(themedColor);
            anonymousClass4.setCursorColor(loginActivity.getThemedColor(Theme.key_windowBackgroundWhiteInputFieldActivated));
            anonymousClass4.setHintTextColor(loginActivity.getThemedColor(Theme.key_windowBackgroundWhiteHintText));
            this.outlineField.updateColor();
        }
    }

    public final class LoginActivityRecoverView extends SlideView {
        public final PasscodeActivity.AnonymousClass8 codeFieldContainer;
        public final TextView confirmTextView;
        public Bundle currentParams;
        public final LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda0 errorColorTimeout;
        public final RLottieImageView inboxImageView;
        public boolean nextPressed;
        public String passwordString;
        public String phoneCode;
        public String phoneHash;
        public boolean postedErrorColorTimeout;
        public String requestPhone;
        public final TextView titleView;
        public final SpoilersTextView troubleButton;

        public LoginActivityRecoverView(Context context) {
            int i;
            super(context);
            this.errorColorTimeout = new LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda0(this, 1);
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.inboxImageView = rLottieImageView;
            rLottieImageView.setAnimation(R.raw.tsv_setup_mail, 120, 120, null);
            rLottieImageView.setAutoRepeat(false);
            frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(120, 120, 1));
            if (AndroidUtilities.isSmallScreen()) {
                i = 8;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y || AndroidUtilities.isTablet()) {
                    i = 0;
                } else {
                    i = 8;
                }
            }
            frameLayout.setVisibility(i);
            addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            zzkk.m(18.0f, 1, textView);
            textView.setText(LocaleController.getString(R.string.EnterCode));
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.confirmTextView = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView2.setText(LocaleController.getString(R.string.RestoreEmailSentInfo));
            addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 12, 8, 12, 0));
            PasscodeActivity.AnonymousClass8 anonymousClass8 = new PasscodeActivity.AnonymousClass8(this, context, 2);
            this.codeFieldContainer = anonymousClass8;
            anonymousClass8.setNumbersCount(6, 1);
            for (CodeNumberField codeNumberField : anonymousClass8.codeField) {
                codeNumberField.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                codeNumberField.addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 24));
                codeNumberField.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, 10));
            }
            addView(this.codeFieldContainer, LayoutHelper.createLinear(-2, 42, 1, 0, 32, 0, 0));
            SpoilersTextView spoilersTextView = new SpoilersTextView(context, null, false);
            this.troubleButton = spoilersTextView;
            spoilersTextView.setGravity(17);
            spoilersTextView.setTextSize(1, 14.0f);
            spoilersTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            spoilersTextView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            spoilersTextView.setMaxLines(2);
            spoilersTextView.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 6));
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.addView(spoilersTextView, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
            addView(frameLayout2, LayoutHelper.createLinear(1.0f, -1, 0));
            new PhotoViewer.AnonymousClass14(spoilersTextView);
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("LoginPassword", R.string.LoginPassword);
        }

        @Override
        public final boolean hasCustomKeyboard() {
            return true;
        }

        @Override
        public final boolean needBackButton() {
            return true;
        }

        @Override
        public final boolean onBackPressed(boolean z) {
            LoginActivity.this.needHideProgress(true, true);
            this.currentParams = null;
            this.nextPressed = false;
            return true;
        }

        @Override
        public final void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            removeCallbacks(this.errorColorTimeout);
        }

        @Override
        public final void onNextPressed(String str) {
            if (this.nextPressed) {
                return;
            }
            PasscodeActivity.AnonymousClass8 anonymousClass8 = this.codeFieldContainer;
            anonymousClass8.isFocusSuppressed = true;
            for (CodeNumberField codeNumberField : anonymousClass8.codeField) {
                CodeNumberField.animateSpring(codeNumberField.focusedSpringAnimation, 0.0f);
            }
            String code = anonymousClass8.getCode();
            if (code.length() == 0) {
                onPasscodeError$3(false);
                return;
            }
            this.nextPressed = true;
            LoginActivity loginActivity = LoginActivity.this;
            loginActivity.needShowProgress(0, true);
            TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
            tL_auth_checkRecoveryPassword.code = code;
            ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new LinkManager$$ExternalSyntheticLambda8(27, this, code), 10);
        }

        public final void onPasscodeError$3(boolean z) {
            PasscodeActivity.AnonymousClass8 anonymousClass8 = this.codeFieldContainer;
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            try {
                anonymousClass8.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (z) {
                for (CodeNumberField codeNumberField : anonymousClass8.codeField) {
                    codeNumberField.setText("");
                }
            }
            for (CodeNumberField codeNumberField2 : anonymousClass8.codeField) {
                CodeNumberField.animateSpring(codeNumberField2.errorSpringAnimation, 100.0f);
            }
            anonymousClass8.codeField[0].requestFocus();
            AndroidUtilities.shakeViewSpring(anonymousClass8, new LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda0(this, 2));
        }

        @Override
        public final void onShow() {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda0(this, 0), LoginActivity.SHOW_DELAY);
        }

        @Override
        public final void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("recoveryview_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            String string = bundle.getString("recoveryview_code");
            if (string != null) {
                this.codeFieldContainer.setText(string);
            }
        }

        @Override
        public final void saveStateParams(Bundle bundle) {
            String code = this.codeFieldContainer.getCode();
            if (code != null && code.length() != 0) {
                bundle.putString("recoveryview_code", code);
            }
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("recoveryview_params", bundle2);
            }
        }

        @Override
        public final void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            PasscodeActivity.AnonymousClass8 anonymousClass8 = this.codeFieldContainer;
            anonymousClass8.setText("");
            this.currentParams = bundle;
            this.passwordString = bundle.getString("password");
            this.requestPhone = this.currentParams.getString("requestPhone");
            this.phoneHash = this.currentParams.getString("phoneHash");
            this.phoneCode = this.currentParams.getString("phoneCode");
            String string = this.currentParams.getString("email_unconfirmed_pattern");
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string);
            int iIndexOf = string.indexOf(42);
            int iLastIndexOf = string.lastIndexOf(42);
            if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                textStyleRun.flags |= 256;
                textStyleRun.start = iIndexOf;
                int i = iLastIndexOf + 1;
                textStyleRun.end = i;
                spannableStringBuilderValueOf.setSpan(new TextStyleSpan(textStyleRun, 0), iIndexOf, i, 0);
            }
            this.troubleButton.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), spannableStringBuilderValueOf));
            if (!LoginActivity.this.isCustomKeyboardVisible()) {
                AndroidUtilities.showKeyboard(anonymousClass8);
            }
            anonymousClass8.requestFocus();
        }

        @Override
        public final void updateColors$1() {
            this.titleView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            this.confirmTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
            this.troubleButton.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            this.codeFieldContainer.invalidate();
        }
    }

    public final class LoginActivityRegisterView extends SlideView implements ImageUpdater.ImageUpdaterDelegate {
        public TLRPC.FileLocation avatar;
        public AnimatorSet avatarAnimation;
        public TLRPC.FileLocation avatarBig;
        public final AvatarDrawable avatarDrawable;
        public final ChannelCreateActivity.AnonymousClass5 avatarEditor;
        public final UserCell.AnonymousClass2 avatarImage;
        public final ChatActivity.AnonymousClass27 avatarOverlay;
        public final AnonymousClass5 avatarProgressView;
        public final RLottieDrawable cameraDrawable;
        public final RLottieDrawable cameraWaitDrawable;
        public Bundle currentParams;
        public final TextView descriptionTextView;
        public final EditTextBoldCursor firstNameField;
        public final OutlineTextContainerView firstNameOutlineView;
        public final ImageUpdater imageUpdater;
        public boolean isCameraWaitAnimationAllowed;
        public final EditTextBoldCursor lastNameField;
        public final OutlineTextContainerView lastNameOutlineView;
        public boolean nextPressed;
        public String phoneHash;
        public final TextView privacyView;
        public String requestPhone;
        public final TextView titleTextView;
        public final TextView wrongNumber;

        public final class AnonymousClass4 implements View.OnAttachStateChangeListener {
            public boolean isAttached;
            public long lastRun = System.currentTimeMillis();
            public final LoginActivity$LoginActivityRegisterView$4$$ExternalSyntheticLambda0 cameraWaitCallback = new LoginActivity$LoginActivityRegisterView$4$$ExternalSyntheticLambda0(this, 0);

            public AnonymousClass4() {
            }

            @Override
            public final void onViewAttachedToWindow(View view) {
                this.isAttached = true;
                view.post(this.cameraWaitCallback);
            }

            @Override
            public final void onViewDetachedFromWindow(View view) {
                this.isAttached = false;
                view.removeCallbacks(this.cameraWaitCallback);
            }
        }

        public final class AnonymousClass5 extends RadialProgressView {
            public AnonymousClass5(Context context) {
                super(context, null);
            }

            @Override
            public final void setAlpha(float f) {
                super.setAlpha(f);
                LoginActivityRegisterView.this.avatarOverlay.invalidate();
            }
        }

        public LoginActivityRegisterView(Context context) {
            super(context);
            this.nextPressed = false;
            this.isCameraWaitAnimationAllowed = true;
            setOrientation(1);
            ImageUpdater imageUpdater = new ImageUpdater(0, false, false);
            this.imageUpdater = imageUpdater;
            imageUpdater.openWithFrontfaceCamera = true;
            imageUpdater.searchAvailable = false;
            imageUpdater.useAttachMenu = false;
            imageUpdater.uploadAfterSelect = false;
            imageUpdater.parentFragment = LoginActivity.this;
            imageUpdater.delegate = this;
            FrameLayout frameLayout = new FrameLayout(context);
            addView(frameLayout, LayoutHelper.createLinear(78, 78, 1));
            AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            this.avatarDrawable = avatarDrawable;
            UserCell.AnonymousClass2 anonymousClass2 = new UserCell.AnonymousClass2(this, context, 9);
            this.avatarImage = anonymousClass2;
            anonymousClass2.setRoundRadius(AndroidUtilities.dp(64.0f));
            avatarDrawable.setAvatarType(13);
            avatarDrawable.setInfo(5L, null, null, null, null);
            anonymousClass2.setImageDrawable(avatarDrawable);
            frameLayout.addView(anonymousClass2, LayoutHelper.createFrame(-1.0f, -1));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ChatActivity.AnonymousClass27 anonymousClass27 = new ChatActivity.AnonymousClass27(this, context, paint, 9);
            this.avatarOverlay = anonymousClass27;
            frameLayout.addView(anonymousClass27, LayoutHelper.createFrame(-1.0f, -1));
            final int i = 0;
            anonymousClass27.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityRegisterView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            LoginActivity.LoginActivityRegisterView loginActivityRegisterView = this.f$0;
                            loginActivityRegisterView.imageUpdater.openMenu(loginActivityRegisterView.avatar != null, new LoginActivity$$ExternalSyntheticLambda16(loginActivityRegisterView, 1), new OAuthSheet$$ExternalSyntheticLambda11(loginActivityRegisterView, 24), 0);
                            loginActivityRegisterView.isCameraWaitAnimationAllowed = false;
                            RLottieDrawable rLottieDrawable = loginActivityRegisterView.cameraDrawable;
                            ChannelCreateActivity.AnonymousClass5 anonymousClass5 = loginActivityRegisterView.avatarEditor;
                            anonymousClass5.setAnimation(rLottieDrawable);
                            rLottieDrawable.setCurrentFrame(0, true, false);
                            rLottieDrawable.setCustomEndFrame(43);
                            anonymousClass5.playAnimation();
                            break;
                        default:
                            LoginActivity.LoginActivityRegisterView loginActivityRegisterView2 = this.f$0;
                            if (LoginActivity.this.radialProgressView.getTag() == null) {
                                loginActivityRegisterView2.onBackPressed(false);
                                break;
                            }
                            break;
                    }
                }
            });
            int i2 = R.raw.camera;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, String.valueOf(i2), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
            this.cameraDrawable = rLottieDrawable;
            int i3 = R.raw.camera_wait;
            this.cameraWaitDrawable = new RLottieDrawable(i3, String.valueOf(i3), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
            ChannelCreateActivity.AnonymousClass5 anonymousClass5 = new ChannelCreateActivity.AnonymousClass5(this, context, 3);
            this.avatarEditor = anonymousClass5;
            anonymousClass5.setScaleType(ImageView.ScaleType.CENTER);
            anonymousClass5.setAnimation(rLottieDrawable);
            anonymousClass5.setEnabled(false);
            anonymousClass5.setClickable(false);
            frameLayout.addView(anonymousClass5, LayoutHelper.createFrame(-1.0f, -1));
            anonymousClass5.addOnAttachStateChangeListener(new AnonymousClass4());
            AnonymousClass5 anonymousClass6 = new AnonymousClass5(context);
            this.avatarProgressView = anonymousClass6;
            anonymousClass6.setSize(AndroidUtilities.dp(30.0f));
            anonymousClass6.setProgressColor(-1);
            frameLayout.addView(anonymousClass6, LayoutHelper.createFrame(-1.0f, -1));
            showAvatarProgress$7(false);
            TextView textView = new TextView(context);
            this.titleTextView = textView;
            textView.setText(LocaleController.getString(R.string.RegistrationProfileInfo));
            textView.setTextSize(1, 18.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView.setGravity(1);
            addView(textView, LayoutHelper.createLinear(-2, -2, 1, 8, 12, 8, 0));
            TextView textView2 = new TextView(context);
            this.descriptionTextView = textView2;
            textView2.setText(LocaleController.getString("RegisterText2", R.string.RegisterText2));
            textView2.setGravity(1);
            textView2.setTextSize(1, 14.0f);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 8, 6, 8, 0));
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, LayoutHelper.createLinear(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
            OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context, null);
            this.firstNameOutlineView = outlineTextContainerView;
            int i4 = R.string.FirstName;
            outlineTextContainerView.setText(LocaleController.getString(i4));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.firstNameField = editTextBoldCursor;
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setImeOptions(268435461);
            editTextBoldCursor.setTextSize(1, 17.0f);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setInputType(8192);
            final int i5 = 0;
            editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                public final LoginActivity.LoginActivityRegisterView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onFocusChange(View view, boolean z) {
                    switch (i5) {
                        case 0:
                            OutlineTextContainerView outlineTextContainerView2 = this.f$0.firstNameOutlineView;
                            float f = z ? 1.0f : 0.0f;
                            outlineTextContainerView2.animateSelection(f, f, true);
                            break;
                        default:
                            OutlineTextContainerView outlineTextContainerView3 = this.f$0.lastNameOutlineView;
                            float f2 = z ? 1.0f : 0.0f;
                            outlineTextContainerView3.animateSelection(f2, f2, true);
                            break;
                    }
                }
            });
            editTextBoldCursor.setBackground(null);
            editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            outlineTextContainerView.attachedEditText = editTextBoldCursor;
            outlineTextContainerView.invalidate();
            outlineTextContainerView.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, -2, 48));
            final int i6 = 0;
            editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                public final LoginActivity.LoginActivityRegisterView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final boolean onEditorAction(TextView textView3, int i7, KeyEvent keyEvent) {
                    switch (i6) {
                        case 0:
                            LoginActivity.LoginActivityRegisterView loginActivityRegisterView = this.f$0;
                            if (i7 == 5) {
                                loginActivityRegisterView.lastNameField.requestFocus();
                                return true;
                            }
                            loginActivityRegisterView.getClass();
                            return false;
                        default:
                            LoginActivity.LoginActivityRegisterView loginActivityRegisterView2 = this.f$0;
                            loginActivityRegisterView2.getClass();
                            if (i7 != 6 && i7 != 5) {
                                return false;
                            }
                            loginActivityRegisterView2.onNextPressed(null);
                            return true;
                    }
                }
            });
            OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context, null);
            this.lastNameOutlineView = outlineTextContainerView2;
            int i7 = R.string.LastName;
            outlineTextContainerView2.setText(LocaleController.getString(i7));
            EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
            this.lastNameField = editTextBoldCursor2;
            editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor2.setCursorWidth(1.5f);
            editTextBoldCursor2.setImeOptions(268435462);
            editTextBoldCursor2.setTextSize(1, 17.0f);
            editTextBoldCursor2.setMaxLines(1);
            editTextBoldCursor2.setInputType(8192);
            final int i8 = 1;
            editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                public final LoginActivity.LoginActivityRegisterView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onFocusChange(View view, boolean z) {
                    switch (i8) {
                        case 0:
                            OutlineTextContainerView outlineTextContainerView3 = this.f$0.firstNameOutlineView;
                            float f = z ? 1.0f : 0.0f;
                            outlineTextContainerView3.animateSelection(f, f, true);
                            break;
                        default:
                            OutlineTextContainerView outlineTextContainerView4 = this.f$0.lastNameOutlineView;
                            float f2 = z ? 1.0f : 0.0f;
                            outlineTextContainerView4.animateSelection(f2, f2, true);
                            break;
                    }
                }
            });
            editTextBoldCursor2.setBackground(null);
            editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            outlineTextContainerView2.attachedEditText = editTextBoldCursor2;
            outlineTextContainerView2.invalidate();
            outlineTextContainerView2.addView(editTextBoldCursor2, LayoutHelper.createFrame(-1, -2, 48));
            final int i9 = 1;
            editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                public final LoginActivity.LoginActivityRegisterView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final boolean onEditorAction(TextView textView3, int i10, KeyEvent keyEvent) {
                    switch (i9) {
                        case 0:
                            LoginActivity.LoginActivityRegisterView loginActivityRegisterView = this.f$0;
                            if (i10 == 5) {
                                loginActivityRegisterView.lastNameField.requestFocus();
                                return true;
                            }
                            loginActivityRegisterView.getClass();
                            return false;
                        default:
                            LoginActivity.LoginActivityRegisterView loginActivityRegisterView2 = this.f$0;
                            loginActivityRegisterView2.getClass();
                            if (i10 != 6 && i10 != 5) {
                                return false;
                            }
                            loginActivityRegisterView2.onNextPressed(null);
                            return true;
                    }
                }
            });
            boolean zIsSmallScreen = AndroidUtilities.isSmallScreen();
            boolean zHasFocus = editTextBoldCursor.hasFocus();
            boolean zHasFocus2 = editTextBoldCursor2.hasFocus();
            frameLayout2.removeAllViews();
            if (zIsSmallScreen) {
                LinearLayout linearLayout = new LinearLayout(LoginActivity.this.getParentActivity());
                linearLayout.setOrientation(0);
                outlineTextContainerView.setText(LocaleController.getString(R.string.FirstNameSmall));
                outlineTextContainerView2.setText(LocaleController.getString(R.string.LastNameSmall));
                linearLayout.addView(outlineTextContainerView, LayoutHelper.createLinear(1.0f, 0, -2, 0, 8, 0));
                linearLayout.addView(outlineTextContainerView2, LayoutHelper.createLinear(1.0f, 0, -2, 8, 0, 0));
                frameLayout2.addView(linearLayout);
                if (zHasFocus) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                } else if (zHasFocus2) {
                    editTextBoldCursor2.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor2);
                }
            } else {
                outlineTextContainerView.setText(LocaleController.getString(i4));
                outlineTextContainerView2.setText(LocaleController.getString(i7));
                frameLayout2.addView(outlineTextContainerView, LayoutHelper.createFrame(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
                frameLayout2.addView(outlineTextContainerView2, LayoutHelper.createFrame(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
            }
            TextView textView3 = new TextView(context);
            this.wrongNumber = textView3;
            textView3.setText(LocaleController.getString("CancelRegistration", R.string.CancelRegistration));
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 1);
            textView3.setTextSize(1, 14.0f);
            textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView3.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
            textView3.setVisibility(8);
            addView(textView3, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 0, 20, 0, 0));
            final int i10 = 1;
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityRegisterView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            LoginActivity.LoginActivityRegisterView loginActivityRegisterView = this.f$0;
                            loginActivityRegisterView.imageUpdater.openMenu(loginActivityRegisterView.avatar != null, new LoginActivity$$ExternalSyntheticLambda16(loginActivityRegisterView, 1), new OAuthSheet$$ExternalSyntheticLambda11(loginActivityRegisterView, 24), 0);
                            loginActivityRegisterView.isCameraWaitAnimationAllowed = false;
                            RLottieDrawable rLottieDrawable2 = loginActivityRegisterView.cameraDrawable;
                            ChannelCreateActivity.AnonymousClass5 anonymousClass7 = loginActivityRegisterView.avatarEditor;
                            anonymousClass7.setAnimation(rLottieDrawable2);
                            rLottieDrawable2.setCurrentFrame(0, true, false);
                            rLottieDrawable2.setCustomEndFrame(43);
                            anonymousClass7.playAnimation();
                            break;
                        default:
                            LoginActivity.LoginActivityRegisterView loginActivityRegisterView2 = this.f$0;
                            if (LoginActivity.this.radialProgressView.getTag() == null) {
                                loginActivityRegisterView2.onBackPressed(false);
                                break;
                            }
                            break;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            addView(frameLayout3, LayoutHelper.createLinear(-1, -1, 83));
            TextView textView4 = new TextView(context);
            this.privacyView = textView4;
            textView4.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView4.setTextSize(1, AndroidUtilities.isSmallScreen() ? 13.0f : 14.0f);
            textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView4.setGravity(16);
            frameLayout3.addView(textView4, LayoutHelper.createFrame(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
            new PhotoViewer.AnonymousClass14(textView4);
            String string = LocaleController.getString("TermsOfServiceLogin", R.string.TermsOfServiceLogin);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int iIndexOf = string.indexOf(42);
            int iLastIndexOf = string.lastIndexOf(42);
            if (iIndexOf != -1 && iLastIndexOf != -1 && iIndexOf != iLastIndexOf) {
                spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new ChatActivity.AnonymousClass102(this, 8), iIndexOf, iLastIndexOf - 1, 33);
            }
            textView4.setText(spannableStringBuilder);
        }

        @Override
        public final boolean canFinishFragment() {
            return true;
        }

        @Override
        public final void didStartUpload(boolean z, boolean z2) {
        }

        @Override
        public final void didUploadFailed() {
        }

        @Override
        public final void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(this, photoSize2, photoSize, 14));
        }

        @Override
        public PhotoViewer.PlaceProviderObject getCloseIntoObject() {
            return null;
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("YourName", R.string.YourName);
        }

        @Override
        public String getInitialSearchString() {
            return null;
        }

        @Override
        public final boolean needBackButton() {
            return true;
        }

        @Override
        public final boolean onBackPressed(boolean z) {
            LoginActivity loginActivity = LoginActivity.this;
            if (z) {
                loginActivity.needHideProgress(true, true);
                this.nextPressed = false;
                this.currentParams = null;
                return true;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(loginActivity.getParentActivity(), 0, null);
            String string = LocaleController.getString(R.string.Warning);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString("AreYouSureRegistration", R.string.AreYouSureRegistration);
            builder.setNegativeButton(LocaleController.getString("Stop", R.string.Stop), new LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda0(this, 0));
            builder.setPositiveButton(LocaleController.getString("Continue", R.string.Continue), null);
            loginActivity.showDialog(alertDialog);
            return false;
        }

        @Override
        public final void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public final void onNextPressed(String str) {
            if (this.nextPressed) {
                return;
            }
            LoginActivity loginActivity = LoginActivity.this;
            TLRPC.TL_help_termsOfService tL_help_termsOfService = loginActivity.currentTermsOfService;
            if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
                showTermsOfService(true);
                return;
            }
            EditTextBoldCursor editTextBoldCursor = this.firstNameField;
            if (editTextBoldCursor.length() == 0) {
                LoginActivity.onFieldError(this.firstNameOutlineView, true);
                return;
            }
            this.nextPressed = true;
            TLRPC.TL_auth_signUp tL_auth_signUp = new TLRPC.TL_auth_signUp();
            tL_auth_signUp.phone_code_hash = this.phoneHash;
            tL_auth_signUp.phone_number = this.requestPhone;
            tL_auth_signUp.first_name = editTextBoldCursor.getText().toString();
            tL_auth_signUp.last_name = this.lastNameField.getText().toString();
            loginActivity.needShowProgress(0, true);
            ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(tL_auth_signUp, new LinkManager$$ExternalSyntheticLambda3(this, 13), 10);
        }

        @Override
        public final void onShow() {
            TextView textView = this.privacyView;
            if (textView != null) {
                if (LoginActivity.this.restoringState) {
                    textView.setAlpha(1.0f);
                } else {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(AndroidUtilities.decelerateInterpolator).start();
                }
            }
            EditTextBoldCursor editTextBoldCursor = this.firstNameField;
            if (editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            }
            AndroidUtilities.runOnUIThread(new LoginActivity$$ExternalSyntheticLambda16(this, 3), LoginActivity.SHOW_DELAY);
        }

        @Override
        public final void onUploadProgressChanged(float f) {
        }

        @Override
        public final void restoreStateParams(Bundle bundle) {
            byte[] bArrDecode;
            Bundle bundle2 = bundle.getBundle("registerview_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            try {
                String string = bundle.getString("terms");
                if (string != null && (bArrDecode = Base64.decode(string, 0)) != null) {
                    SerializedData serializedData = new SerializedData(bArrDecode);
                    LoginActivity.this.currentTermsOfService = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                    serializedData.cleanup();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            String string2 = bundle.getString("registerview_first");
            if (string2 != null) {
                this.firstNameField.setText(string2);
            }
            String string3 = bundle.getString("registerview_last");
            if (string3 != null) {
                this.lastNameField.setText(string3);
            }
        }

        @Override
        public final void saveStateParams(Bundle bundle) {
            String string = this.firstNameField.getText().toString();
            if (string.length() != 0) {
                bundle.putString("registerview_first", string);
            }
            String string2 = this.lastNameField.getText().toString();
            if (string2.length() != 0) {
                bundle.putString("registerview_last", string2);
            }
            LoginActivity loginActivity = LoginActivity.this;
            TLRPC.TL_help_termsOfService tL_help_termsOfService = loginActivity.currentTermsOfService;
            if (tL_help_termsOfService != null) {
                SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                loginActivity.currentTermsOfService.serializeToStream(serializedData);
                bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                serializedData.cleanup();
            }
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("registerview_params", bundle2);
            }
        }

        @Override
        public final void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            this.firstNameField.setText("");
            this.lastNameField.setText("");
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = bundle.getString("phoneHash");
            this.currentParams = bundle;
        }

        public final void showAvatarProgress$7(boolean z) {
            ChannelCreateActivity.AnonymousClass5 anonymousClass5 = this.avatarEditor;
            if (anonymousClass5 == null) {
                return;
            }
            AnimatorSet animatorSet = this.avatarAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.avatarAnimation = null;
            }
            AnonymousClass5 anonymousClass6 = this.avatarProgressView;
            if (!z) {
                anonymousClass5.setAlpha(1.0f);
                anonymousClass5.setVisibility(0);
                anonymousClass6.setAlpha(0.0f);
                anonymousClass6.setVisibility(4);
                return;
            }
            this.avatarAnimation = new AnimatorSet();
            anonymousClass5.setVisibility(0);
            AnimatorSet animatorSet2 = this.avatarAnimation;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass5, (Property<ChannelCreateActivity.AnonymousClass5, Float>) property, 1.0f), ObjectAnimator.ofFloat(anonymousClass6, (Property<AnonymousClass5, Float>) property, 0.0f));
            this.avatarAnimation.setDuration(180L);
            this.avatarAnimation.addListener(new PhotoViewer$41$1(this, 18));
            this.avatarAnimation.start();
        }

        public final void showTermsOfService(boolean z) {
            LoginActivity loginActivity = LoginActivity.this;
            if (loginActivity.currentTermsOfService == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(loginActivity.getParentActivity(), 0, null);
            String string = LocaleController.getString("TermsOfService", R.string.TermsOfService);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            if (z) {
                builder.setPositiveButton(LocaleController.getString("Accept", R.string.Accept), new LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda0(this, 1));
                builder.setNegativeButton(LocaleController.getString("Decline", R.string.Decline), new LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda0(this, 2));
            } else {
                builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(loginActivity.currentTermsOfService.text);
            MessageObject.addEntitiesToText(spannableStringBuilder, loginActivity.currentTermsOfService.entities, false, false, false, false);
            alertDialog.message = spannableStringBuilder;
            loginActivity.showDialog(alertDialog);
        }

        @Override
        public final boolean supportsBulletin() {
            return false;
        }

        @Override
        public final void updateColors$1() {
            this.avatarDrawable.invalidateSelf();
            TextView textView = this.titleTextView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(null, i, false));
            TextView textView2 = this.descriptionTextView;
            int i2 = Theme.key_windowBackgroundWhiteGrayText6;
            textView2.setTextColor(Theme.getColor(null, i2, false));
            EditTextBoldCursor editTextBoldCursor = this.firstNameField;
            editTextBoldCursor.setTextColor(Theme.getColor(null, i, false));
            int i3 = Theme.key_windowBackgroundWhiteInputFieldActivated;
            editTextBoldCursor.setCursorColor(Theme.getColor(null, i3, false));
            EditTextBoldCursor editTextBoldCursor2 = this.lastNameField;
            editTextBoldCursor2.setTextColor(Theme.getColor(null, i, false));
            editTextBoldCursor2.setCursorColor(Theme.getColor(null, i3, false));
            this.wrongNumber.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            TextView textView3 = this.privacyView;
            textView3.setTextColor(Theme.getColor(null, i2, false));
            textView3.setLinkTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
            this.firstNameOutlineView.updateColor();
            this.lastNameOutlineView.updateColor();
        }
    }

    public final class LoginActivityResetWaitView extends SlideView {
        public final TextView confirmTextView;
        public Bundle currentParams;
        public String phoneCode;
        public String phoneHash;
        public String requestPhone;
        public final TextView resetAccountButton;
        public final TextView resetAccountText;
        public final TextView resetAccountTime;
        public int startTime;
        public LaunchActivity.AnonymousClass18 timeRunnable;
        public final TextView titleView;
        public final RLottieImageView waitImageView;
        public int waitTime;
        public Boolean wasResetButtonActive;

        public LoginActivityResetWaitView(Context context) {
            super(context);
            setOrientation(1);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.waitImageView = rLottieImageView;
            rLottieImageView.setAutoRepeat(true);
            rLottieImageView.setAnimation(R.raw.sandclock, 120, 120, null);
            frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(120, 120, 1));
            Point point = AndroidUtilities.displaySize;
            frameLayout.setVisibility((point.x <= point.y || AndroidUtilities.isTablet()) ? 0 : 8);
            linearLayout.addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            zzkk.m(18.0f, 1, textView);
            int i = R.string.ResetAccount;
            textView.setText(LocaleController.getString(i));
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linearLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.confirmTextView = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 12, 8, 12, 0));
            addView(linearLayout, LayoutHelper.createLinear(1.0f, -1, 0));
            TextView textView3 = new TextView(context);
            this.resetAccountText = textView3;
            textView3.setGravity(1);
            textView3.setText(LocaleController.getString("ResetAccountStatus", R.string.ResetAccountStatus));
            textView3.setTextSize(1, 14.0f);
            textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView3, LayoutHelper.createLinear(-2, -2, 49, 0, 24, 0, 0));
            TextView textView4 = new TextView(context);
            this.resetAccountTime = textView4;
            textView4.setGravity(1);
            textView4.setTextSize(1, 20.0f);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView4, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
            TextView textView5 = new TextView(context);
            this.resetAccountButton = textView5;
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(i));
            textView5.setTypeface(AndroidUtilities.bold());
            textView5.setTextSize(1, 15.0f);
            textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView5.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView5.setTextColor(-1);
            addView(textView5, LayoutHelper.createLinear(-1, 50, 1, 16, 32, 16, 48));
            textView5.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 7));
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("ResetAccount", R.string.ResetAccount);
        }

        @Override
        public final boolean needBackButton() {
            return true;
        }

        @Override
        public final boolean onBackPressed(boolean z) {
            LoginActivity.this.needHideProgress(true, true);
            AndroidUtilities.cancelRunOnUIThread(this.timeRunnable);
            this.timeRunnable = null;
            this.currentParams = null;
            return true;
        }

        @Override
        public final void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("resetview_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
        }

        @Override
        public final void saveStateParams(Bundle bundle) {
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("resetview_params", bundle2);
            }
        }

        @Override
        public final void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            this.currentParams = bundle;
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = bundle.getString("phoneHash");
            this.phoneCode = bundle.getString("code");
            this.startTime = bundle.getInt("startTime");
            this.waitTime = bundle.getInt("waitTime");
            this.confirmTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ResetAccountInfo", R.string.ResetAccountInfo, LocaleController.addNbsp(PhoneFormat.getInstance().format("+" + this.requestPhone)))));
            updateTimeText();
            LaunchActivity.AnonymousClass18 anonymousClass18 = new LaunchActivity.AnonymousClass18(this, 14);
            this.timeRunnable = anonymousClass18;
            AndroidUtilities.runOnUIThread(anonymousClass18, 1000L);
        }

        @Override
        public final void updateColors$1() {
            TextView textView = this.titleView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(null, i, false));
            this.confirmTextView.setTextColor(Theme.getColor(null, i, false));
            this.resetAccountText.setTextColor(Theme.getColor(null, i, false));
            this.resetAccountTime.setTextColor(Theme.getColor(null, i, false));
            TextView textView2 = this.resetAccountButton;
            int iDp = AndroidUtilities.dp(6.0f);
            int color = Theme.getColor(null, Theme.key_changephoneinfo_image2, false);
            int color2 = Theme.getColor(null, Theme.key_chats_actionPressedBackground, false);
            textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2));
        }

        public final void updateTimeText() {
            int iMax = Math.max(0, this.waitTime - (ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).getCurrentTime() - this.startTime));
            int i = iMax / 86400;
            int iRound = Math.round(iMax / 86400.0f);
            int i2 = iMax / 3600;
            int i3 = (iMax / 60) % 60;
            int i4 = iMax % 60;
            TextView textView = this.resetAccountTime;
            if (i >= 2) {
                textView.setText(LocaleController.formatPluralString("Days", iRound, new Object[0]));
            } else {
                textView.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            boolean z = iMax == 0;
            Boolean bool = this.wasResetButtonActive;
            if (bool == null || bool.booleanValue() != z) {
                RLottieImageView rLottieImageView = this.waitImageView;
                if (z) {
                    rLottieImageView.getAnimatedDrawable().setAutoRepeat(0);
                } else {
                    rLottieImageView.setAutoRepeat(true);
                    if (!rLottieImageView.isPlaying()) {
                        rLottieImageView.playAnimation();
                    }
                }
                textView.setVisibility(z ? 4 : 0);
                this.resetAccountText.setVisibility(z ? 4 : 0);
                this.resetAccountButton.setVisibility(z ? 0 : 4);
                this.wasResetButtonActive = Boolean.valueOf(z);
            }
        }
    }

    public final class LoginActivitySetupEmail extends SlideView {
        public Bundle currentParams;
        public final EditTextBoldCursor emailField;
        public final OutlineTextContainerView emailOutlineView;
        public String emailPhone;
        public GoogleSignInAccount googleAccount;
        public final RLottieImageView inboxImageView;
        public final LoginOrView loginOrView;
        public boolean nextPressed;
        public String phone;
        public String phoneHash;
        public String requestPhone;
        public final TextView signInWithGoogleView;
        public final LinkSpanDrawable.LinksTextView subtitleView;
        public final TextView titleView;

        public LoginActivitySetupEmail(Context context) {
            int i;
            super(context);
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.inboxImageView = rLottieImageView;
            rLottieImageView.setAnimation(R.raw.tsv_setup_mail, 120, 120, null);
            rLottieImageView.setAutoRepeat(false);
            frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(120, 120, 1));
            if (AndroidUtilities.isSmallScreen()) {
                i = 8;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y || AndroidUtilities.isTablet()) {
                    i = 0;
                } else {
                    i = 8;
                }
            }
            frameLayout.setVisibility(i);
            addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            zzkk.m(18.0f, 1, textView);
            textView.setText(LocaleController.getString(LoginActivity.this.activityMode == 3 ? R.string.EnterNewEmail : R.string.AddEmailTitle));
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
            this.subtitleView = linksTextView;
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setGravity(17);
            linksTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linksTextView.setText(LocaleController.getString(R.string.AddEmailSubtitle));
            addView(linksTextView, LayoutHelper.createLinear(-2, -2, 1, 32, 8, 32, 0));
            OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context, null);
            this.emailOutlineView = outlineTextContainerView;
            outlineTextContainerView.setText(LocaleController.getString(LoginActivity.this.activityMode == 3 ? R.string.YourNewEmail : R.string.YourEmail));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.emailField = editTextBoldCursor;
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setImeOptions(268435461);
            editTextBoldCursor.setTextSize(1, 17.0f);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setInputType(33);
            editTextBoldCursor.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, 11));
            editTextBoldCursor.setBackground(null);
            editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            outlineTextContainerView.attachedEditText = editTextBoldCursor;
            outlineTextContainerView.invalidate();
            outlineTextContainerView.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, -2, 48));
            editTextBoldCursor.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, 18));
            addView(outlineTextContainerView, LayoutHelper.createLinear(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
            TextView textView2 = new TextView(context);
            this.signInWithGoogleView = textView2;
            textView2.setGravity(3);
            textView2.setTextSize(1, 14.0f);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            textView2.setMaxLines(2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            Drawable drawable = context.getDrawable(R.drawable.googleg_standard_color_18);
            drawable.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
            spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
            spannableStringBuilder.setSpan(new CountrySelectActivity.AnonymousClass5(3), 1, 2, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
            textView2.setText(spannableStringBuilder);
            LoginOrView loginOrView = new LoginOrView(context);
            this.loginOrView = loginOrView;
            addView(new Space(context), LayoutHelper.createLinear(1.0f, 0, 0));
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
            frameLayout2.addView(loginOrView, LayoutHelper.createFrame(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
            loginOrView.setMeasureAfter(textView2);
            addView(frameLayout2, LayoutHelper.createLinear(-1, -2));
            new PhotoViewer.AnonymousClass14(frameLayout2);
            frameLayout2.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 8));
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("AddEmailTitle", R.string.AddEmailTitle);
        }

        @Override
        public final boolean needBackButton() {
            return !LoginActivity.this.emailChangeIsSuggestion;
        }

        @Override
        public final void onNextPressed(String str) {
            if (this.nextPressed) {
                return;
            }
            GoogleSignInAccount googleSignInAccount = this.googleAccount;
            String string = googleSignInAccount != null ? googleSignInAccount.zaf : this.emailField.getText().toString();
            Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            bundle.putString("ephone", this.emailPhone);
            bundle.putString("phoneFormated", this.requestPhone);
            bundle.putString("phoneHash", this.phoneHash);
            bundle.putString("email", string);
            bundle.putBoolean("setup", true);
            GoogleSignInAccount googleSignInAccount2 = this.googleAccount;
            LoginActivity loginActivity = LoginActivity.this;
            if (googleSignInAccount2 != null) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                if (loginActivity.activityMode == 3) {
                    verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
                } else {
                    TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                    tL_emailVerifyPurposeLoginSetup.phone_number = this.requestPhone;
                    tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.phoneHash;
                    verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
                }
                TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                tL_emailVerificationGoogle.token = this.googleAccount.zae;
                verifyemail.verification = tL_emailVerificationGoogle;
                this.googleAccount = null;
                ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(verifyemail, new LinkManager$$ExternalSyntheticLambda0(this, bundle, verifyemail, 10), 10);
                return;
            }
            if (TextUtils.isEmpty(string)) {
                onPasscodeError$4();
                return;
            }
            this.nextPressed = true;
            loginActivity.needShowProgress(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (loginActivity.activityMode == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.requestPhone;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.phoneHash;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = string;
            ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(sendverifyemailcode, new LinkManager$$ExternalSyntheticLambda0(this, bundle, sendverifyemailcode, 11), 10);
        }

        public final void onPasscodeError$4() {
            OutlineTextContainerView outlineTextContainerView = this.emailOutlineView;
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            try {
                outlineTextContainerView.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.emailField.requestFocus();
            LoginActivity.onFieldError(outlineTextContainerView, true);
            postDelayed(new LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda0(this, 1), 300L);
        }

        @Override
        public final void onShow() {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda0(this, 0), LoginActivity.SHOW_DELAY);
        }

        @Override
        public final void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("emailsetup_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            String string = bundle.getString("emailsetup_email");
            if (string != null) {
                this.emailField.setText(string);
            }
        }

        @Override
        public final void saveStateParams(Bundle bundle) {
            String string = this.emailField.getText().toString();
            if (string != null && string.length() != 0) {
                bundle.putString("emailsetup_email", string);
            }
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("emailsetup_params", bundle2);
            }
        }

        @Override
        public final void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            EditTextBoldCursor editTextBoldCursor = this.emailField;
            editTextBoldCursor.setText("");
            this.currentParams = bundle;
            this.phone = bundle.getString("phone");
            this.emailPhone = this.currentParams.getString("ephone");
            this.requestPhone = this.currentParams.getString("phoneFormated");
            this.phoneHash = this.currentParams.getString("phoneHash");
            int i = (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) ? 0 : 8;
            this.loginOrView.setVisibility(i);
            this.signInWithGoogleView.setVisibility(i);
            if (!LoginActivity.this.isCustomKeyboardVisible()) {
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            }
            editTextBoldCursor.requestFocus();
        }

        @Override
        public final void updateColors$1() {
            TextView textView = this.titleView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(null, i, false));
            LinkSpanDrawable.LinksTextView linksTextView = this.subtitleView;
            linksTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
            linksTextView.setLinkTextColor(Theme.getColor(null, Theme.key_chat_messageLinkIn, false));
            this.emailField.setTextColor(Theme.getColor(null, i, false));
            this.signInWithGoogleView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            this.loginOrView.updateColors();
            this.emailOutlineView.invalidate();
        }
    }

    public final class LoginActivitySmsView extends SlideView implements NotificationCenter.NotificationCenterDelegate {
        public static final int $r8$clinit = 0;
        public final RLottieImageView blueImageView;
        public String catchedPhone;
        public final CodeFieldContainer codeFieldContainer;
        public int codeTime;
        public Timer codeTimer;
        public final TextView confirmTextView;
        public Bundle currentParams;
        public final int currentType;
        public final RLottieDrawable dotsDrawable;
        public final RLottieDrawable dotsToStarsDrawable;
        public String emailPhone;
        public final LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8 errorColorTimeout;
        public final AnonymousClass4 errorViewSwitcher;
        public final RLottieDrawable hintDrawable;
        public boolean isDotsAnimationVisible;
        public boolean isResendingCode;
        public double lastCodeTime;
        public double lastCurrentTime;
        public String lastError;
        public int length;
        public final ImageView missedCallArrowIcon;
        public final TextView missedCallDescriptionSubtitle;
        public final TextView missedCallDescriptionSubtitle2;
        public final ImageView missedCallPhoneIcon;
        public TLRPC.TL_auth_sentCode nextCodeAuth;
        public Bundle nextCodeParams;
        public boolean nextPressed;
        public int nextType;
        public final LinearLayout openFragmentButton;
        public final RLottieImageView openFragmentImageView;
        public int openTime;
        public String pattern;
        public String phone;
        public String phoneHash;
        public boolean postedErrorColorTimeout;
        public String prefix;
        public final TextView prefixTextView;
        public int prevType;
        public final LoadingTextView prevTypeTextView;
        public final FrameLayout problemFrame;
        public final AnonymousClass3 problemText;
        public String requestPhone;
        public final RLottieDrawable starsToDotsDrawable;
        public int time;
        public final AnonymousClass3 timeText;
        public Timer timeTimer;
        public final Object timerSync;
        public final TextView titleTextView;
        public String url;
        public boolean waitingForEvent;
        public final TextView wrongCode;

        public final class AnonymousClass3 extends LoadingTextView {
            public final int $r8$classId;
            public final SlideView this$1;

            public AnonymousClass3(LoginActivityPhraseView loginActivityPhraseView, Context context) {
                super(LoginActivity.this, context);
                this.$r8$classId = 2;
                this.this$1 = loginActivityPhraseView;
            }

            @Override
            public final boolean isResendingCode() {
                switch (this.$r8$classId) {
                    case 0:
                        return ((LoginActivitySmsView) this.this$1).isResendingCode;
                    case 1:
                        return ((LoginActivitySmsView) this.this$1).isResendingCode;
                    default:
                        return ((LoginActivityPhraseView) this.this$1).isResendingCode;
                }
            }

            @Override
            public final boolean isRippleEnabled() {
                AnonymousClass3 anonymousClass3;
                switch (this.$r8$classId) {
                    case 0:
                        if (getVisibility() == 0) {
                            LoginActivitySmsView loginActivitySmsView = (LoginActivitySmsView) this.this$1;
                            if (loginActivitySmsView.time <= 0 || loginActivitySmsView.timeTimer == null) {
                                return true;
                            }
                        }
                        return false;
                    case 1:
                        if (isClickable() && getVisibility() == 0) {
                            LoginActivitySmsView loginActivitySmsView2 = (LoginActivitySmsView) this.this$1;
                            if (!loginActivitySmsView2.nextPressed && (((anonymousClass3 = loginActivitySmsView2.timeText) == null || anonymousClass3.getVisibility() == 8) && !loginActivitySmsView2.isResendingCode)) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        if (getVisibility() == 0) {
                            LoginActivityPhraseView loginActivityPhraseView = (LoginActivityPhraseView) this.this$1;
                            if (loginActivityPhraseView.time <= 0 || loginActivityPhraseView.timeTimer == null) {
                                return true;
                            }
                        }
                        return false;
                }
            }

            public AnonymousClass3(LoginActivitySmsView loginActivitySmsView, Context context, int i) {
                super(LoginActivity.this, context);
                this.$r8$classId = i;
                switch (i) {
                    case 1:
                        this.this$1 = loginActivitySmsView;
                        super(LoginActivity.this, context);
                        break;
                    default:
                        this.this$1 = loginActivitySmsView;
                        break;
                }
            }
        }

        public final class AnonymousClass4 extends ViewSwitcher {
            public final int $r8$classId;

            public AnonymousClass4(Context context, int i) {
                super(context);
                this.$r8$classId = i;
            }

            @Override
            public final void onMeasure(int i, int i2) {
                switch (this.$r8$classId) {
                    case 0:
                        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                        break;
                    default:
                        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                        break;
                }
            }
        }

        public final class AnonymousClass8 extends TimerTask {
            public AnonymousClass8() {
            }

            @Override
            public final void run() {
                if (LoginActivitySmsView.this.timeTimer == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda6(this, 22));
            }
        }

        public LoginActivitySmsView(Context context, int i) {
            ViewGroup viewGroup;
            FrameLayout frameLayout;
            AnonymousClass4 anonymousClass4;
            int i2;
            super(context);
            this.timerSync = new Object();
            this.time = 60000;
            this.codeTime = 15000;
            this.lastError = "";
            this.isResendingCode = false;
            this.pattern = "*";
            this.prefix = "";
            this.errorColorTimeout = new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(this, 10);
            this.currentType = i;
            setOrientation(1);
            TextView textView = new TextView(context);
            this.confirmTextView = textView;
            textView.setTextSize(1, 14.0f);
            textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            TextView textView2 = new TextView(context);
            this.titleTextView = textView2;
            zzkk.m(18.0f, 1, textView2);
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView2.setGravity(49);
            String string = LoginActivity.this.activityMode != 1 ? null : LocaleController.getString(R.string.CancelAccountReset);
            if (i != 11) {
                if (i == 3) {
                    textView.setGravity(1);
                    ViewGroup frameLayout2 = new FrameLayout(context);
                    addView(frameLayout2, LayoutHelper.createLinear(1.0f, -1, 0));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    linearLayout.setGravity(1);
                    frameLayout2.addView(linearLayout, LayoutHelper.createFrame(-1, -2, 17));
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    linearLayout.addView(frameLayout3, LayoutHelper.createFrame(-2, -2, 1));
                    RLottieImageView rLottieImageView = new RLottieImageView(context);
                    this.blueImageView = rLottieImageView;
                    int i3 = R.raw.phone_flash_call;
                    RLottieDrawable rLottieDrawable = new RLottieDrawable(i3, String.valueOf(i3), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(64.0f), true, null);
                    this.hintDrawable = rLottieDrawable;
                    rLottieImageView.setAnimation(rLottieDrawable);
                    frameLayout3.addView(rLottieImageView, LayoutHelper.createFrame(64.0f, 64));
                    textView2.setText(string == null ? LocaleController.getString(R.string.YourCode) : string);
                    linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 0, 16, 0, 0));
                    linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
                    viewGroup = frameLayout2;
                } else {
                    textView.setGravity(49);
                    FrameLayout frameLayout4 = new FrameLayout(context);
                    addView(frameLayout4, LayoutHelper.createLinear(-2, -2, 49, 0, 16, 0, 0));
                    int i4 = i == 1 ? 128 : 64;
                    if (i == 1) {
                        int i5 = R.raw.code_laptop;
                        float f = i4;
                        this.hintDrawable = new RLottieDrawable(i5, String.valueOf(i5), AndroidUtilities.dp(f), AndroidUtilities.dp(f), true, null);
                    } else {
                        int i6 = R.raw.sms_incoming_info;
                        float f2 = i4;
                        this.hintDrawable = new RLottieDrawable(i6, String.valueOf(i6), AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), true, null);
                        int i7 = R.raw.phone_stars_to_dots;
                        this.starsToDotsDrawable = new RLottieDrawable(i7, String.valueOf(i7), AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), true, null);
                        int i8 = R.raw.phone_dots;
                        this.dotsDrawable = new RLottieDrawable(i8, String.valueOf(i8), AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), true, null);
                        int i9 = R.raw.phone_dots_to_stars;
                        this.dotsToStarsDrawable = new RLottieDrawable(i9, String.valueOf(i9), AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), true, null);
                    }
                    RLottieImageView rLottieImageView2 = new RLottieImageView(context);
                    this.blueImageView = rLottieImageView2;
                    rLottieImageView2.setAnimation(this.hintDrawable);
                    if (i == 1 && !AndroidUtilities.isSmallScreen()) {
                        rLottieImageView2.setTranslationY(-AndroidUtilities.dp(24.0f));
                    }
                    frameLayout4.addView(rLottieImageView2, LayoutHelper.createFrame(i4, i4, 51, 0.0f, 0.0f, 0.0f, (i != 1 || AndroidUtilities.isSmallScreen()) ? 0.0f : -AndroidUtilities.dp(16.0f)));
                    if (string == null) {
                        string = LocaleController.getString(i == 1 ? R.string.SentAppCodeTitle : R.string.SentSmsCodeTitle);
                    }
                    textView2.setText(string);
                    addView(textView2, LayoutHelper.createLinear(-2, -2, 49, 0, 18, 0, 0));
                    int i10 = i == 15 ? 16 : 0;
                    addView(textView, LayoutHelper.createLinear(-2, -2, 49, i10, 17, i10, 0));
                }
                if (i != 11) {
                    final int i11 = 1;
                    CodeFieldContainer codeFieldContainer = new CodeFieldContainer(this, context) {
                        public final LoginActivitySmsView this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override
                        public final void processNextPressed() {
                            switch (i11) {
                                case 0:
                                    this.this$1.onNextPressed(null);
                                    break;
                                default:
                                    this.this$1.onNextPressed(null);
                                    break;
                            }
                        }
                    };
                    this.codeFieldContainer = codeFieldContainer;
                    addView(codeFieldContainer, LayoutHelper.createLinear(-2, 42, 1, 0, 32, 0, 0));
                }
                if (i == 3) {
                    this.codeFieldContainer.setVisibility(8);
                }
                LoadingTextView loadingTextView = new LoadingTextView(LoginActivity.this, context);
                this.prevTypeTextView = loadingTextView;
                int i12 = Theme.key_windowBackgroundWhiteValueText;
                loadingTextView.setLinkTextColor(Theme.getColor(null, i12, false));
                loadingTextView.setTextColor(LoginActivity.this.getThemedColor(i12));
                loadingTextView.setTextSize(1, 14.0f);
                loadingTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                loadingTextView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                final int i13 = 0;
                loadingTextView.setOnClickListener(new View.OnClickListener(this) {
                    public final LoginActivity.LoginActivitySmsView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                this.f$0.onBackPressed(true);
                                break;
                            case 1:
                                LoginActivity.LoginActivitySmsView loginActivitySmsView = this.f$0;
                                if (loginActivitySmsView.time <= 0 || loginActivitySmsView.timeTimer == null) {
                                    loginActivitySmsView.isResendingCode = true;
                                    LoginActivity.LoginActivitySmsView.AnonymousClass3 anonymousClass3 = loginActivitySmsView.timeText;
                                    anonymousClass3.invalidate();
                                    anonymousClass3.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                                    int i14 = loginActivitySmsView.nextType;
                                    if (i14 == 4 || i14 == 2 || i14 == 17 || i14 == 16 || i14 == 11 || i14 == 15) {
                                        if (i14 == 4 || i14 == 11) {
                                            anonymousClass3.setText(LocaleController.getString(R.string.Calling));
                                        } else {
                                            anonymousClass3.setText(LocaleController.getString(R.string.SendingSms));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", loginActivitySmsView.phone);
                                        bundle.putString("ephone", loginActivitySmsView.emailPhone);
                                        bundle.putString("phoneFormated", loginActivitySmsView.requestPhone);
                                        bundle.putInt("prevType", loginActivitySmsView.currentType);
                                        if (loginActivitySmsView.codeTimer == null) {
                                            loginActivitySmsView.codeTime = 15000;
                                            int i15 = loginActivitySmsView.time;
                                            if (i15 > 15000) {
                                                loginActivitySmsView.codeTime = i15;
                                            }
                                            loginActivitySmsView.codeTimer = new Timer();
                                            loginActivitySmsView.lastCodeTime = System.currentTimeMillis();
                                            loginActivitySmsView.codeTimer.schedule(new zzq(loginActivitySmsView, 2), 0L, 1000L);
                                        }
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = loginActivitySmsView.requestPhone;
                                        tL_auth_resendCode.phone_code_hash = loginActivitySmsView.phoneHash;
                                        ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda23(loginActivitySmsView, bundle, 0), 10);
                                    } else if (i14 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        NotificationCenter.getGlobalInstance().removeObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                                        loginActivitySmsView.waitingForEvent = false;
                                        loginActivitySmsView.destroyCodeTimer();
                                        loginActivitySmsView.isResendingCode = false;
                                        loginActivitySmsView.resendCode();
                                    }
                                }
                                break;
                            default:
                                LoginActivity.LoginActivitySmsView loginActivitySmsView2 = this.f$0;
                                loginActivitySmsView2.getClass();
                                try {
                                    loginActivitySmsView2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(loginActivitySmsView2.url)));
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                break;
                        }
                    }
                });
                addView(loadingTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 18, 0, 0));
                loadingTextView.setVisibility(8);
                frameLayout = new FrameLayout(context);
                this.problemFrame = frameLayout;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this, context, 0);
                this.timeText = anonymousClass3;
                anonymousClass3.setLinkTextColor(Theme.getColor(null, i12, false));
                anonymousClass3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                anonymousClass3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                anonymousClass3.setTextSize(1, 15.0f);
                anonymousClass3.setGravity(51);
                final int i14 = 1;
                anonymousClass3.setOnClickListener(new View.OnClickListener(this) {
                    public final LoginActivity.LoginActivitySmsView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                this.f$0.onBackPressed(true);
                                break;
                            case 1:
                                LoginActivity.LoginActivitySmsView loginActivitySmsView = this.f$0;
                                if (loginActivitySmsView.time <= 0 || loginActivitySmsView.timeTimer == null) {
                                    loginActivitySmsView.isResendingCode = true;
                                    LoginActivity.LoginActivitySmsView.AnonymousClass3 anonymousClass5 = loginActivitySmsView.timeText;
                                    anonymousClass5.invalidate();
                                    anonymousClass5.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                                    int i15 = loginActivitySmsView.nextType;
                                    if (i15 == 4 || i15 == 2 || i15 == 17 || i15 == 16 || i15 == 11 || i15 == 15) {
                                        if (i15 == 4 || i15 == 11) {
                                            anonymousClass5.setText(LocaleController.getString(R.string.Calling));
                                        } else {
                                            anonymousClass5.setText(LocaleController.getString(R.string.SendingSms));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", loginActivitySmsView.phone);
                                        bundle.putString("ephone", loginActivitySmsView.emailPhone);
                                        bundle.putString("phoneFormated", loginActivitySmsView.requestPhone);
                                        bundle.putInt("prevType", loginActivitySmsView.currentType);
                                        if (loginActivitySmsView.codeTimer == null) {
                                            loginActivitySmsView.codeTime = 15000;
                                            int i16 = loginActivitySmsView.time;
                                            if (i16 > 15000) {
                                                loginActivitySmsView.codeTime = i16;
                                            }
                                            loginActivitySmsView.codeTimer = new Timer();
                                            loginActivitySmsView.lastCodeTime = System.currentTimeMillis();
                                            loginActivitySmsView.codeTimer.schedule(new zzq(loginActivitySmsView, 2), 0L, 1000L);
                                        }
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = loginActivitySmsView.requestPhone;
                                        tL_auth_resendCode.phone_code_hash = loginActivitySmsView.phoneHash;
                                        ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda23(loginActivitySmsView, bundle, 0), 10);
                                    } else if (i15 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        NotificationCenter.getGlobalInstance().removeObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                                        loginActivitySmsView.waitingForEvent = false;
                                        loginActivitySmsView.destroyCodeTimer();
                                        loginActivitySmsView.isResendingCode = false;
                                        loginActivitySmsView.resendCode();
                                    }
                                }
                                break;
                            default:
                                LoginActivity.LoginActivitySmsView loginActivitySmsView2 = this.f$0;
                                loginActivitySmsView2.getClass();
                                try {
                                    loginActivitySmsView2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(loginActivitySmsView2.url)));
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                break;
                        }
                    }
                });
                frameLayout.addView(anonymousClass3, LayoutHelper.createFrame(-2, -2, 49));
                anonymousClass4 = new AnonymousClass4(context, 0);
                this.errorViewSwitcher = anonymousClass4;
                if (i != 15) {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                    Interpolator interpolator = Easings.easeInOutQuad;
                    animationLoadAnimation.setInterpolator(interpolator);
                    anonymousClass4.setInAnimation(animationLoadAnimation);
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                    animationLoadAnimation2.setInterpolator(interpolator);
                    anonymousClass4.setOutAnimation(animationLoadAnimation2);
                    AnonymousClass3 anonymousClass5 = new AnonymousClass3(this, context, 1);
                    this.problemText = anonymousClass5;
                    anonymousClass5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    anonymousClass5.setTextSize(1, 15.0f);
                    anonymousClass5.setGravity(49);
                    anonymousClass5.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                    frameLayout.addView(anonymousClass5, LayoutHelper.createFrame(-1, -2, 17));
                    anonymousClass4.addView(frameLayout, LayoutHelper.createFrame(-2, -2, 17));
                } else {
                    Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                    Interpolator interpolator2 = CubicBezierInterpolator.DEFAULT;
                    animationLoadAnimation3.setInterpolator(interpolator2);
                    anonymousClass4.setInAnimation(animationLoadAnimation3);
                    Animation animationLoadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
                    animationLoadAnimation4.setInterpolator(interpolator2);
                    anonymousClass4.setOutAnimation(animationLoadAnimation4);
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    this.openFragmentButton = linearLayout2;
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(17);
                    linearLayout2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    int iDp = AndroidUtilities.dp(6.0f);
                    int color = Theme.getColor(null, Theme.key_changephoneinfo_image2, false);
                    int color2 = Theme.getColor(null, Theme.key_chats_actionPressedBackground, false);
                    linearLayout2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2));
                    final int i15 = 2;
                    linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                        public final LoginActivity.LoginActivitySmsView f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i15) {
                                case 0:
                                    this.f$0.onBackPressed(true);
                                    break;
                                case 1:
                                    LoginActivity.LoginActivitySmsView loginActivitySmsView = this.f$0;
                                    if (loginActivitySmsView.time <= 0 || loginActivitySmsView.timeTimer == null) {
                                        loginActivitySmsView.isResendingCode = true;
                                        LoginActivity.LoginActivitySmsView.AnonymousClass3 anonymousClass6 = loginActivitySmsView.timeText;
                                        anonymousClass6.invalidate();
                                        anonymousClass6.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                                        int i16 = loginActivitySmsView.nextType;
                                        if (i16 == 4 || i16 == 2 || i16 == 17 || i16 == 16 || i16 == 11 || i16 == 15) {
                                            if (i16 == 4 || i16 == 11) {
                                                anonymousClass6.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                anonymousClass6.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putString("phone", loginActivitySmsView.phone);
                                            bundle.putString("ephone", loginActivitySmsView.emailPhone);
                                            bundle.putString("phoneFormated", loginActivitySmsView.requestPhone);
                                            bundle.putInt("prevType", loginActivitySmsView.currentType);
                                            if (loginActivitySmsView.codeTimer == null) {
                                                loginActivitySmsView.codeTime = 15000;
                                                int i17 = loginActivitySmsView.time;
                                                if (i17 > 15000) {
                                                    loginActivitySmsView.codeTime = i17;
                                                }
                                                loginActivitySmsView.codeTimer = new Timer();
                                                loginActivitySmsView.lastCodeTime = System.currentTimeMillis();
                                                loginActivitySmsView.codeTimer.schedule(new zzq(loginActivitySmsView, 2), 0L, 1000L);
                                            }
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = loginActivitySmsView.requestPhone;
                                            tL_auth_resendCode.phone_code_hash = loginActivitySmsView.phoneHash;
                                            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda23(loginActivitySmsView, bundle, 0), 10);
                                        } else if (i16 == 3) {
                                            AndroidUtilities.setWaitingForSms(false);
                                            NotificationCenter.getGlobalInstance().removeObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                                            loginActivitySmsView.waitingForEvent = false;
                                            loginActivitySmsView.destroyCodeTimer();
                                            loginActivitySmsView.isResendingCode = false;
                                            loginActivitySmsView.resendCode();
                                        }
                                    }
                                    break;
                                default:
                                    LoginActivity.LoginActivitySmsView loginActivitySmsView2 = this.f$0;
                                    loginActivitySmsView2.getClass();
                                    try {
                                        loginActivitySmsView2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(loginActivitySmsView2.url)));
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    break;
                            }
                        }
                    });
                    anonymousClass4.addView(linearLayout2, LayoutHelper.createFrame(52.0f, -1));
                    RLottieImageView rLottieImageView3 = new RLottieImageView(context);
                    this.openFragmentImageView = rLottieImageView3;
                    rLottieImageView3.setAnimation(R.raw.fragment, 36, 36, null);
                    linearLayout2.addView(rLottieImageView3, LayoutHelper.createLinear(36, 36, 16, 0, 0, 2, 0));
                    TextView textView3 = new TextView(context);
                    textView3.setText(LocaleController.getString(R.string.OpenFragment));
                    textView3.setTextColor(-1);
                    textView3.setTextSize(1, 15.0f);
                    textView3.setGravity(17);
                    textView3.setTypeface(AndroidUtilities.bold());
                    linearLayout2.addView(textView3);
                }
                TextView textView4 = new TextView(context);
                this.wrongCode = textView4;
                textView4.setLineSpacing(zzlm.m(2.0f, R.string.WrongCode, textView4), 1.0f);
                textView4.setTextSize(1, 15.0f);
                textView4.setGravity(49);
                textView4.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                anonymousClass4.addView(textView4, LayoutHelper.createFrame(-2, -2, 17));
                if (viewGroup == null) {
                    FrameLayout frameLayout5 = new FrameLayout(context);
                    if (i == 15) {
                        i2 = -1;
                    } else {
                        i2 = -2;
                    }
                    frameLayout5.addView(anonymousClass4, LayoutHelper.createFrame(i2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(frameLayout5, LayoutHelper.createLinear(1.0f, -1, 0));
                } else {
                    viewGroup.addView(anonymousClass4, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                new PhotoViewer.AnonymousClass14(anonymousClass4);
                if (i != 15) {
                    this.problemText.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(26, this, context));
                }
            }
            textView2.setText(string == null ? LocaleController.getString(R.string.MissedCallDescriptionTitle) : string);
            FrameLayout frameLayout6 = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            this.missedCallArrowIcon = imageView;
            ImageView imageView2 = new ImageView(context);
            this.missedCallPhoneIcon = imageView2;
            frameLayout6.addView(imageView);
            frameLayout6.addView(imageView2);
            imageView.setImageResource(R.drawable.login_arrow1);
            imageView2.setImageResource(R.drawable.login_phone1);
            addView(frameLayout6, LayoutHelper.createLinear(64, 64, 1, 0, 16, 0, 0));
            addView(textView2, LayoutHelper.createLinear(-2, -2, 49, 0, 8, 0, 0));
            TextView textView5 = new TextView(context);
            this.missedCallDescriptionSubtitle = textView5;
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(1);
            textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.MissedCallDescriptionSubtitle, textView5);
            addView(textView5, LayoutHelper.createLinear(-1, -2, 49, 36, 16, 36, 0));
            final int i16 = 0;
            CodeFieldContainer codeFieldContainer2 = new CodeFieldContainer(this, context) {
                public final LoginActivitySmsView this$1;

                {
                    this.this$1 = this;
                }

                @Override
                public final void processNextPressed() {
                    switch (i16) {
                        case 0:
                            this.this$1.onNextPressed(null);
                            break;
                        default:
                            this.this$1.onNextPressed(null);
                            break;
                    }
                }
            };
            this.codeFieldContainer = codeFieldContainer2;
            LinearLayout linearLayoutM = zzkf.m(context, 0);
            TextView textView6 = new TextView(context);
            this.prefixTextView = textView6;
            textView6.setTextSize(1, 20.0f);
            textView6.setMaxLines(1);
            textView6.setTypeface(AndroidUtilities.bold());
            textView6.setPadding(0, 0, 0, 0);
            textView6.setGravity(16);
            linearLayoutM.addView(textView6, LayoutHelper.createLinear(-2, -1, 16, 0, 0, 4, 0));
            linearLayoutM.addView(codeFieldContainer2, LayoutHelper.createLinear(-2, -1));
            addView(linearLayoutM, LayoutHelper.createLinear(-2, 34, 1, 0, 28, 0, 0));
            TextView textView7 = new TextView(context);
            this.missedCallDescriptionSubtitle2 = textView7;
            textView7.setTextSize(1, 14.0f);
            textView7.setGravity(1);
            textView7.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.MissedCallDescriptionSubtitle2, textView7);
            addView(textView7, LayoutHelper.createLinear(-1, -2, 49, 36, 28, 36, 12));
            viewGroup = null;
            if (i != 11) {
                final int i17 = 1;
                CodeFieldContainer codeFieldContainer3 = new CodeFieldContainer(this, context) {
                    public final LoginActivitySmsView this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override
                    public final void processNextPressed() {
                        switch (i17) {
                            case 0:
                                this.this$1.onNextPressed(null);
                                break;
                            default:
                                this.this$1.onNextPressed(null);
                                break;
                        }
                    }
                };
                this.codeFieldContainer = codeFieldContainer3;
                addView(codeFieldContainer3, LayoutHelper.createLinear(-2, 42, 1, 0, 32, 0, 0));
            }
            if (i == 3) {
                this.codeFieldContainer.setVisibility(8);
            }
            LoadingTextView loadingTextView2 = new LoadingTextView(LoginActivity.this, context);
            this.prevTypeTextView = loadingTextView2;
            int i18 = Theme.key_windowBackgroundWhiteValueText;
            loadingTextView2.setLinkTextColor(Theme.getColor(null, i18, false));
            loadingTextView2.setTextColor(LoginActivity.this.getThemedColor(i18));
            loadingTextView2.setTextSize(1, 14.0f);
            loadingTextView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            loadingTextView2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            final int i19 = 0;
            loadingTextView2.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivitySmsView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i19) {
                        case 0:
                            this.f$0.onBackPressed(true);
                            break;
                        case 1:
                            LoginActivity.LoginActivitySmsView loginActivitySmsView = this.f$0;
                            if (loginActivitySmsView.time <= 0 || loginActivitySmsView.timeTimer == null) {
                                loginActivitySmsView.isResendingCode = true;
                                LoginActivity.LoginActivitySmsView.AnonymousClass3 anonymousClass6 = loginActivitySmsView.timeText;
                                anonymousClass6.invalidate();
                                anonymousClass6.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                                int i110 = loginActivitySmsView.nextType;
                                if (i110 == 4 || i110 == 2 || i110 == 17 || i110 == 16 || i110 == 11 || i110 == 15) {
                                    if (i110 == 4 || i110 == 11) {
                                        anonymousClass6.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        anonymousClass6.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", loginActivitySmsView.phone);
                                    bundle.putString("ephone", loginActivitySmsView.emailPhone);
                                    bundle.putString("phoneFormated", loginActivitySmsView.requestPhone);
                                    bundle.putInt("prevType", loginActivitySmsView.currentType);
                                    if (loginActivitySmsView.codeTimer == null) {
                                        loginActivitySmsView.codeTime = 15000;
                                        int i111 = loginActivitySmsView.time;
                                        if (i111 > 15000) {
                                            loginActivitySmsView.codeTime = i111;
                                        }
                                        loginActivitySmsView.codeTimer = new Timer();
                                        loginActivitySmsView.lastCodeTime = System.currentTimeMillis();
                                        loginActivitySmsView.codeTimer.schedule(new zzq(loginActivitySmsView, 2), 0L, 1000L);
                                    }
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = loginActivitySmsView.requestPhone;
                                    tL_auth_resendCode.phone_code_hash = loginActivitySmsView.phoneHash;
                                    ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda23(loginActivitySmsView, bundle, 0), 10);
                                } else if (i110 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                                    loginActivitySmsView.waitingForEvent = false;
                                    loginActivitySmsView.destroyCodeTimer();
                                    loginActivitySmsView.isResendingCode = false;
                                    loginActivitySmsView.resendCode();
                                }
                            }
                            break;
                        default:
                            LoginActivity.LoginActivitySmsView loginActivitySmsView2 = this.f$0;
                            loginActivitySmsView2.getClass();
                            try {
                                loginActivitySmsView2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(loginActivitySmsView2.url)));
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            break;
                    }
                }
            });
            addView(loadingTextView2, LayoutHelper.createLinear(-2, -2, 1, 0, 18, 0, 0));
            loadingTextView2.setVisibility(8);
            frameLayout = new FrameLayout(context);
            this.problemFrame = frameLayout;
            AnonymousClass3 anonymousClass6 = new AnonymousClass3(this, context, 0);
            this.timeText = anonymousClass6;
            anonymousClass6.setLinkTextColor(Theme.getColor(null, i18, false));
            anonymousClass6.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            anonymousClass6.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            anonymousClass6.setTextSize(1, 15.0f);
            anonymousClass6.setGravity(51);
            final int i110 = 1;
            anonymousClass6.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivitySmsView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i110) {
                        case 0:
                            this.f$0.onBackPressed(true);
                            break;
                        case 1:
                            LoginActivity.LoginActivitySmsView loginActivitySmsView = this.f$0;
                            if (loginActivitySmsView.time <= 0 || loginActivitySmsView.timeTimer == null) {
                                loginActivitySmsView.isResendingCode = true;
                                LoginActivity.LoginActivitySmsView.AnonymousClass3 anonymousClass7 = loginActivitySmsView.timeText;
                                anonymousClass7.invalidate();
                                anonymousClass7.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                                int i111 = loginActivitySmsView.nextType;
                                if (i111 == 4 || i111 == 2 || i111 == 17 || i111 == 16 || i111 == 11 || i111 == 15) {
                                    if (i111 == 4 || i111 == 11) {
                                        anonymousClass7.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        anonymousClass7.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", loginActivitySmsView.phone);
                                    bundle.putString("ephone", loginActivitySmsView.emailPhone);
                                    bundle.putString("phoneFormated", loginActivitySmsView.requestPhone);
                                    bundle.putInt("prevType", loginActivitySmsView.currentType);
                                    if (loginActivitySmsView.codeTimer == null) {
                                        loginActivitySmsView.codeTime = 15000;
                                        int i112 = loginActivitySmsView.time;
                                        if (i112 > 15000) {
                                            loginActivitySmsView.codeTime = i112;
                                        }
                                        loginActivitySmsView.codeTimer = new Timer();
                                        loginActivitySmsView.lastCodeTime = System.currentTimeMillis();
                                        loginActivitySmsView.codeTimer.schedule(new zzq(loginActivitySmsView, 2), 0L, 1000L);
                                    }
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = loginActivitySmsView.requestPhone;
                                    tL_auth_resendCode.phone_code_hash = loginActivitySmsView.phoneHash;
                                    ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda23(loginActivitySmsView, bundle, 0), 10);
                                } else if (i111 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                                    loginActivitySmsView.waitingForEvent = false;
                                    loginActivitySmsView.destroyCodeTimer();
                                    loginActivitySmsView.isResendingCode = false;
                                    loginActivitySmsView.resendCode();
                                }
                            }
                            break;
                        default:
                            LoginActivity.LoginActivitySmsView loginActivitySmsView2 = this.f$0;
                            loginActivitySmsView2.getClass();
                            try {
                                loginActivitySmsView2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(loginActivitySmsView2.url)));
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            break;
                    }
                }
            });
            frameLayout.addView(anonymousClass6, LayoutHelper.createFrame(-2, -2, 49));
            anonymousClass4 = new AnonymousClass4(context, 0);
            this.errorViewSwitcher = anonymousClass4;
            if (i != 15) {
                Animation animationLoadAnimation5 = AnimationUtils.loadAnimation(context, R.anim.text_in);
                Interpolator interpolator3 = Easings.easeInOutQuad;
                animationLoadAnimation5.setInterpolator(interpolator3);
                anonymousClass4.setInAnimation(animationLoadAnimation5);
                Animation animationLoadAnimation6 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                animationLoadAnimation6.setInterpolator(interpolator3);
                anonymousClass4.setOutAnimation(animationLoadAnimation6);
                AnonymousClass3 anonymousClass7 = new AnonymousClass3(this, context, 1);
                this.problemText = anonymousClass7;
                anonymousClass7.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                anonymousClass7.setTextSize(1, 15.0f);
                anonymousClass7.setGravity(49);
                anonymousClass7.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                frameLayout.addView(anonymousClass7, LayoutHelper.createFrame(-1, -2, 17));
                anonymousClass4.addView(frameLayout, LayoutHelper.createFrame(-2, -2, 17));
            } else {
                Animation animationLoadAnimation7 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                Interpolator interpolator4 = CubicBezierInterpolator.DEFAULT;
                animationLoadAnimation7.setInterpolator(interpolator4);
                anonymousClass4.setInAnimation(animationLoadAnimation7);
                Animation animationLoadAnimation8 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
                animationLoadAnimation8.setInterpolator(interpolator4);
                anonymousClass4.setOutAnimation(animationLoadAnimation8);
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.openFragmentButton = linearLayout3;
                linearLayout3.setOrientation(0);
                linearLayout3.setGravity(17);
                linearLayout3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                int iDp2 = AndroidUtilities.dp(6.0f);
                int color3 = Theme.getColor(null, Theme.key_changephoneinfo_image2, false);
                int color4 = Theme.getColor(null, Theme.key_chats_actionPressedBackground, false);
                linearLayout3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, color3, color4, color4));
                final int i111 = 2;
                linearLayout3.setOnClickListener(new View.OnClickListener(this) {
                    public final LoginActivity.LoginActivitySmsView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i111) {
                            case 0:
                                this.f$0.onBackPressed(true);
                                break;
                            case 1:
                                LoginActivity.LoginActivitySmsView loginActivitySmsView = this.f$0;
                                if (loginActivitySmsView.time <= 0 || loginActivitySmsView.timeTimer == null) {
                                    loginActivitySmsView.isResendingCode = true;
                                    LoginActivity.LoginActivitySmsView.AnonymousClass3 anonymousClass8 = loginActivitySmsView.timeText;
                                    anonymousClass8.invalidate();
                                    anonymousClass8.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                                    int i112 = loginActivitySmsView.nextType;
                                    if (i112 == 4 || i112 == 2 || i112 == 17 || i112 == 16 || i112 == 11 || i112 == 15) {
                                        if (i112 == 4 || i112 == 11) {
                                            anonymousClass8.setText(LocaleController.getString(R.string.Calling));
                                        } else {
                                            anonymousClass8.setText(LocaleController.getString(R.string.SendingSms));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", loginActivitySmsView.phone);
                                        bundle.putString("ephone", loginActivitySmsView.emailPhone);
                                        bundle.putString("phoneFormated", loginActivitySmsView.requestPhone);
                                        bundle.putInt("prevType", loginActivitySmsView.currentType);
                                        if (loginActivitySmsView.codeTimer == null) {
                                            loginActivitySmsView.codeTime = 15000;
                                            int i113 = loginActivitySmsView.time;
                                            if (i113 > 15000) {
                                                loginActivitySmsView.codeTime = i113;
                                            }
                                            loginActivitySmsView.codeTimer = new Timer();
                                            loginActivitySmsView.lastCodeTime = System.currentTimeMillis();
                                            loginActivitySmsView.codeTimer.schedule(new zzq(loginActivitySmsView, 2), 0L, 1000L);
                                        }
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = loginActivitySmsView.requestPhone;
                                        tL_auth_resendCode.phone_code_hash = loginActivitySmsView.phoneHash;
                                        ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda23(loginActivitySmsView, bundle, 0), 10);
                                    } else if (i112 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        NotificationCenter.getGlobalInstance().removeObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                                        loginActivitySmsView.waitingForEvent = false;
                                        loginActivitySmsView.destroyCodeTimer();
                                        loginActivitySmsView.isResendingCode = false;
                                        loginActivitySmsView.resendCode();
                                    }
                                }
                                break;
                            default:
                                LoginActivity.LoginActivitySmsView loginActivitySmsView2 = this.f$0;
                                loginActivitySmsView2.getClass();
                                try {
                                    loginActivitySmsView2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(loginActivitySmsView2.url)));
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                break;
                        }
                    }
                });
                anonymousClass4.addView(linearLayout3, LayoutHelper.createFrame(52.0f, -1));
                RLottieImageView rLottieImageView4 = new RLottieImageView(context);
                this.openFragmentImageView = rLottieImageView4;
                rLottieImageView4.setAnimation(R.raw.fragment, 36, 36, null);
                linearLayout3.addView(rLottieImageView4, LayoutHelper.createLinear(36, 36, 16, 0, 0, 2, 0));
                TextView textView8 = new TextView(context);
                textView8.setText(LocaleController.getString(R.string.OpenFragment));
                textView8.setTextColor(-1);
                textView8.setTextSize(1, 15.0f);
                textView8.setGravity(17);
                textView8.setTypeface(AndroidUtilities.bold());
                linearLayout3.addView(textView8);
            }
            TextView textView9 = new TextView(context);
            this.wrongCode = textView9;
            textView9.setLineSpacing(zzlm.m(2.0f, R.string.WrongCode, textView9), 1.0f);
            textView9.setTextSize(1, 15.0f);
            textView9.setGravity(49);
            textView9.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
            anonymousClass4.addView(textView9, LayoutHelper.createFrame(-2, -2, 17));
            if (viewGroup == null) {
                FrameLayout frameLayout7 = new FrameLayout(context);
                if (i == 15) {
                    i2 = -1;
                } else {
                    i2 = -2;
                }
                frameLayout7.addView(anonymousClass4, LayoutHelper.createFrame(i2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                addView(frameLayout7, LayoutHelper.createLinear(1.0f, -1, 0));
            } else {
                viewGroup.addView(anonymousClass4, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
            }
            new PhotoViewer.AnonymousClass14(anonymousClass4);
            if (i != 15) {
                this.problemText.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(26, this, context));
            }
        }

        public static void applyLottieColors(RLottieDrawable rLottieDrawable) {
            if (rLottieDrawable != null) {
                int color = Theme.getColor(null, Theme.key_chats_actionBackground, false);
                HashMap map = rLottieDrawable.newColorUpdates;
                OKLCH.m(color, map, "Bubble", rLottieDrawable);
                int i = Theme.key_windowBackgroundWhiteBlackText;
                OKLCH.m(Theme.getColor(null, i, false), map, "Phone", rLottieDrawable);
                OKLCH.m(Theme.getColor(null, i, false), map, "Note", rLottieDrawable);
            }
        }

        public void setProblemTextVisible(boolean z) {
            AnonymousClass3 anonymousClass3 = this.problemText;
            if (anonymousClass3 == null) {
                return;
            }
            float f = z ? 1.0f : 0.0f;
            if (anonymousClass3.getAlpha() != f) {
                anonymousClass3.animate().cancel();
                anonymousClass3.animate().alpha(f).setDuration(150L).start();
            }
        }

        public final void animateSuccess(Runnable runnable) {
            if (this.currentType == 3) {
                runnable.run();
                return;
            }
            int i = 0;
            while (true) {
                CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    codeFieldContainer.postDelayed(new LinkManager$$ExternalSyntheticLambda2(15, this, runnable), (((long) codeNumberFieldArr.length) * 75) + 400);
                    return;
                } else {
                    codeFieldContainer.postDelayed(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda28(this, i, 2), ((long) i) * 75);
                    i++;
                }
            }
        }

        public final void createTimer() {
            if (this.timeTimer != null) {
                return;
            }
            int i = Theme.key_windowBackgroundWhiteGrayText6;
            int color = Theme.getColor(null, i, false);
            AnonymousClass3 anonymousClass3 = this.timeText;
            anonymousClass3.setTextColor(color);
            anonymousClass3.setTag(R.id.color_key_tag, Integer.valueOf(i));
            Timer timer = new Timer();
            this.timeTimer = timer;
            timer.schedule(new AnonymousClass8(), 0L, 1000L);
        }

        public final void destroyCodeTimer() {
            try {
                synchronized (this.timerSync) {
                    try {
                        Timer timer = this.codeTimer;
                        if (timer != null) {
                            timer.cancel();
                            this.codeTimer = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public final void destroyTimer() {
            AnonymousClass3 anonymousClass3 = this.timeText;
            int i = Theme.key_windowBackgroundWhiteGrayText6;
            anonymousClass3.setTextColor(Theme.getColor(null, i, false));
            this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i));
            try {
                synchronized (this.timerSync) {
                    try {
                        Timer timer = this.timeTimer;
                        if (timer != null) {
                            timer.cancel();
                            this.timeTimer = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (this.waitingForEvent) {
                CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                if (codeFieldContainer.codeField == null) {
                    return;
                }
                if (i == NotificationCenter.didReceiveSmsCode) {
                    codeFieldContainer.setText("" + objArr[0]);
                    onNextPressed(null);
                    return;
                }
                if (i == NotificationCenter.didReceiveCall) {
                    String str = "" + objArr[0];
                    if (AndroidUtilities.checkPhonePattern(this.pattern, str)) {
                        if (!this.pattern.equals("*")) {
                            this.catchedPhone = str;
                            AndroidUtilities.endIncomingCall();
                        }
                        onNextPressed(str);
                        CallReceiver.clearLastCall();
                    }
                }
            }
        }

        @Override
        public String getHeaderName() {
            int i = this.currentType;
            return (i == 3 || i == 11) ? this.phone : LocaleController.getString("YourCode", R.string.YourCode);
        }

        @Override
        public final boolean hasCustomKeyboard() {
            return this.currentType != 3;
        }

        @Override
        public final boolean needBackButton() {
            return true;
        }

        @Override
        public final boolean onBackPressed(boolean z) {
            LoginActivity loginActivity = LoginActivity.this;
            int i = 0;
            if (loginActivity.activityMode != 0) {
                loginActivity.finishFragment();
                return false;
            }
            int i2 = this.prevType;
            if (i2 != 0) {
                loginActivity.setPage(i2, true, null, true);
                return false;
            }
            if (!z) {
                AlertDialog.Builder builder = new AlertDialog.Builder(loginActivity.getParentActivity(), 0, null);
                String string = LocaleController.getString(R.string.EditNumber);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.phone));
                builder.setPositiveButton(LocaleController.getString(R.string.Close), null);
                builder.setNegativeButton(LocaleController.getString(R.string.Edit), new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda19(this, i));
                loginActivity.showDialog(alertDialog);
                return false;
            }
            this.nextPressed = false;
            tryHideProgress(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.requestPhone;
            tL_auth_cancelCode.phone_code_hash = this.phoneHash;
            ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(tL_auth_cancelCode, new PassportActivity$$ExternalSyntheticLambda1(13), 10);
            destroyTimer();
            destroyCodeTimer();
            this.currentParams = null;
            int i3 = this.currentType;
            if (i3 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i3 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i3 == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.waitingForEvent = false;
            return true;
        }

        @Override
        public final void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public final void onConfigurationChanged(Configuration configuration) {
            CodeNumberField[] codeNumberFieldArr;
            boolean z;
            super.onConfigurationChanged(configuration);
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            if (codeFieldContainer == null || (codeNumberFieldArr = codeFieldContainer.codeField) == null) {
                return;
            }
            for (CodeNumberField codeNumberField : codeNumberFieldArr) {
                if (hasCustomKeyboard()) {
                    LoginActivity.this.getClass();
                    if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = true;
                }
                codeNumberField.setShowSoftInputOnFocusCompat(z);
            }
        }

        @Override
        public final void onDestroyActivity() {
            int i = this.currentType;
            if (i == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.waitingForEvent = false;
            destroyTimer();
            destroyCodeTimer();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            removeCallbacks(this.errorColorTimeout);
        }

        @Override
        public final void onHide() {
            Bundle bundle;
            this.isResendingCode = false;
            this.nextPressed = false;
            if (this.prevType == 0 || (bundle = this.currentParams) == null) {
                return;
            }
            bundle.putInt("timeout", this.time);
        }

        @Override
        public final void onNextPressed(String str) {
            LoginActivity loginActivity = LoginActivity.this;
            int i = loginActivity.currentViewNum;
            if (i == 11) {
                if (this.nextPressed) {
                    return;
                }
            } else {
                if (this.nextPressed) {
                    return;
                }
                if ((i < 1 || i > 4) && i != 15) {
                    return;
                }
            }
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            if (str == null) {
                str = codeFieldContainer.getCode();
            }
            int i2 = 0;
            if (TextUtils.isEmpty(str)) {
                LoginActivity.onFieldError(codeFieldContainer, false);
                return;
            }
            int i3 = loginActivity.currentViewNum;
            if (i3 < 1 || i3 > 4 || !codeFieldContainer.isFocusSuppressed) {
                this.nextPressed = true;
                int i4 = this.currentType;
                if (i4 == 15) {
                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
                } else if (i4 == 2) {
                    AndroidUtilities.setWaitingForSms(false);
                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
                } else if (i4 == 3) {
                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
                }
                this.waitingForEvent = false;
                int i5 = loginActivity.activityMode;
                if (i5 == 1) {
                    this.requestPhone = loginActivity.cancelDeletionPhone;
                    TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
                    confirmphone.phone_code = str;
                    confirmphone.phone_code_hash = this.phoneHash;
                    destroyTimer();
                    codeFieldContainer.isFocusSuppressed = true;
                    CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
                    int length = codeNumberFieldArr.length;
                    while (i2 < length) {
                        CodeNumberField.animateSpring(codeNumberFieldArr[i2].focusedSpringAnimation, 0.0f);
                        i2++;
                    }
                    tryShowProgress(ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(confirmphone, new LinkManager$$ExternalSyntheticLambda8(28, this, confirmphone), 2));
                    return;
                }
                if (i5 == 2) {
                    TL_account.changePhone changephone = new TL_account.changePhone();
                    changephone.phone_number = this.requestPhone;
                    changephone.phone_code = str;
                    changephone.phone_code_hash = this.phoneHash;
                    destroyTimer();
                    codeFieldContainer.isFocusSuppressed = true;
                    CodeNumberField[] codeNumberFieldArr2 = codeFieldContainer.codeField;
                    int length2 = codeNumberFieldArr2.length;
                    while (i2 < length2) {
                        CodeNumberField.animateSpring(codeNumberFieldArr2[i2].focusedSpringAnimation, 0.0f);
                        i2++;
                    }
                    tryShowProgress(ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(changephone, new LinkManager$$ExternalSyntheticLambda3(this, 15), 2));
                    loginActivity.showDoneButton(true, true);
                    return;
                }
                TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                tL_auth_signIn.phone_number = this.requestPhone;
                tL_auth_signIn.phone_code = str;
                tL_auth_signIn.phone_code_hash = this.phoneHash;
                tL_auth_signIn.flags |= 1;
                destroyTimer();
                codeFieldContainer.isFocusSuppressed = true;
                CodeNumberField[] codeNumberFieldArr3 = codeFieldContainer.codeField;
                int length3 = codeNumberFieldArr3.length;
                while (i2 < length3) {
                    CodeNumberField.animateSpring(codeNumberFieldArr3[i2].focusedSpringAnimation, 0.0f);
                    i2++;
                }
                tryShowProgress(ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(tL_auth_signIn, new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda16(this, tL_auth_signIn, 0), 10));
                loginActivity.showDoneButton(true, true);
            }
        }

        @Override
        public final void onShow() {
            RLottieDrawable rLottieDrawable = this.hintDrawable;
            if (rLottieDrawable != null) {
                rLottieDrawable.setCurrentFrame(0, true, false);
            }
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(this, 0), LoginActivity.SHOW_DELAY);
        }

        public final void resendCode() {
            if (this.nextPressed || this.isResendingCode) {
                return;
            }
            LoginActivity loginActivity = LoginActivity.this;
            if (loginActivity.isRequestingFirebaseSms) {
                return;
            }
            this.isResendingCode = true;
            this.timeText.invalidate();
            this.problemText.invalidate();
            Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            bundle.putString("ephone", this.emailPhone);
            bundle.putString("phoneFormated", this.requestPhone);
            bundle.putInt("prevType", this.currentType);
            this.nextPressed = true;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = this.requestPhone;
            tL_auth_resendCode.phone_code_hash = this.phoneHash;
            tryShowProgress(ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(tL_auth_resendCode, new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda23(this, bundle, 1), 10));
        }

        @Override
        public final void restoreStateParams(Bundle bundle) {
            StringBuilder sb = new StringBuilder("smsview_params_");
            int i = this.currentType;
            sb.append(i);
            Bundle bundle2 = bundle.getBundle(sb.toString());
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            String string = bundle.getString("catchedPhone");
            if (string != null) {
                this.catchedPhone = string;
            }
            String string2 = bundle.getString("smsview_code_" + i);
            if (string2 != null) {
                CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                if (codeFieldContainer.codeField != null) {
                    codeFieldContainer.setText(string2);
                }
            }
            int i2 = bundle.getInt("time");
            if (i2 != 0) {
                this.time = i2;
            }
            int i3 = bundle.getInt("open");
            if (i3 != 0) {
                this.openTime = i3;
            }
        }

        @Override
        public final void saveStateParams(Bundle bundle) {
            String code = this.codeFieldContainer.getCode();
            int length = code.length();
            int i = this.currentType;
            if (length != 0) {
                bundle.putString("smsview_code_" + i, code);
            }
            String str = this.catchedPhone;
            if (str != null) {
                bundle.putString("catchedPhone", str);
            }
            if (this.currentParams != null) {
                bundle.putBundle(SurfaceContainer$$ExternalSyntheticOutline0.m(i, "smsview_params_"), this.currentParams);
            }
            int i2 = this.time;
            if (i2 != 0) {
                bundle.putInt("time", i2);
            }
            int i3 = this.openTime;
            if (i3 != 0) {
                bundle.putInt("open", i3);
            }
        }

        @Override
        public final void setParams(Bundle bundle, boolean z) {
            CharSequence charSequenceReplaceTags;
            AnonymousClass3 anonymousClass3;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            boolean z2;
            int i7;
            AnonymousClass3 anonymousClass4;
            int i8;
            int i9;
            int i10;
            String strSubstring;
            String string;
            String strM;
            int i11;
            String strSubstring2;
            int i12;
            int iLastIndexOf;
            SpannableStringBuilder spannableStringBuilder;
            int i13 = 2;
            if (bundle == null) {
                if (this.nextCodeParams == null || this.nextCodeAuth == null) {
                    return;
                }
                setProblemTextVisible(true);
                this.timeText.setVisibility(8);
                AnonymousClass3 anonymousClass5 = this.problemText;
                if (anonymousClass5 != null) {
                    anonymousClass5.setVisibility(0);
                    this.problemText.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                    int i14 = this.nextType;
                    this.problemText.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i14 == 17 ? R.string.ReturnEnteringPhrase : i14 == 16 ? R.string.ReturnEnteringWord : R.string.ReturnEnteringSMS), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                    return;
                }
                return;
            }
            this.waitingForEvent = true;
            int i15 = this.currentType;
            if (i15 == 15) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i15 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i15 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
                if (z) {
                    AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(19));
                }
            }
            this.currentParams = bundle;
            this.phone = bundle.getString("phone");
            this.emailPhone = bundle.getString("ephone");
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = bundle.getString("phoneHash");
            this.time = bundle.getInt("timeout");
            this.openTime = (int) (System.currentTimeMillis() / 1000);
            this.nextType = bundle.getInt("nextType");
            this.pattern = bundle.getString("pattern");
            this.prefix = bundle.getString("prefix");
            this.length = bundle.getInt("length");
            this.prevType = bundle.getInt("prevType", 0);
            if (this.length == 0) {
                this.length = 5;
            }
            this.url = bundle.getString("url");
            this.nextCodeParams = null;
            this.nextCodeAuth = null;
            this.codeFieldContainer.setNumbersCount(this.length, this.currentType);
            for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                codeNumberField.setShowSoftInputOnFocusCompat(!hasCustomKeyboard() || AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                codeNumberField.addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 25));
                codeNumberField.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, 12));
            }
            int i16 = this.prevType;
            if (i16 == 17) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else if (i16 == 16) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else {
                this.prevTypeTextView.setVisibility(8);
            }
            if (this.phone == null) {
                return;
            }
            String str = PhoneFormat.getInstance().format(this.phone);
            if (LoginActivity.this.activityMode == 1) {
                spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("CancelAccountResetInfo2", R.string.CancelAccountResetInfo2, PhoneFormat.getInstance().format("+" + str))));
                int iIndexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
                int iLastIndexOf2 = TextUtils.lastIndexOf(spannableStringBuilder, '*');
                if (iIndexOf != -1 && iLastIndexOf2 != -1 && iIndexOf != iLastIndexOf2) {
                    this.confirmTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(iLastIndexOf2, iLastIndexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new URLSpanNoUnderline("tg://settings/change_number", null), iIndexOf, iLastIndexOf2 - 1, 33);
                    charSequenceReplaceTags = spannableStringBuilder;
                }
            } else {
                int i17 = this.currentType;
                if (i17 == 1) {
                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentAppCodeWithPhone", R.string.SentAppCodeWithPhone, LocaleController.addNbsp(str)));
                } else if (i17 == 2) {
                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(str)));
                } else if (i17 == 3) {
                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(str)));
                } else if (i17 == 4) {
                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(str)));
                } else {
                    charSequenceReplaceTags = i17 == 15 ? AndroidUtilities.replaceTags(LocaleController.formatString("SentFragmentCode", R.string.SentFragmentCode, LocaleController.addNbsp(str))) : "";
                }
            }
            charSequenceReplaceTags = spannableStringBuilder;
            charSequenceReplaceTags = spannableStringBuilder;
            charSequenceReplaceTags = spannableStringBuilder;
            this.confirmTextView.setText(charSequenceReplaceTags);
            int i18 = this.currentType;
            if (i18 != 15) {
                if (i18 == 1) {
                    int i19 = this.nextType;
                    if (i19 == 3 || i19 == 4 || i19 == 11) {
                        this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCodePhone));
                    } else if (i19 == 15) {
                        this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i19 == 0) {
                        this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCode));
                    } else {
                        this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
                    }
                } else {
                    this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCode));
                }
            }
            if (this.currentType != 3) {
                LoginActivity loginActivity = LoginActivity.this;
                CodeNumberField codeNumberField2 = this.codeFieldContainer.codeField[0];
                if (!loginActivity.isCustomKeyboardVisible()) {
                    AndroidUtilities.showKeyboard(codeNumberField2);
                }
                this.codeFieldContainer.codeField[0].requestFocus();
            } else {
                AndroidUtilities.hideKeyboard(this.codeFieldContainer.codeField[0]);
            }
            destroyTimer();
            destroyCodeTimer();
            this.lastCurrentTime = System.currentTimeMillis();
            int i20 = this.currentType;
            if (i20 != 1) {
                if (i20 == 3) {
                    int i21 = this.nextType;
                    if (i21 == 4 || i21 == 2 || i21 == 17 || i21 == 16 || i21 == 11) {
                        setProblemTextVisible(false);
                        this.timeText.setVisibility(0);
                        this.problemText.setVisibility(8);
                        int i22 = this.nextType;
                        if (i22 == 4 || i22 == 11) {
                            this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                        } else if (i22 == 2 || i22 == 17 || i22 == 16) {
                            this.timeText.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                        }
                    } else {
                        this.timeText.setVisibility(8);
                    }
                    String strObtainLoginPhoneCall = z ? AndroidUtilities.obtainLoginPhoneCall(this.pattern) : null;
                    if (strObtainLoginPhoneCall != null) {
                        onNextPressed(strObtainLoginPhoneCall);
                    } else {
                        String str2 = this.catchedPhone;
                        if (str2 != null) {
                            onNextPressed(str2);
                        } else {
                            int i23 = this.nextType;
                            if (i23 == 4 || i23 == 2 || i23 == 17 || i23 == 16 || i23 == 11) {
                                createTimer();
                            }
                        }
                    }
                } else if (i20 == 2) {
                    int i24 = this.nextType;
                    if (i24 != 2) {
                        i10 = 17;
                        i9 = 16;
                        if (i24 != 17 && i24 != 16 && i24 != 4 && i24 != 3) {
                            if (i20 != 4) {
                                i4 = this.nextType;
                                if (i4 != 2) {
                                    i6 = 17;
                                    if (i4 != 17) {
                                        i5 = 16;
                                    } else {
                                        i5 = 16;
                                    }
                                } else {
                                    i5 = 16;
                                    i6 = 17;
                                }
                                if (i4 != 2) {
                                    this.timeText.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                                } else {
                                    this.timeText.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                                }
                                if (this.time < 1000) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                setProblemTextVisible(z2);
                                AnonymousClass3 anonymousClass6 = this.timeText;
                                if (this.time < 1000) {
                                    i7 = 8;
                                } else {
                                    i7 = 0;
                                }
                                anonymousClass6.setVisibility(i7);
                                anonymousClass4 = this.problemText;
                                if (anonymousClass4 != null) {
                                    if (this.time < 1000) {
                                        i8 = 0;
                                    } else {
                                        i8 = 8;
                                    }
                                    anonymousClass4.setVisibility(i8);
                                }
                                createTimer();
                            } else if (i20 == 11) {
                                i2 = this.nextType;
                                if (i2 != 4) {
                                    setProblemTextVisible(false);
                                    this.timeText.setVisibility(0);
                                    this.problemText.setVisibility(8);
                                    i3 = this.nextType;
                                    if (i3 != 4) {
                                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                    } else {
                                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                    }
                                    createTimer();
                                } else {
                                    setProblemTextVisible(false);
                                    this.timeText.setVisibility(0);
                                    this.problemText.setVisibility(8);
                                    i3 = this.nextType;
                                    if (i3 != 4) {
                                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                    } else {
                                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                    }
                                    createTimer();
                                }
                            } else {
                                this.timeText.setVisibility(8);
                                anonymousClass3 = this.problemText;
                                if (anonymousClass3 != null) {
                                    anonymousClass3.setVisibility(0);
                                }
                                setProblemTextVisible(false);
                                if (this.codeTimer == null) {
                                    this.codeTime = 15000;
                                    i = this.time;
                                    if (i > 15000) {
                                        this.codeTime = i;
                                    }
                                    this.codeTimer = new Timer();
                                    this.lastCodeTime = System.currentTimeMillis();
                                    this.codeTimer.schedule(new zzq(this, i13), 0L, 1000L);
                                }
                            }
                        }
                    } else {
                        i9 = 16;
                        i10 = 17;
                    }
                    if (i24 == 2 || i24 == i10 || i24 == i9) {
                        this.timeText.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                    } else {
                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 2, 0));
                    }
                    setProblemTextVisible(this.time < 1000);
                    this.timeText.setVisibility(this.time < 1000 ? 8 : 0);
                    AnonymousClass3 anonymousClass7 = this.problemText;
                    if (anonymousClass7 != null) {
                        anonymousClass7.setVisibility(this.time < 1000 ? 0 : 8);
                    }
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                    String string2 = sharedPreferences.getString("sms_hash", null);
                    if (TextUtils.isEmpty(string2) || (string = sharedPreferences.getString("sms_hash_code", null)) == null) {
                        strSubstring = null;
                    } else {
                        if (!string.contains(string2 + "|") || LoginActivity.this.newAccount) {
                            strSubstring = null;
                        } else {
                            strSubstring = string.substring(string.indexOf(124) + 1);
                        }
                    }
                    if (strSubstring != null) {
                        this.codeFieldContainer.setCode(strSubstring);
                        onNextPressed(null);
                    } else {
                        createTimer();
                    }
                } else if (i20 != 4) {
                    i4 = this.nextType;
                    if (i4 != 2) {
                        i6 = 17;
                        if (i4 != 17 || i4 == 11) {
                            i5 = 16;
                        } else {
                            i5 = 16;
                            if (i4 != 16) {
                                if (i20 == 11) {
                                    i2 = this.nextType;
                                    if (i2 != 4) {
                                        setProblemTextVisible(false);
                                        this.timeText.setVisibility(0);
                                        this.problemText.setVisibility(8);
                                        i3 = this.nextType;
                                        if (i3 != 4) {
                                            this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                        } else {
                                            this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                        }
                                        createTimer();
                                    } else {
                                        setProblemTextVisible(false);
                                        this.timeText.setVisibility(0);
                                        this.problemText.setVisibility(8);
                                        i3 = this.nextType;
                                        if (i3 != 4) {
                                            this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                        } else {
                                            this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                        }
                                        createTimer();
                                    }
                                } else {
                                    this.timeText.setVisibility(8);
                                    anonymousClass3 = this.problemText;
                                    if (anonymousClass3 != null) {
                                        anonymousClass3.setVisibility(0);
                                    }
                                    setProblemTextVisible(false);
                                    if (this.codeTimer == null) {
                                        this.codeTime = 15000;
                                        i = this.time;
                                        if (i > 15000) {
                                            this.codeTime = i;
                                        }
                                        this.codeTimer = new Timer();
                                        this.lastCodeTime = System.currentTimeMillis();
                                        this.codeTimer.schedule(new zzq(this, i13), 0L, 1000L);
                                    }
                                }
                            }
                        }
                    } else {
                        i5 = 16;
                        i6 = 17;
                    }
                    if (i4 != 2 || i4 == i6 || i4 == i5) {
                        this.timeText.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                    } else {
                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 2, 0));
                    }
                    if (this.time < 1000) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    setProblemTextVisible(z2);
                    AnonymousClass3 anonymousClass8 = this.timeText;
                    if (this.time < 1000) {
                        i7 = 8;
                    } else {
                        i7 = 0;
                    }
                    anonymousClass8.setVisibility(i7);
                    anonymousClass4 = this.problemText;
                    if (anonymousClass4 != null) {
                        if (this.time < 1000) {
                            i8 = 0;
                        } else {
                            i8 = 8;
                        }
                        anonymousClass4.setVisibility(i8);
                    }
                    createTimer();
                } else if (i20 == 11) {
                    i2 = this.nextType;
                    if (i2 != 4 || i2 == 2 || i2 == 17 || i2 == 16 || i2 == 11) {
                        setProblemTextVisible(false);
                        this.timeText.setVisibility(0);
                        this.problemText.setVisibility(8);
                        i3 = this.nextType;
                        if (i3 != 4 || i3 == 11) {
                            this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                        } else if (i3 == 2 || i3 == 17 || i3 == 16) {
                            this.timeText.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                        }
                        createTimer();
                    }
                } else {
                    this.timeText.setVisibility(8);
                    anonymousClass3 = this.problemText;
                    if (anonymousClass3 != null) {
                        anonymousClass3.setVisibility(0);
                    }
                    setProblemTextVisible(false);
                    if (this.codeTimer == null) {
                        this.codeTime = 15000;
                        i = this.time;
                        if (i > 15000) {
                            this.codeTime = i;
                        }
                        this.codeTimer = new Timer();
                        this.lastCodeTime = System.currentTimeMillis();
                        this.codeTimer.schedule(new zzq(this, i13), 0L, 1000L);
                    }
                }
                if (this.currentType == 11) {
                    strM = this.prefix;
                    for (i11 = 0; i11 < this.length; i11++) {
                        strM = zzhr.m(strM, "0");
                    }
                    strSubstring2 = PhoneFormat.getInstance().format("+" + strM);
                    for (i12 = 0; i12 < this.length; i12++) {
                        iLastIndexOf = strSubstring2.lastIndexOf("0");
                        if (iLastIndexOf >= 0) {
                            strSubstring2 = strSubstring2.substring(0, iLastIndexOf);
                        }
                    }
                    this.prefixTextView.setText(strSubstring2.replaceAll("\\)", "").replaceAll("\\(", ""));
                }
            }
            setProblemTextVisible(true);
            this.timeText.setVisibility(8);
            AnonymousClass3 anonymousClass9 = this.problemText;
            if (anonymousClass9 != null) {
                anonymousClass9.setVisibility(0);
            }
            if (this.currentType == 11) {
                strM = this.prefix;
                while (i11 < this.length) {
                    strM = zzhr.m(strM, "0");
                }
                strSubstring2 = PhoneFormat.getInstance().format("+" + strM);
                while (i12 < this.length) {
                    iLastIndexOf = strSubstring2.lastIndexOf("0");
                    if (iLastIndexOf >= 0) {
                        strSubstring2 = strSubstring2.substring(0, iLastIndexOf);
                    }
                }
                this.prefixTextView.setText(strSubstring2.replaceAll("\\)", "").replaceAll("\\(", ""));
            }
        }

        public final void shakeWrongCode() {
            int i;
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            try {
                codeFieldContainer.performHapticFeedback(3, 2);
                while (true) {
                    CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
                    if (i >= codeNumberFieldArr.length) {
                        break;
                    }
                    codeNumberFieldArr[i].setText("");
                    CodeNumberField.animateSpring(codeFieldContainer.codeField[i].errorSpringAnimation, 100.0f);
                    i++;
                }
            } catch (Exception unused) {
            }
            i = 0;
            AnonymousClass4 anonymousClass4 = this.errorViewSwitcher;
            if (anonymousClass4.getCurrentView() != this.wrongCode) {
                anonymousClass4.showNext();
            }
            codeFieldContainer.codeField[0].requestFocus();
            AndroidUtilities.shakeViewSpring(codeFieldContainer, this.currentType == 11 ? 3.5f : 10.0f, new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(this, 6));
            LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8 loginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8 = this.errorColorTimeout;
            removeCallbacks(loginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8);
            postDelayed(loginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8, 5000L);
            this.postedErrorColorTimeout = true;
        }

        public final void tryHideProgress(boolean z) {
            if (this.starsToDotsDrawable == null) {
                LoginActivity.this.needHideProgress(z, true);
                return;
            }
            if (this.isDotsAnimationVisible) {
                this.isDotsAnimationVisible = false;
                this.blueImageView.setAutoRepeat(false);
                RLottieDrawable rLottieDrawable = this.dotsDrawable;
                rLottieDrawable.setAutoRepeat(0);
                rLottieDrawable.setOnFinishCallback(rLottieDrawable.metaData[0] - 1, new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(this, 1));
            }
        }

        public final void tryShowProgress(int i) {
            RLottieDrawable rLottieDrawable = this.starsToDotsDrawable;
            if (rLottieDrawable == null) {
                LoginActivity.this.needShowProgress(i, true);
                return;
            }
            if (this.isDotsAnimationVisible) {
                return;
            }
            this.isDotsAnimationVisible = true;
            RLottieDrawable rLottieDrawable2 = this.hintDrawable;
            if (rLottieDrawable2.currentFrame != rLottieDrawable2.metaData[0] - 1) {
                rLottieDrawable2.onAnimationEndListener = new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda28(this, i, 0);
                return;
            }
            rLottieDrawable.onAnimationEndListener = new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(this, 2);
            RLottieImageView rLottieImageView = this.blueImageView;
            rLottieImageView.setAutoRepeat(false);
            rLottieDrawable.setCurrentFrame(0, false, false);
            rLottieImageView.setAnimation(rLottieDrawable);
            rLottieImageView.playAnimation();
        }

        @Override
        public final void updateColors$1() {
            TextView textView = this.confirmTextView;
            textView.setTextColor(Theme.getColor(null, LoginActivity.this.activityMode == 1 ? Theme.key_windowBackgroundWhiteBlackText : Theme.key_windowBackgroundWhiteGrayText6, false));
            textView.setLinkTextColor(Theme.getColor(null, Theme.key_chats_actionBackground, false));
            TextView textView2 = this.titleTextView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView2.setTextColor(Theme.getColor(null, i, false));
            int i2 = this.currentType;
            if (i2 == 11) {
                TextView textView3 = this.missedCallDescriptionSubtitle;
                int i3 = Theme.key_windowBackgroundWhiteGrayText;
                textView3.setTextColor(Theme.getColor(null, i3, false));
                this.missedCallDescriptionSubtitle2.setTextColor(Theme.getColor(null, i3, false));
                ImageView imageView = this.missedCallArrowIcon;
                int color = Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
                this.missedCallPhoneIcon.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), mode));
                this.prefixTextView.setTextColor(Theme.getColor(null, i, false));
            }
            applyLottieColors(this.hintDrawable);
            applyLottieColors(this.starsToDotsDrawable);
            applyLottieColors(this.dotsDrawable);
            applyLottieColors(this.dotsToStarsDrawable);
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            if (codeFieldContainer != null) {
                codeFieldContainer.invalidate();
            }
            AnonymousClass3 anonymousClass3 = this.timeText;
            Integer numValueOf = (Integer) anonymousClass3.getTag();
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(Theme.key_windowBackgroundWhiteGrayText6);
            }
            anonymousClass3.setTextColor(Theme.getColor(null, numValueOf.intValue(), false));
            if (i2 != 15) {
                this.problemText.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            }
            this.wrongCode.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public final class LoginPayView extends SlideView {
        public final ButtonWithCounterView button;
        public final ExplainStarsSheet.FeatureCell[] cells;
        public String lastError;
        public final ImageView optionsButton;
        public Bundle params;
        public boolean polling;
        public long pollingFormId;
        public String pollingPhoneCodeHash;
        public String pollingPhoneNumber;
        public int pollingRequestId;

        public final class AnonymousClass1 extends StarParticlesView {
            public final int $r8$classId;

            public AnonymousClass1(Context context, int i) {
                super(context);
                this.$r8$classId = i;
            }

            @Override
            public final void configure() {
                switch (this.$r8$classId) {
                    case 0:
                        StarParticlesView.Drawable drawable = this.drawable;
                        drawable.useGradient = true;
                        drawable.useBlur = false;
                        drawable.checkBounds = true;
                        drawable.isCircle = true;
                        drawable.centerOffsetY = AndroidUtilities.dp(-14.0f);
                        StarParticlesView.Drawable drawable2 = this.drawable;
                        drawable2.minLifeTime = 2000L;
                        drawable2.randLifeTime = 3000;
                        drawable2.size1 = 16;
                        drawable2.useRotate = false;
                        drawable2.type = 28;
                        drawable2.colorKey = Theme.key_premiumGradient2;
                        drawable2.init();
                        break;
                    case 1:
                        StarParticlesView.Drawable drawable3 = this.drawable;
                        drawable3.useGradient = true;
                        drawable3.useBlur = false;
                        drawable3.checkBounds = true;
                        drawable3.isCircle = true;
                        drawable3.centerOffsetY = AndroidUtilities.dp(-14.0f);
                        StarParticlesView.Drawable drawable4 = this.drawable;
                        drawable4.minLifeTime = 2000L;
                        drawable4.randLifeTime = 3000;
                        drawable4.size1 = 16;
                        drawable4.useRotate = false;
                        drawable4.type = 28;
                        drawable4.colorKey = Theme.key_premiumGradient2;
                        drawable4.init();
                        break;
                    default:
                        super.configure();
                        StarParticlesView.Drawable drawable5 = this.drawable;
                        drawable5.useGradient = true;
                        drawable5.useBlur = false;
                        drawable5.forceMaxAlpha = true;
                        drawable5.checkBounds = true;
                        drawable5.init();
                        break;
                }
            }

            @Override
            public final void onMeasure(int i, int i2) {
                switch (this.$r8$classId) {
                    case 0:
                        super.onMeasure(i, i2);
                        this.drawable.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                        break;
                    case 1:
                        super.onMeasure(i, i2);
                        this.drawable.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                        break;
                    default:
                        super.onMeasure(i, i2);
                        this.drawable.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                        break;
                }
            }
        }

        public LoginPayView(Context context) {
            super(context);
            ExplainStarsSheet.FeatureCell[] featureCellArr = {featureCell, featureCell, featureCell};
            this.cells = featureCellArr;
            this.pollingRequestId = -1;
            int i = 1;
            setOrientation(1);
            setClipChildren(false);
            setClipToPadding(false);
            setPadding(0, 0, 0, AndroidUtilities.dp(16.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            addView(frameLayout, LayoutHelper.createLinear(-1, 200));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, 0);
            frameLayout.addView(anonymousClass1, LayoutHelper.createFrame(-1, 200, 119));
            ImageView imageView = new ImageView(context);
            this.optionsButton = imageView;
            imageView.setImageResource(R.drawable.ic_ab_other);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, ((BaseFragment) LoginActivity.this).resourceProvider), PorterDuff.Mode.SRC_IN));
            imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 1, -1));
            frameLayout.addView(imageView, LayoutHelper.createFrame(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
            StarsReactionsSheet.AnonymousClass6 anonymousClass6 = new StarsReactionsSheet.AnonymousClass6(context, i, i, 4);
            anonymousClass6.setStarParticlesView(anonymousClass1);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            int i3 = Theme.key_premiumGradient2;
            canvas.drawColor(ColorUtils.blendARGB(0.5f, Theme.getColor(null, i3, false), Theme.getColor(null, Theme.key_dialogBackground, false)));
            anonymousClass6.setBackgroundBitmap(bitmapCreateBitmap);
            GLIconRenderer gLIconRenderer = anonymousClass6.mRenderer;
            gLIconRenderer.colorKey1 = i3;
            gLIconRenderer.colorKey2 = Theme.key_premiumGradient1;
            gLIconRenderer.updateColors();
            frameLayout.addView(anonymousClass6, LayoutHelper.createFrame(160, 160, 1));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.SMSFeeTitle));
            textView.setTextColor(Theme.getColor(null, i2, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
            ExplainStarsSheet.FeatureCell featureCell = new ExplainStarsSheet.FeatureCell(context, 1, ((BaseFragment) LoginActivity.this).resourceProvider);
            featureCell.set(LocaleController.getString(R.string.SMSFee1Title), LocaleController.getString(R.string.SMSFee1Text), R.drawable.menu_high_price);
            addView(featureCellArr[0], LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 6));
            ExplainStarsSheet.FeatureCell featureCell2 = new ExplainStarsSheet.FeatureCell(context, 1, ((BaseFragment) LoginActivity.this).resourceProvider);
            featureCell2.set(LocaleController.getString(R.string.SMSFee2Title), LocaleController.getString(R.string.SMSFee2Text), R.drawable.menu_feature_code);
            addView(featureCellArr[1], LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 6));
            ExplainStarsSheet.FeatureCell featureCell3 = new ExplainStarsSheet.FeatureCell(context, 1, ((BaseFragment) LoginActivity.this).resourceProvider);
            featureCell3.set(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SMSFee3Title), new LoginActivity$LoginPayView$$ExternalSyntheticLambda4(this, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)), LocaleController.getString(R.string.SMSFee3Text), R.drawable.menu_feature_hands);
            addView(featureCellArr[2], LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 6));
            addView(new Space(context), LayoutHelper.createLinear(0, 0, 1.0f, 119));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null, true);
            buttonWithCounterView.setRoundRadius(24);
            this.button = buttonWithCounterView;
            buttonWithCounterView.setLoading(true);
            addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 7, 0, 16, 0, 16));
        }

        @Override
        public final void onHide() {
            if (this.pollingRequestId >= 0) {
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).cancelRequest(this.pollingRequestId, true);
                this.pollingRequestId = -1;
            }
            this.polling = false;
            this.button.setLoading(false);
        }

        public final void poll$1() {
            if (this.polling) {
                TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
                tL_checkPaidAuth.form_id = this.pollingFormId;
                tL_checkPaidAuth.phone_number = this.pollingPhoneNumber;
                tL_checkPaidAuth.phone_code_hash = this.pollingPhoneCodeHash;
                this.pollingRequestId = ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_checkPaidAuth, new LinkManager$$ExternalSyntheticLambda3(this, 16), 1096);
            }
        }

        @Override
        public final void setParams(Bundle bundle, boolean z) {
            long j;
            int i;
            this.params = bundle;
            String countryName = LocaleController.getCountryName(bundle == null ? null : bundle.getString("country"));
            String string = bundle == null ? null : bundle.getString("product");
            String string2 = bundle == null ? null : bundle.getString("phoneFormated");
            String string3 = bundle == null ? null : bundle.getString("phoneHash");
            String string4 = bundle == null ? null : bundle.getString("support_email_email");
            String string5 = bundle == null ? null : bundle.getString("support_email_subject");
            String string6 = bundle == null ? null : bundle.getString("currency");
            long j2 = bundle == null ? 0L : bundle.getLong("amount");
            if (bundle == null) {
                i = 0;
                j = 0;
            } else {
                j = 0;
                i = bundle.getInt("premium_days");
            }
            boolean zIsEmpty = TextUtils.isEmpty(countryName);
            ExplainStarsSheet.FeatureCell[] featureCellArr = this.cells;
            if (zIsEmpty) {
                featureCellArr[0].subtitleView.setText(LocaleController.getString(R.string.SMSFee1Text));
            } else {
                featureCellArr[0].subtitleView.setText(LocaleController.formatString(R.string.SMSFee1TextCountry, countryName));
            }
            featureCellArr[2].setSubtitle(i == 7 ? LocaleController.getString(R.string.SMSFee3Text) : LocaleController.formatPluralStringComma("SMSFee3TextDays", i));
            this.optionsButton.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(this, string4, string5, string2));
            ButtonWithCounterView buttonWithCounterView = this.button;
            buttonWithCounterView.setEnabled(true);
            buttonWithCounterView.setOnClickListener(null);
            if (BuildVars.useInvoiceBilling()) {
                if (TextUtils.isEmpty(string6) || j2 <= j) {
                    buttonWithCounterView.setVisibility(0);
                    buttonWithCounterView.setLoading(false);
                    buttonWithCounterView.setEnabled(false);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.Unavailable), false, true);
                    return;
                }
                buttonWithCounterView.setVisibility(0);
                buttonWithCounterView.setLoading(false);
                buttonWithCounterView.setText(LocaleController.formatString(R.string.SMSFeePurchaseTitle, BillingController.getInstance().formatCurrency(j2, string6)), false, true);
                buttonWithCounterView.setSubText(i == 7 ? LocaleController.getString(R.string.SMSFeePurchaseText) : LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i), false);
                buttonWithCounterView.setOnClickListener(new BotShareSheet$$ExternalSyntheticLambda10(this, string6, j2, string3, string2, i));
                return;
            }
            String str = string2;
            String str2 = string3;
            int i2 = i;
            if (TextUtils.isEmpty(string)) {
                buttonWithCounterView.setVisibility(8);
                return;
            }
            buttonWithCounterView.setVisibility(0);
            buttonWithCounterView.setLoading(true);
            WearAuthSheet$$ExternalSyntheticLambda3 wearAuthSheet$$ExternalSyntheticLambda3 = new WearAuthSheet$$ExternalSyntheticLambda3(this, string, str2, str, i2, 25);
            if (BillingController.getInstance().isReady()) {
                wearAuthSheet$$ExternalSyntheticLambda3.run();
            } else {
                BillingController.getInstance().whenSetuped(wearAuthSheet$$ExternalSyntheticLambda3);
            }
        }
    }

    public final class PhoneNumberConfirmView extends FrameLayout {
        public static final int $r8$clinit = 0;
        public final View blurredView;
        public final PhoneView.AnonymousClass6 callback;
        public final TextView confirmMessageView;
        public final TextView confirmTextView;
        public final View dimmView;
        public boolean dismissed;
        public final TextView editTextView;
        public final FragmentFloatingButton fabButton;
        public final View fabContainer;
        public final TransformableLoginButtonView fabTransform;
        public final ViewGroup fragmentView;
        public final TextView numberView;
        public final PointF pointF;
        public final FrameLayout popupLayout;

        public final class AnonymousClass1 extends AnimatorListenerAdapter {
            public final int $r8$classId;
            public final PhoneNumberConfirmView this$0;

            public AnonymousClass1(PhoneNumberConfirmView phoneNumberConfirmView, int i) {
                this.$r8$classId = i;
                this.this$0 = phoneNumberConfirmView;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                            this.this$0.fabButton.requestFocus();
                        }
                        break;
                    default:
                        PhoneNumberConfirmView phoneNumberConfirmView = this.this$0;
                        if (phoneNumberConfirmView.getParent() instanceof ViewGroup) {
                            ((ViewGroup) phoneNumberConfirmView.getParent()).removeView(phoneNumberConfirmView);
                        }
                        phoneNumberConfirmView.fabContainer.setVisibility(0);
                        break;
                }
            }

            @Override
            public void onAnimationStart(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        PhoneNumberConfirmView phoneNumberConfirmView = this.this$0;
                        phoneNumberConfirmView.fabContainer.setVisibility(8);
                        int measuredWidth = (int) (phoneNumberConfirmView.fragmentView.getMeasuredWidth() / 10.0f);
                        int measuredHeight = (int) (phoneNumberConfirmView.fragmentView.getMeasuredHeight() / 10.0f);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        canvas.scale(0.1f, 0.1f);
                        canvas.drawColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                        phoneNumberConfirmView.fragmentView.draw(canvas);
                        Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                        phoneNumberConfirmView.blurredView.setBackground(new BitmapDrawable(phoneNumberConfirmView.getContext().getResources(), bitmapCreateBitmap));
                        phoneNumberConfirmView.blurredView.setAlpha(0.0f);
                        phoneNumberConfirmView.blurredView.setVisibility(0);
                        phoneNumberConfirmView.fragmentView.addView(phoneNumberConfirmView);
                        break;
                    default:
                        super.onAnimationStart(animator);
                        break;
                }
            }
        }

        public PhoneNumberConfirmView(Context context, ViewGroup viewGroup, View view, String str, final PhoneView.AnonymousClass6 anonymousClass6) {
            super(context);
            PointF pointF = new PointF();
            this.pointF = pointF;
            this.fragmentView = viewGroup;
            this.fabContainer = view;
            this.callback = anonymousClass6;
            View view2 = new View(getContext());
            this.blurredView = view2;
            view2.setOnClickListener(new LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda2(this));
            addView(view2, LayoutHelper.createFrame(-1.0f, -1));
            View view3 = new View(getContext());
            this.dimmView = view3;
            view3.setBackgroundColor(1073741824);
            view3.setAlpha(0.0f);
            addView(view3, LayoutHelper.createFrame(-1.0f, -1));
            TransformableLoginButtonView transformableLoginButtonView = new TransformableLoginButtonView(getContext());
            this.fabTransform = transformableLoginButtonView;
            transformableLoginButtonView.setTransformType(1);
            transformableLoginButtonView.setDrawBackground(false);
            FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, null, false);
            this.fabButton = fragmentFloatingButton;
            fragmentFloatingButton.addView(transformableLoginButtonView, LayoutHelper.createFrame(56, 56, 17));
            fragmentFloatingButton.addAdditionalView(transformableLoginButtonView);
            final int i = 0;
            fragmentFloatingButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view4) {
                    switch (i) {
                        case 0:
                            LoginActivity.PhoneNumberConfirmView phoneNumberConfirmView = this;
                            phoneNumberConfirmView.getClass();
                            anonymousClass6.onConfirm(phoneNumberConfirmView);
                            break;
                        default:
                            LoginActivity.PhoneNumberConfirmView phoneNumberConfirmView2 = this;
                            phoneNumberConfirmView2.getClass();
                            anonymousClass6.onConfirm(phoneNumberConfirmView2);
                            break;
                    }
                }
            });
            fragmentFloatingButton.setContentDescription(LocaleController.getString(R.string.Done));
            addView(fragmentFloatingButton, LayoutHelper.createFrame(56, 56, 51));
            FrameLayout frameLayout = new FrameLayout(context);
            this.popupLayout = frameLayout;
            addView(frameLayout, LayoutHelper.createFrame(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
            TextView textView = new TextView(context);
            this.confirmMessageView = textView;
            textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 20.0f, 24.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.numberView = textView2;
            textView2.setText(str);
            textView2.setTextSize(1, 18.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setSingleLine();
            frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 48.0f, 24.0f, 0.0f));
            int iDp = AndroidUtilities.dp(16.0f);
            TextView textView3 = new TextView(context);
            this.editTextView = textView3;
            textView3.setText(LocaleController.getString(R.string.Edit));
            textView3.setSingleLine();
            textView3.setTextSize(1, 16.0f);
            int iDp2 = AndroidUtilities.dp(6.0f);
            int i2 = Theme.key_changephoneinfo_image2;
            textView3.setBackground(Theme.getRoundRectSelectorDrawable(iDp2, Theme.getColor(null, i2, false)));
            textView3.setOnClickListener(new LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda2(this, anonymousClass6));
            Typeface typeface = Typeface.DEFAULT_BOLD;
            textView3.setTypeface(typeface);
            int i3 = iDp / 2;
            textView3.setPadding(iDp, i3, iDp, i3);
            float f = 8;
            frameLayout.addView(textView3, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f, f, f, f));
            TextView textView4 = new TextView(context);
            this.confirmTextView = textView4;
            textView4.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
            textView4.setSingleLine();
            textView4.setTextSize(1, 16.0f);
            textView4.setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(null, i2, false)));
            final int i4 = 1;
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view4) {
                    switch (i4) {
                        case 0:
                            LoginActivity.PhoneNumberConfirmView phoneNumberConfirmView = this;
                            phoneNumberConfirmView.getClass();
                            anonymousClass6.onConfirm(phoneNumberConfirmView);
                            break;
                        default:
                            LoginActivity.PhoneNumberConfirmView phoneNumberConfirmView2 = this;
                            phoneNumberConfirmView2.getClass();
                            anonymousClass6.onConfirm(phoneNumberConfirmView2);
                            break;
                    }
                }
            });
            textView4.setTypeface(typeface);
            textView4.setPadding(iDp, i3, iDp, i3);
            frameLayout.addView(textView4, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 80, f, f, f, f));
            ViewPositionWatcher.computeCoordinatesInParent(view, viewGroup, pointF);
            fragmentFloatingButton.setTranslationX(pointF.x);
            fragmentFloatingButton.setTranslationY(pointF.y);
            requestLayout();
            updateColors();
        }

        public final void dismiss() {
            int i = 1;
            if (this.dismissed) {
                return;
            }
            this.dismissed = true;
            LoginActivity.this.phoneNumberConfirmView = null;
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
            duration.addListener(new AnonymousClass1(this, i));
            duration.addUpdateListener(new LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda0(this, i));
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.start();
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            FrameLayout frameLayout = this.popupLayout;
            int measuredHeight = frameLayout.getMeasuredHeight();
            int translationY = (int) (this.fabButton.getTranslationY() - AndroidUtilities.dp(32.0f));
            frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
        }

        public final void updateColors() {
            int color = Theme.getColor(null, Theme.key_chats_actionIcon, false);
            TransformableLoginButtonView transformableLoginButtonView = this.fabTransform;
            transformableLoginButtonView.setColor(color);
            transformableLoginButtonView.setBackgroundColor(Theme.getColor(null, Theme.key_chats_actionBackground, false));
            this.popupLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), Theme.getColor(null, Theme.key_dialogBackground, false)));
            this.confirmMessageView.setTextColor(Theme.getColor(null, Theme.key_dialogTextGray2, false));
            this.numberView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
            int i = Theme.key_changephoneinfo_image2;
            this.editTextView.setTextColor(Theme.getColor(null, i, false));
            this.confirmTextView.setTextColor(Theme.getColor(null, i, false));
            this.fabButton.updateColors$1();
        }
    }

    public final class PhoneView extends SlideView implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
        public Runnable cancelRequestingPasskey;
        public final ImageView chevronRight;
        public final View codeDividerView;
        public final NewContactBottomSheet.AnonymousClass3 codeField;
        public final HashMap codesMap;
        public boolean confirmedNumber;
        public final ArrayList countriesArray;
        public final TextViewSwitcher countryButton;
        public String countryCodeForHint;
        public final OutlineTextContainerView countryOutlineView;
        public int countryState;
        public CountrySelectActivity.Country currentCountry;
        public boolean ignoreOnPhoneChange;
        public boolean ignoreOnTextChange;
        public boolean ignoreSelection;
        public long lastTitleClick;
        public Toast lastTitleToast;
        public boolean nextPressed;
        public boolean numberFilled;
        public final AnonymousClass3 phoneField;
        public final HashMap phoneFormatMap;
        public final OutlineTextContainerView phoneOutlineView;
        public final TextView plusTextView;
        public boolean requestedPasskey;
        public boolean requestingPasskey;
        public final LinkSpanDrawable.LinksTextView subtitleView;
        public final CheckBoxCell syncContactsBox;
        public final CheckBoxCell testBackendCheckBox;
        public int titleClickCount;
        public final TextView titleView;
        public int wasCountryHintIndex;

        public final class AnonymousClass6 {
            public AnonymousClass6() {
            }

            public final void onConfirm(PhoneNumberConfirmView phoneNumberConfirmView) {
                int i;
                PhoneView phoneView = PhoneView.this;
                phoneView.confirmedNumber = true;
                LoginActivity loginActivity = LoginActivity.this;
                loginActivity.currentDoneType = 0;
                loginActivity.needShowProgress(0, false);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23 && AndroidUtilities.isSimAvailable()) {
                    boolean z = loginActivity.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                    boolean z2 = loginActivity.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
                    boolean z3 = i2 < 28 || loginActivity.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
                    boolean z4 = i2 < 26 || loginActivity.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
                    NewContactBottomSheet.AnonymousClass3 anonymousClass3 = phoneView.codeField;
                    if (anonymousClass3 != null && "888".equals(anonymousClass3.getText())) {
                        z = true;
                        z2 = true;
                        z3 = true;
                        z4 = true;
                    }
                    if (loginActivity.checkPermissions) {
                        loginActivity.permissionsItems.clear();
                        if (!z) {
                            loginActivity.permissionsItems.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z2) {
                            loginActivity.permissionsItems.add("android.permission.CALL_PHONE");
                        }
                        if (!z3) {
                            loginActivity.permissionsItems.add("android.permission.READ_CALL_LOG");
                        }
                        if (!z4 && i2 >= 26) {
                            loginActivity.permissionsItems.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!loginActivity.permissionsItems.isEmpty()) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            if (!globalMainSettings.getBoolean("firstlogin", true) && !loginActivity.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !loginActivity.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                                try {
                                    loginActivity.getParentActivity().requestPermissions((String[]) loginActivity.permissionsItems.toArray(new String[0]), 6);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                            AlertDialog.Builder builder = new AlertDialog.Builder(loginActivity.getParentActivity(), 0, null);
                            builder.setPositiveButton(LocaleController.getString("Continue", R.string.Continue), null);
                            AlertDialog alertDialog = builder.alertDialog;
                            if (!z && (!z2 || !z3)) {
                                alertDialog.message = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                                i = R.raw.calls_log;
                            } else if (z2 && z3) {
                                alertDialog.message = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                                i = R.raw.incoming_calls;
                            } else {
                                alertDialog.message = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                                i = R.raw.calls_log;
                            }
                            builder.setTopAnimation(i, 46, Theme.getColor(null, Theme.key_dialogTopBackground, false), null);
                            loginActivity.permissionsDialog = loginActivity.showDialog(alertDialog);
                            phoneView.confirmedNumber = true;
                            return;
                        }
                    }
                }
                LoginActivity$PhoneView$6$$ExternalSyntheticLambda0 loginActivity$PhoneView$6$$ExternalSyntheticLambda0 = new LoginActivity$PhoneView$6$$ExternalSyntheticLambda0(0, phoneNumberConfirmView, this);
                phoneNumberConfirmView.fabButton.animatorProgressVisible.setValue(true, true);
                AndroidUtilities.runOnUIThread(loginActivity$PhoneView$6$$ExternalSyntheticLambda0, 400L);
            }
        }

        public PhoneView(Context context) {
            int i;
            super(context);
            this.countryState = 0;
            this.countriesArray = new ArrayList();
            this.codesMap = new HashMap();
            this.phoneFormatMap = new HashMap();
            this.ignoreSelection = false;
            this.ignoreOnTextChange = false;
            this.ignoreOnPhoneChange = false;
            this.nextPressed = false;
            this.confirmedNumber = false;
            this.titleClickCount = 0;
            this.lastTitleClick = 0L;
            this.wasCountryHintIndex = -1;
            this.requestedPasskey = false;
            this.requestingPasskey = false;
            setOrientation(1);
            setGravity(17);
            TextView textView = new TextView(context);
            this.titleView = textView;
            zzkk.m(18.0f, 1, textView);
            textView.setText(LocaleController.getString(LoginActivity.this.activityMode == 2 ? R.string.ChangePhoneNewNumber : R.string.YourNumber));
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
            textView.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(27, this, context));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
            this.subtitleView = linksTextView;
            linksTextView.setText(LocaleController.getString(LoginActivity.this.activityMode == 2 ? R.string.ChangePhoneHelp : R.string.StartText));
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setGravity(17);
            linksTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(linksTextView, LayoutHelper.createLinear(-1, -2, 1, 32, 8, 32, 0));
            TextViewSwitcher textViewSwitcher = new TextViewSwitcher(context);
            this.countryButton = textViewSwitcher;
            textViewSwitcher.setFactory(new PhotoViewer$$ExternalSyntheticLambda18(context, 2));
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
            animationLoadAnimation.setInterpolator(Easings.easeInOutQuad);
            textViewSwitcher.setInAnimation(animationLoadAnimation);
            ImageView imageView = new ImageView(context);
            this.chevronRight = imageView;
            imageView.setImageResource(R.drawable.msg_inputarrow);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            linearLayout.addView(textViewSwitcher, LayoutHelper.createLinear(1.0f, 0, -2, 0, 0, 0));
            linearLayout.addView(imageView, LayoutHelper.createLinearRelatively(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context, null);
            this.countryOutlineView = outlineTextContainerView;
            int i2 = R.string.Country;
            outlineTextContainerView.setText(LocaleController.getString(i2));
            outlineTextContainerView.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            outlineTextContainerView.setForceUseCenter(true);
            outlineTextContainerView.setFocusable(true);
            outlineTextContainerView.setContentDescription(LocaleController.getString(i2));
            outlineTextContainerView.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, 13));
            addView(outlineTextContainerView, LayoutHelper.createLinear(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
            final int i3 = 0;
            outlineTextContainerView.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.PhoneView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            LoginActivity.PhoneView phoneView = this.f$0;
                            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(phoneView.countriesArray, true);
                            countrySelectActivity.delegate = new PhotoViewer$$ExternalSyntheticLambda115(phoneView, 7);
                            LoginActivity.this.presentFragment(countrySelectActivity);
                            break;
                        default:
                            LoginActivity loginActivity = LoginActivity.this;
                            if (loginActivity.getParentActivity() != null) {
                                boolean z = !loginActivity.syncContacts;
                                loginActivity.syncContacts = z;
                                ((CheckBoxCell) view).setChecked(z, true);
                                if (!loginActivity.syncContacts) {
                                    new BulletinFactory(loginActivity.slideViewsContainer, null).createSimpleBulletinWithIconSize(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).show();
                                } else {
                                    new BulletinFactory(loginActivity.slideViewsContainer, null).createSimpleBulletinWithIconSize(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).show();
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context, null);
            this.phoneOutlineView = outlineTextContainerView2;
            outlineTextContainerView2.addView(linearLayout2, LayoutHelper.createFrame(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
            int i4 = R.string.PhoneNumber;
            outlineTextContainerView2.setText(LocaleController.getString(i4));
            addView(outlineTextContainerView2, LayoutHelper.createLinear(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
            TextView textView2 = new TextView(context);
            this.plusTextView = textView2;
            textView2.setText("+");
            textView2.setTextSize(1, 16.0f);
            textView2.setFocusable(false);
            linearLayout2.addView(textView2, LayoutHelper.createLinear(-2, -2));
            NewContactBottomSheet.AnonymousClass3 anonymousClass3 = new NewContactBottomSheet.AnonymousClass3(this, context, 2);
            this.codeField = anonymousClass3;
            anonymousClass3.setInputType(3);
            anonymousClass3.setCursorSize(AndroidUtilities.dp(20.0f));
            anonymousClass3.setCursorWidth(1.5f);
            anonymousClass3.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
            anonymousClass3.setTextSize(1, 16.0f);
            anonymousClass3.setMaxLines(1);
            anonymousClass3.setGravity(19);
            anonymousClass3.setImeOptions(268435461);
            anonymousClass3.setBackground(null);
            anonymousClass3.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
            anonymousClass3.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
            linearLayout2.addView(anonymousClass3, LayoutHelper.createLinear(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
            anonymousClass3.addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 26));
            final int i5 = 0;
            anonymousClass3.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                public final LoginActivity.PhoneView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final boolean onEditorAction(TextView textView3, int i6, KeyEvent keyEvent) {
                    switch (i5) {
                        case 0:
                            LoginActivity.PhoneView phoneView = this.f$0;
                            if (i6 != 5) {
                                phoneView.getClass();
                                return false;
                            }
                            LoginActivity.PhoneView.AnonymousClass3 anonymousClass4 = phoneView.phoneField;
                            anonymousClass4.requestFocus();
                            anonymousClass4.setSelection(anonymousClass4.length());
                            return true;
                        default:
                            LoginActivity.PhoneView phoneView2 = this.f$0;
                            if (i6 != 5) {
                                phoneView2.getClass();
                                return false;
                            }
                            LoginActivity.PhoneNumberConfirmView phoneNumberConfirmView = LoginActivity.this.phoneNumberConfirmView;
                            if (phoneNumberConfirmView != null) {
                                phoneNumberConfirmView.fabButton.callOnClick();
                                return true;
                            }
                            phoneView2.onNextPressed(null);
                            return true;
                    }
                }
            });
            View view = new View(context);
            this.codeDividerView = view;
            LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
            layoutParamsCreateLinear.width = Math.max(2, AndroidUtilities.dp(0.5f));
            linearLayout2.addView(view, layoutParamsCreateLinear);
            ?? r4 = new AnimatedPhoneNumberEditText(context) {
                @Override
                public final void onFocusChanged(boolean z, int i6, Rect rect) {
                    super.onFocusChanged(z, i6, rect);
                    PhoneView phoneView = PhoneView.this;
                    OutlineTextContainerView outlineTextContainerView3 = phoneView.phoneOutlineView;
                    float f = (z || phoneView.codeField.isFocused()) ? 1.0f : 0.0f;
                    outlineTextContainerView3.animateSelection(f, f, true);
                    if (!z) {
                        if (phoneView.countryState == 2) {
                            phoneView.setCountryButtonText(null);
                        }
                    } else {
                        LoginActivity loginActivity = LoginActivity.this;
                        loginActivity.keyboardView.setEditText(this);
                        loginActivity.keyboardView.setDispatchBackWhenEmpty(true);
                        if (phoneView.countryState == 2) {
                            phoneView.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
                        }
                    }
                }

                @Override
                public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
                    if (i6 == 67) {
                        PhoneView phoneView = PhoneView.this;
                        if (phoneView.phoneField.length() == 0) {
                            phoneView.codeField.requestFocus();
                            NewContactBottomSheet.AnonymousClass3 anonymousClass4 = phoneView.codeField;
                            anonymousClass4.setSelection(anonymousClass4.length());
                            phoneView.codeField.dispatchKeyEvent(keyEvent);
                        }
                    }
                    return super.onKeyDown(i6, keyEvent);
                }

                @Override
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        LoginActivity loginActivity = LoginActivity.this;
                        int i6 = LoginActivity.SHOW_DELAY;
                        if (!(!loginActivity.isCustomKeyboardVisible() ? AndroidUtilities.showKeyboard(this) : true)) {
                            clearFocus();
                            requestFocus();
                        }
                    }
                    return super.onTouchEvent(motionEvent);
                }
            };
            this.phoneField = r4;
            r4.setInputType(3);
            r4.setPadding(0, 0, 0, 0);
            r4.setCursorSize(AndroidUtilities.dp(20.0f));
            r4.setCursorWidth(1.5f);
            r4.setTextSize(1, 16.0f);
            r4.setMaxLines(1);
            r4.setGravity(19);
            r4.setImeOptions(268435461);
            r4.setBackground(null);
            r4.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
            r4.setContentDescription(LocaleController.getString(i4));
            linearLayout2.addView((View) r4, LayoutHelper.createFrame(36.0f, -1));
            r4.addTextChangedListener(new PassportActivity.AnonymousClass10(this, 2));
            final int i6 = 1;
            r4.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                public final LoginActivity.PhoneView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final boolean onEditorAction(TextView textView3, int i7, KeyEvent keyEvent) {
                    switch (i6) {
                        case 0:
                            LoginActivity.PhoneView phoneView = this.f$0;
                            if (i7 != 5) {
                                phoneView.getClass();
                                return false;
                            }
                            LoginActivity.PhoneView.AnonymousClass3 anonymousClass4 = phoneView.phoneField;
                            anonymousClass4.requestFocus();
                            anonymousClass4.setSelection(anonymousClass4.length());
                            return true;
                        default:
                            LoginActivity.PhoneView phoneView2 = this.f$0;
                            if (i7 != 5) {
                                phoneView2.getClass();
                                return false;
                            }
                            LoginActivity.PhoneNumberConfirmView phoneNumberConfirmView = LoginActivity.this.phoneNumberConfirmView;
                            if (phoneNumberConfirmView != null) {
                                phoneNumberConfirmView.fabButton.callOnClick();
                                return true;
                            }
                            phoneView2.onNextPressed(null);
                            return true;
                    }
                }
            });
            if (LoginActivity.this.newAccount && LoginActivity.this.activityMode == 0) {
                CheckBoxCell checkBoxCell = new CheckBoxCell(context, 2);
                this.syncContactsBox = checkBoxCell;
                checkBoxCell.setText(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", LoginActivity.this.syncContacts, false, false);
                addView(checkBoxCell, LayoutHelper.createLinear(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
                final int i7 = 1;
                checkBoxCell.setOnClickListener(new View.OnClickListener(this) {
                    public final LoginActivity.PhoneView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i7) {
                            case 0:
                                LoginActivity.PhoneView phoneView = this.f$0;
                                CountrySelectActivity countrySelectActivity = new CountrySelectActivity(phoneView.countriesArray, true);
                                countrySelectActivity.delegate = new PhotoViewer$$ExternalSyntheticLambda115(phoneView, 7);
                                LoginActivity.this.presentFragment(countrySelectActivity);
                                break;
                            default:
                                LoginActivity loginActivity = LoginActivity.this;
                                if (loginActivity.getParentActivity() != null) {
                                    boolean z = !loginActivity.syncContacts;
                                    loginActivity.syncContacts = z;
                                    ((CheckBoxCell) view2).setChecked(z, true);
                                    if (!loginActivity.syncContacts) {
                                        new BulletinFactory(loginActivity.slideViewsContainer, null).createSimpleBulletinWithIconSize(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).show();
                                    } else {
                                        new BulletinFactory(loginActivity.slideViewsContainer, null).createSimpleBulletinWithIconSize(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).show();
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                i = 48;
            } else {
                i = 72;
            }
            boolean z = BuildVars.DEBUG_VERSION || LoginActivity.this.getConnectionsManager().isTestBackend();
            if (z && LoginActivity.this.activityMode == 0) {
                CheckBoxCell checkBoxCell2 = new CheckBoxCell(context, 2);
                this.testBackendCheckBox = checkBoxCell2;
                String string = LocaleController.getString(R.string.DebugTestBackend);
                boolean zIsTestBackend = LoginActivity.this.getConnectionsManager().isTestBackend();
                LoginActivity.this.testBackend = zIsTestBackend;
                checkBoxCell2.setText(string, "", zIsTestBackend, false, false);
                addView(checkBoxCell2, LayoutHelper.createLinear(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
                i -= 24;
                checkBoxCell2.setOnClickListener(new LinkEditActivity$$ExternalSyntheticLambda5(5, this, z));
            }
            if (i > 0 && !AndroidUtilities.isSmallScreen()) {
                View space = new Space(context);
                space.setMinimumHeight(AndroidUtilities.dp(i));
                addView(space, LayoutHelper.createLinear(-2, -2));
            }
            HashMap map = new HashMap();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getResources().getAssets().open("countries.txt")));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    String[] strArrSplit = line.split(";");
                    CountrySelectActivity.Country country = new CountrySelectActivity.Country();
                    country.name = strArrSplit[2];
                    String str = strArrSplit[0];
                    country.code = str;
                    country.shortname = strArrSplit[1];
                    if (!TextUtils.equals(str, "FT")) {
                        String countryName = LocaleController.getCountryName(country.shortname);
                        if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(country.shortname, countryName)) {
                            country.defaultName = country.name;
                            country.name = countryName;
                        }
                    }
                    this.countriesArray.add(0, country);
                    List list = (List) this.codesMap.get(strArrSplit[0]);
                    if (list == null) {
                        HashMap map2 = this.codesMap;
                        String str2 = strArrSplit[0];
                        ArrayList arrayList = new ArrayList();
                        map2.put(str2, arrayList);
                        list = arrayList;
                    }
                    list.add(country);
                    if (strArrSplit.length > 3) {
                        this.phoneFormatMap.put(strArrSplit[0], Collections.singletonList(strArrSplit[3]));
                    }
                    map.put(strArrSplit[1], strArrSplit[2]);
                }
                bufferedReader.close();
            } catch (Exception e) {
                FileLog.e(e);
            }
            Collections.sort(this.countriesArray, Comparator$CC.comparing(new GroupCallSheet$$ExternalSyntheticLambda3(6)));
            try {
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            LoginActivity.this.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new LinkManager$$ExternalSyntheticLambda8(29, this, map), 10);
            if (this.codeField.length() == 0) {
                setCountryButtonText(null);
                setHintText((String) null);
                this.countryState = 1;
            }
            if (this.codeField.length() != 0) {
                requestFocus();
                AnonymousClass3 anonymousClass4 = this.phoneField;
                anonymousClass4.setSelection(anonymousClass4.length());
            } else {
                this.codeField.requestFocus();
            }
            loadCountries();
        }

        public void setCountryButtonText(CharSequence charSequence) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(ApplicationLoader.applicationContext, (this.countryButton.getCurrentView().getText() == null || charSequence != null) ? R.anim.text_out : R.anim.text_out_down);
            animationLoadAnimation.setInterpolator(Easings.easeInOutQuad);
            this.countryButton.setOutAnimation(animationLoadAnimation);
            CharSequence text = this.countryButton.getCurrentView().getText();
            this.countryButton.setText(charSequence, ((TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(text)) || Objects.equals(text, charSequence)) ? false : true, false);
            OutlineTextContainerView outlineTextContainerView = this.countryOutlineView;
            float f = charSequence != null ? 1.0f : 0.0f;
            outlineTextContainerView.animateSelection(f, f, true);
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.emojiLoaded) {
                this.countryButton.getCurrentView().invalidate();
            }
        }

        public final void fillNumber() {
            boolean z;
            boolean z2;
            boolean z3;
            CountrySelectActivity.Country country;
            if (this.numberFilled || LoginActivity.this.activityMode != 0) {
                return;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                if (AndroidUtilities.isSimAvailable()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23) {
                        z = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                        z2 = i < 26 || LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
                        LoginActivity loginActivity = LoginActivity.this;
                        if (loginActivity.checkShowPermissions && (!z || !z2)) {
                            loginActivity.permissionsShowItems.clear();
                            if (!z) {
                                LoginActivity.this.permissionsShowItems.add("android.permission.READ_PHONE_STATE");
                            }
                            if (!z2 && i >= 26) {
                                LoginActivity.this.permissionsShowItems.add("android.permission.READ_PHONE_NUMBERS");
                            }
                            if (LoginActivity.this.permissionsShowItems.isEmpty()) {
                                return;
                            }
                            new LinkManager$$ExternalSyntheticLambda2(17, this, new ArrayList(LoginActivity.this.permissionsShowItems)).run();
                            return;
                        }
                    } else {
                        z = true;
                        z2 = true;
                    }
                    this.numberFilled = true;
                    if (!LoginActivity.this.newAccount && z && z2) {
                        this.codeField.setAlpha(0.0f);
                        setAlpha(0.0f);
                        String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(telephonyManager.getLine1Number(), false);
                        if (!TextUtils.isEmpty(strStripExceptNumbers)) {
                            int i2 = 4;
                            String strSubstring = null;
                            if (strStripExceptNumbers.length() > 4) {
                                while (true) {
                                    if (i2 < 1) {
                                        z3 = false;
                                        break;
                                    }
                                    String strSubstring2 = strStripExceptNumbers.substring(0, i2);
                                    List list = (List) this.codesMap.get(strSubstring2);
                                    if (list == null) {
                                        country = null;
                                    } else if (list.size() > 1) {
                                        String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + strSubstring2, null);
                                        country = (CountrySelectActivity.Country) list.get(list.size() - 1);
                                        if (string != null) {
                                            ArrayList arrayList = this.countriesArray;
                                            int size = arrayList.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj = arrayList.get(i3);
                                                i3++;
                                                CountrySelectActivity.Country country2 = (CountrySelectActivity.Country) obj;
                                                if (Objects.equals(country2.shortname, string)) {
                                                    country = country2;
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        country = (CountrySelectActivity.Country) list.get(0);
                                    }
                                    if (country != null) {
                                        strSubstring = strStripExceptNumbers.substring(i2);
                                        this.codeField.setText(strSubstring2);
                                        z3 = true;
                                        break;
                                    }
                                    i2--;
                                }
                                if (!z3) {
                                    strSubstring = strStripExceptNumbers.substring(1);
                                    this.codeField.setText(strStripExceptNumbers.substring(0, 1));
                                }
                            }
                            if (strSubstring != null) {
                                requestFocus();
                                setText(strSubstring);
                                AnonymousClass3 anonymousClass3 = this.phoneField;
                                anonymousClass3.setSelection(anonymousClass3.length());
                            }
                        }
                        if (length() <= 0) {
                            this.codeField.setAlpha(1.0f);
                            setAlpha(1.0f);
                            return;
                        }
                        AnimatorSet duration = new AnimatorSet().setDuration(300L);
                        NewContactBottomSheet.AnonymousClass3 anonymousClass4 = this.codeField;
                        Property property = View.ALPHA;
                        duration.playTogether(ObjectAnimator.ofFloat(anonymousClass4, (Property<NewContactBottomSheet.AnonymousClass3, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.phoneField, (Property<AnonymousClass3, Float>) property, 1.0f));
                        duration.start();
                        this.confirmedNumber = true;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("YourPhone", R.string.YourPhone);
        }

        @Override
        public final boolean hasCustomKeyboard() {
            return true;
        }

        public final void invalidateCountryHint() {
            int i;
            String str = this.countryCodeForHint;
            AnonymousClass3 anonymousClass3 = this.phoneField;
            String strReplace = anonymousClass3.getText() != null ? anonymousClass3.getText().toString().replace(" ", "") : "";
            HashMap map = this.phoneFormatMap;
            if (map.get(str) == null || ((List) map.get(str)).isEmpty()) {
                if (this.wasCountryHintIndex != -1) {
                    int selectionStart = anonymousClass3.getSelectionStart();
                    int selectionEnd = anonymousClass3.getSelectionEnd();
                    anonymousClass3.setHintText((String) null);
                    anonymousClass3.setSelection(selectionStart, selectionEnd);
                    this.wasCountryHintIndex = -1;
                    return;
                }
                return;
            }
            List list = (List) map.get(str);
            if (strReplace.isEmpty()) {
                i = -1;
                break;
            }
            i = 0;
            while (true) {
                if (i >= list.size()) {
                    i = -1;
                    break;
                } else if (strReplace.startsWith(((String) list.get(i)).replace(" ", "").replace("X", "").replace("0", ""))) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    String str2 = (String) list.get(i2);
                    if (str2.startsWith("X") || str2.startsWith("0")) {
                        i = i2;
                        break;
                    }
                }
                if (i == -1) {
                    i = 0;
                }
            }
            if (this.wasCountryHintIndex != i) {
                String str3 = (String) ((List) map.get(str)).get(i);
                int selectionStart2 = anonymousClass3.getSelectionStart();
                int selectionEnd2 = anonymousClass3.getSelectionEnd();
                anonymousClass3.setHintText(str3 != null ? str3.replace('X', '0') : null);
                anonymousClass3.setSelection(Math.max(0, Math.min(anonymousClass3.length(), selectionStart2)), Math.max(0, Math.min(anonymousClass3.length(), selectionEnd2)));
                this.wasCountryHintIndex = i;
            }
        }

        public final void loadCountries() {
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
            LoginActivity.this.getConnectionsManager().sendRequest(tL_help_getCountriesList, new LoginActivity$PhoneView$$ExternalSyntheticLambda26(this, 0), 10);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
        public final void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public final void onDestroyActivity() {
            Runnable runnable = this.cancelRequestingPasskey;
            if (runnable != null) {
                runnable.run();
                this.cancelRequestingPasskey = null;
            }
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
        public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (this.ignoreSelection) {
                this.ignoreSelection = false;
                return;
            }
            this.ignoreOnTextChange = true;
            this.codeField.setText(((CountrySelectActivity.Country) this.countriesArray.get(i)).code);
            this.ignoreOnTextChange = false;
        }

        @Override
        public final void onNextPressed(String str) {
            boolean z;
            boolean z2;
            boolean z3;
            TLObject tLObject;
            int i;
            int i2 = 4;
            int i3 = 0;
            int i4 = 1;
            if (LoginActivity.this.getParentActivity() == null || this.nextPressed || LoginActivity.this.isRequestingFirebaseSms) {
                return;
            }
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("sim status = " + telephonyManager.getSimState());
            }
            if (this.codeField.length() == 0 || length() == 0) {
                LoginActivity.onFieldError(this.phoneOutlineView, false);
                return;
            }
            String str2 = "+" + ((Object) this.codeField.getText()) + " " + ((Object) getText());
            if (!this.confirmedNumber) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y && !LoginActivity.this.isCustomKeyboardVisible() && LoginActivity.this.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                    LoginActivity loginActivity = LoginActivity.this;
                    loginActivity.keyboardHideCallback = new LoginActivity$PhoneView$$ExternalSyntheticLambda6(this, i2);
                    AndroidUtilities.hideKeyboard(loginActivity.fragmentView);
                    return;
                }
                LoginActivity loginActivity2 = LoginActivity.this;
                Context context = LoginActivity.this.fragmentView.getContext();
                LoginActivity loginActivity3 = LoginActivity.this;
                loginActivity2.phoneNumberConfirmView = new PhoneNumberConfirmView(context, (ViewGroup) loginActivity3.fragmentView, loginActivity3.floatingButton, str2, new AnonymousClass6());
                PhoneNumberConfirmView phoneNumberConfirmView = LoginActivity.this.phoneNumberConfirmView;
                phoneNumberConfirmView.getClass();
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                duration.addListener(new PhoneNumberConfirmView.AnonymousClass1(phoneNumberConfirmView, i3));
                duration.addUpdateListener(new LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda0(phoneNumberConfirmView, i3));
                duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                duration.start();
                return;
            }
            this.confirmedNumber = false;
            PhoneNumberConfirmView phoneNumberConfirmView2 = LoginActivity.this.phoneNumberConfirmView;
            if (phoneNumberConfirmView2 != null) {
                int i5 = PhoneNumberConfirmView.$r8$clinit;
                phoneNumberConfirmView2.dismiss();
            }
            boolean zIsSimAvailable = AndroidUtilities.isSimAvailable();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 < 23 || !zIsSimAvailable) {
                z = true;
                z2 = true;
                z3 = true;
            } else {
                z = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                z2 = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
                z3 = i6 < 28 || LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
                boolean z4 = i6 < 26 || LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
                LoginActivity loginActivity4 = LoginActivity.this;
                if (loginActivity4.checkPermissions) {
                    loginActivity4.permissionsItems.clear();
                    if (!z) {
                        LoginActivity.this.permissionsItems.add("android.permission.READ_PHONE_STATE");
                    }
                    if (!z2) {
                        LoginActivity.this.permissionsItems.add("android.permission.CALL_PHONE");
                    }
                    if (!z3) {
                        LoginActivity.this.permissionsItems.add("android.permission.READ_CALL_LOG");
                    }
                    if (!z4 && i6 >= 26) {
                        LoginActivity.this.permissionsItems.add("android.permission.READ_PHONE_NUMBERS");
                    }
                    if (!LoginActivity.this.permissionsItems.isEmpty()) {
                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                        if (!globalMainSettings.getBoolean("firstlogin", true) && !LoginActivity.this.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !LoginActivity.this.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                            try {
                                LoginActivity.this.getParentActivity().requestPermissions((String[]) LoginActivity.this.permissionsItems.toArray(new String[0]), 6);
                                return;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                        globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                        AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity(), 0, null);
                        builder.setPositiveButton(LocaleController.getString("Continue", R.string.Continue), null);
                        if (!z && (!z2 || !z3)) {
                            builder.alertDialog.message = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                            i = R.raw.calls_log;
                        } else if (z2 && z3) {
                            builder.alertDialog.message = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                            i = R.raw.incoming_calls;
                        } else {
                            builder.alertDialog.message = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                            i = R.raw.calls_log;
                        }
                        builder.setTopAnimation(i, 46, Theme.getColor(null, Theme.key_dialogTopBackground, false), null);
                        LoginActivity loginActivity5 = LoginActivity.this;
                        loginActivity5.permissionsDialog = loginActivity5.showDialog(builder.alertDialog);
                        this.confirmedNumber = true;
                        return;
                    }
                }
            }
            int i7 = this.countryState;
            if (i7 == 1) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
                LoginActivity.this.needHideProgress(false, true);
                return;
            }
            if (i7 == 2 && !BuildVars.DEBUG_VERSION) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
                LoginActivity.this.needHideProgress(false, true);
                return;
            }
            String strStripExceptNumbers = PhoneFormat.stripExceptNumbers("" + ((Object) this.codeField.getText()) + ((Object) getText()), false);
            LoginActivity loginActivity6 = LoginActivity.this;
            if (loginActivity6.activityMode == 0 && (loginActivity6.getParentActivity() instanceof LaunchActivity)) {
                for (int i8 = 0; i8 < 4; i8++) {
                    UserConfig userConfig = UserConfig.getInstance(i8);
                    if (userConfig.isClientActivated() && PhoneNumberUtils.compare(strStripExceptNumbers, userConfig.getCurrentUser().phone)) {
                        boolean zIsTestBackend = ConnectionsManager.getInstance(i8).isTestBackend();
                        LoginActivity loginActivity7 = LoginActivity.this;
                        if (zIsTestBackend == loginActivity7.testBackend) {
                            AlertDialog.Builder builder2 = new AlertDialog.Builder(loginActivity7.getParentActivity(), 0, null);
                            builder2.alertDialog.title = LocaleController.getString(R.string.AppName);
                            builder2.alertDialog.message = LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn);
                            builder2.setPositiveButton(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new LaunchActivity$$ExternalSyntheticLambda9(this, i8, 12));
                            builder2.setNegativeButton(LocaleController.getString("OK", R.string.OK), null);
                            LoginActivity.this.showDialog(builder2.alertDialog);
                            LoginActivity.this.needHideProgress(false, true);
                            return;
                        }
                    }
                }
            }
            TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
            tL_codeSettings.allow_flashcall = zIsSimAvailable && z && z2 && z3;
            tL_codeSettings.allow_missed_call = zIsSimAvailable && z;
            boolean zHasServices = PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
            tL_codeSettings.allow_firebase = zHasServices;
            tL_codeSettings.allow_app_hash = zHasServices;
            if (LoginActivity.this.forceDisableSafetyNet || TextUtils.isEmpty(BuildVars.SAFETYNET_KEY)) {
                tL_codeSettings.allow_firebase = false;
            }
            ArrayList<TLRPC.TL_auth_authorization> savedLogInTokens = AuthTokensHelper.getSavedLogInTokens();
            if (savedLogInTokens != null) {
                for (int i9 = 0; i9 < savedLogInTokens.size(); i9++) {
                    if (savedLogInTokens.get(i9).future_auth_token != null) {
                        if (tL_codeSettings.logout_tokens == null) {
                            tL_codeSettings.logout_tokens = new ArrayList<>();
                        }
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("login token to check ".concat(new String(savedLogInTokens.get(i9).future_auth_token, StandardCharsets.UTF_8)));
                        }
                        tL_codeSettings.logout_tokens.add(savedLogInTokens.get(i9).future_auth_token);
                        if (tL_codeSettings.logout_tokens.size() >= 20) {
                            break;
                        }
                    }
                }
            }
            ArrayList<TLRPC.TL_auth_loggedOut> savedLogOutTokens = AuthTokensHelper.getSavedLogOutTokens();
            if (savedLogOutTokens != null) {
                for (int i10 = 0; i10 < savedLogOutTokens.size(); i10++) {
                    if (tL_codeSettings.logout_tokens == null) {
                        tL_codeSettings.logout_tokens = new ArrayList<>();
                    }
                    tL_codeSettings.logout_tokens.add(savedLogOutTokens.get(i10).future_auth_token);
                    if (tL_codeSettings.logout_tokens.size() >= 20) {
                        break;
                    }
                }
                AuthTokensHelper.saveLogOutTokens(savedLogOutTokens);
            }
            if (tL_codeSettings.logout_tokens != null) {
                tL_codeSettings.flags |= 64;
            }
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            sharedPreferences.edit().remove("sms_hash_code").apply();
            if (tL_codeSettings.allow_app_hash) {
                sharedPreferences.edit().putString("sms_hash", BuildVars.getSmsHash()).apply();
            } else {
                sharedPreferences.edit().remove("sms_hash").apply();
            }
            if (tL_codeSettings.allow_flashcall) {
                try {
                    HashSet hashSetAccess$6400 = LoginActivity.access$6400(LoginActivity.this);
                    if (hashSetAccess$6400.isEmpty()) {
                        tL_codeSettings.unknown_number = true;
                        if (UserConfig.getActivatedAccountsCount() > 0) {
                            tL_codeSettings.allow_flashcall = false;
                        } else {
                            tL_codeSettings.current_number = false;
                        }
                    } else {
                        tL_codeSettings.unknown_number = false;
                        tL_codeSettings.current_number = Collection.EL.stream(hashSetAccess$6400).anyMatch(new LanguageSelectActivity$$ExternalSyntheticLambda9(strStripExceptNumbers, i4));
                    }
                } catch (Exception e2) {
                    tL_codeSettings.unknown_number = true;
                    FileLog.e(e2);
                }
            }
            LoginActivity loginActivity8 = LoginActivity.this;
            if (loginActivity8.activityMode == 2) {
                TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
                sendchangephonecode.phone_number = strStripExceptNumbers;
                sendchangephonecode.settings = tL_codeSettings;
                tLObject = sendchangephonecode;
            } else {
                ConnectionsManager.getInstance(((BaseFragment) loginActivity8).currentAccount).cleanup(false);
                TLRPC.TL_auth_sendCode tL_auth_sendCode = new TLRPC.TL_auth_sendCode();
                tL_auth_sendCode.api_hash = BuildVars.APP_HASH;
                tL_auth_sendCode.api_id = BuildVars.APP_ID;
                tL_auth_sendCode.phone_number = strStripExceptNumbers;
                tL_auth_sendCode.settings = tL_codeSettings;
                tLObject = tL_auth_sendCode;
            }
            TLObject tLObject2 = tLObject;
            Bundle bundle = new Bundle();
            bundle.putString("phone", "+" + ((Object) this.codeField.getText()) + " " + ((Object) getText()));
            try {
                bundle.putString("ephone", "+" + PhoneFormat.stripExceptNumbers(this.codeField.getText().toString(), false) + " " + PhoneFormat.stripExceptNumbers(getText().toString(), false));
            } catch (Exception e3) {
                FileLog.e(e3);
                bundle.putString("ephone", "+" + strStripExceptNumbers);
            }
            bundle.putString("phoneFormated", strStripExceptNumbers);
            CountrySelectActivity.Country country = this.currentCountry;
            if (country != null) {
                bundle.putString("country", country.code);
            }
            this.nextPressed = true;
            ChatActivity.AnonymousClass117 anonymousClass117 = new ChatActivity.AnonymousClass117();
            anonymousClass117.this$0 = "+" + ((Object) this.codeField.getText()) + " " + ((Object) getText());
            anonymousClass117.val$primaryMessage = this.currentCountry;
            anonymousClass117.val$finalReactionsLayout = (List) this.phoneFormatMap.get(this.codeField.getText().toString());
            LoginActivity.this.needShowProgress(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tLObject2, new ChatActivity$$ExternalSyntheticLambda206((Object) this, (Object) bundle, strStripExceptNumbers, (Object) anonymousClass117, tLObject2, 10), 27), true);
        }

        @Override
        public final void onNothingSelected(AdapterView adapterView) {
        }

        @Override
        public final void onShow() {
            fillNumber();
            CheckBoxCell checkBoxCell = this.syncContactsBox;
            if (checkBoxCell != null) {
                checkBoxCell.setChecked(LoginActivity.this.syncContacts, false);
            }
            AndroidUtilities.runOnUIThread(new LoginActivity$PhoneView$$ExternalSyntheticLambda6(this, 0), LoginActivity.SHOW_DELAY);
        }

        public final void requestPasskey(boolean z) {
            LoginActivity loginActivity = LoginActivity.this;
            if (loginActivity.activityMode == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.requestingPasskey) {
                if (z || !this.requestedPasskey) {
                    this.requestingPasskey = true;
                    this.requestedPasskey = true;
                    this.cancelRequestingPasskey = PasskeysController.login(getContext(), ((BaseFragment) loginActivity).currentAccount, z, new PhotoViewer$$ExternalSyntheticLambda142(this, 1));
                }
            }
        }

        @Override
        public final void restoreStateParams(Bundle bundle) {
            String string = bundle.getString("phoneview_code");
            if (string != null) {
                this.codeField.setText(string);
            }
            String string2 = bundle.getString("phoneview_phone");
            if (string2 != null) {
                setText(string2);
            }
        }

        @Override
        public final void saveStateParams(Bundle bundle) {
            String string = this.codeField.getText().toString();
            if (string.length() != 0) {
                bundle.putString("phoneview_code", string);
            }
            String string2 = getText().toString();
            if (string2.length() != 0) {
                bundle.putString("phoneview_phone", string2);
            }
        }

        public final void setCountryHint(String str, CountrySelectActivity.Country country) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String languageFlag = LocaleController.getLanguageFlag(country.shortname);
            if (languageFlag != null) {
                spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
                spannableStringBuilder.setSpan(new CountrySelectActivity.AnonymousClass5(4), languageFlag.length(), languageFlag.length() + 1, 0);
            }
            spannableStringBuilder.append((CharSequence) country.name);
            setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.countryButton.getCurrentView().getPaint().getFontMetricsInt(), false));
            this.countryCodeForHint = str;
            this.wasCountryHintIndex = -1;
            invalidateCountryHint();
        }

        @Override
        public final void updateColors$1() {
            this.titleView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            LinkSpanDrawable.LinksTextView linksTextView = this.subtitleView;
            linksTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
            linksTextView.setLinkTextColor(Theme.getColor(null, Theme.key_chat_messageLinkIn, false));
            int i = 0;
            while (true) {
                TextViewSwitcher textViewSwitcher = this.countryButton;
                if (i >= textViewSwitcher.getChildCount()) {
                    break;
                }
                TextView textView = (TextView) textViewSwitcher.getChildAt(i);
                textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
                textView.setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
                i++;
            }
            ImageView imageView = this.chevronRight;
            int i2 = Theme.key_windowBackgroundWhiteHintText;
            imageView.setColorFilter(Theme.getColor(null, i2, false));
            imageView.setBackground(Theme.createSelectorDrawable(LoginActivity.this.getThemedColor(Theme.key_listSelector), 1, -1));
            TextView textView2 = this.plusTextView;
            int i3 = Theme.key_windowBackgroundWhiteBlackText;
            textView2.setTextColor(Theme.getColor(null, i3, false));
            int color = Theme.getColor(null, i3, false);
            NewContactBottomSheet.AnonymousClass3 anonymousClass3 = this.codeField;
            anonymousClass3.setTextColor(color);
            int i4 = Theme.key_windowBackgroundWhiteInputFieldActivated;
            anonymousClass3.setCursorColor(Theme.getColor(null, i4, false));
            this.codeDividerView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputField, false));
            int color2 = Theme.getColor(null, i3, false);
            AnonymousClass3 anonymousClass4 = this.phoneField;
            anonymousClass4.setTextColor(color2);
            anonymousClass4.setHintTextColor(Theme.getColor(null, i2, false));
            anonymousClass4.setCursorColor(Theme.getColor(null, i4, false));
            CheckBoxCell checkBoxCell = this.syncContactsBox;
            if (checkBoxCell != null) {
                int i5 = Theme.key_checkboxSquareUnchecked;
                int i6 = Theme.key_checkboxSquareBackground;
                int i7 = Theme.key_checkboxSquareCheck;
                CheckBoxSquare checkBoxSquare = checkBoxCell.checkBoxSquare;
                if (checkBoxSquare != null) {
                    checkBoxSquare.key1 = i5;
                    checkBoxSquare.key2 = i6;
                    checkBoxSquare.key3 = i7;
                    checkBoxSquare.invalidate();
                }
                checkBoxCell.updateTextColor();
            }
            CheckBoxCell checkBoxCell2 = this.testBackendCheckBox;
            if (checkBoxCell2 != null) {
                int i8 = Theme.key_checkboxSquareUnchecked;
                int i9 = Theme.key_checkboxSquareBackground;
                int i10 = Theme.key_checkboxSquareCheck;
                CheckBoxSquare checkBoxSquare2 = checkBoxCell2.checkBoxSquare;
                if (checkBoxSquare2 != null) {
                    checkBoxSquare2.key1 = i8;
                    checkBoxSquare2.key2 = i9;
                    checkBoxSquare2.key3 = i10;
                    checkBoxSquare2.invalidate();
                }
                checkBoxCell2.updateTextColor();
            }
            this.phoneOutlineView.updateColor();
            this.countryOutlineView.updateColor();
        }
    }

    static {
        SHOW_DELAY = SharedConfig.getDevicePerformanceClass() <= 1 ? 150 : 100;
    }

    public LoginActivity() {
        super(null);
        this.views = new SlideView[19];
        this.permissionsItems = new ArrayList();
        this.permissionsShowItems = new ArrayList();
        this.checkPermissions = true;
        this.checkShowPermissions = true;
        this.syncContacts = true;
        this.testBackend = false;
        this.activityMode = 0;
        this.showDoneAnimation = new AnimatorSet[2];
        this.doneButtonVisible = new boolean[]{true, false};
        this.customKeyboardWasVisible = false;
        this.doneProgressVisible = new boolean[2];
        this.editDoneCallback = new Runnable[2];
        this.postedEditDoneCallback = new boolean[2];
    }

    public static HashSet access$6400(LoginActivity loginActivity) {
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 22) {
                SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(loginActivity.getParentActivity());
                List completeActiveSubscriptionInfoList = i >= 30 ? subscriptionManagerFrom.getCompleteActiveSubscriptionInfoList() : null;
                if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i >= 28) {
                    completeActiveSubscriptionInfoList = subscriptionManagerFrom.getAccessibleSubscriptionInfoList();
                }
                if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                    completeActiveSubscriptionInfoList = subscriptionManagerFrom.getActiveSubscriptionInfoList();
                }
                if (completeActiveSubscriptionInfoList != null) {
                    for (int i2 = 0; i2 < completeActiveSubscriptionInfoList.size(); i2++) {
                        String number = LoginActivity$$ExternalSyntheticApiModelOutline2.m(completeActiveSubscriptionInfoList.get(i2)).getNumber();
                        if (!TextUtils.isEmpty(number)) {
                            hashSet.add(number);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        return hashSet;
    }

    public static String errorString(Exception exc) {
        if (exc == null) {
            return "NULL";
        }
        String simpleName = exc.getClass().getSimpleName();
        if (exc.getMessage() != null) {
            if (simpleName.length() > 0) {
                simpleName = simpleName.concat(" ");
            }
            StringBuilder sbM = Log.m(simpleName);
            sbM.append(exc.getMessage());
            simpleName = sbM.toString();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public static Bundle loadCurrentState(int i, boolean z) {
        try {
            Bundle bundle = new Bundle();
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb = new StringBuilder("logininfo2");
            sb.append(z ? "_" + i : "");
            for (Map.Entry<String, ?> entry : context.getSharedPreferences(sb.toString(), 0).getAll().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String[] strArrSplit = key.split("_\\|_");
                if (strArrSplit.length == 1) {
                    if (value instanceof String) {
                        bundle.putString(key, (String) value);
                    } else if (value instanceof Integer) {
                        bundle.putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle.putBoolean(key, ((Boolean) value).booleanValue());
                    }
                } else if (strArrSplit.length == 2) {
                    Bundle bundle2 = bundle.getBundle(strArrSplit[0]);
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(strArrSplit[0], bundle2);
                    }
                    if (value instanceof String) {
                        bundle2.putString(strArrSplit[1], (String) value);
                    } else if (value instanceof Integer) {
                        bundle2.putInt(strArrSplit[1], ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle2.putBoolean(strArrSplit[1], ((Boolean) value).booleanValue());
                    }
                }
            }
            return bundle;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static void needShowInvalidAlert(BaseFragment baseFragment, String str, ChatActivity.AnonymousClass117 anonymousClass117, boolean z) {
        List list;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, null);
        AlertDialog alertDialog = builder.alertDialog;
        if (z) {
            alertDialog.title = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
            alertDialog.message = LocaleController.getString("BannedPhoneNumber", R.string.BannedPhoneNumber);
        } else if (anonymousClass117 == null || (list = (List) anonymousClass117.val$finalReactionsLayout) == null || list.isEmpty() || ((CountrySelectActivity.Country) anonymousClass117.val$primaryMessage) == null) {
            alertDialog.title = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
            alertDialog.message = LocaleController.getString(R.string.InvalidPhoneNumber);
        } else {
            Iterator it = ((List) anonymousClass117.val$finalReactionsLayout).iterator();
            int i = Integer.MAX_VALUE;
            while (it.hasNext()) {
                int length = ((String) it.next()).replace(" ", "").length();
                if (length < i) {
                    i = length;
                }
            }
            if (PhoneFormat.stripExceptNumbers(str, false).length() - ((CountrySelectActivity.Country) anonymousClass117.val$primaryMessage).code.length() < i) {
                alertDialog.title = LocaleController.getString(R.string.WrongNumberFormat);
                alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("ShortNumberInfo", R.string.ShortNumberInfo, ((CountrySelectActivity.Country) anonymousClass117.val$primaryMessage).name, (String) anonymousClass117.this$0));
            } else {
                alertDialog.title = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                alertDialog.message = LocaleController.getString(R.string.InvalidPhoneNumber);
            }
        }
        builder.setNeutralButton(LocaleController.getString("BotHelp", R.string.BotHelp), new LoginActivity$$ExternalSyntheticLambda31(z, str, baseFragment));
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
        baseFragment.showDialog(alertDialog);
    }

    public static void onFieldError(View view, boolean z) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(view, 3.5f);
        if (z && (view instanceof OutlineTextContainerView)) {
            int i = R.id.timeout_callback;
            Runnable runnable = (Runnable) view.getTag(i);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            OutlineTextContainerView outlineTextContainerView = (OutlineTextContainerView) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = outlineTextContainerView.getAttachedEditText();
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(attachedEditText, atomicReference, false, 0);
            OutlineTextContainerView.animateSpring(outlineTextContainerView.errorSpring, 1.0f);
            LinkManager$$ExternalSyntheticLambda12 linkManager$$ExternalSyntheticLambda12 = new LinkManager$$ExternalSyntheticLambda12(outlineTextContainerView, view, attachedEditText, anonymousClass7, 9);
            atomicReference.set(linkManager$$ExternalSyntheticLambda12);
            view.postDelayed(linkManager$$ExternalSyntheticLambda12, 2000L);
            view.setTag(i, linkManager$$ExternalSyntheticLambda12);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(anonymousClass7);
            }
        }
    }

    public static void putBundleToEditor(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(zzit.m(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(zzit.m(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(zzit.m(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                putBundleToEditor((Bundle) obj, editor, str2);
            }
        }
    }

    public final void clearCurrentState() {
        String str;
        Context context = ApplicationLoader.applicationContext;
        StringBuilder sb = new StringBuilder("logininfo2");
        if (this.newAccount) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        sb.append(str);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(sb.toString(), 0).edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    @Override
    public final void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.pendingSwitchingAccount) {
                this.cachedFragmentView = this.fragmentView;
            }
            this.fragmentView = null;
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null && !this.pendingSwitchingAccount) {
            ViewGroup viewGroup2 = (ViewGroup) actionBar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    @Override
    public final View createView(Context context) {
        boolean z;
        int i;
        View view = this.cachedFragmentView;
        if (view != null) {
            this.fragmentView = view;
            this.cachedFragmentView = null;
            return view;
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1(this, 0));
        this.currentDoneType = 0;
        boolean[] zArr = this.doneButtonVisible;
        zArr[0] = true;
        zArr[1] = false;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, context, 0);
        this.sizeNotifierFrameLayout = anonymousClass2;
        anonymousClass2.setDelegate(new LoginActivity$$ExternalSyntheticLambda10(this, 0));
        this.fragmentView = this.sizeNotifierFrameLayout;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this, context, 0);
        anonymousClass3.setFillViewport(true);
        this.sizeNotifierFrameLayout.addView(anonymousClass3, LayoutHelper.createFrame(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.keyboardLinearLayout = linearLayout;
        linearLayout.setOrientation(1);
        anonymousClass3.addView(this.keyboardLinearLayout, LayoutHelper.createScroll(-1, -2, 51));
        Space space = new Space(context);
        space.setMinimumHeight(AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight);
        this.keyboardLinearLayout.addView(space);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this, context, 0);
        this.slideViewsContainer = anonymousClass4;
        this.keyboardLinearLayout.addView(anonymousClass4, LayoutHelper.createLinear(1.0f, -1, 0));
        CustomPhoneKeyboardView customPhoneKeyboardView = new CustomPhoneKeyboardView(context);
        this.keyboardView = customPhoneKeyboardView;
        customPhoneKeyboardView.setViewToFindFocus(this.slideViewsContainer);
        this.keyboardLinearLayout.addView(this.keyboardView, LayoutHelper.createLinear(-1, 230));
        PhoneView phoneView = new PhoneView(context);
        SlideView[] slideViewArr = this.views;
        slideViewArr[0] = phoneView;
        slideViewArr[1] = new LoginActivitySmsView(context, 1);
        slideViewArr[2] = new LoginActivitySmsView(context, 2);
        slideViewArr[3] = new LoginActivitySmsView(context, 3);
        slideViewArr[4] = new LoginActivitySmsView(context, 4);
        slideViewArr[5] = new LoginActivityRegisterView(context);
        slideViewArr[6] = new LoginActivityPasswordView(context);
        slideViewArr[7] = new LoginActivityRecoverView(context);
        int i2 = 8;
        slideViewArr[8] = new LoginActivityResetWaitView(context);
        slideViewArr[9] = new LoginActivityNewPasswordView(context, 0);
        slideViewArr[10] = new LoginActivityNewPasswordView(context, 1);
        slideViewArr[11] = new LoginActivitySmsView(context, 11);
        slideViewArr[12] = new LoginActivitySetupEmail(context);
        slideViewArr[13] = new LoginActivityEmailCodeView(context, true);
        slideViewArr[14] = new LoginActivityEmailCodeView(context, false);
        slideViewArr[15] = new LoginActivitySmsView(context, 15);
        slideViewArr[16] = new LoginActivityPhraseView(context, 16);
        slideViewArr[17] = new LoginActivityPhraseView(context, 17);
        int i3 = 18;
        slideViewArr[18] = new LoginPayView(context);
        int i4 = 0;
        while (i4 < slideViewArr.length) {
            SlideView slideView = slideViewArr[i4];
            if (i4 == 0) {
                i2 = 0;
            }
            slideView.setVisibility(i2);
            this.slideViewsContainer.addView(slideViewArr[i4], LayoutHelper.createFrame(-1, -1.0f, 17, AndroidUtilities.isTablet() ? 26.0f : 18.0f, i4 != i3 ? 30.0f : 0.0f, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 0.0f));
            i4++;
            i3 = 18;
            i2 = 8;
        }
        Bundle bundleLoadCurrentState = this.activityMode == 0 ? loadCurrentState(this.currentAccount, this.newAccount) : null;
        if (bundleLoadCurrentState != null && ((i = bundleLoadCurrentState.getInt("currentViewNum", 0)) < 0 || i >= slideViewArr.length)) {
            bundleLoadCurrentState = null;
        }
        if (bundleLoadCurrentState != null) {
            this.currentViewNum = bundleLoadCurrentState.getInt("currentViewNum", 0);
            this.syncContacts = bundleLoadCurrentState.getInt("syncContacts", 1) == 1;
            int i5 = this.currentViewNum;
            if (i5 >= 1 && i5 <= 4) {
                int i6 = bundleLoadCurrentState.getInt("open");
                if (i6 != 0 && Math.abs((System.currentTimeMillis() / 1000) - ((long) i6)) >= 86400) {
                    this.currentViewNum = 0;
                    clearCurrentState();
                    bundleLoadCurrentState = null;
                }
            } else if (i5 == 6) {
                if (((LoginActivityPasswordView) slideViewArr[6]).currentPassword == null) {
                    this.currentViewNum = 0;
                    clearCurrentState();
                    bundleLoadCurrentState = null;
                }
            } else if (i5 == 7 && ((LoginActivityRecoverView) slideViewArr[7]).passwordString == null) {
                this.currentViewNum = 0;
                clearCurrentState();
                bundleLoadCurrentState = null;
            }
        }
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider, false);
        this.floatingButton = fragmentFloatingButton;
        fragmentFloatingButton.animatorButtonVisible.setValue(zArr[0], false);
        this.floatingAutoAnimator = new PhotoViewer.AnonymousClass14(this.floatingButton);
        this.sizeNotifierFrameLayout.addView(this.floatingButton, LayoutHelper.createFrame(56, 56.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
        final int i7 = 0;
        this.floatingButton.setOnClickListener(new View.OnClickListener(this) {
            public final LoginActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        this.f$0.onDoneButtonPressed();
                        break;
                    case 1:
                        LoginActivity loginActivity = this.f$0;
                        if (loginActivity.onBackPressed(true)) {
                            loginActivity.finishFragment();
                        }
                        break;
                    case 2:
                        LoginActivity loginActivity2 = this.f$0;
                        DialogsActivity$$ExternalSyntheticLambda27 dialogsActivity$$ExternalSyntheticLambda27 = loginActivity2.emailChangeSkipCallback;
                        if (dialogsActivity$$ExternalSyntheticLambda27 != null) {
                            dialogsActivity$$ExternalSyntheticLambda27.run();
                        }
                        loginActivity2.finishFragment();
                        break;
                    default:
                        LoginActivity loginActivity3 = this.f$0;
                        loginActivity3.getClass();
                        loginActivity3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        ((SpringAnimation) this.floatingAutoAnimator.this$0).addUpdateListener(new LoginActivity$$ExternalSyntheticLambda12(this, i7));
        ImageView imageView = new ImageView(context);
        this.backButtonView = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        final int i8 = 1;
        this.backButtonView.setOnClickListener(new View.OnClickListener(this) {
            public final LoginActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i8) {
                    case 0:
                        this.f$0.onDoneButtonPressed();
                        break;
                    case 1:
                        LoginActivity loginActivity = this.f$0;
                        if (loginActivity.onBackPressed(true)) {
                            loginActivity.finishFragment();
                        }
                        break;
                    case 2:
                        LoginActivity loginActivity2 = this.f$0;
                        DialogsActivity$$ExternalSyntheticLambda27 dialogsActivity$$ExternalSyntheticLambda27 = loginActivity2.emailChangeSkipCallback;
                        if (dialogsActivity$$ExternalSyntheticLambda27 != null) {
                            dialogsActivity$$ExternalSyntheticLambda27.run();
                        }
                        loginActivity2.finishFragment();
                        break;
                    default:
                        LoginActivity loginActivity3 = this.f$0;
                        loginActivity3.getClass();
                        loginActivity3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.backButtonView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        int iDp = AndroidUtilities.dp(4.0f);
        this.backButtonView.setPadding(iDp, iDp, iDp, iDp);
        this.sizeNotifierFrameLayout.addView(this.backButtonView, LayoutHelper.createFrame(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
        if (this.emailChangeSkipCallback != null && !this.emailChangeNonSkippable && this.emailChangeIsSuggestion) {
            TextView textView = new TextView(context);
            this.emailChangeSkipButton = textView;
            textView.setGravity(19);
            this.emailChangeSkipButton.setTextSize(1, 15.0f);
            this.emailChangeSkipButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.emailChangeSkipButton.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            this.emailChangeSkipButton.setText(LocaleController.getString(R.string.YourEmailSkip));
            this.emailChangeSkipButton.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            this.sizeNotifierFrameLayout.addView(this.emailChangeSkipButton, LayoutHelper.createFrame(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
            final int i9 = 2;
            this.emailChangeSkipButton.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i9) {
                        case 0:
                            this.f$0.onDoneButtonPressed();
                            break;
                        case 1:
                            LoginActivity loginActivity = this.f$0;
                            if (loginActivity.onBackPressed(true)) {
                                loginActivity.finishFragment();
                            }
                            break;
                        case 2:
                            LoginActivity loginActivity2 = this.f$0;
                            DialogsActivity$$ExternalSyntheticLambda27 dialogsActivity$$ExternalSyntheticLambda27 = loginActivity2.emailChangeSkipCallback;
                            if (dialogsActivity$$ExternalSyntheticLambda27 != null) {
                                dialogsActivity$$ExternalSyntheticLambda27.run();
                            }
                            loginActivity2.finishFragment();
                            break;
                        default:
                            LoginActivity loginActivity3 = this.f$0;
                            loginActivity3.getClass();
                            loginActivity3.presentFragment(new ProxyListActivity());
                            break;
                    }
                }
            });
        }
        ImageView imageView2 = new ImageView(context);
        this.proxyButtonView = imageView2;
        ProxyDrawable proxyDrawable = new ProxyDrawable(context);
        this.proxyDrawable = proxyDrawable;
        imageView2.setImageDrawable(proxyDrawable);
        final int i10 = 3;
        this.proxyButtonView.setOnClickListener(new View.OnClickListener(this) {
            public final LoginActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        this.f$0.onDoneButtonPressed();
                        break;
                    case 1:
                        LoginActivity loginActivity = this.f$0;
                        if (loginActivity.onBackPressed(true)) {
                            loginActivity.finishFragment();
                        }
                        break;
                    case 2:
                        LoginActivity loginActivity2 = this.f$0;
                        DialogsActivity$$ExternalSyntheticLambda27 dialogsActivity$$ExternalSyntheticLambda27 = loginActivity2.emailChangeSkipCallback;
                        if (dialogsActivity$$ExternalSyntheticLambda27 != null) {
                            dialogsActivity$$ExternalSyntheticLambda27.run();
                        }
                        loginActivity2.finishFragment();
                        break;
                    default:
                        LoginActivity loginActivity3 = this.f$0;
                        loginActivity3.getClass();
                        loginActivity3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.proxyButtonView.setAlpha(0.0f);
        this.proxyButtonView.setVisibility(8);
        this.sizeNotifierFrameLayout.addView(this.proxyButtonView, LayoutHelper.createFrame(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
        updateProxyButton$1(false, true);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.radialProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(20.0f));
        this.radialProgressView.setAlpha(0.0f);
        this.radialProgressView.setScaleX(0.1f);
        this.radialProgressView.setScaleY(0.1f);
        this.sizeNotifierFrameLayout.addView(this.radialProgressView, LayoutHelper.createFrame(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
        TransformableLoginButtonView transformableLoginButtonView = new TransformableLoginButtonView(context);
        this.floatingButtonIcon = transformableLoginButtonView;
        transformableLoginButtonView.setTransformType(0);
        this.floatingButtonIcon.setProgress(1.0f);
        this.floatingButtonIcon.setDrawBackground(false);
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Done));
        this.floatingButton.addView(this.floatingButtonIcon, LayoutHelper.createFrame(56, 56, 17));
        this.floatingButton.addAdditionalView(this.floatingButtonIcon);
        if (bundleLoadCurrentState != null) {
            this.restoringState = true;
        }
        for (int i11 = 0; i11 < slideViewArr.length; i11++) {
            SlideView slideView2 = slideViewArr[i11];
            if (bundleLoadCurrentState != null && (i11 < 1 || i11 > 4 || i11 == this.currentViewNum)) {
                slideView2.restoreStateParams(bundleLoadCurrentState);
            }
            if (this.currentViewNum == i11) {
                this.backButtonView.setVisibility((slideView2.needBackButton() || this.newAccount || this.activityMode == 2) ? 0 : 8);
                slideView2.setVisibility(0);
                slideView2.onShow();
                setCustomKeyboardVisible(slideView2.hasCustomKeyboard(), false);
                this.currentDoneType = 0;
                if (i11 != 0 && i11 != 5 && i11 != 6) {
                    if (i11 != 9) {
                        if (i11 != 10 && i11 != 12) {
                            z = false;
                        }
                        showDoneButton(z, false);
                        if (i11 == 1 && i11 != 2) {
                            if (i11 == 3 || i11 == 4) {
                            }
                        }
                        this.currentDoneType = 1;
                    }
                    z = true;
                    showDoneButton(z, false);
                    if (i11 == 1) {
                        this.currentDoneType = 1;
                    } else {
                        this.currentDoneType = 1;
                    }
                }
                z = true;
                showDoneButton(z, false);
                if (i11 == 1) {
                    this.currentDoneType = 1;
                } else {
                    this.currentDoneType = 1;
                }
            } else if (slideView2.getVisibility() != 8) {
                slideView2.setVisibility(8);
                slideView2.onHide();
            }
        }
        this.restoringState = false;
        updateColors$4();
        if (this.activityMode == 1) {
            fillNextCodeParams(this.cancelDeletionParams, this.cancelDeletionCode, false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didUpdateConnectionState) {
            updateProxyButton$1(true, false);
        } else if (i == NotificationCenter.newSuggestionsAvailable && this.emailChangeIsSuggestion && !getMessagesController().hasSetupEmailSuggestion()) {
            finishFragment();
        }
    }

    public final void fillNextCodeParams(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z) {
        if (auth_sentcode instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
            TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) auth_sentcode;
            bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
            bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
            bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
            bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
            bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
            bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
            bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
            setPage(18, true, bundle, true);
            return;
        }
        TLRPC.auth_SentCodeType auth_sentcodetype = auth_sentcode.type;
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.isRequestingFirebaseSms) {
            if (!PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                FileLog.d("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
                resendCodeFromSafetyNet(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
                return;
            }
            TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
            needShowProgress(0, true);
            this.isRequestingFirebaseSms = true;
            String string = bundle.getString("phoneFormated");
            if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                IntegrityManager integrityManagerCreate = IntegrityManagerFactory.create(getParentActivity());
                String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                FileLog.d("getting classic integrity with nonce = ".concat(str));
                Task<IntegrityTokenResponse> taskAddOnSuccessListener = integrityManagerCreate.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new LoginActivity$$ExternalSyntheticLambda21(this, bundle, auth_sentcode, string, z));
                final int i = 0;
                taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener(this) {
                    public final LoginActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onFailure(Exception exc) {
                        switch (i) {
                            case 0:
                                LoginActivity loginActivity = this.f$0;
                                loginActivity.getClass();
                                String str2 = "PLAYINTEGRITY_EXCEPTION_" + LoginActivity.errorString(exc);
                                FileLog.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, str2);
                                break;
                            default:
                                LoginActivity loginActivity2 = this.f$0;
                                loginActivity2.getClass();
                                FileLog.e(exc);
                                String str3 = "SAFETYNET_EXCEPTION_" + LoginActivity.errorString(exc);
                                FileLog.d("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                loginActivity2.resendCodeFromSafetyNet(bundle, auth_sentcode, str3);
                                break;
                        }
                    }
                });
                return;
            }
            zze zzeVar = new zze(ApplicationLoader.applicationContext, SafetyNet.API, null, new ApiExceptionMapper());
            byte[] bArr = auth_sentcode.type.nonce;
            String str2 = BuildVars.SAFETYNET_KEY;
            zabv zabvVar = zzeVar.zai;
            zzi zziVar = new zzi(zabvVar, bArr, str2);
            zabvVar.zaa.zad(0, zziVar);
            Task taskAddOnSuccessListener2 = zzah.toTask(zziVar, new zah(new SafetyNetApi$AttestationResponse())).addOnSuccessListener(new LoginActivity$$ExternalSyntheticLambda21(this, string, auth_sentcode, bundle, z));
            final int i2 = 1;
            taskAddOnSuccessListener2.addOnFailureListener(new OnFailureListener(this) {
                public final LoginActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onFailure(Exception exc) {
                    switch (i2) {
                        case 0:
                            LoginActivity loginActivity = this.f$0;
                            loginActivity.getClass();
                            String str3 = "PLAYINTEGRITY_EXCEPTION_" + LoginActivity.errorString(exc);
                            FileLog.e("{" + str3 + "} Resend firebase sms because integrity threw error", exc);
                            loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, str3);
                            break;
                        default:
                            LoginActivity loginActivity2 = this.f$0;
                            loginActivity2.getClass();
                            FileLog.e(exc);
                            String str4 = "SAFETYNET_EXCEPTION_" + LoginActivity.errorString(exc);
                            FileLog.d("{" + str4 + "} Resend firebase sms because of safetynet exception");
                            loginActivity2.resendCodeFromSafetyNet(bundle, auth_sentcode, str4);
                            break;
                    }
                }
            });
            return;
        }
        bundle.putString("phoneHash", auth_sentcode.phone_code_hash);
        TLRPC.auth_CodeType auth_codetype = auth_sentcode.next_type;
        if (auth_codetype instanceof TLRPC.TL_auth_codeTypeCall) {
            bundle.putInt("nextType", 4);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFlashCall) {
            bundle.putInt("nextType", 3);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeSms) {
            bundle.putInt("nextType", 2);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeMissedCall) {
            bundle.putInt("nextType", 11);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFragmentSms) {
            bundle.putInt("nextType", 15);
        }
        if (auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeApp) {
            bundle.putInt("type", 1);
            bundle.putInt("length", auth_sentcode.type.length);
            setPage(1, z, bundle, false);
            return;
        }
        if (auth_sentcode.timeout == 0) {
            auth_sentcode.timeout = BuildVars.DEBUG_PRIVATE_VERSION ? 5 : 60;
        }
        bundle.putInt("timeout", auth_sentcode.timeout * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt("type", 4);
            bundle.putInt("length", auth_sentcode.type.length);
            setPage(4, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            setPage(3, z, bundle, false);
            return;
        }
        if ((auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) || (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            bundle.putInt("type", 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            setPage(2, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
            bundle.putInt("type", 15);
            bundle.putString("url", auth_sentcode.type.url);
            bundle.putInt("length", auth_sentcode.type.length);
            setPage(15, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
            bundle.putInt("type", 11);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putString("prefix", auth_sentcode.type.prefix);
            setPage(11, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            setPage(12, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
            bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
            bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
            setPage(14, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
            String str3 = auth_sentcodetype2.beginning;
            if (str3 != null) {
                bundle.putString("beginning", str3);
            }
            setPage(16, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
            String str4 = auth_sentcodetype2.beginning;
            if (str4 != null) {
                bundle.putString("beginning", str4);
            }
            setPage(17, z, bundle, false);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new QrActivity$$ExternalSyntheticLambda9(5, this), Theme.key_windowBackgroundWhiteBlackText, Theme.key_windowBackgroundWhiteGrayText6, Theme.key_windowBackgroundWhiteHintText, Theme.key_listSelector, Theme.key_chats_actionBackground, Theme.key_chats_actionIcon, Theme.key_windowBackgroundWhiteInputField, Theme.key_windowBackgroundWhiteInputFieldActivated, Theme.key_windowBackgroundWhiteValueText, Theme.key_text_RedBold, Theme.key_windowBackgroundWhiteGrayText, Theme.key_checkbox, Theme.key_windowBackgroundWhiteBlueText4, Theme.key_changephoneinfo_image2, Theme.key_chats_actionPressedBackground, Theme.key_text_RedRegular, Theme.key_windowBackgroundWhiteLinkText, Theme.key_checkboxSquareUnchecked, Theme.key_checkboxSquareBackground, Theme.key_checkboxSquareCheck, Theme.key_dialogBackground, Theme.key_dialogTextGray2, Theme.key_dialogTextBlack);
    }

    public final boolean isCustomKeyboardVisible() {
        return this.views[this.currentViewNum].hasCustomKeyboard() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    @Override
    public final boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, true)) > 0.699999988079071d;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.emailChangeIsSuggestion;
    }

    public final void lambda$fillNextCodeParams$24(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            FileLog.d("Resend firebase sms because integrity token = null");
            resendCodeFromSafetyNet(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new LoginActivity$$ExternalSyntheticLambda28(0, bundle, auth_sentcode, this, z), 10);
    }

    public final void lambda$fillNextCodeParams$28(String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z, SafetyNetApi$AttestationResponse safetyNetApi$AttestationResponse) {
        zza zzaVar = ((zzp) ((Result) safetyNetApi$AttestationResponse.data)).zzb;
        String str2 = zzaVar == null ? null : zzaVar.zza;
        if (str2 == null) {
            FileLog.d("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.safety_net_token = str2;
        tL_auth_requestFirebaseSms.flags |= 1;
        String[] strArrSplit = str2.split("\\.");
        if (strArrSplit.length <= 0) {
            FileLog.d("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
            resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(strArrSplit[1].getBytes(StandardCharsets.UTF_8), 0)));
            boolean zOptBoolean = jSONObject.optBoolean("basicIntegrity");
            boolean zOptBoolean2 = jSONObject.optBoolean("ctsProfileMatch");
            try {
                if (zOptBoolean && zOptBoolean2) {
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new LoginActivity$$ExternalSyntheticLambda28(1, bundle, auth_sentcode, this, z), 10);
                    return;
                }
                if (!zOptBoolean && !zOptBoolean2) {
                    FileLog.d("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                    resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                    return;
                } else if (!zOptBoolean) {
                    FileLog.d("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                    resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                    return;
                } else {
                    if (zOptBoolean2) {
                        return;
                    }
                    FileLog.d("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                    resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                    return;
                }
            } catch (JSONException e) {
                e = e;
            }
        } catch (JSONException e2) {
            e = e2;
        }
        FileLog.e(e);
        FileLog.d("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
        resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
    }

    public final void lambda$tryResetAccount$31(TLRPC.TL_error tL_error, String str, String str2, String str3) {
        needHideProgress(false, true);
        if (tL_error == null) {
            if (str == null || str2 == null || str3 == null) {
                setPage(0, true, null, true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("phoneFormated", str);
            bundle.putString("phoneHash", str2);
            bundle.putString("code", str3);
            setPage(5, true, bundle, false);
            return;
        }
        if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
            return;
        }
        if (!tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("phoneFormated", str);
        bundle2.putString("phoneHash", str2);
        bundle2.putString("code", str3);
        bundle2.putInt("startTime", ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
        bundle2.putInt("waitTime", Utilities.parseInt((CharSequence) tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
        setPage(8, true, bundle2, false);
    }

    public final void lambda$tryResetAccount$33(String str, String str2, String str3) {
        needShowProgress(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deleteaccount, new LoginActivity$$ExternalSyntheticLambda42(this, str, str2, str3, 0), 10);
    }

    public final void needHideProgress(boolean z, boolean z2) {
        AlertDialog alertDialog;
        if (this.progressRequestId != 0) {
            if (z) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.progressRequestId, true);
            }
            this.progressRequestId = 0;
        }
        if (this.activityMode == 1 && (alertDialog = this.cancelDeleteProgressDialog) != null) {
            alertDialog.dismiss();
            this.cancelDeleteProgressDialog = null;
        }
        showEditDoneProgress(false, z2, false);
    }

    public final void needShowAlert(String str, String str2) {
        if (str2 == null || getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = str;
        alertDialog.message = str2;
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
        showDialog(alertDialog);
    }

    public final void needShowProgress(int i, boolean z) {
        if (!(this.activityMode == 1) || i != 0) {
            this.progressRequestId = i;
            showEditDoneProgress(true, z, false);
        } else {
            if (this.cancelDeleteProgressDialog != null || getParentActivity() == null || getParentActivity().isFinishing()) {
                return;
            }
            AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
            this.cancelDeleteProgressDialog = alertDialog;
            alertDialog.canCacnel = false;
            alertDialog.show();
        }
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        LoginActivityRegisterView loginActivityRegisterView = (LoginActivityRegisterView) this.views[5];
        if (loginActivityRegisterView != null) {
            loginActivityRegisterView.imageUpdater.onActivityResult(i, i2, intent);
        }
    }

    public final void onAuthSuccess(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z) {
        MessagesController.getInstance(this.currentAccount).cleanup();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.id);
        UserConfig.getInstance(this.currentAccount).clearConfig();
        MessagesController.getInstance(this.currentAccount).cleanup();
        UserConfig.getInstance(this.currentAccount).syncContacts = this.syncContacts;
        UserConfig.getInstance(this.currentAccount).setCurrentUser(tL_auth_authorization.user);
        UserConfig.getInstance(this.currentAccount).saveConfig(true);
        MessagesStorage.getInstance(this.currentAccount).cleanup(true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_auth_authorization.user);
        MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(arrayList, null, true, true);
        MessagesController.getInstance(this.currentAccount).putUser(tL_auth_authorization.user, false);
        ContactsController.getInstance(this.currentAccount).checkAppAccount();
        MessagesController.getInstance(this.currentAccount).checkPromoInfo(true);
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        MessagesController.getInstance(this.currentAccount).loadAppConfig();
        MessagesController.getInstance(this.currentAccount).lambda$removeWebBrowserException$514();
        MessagesController.getInstance(this.currentAccount).checkPeerColors(false);
        if (tL_auth_authorization.future_auth_token != null) {
            AuthTokensHelper.saveLogInToken(tL_auth_authorization);
        } else {
            FileLog.d("onAuthSuccess future_auth_token is empty");
        }
        if (z) {
            MessagesController.getInstance(this.currentAccount).putDialogsEndReachedAfterRegistration();
        }
        MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName("tg_placeholders_android", false, true);
        boolean z2 = tL_auth_authorization.setup_password_required;
        int i = tL_auth_authorization.otherwise_relogin_days;
        if (getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(getParentActivity(), false);
        }
        clearCurrentState();
        if (!(getParentActivity() instanceof LaunchActivity)) {
            if (getParentActivity() instanceof ExternalActionActivity) {
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
                externalActionActivity.handleIntent$1(externalActionActivity.passcodeSaveIntentAccount, externalActionActivity.passcodeSaveIntent, externalActionActivity.passcodeSaveIntentIsNew, externalActionActivity.passcodeSaveIntentIsRestore, true, externalActionActivity.passcodeSaveIntentState);
                externalActionActivity.actionBarLayout.removeAllFragments();
                ActionBarLayout actionBarLayout = externalActionActivity.layersActionBarLayout;
                if (actionBarLayout != null) {
                    actionBarLayout.removeAllFragments();
                }
                SizeNotifierFrameLayout sizeNotifierFrameLayout = externalActionActivity.backgroundTablet;
                if (sizeNotifierFrameLayout != null) {
                    sizeNotifierFrameLayout.setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        if (this.newAccount) {
            this.newAccount = false;
            this.pendingSwitchingAccount = true;
            ((LaunchActivity) getParentActivity()).switchToAccount(this.currentAccount, new LoginActivity$$ExternalSyntheticLambda41(0, z));
            this.pendingSwitchingAccount = false;
            finishFragment();
            return;
        }
        if (z && z2) {
            TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(6, null);
            twoStepVerificationSetupActivity.otherwiseReloginDays = i;
            twoStepVerificationSetupActivity.fromRegistration = true;
            presentFragment(twoStepVerificationSetupActivity, true);
        } else {
            Bundle bundleM = zzkw.m("afterSignup", z);
            MainTabsActivity mainTabsActivity = new MainTabsActivity();
            mainTabsActivity.prepareDialogsActivity(bundleM);
            presentFragment(mainTabsActivity, true);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
        RestrictedLanguagesSelectActivity.checkRestrictedLanguages(true);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (!this.emailChangeIsSuggestion || this.currentViewNum != 12) {
            int i = this.currentViewNum;
            SlideView[] slideViewArr = this.views;
            if (i == 0 || (this.activityMode == 3 && i == 12)) {
                if (z) {
                    for (SlideView slideView : slideViewArr) {
                        if (slideView != null) {
                            slideView.onDestroyActivity();
                        }
                    }
                    clearCurrentState();
                }
                return true;
            }
            if (i == 6) {
                if (z) {
                    slideViewArr[i].onBackPressed(true);
                    setPage(0, true, null, true);
                    return false;
                }
            } else if (i == 7 || i == 8) {
                if (z) {
                    slideViewArr[i].onBackPressed(true);
                    setPage(6, true, null, true);
                }
            } else if ((i >= 1 && i <= 4) || i == 11 || i == 15) {
                if (z && slideViewArr[i].onBackPressed(false)) {
                    setPage(0, true, null, true);
                    return false;
                }
            } else if (i == 5) {
                if (z) {
                    ((LoginActivityRegisterView) slideViewArr[i]).wrongNumber.callOnClick();
                    return false;
                }
            } else if (i == 9) {
                if (z) {
                    slideViewArr[i].onBackPressed(true);
                    setPage(7, true, null, true);
                    return false;
                }
            } else if (i == 10) {
                if (z) {
                    slideViewArr[i].onBackPressed(true);
                    setPage(9, true, null, true);
                    return false;
                }
            } else if (i == 13) {
                if (z) {
                    slideViewArr[i].onBackPressed(true);
                    setPage(12, true, null, true);
                    return false;
                }
            } else if (z && slideViewArr[i].onBackPressed(true)) {
                setPage(0, true, null, true);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        setCustomKeyboardVisible(this.views[this.currentViewNum].hasCustomKeyboard(), false);
        PhoneNumberConfirmView phoneNumberConfirmView = this.phoneNumberConfirmView;
        if (phoneNumberConfirmView != null) {
            int i = PhoneNumberConfirmView.$r8$clinit;
            phoneNumberConfirmView.dismiss();
        }
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (dialog == this.permissionsDialog) {
                    ArrayList arrayList = this.permissionsItems;
                    if (!arrayList.isEmpty() && getParentActivity() != null) {
                        getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
                        return;
                    }
                }
                if (dialog == this.permissionsShowDialog) {
                    ArrayList arrayList2 = this.permissionsShowItems;
                    if (arrayList2.isEmpty() || getParentActivity() == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new LoginActivity$$ExternalSyntheticLambda8(this, 0), 200L);
                    getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void onDoneButtonPressed() {
        if (this.doneButtonVisible[this.currentDoneType]) {
            if (this.radialProgressView.getTag() == null) {
                this.views[this.currentViewNum].onNextPressed(null);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string = LocaleController.getString("StopLoadingTitle", R.string.StopLoadingTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString("StopLoading", R.string.StopLoading);
            builder.setPositiveButton(LocaleController.getString("WaitMore", R.string.WaitMore), null);
            builder.setNegativeButton(LocaleController.getString("Stop", R.string.Stop), new LoginActivity$$ExternalSyntheticLambda32(this, 0));
            showDialog(alertDialog);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateConnectionState);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i = 0;
        while (true) {
            SlideView[] slideViewArr = this.views;
            if (i >= slideViewArr.length) {
                break;
            }
            SlideView slideView = slideViewArr[i];
            if (slideView != null) {
                slideView.onDestroyActivity();
            }
            i++;
        }
        AlertDialog alertDialog = this.cancelDeleteProgressDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.cancelDeleteProgressDialog = null;
        }
        for (Runnable runnable : this.editDoneCallback) {
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateConnectionState);
        getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.newAccount) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        boolean z = iArr[0] == 0;
        SlideView[] slideViewArr = this.views;
        if (i == 6) {
            this.checkPermissions = false;
            int i2 = this.currentViewNum;
            if (i2 == 0) {
                SlideView slideView = slideViewArr[i2];
                ((PhoneView) slideView).confirmedNumber = true;
                slideView.onNextPressed(null);
                return;
            }
            return;
        }
        if (i == 7) {
            this.checkShowPermissions = false;
            int i3 = this.currentViewNum;
            if (i3 == 0) {
                ((PhoneView) slideViewArr[i3]).fillNumber();
                return;
            }
            return;
        }
        if (i == 20) {
            if (z) {
                ((LoginActivityRegisterView) slideViewArr[5]).imageUpdater.openCamera();
            }
        } else if (i == 151 && z) {
            LoginActivityRegisterView loginActivityRegisterView = (LoginActivityRegisterView) slideViewArr[5];
            loginActivityRegisterView.post(new LoginActivity$$ExternalSyntheticLambda16(loginActivityRegisterView, 0));
        }
    }

    @Override
    public final void onResume() {
        SlideView slideView;
        int i;
        SlideView[] slideViewArr = this.views;
        super.onResume();
        if (this.newAccount) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i2 = this.currentViewNum;
            if (i2 >= 1 && i2 <= 4) {
                SlideView slideView2 = slideViewArr[i2];
                if ((slideView2 instanceof LoginActivitySmsView) && (i = ((LoginActivitySmsView) slideView2).openTime) != 0 && Math.abs((System.currentTimeMillis() / 1000) - ((long) i)) >= 86400) {
                    slideViewArr[this.currentViewNum].onBackPressed(true);
                    setPage(0, false, null, true);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        int i3 = this.currentViewNum;
        if (i3 == 0 && !this.needRequestPermissions && (slideView = slideViewArr[i3]) != null) {
            slideView.onShow();
        }
        if (isCustomKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
        int i4 = this.currentViewNum;
        if (i4 < 0 || i4 >= slideViewArr.length) {
            return;
        }
        slideViewArr[i4].onResume();
    }

    public final void resendCodeFromSafetyNet(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (this.isRequestingFirebaseSms) {
            needHideProgress(false, true);
            this.isRequestingFirebaseSms = false;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
            tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
            if (str != null) {
                tL_auth_resendCode.flags |= 1;
                tL_auth_resendCode.reason = str;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new LinkManager$$ExternalSyntheticLambda8(26, this, bundle), 10);
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.currentViewNum);
            bundle2.putInt("syncContacts", this.syncContacts ? 1 : 0);
            for (int i = 0; i <= this.currentViewNum; i++) {
                SlideView slideView = this.views[i];
                if (slideView != null) {
                    slideView.saveStateParams(bundle2);
                }
            }
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb = new StringBuilder();
            sb.append("logininfo2");
            sb.append(this.newAccount ? "_" + this.currentAccount : "");
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(sb.toString(), 0).edit();
            editorEdit.clear();
            putBundleToEditor(bundle2, editorEdit, null);
            editorEdit.commit();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void setCustomKeyboardVisible(boolean z, boolean z2) {
        final int i = 1;
        final int i2 = 0;
        if (this.customKeyboardWasVisible == z && z2) {
            return;
        }
        this.customKeyboardWasVisible = z;
        if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            z = false;
        }
        if (!z) {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
            if (!z2) {
                this.keyboardView.setVisibility(8);
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.keyboardAnimator = duration;
            duration.setInterpolator(Easings.easeInOutQuad);
            this.keyboardAnimator.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda17(this, i));
            this.keyboardAnimator.addListener(new AnimatorListenerAdapter(this) {
                public final LoginActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    switch (i) {
                        case 0:
                            LoginActivity loginActivity = this.this$0;
                            if (loginActivity.keyboardAnimator == animator) {
                                loginActivity.keyboardAnimator = null;
                            }
                            break;
                        default:
                            LoginActivity loginActivity2 = this.this$0;
                            loginActivity2.keyboardView.setVisibility(8);
                            if (loginActivity2.keyboardAnimator == animator) {
                                loginActivity2.keyboardAnimator = null;
                            }
                            break;
                    }
                }

                @Override
                public void onAnimationStart(Animator animator) {
                    switch (i) {
                        case 0:
                            this.this$0.keyboardView.setVisibility(0);
                            break;
                        default:
                            super.onAnimationStart(animator);
                            break;
                    }
                }
            });
            this.keyboardAnimator.start();
            return;
        }
        AndroidUtilities.hideKeyboard(this.fragmentView);
        AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        if (!z2) {
            this.keyboardView.setVisibility(0);
            return;
        }
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.keyboardAnimator = duration2;
        duration2.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.keyboardAnimator.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda17(this, i2));
        this.keyboardAnimator.addListener(new AnimatorListenerAdapter(this) {
            public final LoginActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (i2) {
                    case 0:
                        LoginActivity loginActivity = this.this$0;
                        if (loginActivity.keyboardAnimator == animator) {
                            loginActivity.keyboardAnimator = null;
                        }
                        break;
                    default:
                        LoginActivity loginActivity2 = this.this$0;
                        loginActivity2.keyboardView.setVisibility(8);
                        if (loginActivity2.keyboardAnimator == animator) {
                            loginActivity2.keyboardAnimator = null;
                        }
                        break;
                }
            }

            @Override
            public void onAnimationStart(Animator animator) {
                switch (i2) {
                    case 0:
                        this.this$0.keyboardView.setVisibility(0);
                        break;
                    default:
                        super.onAnimationStart(animator);
                        break;
                }
            }
        });
        this.keyboardAnimator.start();
    }

    public final void setPage(int i, boolean z, Bundle bundle, boolean z2) {
        int i2 = 9;
        boolean z3 = i == 0 || i == 5 || i == 6 || i == 9 || i == 10 || i == 12 || i == 17 || i == 16;
        if (i == this.currentViewNum) {
            z = false;
        }
        if (z3) {
            if (i == 0) {
                this.checkPermissions = true;
                this.checkShowPermissions = true;
            }
            this.currentDoneType = 1;
            showDoneButton(false, z);
            showEditDoneProgress(false, z, false);
            this.currentDoneType = 0;
            showEditDoneProgress(false, z, false);
            if (!z) {
                showDoneButton(true, false);
            }
        } else {
            this.currentDoneType = 0;
            showDoneButton(false, z);
            showEditDoneProgress(false, z, false);
            if (i != 8) {
                this.currentDoneType = 1;
            }
        }
        SlideView[] slideViewArr = this.views;
        if (!z) {
            this.backButtonView.setVisibility((slideViewArr[i].needBackButton() || this.newAccount) ? 0 : 8);
            slideViewArr[this.currentViewNum].setVisibility(8);
            slideViewArr[this.currentViewNum].onHide();
            this.currentViewNum = i;
            slideViewArr[i].setParams(bundle, false);
            slideViewArr[i].setVisibility(0);
            setParentActivityTitle(slideViewArr[i].getHeaderName());
            slideViewArr[i].onShow();
            setCustomKeyboardVisible(slideViewArr[i].hasCustomKeyboard(), false);
            return;
        }
        SlideView slideView = slideViewArr[this.currentViewNum];
        SlideView slideView2 = slideViewArr[i];
        this.currentViewNum = i;
        this.backButtonView.setVisibility((slideView2.needBackButton() || this.newAccount) ? 0 : 8);
        slideView2.setParams(bundle, false);
        setParentActivityTitle(slideView2.getHeaderName());
        slideView2.onShow();
        slideView2.setX(z2 ? -AndroidUtilities.displaySize.x : AndroidUtilities.displaySize.x);
        slideView2.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new ChatActivity.AnonymousClass63(this, z3, slideView, i2));
        Property property = View.TRANSLATION_X;
        animatorSet.playTogether(ObjectAnimator.ofFloat(slideView, (Property<SlideView, Float>) property, z2 ? AndroidUtilities.displaySize.x : -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(slideView2, (Property<SlideView, Float>) property, 0.0f));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
        setCustomKeyboardVisible(slideView2.hasCustomKeyboard(), true);
    }

    public final void showDoneButton(boolean z, boolean z2) {
        TimeInterpolator timeInterpolator;
        int i = this.currentDoneType;
        boolean z3 = i == 0;
        boolean[] zArr = this.doneButtonVisible;
        if (zArr[i] == z) {
            return;
        }
        AnimatorSet[] animatorSetArr = this.showDoneAnimation;
        AnimatorSet animatorSet = animatorSetArr[i];
        if (animatorSet != null) {
            if (z2) {
                animatorSet.removeAllListeners();
            }
            animatorSetArr[this.currentDoneType].cancel();
        }
        int i2 = this.currentDoneType;
        zArr[i2] = z;
        if (!z2) {
            if (z3) {
                this.floatingButton.animatorButtonVisible.setValue(z, z2);
                return;
            }
            return;
        }
        animatorSetArr[i2] = new AnimatorSet();
        if (z3) {
            this.floatingButton.animatorButtonVisible.setValue(z, z2);
        }
        animatorSetArr[this.currentDoneType].addListener(new AnonymousClass8(this, z3, z, 0));
        int i3 = 150;
        if (!z3) {
            timeInterpolator = null;
        } else if (z) {
            timeInterpolator = AndroidUtilities.decelerateInterpolator;
            i3 = 200;
        } else {
            timeInterpolator = AndroidUtilities.accelerateInterpolator;
        }
        animatorSetArr[this.currentDoneType].setDuration(i3);
        animatorSetArr[this.currentDoneType].setInterpolator(timeInterpolator);
        animatorSetArr[this.currentDoneType].start();
    }

    public final void showEditDoneProgress(final boolean z, final boolean z2, boolean z3) {
        int i = 2;
        int i2 = 0;
        boolean[] zArr = this.doneProgressVisible;
        if (z2 && zArr[this.currentDoneType] == z && !z3) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AndroidUtilities.runOnUIThread(new LoginActivity$$ExternalSyntheticLambda25(this, z, z2, z3, 0));
            return;
        }
        final int i3 = this.currentDoneType;
        boolean z4 = i3 == 0;
        boolean[] zArr2 = this.postedEditDoneCallback;
        if (z3 || z4) {
            zArr2[i3] = false;
            zArr[i3] = z;
        } else {
            zArr[i3] = z;
            if (z2) {
                boolean z5 = zArr2[i3];
                Runnable[] runnableArr = this.editDoneCallback;
                if (z5) {
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[i3]);
                    zArr2[this.currentDoneType] = false;
                    return;
                } else if (z) {
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            LoginActivity loginActivity = this.f$0;
                            int i4 = loginActivity.currentDoneType;
                            loginActivity.currentDoneType = i3;
                            loginActivity.showEditDoneProgress(z, z2, true);
                            loginActivity.currentDoneType = i4;
                        }
                    };
                    runnableArr[i3] = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 2000L);
                    zArr2[this.currentDoneType] = true;
                    return;
                }
            }
        }
        AnimatorSet animatorSet = this.doneItemAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z4) {
            this.floatingButton.animatorProgressVisible.setValue(z, z2);
            return;
        }
        if (z2) {
            this.doneItemAnimation = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            valueAnimatorOfFloat.addListener(new AnonymousClass9(i2, this, z));
            valueAnimatorOfFloat.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda17(this, i));
            this.doneItemAnimation.playTogether(valueAnimatorOfFloat);
            this.doneItemAnimation.setDuration(150L);
            this.doneItemAnimation.start();
            return;
        }
        if (z) {
            this.radialProgressView.setVisibility(0);
            this.radialProgressView.setScaleX(1.0f);
            this.radialProgressView.setScaleY(1.0f);
            this.radialProgressView.setAlpha(1.0f);
            return;
        }
        this.radialProgressView.setTag(null);
        this.radialProgressView.setVisibility(4);
        this.radialProgressView.setScaleX(0.1f);
        this.radialProgressView.setScaleY(0.1f);
        this.radialProgressView.setAlpha(0.0f);
    }

    public final void showProxyButton(boolean z, boolean z2) {
        if (z == this.proxyButtonVisible) {
            return;
        }
        LoginActivity$$ExternalSyntheticLambda8 loginActivity$$ExternalSyntheticLambda8 = this.showProxyButtonDelayed;
        if (loginActivity$$ExternalSyntheticLambda8 != null) {
            AndroidUtilities.cancelRunOnUIThread(loginActivity$$ExternalSyntheticLambda8);
            this.showProxyButtonDelayed = null;
        }
        this.proxyButtonVisible = z;
        this.proxyButtonView.clearAnimation();
        if (z2) {
            this.proxyButtonView.setVisibility(0);
            this.proxyButtonView.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new TodoItemMenu$$ExternalSyntheticLambda5(2, this, z)).start();
        } else {
            this.proxyButtonView.setVisibility(z ? 0 : 8);
            this.proxyButtonView.setAlpha(z ? 1.0f : 0.0f);
        }
    }

    public final void tryResetAccount(String str, String str2, String str3) {
        if (this.radialProgressView.getTag() != null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.message = string;
        alertDialog.title = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
        builder.setPositiveButton(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new ArticleViewer$$ExternalSyntheticLambda54((Object) this, (Object) str, (Object) str2, (Object) str3, 12));
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        showDialog(alertDialog);
    }

    public final void updateColors$4() {
        this.fragmentView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        ImageView imageView = this.backButtonView;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        imageView.setColorFilter(Theme.getColor(null, i, false));
        ImageView imageView2 = this.backButtonView;
        int i2 = Theme.key_listSelector;
        imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, i2, false), 1, -1));
        this.proxyDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.SRC_IN));
        this.proxyButtonView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, i2, false), 1, -1));
        RadialProgressView radialProgressView = this.radialProgressView;
        int i3 = Theme.key_chats_actionBackground;
        radialProgressView.setProgressColor(Theme.getColor(null, i3, false));
        this.floatingButton.updateColors$1();
        this.floatingButtonIcon.setColor(Theme.getColor(null, Theme.key_chats_actionIcon, false));
        this.floatingButtonIcon.setBackgroundColor(Theme.getColor(null, i3, false));
        for (SlideView slideView : this.views) {
            slideView.updateColors$1();
        }
        CustomPhoneKeyboardView customPhoneKeyboardView = this.keyboardView;
        customPhoneKeyboardView.backButton.setColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        int i4 = 0;
        while (true) {
            View[] viewArr = customPhoneKeyboardView.views;
            if (i4 >= viewArr.length) {
                break;
            }
            View view = viewArr[i4];
            if (view != null) {
                view.setBackground(CustomPhoneKeyboardView.getButtonDrawable(i4));
                if (view instanceof CustomPhoneKeyboardView.NumberButtonView) {
                    CustomPhoneKeyboardView.NumberButtonView numberButtonView = (CustomPhoneKeyboardView.NumberButtonView) view;
                    numberButtonView.numberTextPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
                    numberButtonView.symbolsTextPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
                }
            }
            i4++;
        }
        PhoneNumberConfirmView phoneNumberConfirmView = this.phoneNumberConfirmView;
        if (phoneNumberConfirmView != null) {
            int i5 = PhoneNumberConfirmView.$r8$clinit;
            phoneNumberConfirmView.updateColors();
        }
    }

    public final void updateProxyButton$1(boolean z, boolean z2) {
        if (this.proxyDrawable == null) {
            return;
        }
        int connectionState = getConnectionsManager().getConnectionState();
        if (this.currentConnectionState != connectionState || z2) {
            this.currentConnectionState = connectionState;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            boolean z3 = sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(sharedPreferences.getString("proxy_ip", ""));
            int i = this.currentConnectionState;
            boolean z4 = i == 3 || i == 5;
            boolean z5 = i == 1 || i == 2 || i == 4;
            if (z3) {
                this.proxyDrawable.setConnected(true, z4, z);
                showProxyButton(true, z);
                return;
            }
            if ((!getMessagesController().blockedCountry || SharedConfig.proxyList.isEmpty()) && !z5) {
                showProxyButton(false, z);
                return;
            }
            this.proxyDrawable.setConnected(true, z4, z);
            if (this.proxyButtonVisible) {
                return;
            }
            LoginActivity$$ExternalSyntheticLambda8 loginActivity$$ExternalSyntheticLambda8 = this.showProxyButtonDelayed;
            if (loginActivity$$ExternalSyntheticLambda8 != null) {
                AndroidUtilities.cancelRunOnUIThread(loginActivity$$ExternalSyntheticLambda8);
            }
            this.proxyButtonVisible = true;
            LoginActivity$$ExternalSyntheticLambda8 loginActivity$$ExternalSyntheticLambda9 = new LoginActivity$$ExternalSyntheticLambda8(this, 1);
            this.showProxyButtonDelayed = loginActivity$$ExternalSyntheticLambda9;
            AndroidUtilities.runOnUIThread(loginActivity$$ExternalSyntheticLambda9, 5000L);
        }
    }

    public class LoadingTextView extends TextView {
        public final int $r8$classId = 1;
        public final Object loadingDrawable;
        public final Object rippleDrawable;
        public final Object this$0;

        public LoadingTextView(VoIPStatusTextView voIPStatusTextView, Activity activity, VoIPBackgroundProvider voIPBackgroundProvider) {
            super(activity);
            this.this$0 = voIPStatusTextView;
            this.loadingDrawable = voIPBackgroundProvider;
            this.rippleDrawable = new RectF();
            voIPBackgroundProvider.views.add(this);
        }

        public boolean isResendingCode() {
            return false;
        }

        public boolean isRippleEnabled() {
            return true;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    canvas.save();
                    float paddingTop = ((getGravity() & 16) == 0 || getLayout() == null) ? getPaddingTop() : ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
                    canvas.translate(getPaddingLeft(), paddingTop);
                    ((BaseCell.RippleDrawableSafe) this.rippleDrawable).draw(canvas);
                    canvas.restore();
                    super.onDraw(canvas);
                    boolean zIsResendingCode = isResendingCode();
                    LoadingDrawable loadingDrawable = (LoadingDrawable) this.loadingDrawable;
                    if (zIsResendingCode || loadingDrawable.isDisappearing()) {
                        canvas.save();
                        canvas.translate(getPaddingLeft(), paddingTop);
                        loadingDrawable.draw(canvas);
                        canvas.restore();
                        invalidate();
                    }
                    break;
                default:
                    RectF rectF = (RectF) this.rippleDrawable;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    float x = ((View) getParent()).getX() + getX();
                    VoIPStatusTextView voIPStatusTextView = (VoIPStatusTextView) this.this$0;
                    float x2 = ((View) voIPStatusTextView.getParent()).getX() + voIPStatusTextView.getX() + x;
                    float y = ((View) voIPStatusTextView.getParent()).getY() + voIPStatusTextView.getY() + ((View) getParent()).getY() + getY();
                    VoIPBackgroundProvider voIPBackgroundProvider = (VoIPBackgroundProvider) this.loadingDrawable;
                    voIPBackgroundProvider.setDarkTranslation(x2, y);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), voIPBackgroundProvider.getDarkPaint());
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 0:
                    super.onLayout(z, i, i2, i3, i4);
                    updateLoadingLayout();
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 0:
                    boolean zIsRippleEnabled = isRippleEnabled();
                    BaseCell.RippleDrawableSafe rippleDrawableSafe = (BaseCell.RippleDrawableSafe) this.rippleDrawable;
                    if (zIsRippleEnabled && motionEvent.getAction() == 0) {
                        rippleDrawableSafe.setHotspot(motionEvent.getX(), motionEvent.getY());
                        rippleDrawableSafe.setState(new int[]{16842910, 16842919});
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 1) {
                        rippleDrawableSafe.setState(new int[0]);
                    }
                    break;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            switch (this.$r8$classId) {
                case 0:
                    super.setText(charSequence, bufferType);
                    updateLoadingLayout();
                    break;
                default:
                    super.setText(charSequence, bufferType);
                    break;
            }
        }

        public void updateLoadingLayout() {
            CharSequence text;
            Layout layout = getLayout();
            if (layout == null || (text = layout.getText()) == null) {
                return;
            }
            LinkPath linkPath = new LinkPath(0);
            float fDp = AndroidUtilities.dp(3.0f);
            float fDp2 = AndroidUtilities.dp(6.0f);
            linkPath.insetVert = fDp;
            linkPath.insetHoriz = fDp2;
            int length = text.length();
            linkPath.setCurrentLayout(layout, 0, 0.0f, 0.0f);
            layout.getSelectionPath(0, length, linkPath);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(linkPath.minX, linkPath.minY, linkPath.maxX, linkPath.maxY);
            ((BaseCell.RippleDrawableSafe) this.rippleDrawable).setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            LoadingDrawable loadingDrawable = (LoadingDrawable) this.loadingDrawable;
            loadingDrawable.usePath = linkPath;
            loadingDrawable.setRadii(AndroidUtilities.dp(4.0f));
            int themedColor = ((LoginActivity) this.this$0).getThemedColor(Theme.key_chat_linkSelectBackground);
            loadingDrawable.setColors(Theme.multAlpha(0.85f, themedColor), Theme.multAlpha(2.0f, themedColor), Theme.multAlpha(3.5f, themedColor), Theme.multAlpha(6.0f, themedColor));
            loadingDrawable.updateBounds();
        }

        @Override
        public boolean verifyDrawable(Drawable drawable) {
            switch (this.$r8$classId) {
                case 0:
                    return drawable == ((BaseCell.RippleDrawableSafe) this.rippleDrawable) || super.verifyDrawable(drawable);
                default:
                    return super.verifyDrawable(drawable);
            }
        }

        public LoadingTextView(LoginActivity loginActivity, Context context) {
            super(context);
            this.this$0 = loginActivity;
            BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable = Theme.createSelectorDrawable(Theme.multAlpha(0.1f, Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false)), 7, -1);
            this.rippleDrawable = rippleDrawableSafeCreateSelectorDrawable;
            LoadingDrawable loadingDrawable = new LoadingDrawable();
            this.loadingDrawable = loadingDrawable;
            rippleDrawableSafeCreateSelectorDrawable.setCallback(this);
            loadingDrawable.appearByGradient = true;
            loadingDrawable.speed = 0.8f;
        }
    }

    public LoginActivity(int i) {
        super(null);
        this.views = new SlideView[19];
        this.permissionsItems = new ArrayList();
        this.permissionsShowItems = new ArrayList();
        this.checkPermissions = true;
        this.checkShowPermissions = true;
        this.syncContacts = true;
        this.testBackend = false;
        this.activityMode = 0;
        this.showDoneAnimation = new AnimatorSet[2];
        this.doneButtonVisible = new boolean[]{true, false};
        this.customKeyboardWasVisible = false;
        this.doneProgressVisible = new boolean[2];
        this.editDoneCallback = new Runnable[2];
        this.postedEditDoneCallback = new boolean[2];
        this.currentAccount = i;
        this.newAccount = true;
    }
}
