package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.core.graphics.ColorUtils;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.zzcl;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.internal.mlkit_vision_common.zzkc;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import java.io.File;
import java.util.ArrayList;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline1;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$DialogFilter$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TelegramMediaSession$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.audioinfo.AudioInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSlider;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.CastSync;
import org.telegram.ui.Cells.AudioPlayerCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChooseQualityLayout;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.SelectAudioAlert;
import org.telegram.ui.TopicsFragment;

public class AudioPlayerAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static AudioPlayerAlert instance;
    private static final float[] speeds = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    private int TAG;
    private ActionBar actionBar;
    private AnimatorSet actionBarAnimation;
    private View actionBarBackground;
    private View actionBarShadow;
    private float actionBarSlide;
    private final Property<ActionBar, Float> actionBarSlideProperty;
    private ActionBarMenuItem addItem;
    private ClippingTextViewSwitcher authorTextView;
    private BackupImageView bigAlbumConver;
    private boolean blurredAnimationInProgress;
    private FrameLayout blurredView;
    private View[] buttons;
    private boolean castAvailable;
    private ActionBarMenuSubItem castItem;
    private CastMediaRouteButton castItemButton;
    private CoverContainer coverContainer;
    private boolean currentAudioFinishedLoading;
    private String currentFile;
    private boolean draggingSeekBar;
    private TextView durationTextView;
    private ImageView emptyImageView;
    private TextView emptySubtitleTextView;
    private TextView emptyTitleTextView;
    private LinearLayout emptyView;
    private final Runnable forwardSeek;
    private boolean inFullSize;
    private final boolean isProfilePlaylist;
    private ItemTouchHelper itemTouchHelper;
    private long lastBufferedPositionCheck;
    private int lastDuration;
    private MessageObject lastMessageObject;
    private long lastPlaybackClick;
    long lastRewindingTime;
    private int lastTime;
    long lastUpdateRewindingPlayerTime;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private RLottieImageView nextButton;
    private boolean noforwards;
    private ActionBarMenuItem optionsButton;
    private ChooseQualityLayout.QualityIcon optionsIcon;
    private final boolean padWithItem;
    private LaunchActivity parentActivity;
    private ImageView playButton;
    private PlayPauseDrawable playPauseDrawable;
    private ActionBarMenuItem playbackSpeedButton;
    private FrameLayout playerLayout;
    private View playerShadow;
    private ArrayList<MessageObject> playlist;
    private RLottieImageView prevButton;
    private LineProgressView progressView;
    private ActionBarMenuItem repeatButton;
    private ActionBarMenuSubItem repeatListItem;
    private ActionBarMenuSubItem repeatSongItem;
    private ActionBarMenuSubItem reverseOrderItem;
    int rewindingForwardPressedCount;
    float rewindingProgress;
    int rewindingState;
    private ValueAnimator rightPaddingAnimator;
    private ButtonWithCounterView saveToProfileButton;
    private MessagesController.SavedMusicList savedMusicList;
    private int scrollOffsetY;
    private boolean scrollToSong;
    private ActionBarMenuItem searchItem;
    private int searchOpenOffset;
    private int searchOpenPosition;
    private boolean searchWas;
    private boolean searching;
    private SpringAnimation seekBarBufferSpring;
    private SeekBarView seekBarView;
    private ActionBarMenuSubItem shuffleListItem;
    private boolean slidingSpeed;
    private HintView speedHintView;
    private SpeedIconDrawable speedIcon;
    private ActionBarMenuSubItem[] speedItems;
    private ActionBarMenuSlider.SpeedSlider speedSlider;
    private SimpleTextView timeTextView;
    private ClippingTextViewSwitcher titleTextView;
    private int topBeforeSwitch;
    private ButtonWithCounterView unsaveFromProfileButton;
    private boolean wasLight;

    public class AnonymousClass12 extends RLottieImageView {
        private final Runnable backSeek;
        long lastTime;
        long lastUpdateTime;
        int pressedCount;
        private final Runnable pressedRunnable;
        long startTime;
        float startX;
        float startY;
        final float val$touchSlop;

        public AnonymousClass12(Context context, float f) {
            super(context);
            this.val$touchSlop = f;
            this.pressedCount = 0;
            this.pressedRunnable = new Runnable() {
                @Override
                public void run() {
                    AnonymousClass12 anonymousClass12 = AnonymousClass12.this;
                    int i = anonymousClass12.pressedCount + 1;
                    anonymousClass12.pressedCount = i;
                    if (i != 1) {
                        if (i == 2) {
                            AndroidUtilities.runOnUIThread(this, 2000L);
                            return;
                        }
                        return;
                    }
                    AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
                    audioPlayerAlert.rewindingState = -1;
                    audioPlayerAlert.rewindingProgress = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    AnonymousClass12.this.lastTime = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(AnonymousClass12.this.backSeek);
                }
            };
            this.backSeek = new Runnable() {
                @Override
                public void run() {
                    long j;
                    long duration = MediaController.getInstance().getDuration();
                    if (duration == 0 || duration == -9223372036854775807L) {
                        AnonymousClass12.this.lastTime = System.currentTimeMillis();
                        return;
                    }
                    float f2 = AudioPlayerAlert.this.rewindingProgress;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    AnonymousClass12 anonymousClass12 = AnonymousClass12.this;
                    long j2 = jCurrentTimeMillis - anonymousClass12.lastTime;
                    anonymousClass12.lastTime = jCurrentTimeMillis;
                    long j3 = jCurrentTimeMillis - anonymousClass12.lastUpdateTime;
                    int i = anonymousClass12.pressedCount;
                    if (i == 1) {
                        j = 3;
                    } else {
                        j = i == 2 ? 6L : 12L;
                    }
                    float f3 = duration;
                    float f4 = ((long) ((f2 * f3) - (j2 * j))) / f3;
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    AudioPlayerAlert.this.rewindingProgress = f4;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        AudioPlayerAlert.this.updateProgress(playingMessageObject);
                    }
                    AnonymousClass12 anonymousClass13 = AnonymousClass12.this;
                    AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
                    if (audioPlayerAlert.rewindingState != -1 || anonymousClass13.pressedCount <= 0) {
                        return;
                    }
                    if (j3 > 200 || audioPlayerAlert.rewindingProgress == 0.0f) {
                        anonymousClass13.lastUpdateTime = jCurrentTimeMillis;
                        if (audioPlayerAlert.rewindingProgress == 0.0f) {
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                            MediaController.getInstance().pauseByRewind();
                        } else {
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f4);
                        }
                    }
                    AnonymousClass12 anonymousClass14 = AnonymousClass12.this;
                    if (anonymousClass14.pressedCount <= 0 || AudioPlayerAlert.this.rewindingProgress <= 0.0f) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(anonymousClass14.backSeek, 16L);
                }
            };
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.addAction(16);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (AudioPlayerAlert.this.seekBarView.isDragging() || AudioPlayerAlert.this.rewindingState == 1) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.startX = rawX;
                this.startY = rawY;
                this.startTime = System.currentTimeMillis();
                AudioPlayerAlert.this.rewindingState = 0;
                AndroidUtilities.runOnUIThread(this.pressedRunnable, 300L);
                if (getBackground() != null) {
                    getBackground().setHotspot(this.startX, this.startY);
                }
                setPressed(true);
            } else if (action == 1) {
                AndroidUtilities.cancelRunOnUIThread(this.pressedRunnable);
                AndroidUtilities.cancelRunOnUIThread(this.backSeek);
                if (AudioPlayerAlert.this.rewindingState == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.startTime < 300) {
                    MediaController.getInstance().playPreviousMessage();
                    AudioPlayerAlert.this.prevButton.setProgress(0.0f);
                    AudioPlayerAlert.this.prevButton.playAnimation();
                }
                if (this.pressedCount > 0) {
                    this.lastUpdateTime = 0L;
                    this.backSeek.run();
                    MediaController.getInstance().resumeByRewind();
                }
                AudioPlayerAlert.this.rewindingProgress = -1.0f;
                setPressed(false);
                AudioPlayerAlert.this.rewindingState = 0;
                this.pressedCount = 0;
            } else if (action == 2) {
                float f = rawX - this.startX;
                float f2 = rawY - this.startY;
                float f3 = (f2 * f2) + (f * f);
                float f4 = this.val$touchSlop;
                if (f3 > f4 * f4 && AudioPlayerAlert.this.rewindingState == 0) {
                    AndroidUtilities.cancelRunOnUIThread(this.pressedRunnable);
                    setPressed(false);
                }
            } else if (action == 3) {
                AndroidUtilities.cancelRunOnUIThread(this.pressedRunnable);
                AndroidUtilities.cancelRunOnUIThread(this.backSeek);
                if (AudioPlayerAlert.this.rewindingState == 0) {
                    MediaController.getInstance().playPreviousMessage();
                    AudioPlayerAlert.this.prevButton.setProgress(0.0f);
                    AudioPlayerAlert.this.prevButton.playAnimation();
                }
                if (this.pressedCount > 0) {
                    this.lastUpdateTime = 0L;
                    this.backSeek.run();
                    MediaController.getInstance().resumeByRewind();
                }
                AudioPlayerAlert.this.rewindingProgress = -1.0f;
                setPressed(false);
                AudioPlayerAlert.this.rewindingState = 0;
                this.pressedCount = 0;
            }
            return true;
        }
    }

    public class AnonymousClass13 extends RLottieImageView {
        boolean pressed;
        private final Runnable pressedRunnable;
        float startX;
        float startY;
        final float val$touchSlop;

        public AnonymousClass13(Context context, float f) {
            super(context);
            this.val$touchSlop = f;
            this.pressedRunnable = new Runnable() {
                @Override
                public void run() {
                    if (MediaController.getInstance().getPlayingMessageObject() == null) {
                        return;
                    }
                    AnonymousClass13 anonymousClass13 = AnonymousClass13.this;
                    AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
                    int i = audioPlayerAlert.rewindingForwardPressedCount + 1;
                    audioPlayerAlert.rewindingForwardPressedCount = i;
                    if (i != 1) {
                        if (i != 2) {
                            MediaController.getInstance().setPlaybackSpeed(true, 13.0f);
                            return;
                        } else {
                            MediaController.getInstance().setPlaybackSpeed(true, 7.0f);
                            AndroidUtilities.runOnUIThread(this, 2000L);
                            return;
                        }
                    }
                    anonymousClass13.pressed = true;
                    audioPlayerAlert.rewindingState = 1;
                    if (MediaController.getInstance().isMessagePaused()) {
                        AudioPlayerAlert.this.startForwardRewindingSeek();
                    } else {
                        AudioPlayerAlert audioPlayerAlert2 = AudioPlayerAlert.this;
                        if (audioPlayerAlert2.rewindingState == 1) {
                            AndroidUtilities.cancelRunOnUIThread(audioPlayerAlert2.forwardSeek);
                            AudioPlayerAlert.this.lastUpdateRewindingPlayerTime = 0L;
                        }
                    }
                    MediaController.getInstance().setPlaybackSpeed(true, 4.0f);
                    AndroidUtilities.runOnUIThread(this, 2000L);
                }
            };
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.addAction(16);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (AudioPlayerAlert.this.seekBarView.isDragging() || AudioPlayerAlert.this.rewindingState == -1) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.pressed = false;
                this.startX = rawX;
                this.startY = rawY;
                AndroidUtilities.runOnUIThread(this.pressedRunnable, 300L);
                if (getBackground() != null) {
                    getBackground().setHotspot(this.startX, this.startY);
                }
                setPressed(true);
            } else if (action == 1) {
                if (!this.pressed && motionEvent.getAction() == 1 && isPressed()) {
                    MediaController.getInstance().playNextMessage();
                    AudioPlayerAlert.this.nextButton.setProgress(0.0f);
                    AudioPlayerAlert.this.nextButton.playAnimation();
                }
                AndroidUtilities.cancelRunOnUIThread(this.pressedRunnable);
                if (AudioPlayerAlert.this.rewindingForwardPressedCount > 0) {
                    MediaController.getInstance().setPlaybackSpeed(true, 1.0f);
                    if (MediaController.getInstance().isMessagePaused()) {
                        AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
                        audioPlayerAlert.lastUpdateRewindingPlayerTime = 0L;
                        audioPlayerAlert.forwardSeek.run();
                    }
                }
                AudioPlayerAlert.this.rewindingState = 0;
                setPressed(false);
                AudioPlayerAlert audioPlayerAlert2 = AudioPlayerAlert.this;
                audioPlayerAlert2.rewindingForwardPressedCount = 0;
                audioPlayerAlert2.rewindingProgress = -1.0f;
            } else if (action == 2) {
                float f = rawX - this.startX;
                float f2 = rawY - this.startY;
                float f3 = (f2 * f2) + (f * f);
                float f4 = this.val$touchSlop;
                if (f3 > f4 * f4 && !this.pressed) {
                    AndroidUtilities.cancelRunOnUIThread(this.pressedRunnable);
                    setPressed(false);
                }
            } else if (action == 3) {
                if (!this.pressed) {
                    MediaController.getInstance().playNextMessage();
                    AudioPlayerAlert.this.nextButton.setProgress(0.0f);
                    AudioPlayerAlert.this.nextButton.playAnimation();
                }
                AndroidUtilities.cancelRunOnUIThread(this.pressedRunnable);
                if (AudioPlayerAlert.this.rewindingForwardPressedCount > 0) {
                    MediaController.getInstance().setPlaybackSpeed(true, 1.0f);
                    if (MediaController.getInstance().isMessagePaused()) {
                        AudioPlayerAlert audioPlayerAlert3 = AudioPlayerAlert.this;
                        audioPlayerAlert3.lastUpdateRewindingPlayerTime = 0L;
                        audioPlayerAlert3.forwardSeek.run();
                    }
                }
                AudioPlayerAlert.this.rewindingState = 0;
                setPressed(false);
                AudioPlayerAlert audioPlayerAlert4 = AudioPlayerAlert.this;
                audioPlayerAlert4.rewindingForwardPressedCount = 0;
                audioPlayerAlert4.rewindingProgress = -1.0f;
            }
            return true;
        }
    }

    public class AnonymousClass8 extends ClippingTextViewSwitcher {
        final Context val$context;

        public AnonymousClass8(Context context, Context context2) {
            super(context);
            this.val$context = context2;
        }

        public void lambda$createTextView$0(TextView textView, View view) {
            if (MessagesController.getInstance(((BottomSheet) AudioPlayerAlert.this).currentAccount).getTotalDialogsCount() <= 10 || TextUtils.isEmpty(textView.getText().toString())) {
                return;
            }
            String string = textView.getText().toString();
            if (((ActionBarLayout) AudioPlayerAlert.this.parentActivity.getActionBarLayout()).getLastFragment() instanceof DialogsActivity) {
                DialogsActivity dialogsActivity = (DialogsActivity) ((ActionBarLayout) AudioPlayerAlert.this.parentActivity.getActionBarLayout()).getLastFragment();
                if (!dialogsActivity.onlyDialogsAdapter()) {
                    dialogsActivity.setShowSearch(string, 3);
                    AudioPlayerAlert.this.lambda$showGiftOfferSheet$15();
                    return;
                }
            }
            DialogsActivity dialogsActivity2 = new DialogsActivity(null);
            dialogsActivity2.setSearchString(string);
            dialogsActivity2.setInitialSearchType(3);
            AudioPlayerAlert.this.parentActivity.presentFragment(dialogsActivity2, false, false);
            AudioPlayerAlert.this.lambda$showGiftOfferSheet$15();
        }

        @Override
        public TextView createTextView() {
            MarqueeTextView marqueeTextView = new MarqueeTextView(this.val$context);
            marqueeTextView.setTextColor(AudioPlayerAlert.this.getThemedColor(Theme.key_player_time));
            marqueeTextView.setTextSize(1, 13.0f);
            marqueeTextView.setEllipsize(TextUtils.TruncateAt.END);
            marqueeTextView.setSingleLine(true);
            marqueeTextView.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
            marqueeTextView.setBackground(Theme.createRadSelectorDrawable(AudioPlayerAlert.this.getThemedColor(Theme.key_listSelector), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
            marqueeTextView.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(1, this, marqueeTextView));
            return marqueeTextView;
        }
    }

    public static abstract class ClippingTextViewSwitcher extends FrameLayout {
        private int activeIndex;
        private AnimatorSet animatorSet;
        private final float[] clipProgress;
        private final Paint erasePaint;
        private final Matrix gradientMatrix;
        private final Paint gradientPaint;
        private LinearGradient gradientShader;
        private final int gradientSize;
        private boolean isCenter;
        private final RectF rectF;
        private int rightPadding;
        private int stableOffest;
        private final TextView[] textViews;

        public ClippingTextViewSwitcher(Context context) {
            super(context);
            this.textViews = new TextView[2];
            this.clipProgress = new float[]{0.0f, 0.75f};
            this.gradientSize = AndroidUtilities.dp(24.0f);
            this.stableOffest = -1;
            this.rectF = new RectF();
            for (int i = 0; i < 2; i++) {
                this.textViews[i] = createTextView();
                if (i == 1) {
                    this.textViews[i].setAlpha(0.0f);
                    this.textViews[i].setVisibility(8);
                }
                addView(this.textViews[i], LayoutHelper.createFrame(-2, -1.0f));
            }
            this.gradientMatrix = new Matrix();
            Paint paint = new Paint(1);
            this.gradientPaint = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            Paint paint2 = new Paint(1);
            this.erasePaint = paint2;
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        public void lambda$setText$0(int i, ValueAnimator valueAnimator) {
            this.clipProgress[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        public void lambda$setText$1(int i, ValueAnimator valueAnimator) {
            this.clipProgress[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        public abstract TextView createTextView();

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            boolean z;
            TextView[] textViewArr = this.textViews;
            boolean z2 = true;
            int i = view == textViewArr[0] ? 0 : 1;
            if (this.isCenter) {
                this.stableOffest = -1;
            }
            if (this.stableOffest > 0) {
                for (TextView textView : textViewArr) {
                    if ((textView instanceof MarqueeTextView) && ((MarqueeTextView) textView).isNeedMarquee()) {
                        this.stableOffest = -1;
                        break;
                    }
                }
            }
            if (this.stableOffest <= 0 || this.textViews[this.activeIndex].getAlpha() == 1.0f || this.textViews[this.activeIndex].getLayout() == null) {
                z = false;
            } else {
                float primaryHorizontal = this.textViews[this.activeIndex].getLayout().getPrimaryHorizontal(0);
                float primaryHorizontal2 = this.textViews[this.activeIndex].getLayout().getPrimaryHorizontal(this.stableOffest);
                if (primaryHorizontal == primaryHorizontal2) {
                    z2 = false;
                } else if (primaryHorizontal2 > primaryHorizontal) {
                    this.rectF.set(primaryHorizontal, 0.0f, primaryHorizontal2, getMeasuredHeight());
                } else {
                    this.rectF.set(primaryHorizontal2, 0.0f, primaryHorizontal, getMeasuredHeight());
                }
                if (z2 && i == this.activeIndex) {
                    canvas.save();
                    canvas.clipRect(this.rectF);
                    this.textViews[0].draw(canvas);
                    canvas.restore();
                }
                z = z2;
            }
            if (this.clipProgress[i] <= 0.0f && !z) {
                return super.drawChild(canvas, view, j);
            }
            float fMin = Math.min(view.getWidth(), getWidth());
            float fMin2 = Math.min(view.getHeight(), getHeight());
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, fMin, fMin2, null, 31);
            boolean zDrawChild = super.drawChild(canvas, view, j);
            float f = (1.0f - this.clipProgress[i]) * fMin;
            float f2 = f + this.gradientSize;
            this.gradientMatrix.setTranslate(f, 0.0f);
            this.gradientShader.setLocalMatrix(this.gradientMatrix);
            canvas.drawRect(f, 0.0f, f2, fMin2, this.gradientPaint);
            if (fMin > f2) {
                canvas.drawRect(f2, 0.0f, fMin, fMin2, this.erasePaint);
            }
            if (z) {
                canvas.drawRect(this.rectF, this.erasePaint);
            }
            canvas.restoreToCount(iSaveLayer);
            return zDrawChild;
        }

        public int getCustomPaddingRight() {
            return this.rightPadding;
        }

        public TextView getNextTextView() {
            return this.textViews[this.activeIndex == 0 ? (char) 1 : (char) 0];
        }

        public TextView getTextView() {
            return this.textViews[this.activeIndex];
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (!this.isCenter) {
                return;
            }
            int i5 = 0;
            while (true) {
                TextView[] textViewArr = this.textViews;
                if (i5 >= textViewArr.length) {
                    return;
                }
                TextView textView = textViewArr[i5];
                if (textView != null && textView.getMeasuredWidth() < getMeasuredWidth()) {
                    int measuredWidth = (getMeasuredWidth() - textView.getMeasuredWidth()) / 2;
                    textView.layout(measuredWidth, 0, textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight());
                }
                i5++;
            }
        }

        @Override
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            LinearGradient linearGradient = new LinearGradient(this.gradientSize, 0.0f, 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
            this.gradientShader = linearGradient;
            this.gradientPaint.setShader(linearGradient);
        }

        public void setCustomPaddingRight(int i) {
            this.rightPadding = i;
            for (TextView textView : this.textViews) {
                if (textView instanceof MarqueeTextView) {
                    ((MarqueeTextView) textView).setCustomPaddingRight(i);
                }
            }
            invalidate();
        }

        public void setIsCenter() {
            this.isCenter = true;
        }

        public void setText(CharSequence charSequence) {
            setText(charSequence, true);
        }

        public void setText(CharSequence charSequence, boolean z) {
            final int i = 0;
            final int i2 = 1;
            CharSequence text = this.textViews[this.activeIndex].getText();
            if (TextUtils.isEmpty(text) || !z) {
                this.textViews[this.activeIndex].setText(charSequence);
                return;
            }
            if (TextUtils.equals(charSequence, text)) {
                return;
            }
            this.stableOffest = 0;
            int iMin = Math.min(charSequence.length(), text.length());
            for (int i3 = 0; i3 < iMin && charSequence.charAt(i3) == text.charAt(i3); i3++) {
                this.stableOffest++;
            }
            if (this.stableOffest <= 3) {
                this.stableOffest = -1;
            }
            final int i4 = this.activeIndex;
            final int i5 = i4 == 0 ? 1 : 0;
            this.activeIndex = i5;
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            animatorSet2.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ClippingTextViewSwitcher.this.textViews[i4].setVisibility(8);
                }
            });
            this.textViews[i5].setText(charSequence);
            this.textViews[i5].bringToFront();
            this.textViews[i5].setVisibility(0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.clipProgress[i4], 0.75f);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final AudioPlayerAlert.ClippingTextViewSwitcher f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$setText$0(i4, valueAnimator);
                            break;
                        default:
                            this.f$0.lambda$setText$1(i4, valueAnimator);
                            break;
                    }
                }
            });
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.clipProgress[i5], 0.0f);
            valueAnimatorOfFloat2.setStartDelay(100L);
            valueAnimatorOfFloat2.setDuration(200L);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final AudioPlayerAlert.ClippingTextViewSwitcher f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$setText$0(i5, valueAnimator);
                            break;
                        default:
                            this.f$0.lambda$setText$1(i5, valueAnimator);
                            break;
                    }
                }
            });
            Property property = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.textViews[i4], (Property<TextView, Float>) property, 0.0f);
            objectAnimatorOfFloat.setStartDelay(75L);
            objectAnimatorOfFloat.setDuration(150L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.textViews[i5], (Property<TextView, Float>) property, 1.0f);
            objectAnimatorOfFloat2.setStartDelay(75L);
            objectAnimatorOfFloat2.setDuration(150L);
            this.animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, objectAnimatorOfFloat, objectAnimatorOfFloat2);
            this.animatorSet.start();
        }
    }

    public static abstract class CoverContainer extends FrameLayout {
        private int activeIndex;
        private AnimatorSet animatorSet;
        private final BackupImageView[] imageViews;

        public CoverContainer(Context context) {
            super(context);
            this.imageViews = new BackupImageView[2];
            for (int i = 0; i < 2; i++) {
                this.imageViews[i] = new BackupImageView(context);
                this.imageViews[i].getImageReceiver().setDelegate(new AlertsCreator$$ExternalSyntheticLambda139(this, i, 1));
                this.imageViews[i].setRoundRadius(AndroidUtilities.dp(4.0f));
                if (i == 1) {
                    this.imageViews[i].setVisibility(8);
                }
                addView(this.imageViews[i], LayoutHelper.createFrame(-1, -1.0f));
            }
        }

        public void lambda$new$0(int i, ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
            if (i == this.activeIndex) {
                onImageUpdated(imageReceiver);
            }
        }

        public static void lambda$switchImageViews$1(BackupImageView backupImageView, boolean z, ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            backupImageView.setScaleX(fFloatValue);
            backupImageView.setScaleY(fFloatValue);
            if (z) {
                return;
            }
            backupImageView.setAlpha(valueAnimator.getAnimatedFraction());
        }

        public static void lambda$switchImageViews$2(BackupImageView backupImageView, BackupImageView backupImageView2, ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            backupImageView.setScaleX(fFloatValue);
            backupImageView.setScaleY(fFloatValue);
            float animatedFraction = valueAnimator.getAnimatedFraction();
            if (animatedFraction <= 0.25f || backupImageView2.getImageReceiver().hasBitmapImage()) {
                return;
            }
            backupImageView.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
        }

        public final ImageReceiver getImageReceiver() {
            return getImageView().getImageReceiver();
        }

        public final BackupImageView getImageView() {
            return this.imageViews[this.activeIndex];
        }

        public final BackupImageView getNextImageView() {
            return this.imageViews[this.activeIndex == 0 ? (char) 1 : (char) 0];
        }

        public abstract void onImageUpdated(ImageReceiver imageReceiver);

        public final void switchImageViews() {
            int i = 1;
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.animatorSet = new AnimatorSet();
            int i2 = this.activeIndex == 0 ? 1 : 0;
            this.activeIndex = i2;
            BackupImageView[] backupImageViewArr = this.imageViews;
            final BackupImageView backupImageView = backupImageViewArr[i2 ^ 1];
            BackupImageView backupImageView2 = backupImageViewArr[i2];
            boolean zHasBitmapImage = backupImageView.getImageReceiver().hasBitmapImage();
            backupImageView2.setAlpha(zHasBitmapImage ? 1.0f : 0.0f);
            backupImageView2.setScaleX(0.8f);
            backupImageView2.setScaleY(0.8f);
            backupImageView2.setVisibility(0);
            if (zHasBitmapImage) {
                backupImageView.bringToFront();
            } else {
                backupImageView.setVisibility(8);
                backupImageView.setImageDrawable(null);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
            valueAnimatorOfFloat.setDuration(125L);
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            valueAnimatorOfFloat.addUpdateListener(new InstantCameraView$$ExternalSyntheticLambda3(backupImageView2, zHasBitmapImage, i));
            if (zHasBitmapImage) {
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(backupImageView.getScaleX(), 0.8f);
                valueAnimatorOfFloat2.setDuration(125L);
                valueAnimatorOfFloat2.setInterpolator(CubicBezierInterpolator.EASE_IN);
                valueAnimatorOfFloat2.addUpdateListener(new ChatAttachAlert$19$$ExternalSyntheticLambda0(i, backupImageView, backupImageView2));
                valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        backupImageView.setVisibility(8);
                        backupImageView.setImageDrawable(null);
                        backupImageView.setAlpha(1.0f);
                    }
                });
                this.animatorSet.playSequentially(valueAnimatorOfFloat2, valueAnimatorOfFloat);
            } else {
                this.animatorSet.play(valueAnimatorOfFloat);
            }
            this.animatorSet.start();
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;
        private boolean listViewIsVisible;
        private String searchQuery;
        private ArrayList<MessageObject> searchResult = new ArrayList<>();
        private Runnable searchRunnable;

        public ListAdapter(Context context) {
            this.context = context;
        }

        public void lambda$notifyDataSetChanged$0(ValueAnimator valueAnimator) {
            ((BottomSheet) AudioPlayerAlert.this).containerView.invalidate();
        }

        public void lambda$notifyDataSetChanged$1(ValueAnimator valueAnimator) {
            ((BottomSheet) AudioPlayerAlert.this).containerView.invalidate();
        }

        public void lambda$notifyDataSetChanged$2() {
            AudioPlayerAlert.this.listView.setVisibility(8);
        }

        public boolean lambda$onBindViewHolder$3(AudioPlayerCell audioPlayerCell, View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            AudioPlayerAlert.this.itemTouchHelper.startDrag(AudioPlayerAlert.this.listView.getChildViewHolder(audioPlayerCell));
            return false;
        }

        public void lambda$onBindViewHolder$4(AudioPlayerCell audioPlayerCell, MessageObject messageObject, View view) {
            AudioPlayerAlert.this.showOptions(audioPlayerCell, messageObject);
        }

        public void lambda$processSearch$6(String str, ArrayList arrayList) {
            boolean zContains;
            String str2;
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                updateSearchResults(new ArrayList<>(), str);
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
            if (lowerCase.equals(translitString) || translitString.length() == 0) {
                translitString = null;
            }
            int i = (translitString != null ? 1 : 0) + 1;
            String[] strArr = new String[i];
            strArr[0] = lowerCase;
            if (translitString != null) {
                strArr[1] = translitString;
            }
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i2);
                for (int i3 = 0; i3 < i; i3++) {
                    String str3 = strArr[i3];
                    String documentName = messageObject.getDocumentName();
                    if (documentName != null && documentName.length() != 0) {
                        if (documentName.toLowerCase().contains(str3)) {
                            arrayList2.add(messageObject);
                            break;
                        }
                        TLRPC.Document document = messageObject.type == 0 ? messageObject.messageOwner.media.webpage.document : messageObject.messageOwner.media.document;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= document.attributes.size()) {
                                zContains = false;
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i4);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                String str4 = documentAttribute.performer;
                                zContains = str4 != null ? str4.toLowerCase().contains(str3) : false;
                                if (!zContains && (str2 = documentAttribute.title) != null) {
                                    zContains = str2.toLowerCase().contains(str3);
                                    break;
                                } else {
                                    break;
                                    break;
                                }
                            }
                            i4++;
                        }
                        if (zContains) {
                            arrayList2.add(messageObject);
                            break;
                        }
                    }
                }
            }
            updateSearchResults(arrayList2, str);
        }

        public void lambda$processSearch$7(String str) {
            Utilities.searchQueue.postRunnable(new AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda0(this, str, new ArrayList(AudioPlayerAlert.this.playlist)));
        }

        public void lambda$search$5(String str) {
            this.searchRunnable = null;
            processSearch(str);
        }

        public void lambda$updateSearchResults$8(ArrayList arrayList, String str) {
            if (AudioPlayerAlert.this.searching) {
                AudioPlayerAlert.this.searchWas = true;
                this.searchResult = arrayList;
                this.searchQuery = str;
                notifyDataSetChanged();
                AudioPlayerAlert.this.layoutManager.scrollToPosition(0);
                ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(R.string.NoAudioFoundPlayerInfo, new Object[]{str}, AudioPlayerAlert.this.emptySubtitleTextView);
            }
        }

        private void processSearch(String str) {
            AndroidUtilities.runOnUIThread(new AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda4(this, str, 1));
        }

        private void updateSearchResults(ArrayList<MessageObject> arrayList, String str) {
            AndroidUtilities.runOnUIThread(new AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda0(this, arrayList, str));
        }

        @Override
        public int getItemCount() {
            int size;
            int i;
            if (AudioPlayerAlert.this.searchWas) {
                boolean z = AudioPlayerAlert.this.padWithItem;
                size = this.searchResult.size();
                i = z;
            } else {
                if (AudioPlayerAlert.this.playlist.size() <= 1) {
                    return 0;
                }
                boolean z2 = AudioPlayerAlert.this.padWithItem;
                size = AudioPlayerAlert.this.playlist.size();
                i = z2;
            }
            return size + i;
        }

        @Override
        public int getItemViewType(int i) {
            return (AudioPlayerAlert.this.padWithItem && i == 0) ? 1 : 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return (AudioPlayerAlert.this.padWithItem && viewHolder.getAdapterPosition() == 0) ? false : true;
        }

        @Override
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            if ((AudioPlayerAlert.this.playlist.size() > 1) != this.listViewIsVisible) {
                boolean z = AudioPlayerAlert.this.playlist.size() > 1;
                this.listViewIsVisible = z;
                if (z) {
                    AudioPlayerAlert.this.listView.setVisibility(0);
                    AudioPlayerAlert.this.listView.setTranslationY(AndroidUtilities.displaySize.y);
                    final int i = 0;
                    AudioPlayerAlert.this.listView.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final AudioPlayerAlert.ListAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i) {
                                case 0:
                                    this.f$0.lambda$notifyDataSetChanged$0(valueAnimator);
                                    break;
                                default:
                                    this.f$0.lambda$notifyDataSetChanged$1(valueAnimator);
                                    break;
                            }
                        }
                    }).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                } else {
                    final int i2 = 1;
                    AudioPlayerAlert.this.listView.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final AudioPlayerAlert.ListAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i2) {
                                case 0:
                                    this.f$0.lambda$notifyDataSetChanged$0(valueAnimator);
                                    break;
                                default:
                                    this.f$0.lambda$notifyDataSetChanged$1(valueAnimator);
                                    break;
                            }
                        }
                    }).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new Bulletin$2$$ExternalSyntheticLambda1(this, 2)).start();
                }
            }
            if (AudioPlayerAlert.this.playlist.size() > 1) {
                AudioPlayerAlert.this.playerLayout.setBackgroundColor(AudioPlayerAlert.this.getThemedColor(Theme.key_player_background));
                AudioPlayerAlert.this.playerShadow.setVisibility(0);
                AudioPlayerAlert.this.listView.setPadding(0, AudioPlayerAlert.this.listView.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
            } else {
                AudioPlayerAlert.this.playerLayout.setBackgroundColor(AudioPlayerAlert.this.getThemedColor(Theme.key_player_background));
                AudioPlayerAlert.this.playerShadow.setVisibility(0);
                AudioPlayerAlert.this.listView.setPadding(0, AudioPlayerAlert.this.listView.getPaddingTop(), 0, 0);
            }
            AudioPlayerAlert.this.updateEmptyView();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            MessageObject messageObject;
            boolean z;
            if (AudioPlayerAlert.this.padWithItem) {
                if (i == 0) {
                    View view = viewHolder.itemView;
                    return;
                }
                i--;
            }
            AudioPlayerCell audioPlayerCell = (AudioPlayerCell) viewHolder.itemView;
            if (AudioPlayerAlert.this.searchWas) {
                messageObject = this.searchResult.get(i);
                if (i + 1 < this.searchResult.size()) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (AudioPlayerAlert.this.savedMusicList == null ? !SharedConfig.playOrderReversed : SharedConfig.playOrderReversed) {
                messageObject = (MessageObject) AudioPlayerAlert.this.playlist.get((AudioPlayerAlert.this.playlist.size() - i) - 1);
                if ((AudioPlayerAlert.this.playlist.size() - i) - 2 >= 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                messageObject = (MessageObject) AudioPlayerAlert.this.playlist.get(i);
                if (i + 1 < AudioPlayerAlert.this.playlist.size()) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (messageObject != null) {
                messageObject.setQuery(this.searchQuery);
            }
            AlertsCreator$$ExternalSyntheticLambda66 alertsCreator$$ExternalSyntheticLambda66 = AudioPlayerAlert.this.isMyList() ? new AlertsCreator$$ExternalSyntheticLambda66(1, this, audioPlayerCell) : null;
            audioPlayerCell.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, ((BottomSheet) AudioPlayerAlert.this).resourcesProvider));
            boolean zIsMyList = AudioPlayerAlert.this.isMyList();
            EditTextEmoji$$ExternalSyntheticLambda0 editTextEmoji$$ExternalSyntheticLambda0 = (AudioPlayerAlert.this.isMyList() || AudioPlayerAlert.this.noforwards || messageObject.getId() <= 0) ? null : new EditTextEmoji$$ExternalSyntheticLambda0(this, audioPlayerCell, messageObject, 1);
            audioPlayerCell.currentMessageObject = messageObject;
            if (audioPlayerCell.needDivider != z) {
                audioPlayerCell.invalidate();
            }
            audioPlayerCell.needDivider = z;
            ImageView imageView = audioPlayerCell.optionsButton;
            imageView.setImageResource(zIsMyList ? R.drawable.list_reorder : R.drawable.ic_ab_other);
            imageView.setVisibility((zIsMyList || editTextEmoji$$ExternalSyntheticLambda0 != null) ? 0 : 8);
            imageView.setOnClickListener(editTextEmoji$$ExternalSyntheticLambda0);
            imageView.setOnTouchListener(alertsCreator$$ExternalSyntheticLambda66);
            TLRPC.Document document = messageObject.getDocument();
            TLRPC.PhotoSize closestPhotoSizeWithSize = document != null ? FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90) : null;
            boolean z2 = closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize;
            RadialProgress2 radialProgress2 = audioPlayerCell.radialProgress;
            if (z2 || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) {
                radialProgress2.setImageOverlay(closestPhotoSizeWithSize, document, messageObject);
            } else {
                String artworkUrl = messageObject.getArtworkUrl(true);
                if (TextUtils.isEmpty(artworkUrl)) {
                    radialProgress2.setImageOverlay(null, null, null);
                } else {
                    radialProgress2.setImageOverlay(artworkUrl);
                }
            }
            audioPlayerCell.requestLayout();
            audioPlayerCell.updateButtonState(false, false);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                View view = new View(this.context) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
                    }
                };
                view.setTag(-33024);
                return new RecyclerListView.Holder(view);
            }
            Context context = this.context;
            boolean zCurrentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
            return new RecyclerListView.Holder(new AudioPlayerCell(context, zCurrentPlaylistIsGlobalSearch ? 1 : 0, ((BottomSheet) AudioPlayerAlert.this).resourcesProvider));
        }

        public void search(String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            if (str == null) {
                this.searchQuery = null;
                this.searchResult.clear();
                notifyDataSetChanged();
            } else {
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda4 audioPlayerAlert$ListAdapter$$ExternalSyntheticLambda4 = new AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda4(this, str, 0);
                this.searchRunnable = audioPlayerAlert$ListAdapter$$ExternalSyntheticLambda4;
                dispatchQueue.postRunnable(audioPlayerAlert$ListAdapter$$ExternalSyntheticLambda4, 300L);
            }
        }

        public void setup() {
            boolean z = AudioPlayerAlert.this.playlist.size() > 1;
            this.listViewIsVisible = z;
            if (z) {
                AudioPlayerAlert.this.listView.setVisibility(0);
                AudioPlayerAlert.this.listView.setTranslationY(0.0f);
            } else {
                AudioPlayerAlert.this.listView.setVisibility(8);
                AudioPlayerAlert.this.listView.setTranslationY(AndroidUtilities.displaySize.y);
            }
        }
    }

    public AudioPlayerAlert(final Context context, final Theme.ResourcesProvider resourcesProvider) {
        boolean z;
        ActionBarMenu actionBarMenu;
        float f;
        TLRPC.User user;
        super(context, true, false, resourcesProvider);
        int i = 2;
        int i2 = 3;
        int i3 = 1;
        final int i4 = 0;
        this.speedItems = new ActionBarMenuSubItem[6];
        this.buttons = new View[5];
        this.scrollToSong = true;
        this.searchOpenPosition = -1;
        this.scrollOffsetY = Integer.MAX_VALUE;
        this.rewindingProgress = -1.0f;
        this.forwardSeek = new Runnable() {
            @Override
            public void run() {
                long j;
                long duration = MediaController.getInstance().getDuration();
                if (duration == 0 || duration == -9223372036854775807L) {
                    AudioPlayerAlert.this.lastRewindingTime = System.currentTimeMillis();
                    return;
                }
                float f2 = AudioPlayerAlert.this.rewindingProgress;
                long jCurrentTimeMillis = System.currentTimeMillis();
                AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
                long j2 = jCurrentTimeMillis - audioPlayerAlert.lastRewindingTime;
                audioPlayerAlert.lastRewindingTime = jCurrentTimeMillis;
                long j3 = jCurrentTimeMillis - audioPlayerAlert.lastUpdateRewindingPlayerTime;
                int i5 = audioPlayerAlert.rewindingForwardPressedCount;
                if (i5 == 1) {
                    j = 3;
                } else {
                    j = i5 == 2 ? 6L : 12L;
                }
                float f3 = duration;
                float f4 = ((long) ((f2 * f3) + ((j * j2) - j2))) / f3;
                if (f4 < 0.0f) {
                    f4 = 0.0f;
                }
                audioPlayerAlert.rewindingProgress = f4;
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isMusic()) {
                    if (!MediaController.getInstance().isMessagePaused()) {
                        MediaController.getInstance().getPlayingMessageObject().audioProgress = AudioPlayerAlert.this.rewindingProgress;
                    }
                    AudioPlayerAlert.this.updateProgress(playingMessageObject);
                }
                AudioPlayerAlert audioPlayerAlert2 = AudioPlayerAlert.this;
                if (audioPlayerAlert2.rewindingState == 1 && audioPlayerAlert2.rewindingForwardPressedCount > 0 && MediaController.getInstance().isMessagePaused()) {
                    if (j3 > 200 || AudioPlayerAlert.this.rewindingProgress == 0.0f) {
                        AudioPlayerAlert.this.lastUpdateRewindingPlayerTime = jCurrentTimeMillis;
                        MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f4);
                    }
                    AudioPlayerAlert audioPlayerAlert3 = AudioPlayerAlert.this;
                    if (audioPlayerAlert3.rewindingForwardPressedCount <= 0 || audioPlayerAlert3.rewindingProgress <= 0.0f) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(audioPlayerAlert3.forwardSeek, 16L);
                }
            }
        };
        this.actionBarSlideProperty = new AnimationProperties.FloatProperty<ActionBar>("actionBarSlide") {
            @Override
            public Float get(ActionBar actionBar) {
                return Float.valueOf(AudioPlayerAlert.this.actionBarSlide);
            }

            @Override
            public void setValue(ActionBar actionBar, float f2) {
                AudioPlayerAlert.this.actionBarSlide = f2;
                SimpleTextView titleTextView = actionBar.getTitleTextView();
                ImageView backButton = actionBar.getBackButton();
                float f3 = 1.0f - f2;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f3);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f3);
                if (AudioPlayerAlert.this.searchItem != null && AudioPlayerAlert.this.searchItem.getSearchContainer() != null) {
                    AudioPlayerAlert.this.searchItem.getSearchContainer().setClipChildren(false);
                    AudioPlayerAlert.this.searchItem.getSearchContainer().setClipToPadding(false);
                    AudioPlayerAlert.this.searchItem.getSearchContainer().setPadding(0, 0, AndroidUtilities.dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f), 0);
                    AudioPlayerAlert.this.searchItem.getSearchContainer().setTranslationX((AndroidUtilities.dp(-52.0f) * f3) + AndroidUtilities.dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f));
                    if (AudioPlayerAlert.this.searchItem.getSearchClearButton() != null) {
                        AudioPlayerAlert.this.searchItem.getSearchClearButton().setTranslationX(AndroidUtilities.dp(52.0f) * f3);
                    }
                }
                backButton.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f2));
                backButton.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f2));
                backButton.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f2));
                ((BottomSheet) AudioPlayerAlert.this).containerView.invalidate();
            }
        };
        this.doNotOverlayNavigationBar = true;
        fixNavigationBar();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            this.currentAccount = playingMessageObject.currentAccount;
        } else {
            this.currentAccount = UserConfig.selectedAccount;
        }
        this.parentActivity = (LaunchActivity) context;
        this.TAG = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.musicDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.moreMusicDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.musicIdsLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.messagePlayingSpeedChanged);
        FrameLayout frameLayout = new FrameLayout(context) {
            private int lastMeasturedHeight;
            private int lastMeasturedWidth;
            private RectF rect = new RectF();
            private boolean ignoreLayout = false;

            @Override
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                Bulletin.addDelegate(this, new Bulletin.Delegate() {
                    @Override
                    public final boolean allowLayoutChanges() {
                        return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
                    }

                    @Override
                    public final boolean bottomOffsetAnimated() {
                        return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
                    }

                    @Override
                    public final boolean clipWithGradient(int i5) {
                        return Bulletin.Delegate.CC.$default$clipWithGradient(this, i5);
                    }

                    @Override
                    public int getBottomOffset(int i5) {
                        return AudioPlayerAlert.this.playerLayout.getHeight();
                    }

                    @Override
                    public final int getLeftPadding() {
                        return Bulletin.Delegate.CC.$default$getLeftPadding(this);
                    }

                    @Override
                    public final int getRightPadding() {
                        return Bulletin.Delegate.CC.$default$getRightPadding(this);
                    }

                    @Override
                    public final int getTopOffset(int i5) {
                        return Bulletin.Delegate.CC.$default$getTopOffset(this, i5);
                    }

                    @Override
                    public final void onBottomOffsetChange(float f2) {
                        Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f2);
                    }

                    @Override
                    public final void onHide(Bulletin bulletin) {
                        Bulletin.Delegate.CC.$default$onHide(this, bulletin);
                    }

                    @Override
                    public final void onShow(Bulletin bulletin) {
                        Bulletin.Delegate.CC.$default$onShow(this, bulletin);
                    }
                });
            }

            @Override
            public void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                Bulletin.removeDelegate(this);
            }

            @Override
            public void onDraw(Canvas canvas) {
                float f2;
                float fMin;
                if (AudioPlayerAlert.this.playlist.size() <= 1) {
                    ((BottomSheet) AudioPlayerAlert.this).shadowDrawable.setBounds(0, (getMeasuredHeight() - AudioPlayerAlert.this.playerLayout.getMeasuredHeight()) - ((BottomSheet) AudioPlayerAlert.this).backgroundPaddingTop, getMeasuredWidth(), getMeasuredHeight());
                    ((BottomSheet) AudioPlayerAlert.this).shadowDrawable.draw(canvas);
                    if (AudioPlayerAlert.this.isProfilePlaylist) {
                        AudioPlayerAlert.this.actionBar.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (AudioPlayerAlert.this.listView.getVisibility() != 0) {
                    return;
                }
                int iDp = AndroidUtilities.dp(13.0f);
                int translationY = (int) (AudioPlayerAlert.this.listView.getTranslationY() + ((AudioPlayerAlert.this.scrollOffsetY - ((BottomSheet) AudioPlayerAlert.this).backgroundPaddingTop) - iDp));
                if (AudioPlayerAlert.this.isProfilePlaylist) {
                    translationY = (translationY - ActionBar.getCurrentActionBarHeight()) + AndroidUtilities.dp(10.0f);
                }
                int iDp2 = AndroidUtilities.dp(20.0f) + translationY;
                int iDp3 = ((BottomSheet) AudioPlayerAlert.this).backgroundPaddingTop + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (AudioPlayerAlert.this.isProfilePlaylist || ((BottomSheet) AudioPlayerAlert.this).backgroundPaddingTop + translationY >= ActionBar.getCurrentActionBarHeight()) {
                    f2 = 1.0f;
                    fMin = 0.0f;
                } else {
                    float fDp = AndroidUtilities.dp(4.0f) + iDp;
                    fMin = Math.min(1.0f, ((ActionBar.getCurrentActionBarHeight() - translationY) - ((BottomSheet) AudioPlayerAlert.this).backgroundPaddingTop) / fDp);
                    int currentActionBarHeight = (int) ((ActionBar.getCurrentActionBarHeight() - fDp) * fMin);
                    translationY -= currentActionBarHeight;
                    iDp2 -= currentActionBarHeight;
                    iDp3 += currentActionBarHeight;
                    f2 = 1.0f - fMin;
                }
                int i5 = (int) ((1.0f - fMin) * AndroidUtilities.statusBarHeight);
                int i6 = translationY + i5;
                int i7 = iDp2 + i5;
                ((BottomSheet) AudioPlayerAlert.this).shadowDrawable.setBounds(0, i6, getMeasuredWidth(), iDp3);
                ((BottomSheet) AudioPlayerAlert.this).shadowDrawable.draw(canvas);
                if (!AudioPlayerAlert.this.isProfilePlaylist && f2 != 1.0f) {
                    Theme.dialogs_onlineCirclePaint.setColor(AudioPlayerAlert.this.getThemedColor(Theme.key_dialogBackground));
                    this.rect.set(((BottomSheet) AudioPlayerAlert.this).backgroundPaddingLeft, ((BottomSheet) AudioPlayerAlert.this).backgroundPaddingTop + i6, getMeasuredWidth() - ((BottomSheet) AudioPlayerAlert.this).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) AudioPlayerAlert.this).backgroundPaddingTop + i6);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(12.0f) * f2, AndroidUtilities.dp(12.0f) * f2, Theme.dialogs_onlineCirclePaint);
                }
                if (!AudioPlayerAlert.this.isProfilePlaylist && f2 != 0.0f) {
                    int iDp4 = AndroidUtilities.dp(36.0f);
                    this.rect.set((getMeasuredWidth() - iDp4) / 2, i7, (getMeasuredWidth() + iDp4) / 2, AndroidUtilities.dp(4.0f) + i7);
                    int themedColor = AudioPlayerAlert.this.getThemedColor(Theme.key_sheet_scrollUp);
                    int iAlpha = Color.alpha(themedColor);
                    Theme.dialogs_onlineCirclePaint.setColor(themedColor);
                    Theme.dialogs_onlineCirclePaint.setAlpha((int) (iAlpha * 1.0f * f2));
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                }
                if (AudioPlayerAlert.this.isProfilePlaylist) {
                    AudioPlayerAlert.this.actionBar.setVisibility(0);
                    AudioPlayerAlert.this.actionBar.setTranslationY(Math.max(0.0f, (((1.0f - AudioPlayerAlert.this.actionBarSlide) * AndroidUtilities.dp(6.0f)) + ((i6 - ((BottomSheet) AudioPlayerAlert.this).backgroundPaddingTop) - AndroidUtilities.dp(10.0f))) - AudioPlayerAlert.this.actionBar.getTop()));
                    AudioPlayerAlert.this.actionBarShadow.setTranslationY(Math.max(0.0f, (((1.0f - AudioPlayerAlert.this.actionBarSlide) * AndroidUtilities.dp(6.0f)) + ((i6 - ((BottomSheet) AudioPlayerAlert.this).backgroundPaddingTop) - AndroidUtilities.dp(10.0f))) - AudioPlayerAlert.this.actionBar.getTop()));
                }
            }

            @Override
            public boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AudioPlayerAlert.AnonymousClass2.onInterceptTouchEvent(android.view.MotionEvent):boolean");
            }

            @Override
            public void onLayout(boolean z2, int i5, int i6, int i7, int i8) {
                super.onLayout(z2, i5, i6, i7, i8);
                AudioPlayerAlert.this.updateLayout();
                AudioPlayerAlert.this.updateEmptyViewPosition();
            }

            @Override
            public void onMeasure(int i5, int i6) {
                int iDp;
                int size = View.MeasureSpec.getSize(i6);
                int size2 = View.MeasureSpec.getSize(i5);
                if (size != this.lastMeasturedHeight || size2 != this.lastMeasturedWidth) {
                    if (AudioPlayerAlert.this.blurredView.getTag() != null) {
                        AudioPlayerAlert.this.showAlbumCover(false, false);
                    }
                    this.lastMeasturedWidth = size2;
                    this.lastMeasturedHeight = size;
                }
                this.ignoreLayout = true;
                AudioPlayerAlert.this.playerLayout.setVisibility((AudioPlayerAlert.this.searchWas || ((BottomSheet) AudioPlayerAlert.this).keyboardVisible) ? 4 : 0);
                AudioPlayerAlert.this.playerShadow.setVisibility(AudioPlayerAlert.this.playerLayout.getVisibility());
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) AudioPlayerAlert.this.listView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                ((FrameLayout.LayoutParams) AudioPlayerAlert.this.actionBarShadow.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                ((FrameLayout.LayoutParams) AudioPlayerAlert.this.blurredView.getLayoutParams()).topMargin = -getPaddingTop();
                int iDp2 = AndroidUtilities.dp(179 + ((AudioPlayerAlert.this.isMyList() || AudioPlayerAlert.this.noforwards) ? 0 : 52));
                if (AudioPlayerAlert.this.playlist.size() > 1) {
                    iDp2 += (AndroidUtilities.dp(56.0f) * AudioPlayerAlert.this.playlist.size()) + ((BottomSheet) AudioPlayerAlert.this).backgroundPaddingTop;
                }
                if (AudioPlayerAlert.this.searching || ((BottomSheet) AudioPlayerAlert.this).keyboardVisible) {
                    iDp = AndroidUtilities.dp(8.0f);
                } else {
                    if (iDp2 >= paddingTop) {
                        iDp2 = (int) ((paddingTop / 5) * 3.5f);
                    }
                    iDp = AndroidUtilities.dp(8.0f) + (paddingTop - iDp2);
                    if (iDp > paddingTop - AndroidUtilities.dp(((AudioPlayerAlert.this.isMyList() || AudioPlayerAlert.this.noforwards) ? 0 : 52) + 329)) {
                        iDp = paddingTop - AndroidUtilities.dp(((AudioPlayerAlert.this.isMyList() || AudioPlayerAlert.this.noforwards) ? 0 : 52) + 329);
                    }
                    if (iDp < 0) {
                        iDp = 0;
                    }
                }
                if (AudioPlayerAlert.this.padWithItem) {
                    iDp = 0;
                }
                if (AudioPlayerAlert.this.listView.getPaddingTop() != iDp) {
                    AudioPlayerAlert.this.listView.setPadding(0, iDp, 0, (AudioPlayerAlert.this.searching && ((BottomSheet) AudioPlayerAlert.this).keyboardVisible) ? 0 : AudioPlayerAlert.this.listView.getPaddingBottom());
                }
                this.ignoreLayout = false;
                super.onMeasure(i5, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                AudioPlayerAlert.this.inFullSize = getMeasuredHeight() >= size;
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !AudioPlayerAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.containerView = frameLayout;
        frameLayout.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i5 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i5, 0, i5, 0);
        ActionBar actionBar = new ActionBar(context, resourcesProvider) {
            @Override
            public void onFactorChangeFinished(int i6, float f2, FactorAnimator factorAnimator) {
            }

            @Override
            public void setAlpha(float f2) {
                super.setAlpha(f2);
                ((BottomSheet) AudioPlayerAlert.this).containerView.invalidate();
            }
        };
        this.actionBar = actionBar;
        actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ActionBar actionBar2 = this.actionBar;
        int i6 = Theme.key_player_actionBarTitle;
        actionBar2.setItemsColor(getThemedColor(i6), false);
        this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_player_actionBarSelector), false);
        this.actionBar.setTitleColor(getThemedColor(i6));
        this.actionBar.setSubtitleColor(getThemedColor(Theme.key_player_actionBarSubtitle));
        this.actionBar.setOccupyStatusBar(true);
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        actionBarMenuCreateMenu.setLayoutParams(LayoutHelper.createFrame(-1, -1, 119));
        View view = new View(context);
        this.actionBarBackground = view;
        view.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
        this.actionBar.addView(this.actionBarBackground, 0, LayoutHelper.createFrame(-1, -1, 119));
        this.actionBarBackground.setAlpha(0.0f);
        this.actionBar.setAlpha(0.0f);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i7) {
                if (i7 == -1) {
                    AudioPlayerAlert.this.lambda$showGiftOfferSheet$15();
                } else {
                    AudioPlayerAlert.this.onSubItemClick(i7);
                }
            }
        });
        View view2 = new View(context);
        this.actionBarShadow = view2;
        view2.setAlpha(0.0f);
        this.actionBarShadow.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(context);
        this.playerShadow = view3;
        view3.setBackgroundColor(getThemedColor(Theme.key_dialogShadowLine));
        this.playerLayout = new FrameLayout(context) {
            @Override
            public void onLayout(boolean z2, int i7, int i8, int i9, int i10) {
                super.onLayout(z2, i7, i8, i9, i10);
                if (AudioPlayerAlert.this.playbackSpeedButton == null || AudioPlayerAlert.this.durationTextView == null) {
                    return;
                }
                int left = (AudioPlayerAlert.this.durationTextView.getLeft() - AndroidUtilities.dp(4.0f)) - AudioPlayerAlert.this.playbackSpeedButton.getMeasuredWidth();
                AudioPlayerAlert.this.playbackSpeedButton.layout(left, AudioPlayerAlert.this.playbackSpeedButton.getTop(), AudioPlayerAlert.this.playbackSpeedButton.getMeasuredWidth() + left, AudioPlayerAlert.this.playbackSpeedButton.getBottom());
            }
        };
        CoverContainer coverContainer = new CoverContainer(context) {
            private long pressTime;

            @Override
            public void onImageUpdated(ImageReceiver imageReceiver) {
                Bitmap bitmap = imageReceiver.getBitmap();
                AudioPlayerAlert.this.setCustomPaddingRight(((bitmap == null || !imageReceiver.hasImageLoaded()) && !imageReceiver.hasBitmapImage()) ? 0 : AndroidUtilities.dp(64.0f), true);
                if (AudioPlayerAlert.this.blurredView.getTag() != null) {
                    AudioPlayerAlert.this.bigAlbumConver.setImageBitmap(bitmap);
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    if (getImageReceiver().hasBitmapImage()) {
                        AudioPlayerAlert.this.showAlbumCover(true, true);
                        this.pressTime = SystemClock.elapsedRealtime();
                    }
                } else if (action != 2 && SystemClock.elapsedRealtime() - this.pressTime >= 400) {
                    AudioPlayerAlert.this.showAlbumCover(false, true);
                }
                return true;
            }
        };
        this.coverContainer = coverContainer;
        this.playerLayout.addView(coverContainer, LayoutHelper.createFrame(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        ClippingTextViewSwitcher clippingTextViewSwitcher = new ClippingTextViewSwitcher(context) {
            @Override
            public TextView createTextView() {
                MarqueeTextView marqueeTextView = new MarqueeTextView(context);
                marqueeTextView.setTextColor(AudioPlayerAlert.this.getThemedColor(Theme.key_player_actionBarTitle));
                marqueeTextView.setTextSize(1, 17.0f);
                marqueeTextView.setTypeface(AndroidUtilities.bold());
                marqueeTextView.setEllipsize(TextUtils.TruncateAt.END);
                marqueeTextView.setSingleLine(true);
                return marqueeTextView;
            }
        };
        this.titleTextView = clippingTextViewSwitcher;
        this.playerLayout.addView(clippingTextViewSwitcher, LayoutHelper.createFrame(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(context, context);
        this.authorTextView = anonymousClass8;
        this.playerLayout.addView(anonymousClass8, LayoutHelper.createFrame(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        SeekBarView seekBarView = new SeekBarView(context, resourcesProvider) {
            @Override
            public boolean onTouch(MotionEvent motionEvent) {
                if (AudioPlayerAlert.this.rewindingState != 0) {
                    return false;
                }
                return super.onTouch(motionEvent);
            }
        };
        this.seekBarView = seekBarView;
        seekBarView.setLineWidth(4);
        this.seekBarView.setDelegate(new SeekBarView.SeekBarViewDelegate() {
            @Override
            public CharSequence getContentDescription() {
                return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, LocaleController.formatPluralString("Minutes", AudioPlayerAlert.this.lastTime / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", AudioPlayerAlert.this.lastTime % 60, new Object[0]), LocaleController.formatPluralString("Minutes", AudioPlayerAlert.this.lastDuration / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", AudioPlayerAlert.this.lastDuration % 60, new Object[0]));
            }

            @Override
            public final int getStepsCount() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
            }

            @Override
            public final boolean needVisuallyDivideSteps() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$needVisuallyDivideSteps(this);
            }

            @Override
            public void onSeekBarDrag(boolean z2, float f2) {
                if (z2) {
                    MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f2);
                }
                MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject2 == null || !playingMessageObject2.isMusic()) {
                    return;
                }
                AudioPlayerAlert.this.updateProgress(playingMessageObject2);
            }

            @Override
            public void onSeekBarPressed(boolean z2) {
                AudioPlayerAlert.this.draggingSeekBar = z2;
            }
        });
        this.seekBarView.setReportChanges(true);
        this.playerLayout.addView(this.seekBarView, LayoutHelper.createFrame(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        SpringAnimation springAnimation = new SpringAnimation(new FloatValueHolder(0.0f));
        SpringForce springForce = new SpringForce();
        springForce.setStiffness(750.0f);
        springForce.setDampingRatio(1.0f);
        springAnimation.mSpring = springForce;
        springAnimation.addUpdateListener(new Bulletin$$ExternalSyntheticLambda2(this, i2));
        this.seekBarBufferSpring = springAnimation;
        LineProgressView lineProgressView = new LineProgressView(context);
        this.progressView = lineProgressView;
        lineProgressView.setVisibility(4);
        this.progressView.setBackgroundColor(getThemedColor(Theme.key_player_progressBackground));
        this.progressView.setProgressColor(getThemedColor(Theme.key_player_progress));
        this.playerLayout.addView(this.progressView, LayoutHelper.createFrame(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.timeTextView = simpleTextView;
        simpleTextView.setTextSize(12);
        this.timeTextView.setText("0:00");
        SimpleTextView simpleTextView2 = this.timeTextView;
        int i7 = Theme.key_player_time;
        simpleTextView2.setTextColor(getThemedColor(i7));
        this.timeTextView.setImportantForAccessibility(2);
        this.playerLayout.addView(this.timeTextView, LayoutHelper.createFrame(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.durationTextView = textView;
        textView.setTextSize(1, 12.0f);
        this.durationTextView.setTextColor(getThemedColor(i7));
        this.durationTextView.setGravity(17);
        this.durationTextView.setImportantForAccessibility(2);
        this.playerLayout.addView(this.durationTextView, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 0, getThemedColor(i7), false, resourcesProvider);
        this.playbackSpeedButton = actionBarMenuItem;
        actionBarMenuItem.setLongClickEnabled(false);
        this.playbackSpeedButton.setShowSubmenuByMove(false);
        this.playbackSpeedButton.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        this.playbackSpeedButton.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.playbackSpeedButton.setDelegate(new AudioPlayerAlert$$ExternalSyntheticLambda36(this, i3));
        ActionBarMenuItem actionBarMenuItem2 = this.playbackSpeedButton;
        SpeedIconDrawable speedIconDrawable = new SpeedIconDrawable(true);
        this.speedIcon = speedIconDrawable;
        actionBarMenuItem2.setIcon(speedIconDrawable);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        ActionBarMenuSlider.SpeedSlider speedSlider = new ActionBarMenuSlider.SpeedSlider(getContext(), resourcesProvider);
        this.speedSlider = speedSlider;
        speedSlider.setRoundRadiusDp(6.0f);
        this.speedSlider.setDrawShadow(true);
        this.speedSlider.setOnValueChange(new AudioPlayerAlert$$ExternalSyntheticLambda24(this, i3));
        this.speedItems[0] = this.playbackSpeedButton.addSubItem(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        this.speedItems[1] = this.playbackSpeedButton.addSubItem(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        this.speedItems[2] = this.playbackSpeedButton.addSubItem(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        this.speedItems[3] = this.playbackSpeedButton.addSubItem(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        this.speedItems[4] = this.playbackSpeedButton.addSubItem(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        this.speedItems[5] = this.playbackSpeedButton.addSubItem(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            this.playbackSpeedButton.setPadding(0, 1, 0, 0);
        }
        this.playbackSpeedButton.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        this.playbackSpeedButton.setAdditionalYOffset(-AndroidUtilities.dp(400.0f));
        this.playbackSpeedButton.setShowedFromBottom(true);
        this.playerLayout.addView(this.playbackSpeedButton, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        this.playbackSpeedButton.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(14, this, fArr));
        this.playbackSpeedButton.setOnLongClickListener(new AudioPlayerAlert$$ExternalSyntheticLambda42(this, resourcesProvider, i4));
        updatePlaybackButton(false);
        FrameLayout frameLayout2 = new FrameLayout(context) {
            @Override
            public void onLayout(boolean z2, int i8, int i9, int i10, int i11) {
                int iM$2 = OKLCH.m$2(248.0f, i10 - i8, 4);
                for (int i12 = 0; i12 < 5; i12++) {
                    int iDp = (iM$2 * i12) + AndroidUtilities.dp((i12 * 48) + 4);
                    int iDp2 = AndroidUtilities.dp(9.0f);
                    AudioPlayerAlert.this.buttons[i12].layout(iDp, iDp2, AudioPlayerAlert.this.buttons[i12].getMeasuredWidth() + iDp, AudioPlayerAlert.this.buttons[i12].getMeasuredHeight() + iDp2);
                }
            }
        };
        this.playerLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        View[] viewArr = this.buttons;
        ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(context, null, 0, 0, false, resourcesProvider);
        this.repeatButton = actionBarMenuItem3;
        viewArr[0] = actionBarMenuItem3;
        actionBarMenuItem3.setLongClickEnabled(false);
        this.repeatButton.setShowSubmenuByMove(false);
        this.repeatButton.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        ActionBarMenuItem actionBarMenuItem4 = this.repeatButton;
        int i8 = Theme.key_listSelector;
        actionBarMenuItem4.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i8), 1, AndroidUtilities.dp(18.0f)));
        frameLayout2.addView(this.repeatButton, LayoutHelper.createFrame(48, 48, 51));
        this.repeatButton.setOnClickListener(new View.OnClickListener(this) {
            public final AudioPlayerAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$new$5(view4);
                        break;
                    default:
                        this.f$0.showMenuOptions(view4);
                        break;
                }
            }
        });
        this.repeatSongItem = this.repeatButton.addSubItem(3, R.drawable.player_new_repeatone, LocaleController.getString(R.string.RepeatSong));
        this.repeatListItem = this.repeatButton.addSubItem(4, R.drawable.player_new_repeatall, LocaleController.getString(R.string.RepeatList));
        this.repeatButton.addColoredGap().getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.shuffleListItem = this.repeatButton.addSubItem(2, R.drawable.player_new_shuffle, LocaleController.getString(R.string.ShuffleList));
        this.repeatButton.addColoredGap().getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.reverseOrderItem = this.repeatButton.addSubItem(1, R.drawable.player_new_order, LocaleController.getString(R.string.ReverseOrder));
        this.repeatButton.setShowedFromBottom(true);
        this.repeatButton.setDelegate(new AudioPlayerAlert$$ExternalSyntheticLambda36(this, i));
        int i9 = Theme.key_player_button;
        int themedColor = getThemedColor(i9);
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        View[] viewArr2 = this.buttons;
        AnonymousClass12 anonymousClass12 = new AnonymousClass12(context, scaledTouchSlop);
        this.prevButton = anonymousClass12;
        viewArr2[1] = anonymousClass12;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        anonymousClass12.setScaleType(scaleType);
        RLottieImageView rLottieImageView = this.prevButton;
        int i10 = R.raw.player_prev;
        rLottieImageView.setAnimation(i10, 20, 20);
        this.prevButton.setLayerColor("Triangle 3", themedColor);
        this.prevButton.setLayerColor("Triangle 4", themedColor);
        this.prevButton.setLayerColor("Rectangle 4", themedColor);
        this.prevButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i8), 1, AndroidUtilities.dp(22.0f)));
        frameLayout2.addView(this.prevButton, LayoutHelper.createFrame(48, 48, 51));
        this.prevButton.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        View[] viewArr3 = this.buttons;
        ImageView imageView = new ImageView(context);
        this.playButton = imageView;
        viewArr3[2] = imageView;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.playButton;
        PlayPauseDrawable playPauseDrawable = new PlayPauseDrawable(28);
        this.playPauseDrawable = playPauseDrawable;
        imageView2.setImageDrawable(playPauseDrawable);
        this.playPauseDrawable.setPause(!MediaController.getInstance().isMessagePaused(), false);
        this.playButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i9), PorterDuff.Mode.MULTIPLY));
        this.playButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i8), 1, AndroidUtilities.dp(24.0f)));
        frameLayout2.addView(this.playButton, LayoutHelper.createFrame(48, 48, 51));
        this.playButton.setOnClickListener(new ColorPicker$$ExternalSyntheticLambda4(1));
        View[] viewArr4 = this.buttons;
        AnonymousClass13 anonymousClass13 = new AnonymousClass13(context, scaledTouchSlop);
        this.nextButton = anonymousClass13;
        viewArr4[3] = anonymousClass13;
        anonymousClass13.setScaleType(scaleType);
        this.nextButton.setAnimation(i10, 20, 20);
        this.nextButton.setLayerColor("Triangle 3", themedColor);
        this.nextButton.setLayerColor("Triangle 4", themedColor);
        this.nextButton.setLayerColor("Rectangle 4", themedColor);
        this.nextButton.setRotation(180.0f);
        this.nextButton.setBackground(Theme.createSelectorDrawable(getThemedColor(i8), 1, AndroidUtilities.dp(22.0f)));
        frameLayout2.addView(this.nextButton, LayoutHelper.createFrame(48, 48, 51));
        this.nextButton.setContentDescription(LocaleController.getString(R.string.Next));
        View[] viewArr5 = this.buttons;
        ActionBarMenuItem actionBarMenuItem5 = new ActionBarMenuItem(context, null, 0, themedColor, false, resourcesProvider);
        this.optionsButton = actionBarMenuItem5;
        viewArr5[4] = actionBarMenuItem5;
        ChooseQualityLayout.QualityIcon qualityIcon = new ChooseQualityLayout.QualityIcon(context, R.drawable.ic_ab_other, resourcesProvider);
        this.optionsIcon = qualityIcon;
        actionBarMenuItem5.setIcon(qualityIcon);
        this.optionsButton.setLongClickEnabled(false);
        this.optionsButton.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        final int i11 = 1;
        this.optionsButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i8), 1, AndroidUtilities.dp(18.0f)));
        this.optionsButton.setOnClickListener(new View.OnClickListener(this) {
            public final AudioPlayerAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i11) {
                    case 0:
                        this.f$0.lambda$new$5(view4);
                        break;
                    default:
                        this.f$0.showMenuOptions(view4);
                        break;
                }
            }
        });
        frameLayout2.addView(this.optionsButton, LayoutHelper.createFrame(48, 48, 51));
        CastMediaRouteButton castMediaRouteButton = new CastMediaRouteButton(context) {
            @Override
            public void stateUpdated(boolean z2) {
                AudioPlayerAlert.this.updateColors();
                if (AudioPlayerAlert.this.optionsIcon != null) {
                    AudioPlayerAlert.this.optionsIcon.setCasting(CastSync.isActive(), true);
                }
            }
        };
        this.castItemButton = castMediaRouteButton;
        this.castAvailable = true;
        try {
            castMediaRouteButton.setRouteSelector(CastContext.getSharedInstance(context).getMergedSelector());
        } catch (Exception e) {
            FileLog.e(e);
            this.castAvailable = false;
        }
        this.castItemButton.setVisibility(4);
        ChooseQualityLayout.QualityIcon qualityIcon2 = this.optionsIcon;
        if (qualityIcon2 != null) {
            z = true;
            qualityIcon2.setCasting(CastSync.isActive(), true);
        } else {
            z = true;
        }
        this.optionsButton.setShowedFromBottom(z);
        this.optionsButton.setDelegate(new AudioPlayerAlert$$ExternalSyntheticLambda36(this, 3));
        this.optionsButton.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(context);
        this.emptyView = linearLayout;
        linearLayout.setOrientation(1);
        this.emptyView.setGravity(17);
        this.emptyView.setVisibility(8);
        this.containerView.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        this.emptyView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(16));
        ImageView imageView3 = new ImageView(context);
        this.emptyImageView = imageView3;
        imageView3.setImageResource(R.drawable.music_empty);
        this.emptyImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogEmptyImage), PorterDuff.Mode.MULTIPLY));
        this.emptyView.addView(this.emptyImageView, LayoutHelper.createLinear(-2, -2));
        TextView textView2 = new TextView(context);
        this.emptyTitleTextView = textView2;
        int i12 = Theme.key_dialogEmptyText;
        textView2.setTextColor(getThemedColor(i12));
        this.emptyTitleTextView.setGravity(17);
        this.emptyTitleTextView.setText(LocaleController.getString(R.string.NoAudioFound));
        this.emptyTitleTextView.setTypeface(AndroidUtilities.bold());
        this.emptyTitleTextView.setTextSize(1, 17.0f);
        this.emptyTitleTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        TextView textViewM = zzkc.m(this.emptyView, this.emptyTitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 11, 0, 0), context);
        this.emptySubtitleTextView = textViewM;
        textViewM.setTextColor(getThemedColor(i12));
        this.emptySubtitleTextView.setGravity(17);
        this.emptySubtitleTextView.setTextSize(1, 15.0f);
        this.emptySubtitleTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.emptyView.addView(this.emptySubtitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 6, 0, 0));
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            boolean ignoreLayout;

            @Override
            public boolean allowSelectChildAtPosition(float f2, float f3) {
                return f3 < AudioPlayerAlert.this.playerLayout.getY() - ((float) AudioPlayerAlert.this.listView.getTop());
            }

            @Override
            public void onLayout(boolean z2, int i13, int i14, int i15, int i16) {
                super.onLayout(z2, i13, i14, i15, i16);
                if (AudioPlayerAlert.this.searchOpenPosition != -1 && !AudioPlayerAlert.this.actionBar.isSearchFieldVisible()) {
                    this.ignoreLayout = true;
                    AudioPlayerAlert.this.layoutManager.scrollToPositionWithOffset(AudioPlayerAlert.this.searchOpenPosition, AudioPlayerAlert.this.searchOpenOffset - AudioPlayerAlert.this.listView.getPaddingTop());
                    super.onLayout(false, i13, i14, i15, i16);
                    this.ignoreLayout = false;
                    AudioPlayerAlert.this.searchOpenPosition = -1;
                    return;
                }
                if (AudioPlayerAlert.this.scrollToSong) {
                    AudioPlayerAlert.this.scrollToSong = false;
                    this.ignoreLayout = true;
                    if (AudioPlayerAlert.this.scrollToCurrentSong(true)) {
                        super.onLayout(false, i13, i14, i15, i16);
                    }
                    this.ignoreLayout = false;
                }
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setClipToPadding(false);
        RecyclerListView recyclerListView2 = this.listView;
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        this.listView.setHorizontalScrollBarEnabled(false);
        this.listView.setVerticalScrollBarEnabled(false);
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        RecyclerListView recyclerListView3 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listAdapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        this.listView.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        int i13 = 0;
        this.listView.setOnItemClickListener(new AudioPlayerAlert$$ExternalSyntheticLambda35(i13));
        this.listView.setOnItemLongClickListener(new AudioPlayerAlert$$ExternalSyntheticLambda36(this, i13));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i14) {
                RecyclerListView.Holder holder;
                if (i14 != 0) {
                    if (i14 == 1) {
                        AndroidUtilities.hideKeyboard(AudioPlayerAlert.this.getCurrentFocus());
                    }
                } else {
                    if (((BottomSheet) AudioPlayerAlert.this).backgroundPaddingTop + ((AudioPlayerAlert.this.scrollOffsetY - ((BottomSheet) AudioPlayerAlert.this).backgroundPaddingTop) - AndroidUtilities.dp(13.0f)) >= ActionBar.getCurrentActionBarHeight() || !AudioPlayerAlert.this.listView.canScrollVertically(1) || (holder = (RecyclerListView.Holder) AudioPlayerAlert.this.listView.findViewHolderForAdapterPosition(AudioPlayerAlert.this.padWithItem ? 1 : 0)) == null || holder.itemView.getTop() <= AndroidUtilities.dp(7.0f)) {
                        return;
                    }
                    AudioPlayerAlert.this.listView.smoothScrollBy(0, holder.itemView.getTop() - AndroidUtilities.dp(7.0f));
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i14, int i15) {
                AudioPlayerAlert.this.updateLayout();
                AudioPlayerAlert.this.updateEmptyViewPosition();
                if (AudioPlayerAlert.this.searchWas) {
                    return;
                }
                int iFindFirstVisibleItemPosition = AudioPlayerAlert.this.layoutManager.findFirstVisibleItemPosition();
                if (AudioPlayerAlert.this.padWithItem) {
                    iFindFirstVisibleItemPosition = Math.max(0, iFindFirstVisibleItemPosition - 1);
                }
                int iAbs = iFindFirstVisibleItemPosition != -1 ? Math.abs(AudioPlayerAlert.this.layoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1 : 0;
                int itemCount = recyclerView.getAdapter().getItemCount();
                MediaController.getInstance().getPlayingMessageObject();
                if (SharedConfig.playOrderReversed) {
                    if (iFindFirstVisibleItemPosition < 10) {
                        MediaController.getInstance().loadMoreMusic();
                    }
                } else if (iFindFirstVisibleItemPosition + iAbs > itemCount - 10) {
                    MediaController.getInstance().loadMoreMusic();
                }
            }
        });
        this.saveToProfileButton = new ButtonWithCounterView(context, true, resourcesProvider).setRound();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final int i14 = 0;
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.filled_track_add), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        this.saveToProfileButton.setText(spannableStringBuilder);
        this.saveToProfileButton.setOnClickListener(new View.OnClickListener(this) {
            public final AudioPlayerAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i14) {
                    case 0:
                        this.f$0.lambda$new$12(resourcesProvider, view4);
                        break;
                    default:
                        this.f$0.lambda$new$14(resourcesProvider, view4);
                        break;
                }
            }
        });
        this.playerLayout.addView(this.saveToProfileButton, LayoutHelper.createFrame(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        final int i15 = 1;
        ButtonWithCounterView neutral = new ButtonWithCounterView(context, true, resourcesProvider).setRound().setNeutral();
        this.unsaveFromProfileButton = neutral;
        neutral.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        this.unsaveFromProfileButton.setOnClickListener(new View.OnClickListener(this) {
            public final AudioPlayerAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i15) {
                    case 0:
                        this.f$0.lambda$new$12(resourcesProvider, view4);
                        break;
                    default:
                        this.f$0.lambda$new$14(resourcesProvider, view4);
                        break;
                }
            }
        });
        this.playerLayout.addView(this.unsaveFromProfileButton, LayoutHelper.createFrame(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.savedMusicList = savedMusicList;
        boolean z2 = savedMusicList != null;
        this.isProfilePlaylist = z2;
        this.actionBar.menuOccupyBack = z2;
        this.padWithItem = isMyList();
        this.playlist = MediaController.getInstance().getPlaylist();
        if (isMyList()) {
            actionBarMenu = actionBarMenuCreateMenu;
            this.addItem = actionBarMenu.addItem(8, R.drawable.msg_add);
        } else {
            actionBarMenu = actionBarMenuCreateMenu;
        }
        ActionBarMenuItem actionBarMenuItemSearchListener = actionBarMenu.addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchCollapse() {
                if (AudioPlayerAlert.this.searching) {
                    AudioPlayerAlert.this.searchWas = false;
                    AudioPlayerAlert.this.searching = false;
                    AudioPlayerAlert.this.setAllowNestedScroll(true);
                    AudioPlayerAlert.this.listAdapter.search(null);
                    if (AudioPlayerAlert.this.addItem != null) {
                        AudioPlayerAlert.this.addItem.setVisibility(0);
                    }
                }
            }

            @Override
            public void onSearchExpand() {
                AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
                audioPlayerAlert.searchOpenPosition = audioPlayerAlert.layoutManager.findLastVisibleItemPosition();
                View viewFindViewByPosition = AudioPlayerAlert.this.layoutManager.findViewByPosition(AudioPlayerAlert.this.searchOpenPosition);
                AudioPlayerAlert.this.searchOpenOffset = viewFindViewByPosition == null ? 0 : viewFindViewByPosition.getTop();
                AudioPlayerAlert.this.searching = true;
                AudioPlayerAlert.this.setAllowNestedScroll(false);
                AudioPlayerAlert.this.listAdapter.notifyDataSetChanged();
                if (AudioPlayerAlert.this.addItem != null) {
                    AudioPlayerAlert.this.addItem.setVisibility(8);
                }
            }

            @Override
            public void onTextChanged(EditText editText) {
                if (editText.length() > 0) {
                    AudioPlayerAlert.this.listAdapter.search(editText.getText().toString());
                } else {
                    AudioPlayerAlert.this.searchWas = false;
                    AudioPlayerAlert.this.listAdapter.search(null);
                }
            }
        });
        this.searchItem = actionBarMenuItemSearchListener;
        int i16 = R.string.Search;
        actionBarMenuItemSearchListener.setContentDescription(LocaleController.getString(i16));
        EditTextBoldCursor searchField = this.searchItem.getSearchField();
        searchField.setHint(LocaleController.getString(i16));
        int i17 = Theme.key_player_actionBarTitle;
        searchField.setTextColor(getThemedColor(i17));
        searchField.setHintTextColor(getThemedColor(Theme.key_player_time));
        searchField.setCursorColor(getThemedColor(i17));
        if (z2) {
            this.listView.setSections();
            setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider));
            this.actionBar.setAlpha(1.0f);
            f = 0.0f;
            this.actionBarBackground.setAlpha(0.0f);
            this.actionBarSlideProperty.set(this.actionBar, Float.valueOf(0.0f));
        } else {
            f = 0.0f;
        }
        this.listAdapter.setup();
        this.listAdapter.notifyDataSetChanged();
        this.actionBar.setTitle(LocaleController.getString(R.string.AttachMusic));
        MessagesController.SavedMusicList savedMusicList2 = this.savedMusicList;
        if (savedMusicList2 != null) {
            if (savedMusicList2.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ProfilePlaylistTitleMine));
            } else {
                this.actionBar.setTitle(LocaleController.formatString(R.string.ProfilePlaylistTitle, DialogObject.getShortName(this.savedMusicList.dialogId)));
            }
        } else if (playingMessageObject != null && !MediaController.getInstance().currentPlaylistIsGlobalSearch()) {
            long dialogId = playingMessageObject.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                TLRPC.EncryptedChat encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(MessagesController.getInstance(this.currentAccount), dialogId);
                if (encryptedChatM != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(encryptedChatM.user_id))) != null) {
                    this.actionBar.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                if (playingMessageObject.getSavedDialogId() == 2666000) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.SavedMessages));
                }
            } else if (DialogObject.isUserDialog(dialogId)) {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                if (user2 != null) {
                    this.actionBar.setTitle(ContactsController.formatName(user2.first_name, user2.last_name));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                if (chat != null) {
                    this.actionBar.setTitle(chat.title);
                }
            }
        }
        if (isMyList()) {
            this.saveToProfileButton.setVisibility(8);
            this.unsaveFromProfileButton.setVisibility(8);
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.Callback() {
                @Override
                public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    super.clearView(recyclerView, viewHolder);
                    viewHolder.itemView.setPressed(false);
                    viewHolder.itemView.setTag(R.id.dragging, null);
                }

                @Override
                public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    if (viewHolder.getItemViewType() != 0) {
                        return 0;
                    }
                    return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
                }

                @Override
                public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                    int adapterPosition = viewHolder.getAdapterPosition();
                    int adapterPosition2 = viewHolder2.getAdapterPosition();
                    if (!AudioPlayerAlert.this.padWithItem) {
                        AudioPlayerAlert.this.savedMusicList.move(adapterPosition, adapterPosition2);
                    } else {
                        if (adapterPosition <= 0 || adapterPosition2 <= 0) {
                            return false;
                        }
                        AudioPlayerAlert.this.savedMusicList.move(adapterPosition - 1, adapterPosition2 - 1);
                    }
                    AudioPlayerAlert.this.playlist.clear();
                    AudioPlayerAlert.this.playlist.addAll(AudioPlayerAlert.this.savedMusicList.list);
                    AudioPlayerAlert.this.listAdapter.notifyItemMoved(adapterPosition, adapterPosition2);
                    return true;
                }

                @Override
                public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i18) {
                    if (viewHolder != null) {
                        AudioPlayerAlert.this.listView.hideSelector(false);
                    }
                    if (i18 != 0) {
                        AudioPlayerAlert.this.listView.cancelClickRunnables(false);
                        if (viewHolder != null) {
                            viewHolder.itemView.setPressed(true);
                        }
                    }
                    super.onSelectedChanged(viewHolder, i18);
                    if (viewHolder != null) {
                        viewHolder.itemView.setTag(R.id.dragging, i18 == 2 ? Boolean.TRUE : null);
                    }
                }

                @Override
                public void onSwiped(RecyclerView.ViewHolder viewHolder, int i18) {
                }
            });
            this.itemTouchHelper = itemTouchHelper;
            itemTouchHelper.attachToRecyclerView(this.listView);
        }
        this.containerView.addView(this.playerLayout, LayoutHelper.createFrame(-1, ((isMyList() || this.noforwards) ? 0 : 52) + 179, 83));
        this.containerView.addView(this.playerShadow, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        ((FrameLayout.LayoutParams) this.playerLayout.getLayoutParams()).height = AndroidUtilities.dp(((isMyList() || this.noforwards) ? 0 : 52) + 179);
        ((FrameLayout.LayoutParams) this.playerShadow.getLayoutParams()).bottomMargin = AndroidUtilities.dp(179 + ((isMyList() || this.noforwards) ? 0 : 52));
        this.containerView.addView(this.actionBarShadow, LayoutHelper.createFrame(-1, 3.0f));
        this.containerView.addView(this.actionBar);
        FrameLayout frameLayout3 = new FrameLayout(context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (AudioPlayerAlert.this.blurredView.getTag() != null) {
                    AudioPlayerAlert.this.showAlbumCover(false, true);
                }
                return true;
            }
        };
        this.blurredView = frameLayout3;
        frameLayout3.setAlpha(f);
        this.blurredView.setVisibility(4);
        getContainer().addView(this.blurredView);
        BackupImageView backupImageView = new BackupImageView(context);
        this.bigAlbumConver = backupImageView;
        backupImageView.setAspectFit(true);
        this.bigAlbumConver.setRoundRadius(AndroidUtilities.dp(8.0f));
        this.bigAlbumConver.setScaleX(0.9f);
        this.bigAlbumConver.setScaleY(0.9f);
        this.blurredView.addView(this.bigAlbumConver, LayoutHelper.createFrame(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        updateTitle(false);
        updateRepeatButton();
        updateEmptyView();
    }

    private ItemOptions buildSaveOptions(ItemOptions itemOptions, MessageObject messageObject) {
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        long j = document != null ? document.id : 0L;
        ItemOptions itemOptionsMakeSwipeback = itemOptions.makeSwipeback();
        itemOptionsMakeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new IntroActivity$$ExternalSyntheticLambda5(itemOptions, 5));
        itemOptionsMakeSwipeback.addGap();
        itemOptionsMakeSwipeback.addIf(!savedMusicIds.ids.contains(Long.valueOf(j)), R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new AudioPlayerAlert$$ExternalSyntheticLambda3(this, messageObject, itemOptions, 1));
        itemOptionsMakeSwipeback.add(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new AudioPlayerAlert$$ExternalSyntheticLambda3(this, messageObject, itemOptions, 2));
        itemOptionsMakeSwipeback.add(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new AudioPlayerAlert$$ExternalSyntheticLambda3(this, messageObject, itemOptions, 3));
        itemOptionsMakeSwipeback.addGap();
        itemOptionsMakeSwipeback.addText(LocaleController.getString(R.string.AudioSaveToInfo), 12, AndroidUtilities.dp(200.0f));
        return itemOptionsMakeSwipeback;
    }

    private void checkIfMusicDownloaded(MessageObject messageObject) {
        String str = messageObject.messageOwner.attachPath;
        File pathToMessage = null;
        if (str != null && str.length() > 0) {
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                pathToMessage = file;
            }
        }
        if (pathToMessage == null) {
            pathToMessage = FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner);
        }
        boolean z = SharedConfig.streamMedia && ((int) messageObject.getDialogId()) != 0 && messageObject.isMusic();
        if (pathToMessage.exists() || z) {
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            this.progressView.setVisibility(4);
            this.seekBarView.setVisibility(0);
            this.playButton.setEnabled(true);
            return;
        }
        String fileName = messageObject.getFileName();
        DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(fileName, this);
        Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
        this.progressView.setProgress(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
        this.progressView.setVisibility(0);
        this.seekBarView.setVisibility(4);
        this.playButton.setEnabled(false);
    }

    private void checkSpeedHint() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastPlaybackClick > 300) {
            int i = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i > 2) {
                i = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i).apply();
            if (i >= 0) {
                showSpeedHint();
            }
        }
        this.lastPlaybackClick = jCurrentTimeMillis;
    }

    private boolean equals(float f, float f2) {
        return Math.abs(f - f2) < 0.05f;
    }

    private void forward(MessageObject messageObject, long j) {
        ArrayList<MessageObject> arrayListM;
        TLRPC.TL_document tL_document;
        String string;
        int i = UserConfig.selectedAccount;
        int i2 = this.currentAccount;
        if (i != i2) {
            this.parentActivity.switchToAccount(i2, true);
        }
        if (messageObject.getId() >= 0) {
            arrayListM = MediaController$$ExternalSyntheticOutline1.m(messageObject);
            tL_document = null;
        } else {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
            arrayListM = null;
        }
        if (arrayListM != null) {
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(arrayListM, j, false, false, true, 0, 0L);
        } else {
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j, null, null, null, null, null, null, true, 0, 0, 0, this.savedMusicList, null, false, false));
        }
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            BulletinFactory bulletinFactoryOf = BulletinFactory.of(lastFragment);
            int i3 = R.raw.forward;
            if (j == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                string = LocaleController.getString(R.string.FwdMessageToSavedMessages);
            } else {
                string = j > 0 ? LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(j)) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(j));
            }
            bulletinFactoryOf.createSimpleBulletin(i3, string).show();
        }
    }

    private ImageLocation getArtworkThumbImageLocation(MessageObject messageObject) {
        TLRPC.Document document = messageObject.getDocument();
        TLRPC.PhotoSize closestPhotoSizeWithSize = document != null ? FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 360) : null;
        if (!(closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) && !(closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) {
            closestPhotoSizeWithSize = null;
        }
        if (closestPhotoSizeWithSize != null) {
            return ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        }
        String artworkUrl = messageObject.getArtworkUrl(true);
        if (artworkUrl != null) {
            return ImageLocation.getForPath(artworkUrl);
        }
        return null;
    }

    public boolean isMyList() {
        MessagesController.SavedMusicList savedMusicList = this.savedMusicList;
        return savedMusicList != null && savedMusicList.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    public void lambda$buildSaveOptions$38(ItemOptions itemOptions) {
        setVisibleInProfile(true);
        BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletin(R.raw.saved_messages, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).show();
        itemOptions.dismiss();
    }

    public void lambda$buildSaveOptions$39(MessageObject messageObject, ItemOptions itemOptions) {
        saveToProfile(messageObject, true, new AudioPlayerAlert$$ExternalSyntheticLambda4(this, itemOptions, 0), false);
    }

    public void lambda$buildSaveOptions$40(MessageObject messageObject, ItemOptions itemOptions) {
        forward(messageObject, UserConfig.getInstance(this.currentAccount).getClientUserId());
        itemOptions.dismiss();
        FactCheckController$$ExternalSyntheticOutline0.m(R.string.AudioSaveToSavedMessagesSaved, BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider), R.raw.saved_messages);
    }

    public void lambda$buildSaveOptions$41(MessageObject messageObject, ItemOptions itemOptions) {
        saveToMusic(messageObject);
        itemOptions.dismiss();
    }

    public boolean lambda$forward$53(ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, DialogsActivity dialogsActivity, ArrayList arrayList2, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        String pluralStringComma;
        long j;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() > 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() || charSequence != null || arrayList3 == null) {
            int i3 = 0;
            while (i3 < arrayList2.size()) {
                long j2 = ((MessagesStorage.TopicKey) arrayList2.get(i3)).dialogId;
                if (charSequence != null) {
                    j = j2;
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                } else {
                    j = j2;
                }
                if (arrayList3 != null) {
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(arrayList3, j, false, false, true, 0, 0L);
                } else {
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j, null, null, null, null, null, null, z2, i, 0, 0, this.savedMusicList, null, false, false));
                }
                i3++;
                arrayList3 = arrayList;
            }
            dialogsActivity.finishFragment();
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment != null) {
                BulletinFactory bulletinFactoryOf = BulletinFactory.of(lastFragment);
                int i4 = R.raw.forward;
                if (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                    pluralStringComma = LocaleController.getString(R.string.FwdMessageToSavedMessages);
                } else if (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId <= 0) {
                    pluralStringComma = (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId >= 0) ? LocaleController.formatPluralStringComma("FwdMessageToManyChats", arrayList2.size()) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId));
                } else {
                    pluralStringComma = LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId));
                }
                bulletinFactoryOf.createSimpleBulletin(i4, pluralStringComma).show();
            }
        } else {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList2.get(0);
            long j3 = topicKey.dialogId;
            Bundle bundleM = CallLogActivity$$ExternalSyntheticOutline0.m("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j3)) {
                bundleM.putInt("enc_id", DialogObject.getEncryptedChatId(j3));
            } else if (DialogObject.isUserDialog(j3)) {
                bundleM.putLong("user_id", j3);
            } else {
                bundleM.putLong("chat_id", -j3);
            }
            ChatActivity chatActivity = new ChatActivity(bundleM);
            if (topicKey.topicId != 0) {
                ForumUtilities.applyTopic(chatActivity, topicKey);
            }
            if (this.parentActivity.presentFragment(chatActivity, true, false)) {
                chatActivity.showFieldPanelForForward(true, arrayList3);
                if (topicKey.topicId != 0) {
                    dialogsActivity.removeSelfFromStack();
                }
            } else {
                dialogsActivity.finishFragment();
            }
        }
        return true;
    }

    public void lambda$getThemeDescriptions$21() {
        this.searchItem.getSearchField().setCursorColor(getThemedColor(Theme.key_player_actionBarTitle));
        ActionBarMenuItem actionBarMenuItem = this.repeatButton;
        actionBarMenuItem.setIconColor(getThemedColor(((Integer) actionBarMenuItem.getTag()).intValue()));
        Drawable background = this.repeatButton.getBackground();
        int i = Theme.key_listSelector;
        Theme.setSelectorDrawableColor(background, getThemedColor(i), true);
        this.optionsButton.setIconColor(getThemedColor(Theme.key_player_button));
        Theme.setSelectorDrawableColor(this.optionsButton.getBackground(), getThemedColor(i), true);
        this.progressView.setBackgroundColor(getThemedColor(Theme.key_player_progressBackground));
        this.progressView.setProgressColor(getThemedColor(Theme.key_player_progress));
        updateSubMenu();
        ActionBarMenuItem actionBarMenuItem2 = this.repeatButton;
        int i2 = Theme.key_actionBarDefaultSubmenuBackground;
        actionBarMenuItem2.redrawPopup(getThemedColor(i2));
        ActionBarMenuItem actionBarMenuItem3 = this.optionsButton;
        int i3 = Theme.key_actionBarDefaultSubmenuItem;
        actionBarMenuItem3.setPopupItemsColor(getThemedColor(i3), false);
        this.optionsButton.setPopupItemsColor(getThemedColor(i3), true);
        this.optionsButton.redrawPopup(getThemedColor(i2));
    }

    public void lambda$new$0(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.seekBarView.setBufferedProgress(f / 1000.0f);
    }

    public void lambda$new$1(int i) {
        if (i >= 0) {
            float[] fArr = speeds;
            if (i >= fArr.length) {
                return;
            }
            MediaController.getInstance().setPlaybackSpeed(true, fArr[i]);
            updatePlaybackButton(true);
        }
    }

    public boolean lambda$new$10(View view, int i) {
        if (!(view instanceof AudioPlayerCell) || isMyList()) {
            return false;
        }
        AudioPlayerCell audioPlayerCell = (AudioPlayerCell) view;
        showOptions(audioPlayerCell, audioPlayerCell.getMessageObject());
        return true;
    }

    public static void lambda$new$11() {
    }

    public void lambda$new$12(Theme.ResourcesProvider resourcesProvider, View view) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || this.parentActivity == null) {
            return;
        }
        saveToProfile(playingMessageObject, true, new UndoView$$ExternalSyntheticLambda7(10), false);
        setVisibleInProfile(true);
        FactCheckController$$ExternalSyntheticOutline0.m(R.string.AudioSaveToMyProfileSaved, BulletinFactory.of((FrameLayout) this.containerView, resourcesProvider), R.raw.saved_messages);
    }

    public static void lambda$new$13() {
    }

    public void lambda$new$14(Theme.ResourcesProvider resourcesProvider, View view) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || this.parentActivity == null) {
            return;
        }
        saveToProfile(playingMessageObject, false, new UndoView$$ExternalSyntheticLambda7(9), false);
        setVisibleInProfile(false);
        FactCheckController$$ExternalSyntheticOutline0.m(R.string.AudioSaveToMyProfileUnsaved, BulletinFactory.of((FrameLayout) this.containerView, resourcesProvider), R.raw.ic_delete);
    }

    public void lambda$new$2(Float f, Boolean bool) {
        this.slidingSpeed = !bool.booleanValue();
        MediaController mediaController = MediaController.getInstance();
        ActionBarMenuSlider.SpeedSlider speedSlider = this.speedSlider;
        float fFloatValue = f.floatValue();
        speedSlider.getClass();
        mediaController.setPlaybackSpeed(true, (fFloatValue * 2.8f) + 0.2f);
    }

    public void lambda$new$3(float[] fArr, View view) {
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
        int i = 0;
        while (true) {
            if (i >= fArr.length) {
                i = -1;
                break;
            } else if (playbackSpeed - 0.1f <= fArr[i]) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        MediaController.getInstance().setPlaybackSpeed(true, fArr[i2 < fArr.length ? i2 : 0]);
        checkSpeedHint();
    }

    public boolean lambda$new$4(Theme.ResourcesProvider resourcesProvider, View view) {
        this.speedSlider.setSpeed(MediaController.getInstance().getPlaybackSpeed(true), false);
        this.speedSlider.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider));
        updatePlaybackButton(false);
        this.playbackSpeedButton.setDimMenu(0.15f);
        this.playbackSpeedButton.toggleSubMenu(this.speedSlider, null);
        MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
        return true;
    }

    public void lambda$new$5(View view) {
        updateSubMenu();
        this.repeatButton.toggleSubMenu();
    }

    public void lambda$new$6(int i) {
        if (i == 1 || i == 2) {
            boolean z = SharedConfig.playOrderReversed;
            if ((z && i == 1) || (SharedConfig.shuffleMusic && i == 2)) {
                MediaController.getInstance().setPlaybackOrderType(0);
            } else {
                MediaController.getInstance().setPlaybackOrderType(i);
            }
            this.listAdapter.notifyDataSetChanged();
            if (z != SharedConfig.playOrderReversed) {
                this.listView.stopScroll();
                scrollToCurrentSong(false);
            }
        } else if (i == 4) {
            if (SharedConfig.repeatMode == 1) {
                SharedConfig.setRepeatMode(0);
            } else {
                SharedConfig.setRepeatMode(1);
            }
        } else if (SharedConfig.repeatMode == 2) {
            SharedConfig.setRepeatMode(0);
        } else {
            SharedConfig.setRepeatMode(2);
        }
        updateRepeatButton();
    }

    public static void lambda$new$7(View view) {
        if (MediaController.getInstance().isDownloadingCurrentMessage()) {
            return;
        }
        if (MediaController.getInstance().isMessagePaused()) {
            MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
        } else {
            MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
        }
    }

    public static boolean lambda$new$8(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$new$9(View view, int i) {
        if (view instanceof AudioPlayerCell) {
            ((AudioPlayerCell) view).didPressedButton();
        }
    }

    public void lambda$onSubItemClick$15(MessageObject messageObject) {
        MessagesController.SavedMusicList savedMusicList = this.savedMusicList;
        if (savedMusicList != null) {
            savedMusicList.remove(messageObject);
            if (!this.savedMusicList.list.isEmpty()) {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, this.savedMusicList);
            } else {
                MediaController.getInstance().cleanup();
                lambda$showGiftOfferSheet$15();
            }
        }
    }

    public void lambda$onSubItemClick$16(AlertDialog alertDialog, TLObject tLObject) {
        alertDialog.dismiss();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.id = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            MessagesController.SavedMusicList savedMusicList = this.savedMusicList;
            if (savedMusicList != null) {
                savedMusicList.add(document);
            }
            this.playlist.clear();
            this.playlist.addAll(this.savedMusicList.list);
            this.listAdapter.notifyDataSetChanged();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, null);
        }
    }

    public void lambda$onSubItemClick$17(AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda1(this, alertDialog, tLObject, 15));
    }

    public void lambda$onSubItemClick$18(AlertDialog alertDialog, TLRPC.Document document, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            alertDialog.dismiss();
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = document.mime_type;
        tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_uploadMedia, new ShareAlert$$ExternalSyntheticLambda13(4, this, alertDialog));
    }

    public void lambda$onSubItemClick$19(MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || this.savedMusicList == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        if (document.id == 0) {
            AlertDialog alertDialog = new AlertDialog(getContext(), 3, null);
            AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 180L);
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                FileLoader.getInstance(this.currentAccount).uploadFile(file.getAbsolutePath(), new StickersDialogs$$ExternalSyntheticLambda12(this, alertDialog, document));
                return;
            }
            return;
        }
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.id = tL_inputDocument;
        tL_inputDocument.id = document.id;
        tL_inputDocument.access_hash = document.access_hash;
        tL_inputDocument.file_reference = document.file_reference;
        MessagesController.SavedMusicList savedMusicList = this.savedMusicList;
        if (savedMusicList != null) {
            savedMusicList.add(document);
        }
        this.playlist.clear();
        this.playlist.addAll(this.savedMusicList.list);
        this.listAdapter.notifyDataSetChanged();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, null);
    }

    public void lambda$saveToMusic$52(Uri uri) {
        BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createDownloadBulletin(BulletinFactory.FileType.AUDIO).show();
    }

    public void lambda$saveToProfile$22(TLRPC.TL_error tL_error) {
        BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).showForError(tL_error);
    }

    public void lambda$saveToProfile$23() {
        BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND")).show();
    }

    public void lambda$saveToProfile$24(TLRPC.TL_error tL_error) {
        BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).showForError(tL_error);
    }

    public void lambda$saveToProfile$25(int i, boolean z, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new AudioPlayerAlert$$ExternalSyntheticLambda18(this, tL_error, 3));
                return;
            }
            return;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        int i2 = 0;
        while (true) {
            if (i2 >= messages_messages.messages.size()) {
                message = null;
                break;
            } else {
                if (messages_messages.messages.get(i2).id == i) {
                    message = messages_messages.messages.get(i2);
                    break;
                }
                i2++;
            }
        }
        if (message != null) {
            saveToProfile(new MessageObject(this.currentAccount, message, false, true), z, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new AudioPlayerAlert$$ExternalSyntheticLambda22(this, 1));
        }
    }

    public void lambda$saveToProfile$26() {
        BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND")).show();
    }

    public void lambda$saveToProfile$27(TLRPC.TL_error tL_error) {
        BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).showForError(tL_error);
    }

    public void lambda$saveToProfile$28(int i, boolean z, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new AudioPlayerAlert$$ExternalSyntheticLambda18(this, tL_error, 2));
                return;
            }
            return;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        int i2 = 0;
        while (true) {
            if (i2 >= messages_messages.messages.size()) {
                message = null;
                break;
            } else {
                if (messages_messages.messages.get(i2).id == i) {
                    message = messages_messages.messages.get(i2);
                    break;
                }
                i2++;
            }
        }
        if (message != null) {
            saveToProfile(new MessageObject(this.currentAccount, message, false, true), z, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new AudioPlayerAlert$$ExternalSyntheticLambda22(this, 0));
        }
    }

    public void lambda$saveToProfile$29(TLRPC.TL_error tL_error) {
        BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).showForError(tL_error);
    }

    public void lambda$saveToProfile$30(long j, boolean z, TLRPC.Document document, Runnable runnable) {
        MessagesController.getInstance(this.currentAccount).getSavedMusicIds().update(j, z);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(clientUserId);
        if (userFull != null) {
            if (z) {
                userFull.flags2 |= 2097152;
                userFull.saved_music = document;
            } else {
                TLRPC.Document document2 = userFull.saved_music;
                if (document2 != null && document2.id == j) {
                    userFull.flags2 &= -2097153;
                    userFull.saved_music = null;
                }
            }
            MessagesStorage.getInstance(this.currentAccount).updateUserInfo(userFull, true);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(clientUserId));
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$saveToProfile$31(boolean z, MessageObject messageObject, final boolean z2, final Runnable runnable, long j, TLRPC.Document document, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new AudioPlayerAlert$$ExternalSyntheticLambda18(this, tL_error, 1));
            }
            AndroidUtilities.runOnUIThread(new AlertsCreator$$ExternalSyntheticLambda254(this, j, z2, document, runnable));
            return;
        }
        if (z || messageObject.getId() < 0) {
            AndroidUtilities.runOnUIThread(new AudioPlayerAlert$$ExternalSyntheticLambda18(this, tL_error, 0));
            return;
        }
        if (messageObject.getDialogId() >= 0) {
            final int id = messageObject.getId();
            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
            tL_messages_getMessages.id.add(Integer.valueOf(id));
            final int i = 0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate(this) {
                public final AudioPlayerAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$saveToProfile$25(id, z2, runnable, tLObject2, tL_error2);
                            break;
                        default:
                            this.f$0.lambda$saveToProfile$28(id, z2, runnable, tLObject2, tL_error2);
                            break;
                    }
                }
            });
            return;
        }
        final int id2 = messageObject.getId();
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessages.id.add(Integer.valueOf(id2));
        final int i2 = 1;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate(this) {
            public final AudioPlayerAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$saveToProfile$25(id2, z2, runnable, tLObject2, tL_error2);
                        break;
                    default:
                        this.f$0.lambda$saveToProfile$28(id2, z2, runnable, tLObject2, tL_error2);
                        break;
                }
            }
        });
    }

    public void lambda$setCustomPaddingRight$54(ValueAnimator valueAnimator) {
        this.titleTextView.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.authorTextView.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public void lambda$setVisibleInProfile$50(boolean z) {
        this.saveToProfileButton.setVisibility(z ? 8 : 0);
    }

    public void lambda$setVisibleInProfile$51(boolean z) {
        this.unsaveFromProfileButton.setVisibility(z ? 0 : 8);
    }

    public void lambda$showAlbumCover$20(Bitmap bitmap, Bitmap bitmap2) {
        this.blurredView.setBackground(new BitmapDrawable(bitmap));
    }

    public void lambda$showMenuOptions$33(ItemOptions itemOptions) {
        itemOptions.dismiss();
        onSubItemClick(1);
    }

    public void lambda$showMenuOptions$34(ItemOptions itemOptions) {
        itemOptions.dismiss();
        onSubItemClick(2);
    }

    public void lambda$showMenuOptions$35(ItemOptions itemOptions) {
        itemOptions.dismiss();
        onSubItemClick(4);
    }

    public void lambda$showMenuOptions$36(ItemOptions itemOptions, View view) {
        itemOptions.dismiss();
        onSubItemClick(7);
    }

    public void lambda$showMenuOptions$37(ItemOptions itemOptions) {
        itemOptions.dismiss();
        onSubItemClick(7);
    }

    public void lambda$showOptions$42(ItemOptions itemOptions, MessageObject messageObject) {
        itemOptions.dismiss();
        forward(messageObject);
    }

    public void lambda$showOptions$43(ItemOptions itemOptions, MessageObject messageObject) {
        itemOptions.dismiss();
        share(messageObject);
    }

    public void lambda$showOptions$44(MessageObject messageObject, ItemOptions itemOptions) {
        this.savedMusicList.remove(messageObject);
        this.playlist.remove(messageObject);
        this.listAdapter.notifyDataSetChanged();
        itemOptions.dismiss();
        setVisibleInProfile(false);
        FactCheckController$$ExternalSyntheticOutline0.m(R.string.AudioSaveToMyProfileUnsaved, BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider), R.raw.ic_delete);
    }

    public void lambda$showOptions$45(MessageObject messageObject, ItemOptions itemOptions) {
        saveToProfile(messageObject, false, new AudioPlayerAlert$$ExternalSyntheticLambda3(this, messageObject, itemOptions, 0), false);
    }

    public void lambda$showOptions$47(ItemOptions itemOptions, MessageObject messageObject) {
        itemOptions.dismiss();
        forward(messageObject);
    }

    public void lambda$showOptions$48(ItemOptions itemOptions, MessageObject messageObject) {
        itemOptions.dismiss();
        share(messageObject);
    }

    public void lambda$showOptions$49(MessageObject messageObject) {
        int i = UserConfig.selectedAccount;
        int i2 = this.currentAccount;
        if (i != i2) {
            this.parentActivity.switchToAccount(i2, true);
        }
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        this.parentActivity.presentFragment(new ChatActivity(bundle), false, false);
        lambda$showGiftOfferSheet$15();
    }

    public void onSubItemClick(int i) {
        LaunchActivity launchActivity;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || (launchActivity = this.parentActivity) == null) {
            return;
        }
        if (i == 1) {
            forward(playingMessageObject);
            return;
        }
        if (i == 2) {
            share(playingMessageObject);
            return;
        }
        if (i != 4) {
            if (i == 5) {
                saveToMusic(playingMessageObject);
                return;
            }
            if (i == 6) {
                zzcl.getInstance().setCurrentMediaAndCastIfNeeded(MediaController.getInstance().getCurrentChromecastMedia());
                this.castItemButton.performClick();
                return;
            } else {
                if (i == 7) {
                    saveToProfile(playingMessageObject, false, new AudioPlayerAlert$$ExternalSyntheticLambda5(this, playingMessageObject, 0), false);
                    return;
                }
                if (i == 8) {
                    SelectAudioAlert selectAudioAlert = new SelectAudioAlert(getContext(), true, null, new AudioPlayerAlert$$ExternalSyntheticLambda6(this, 0), null);
                    selectAudioAlert.withoutSavedMusic = true;
                    selectAudioAlert.local = false;
                    selectAudioAlert.adapter.update(true);
                    selectAudioAlert.show();
                    return;
                }
                return;
            }
        }
        int i2 = UserConfig.selectedAccount;
        int i3 = this.currentAccount;
        if (i2 != i3) {
            launchActivity.switchToAccount(i3, true);
        }
        Bundle bundle = new Bundle();
        long dialogId = playingMessageObject.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", playingMessageObject.getId());
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        this.parentActivity.presentFragment(new ChatActivity(bundle), false, false);
        lambda$showGiftOfferSheet$15();
    }

    private void preloadNeighboringThumbs() {
        MediaController mediaController = MediaController.getInstance();
        ArrayList<MessageObject> playlist = mediaController.getPlaylist();
        if (playlist.size() <= 1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int playingMessageObjectNum = mediaController.getPlayingMessageObjectNum();
        int size = playingMessageObjectNum + 1;
        int size2 = playingMessageObjectNum - 1;
        if (size >= playlist.size()) {
            size = 0;
        }
        if (size <= -1) {
            size = playlist.size() - 1;
        }
        if (size2 <= -1) {
            size2 = playlist.size() - 1;
        }
        if (size2 >= playlist.size()) {
            size2 = 0;
        }
        arrayList.add(playlist.get(size));
        if (size != size2) {
            arrayList.add(playlist.get(size2));
        }
        int size3 = arrayList.size();
        for (int i = 0; i < size3; i++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i);
            ImageLocation artworkThumbImageLocation = getArtworkThumbImageLocation(messageObject);
            if (artworkThumbImageLocation != null) {
                if (artworkThumbImageLocation.path != null) {
                    ImageLoader.getInstance().preloadArtwork(artworkThumbImageLocation.path);
                } else {
                    FileLoader.getInstance(this.currentAccount).loadFile(artworkThumbImageLocation, messageObject, null, 0, 1);
                }
            }
        }
    }

    private void saveToMusic(MessageObject messageObject) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && ((i <= 28 || BuildVars.NO_SCOPED_STORAGE) && this.parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            this.parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
            return;
        }
        String documentFileName = FileLoader.getDocumentFileName(messageObject.getDocument());
        if (TextUtils.isEmpty(documentFileName)) {
            documentFileName = messageObject.getFileName();
        }
        String str = documentFileName;
        String string = messageObject.messageOwner.attachPath;
        if (string != null && string.length() > 0 && !Theme.ResourcesProvider.CC.m(string)) {
            string = null;
        }
        if (string == null || string.length() == 0) {
            string = FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner).toString();
        }
        MediaController.saveFile(string, this.parentActivity, 3, str, messageObject.getDocument() != null ? messageObject.getDocument().mime_type : "", new AudioPlayerAlert$$ExternalSyntheticLambda6(this, 1));
    }

    private void saveToProfile(MessageObject messageObject, boolean z, Runnable runnable, boolean z2) {
        TLRPC.Document document = messageObject.getDocument();
        if (document == null) {
            return;
        }
        long j = document.id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.id = tL_inputDocument;
        tL_inputDocument.id = j;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, new AudioPlayerAlert$$ExternalSyntheticLambda49(this, z2, messageObject, z, runnable, j, document));
    }

    public boolean scrollToCurrentSong(boolean z) {
        int iIndexOf;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            if (z) {
                int childCount = this.listView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.listView.getChildAt(i);
                    if ((childAt instanceof AudioPlayerCell) && ((AudioPlayerCell) childAt).getMessageObject() == playingMessageObject) {
                        if (childAt.getBottom() > this.listView.getMeasuredHeight()) {
                            break;
                        }
                    }
                }
                iIndexOf = this.playlist.indexOf(playingMessageObject);
                if (this.padWithItem) {
                    iIndexOf++;
                }
                if (iIndexOf >= 0) {
                    if (SharedConfig.playOrderReversed) {
                        this.layoutManager.scrollToPosition(iIndexOf);
                        return true;
                    }
                    this.layoutManager.scrollToPosition(this.playlist.size() - iIndexOf);
                    return true;
                }
            } else {
                iIndexOf = this.playlist.indexOf(playingMessageObject);
                if (this.padWithItem) {
                    iIndexOf++;
                }
                if (iIndexOf >= 0) {
                    if (SharedConfig.playOrderReversed) {
                        this.layoutManager.scrollToPosition(iIndexOf);
                        return true;
                    }
                    this.layoutManager.scrollToPosition(this.playlist.size() - iIndexOf);
                    return true;
                }
            }
        }
        return false;
    }

    public void setCustomPaddingRight(int i, boolean z) {
        ValueAnimator valueAnimator = this.rightPaddingAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.rightPaddingAnimator = null;
        }
        if (this.titleTextView.getCustomPaddingRight() == i) {
            return;
        }
        if (!z) {
            this.titleTextView.setCustomPaddingRight(i);
            this.authorTextView.setCustomPaddingRight(i);
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.titleTextView.getCustomPaddingRight(), i);
        this.rightPaddingAnimator = valueAnimatorOfInt;
        if (i == 0) {
            valueAnimatorOfInt.setStartDelay(200L);
            this.rightPaddingAnimator.setDuration(100L);
        } else {
            valueAnimatorOfInt.setDuration(200L);
        }
        this.rightPaddingAnimator.setInterpolator(new DecelerateInterpolator());
        this.rightPaddingAnimator.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 23));
        this.rightPaddingAnimator.start();
    }

    private void setMenuItemChecked(ActionBarMenuSubItem actionBarMenuSubItem, boolean z) {
        if (z) {
            int i = Theme.key_player_buttonActive;
            actionBarMenuSubItem.setTextColor(getThemedColor(i));
            actionBarMenuSubItem.setIconColor(getThemedColor(i));
        } else {
            int i2 = Theme.key_actionBarDefaultSubmenuItem;
            actionBarMenuSubItem.setTextColor(getThemedColor(i2));
            actionBarMenuSubItem.setIconColor(getThemedColor(i2));
        }
    }

    private void setVisibleInProfile(final boolean z) {
        if (isMyList() || this.noforwards) {
            this.saveToProfileButton.setVisibility(8);
            this.unsaveFromProfileButton.setVisibility(8);
            return;
        }
        this.saveToProfileButton.setVisibility(0);
        this.unsaveFromProfileButton.setVisibility(0);
        ViewPropertyAnimator duration = this.saveToProfileButton.animate().alpha(z ? 0.0f : 1.0f).scaleX(z ? 0.8f : 1.0f).scaleY(z ? 0.8f : 1.0f).setDuration(420L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        final int i = 0;
        duration.setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable(this) {
            public final AudioPlayerAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        this.f$0.lambda$setVisibleInProfile$50(z);
                        break;
                    default:
                        this.f$0.lambda$setVisibleInProfile$51(z);
                        break;
                }
            }
        }).start();
        final int i2 = 1;
        this.unsaveFromProfileButton.animate().alpha(z ? 1.0f : 0.0f).scaleX(!z ? 0.8f : 1.0f).scaleY(z ? 1.0f : 0.8f).setDuration(420L).setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable(this) {
            public final AudioPlayerAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$setVisibleInProfile$50(z);
                        break;
                    default:
                        this.f$0.lambda$setVisibleInProfile$51(z);
                        break;
                }
            }
        }).start();
    }

    private void share(MessageObject messageObject) {
        File pathToMessage;
        try {
            if (TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                pathToMessage = null;
            } else {
                pathToMessage = new File(messageObject.messageOwner.attachPath);
                if (!pathToMessage.exists()) {
                    pathToMessage = null;
                }
            }
            if (pathToMessage == null) {
                pathToMessage = FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner);
            }
            if (!pathToMessage.exists()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.parentActivity, 0, null);
                builder.setTitle(LocaleController.getString(R.string.AppName));
                builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                builder.setMessage(LocaleController.getString(R.string.PleaseDownload));
                builder.show();
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(messageObject.getMimeType());
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", pathToMessage));
                    intent.setFlags(1);
                } catch (Exception unused) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToMessage));
                }
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToMessage));
            }
            this.parentActivity.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void showAlbumCover(boolean z, boolean z2) {
        if (z) {
            if (this.blurredView.getVisibility() == 0 || this.blurredAnimationInProgress) {
                return;
            }
            this.blurredView.setTag(1);
            this.bigAlbumConver.setImageBitmap(this.coverContainer.getImageReceiver().getBitmap());
            this.blurredAnimationInProgress = true;
            ScrimOptions.makeGlobalBlurBitmaps(new AudioPlayerAlert$$ExternalSyntheticLambda24(this, 0));
            this.blurredView.setVisibility(0);
            this.blurredView.animate().alpha(1.0f).setDuration(180L).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    AudioPlayerAlert.this.blurredAnimationInProgress = false;
                }
            }).start();
            this.bigAlbumConver.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (this.blurredView.getVisibility() != 0) {
            return;
        }
        this.blurredView.setTag(null);
        if (z2) {
            this.blurredAnimationInProgress = true;
            this.blurredView.animate().alpha(0.0f).setDuration(180L).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    AudioPlayerAlert.this.blurredView.setVisibility(4);
                    AudioPlayerAlert.this.bigAlbumConver.setImageBitmap(null);
                    AudioPlayerAlert.this.blurredAnimationInProgress = false;
                }
            }).start();
            this.bigAlbumConver.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            this.blurredView.setAlpha(0.0f);
            this.blurredView.setVisibility(4);
            this.bigAlbumConver.setImageBitmap(null);
            this.bigAlbumConver.setScaleX(0.9f);
            this.bigAlbumConver.setScaleY(0.9f);
        }
    }

    public void showMenuOptions(View view) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions((ViewGroup) this.container, this.resourcesProvider, view, true);
        ItemOptions itemOptionsBuildSaveOptions = buildSaveOptions(itemOptionsMakeOptions, playingMessageObject);
        if (!isMyList()) {
            itemOptionsMakeOptions.addIf(!this.noforwards, R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new SearchViewPager$1$$ExternalSyntheticLambda1(itemOptionsMakeOptions, itemOptionsBuildSaveOptions, 2));
            if (!this.noforwards && itemOptionsMakeOptions.getLast() != null) {
                itemOptionsMakeOptions.getLast().setRightIcon(R.drawable.msg_arrowright);
            }
            itemOptionsMakeOptions.addGap();
        }
        itemOptionsMakeOptions.addIf(!this.noforwards, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new AudioPlayerAlert$$ExternalSyntheticLambda4(this, itemOptionsMakeOptions, 1));
        itemOptionsMakeOptions.addIf(!this.noforwards, R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new AudioPlayerAlert$$ExternalSyntheticLambda4(this, itemOptionsMakeOptions, 2));
        itemOptionsMakeOptions.addIf(playingMessageObject.getId() > 0, R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new AudioPlayerAlert$$ExternalSyntheticLambda4(this, itemOptionsMakeOptions, 3));
        if (this.castAvailable) {
            ActionBarMenuSubItem actionBarMenuSubItemAdd = itemOptionsMakeOptions.add();
            this.castItem = actionBarMenuSubItemAdd;
            actionBarMenuSubItemAdd.setTextAndIcon(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast);
            this.castItem.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(15, this, itemOptionsMakeOptions));
            AndroidUtilities.removeFromParent(this.castItemButton);
            this.castItem.addView(this.castItemButton, 0, LayoutHelper.createFrame(-1, -1.0f));
            updateColors();
        }
        itemOptionsMakeOptions.addIf(isMyList(), R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile), true, (Runnable) new AudioPlayerAlert$$ExternalSyntheticLambda4(this, itemOptionsMakeOptions, 4));
        itemOptionsMakeOptions.setTranslationY(AndroidUtilities.dp(64.0f));
        itemOptionsMakeOptions.show();
    }

    public void showOptions(AudioPlayerCell audioPlayerCell, MessageObject messageObject) {
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions((ViewGroup) this.container, this.resourcesProvider, (View) audioPlayerCell, true);
        if (isMyList()) {
            itemOptionsMakeOptions.addIf(!this.noforwards, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new AudioPlayerAlert$$ExternalSyntheticLambda3(this, itemOptionsMakeOptions, messageObject, 4));
            itemOptionsMakeOptions.addIf(!this.noforwards, R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new AudioPlayerAlert$$ExternalSyntheticLambda3(this, itemOptionsMakeOptions, messageObject, 5));
            itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Delete), true, (Runnable) new AudioPlayerAlert$$ExternalSyntheticLambda3(this, messageObject, itemOptionsMakeOptions, 6));
        } else {
            itemOptionsMakeOptions.addIf(!this.noforwards, R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new SearchViewPager$1$$ExternalSyntheticLambda1(itemOptionsMakeOptions, buildSaveOptions(itemOptionsMakeOptions, messageObject), 1));
            if (!this.noforwards && itemOptionsMakeOptions.getLast() != null) {
                itemOptionsMakeOptions.getLast().setRightIcon(R.drawable.msg_arrowright);
            }
            itemOptionsMakeOptions.addGap();
            itemOptionsMakeOptions.addIf(!this.noforwards, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new AudioPlayerAlert$$ExternalSyntheticLambda3(this, itemOptionsMakeOptions, messageObject, 7));
            itemOptionsMakeOptions.addIf(!this.noforwards, R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new AudioPlayerAlert$$ExternalSyntheticLambda3(this, itemOptionsMakeOptions, messageObject, 8));
            itemOptionsMakeOptions.addIf(messageObject.getId() > 0, R.drawable.msg_view_file, LocaleController.getString(R.string.ShowInChat), new AudioPlayerAlert$$ExternalSyntheticLambda5(this, messageObject, 1));
        }
        itemOptionsMakeOptions.setGravity(LocaleController.isRTL ? 3 : 5);
        itemOptionsMakeOptions.show();
    }

    private void showSpeedHint() {
        if (this.containerView != null) {
            HintView hintView = new HintView(getContext(), 5, false) {
                @Override
                public void setVisibility(int i) {
                    super.setVisibility(i);
                    if (i != 0) {
                        try {
                            ((ViewGroup) getParent()).removeView(this);
                        } catch (Exception unused) {
                        }
                    }
                }
            };
            this.speedHintView = hintView;
            hintView.setExtraTranslationY(AndroidUtilities.dp(6.0f));
            this.speedHintView.setText(LocaleController.getString(R.string.SpeedHint));
            this.playerLayout.addView(this.speedHintView, LayoutHelper.createFrame(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
            this.speedHintView.showForView(this.playbackSpeedButton, true);
        }
    }

    public void startForwardRewindingSeek() {
        if (this.rewindingState == 1) {
            this.lastRewindingTime = System.currentTimeMillis();
            this.rewindingProgress = MediaController.getInstance().getPlayingMessageObject().audioProgress;
            AndroidUtilities.cancelRunOnUIThread(this.forwardSeek);
            AndroidUtilities.runOnUIThread(this.forwardSeek);
        }
    }

    private void updateCover(MessageObject messageObject, boolean z) {
        Bitmap bitmap;
        BackupImageView nextImageView = z ? this.coverContainer.getNextImageView() : this.coverContainer.getImageView();
        AudioInfo audioInfo = MediaController.getInstance().getAudioInfo();
        if (z) {
            this.coverContainer.switchImageViews();
        }
        if (audioInfo != null && (bitmap = audioInfo.cover) != null) {
            nextImageView.setImageBitmap(bitmap);
            this.currentFile = null;
            this.currentAudioFinishedLoading = true;
            return;
        }
        this.currentFile = FileLoader.getAttachFileName(messageObject.getDocument());
        this.currentAudioFinishedLoading = false;
        String artworkUrl = messageObject.getArtworkUrl(false);
        ImageLocation artworkThumbImageLocation = getArtworkThumbImageLocation(messageObject);
        if (!TextUtils.isEmpty(artworkUrl)) {
            nextImageView.setImage(ImageLocation.getForPath(artworkUrl), (String) null, artworkThumbImageLocation, (String) null, (String) null, 0L, 1, messageObject);
        } else if (artworkThumbImageLocation != null) {
            nextImageView.setImage((ImageLocation) null, (String) null, artworkThumbImageLocation, (String) null, (String) null, 0L, 1, messageObject);
        } else {
            nextImageView.setImageDrawable(null);
        }
        nextImageView.invalidate();
    }

    public void updateEmptyView() {
        this.emptyView.setVisibility((this.searching && this.listAdapter.getItemCount() == 0) ? 0 : 8);
        updateEmptyViewPosition();
    }

    public void updateEmptyViewPosition() {
        if (this.emptyView.getVisibility() != 0) {
            return;
        }
        int iDp = this.playerLayout.getVisibility() == 0 ? AndroidUtilities.dp(150.0f) : -AndroidUtilities.dp(30.0f);
        LinearLayout linearLayout = this.emptyView;
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.containerView.getMeasuredHeight()) - iDp) / 2);
    }

    public void updateLayout() {
        if (this.listView.getChildCount() <= 0) {
            RecyclerListView recyclerListView = this.listView;
            int paddingTop = recyclerListView.getPaddingTop();
            this.scrollOffsetY = paddingTop;
            recyclerListView.setTopGlowOffset(paddingTop);
            this.containerView.invalidate();
            return;
        }
        View childAt = this.listView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
        int top = childAt instanceof AudioPlayerCell ? childAt.getTop() : childAt.getBottom();
        int iDp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || holder == null || holder.getAdapterPosition() != 0) {
            top = iDp;
        }
        boolean z = top <= AndroidUtilities.dp(12.0f);
        if ((z && this.actionBar.getTag() == null) || (!z && this.actionBar.getTag() != null)) {
            this.actionBar.setTag(z ? 1 : null);
            AnimatorSet animatorSet = this.actionBarAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.actionBarAnimation = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.actionBarAnimation = animatorSet2;
            if (this.isProfilePlaylist) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.actionBar, this.actionBarSlideProperty, z ? 1.0f : 0.0f);
                View view = this.actionBarBackground;
                Property property = View.ALPHA;
                animatorSet2.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.actionBarShadow, (Property<View, Float>) property, z ? 1.0f : 0.0f));
            } else {
                ActionBar actionBar = this.actionBar;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(actionBar, (Property<ActionBar, Float>) property2, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.actionBarShadow, (Property<View, Float>) property2, z ? 1.0f : 0.0f));
            }
            this.actionBarAnimation.setDuration(320L);
            this.actionBarAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.actionBarAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationCancel(Animator animator) {
                    AudioPlayerAlert.this.actionBarAnimation = null;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                }
            });
            this.actionBarAnimation.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.listView.getLayoutParams();
        int iM = zzkl.m(11.0f, layoutParams.topMargin - AndroidUtilities.statusBarHeight, top);
        if (this.scrollOffsetY != iM) {
            RecyclerListView recyclerListView2 = this.listView;
            this.scrollOffsetY = iM;
            recyclerListView2.setTopGlowOffset((iM - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            this.containerView.invalidate();
        }
        int iDp2 = AndroidUtilities.dp(13.0f);
        int translationY = (int) (this.listView.getTranslationY() + ((this.scrollOffsetY - this.backgroundPaddingTop) - iDp2));
        boolean z2 = (this.backgroundPaddingTop + translationY < ActionBar.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((float) ((ActionBar.getCurrentActionBarHeight() - translationY) - this.backgroundPaddingTop)) / ((float) (AndroidUtilities.dp(4.0f) + iDp2))) : 1.0f) <= 0.5f && ColorUtils.calculateLuminance(getThemedColor(Theme.key_dialogBackground)) > 0.699999988079071d;
        if (z2 != this.wasLight) {
            this.wasLight = z2;
            AndroidUtilities.setLightStatusBar(this, z2);
        }
    }

    private void updatePlaybackButton(boolean z) {
        if (this.playbackSpeedButton == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
        this.speedIcon.setValue(playbackSpeed, z);
        this.speedSlider.setSpeed(playbackSpeed, z);
        updateColors();
        boolean z2 = this.slidingSpeed;
        this.slidingSpeed = false;
        for (int i = 0; i < this.speedItems.length; i++) {
            if (z2 || !equals(playbackSpeed, speeds[i])) {
                ActionBarMenuSubItem actionBarMenuSubItem = this.speedItems[i];
                int i2 = Theme.key_actionBarDefaultSubmenuItem;
                actionBarMenuSubItem.setColors(getThemedColor(i2), getThemedColor(i2));
            } else {
                ActionBarMenuSubItem actionBarMenuSubItem2 = this.speedItems[i];
                int i3 = Theme.key_featuredStickers_addButtonPressed;
                actionBarMenuSubItem2.setColors(getThemedColor(i3), getThemedColor(i3));
            }
        }
    }

    public void updateProgress(MessageObject messageObject) {
        updateProgress(messageObject, false);
    }

    private void updateSubMenu() {
        setMenuItemChecked(this.shuffleListItem, SharedConfig.shuffleMusic);
        setMenuItemChecked(this.reverseOrderItem, SharedConfig.playOrderReversed);
        setMenuItemChecked(this.repeatListItem, SharedConfig.repeatMode == 1);
        setMenuItemChecked(this.repeatSongItem, SharedConfig.repeatMode == 2);
    }

    private void updateTitle(boolean z) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if ((playingMessageObject == null && z) || (playingMessageObject != null && !playingMessageObject.isMusic())) {
            lambda$showGiftOfferSheet$15();
            return;
        }
        if (playingMessageObject == null) {
            this.lastMessageObject = null;
            return;
        }
        boolean z2 = playingMessageObject == this.lastMessageObject;
        this.lastMessageObject = playingMessageObject;
        if (playingMessageObject.eventId != 0 || playingMessageObject.getId() <= -2000000000) {
            this.optionsButton.setVisibility(4);
        } else {
            this.optionsButton.setVisibility(0);
        }
        long dialogId = playingMessageObject.getDialogId();
        long j = playingMessageObject.getDocument() != null ? playingMessageObject.getDocument().id : 0L;
        boolean z3 = (dialogId < 0 && MessagesController.getInstance(this.currentAccount).isPeerNoForwards(dialogId)) || MessagesController.getInstance(this.currentAccount).isPeerNoForwards(playingMessageObject.getDialogId()) || playingMessageObject.messageOwner.noforwards;
        if (z3 != this.noforwards) {
            this.noforwards = z3;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.playerLayout.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(((z3 || isMyList()) ? 0 : 52) + 179);
            this.playerLayout.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.playerShadow.getLayoutParams();
            layoutParams2.bottomMargin = AndroidUtilities.dp(179 + ((isMyList() || z3) ? 0 : 52));
            this.playerShadow.setLayoutParams(layoutParams2);
        }
        if (z3) {
            this.optionsButton.hideSubItem(1);
            this.optionsButton.hideSubItem(2);
            this.optionsButton.hideSubItem(5);
            this.optionsButton.hideSubItem(6);
            this.optionsButton.setAdditionalYOffset(-AndroidUtilities.dp(16.0f));
        } else {
            this.optionsButton.showSubItem(1);
            this.optionsButton.showSubItem(2);
            this.optionsButton.showSubItem(5);
            this.optionsButton.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        }
        checkIfMusicDownloaded(playingMessageObject);
        boolean z4 = !z2;
        updateProgress(playingMessageObject, z4);
        updateCover(playingMessageObject, z4);
        if (MediaController.getInstance().isMessagePaused()) {
            this.playPauseDrawable.setPause(false);
            this.playButton.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
        } else {
            this.playPauseDrawable.setPause(true);
            this.playButton.setContentDescription(LocaleController.getString(R.string.AccActionPause));
        }
        String musicTitle = playingMessageObject.getMusicTitle();
        String musicAuthor = playingMessageObject.getMusicAuthor();
        this.titleTextView.setText(musicTitle);
        this.authorTextView.setText(musicAuthor);
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        this.saveToProfileButton.setLoading(savedMusicIds.loading);
        setVisibleInProfile(savedMusicIds.ids.contains(Long.valueOf(j)));
        int duration = (int) playingMessageObject.getDuration();
        this.lastDuration = duration;
        TextView textView = this.durationTextView;
        if (textView != null) {
            textView.setText(duration != 0 ? AndroidUtilities.formatShortDuration(duration) : "-:--");
        }
        if (duration > 600) {
            this.playbackSpeedButton.setVisibility(0);
        } else {
            this.playbackSpeedButton.setVisibility(8);
        }
        if (z2) {
            return;
        }
        preloadNeighboringThumbs();
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        AudioPlayerCell audioPlayerCell;
        MessageObject messageObject;
        AudioPlayerCell audioPlayerCell2;
        MessageObject messageObject2;
        MessageObject playingMessageObject;
        if (i == NotificationCenter.messagePlayingDidStart || i == NotificationCenter.messagePlayingPlayStateChanged || i == NotificationCenter.messagePlayingDidReset) {
            int i3 = NotificationCenter.messagePlayingDidReset;
            updateTitle(i == i3 && ((Boolean) objArr[1]).booleanValue());
            if (i == i3 || i == NotificationCenter.messagePlayingPlayStateChanged) {
                int childCount = this.listView.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = this.listView.getChildAt(i4);
                    if ((childAt instanceof AudioPlayerCell) && (messageObject = (audioPlayerCell = (AudioPlayerCell) childAt).getMessageObject()) != null && (messageObject.isVoice() || messageObject.isMusic())) {
                        audioPlayerCell.updateButtonState(false, true);
                    }
                }
                if (i == NotificationCenter.messagePlayingPlayStateChanged && MediaController.getInstance().getPlayingMessageObject() != null) {
                    if (MediaController.getInstance().isMessagePaused()) {
                        startForwardRewindingSeek();
                    } else if (this.rewindingState == 1 && this.rewindingProgress != -1.0f) {
                        AndroidUtilities.cancelRunOnUIThread(this.forwardSeek);
                        this.lastUpdateRewindingPlayerTime = 0L;
                        this.forwardSeek.run();
                        this.rewindingProgress = -1.0f;
                    }
                }
            } else {
                if (((MessageObject) objArr[0]).eventId != 0) {
                    return;
                }
                int childCount2 = this.listView.getChildCount();
                for (int i5 = 0; i5 < childCount2; i5++) {
                    View childAt2 = this.listView.getChildAt(i5);
                    if ((childAt2 instanceof AudioPlayerCell) && (messageObject2 = (audioPlayerCell2 = (AudioPlayerCell) childAt2).getMessageObject()) != null && (messageObject2.isVoice() || messageObject2.isMusic())) {
                        audioPlayerCell2.updateButtonState(false, true);
                    }
                }
            }
            ChooseQualityLayout.QualityIcon qualityIcon = this.optionsIcon;
            if (qualityIcon != null) {
                qualityIcon.setCasting(CastSync.isActive(), true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagePlayingProgressDidChanged) {
            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject2 == null || !playingMessageObject2.isMusic()) {
                return;
            }
            updateProgress(playingMessageObject2);
            return;
        }
        if (i == NotificationCenter.messagePlayingSpeedChanged) {
            updatePlaybackButton(true);
            return;
        }
        if (i == NotificationCenter.musicDidLoad) {
            this.savedMusicList = MediaController.getInstance().currentSavedMusicList;
            this.playlist = MediaController.getInstance().getPlaylist();
            this.listAdapter.notifyDataSetChanged();
            return;
        }
        if (i == NotificationCenter.moreMusicDidLoad) {
            this.savedMusicList = MediaController.getInstance().currentSavedMusicList;
            this.playlist = MediaController.getInstance().getPlaylist();
            this.listAdapter.notifyDataSetChanged();
            if (SharedConfig.playOrderReversed) {
                this.listView.stopScroll();
                int iIntValue = ((Integer) objArr[0]).intValue();
                this.layoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
                if (iFindLastVisibleItemPosition != -1) {
                    View viewFindViewByPosition = this.layoutManager.findViewByPosition(iFindLastVisibleItemPosition);
                    this.layoutManager.scrollToPositionWithOffset(iFindLastVisibleItemPosition + iIntValue, viewFindViewByPosition != null ? viewFindViewByPosition.getTop() : 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileLoaded) {
            if (((String) objArr[0]).equals(this.currentFile)) {
                updateTitle(false);
                this.currentAudioFinishedLoading = true;
                return;
            }
            return;
        }
        if (i != NotificationCenter.fileLoadProgressChanged) {
            if (i == NotificationCenter.musicIdsLoaded) {
                updateTitle(false);
                return;
            }
            return;
        }
        if (!((String) objArr[0]).equals(this.currentFile) || (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null) {
            return;
        }
        float bufferedProgressFromPosition = 1.0f;
        if (!this.currentAudioFinishedLoading) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - this.lastBufferedPositionCheck) >= 500) {
                bufferedProgressFromPosition = MediaController.getInstance().isStreamingCurrentAudio() ? FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(playingMessageObject.audioProgress, this.currentFile) : 1.0f;
                this.lastBufferedPositionCheck = jElapsedRealtime;
            } else {
                bufferedProgressFromPosition = -1.0f;
            }
        }
        if (bufferedProgressFromPosition != -1.0f) {
            SpringAnimation springAnimation = this.seekBarBufferSpring;
            springAnimation.mSpring.mFinalPosition = bufferedProgressFromPosition * 1000.0f;
            springAnimation.start();
        }
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.musicDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.moreMusicDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.musicIdsLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.messagePlayingSpeedChanged);
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
        if (instance == this) {
            instance = null;
        }
    }

    @Override
    public int getContainerViewHeight() {
        if (this.playerLayout == null) {
            return 0;
        }
        if (this.playlist.size() <= 1) {
            return this.playerLayout.getMeasuredHeight() + this.backgroundPaddingTop;
        }
        int iDp = AndroidUtilities.dp(13.0f);
        int translationY = (int) (this.listView.getTranslationY() + ((this.scrollOffsetY - this.backgroundPaddingTop) - iDp));
        if (this.backgroundPaddingTop + translationY < ActionBar.getCurrentActionBarHeight()) {
            float fDp = AndroidUtilities.dp(4.0f) + iDp;
            translationY -= (int) ((ActionBar.getCurrentActionBarHeight() - fDp) * Math.min(1.0f, ((ActionBar.getCurrentActionBarHeight() - translationY) - this.backgroundPaddingTop) / fDp));
        }
        return this.container.getMeasuredHeight() - (translationY + AndroidUtilities.statusBarHeight);
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ColorPicker$$ExternalSyntheticLambda7 colorPicker$$ExternalSyntheticLambda7 = new ColorPicker$$ExternalSyntheticLambda7(this, 1);
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_player_actionBarTitle;
        arrayList.add(new ThemeDescription(actionBar, 64, null, null, null, colorPicker$$ExternalSyntheticLambda7, i));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 1024, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_player_actionBarSelector));
        arrayList.add(new ThemeDescription(this.actionBar, 134217728, null, null, null, null, i));
        ActionBar actionBar2 = this.actionBar;
        int i2 = Theme.key_player_time;
        arrayList.add(new ThemeDescription(actionBar2, 67108864, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AudioPlayerCell.class}, null, null, null, Theme.key_chat_inLoader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AudioPlayerCell.class}, null, null, null, Theme.key_chat_outLoader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AudioPlayerCell.class}, null, null, null, Theme.key_chat_inLoaderSelected));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AudioPlayerCell.class}, null, null, null, Theme.key_chat_inMediaIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AudioPlayerCell.class}, null, null, null, Theme.key_chat_inMediaIconSelected));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AudioPlayerCell.class}, null, null, null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AudioPlayerCell.class}, null, null, null, Theme.key_chat_inAudioSelectedProgress));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AudioPlayerCell.class}, null, null, null, Theme.key_chat_inAudioProgress));
        arrayList.add(new ThemeDescription(this.containerView, 0, null, null, new Drawable[]{this.shadowDrawable}, null, Theme.key_dialogBackground));
        LineProgressView lineProgressView = this.progressView;
        int i3 = Theme.key_player_progressBackground;
        arrayList.add(new ThemeDescription(lineProgressView, 0, null, null, null, null, i3));
        LineProgressView lineProgressView2 = this.progressView;
        int i4 = Theme.key_player_progress;
        arrayList.add(new ThemeDescription(lineProgressView2, 0, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.seekBarView, 0, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.seekBarView, 0, null, null, null, null, Theme.key_player_progressCachedBackground));
        arrayList.add(new ThemeDescription(this.seekBarView, 2048, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.playbackSpeedButton, 262152, null, null, null, null, Theme.key_inappPlayerPlayPause));
        arrayList.add(new ThemeDescription(this.playbackSpeedButton, 262152, null, null, null, null, Theme.key_inappPlayerClose));
        ActionBarMenuItem actionBarMenuItem = this.repeatButton;
        int i5 = Theme.key_player_button;
        arrayList.add(new ThemeDescription(actionBarMenuItem, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, i5));
        arrayList.add(new ThemeDescription(this.repeatButton, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, Theme.key_player_buttonActive));
        ActionBarMenuItem actionBarMenuItem2 = this.repeatButton;
        int i6 = Theme.key_listSelector;
        arrayList.add(new ThemeDescription(actionBarMenuItem2, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, i6));
        ActionBarMenuItem actionBarMenuItem3 = this.repeatButton;
        int i7 = Theme.key_actionBarDefaultSubmenuItem;
        arrayList.add(new ThemeDescription(actionBarMenuItem3, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, i7));
        ActionBarMenuItem actionBarMenuItem4 = this.repeatButton;
        int i8 = Theme.key_actionBarDefaultSubmenuBackground;
        arrayList.add(new ThemeDescription(actionBarMenuItem4, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, i8));
        arrayList.add(new ThemeDescription(this.optionsButton, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, i5));
        arrayList.add(new ThemeDescription(this.optionsButton, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, i6));
        arrayList.add(new ThemeDescription(this.optionsButton, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, i7));
        arrayList.add(new ThemeDescription(this.optionsButton, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, i8));
        RLottieImageView rLottieImageView = this.prevButton;
        arrayList.add(new ThemeDescription(rLottieImageView, (Class[]) null, new RLottieDrawable[]{rLottieImageView.getAnimatedDrawable()}, "Triangle 3", i5));
        RLottieImageView rLottieImageView2 = this.prevButton;
        arrayList.add(new ThemeDescription(rLottieImageView2, (Class[]) null, new RLottieDrawable[]{rLottieImageView2.getAnimatedDrawable()}, "Triangle 4", i5));
        RLottieImageView rLottieImageView3 = this.prevButton;
        arrayList.add(new ThemeDescription(rLottieImageView3, (Class[]) null, new RLottieDrawable[]{rLottieImageView3.getAnimatedDrawable()}, "Rectangle 4", i5));
        arrayList.add(new ThemeDescription(this.prevButton, 131080, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.playButton, 8, null, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.playButton, 131080, null, null, null, null, i6));
        RLottieImageView rLottieImageView4 = this.nextButton;
        arrayList.add(new ThemeDescription(rLottieImageView4, (Class[]) null, new RLottieDrawable[]{rLottieImageView4.getAnimatedDrawable()}, "Triangle 3", i5));
        RLottieImageView rLottieImageView5 = this.nextButton;
        arrayList.add(new ThemeDescription(rLottieImageView5, (Class[]) null, new RLottieDrawable[]{rLottieImageView5.getAnimatedDrawable()}, "Triangle 4", i5));
        RLottieImageView rLottieImageView6 = this.nextButton;
        arrayList.add(new ThemeDescription(rLottieImageView6, (Class[]) null, new RLottieDrawable[]{rLottieImageView6.getAnimatedDrawable()}, "Rectangle 4", i5));
        arrayList.add(new ThemeDescription(this.nextButton, 131080, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.playerLayout, 1, null, null, null, null, Theme.key_player_background));
        arrayList.add(new ThemeDescription(this.playerShadow, 1, null, null, null, null, Theme.key_dialogShadowLine));
        arrayList.add(new ThemeDescription(this.emptyImageView, 8, null, null, null, null, Theme.key_dialogEmptyImage));
        TextView textView = this.emptyTitleTextView;
        int i9 = Theme.key_dialogEmptyText;
        arrayList.add(new ThemeDescription(textView, 8, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.emptySubtitleTextView, 8, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_dialogScrollGlow));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.progressView, 4, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.progressView, 2048, null, null, null, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.durationTextView, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.timeTextView, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.titleTextView.getTextView(), 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.titleTextView.getNextTextView(), 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.authorTextView.getTextView(), 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.authorTextView.getNextTextView(), 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.containerView, 0, null, null, null, null, Theme.key_sheet_scrollUp));
        return arrayList;
    }

    @Override
    public boolean isTouchOutside(float f, float f2) {
        FrameLayout frameLayout = this.topBulletinContainer;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.topBulletinContainer.getChildAt(0);
            if (f2 >= childAt.getY() + this.topBulletinContainer.getY()) {
                if (f2 <= childAt.getY() + this.topBulletinContainer.getY() + childAt.getHeight()) {
                    if (f >= childAt.getX() + this.topBulletinContainer.getX()) {
                        if (f <= childAt.getX() + this.topBulletinContainer.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        int top = this.containerView.getTop();
        Drawable drawable = this.shadowDrawable;
        return f2 < ((float) (top + (drawable != null ? drawable.getBounds().top : 0))) || f < ((float) this.containerView.getLeft()) || f > ((float) this.containerView.getRight());
    }

    @Override
    public void lambda$openCrafting$8() {
        ActionBar actionBar = this.actionBar;
        if (actionBar != null && actionBar.isSearchFieldVisible()) {
            this.actionBar.closeSearchField();
        } else if (this.blurredView.getTag() != null) {
            showAlbumCover(false, true);
        } else {
            super.lambda$openCrafting$8();
        }
    }

    @Override
    public boolean onCustomLayout(View view, int i, int i2, int i3, int i4) {
        FrameLayout frameLayout = this.blurredView;
        if (view != frameLayout) {
            return false;
        }
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), this.blurredView.getMeasuredHeight());
        return true;
    }

    @Override
    public boolean onCustomMeasure(View view, int i, int i2) {
        if (view != this.blurredView) {
            return false;
        }
        this.blurredView.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), 1073741824));
        return true;
    }

    @Override
    public void onFailedDownload(String str, boolean z) {
    }

    @Override
    public void onProgressDownload(String str, long j, long j2) {
        this.progressView.setProgress(Math.min(1.0f, j / j2), true);
    }

    @Override
    public void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public void onSuccessDownload(String str) {
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    @Override
    public void show() {
        super.show();
        instance = this;
    }

    public void updateColors() {
        if (this.playbackSpeedButton != null) {
            int themedColor = getThemedColor(!equals(MediaController.getInstance().getPlaybackSpeed(true), 1.0f) ? Theme.key_featuredStickers_addButtonPressed : Theme.key_inappPlayerClose);
            SpeedIconDrawable speedIconDrawable = this.speedIcon;
            if (speedIconDrawable != null) {
                speedIconDrawable.setColor(themedColor);
            }
            this.playbackSpeedButton.setBackground(Theme.createSelectorDrawable(themedColor & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        ActionBarMenuSubItem actionBarMenuSubItem = this.castItem;
        if (actionBarMenuSubItem != null) {
            CastMediaRouteButton castMediaRouteButton = this.castItemButton;
            boolean z = castMediaRouteButton != null && castMediaRouteButton.isConnected();
            int themedColor2 = getThemedColor(Theme.key_actionBarDefaultSubmenuItem);
            int themedColor3 = getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon);
            int i = Theme.key_featuredStickers_addButton;
            actionBarMenuSubItem.setEnabledByColor(z, themedColor2, themedColor3, getThemedColor(i));
            ActionBarMenuSubItem actionBarMenuSubItem2 = this.castItem;
            CastMediaRouteButton castMediaRouteButton2 = this.castItemButton;
            actionBarMenuSubItem2.setSelectorColor((castMediaRouteButton2 == null || !castMediaRouteButton2.isConnected()) ? getThemedColor(Theme.key_listSelector) : Theme.multAlpha(0.1f, getThemedColor(i)));
        }
    }

    public void updateRepeatButton() {
        int i = SharedConfig.repeatMode;
        if (i != 0 && i != 1) {
            if (i == 2) {
                this.repeatButton.setIcon(R.drawable.player_new_repeatone);
                ActionBarMenuItem actionBarMenuItem = this.repeatButton;
                int i2 = Theme.key_player_buttonActive;
                actionBarMenuItem.setTag(Integer.valueOf(i2));
                this.repeatButton.setIconColor(getThemedColor(i2));
                Theme.setSelectorDrawableColor(this.repeatButton.getBackground(), 436207615 & getThemedColor(i2), true);
                this.repeatButton.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOne));
                return;
            }
            return;
        }
        if (SharedConfig.shuffleMusic) {
            if (i == 0) {
                this.repeatButton.setIcon(R.drawable.player_new_shuffle);
            } else {
                this.repeatButton.setIcon(R.drawable.player_new_repeat_shuffle);
            }
        } else if (!SharedConfig.playOrderReversed) {
            this.repeatButton.setIcon(R.drawable.player_new_repeatall);
        } else if (i == 0) {
            this.repeatButton.setIcon(R.drawable.player_new_order);
        } else {
            this.repeatButton.setIcon(R.drawable.player_new_repeat_reverse);
        }
        if (i == 0 && !SharedConfig.shuffleMusic && !SharedConfig.playOrderReversed) {
            ActionBarMenuItem actionBarMenuItem2 = this.repeatButton;
            int i3 = Theme.key_player_button;
            actionBarMenuItem2.setTag(Integer.valueOf(i3));
            this.repeatButton.setIconColor(getThemedColor(i3));
            Theme.setSelectorDrawableColor(this.repeatButton.getBackground(), getThemedColor(Theme.key_listSelector), true);
            this.repeatButton.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOff));
            return;
        }
        ActionBarMenuItem actionBarMenuItem3 = this.repeatButton;
        int i4 = Theme.key_player_buttonActive;
        actionBarMenuItem3.setTag(Integer.valueOf(i4));
        this.repeatButton.setIconColor(getThemedColor(i4));
        Theme.setSelectorDrawableColor(this.repeatButton.getBackground(), 436207615 & getThemedColor(i4), true);
        if (i != 0) {
            this.repeatButton.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatList));
        } else if (SharedConfig.shuffleMusic) {
            this.repeatButton.setContentDescription(LocaleController.getString(R.string.ShuffleList));
        } else {
            this.repeatButton.setContentDescription(LocaleController.getString(R.string.ReverseOrder));
        }
    }

    private void updateProgress(MessageObject messageObject, boolean z) {
        boolean z2;
        int duration;
        SeekBarView seekBarView = this.seekBarView;
        if (seekBarView != null) {
            if (seekBarView.isDragging()) {
                duration = (int) (messageObject.getDuration() * ((double) this.seekBarView.getProgress()));
            } else {
                if (this.rewindingProgress >= 0.0f) {
                    int i = this.rewindingState;
                    z2 = true;
                    if (i != -1 && (i != 1 || !MediaController.getInstance().isMessagePaused())) {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.seekBarView.setProgress(this.rewindingProgress, z);
                } else {
                    this.seekBarView.setProgress(messageObject.audioProgress, z);
                }
                float bufferedProgressFromPosition = 1.0f;
                if (!this.currentAudioFinishedLoading) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (Math.abs(jElapsedRealtime - this.lastBufferedPositionCheck) >= 500) {
                        bufferedProgressFromPosition = MediaController.getInstance().isStreamingCurrentAudio() ? FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(messageObject.audioProgress, this.currentFile) : 1.0f;
                        this.lastBufferedPositionCheck = jElapsedRealtime;
                    } else {
                        bufferedProgressFromPosition = -1.0f;
                    }
                }
                if (bufferedProgressFromPosition != -1.0f) {
                    SpringAnimation springAnimation = this.seekBarBufferSpring;
                    springAnimation.mSpring.mFinalPosition = bufferedProgressFromPosition * 1000.0f;
                    springAnimation.start();
                }
                if (z2) {
                    duration = (int) (messageObject.getDuration() * ((double) this.seekBarView.getProgress()));
                    messageObject.audioProgressSec = duration;
                } else {
                    duration = messageObject.audioProgressSec;
                }
            }
            if (this.lastTime != duration) {
                this.lastTime = duration;
                this.timeTextView.setText(AndroidUtilities.formatShortDuration(duration));
            }
            this.seekBarView.updateTimestamps(messageObject, null);
        }
    }

    private void forward(MessageObject messageObject) {
        ArrayList arrayListM;
        TLRPC.TL_document tL_document;
        int i = UserConfig.selectedAccount;
        int i2 = this.currentAccount;
        if (i != i2) {
            this.parentActivity.switchToAccount(i2, true);
        }
        Bundle bundleM = TelegramMediaSession$$ExternalSyntheticOutline0.m("onlySelect", "dialogsType", 3, true);
        bundleM.putBoolean("canSelectTopics", true);
        DialogsActivity dialogsActivity = new DialogsActivity(bundleM);
        if (messageObject.getId() < 0) {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
            arrayListM = null;
        } else {
            arrayListM = MediaController$$ExternalSyntheticOutline1.m(messageObject);
            tL_document = null;
        }
        dialogsActivity.setDelegate(new AudioPlayerAlert$$ExternalSyntheticLambda2(0, this, arrayListM, tL_document, messageObject));
        this.parentActivity.lambda$runLinkRequest$100(dialogsActivity);
        lambda$showGiftOfferSheet$15();
    }
}
