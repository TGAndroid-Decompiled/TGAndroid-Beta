package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.zzcl;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import java.io.File;
import java.util.ArrayList;
import java.util.WeakHashMap;
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
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda33;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda54;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.CallLogActivity;
import org.telegram.ui.CastSync;
import org.telegram.ui.Cells.AudioPlayerCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda208;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda267;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda326;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda470;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda62;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda94;
import org.telegram.ui.ChooseQualityLayout$QualityIcon;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.AuctionBidSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda12;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda22;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda130;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda133;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.SecretVoicePlayer$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.SelectAudioAlert;
import org.telegram.ui.TopicsFragment;

public final class AudioPlayerAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static AudioPlayerAlert instance;
    public static final float[] speeds = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final int TAG;
    public final AnonymousClass3 actionBar;
    public AnimatorSet actionBarAnimation;
    public final View actionBarBackground;
    public final View actionBarShadow;
    public float actionBarSlide;
    public final PhotoViewer.AnonymousClass5 actionBarSlideProperty;
    public final ActionBarMenuItem addItem;
    public final AnonymousClass7 authorTextView;
    public final BackupImageView bigAlbumConver;
    public boolean blurredAnimationInProgress;
    public final AnonymousClass5 blurredView;
    public final View[] buttons;
    public final boolean castAvailable;
    public ActionBarMenuSubItem castItem;
    public final PhotoViewer.AnonymousClass17 castItemButton;
    public final AnonymousClass6 coverContainer;
    public boolean currentAudioFinishedLoading;
    public String currentFile;
    public final TextView durationTextView;
    public final ImageView emptyImageView;
    public final TextView emptySubtitleTextView;
    public final TextView emptyTitleTextView;
    public final LinearLayout emptyView;
    public final BubbleActivity.AnonymousClass1 forwardSeek;
    public final boolean isProfilePlaylist;
    public final ItemTouchHelper itemTouchHelper;
    public long lastBufferedPositionCheck;
    public int lastDuration;
    public MessageObject lastMessageObject;
    public long lastPlaybackClick;
    public long lastRewindingTime;
    public int lastTime;
    public long lastUpdateRewindingPlayerTime;
    public final LinearLayoutManager layoutManager;
    public final ListAdapter listAdapter;
    public final AnonymousClass15 listView;
    public final AnonymousClass13 nextButton;
    public boolean noforwards;
    public final ActionBarMenuItem optionsButton;
    public final ChooseQualityLayout$QualityIcon optionsIcon;
    public final boolean padWithItem;
    public final LaunchActivity parentActivity;
    public final ImageView playButton;
    public final PlayPauseDrawable playPauseDrawable;
    public final ActionBarMenuItem playbackSpeedButton;
    public final AnonymousClass5 playerLayout;
    public final View playerShadow;
    public ArrayList playlist;
    public final AnonymousClass12 prevButton;
    public final LineProgressView progressView;
    public final ActionBarMenuItem repeatButton;
    public final ActionBarMenuSubItem repeatListItem;
    public final ActionBarMenuSubItem repeatSongItem;
    public final ActionBarMenuSubItem reverseOrderItem;
    public int rewindingForwardPressedCount;
    public float rewindingProgress;
    public int rewindingState;
    public ValueAnimator rightPaddingAnimator;
    public final ButtonWithCounterView saveToProfileButton;
    public MessagesController.SavedMusicList savedMusicList;
    public int scrollOffsetY;
    public boolean scrollToSong;
    public final ActionBarMenuItem searchItem;
    public int searchOpenOffset;
    public int searchOpenPosition;
    public boolean searchWas;
    public boolean searching;
    public final SpringAnimation seekBarBufferSpring;
    public final AnonymousClass9 seekBarView;
    public final ActionBarMenuSubItem shuffleListItem;
    public boolean slidingSpeed;
    public AnonymousClass20 speedHintView;
    public final CanvasButton.AnonymousClass2 speedIcon;
    public final ActionBarMenuSubItem[] speedItems;
    public final ActionBarMenuSlider.SpeedSlider speedSlider;
    public final SimpleTextView timeTextView;
    public final AnonymousClass7 titleTextView;
    public final ButtonWithCounterView unsaveFromProfileButton;
    public boolean wasLight;

    public final class AnonymousClass12 extends RLottieImageView {
        public final AnonymousClass1 backSeek;
        public long lastTime;
        public long lastUpdateTime;
        public int pressedCount;
        public final AnonymousClass1 pressedRunnable;
        public long startTime;
        public float startX;
        public float startY;
        public final float val$touchSlop;

        public final class AnonymousClass1 implements Runnable {
            public final int $r8$classId;
            public final AnonymousClass12 this$1;

            public AnonymousClass1(AnonymousClass12 anonymousClass12, int i) {
                this.$r8$classId = i;
                this.this$1 = anonymousClass12;
            }

            @Override
            public final void run() {
                switch (this.$r8$classId) {
                    case 0:
                        AnonymousClass12 anonymousClass12 = this.this$1;
                        int i = anonymousClass12.pressedCount + 1;
                        anonymousClass12.pressedCount = i;
                        if (i == 1) {
                            AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
                            audioPlayerAlert.rewindingState = -1;
                            audioPlayerAlert.rewindingProgress = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                            anonymousClass12.lastTime = System.currentTimeMillis();
                            AndroidUtilities.runOnUIThread(this, 2000L);
                            AndroidUtilities.runOnUIThread(anonymousClass12.backSeek);
                        } else if (i == 2) {
                            AndroidUtilities.runOnUIThread(this, 2000L);
                        }
                        break;
                    default:
                        long duration = MediaController.getInstance().getDuration();
                        AnonymousClass12 anonymousClass13 = this.this$1;
                        if (duration == 0 || duration == -9223372036854775807L) {
                            anonymousClass13.lastTime = System.currentTimeMillis();
                            break;
                        } else {
                            float f = AudioPlayerAlert.this.rewindingProgress;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            long j = jCurrentTimeMillis - anonymousClass13.lastTime;
                            anonymousClass13.lastTime = jCurrentTimeMillis;
                            long j2 = jCurrentTimeMillis - anonymousClass13.lastUpdateTime;
                            int i2 = anonymousClass13.pressedCount;
                            float f2 = duration;
                            float f3 = ((long) ((f * f2) - (j * (i2 == 1 ? 3L : i2 == 2 ? 6L : 12L)))) / f2;
                            if (f3 < 0.0f) {
                                f3 = 0.0f;
                            }
                            AudioPlayerAlert.this.rewindingProgress = f3;
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (playingMessageObject != null && playingMessageObject.isMusic()) {
                                AudioPlayerAlert.this.updateProgress(playingMessageObject, false);
                            }
                            AudioPlayerAlert audioPlayerAlert2 = AudioPlayerAlert.this;
                            if (audioPlayerAlert2.rewindingState == -1 && anonymousClass13.pressedCount > 0) {
                                if (j2 > 200 || audioPlayerAlert2.rewindingProgress == 0.0f) {
                                    anonymousClass13.lastUpdateTime = jCurrentTimeMillis;
                                    if (audioPlayerAlert2.rewindingProgress == 0.0f) {
                                        MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                        MediaController.getInstance().pauseByRewind();
                                    } else {
                                        MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f3);
                                    }
                                }
                                if (anonymousClass13.pressedCount > 0 && AudioPlayerAlert.this.rewindingProgress > 0.0f) {
                                    AndroidUtilities.runOnUIThread(anonymousClass13.backSeek, 16L);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        }

        public AnonymousClass12(Activity activity, float f) {
            super(activity);
            this.val$touchSlop = f;
            this.pressedCount = 0;
            this.pressedRunnable = new AnonymousClass1(this, 0);
            this.backSeek = new AnonymousClass1(this, 1);
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.addAction(16);
        }

        @Override
        public final boolean onTouchEvent(android.view.MotionEvent r11) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AudioPlayerAlert.AnonymousClass12.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public final class AnonymousClass13 extends RLottieImageView {
        public boolean pressed;
        public final BubbleActivity.AnonymousClass1 pressedRunnable;
        public float startX;
        public float startY;
        public final float val$touchSlop;

        public AnonymousClass13(Activity activity, float f) {
            super(activity);
            this.val$touchSlop = f;
            this.pressedRunnable = new BubbleActivity.AnonymousClass1(this, 10);
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.addAction(16);
        }

        @Override
        public final boolean onTouchEvent(android.view.MotionEvent r9) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AudioPlayerAlert.AnonymousClass13.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public final class AnonymousClass2 extends FrameLayout {
        public boolean ignoreLayout;
        public int lastMeasturedHeight;
        public int lastMeasturedWidth;
        public final RectF rect;

        public AnonymousClass2(Activity activity) {
            super(activity);
            this.rect = new RectF();
            this.ignoreLayout = false;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            Bulletin.addDelegate(this, new ChatActivity.AnonymousClass103(this, 3));
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            Bulletin.removeDelegate(this);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float f;
            float fMin;
            float f2;
            float f3;
            AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
            int size = audioPlayerAlert.playlist.size();
            AnonymousClass3 anonymousClass3 = audioPlayerAlert.actionBar;
            boolean z = audioPlayerAlert.isProfilePlaylist;
            if (size <= 1) {
                ((BottomSheet) audioPlayerAlert).shadowDrawable.setBounds(0, (getMeasuredHeight() - audioPlayerAlert.playerLayout.getMeasuredHeight()) - ((BottomSheet) audioPlayerAlert).backgroundPaddingTop, getMeasuredWidth(), getMeasuredHeight());
                ((BottomSheet) audioPlayerAlert).shadowDrawable.draw(canvas);
                if (z) {
                    anonymousClass3.setVisibility(8);
                    return;
                }
                return;
            }
            AnonymousClass15 anonymousClass15 = audioPlayerAlert.listView;
            if (anonymousClass15.getVisibility() != 0) {
                return;
            }
            int iDp = AndroidUtilities.dp(13.0f);
            int translationY = (int) (anonymousClass15.getTranslationY() + ((audioPlayerAlert.scrollOffsetY - ((BottomSheet) audioPlayerAlert).backgroundPaddingTop) - iDp));
            if (z) {
                translationY = (translationY - ActionBar.getCurrentActionBarHeight()) + AndroidUtilities.dp(10.0f);
            }
            int iDp2 = AndroidUtilities.dp(20.0f) + translationY;
            int iDp3 = ((BottomSheet) audioPlayerAlert).backgroundPaddingTop + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
            if (z || ((BottomSheet) audioPlayerAlert).backgroundPaddingTop + translationY >= ActionBar.getCurrentActionBarHeight()) {
                f = 1.0f;
                fMin = 0.0f;
            } else {
                float fDp = AndroidUtilities.dp(4.0f) + iDp;
                fMin = Math.min(1.0f, ((ActionBar.getCurrentActionBarHeight() - translationY) - ((BottomSheet) audioPlayerAlert).backgroundPaddingTop) / fDp);
                int currentActionBarHeight = (int) ((ActionBar.getCurrentActionBarHeight() - fDp) * fMin);
                translationY -= currentActionBarHeight;
                iDp2 -= currentActionBarHeight;
                iDp3 += currentActionBarHeight;
                f = 1.0f - fMin;
            }
            int i = (int) ((1.0f - fMin) * AndroidUtilities.statusBarHeight);
            int i2 = translationY + i;
            int i3 = iDp2 + i;
            ((BottomSheet) audioPlayerAlert).shadowDrawable.setBounds(0, i2, getMeasuredWidth(), iDp3);
            ((BottomSheet) audioPlayerAlert).shadowDrawable.draw(canvas);
            RectF rectF = this.rect;
            if (z || f == 1.0f) {
                f2 = 10.0f;
                f3 = 4.0f;
            } else {
                Theme.dialogs_onlineCirclePaint.setColor(audioPlayerAlert.getThemedColor(Theme.key_dialogBackground));
                f2 = 10.0f;
                f3 = 4.0f;
                rectF.set(((BottomSheet) audioPlayerAlert).backgroundPaddingLeft, ((BottomSheet) audioPlayerAlert).backgroundPaddingTop + i2, getMeasuredWidth() - ((BottomSheet) audioPlayerAlert).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) audioPlayerAlert).backgroundPaddingTop + i2);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f, AndroidUtilities.dp(12.0f) * f, Theme.dialogs_onlineCirclePaint);
            }
            if (!z && f != 0.0f) {
                int iDp4 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - iDp4) / 2, i3, (getMeasuredWidth() + iDp4) / 2, AndroidUtilities.dp(f3) + i3);
                int themedColor = audioPlayerAlert.getThemedColor(Theme.key_sheet_scrollUp);
                int iAlpha = Color.alpha(themedColor);
                Theme.dialogs_onlineCirclePaint.setColor(themedColor);
                Theme.dialogs_onlineCirclePaint.setAlpha((int) (iAlpha * 1.0f * f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
            }
            if (z) {
                anonymousClass3.setVisibility(0);
                anonymousClass3.setTranslationY(Math.max(0.0f, DiffUtil.m(1.0f, audioPlayerAlert.actionBarSlide, AndroidUtilities.dp(6.0f), (i2 - ((BottomSheet) audioPlayerAlert).backgroundPaddingTop) - AndroidUtilities.dp(f2)) - anonymousClass3.getTop()));
                audioPlayerAlert.actionBarShadow.setTranslationY(Math.max(0.0f, DiffUtil.m(1.0f, audioPlayerAlert.actionBarSlide, AndroidUtilities.dp(6.0f), (i2 - ((BottomSheet) audioPlayerAlert).backgroundPaddingTop) - AndroidUtilities.dp(f2)) - anonymousClass3.getTop()));
            }
        }

        @Override
        public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AudioPlayerAlert.AnonymousClass2.onInterceptTouchEvent(android.view.MotionEvent):boolean");
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
            AudioPlayerAlert.access$1900(audioPlayerAlert);
            audioPlayerAlert.updateEmptyViewPosition$1();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int iDp;
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int i3 = this.lastMeasturedHeight;
            AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
            if (size != i3 || size2 != this.lastMeasturedWidth) {
                if (audioPlayerAlert.blurredView.getTag() != null) {
                    audioPlayerAlert.showAlbumCover(false, false);
                }
                this.lastMeasturedWidth = size2;
                this.lastMeasturedHeight = size;
            }
            this.ignoreLayout = true;
            audioPlayerAlert.playerLayout.setVisibility((audioPlayerAlert.searchWas || ((BottomSheet) audioPlayerAlert).keyboardVisible) ? 4 : 0);
            audioPlayerAlert.playerShadow.setVisibility(audioPlayerAlert.playerLayout.getVisibility());
            int paddingTop = size - getPaddingTop();
            AnonymousClass15 anonymousClass15 = audioPlayerAlert.listView;
            ((FrameLayout.LayoutParams) anonymousClass15.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((FrameLayout.LayoutParams) audioPlayerAlert.actionBarShadow.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((FrameLayout.LayoutParams) audioPlayerAlert.blurredView.getLayoutParams()).topMargin = -getPaddingTop();
            int iDp2 = AndroidUtilities.dp(179 + ((audioPlayerAlert.isMyList() || audioPlayerAlert.noforwards) ? 0 : 52));
            if (audioPlayerAlert.playlist.size() > 1) {
                iDp2 += (AndroidUtilities.dp(56.0f) * audioPlayerAlert.playlist.size()) + ((BottomSheet) audioPlayerAlert).backgroundPaddingTop;
            }
            if (audioPlayerAlert.searching || ((BottomSheet) audioPlayerAlert).keyboardVisible) {
                iDp = AndroidUtilities.dp(8.0f);
            } else {
                iDp = AndroidUtilities.dp(8.0f) + (iDp2 < paddingTop ? paddingTop - iDp2 : paddingTop - ((int) ((paddingTop / 5) * 3.5f)));
                if (iDp > paddingTop - AndroidUtilities.dp(((audioPlayerAlert.isMyList() || audioPlayerAlert.noforwards) ? 0 : 52) + 329)) {
                    iDp = paddingTop - AndroidUtilities.dp(((audioPlayerAlert.isMyList() || audioPlayerAlert.noforwards) ? 0 : 52) + 329);
                }
                if (iDp < 0) {
                    iDp = 0;
                }
            }
            if (audioPlayerAlert.padWithItem) {
                iDp = 0;
            }
            if (anonymousClass15.getPaddingTop() != iDp) {
                anonymousClass15.setPadding(0, iDp, 0, (audioPlayerAlert.searching && ((BottomSheet) audioPlayerAlert).keyboardVisible) ? 0 : anonymousClass15.getPaddingBottom());
            }
            this.ignoreLayout = false;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            getMeasuredHeight();
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return !AudioPlayerAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
        }

        @Override
        public final void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }
    }

    public final class AnonymousClass20 extends HintView {
        @Override
        public final void setVisibility(int i) {
            super.setVisibility(i);
            if (i != 0) {
                try {
                    ((ViewGroup) getParent()).removeView(this);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final class AnonymousClass6 extends CoverContainer {
        public long pressTime;

        public AnonymousClass6(Activity activity) {
            super(activity);
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
            if (action == 0) {
                if (this.imageViews[this.activeIndex].getImageReceiver().hasBitmapImage()) {
                    audioPlayerAlert.showAlbumCover(true, true);
                    this.pressTime = SystemClock.elapsedRealtime();
                }
            } else if (action != 2 && SystemClock.elapsedRealtime() - this.pressTime >= 400) {
                audioPlayerAlert.showAlbumCover(false, true);
            }
            return true;
        }
    }

    public final class AnonymousClass7 extends ClippingTextViewSwitcher {
        public final int $r8$classId;
        public final AudioPlayerAlert this$0;
        public final Activity val$context;

        public AnonymousClass7(AudioPlayerAlert audioPlayerAlert, Activity activity, Activity activity2, int i) {
            super(activity);
            this.$r8$classId = i;
            this.this$0 = audioPlayerAlert;
            this.val$context = activity2;
        }

        @Override
        public final TextView createTextView() {
            switch (this.$r8$classId) {
                case 0:
                    MarqueeTextView marqueeTextView = new MarqueeTextView(this.val$context);
                    marqueeTextView.setTextColor(this.this$0.getThemedColor(Theme.key_player_actionBarTitle));
                    marqueeTextView.setTextSize(1, 17.0f);
                    marqueeTextView.setTypeface(AndroidUtilities.bold());
                    marqueeTextView.setEllipsize(TextUtils.TruncateAt.END);
                    marqueeTextView.setSingleLine(true);
                    return marqueeTextView;
                default:
                    MarqueeTextView marqueeTextView2 = new MarqueeTextView(this.val$context);
                    int i = Theme.key_player_time;
                    AudioPlayerAlert audioPlayerAlert = this.this$0;
                    marqueeTextView2.setTextColor(audioPlayerAlert.getThemedColor(i));
                    marqueeTextView2.setTextSize(1, 13.0f);
                    marqueeTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    marqueeTextView2.setSingleLine(true);
                    marqueeTextView2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                    marqueeTextView2.setBackground(Theme.createRadSelectorDrawable(audioPlayerAlert.getThemedColor(Theme.key_listSelector), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                    marqueeTextView2.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(9, this, marqueeTextView2));
                    return marqueeTextView2;
            }
        }
    }

    public abstract class ClippingTextViewSwitcher extends FrameLayout {
        public int activeIndex;
        public AnimatorSet animatorSet;
        public final float[] clipProgress;
        public final Paint erasePaint;
        public final Matrix gradientMatrix;
        public final Paint gradientPaint;
        public LinearGradient gradientShader;
        public final int gradientSize;
        public boolean isCenter;
        public final RectF rectF;
        public int rightPadding;
        public int stableOffest;
        public final TextView[] textViews;

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
                addView(this.textViews[i], LayoutHelper.createFrame(-1.0f, -2));
            }
            this.gradientMatrix = new Matrix();
            Paint paint = new Paint(1);
            this.gradientPaint = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            Paint paint2 = new Paint(1);
            this.erasePaint = paint2;
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        public abstract TextView createTextView();

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            boolean z;
            Canvas canvas2;
            TextView[] textViewArr = this.textViews;
            boolean z2 = true;
            int i = view == textViewArr[0] ? 0 : 1;
            if (this.isCenter) {
                this.stableOffest = -1;
            }
            if (this.stableOffest > 0) {
                for (TextView textView : textViewArr) {
                    if ((textView instanceof MarqueeTextView) && ((MarqueeTextView) textView).needMarquee) {
                        this.stableOffest = -1;
                        break;
                    }
                }
            }
            int i2 = this.stableOffest;
            RectF rectF = this.rectF;
            if (i2 <= 0 || textViewArr[this.activeIndex].getAlpha() == 1.0f || textViewArr[this.activeIndex].getLayout() == null) {
                z = false;
            } else {
                float primaryHorizontal = textViewArr[this.activeIndex].getLayout().getPrimaryHorizontal(0);
                float primaryHorizontal2 = textViewArr[this.activeIndex].getLayout().getPrimaryHorizontal(this.stableOffest);
                if (primaryHorizontal == primaryHorizontal2) {
                    z2 = false;
                } else if (primaryHorizontal2 > primaryHorizontal) {
                    rectF.set(primaryHorizontal, 0.0f, primaryHorizontal2, getMeasuredHeight());
                } else {
                    rectF.set(primaryHorizontal2, 0.0f, primaryHorizontal, getMeasuredHeight());
                }
                if (z2 && i == this.activeIndex) {
                    canvas.save();
                    canvas.clipRect(rectF);
                    textViewArr[0].draw(canvas);
                    canvas.restore();
                }
                z = z2;
            }
            float[] fArr = this.clipProgress;
            if (fArr[i] <= 0.0f && !z) {
                return super.drawChild(canvas, view, j);
            }
            float fMin = Math.min(view.getWidth(), getWidth());
            float fMin2 = Math.min(view.getHeight(), getHeight());
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, fMin, fMin2, null, 31);
            boolean zDrawChild = super.drawChild(canvas, view, j);
            float f = (1.0f - fArr[i]) * fMin;
            float f2 = f + this.gradientSize;
            Matrix matrix = this.gradientMatrix;
            matrix.setTranslate(f, 0.0f);
            this.gradientShader.setLocalMatrix(matrix);
            canvas.drawRect(f, 0.0f, f2, fMin2, this.gradientPaint);
            Paint paint = this.erasePaint;
            if (fMin > f2) {
                canvas2 = canvas;
                canvas2.drawRect(f2, 0.0f, fMin, fMin2, paint);
            } else {
                canvas2 = canvas;
            }
            if (z) {
                canvas2.drawRect(rectF, paint);
            }
            canvas2.restoreToCount(iSaveLayer);
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
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
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

        public void setText(CharSequence charSequence) {
            setText(charSequence, true);
        }

        public final void setText(CharSequence charSequence, boolean z) {
            int i = 3;
            final int i2 = 0;
            final int i3 = 1;
            int i4 = this.activeIndex;
            TextView[] textViewArr = this.textViews;
            CharSequence text = textViewArr[i4].getText();
            if (TextUtils.isEmpty(text) || !z) {
                textViewArr[this.activeIndex].setText(charSequence);
                return;
            }
            if (TextUtils.equals(charSequence, text)) {
                return;
            }
            this.stableOffest = 0;
            int iMin = Math.min(charSequence.length(), text.length());
            for (int i5 = 0; i5 < iMin && charSequence.charAt(i5) == text.charAt(i5); i5++) {
                this.stableOffest++;
            }
            if (this.stableOffest <= 3) {
                this.stableOffest = -1;
            }
            final int i6 = this.activeIndex;
            final int i7 = i6 == 0 ? 1 : 0;
            this.activeIndex = i7;
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            animatorSet2.addListener(new ArticleViewer.AnonymousClass3(this, i6, i));
            textViewArr[i7].setText(charSequence);
            textViewArr[i7].bringToFront();
            textViewArr[i7].setVisibility(0);
            float[] fArr = this.clipProgress;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr[i6], 0.75f);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final AudioPlayerAlert.ClippingTextViewSwitcher f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i2) {
                        case 0:
                            AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = this.f$0;
                            clippingTextViewSwitcher.getClass();
                            clippingTextViewSwitcher.clipProgress[i6] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            clippingTextViewSwitcher.invalidate();
                            break;
                        default:
                            AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher2 = this.f$0;
                            clippingTextViewSwitcher2.getClass();
                            clippingTextViewSwitcher2.clipProgress[i6] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            clippingTextViewSwitcher2.invalidate();
                            break;
                    }
                }
            });
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr[i7], 0.0f);
            valueAnimatorOfFloat2.setStartDelay(100L);
            valueAnimatorOfFloat2.setDuration(200L);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final AudioPlayerAlert.ClippingTextViewSwitcher f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i3) {
                        case 0:
                            AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = this.f$0;
                            clippingTextViewSwitcher.getClass();
                            clippingTextViewSwitcher.clipProgress[i7] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            clippingTextViewSwitcher.invalidate();
                            break;
                        default:
                            AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher2 = this.f$0;
                            clippingTextViewSwitcher2.getClass();
                            clippingTextViewSwitcher2.clipProgress[i7] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            clippingTextViewSwitcher2.invalidate();
                            break;
                    }
                }
            });
            Property property = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textViewArr[i6], (Property<TextView, Float>) property, 0.0f);
            objectAnimatorOfFloat.setStartDelay(75L);
            objectAnimatorOfFloat.setDuration(150L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textViewArr[i7], (Property<TextView, Float>) property, 1.0f);
            objectAnimatorOfFloat2.setStartDelay(75L);
            objectAnimatorOfFloat2.setDuration(150L);
            this.animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, objectAnimatorOfFloat, objectAnimatorOfFloat2);
            this.animatorSet.start();
        }
    }

    public abstract class CoverContainer extends FrameLayout {
        public int activeIndex;
        public AnimatorSet animatorSet;
        public final BackupImageView[] imageViews;

        public CoverContainer(Activity activity) {
            super(activity);
            this.imageViews = new BackupImageView[2];
            for (int i = 0; i < 2; i++) {
                this.imageViews[i] = new BackupImageView(activity);
                this.imageViews[i].getImageReceiver().setDelegate(new LaunchActivity$$ExternalSyntheticLambda9(this, i, 4));
                this.imageViews[i].setRoundRadius(AndroidUtilities.dp(4.0f));
                if (i == 1) {
                    this.imageViews[i].setVisibility(8);
                }
                addView(this.imageViews[i], LayoutHelper.createFrame(-1.0f, -1));
            }
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Activity context;
        public boolean listViewIsVisible;
        public String searchQuery;
        public ArrayList searchResult = new ArrayList();
        public AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda3 searchRunnable;

        public ListAdapter(Activity activity) {
            this.context = activity;
        }

        @Override
        public final int getItemCount() {
            int size;
            AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
            boolean z = audioPlayerAlert.searchWas;
            boolean z2 = audioPlayerAlert.padWithItem;
            if (z) {
                size = this.searchResult.size();
            } else {
                if (audioPlayerAlert.playlist.size() <= 1) {
                    return 0;
                }
                size = audioPlayerAlert.playlist.size();
            }
            return size + (z2 ? 1 : 0);
        }

        @Override
        public final int getItemViewType(int i) {
            return (AudioPlayerAlert.this.padWithItem && i == 0) ? 1 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return (AudioPlayerAlert.this.padWithItem && viewHolder.getAdapterPosition() == 0) ? false : true;
        }

        @Override
        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
            AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
            boolean z = audioPlayerAlert.playlist.size() > 1;
            boolean z2 = this.listViewIsVisible;
            AnonymousClass15 anonymousClass15 = audioPlayerAlert.listView;
            if (z != z2) {
                boolean z3 = audioPlayerAlert.playlist.size() > 1;
                this.listViewIsVisible = z3;
                if (z3) {
                    anonymousClass15.setVisibility(0);
                    anonymousClass15.setTranslationY(AndroidUtilities.displaySize.y);
                    final int i = 0;
                    anonymousClass15.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final AudioPlayerAlert.ListAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i) {
                                case 0:
                                    ((BottomSheet) AudioPlayerAlert.this).containerView.invalidate();
                                    break;
                                default:
                                    ((BottomSheet) AudioPlayerAlert.this).containerView.invalidate();
                                    break;
                            }
                        }
                    }).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                } else {
                    final int i2 = 1;
                    anonymousClass15.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final AudioPlayerAlert.ListAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i2) {
                                case 0:
                                    ((BottomSheet) AudioPlayerAlert.this).containerView.invalidate();
                                    break;
                                default:
                                    ((BottomSheet) AudioPlayerAlert.this).containerView.invalidate();
                                    break;
                            }
                        }
                    }).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new Bulletin$2$$ExternalSyntheticLambda1(this, 2)).start();
                }
            }
            int size = audioPlayerAlert.playlist.size();
            View view = audioPlayerAlert.playerShadow;
            AnonymousClass5 anonymousClass5 = audioPlayerAlert.playerLayout;
            if (size > 1) {
                anonymousClass5.setBackgroundColor(audioPlayerAlert.getThemedColor(Theme.key_player_background));
                view.setVisibility(0);
                anonymousClass15.setPadding(0, anonymousClass15.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
            } else {
                anonymousClass5.setBackgroundColor(audioPlayerAlert.getThemedColor(Theme.key_player_background));
                view.setVisibility(0);
                anonymousClass15.setPadding(0, anonymousClass15.getPaddingTop(), 0, 0);
            }
            audioPlayerAlert.emptyView.setVisibility((audioPlayerAlert.searching && audioPlayerAlert.listAdapter.getItemCount() == 0) ? 0 : 8);
            audioPlayerAlert.updateEmptyViewPosition$1();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            MessageObject messageObject;
            boolean z;
            AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
            if (audioPlayerAlert.padWithItem) {
                if (i == 0) {
                    return;
                } else {
                    i--;
                }
            }
            AudioPlayerCell audioPlayerCell = (AudioPlayerCell) viewHolder.itemView;
            if (audioPlayerAlert.searchWas) {
                messageObject = (MessageObject) this.searchResult.get(i);
                if (i + 1 < this.searchResult.size()) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (audioPlayerAlert.savedMusicList == null ? !SharedConfig.playOrderReversed : SharedConfig.playOrderReversed) {
                ArrayList arrayList = audioPlayerAlert.playlist;
                messageObject = (MessageObject) arrayList.get((arrayList.size() - i) - 1);
                if ((audioPlayerAlert.playlist.size() - i) - 2 >= 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                messageObject = (MessageObject) audioPlayerAlert.playlist.get(i);
                if (i + 1 < audioPlayerAlert.playlist.size()) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (messageObject != null) {
                messageObject.setQuery(this.searchQuery);
            }
            PassportActivity$$ExternalSyntheticLambda22 passportActivity$$ExternalSyntheticLambda22 = audioPlayerAlert.isMyList() ? new PassportActivity$$ExternalSyntheticLambda22(3, this, audioPlayerCell) : null;
            audioPlayerCell.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, ((BottomSheet) audioPlayerAlert).resourcesProvider));
            boolean zIsMyList = audioPlayerAlert.isMyList();
            ChatActivity$$ExternalSyntheticLambda62 chatActivity$$ExternalSyntheticLambda62 = (audioPlayerAlert.isMyList() || audioPlayerAlert.noforwards || messageObject.getId() <= 0) ? null : new ChatActivity$$ExternalSyntheticLambda62(this, audioPlayerCell, messageObject, 16);
            audioPlayerCell.currentMessageObject = messageObject;
            if (audioPlayerCell.needDivider != z) {
                audioPlayerCell.invalidate();
            }
            audioPlayerCell.needDivider = z;
            ImageView imageView = audioPlayerCell.optionsButton;
            imageView.setImageResource(zIsMyList ? R.drawable.list_reorder : R.drawable.ic_ab_other);
            imageView.setVisibility((zIsMyList || chatActivity$$ExternalSyntheticLambda62 != null) ? 0 : 8);
            imageView.setOnClickListener(chatActivity$$ExternalSyntheticLambda62);
            imageView.setOnTouchListener(passportActivity$$ExternalSyntheticLambda22);
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
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Activity activity = this.context;
            if (i == 1) {
                PaymentFormActivity.AnonymousClass2 anonymousClass2 = new PaymentFormActivity.AnonymousClass2(activity, 8);
                anonymousClass2.setTag(-33024);
                return new RecyclerListView.Holder(anonymousClass2);
            }
            boolean zCurrentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
            return new RecyclerListView.Holder(new AudioPlayerCell(zCurrentPlaylistIsGlobalSearch ? 1 : 0, activity, ((BottomSheet) AudioPlayerAlert.this).resourcesProvider));
        }

        public final void search(String str) {
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
                AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda3 audioPlayerAlert$ListAdapter$$ExternalSyntheticLambda3 = new AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda3(this, str, 0);
                this.searchRunnable = audioPlayerAlert$ListAdapter$$ExternalSyntheticLambda3;
                dispatchQueue.postRunnable(audioPlayerAlert$ListAdapter$$ExternalSyntheticLambda3, 300L);
            }
        }
    }

    public AudioPlayerAlert(Activity activity, final Theme.ResourcesProvider resourcesProvider) {
        ActionBarMenu actionBarMenu;
        float f;
        TLRPC.User user;
        super(activity, resourcesProvider, true, false);
        int i = 3;
        int i2 = 2;
        final int i3 = 1;
        final int i4 = 0;
        ActionBarMenuSubItem[] actionBarMenuSubItemArr = new ActionBarMenuSubItem[6];
        this.speedItems = actionBarMenuSubItemArr;
        View[] viewArr = new View[5];
        this.buttons = viewArr;
        this.scrollToSong = true;
        this.searchOpenPosition = -1;
        this.scrollOffsetY = Integer.MAX_VALUE;
        this.rewindingProgress = -1.0f;
        this.forwardSeek = new BubbleActivity.AnonymousClass1(this, 11);
        this.actionBarSlideProperty = new PhotoViewer.AnonymousClass5(this);
        this.doNotOverlayNavigationBar = true;
        fixNavigationBar();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            this.currentAccount = playingMessageObject.currentAccount;
        } else {
            this.currentAccount = UserConfig.selectedAccount;
        }
        this.parentActivity = (LaunchActivity) activity;
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
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(activity);
        this.containerView = anonymousClass2;
        anonymousClass2.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i5 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i5, 0, i5, 0);
        ?? r5 = new ActionBar(activity, resourcesProvider) {
            @Override
            public final void setAlpha(float f2) {
                super.setAlpha(f2);
                ((BottomSheet) AudioPlayerAlert.this).containerView.invalidate();
            }
        };
        this.actionBar = r5;
        r5.setBackgroundColor(0);
        r5.setBackButtonImage(R.drawable.ic_ab_back);
        int i6 = Theme.key_player_actionBarTitle;
        r5.setItemsColor(getThemedColor(i6), false);
        r5.setItemsBackgroundColor(getThemedColor(Theme.key_player_actionBarSelector), false);
        r5.setTitleColor(getThemedColor(i6));
        r5.setSubtitleColor(getThemedColor(Theme.key_player_actionBarSubtitle));
        r5.setOccupyStatusBar(true);
        ActionBarMenu actionBarMenuCreateMenu = r5.createMenu();
        actionBarMenuCreateMenu.setLayoutParams(LayoutHelper.createFrame(-1, -1, 119));
        View view = new View(activity);
        this.actionBarBackground = view;
        view.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
        r5.addView(view, 0, LayoutHelper.createFrame(-1, -1, 119));
        view.setAlpha(0.0f);
        r5.setAlpha(0.0f);
        r5.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 27));
        View view2 = new View(activity);
        this.actionBarShadow = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.playerShadow = view3;
        view3.setBackgroundColor(getThemedColor(Theme.key_dialogShadowLine));
        ?? r2 = new FrameLayout(this, activity) {
            public final AudioPlayerAlert this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onLayout(boolean z, int i7, int i8, int i9, int i10) {
                TextView textView;
                switch (i4) {
                    case 0:
                        super.onLayout(z, i7, i8, i9, i10);
                        AudioPlayerAlert audioPlayerAlert = this.this$0;
                        if (audioPlayerAlert.playbackSpeedButton != null && (textView = audioPlayerAlert.durationTextView) != null) {
                            int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - audioPlayerAlert.playbackSpeedButton.getMeasuredWidth();
                            ActionBarMenuItem actionBarMenuItem = audioPlayerAlert.playbackSpeedButton;
                            actionBarMenuItem.layout(left, actionBarMenuItem.getTop(), audioPlayerAlert.playbackSpeedButton.getMeasuredWidth() + left, audioPlayerAlert.playbackSpeedButton.getBottom());
                            break;
                        }
                        break;
                    case 1:
                        int iM$2 = OKLCH.m$2(248.0f, i9 - i7, 4);
                        for (int i11 = 0; i11 < 5; i11++) {
                            int iDp = (iM$2 * i11) + AndroidUtilities.dp((i11 * 48) + 4);
                            int iDp2 = AndroidUtilities.dp(9.0f);
                            AudioPlayerAlert audioPlayerAlert2 = this.this$0;
                            View view4 = audioPlayerAlert2.buttons[i11];
                            view4.layout(iDp, iDp2, view4.getMeasuredWidth() + iDp, audioPlayerAlert2.buttons[i11].getMeasuredHeight() + iDp2);
                        }
                        break;
                    default:
                        super.onLayout(z, i7, i8, i9, i10);
                        break;
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                switch (i4) {
                    case 2:
                        AudioPlayerAlert audioPlayerAlert = this.this$0;
                        if (audioPlayerAlert.blurredView.getTag() != null) {
                            audioPlayerAlert.showAlbumCover(false, true);
                        }
                        return true;
                    default:
                        return super.onTouchEvent(motionEvent);
                }
            }
        };
        this.playerLayout = r2;
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(activity);
        this.coverContainer = anonymousClass6;
        r2.addView(anonymousClass6, LayoutHelper.createFrame(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(this, activity, activity, i4);
        this.titleTextView = anonymousClass7;
        r2.addView(anonymousClass7, LayoutHelper.createFrame(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        AnonymousClass7 anonymousClass8 = new AnonymousClass7(this, activity, activity, i3);
        this.authorTextView = anonymousClass8;
        r2.addView(anonymousClass8, LayoutHelper.createFrame(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        ?? r6 = new SeekBarView(activity, resourcesProvider) {
            @Override
            public final boolean onTouch(MotionEvent motionEvent) {
                if (AudioPlayerAlert.this.rewindingState != 0) {
                    return false;
                }
                return super.onTouch(motionEvent);
            }
        };
        this.seekBarView = r6;
        r6.setLineWidth(4);
        r6.setDelegate(new SeekBarView.SeekBarViewDelegate() {
            @Override
            public final CharSequence getContentDescription() {
                StringBuilder sb = new StringBuilder();
                AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
                sb.append(LocaleController.formatPluralString("Minutes", audioPlayerAlert.lastTime / 60, new Object[0]));
                sb.append(' ');
                sb.append(LocaleController.formatPluralString("Seconds", audioPlayerAlert.lastTime % 60, new Object[0]));
                return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb.toString(), LocaleController.formatPluralString("Minutes", audioPlayerAlert.lastDuration / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", audioPlayerAlert.lastDuration % 60, new Object[0]));
            }

            @Override
            public final int getStepsCount() {
                return 0;
            }

            @Override
            public final void onSeekBarDrag(float f2, boolean z) {
                if (z) {
                    MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f2);
                }
                MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject2 == null || !playingMessageObject2.isMusic()) {
                    return;
                }
                AudioPlayerAlert.this.updateProgress(playingMessageObject2, false);
            }

            @Override
            public final void onSeekBarPressed() {
                AudioPlayerAlert.this.getClass();
            }
        });
        r6.setReportChanges(true);
        r2.addView(r6, LayoutHelper.createFrame(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        SpringAnimation springAnimation = new SpringAnimation(new FloatValueHolder(0.0f));
        SpringForce springForce = new SpringForce();
        springForce.setStiffness(750.0f);
        springForce.setDampingRatio(1.0f);
        springAnimation.mSpring = springForce;
        springAnimation.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda12(this, i2));
        this.seekBarBufferSpring = springAnimation;
        LineProgressView lineProgressView = new LineProgressView(activity);
        this.progressView = lineProgressView;
        lineProgressView.setVisibility(4);
        lineProgressView.setBackgroundColor(getThemedColor(Theme.key_player_progressBackground));
        lineProgressView.setProgressColor(getThemedColor(Theme.key_player_progress));
        r2.addView(lineProgressView, LayoutHelper.createFrame(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(activity);
        this.timeTextView = simpleTextView;
        simpleTextView.setTextSize(12);
        simpleTextView.setText("0:00", false);
        int i7 = Theme.key_player_time;
        simpleTextView.setTextColor(getThemedColor(i7));
        simpleTextView.setImportantForAccessibility(2);
        r2.addView(simpleTextView, LayoutHelper.createFrame(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.durationTextView = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(getThemedColor(i7));
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        r2.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(activity, null, 0, getThemedColor(i7), false, resourcesProvider);
        this.playbackSpeedButton = actionBarMenuItem;
        actionBarMenuItem.setLongClickEnabled(false);
        actionBarMenuItem.setShowSubmenuByMove(false);
        actionBarMenuItem.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        actionBarMenuItem.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        actionBarMenuItem.setDelegate(new AudioPlayerAlert$$ExternalSyntheticLambda5(this, i));
        CanvasButton.AnonymousClass2 anonymousClass3 = new CanvasButton.AnonymousClass2();
        this.speedIcon = anonymousClass3;
        actionBarMenuItem.setIcon(anonymousClass3);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        ActionBarMenuSlider.SpeedSlider speedSlider = new ActionBarMenuSlider.SpeedSlider(getContext(), resourcesProvider);
        this.speedSlider = speedSlider;
        speedSlider.setRoundRadiusDp(6.0f);
        speedSlider.setDrawShadow(true);
        speedSlider.setOnValueChange(new AudioPlayerAlert$$ExternalSyntheticLambda9(this, i4));
        actionBarMenuSubItemArr[0] = actionBarMenuItem.addSubItem(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        actionBarMenuSubItemArr[1] = actionBarMenuItem.addSubItem(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        actionBarMenuSubItemArr[2] = actionBarMenuItem.addSubItem(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        actionBarMenuSubItemArr[3] = actionBarMenuItem.addSubItem(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        actionBarMenuSubItemArr[4] = actionBarMenuItem.addSubItem(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        actionBarMenuSubItemArr[5] = actionBarMenuItem.addSubItem(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            actionBarMenuItem.setPadding(0, 1, 0, 0);
        }
        actionBarMenuItem.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        actionBarMenuItem.setAdditionalYOffset(-AndroidUtilities.dp(400.0f));
        actionBarMenuItem.setShowedFromBottom(true);
        r2.addView(actionBarMenuItem, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        actionBarMenuItem.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(7, this, fArr));
        actionBarMenuItem.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda130(i2, this, resourcesProvider));
        updatePlaybackButton(false);
        FrameLayout frameLayout = new FrameLayout(this, activity) {
            public final AudioPlayerAlert this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onLayout(boolean z, int i8, int i9, int i10, int i11) {
                TextView textView2;
                switch (i3) {
                    case 0:
                        super.onLayout(z, i8, i9, i10, i11);
                        AudioPlayerAlert audioPlayerAlert = this.this$0;
                        if (audioPlayerAlert.playbackSpeedButton != null && (textView2 = audioPlayerAlert.durationTextView) != null) {
                            int left = (textView2.getLeft() - AndroidUtilities.dp(4.0f)) - audioPlayerAlert.playbackSpeedButton.getMeasuredWidth();
                            ActionBarMenuItem actionBarMenuItem2 = audioPlayerAlert.playbackSpeedButton;
                            actionBarMenuItem2.layout(left, actionBarMenuItem2.getTop(), audioPlayerAlert.playbackSpeedButton.getMeasuredWidth() + left, audioPlayerAlert.playbackSpeedButton.getBottom());
                            break;
                        }
                        break;
                    case 1:
                        int iM$2 = OKLCH.m$2(248.0f, i10 - i8, 4);
                        for (int i12 = 0; i12 < 5; i12++) {
                            int iDp = (iM$2 * i12) + AndroidUtilities.dp((i12 * 48) + 4);
                            int iDp2 = AndroidUtilities.dp(9.0f);
                            AudioPlayerAlert audioPlayerAlert2 = this.this$0;
                            View view4 = audioPlayerAlert2.buttons[i12];
                            view4.layout(iDp, iDp2, view4.getMeasuredWidth() + iDp, audioPlayerAlert2.buttons[i12].getMeasuredHeight() + iDp2);
                        }
                        break;
                    default:
                        super.onLayout(z, i8, i9, i10, i11);
                        break;
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                switch (i3) {
                    case 2:
                        AudioPlayerAlert audioPlayerAlert = this.this$0;
                        if (audioPlayerAlert.blurredView.getTag() != null) {
                            audioPlayerAlert.showAlbumCover(false, true);
                        }
                        return true;
                    default:
                        return super.onTouchEvent(motionEvent);
                }
            }
        };
        r2.addView(frameLayout, LayoutHelper.createFrame(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        ActionBarMenuItem actionBarMenuItem2 = new ActionBarMenuItem(activity, null, 0, 0, false, resourcesProvider);
        this.repeatButton = actionBarMenuItem2;
        viewArr[0] = actionBarMenuItem2;
        actionBarMenuItem2.setLongClickEnabled(false);
        actionBarMenuItem2.setShowSubmenuByMove(false);
        actionBarMenuItem2.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        int i8 = Theme.key_listSelector;
        actionBarMenuItem2.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i8), 1, AndroidUtilities.dp(18.0f)));
        frameLayout.addView(actionBarMenuItem2, LayoutHelper.createFrame(48, 48, 51));
        actionBarMenuItem2.setOnClickListener(new View.OnClickListener(this) {
            public final AudioPlayerAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i4) {
                    case 0:
                        AudioPlayerAlert audioPlayerAlert = this.f$0;
                        audioPlayerAlert.setMenuItemChecked(audioPlayerAlert.shuffleListItem, SharedConfig.shuffleMusic);
                        audioPlayerAlert.setMenuItemChecked(audioPlayerAlert.reverseOrderItem, SharedConfig.playOrderReversed);
                        audioPlayerAlert.setMenuItemChecked(audioPlayerAlert.repeatListItem, SharedConfig.repeatMode == 1);
                        audioPlayerAlert.setMenuItemChecked(audioPlayerAlert.repeatSongItem, SharedConfig.repeatMode == 2);
                        audioPlayerAlert.repeatButton.toggleSubMenu(null, null);
                        break;
                    default:
                        this.f$0.showMenuOptions(view4);
                        break;
                }
            }
        });
        this.repeatSongItem = actionBarMenuItem2.addSubItem(3, R.drawable.player_new_repeatone, LocaleController.getString(R.string.RepeatSong));
        this.repeatListItem = actionBarMenuItem2.addSubItem(4, R.drawable.player_new_repeatall, LocaleController.getString(R.string.RepeatList));
        actionBarMenuItem2.addColoredGap(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.shuffleListItem = actionBarMenuItem2.addSubItem(2, R.drawable.player_new_shuffle, LocaleController.getString(R.string.ShuffleList));
        actionBarMenuItem2.addColoredGap(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.reverseOrderItem = actionBarMenuItem2.addSubItem(1, R.drawable.player_new_order, LocaleController.getString(R.string.ReverseOrder));
        actionBarMenuItem2.setShowedFromBottom(true);
        actionBarMenuItem2.setDelegate(new AudioPlayerAlert$$ExternalSyntheticLambda5(this, i3));
        int i9 = Theme.key_player_button;
        int themedColor = getThemedColor(i9);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        AnonymousClass12 anonymousClass12 = new AnonymousClass12(activity, scaledTouchSlop);
        this.prevButton = anonymousClass12;
        viewArr[1] = anonymousClass12;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        anonymousClass12.setScaleType(scaleType);
        int i10 = R.raw.player_prev;
        anonymousClass12.setAnimation(i10, 20, 20, null);
        anonymousClass12.setLayerColor(themedColor, "Triangle 3");
        anonymousClass12.setLayerColor(themedColor, "Triangle 4");
        anonymousClass12.setLayerColor(themedColor, "Rectangle 4");
        anonymousClass12.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i8), 1, AndroidUtilities.dp(22.0f)));
        frameLayout.addView(anonymousClass12, LayoutHelper.createFrame(48, 48, 51));
        anonymousClass12.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        ImageView imageView = new ImageView(activity);
        this.playButton = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        PlayPauseDrawable playPauseDrawable = new PlayPauseDrawable(28);
        this.playPauseDrawable = playPauseDrawable;
        imageView.setImageDrawable(playPauseDrawable);
        playPauseDrawable.setPause(!MediaController.getInstance().isMessagePaused(), false);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i9), PorterDuff.Mode.MULTIPLY));
        imageView.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i8), 1, AndroidUtilities.dp(24.0f)));
        frameLayout.addView(imageView, LayoutHelper.createFrame(48, 48, 51));
        imageView.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda267(2));
        AnonymousClass13 anonymousClass13 = new AnonymousClass13(activity, scaledTouchSlop);
        this.nextButton = anonymousClass13;
        viewArr[3] = anonymousClass13;
        anonymousClass13.setScaleType(scaleType);
        anonymousClass13.setAnimation(i10, 20, 20, null);
        anonymousClass13.setLayerColor(themedColor, "Triangle 3");
        anonymousClass13.setLayerColor(themedColor, "Triangle 4");
        anonymousClass13.setLayerColor(themedColor, "Rectangle 4");
        anonymousClass13.setRotation(180.0f);
        anonymousClass13.setBackground(Theme.createSelectorDrawable(getThemedColor(i8), 1, AndroidUtilities.dp(22.0f)));
        frameLayout.addView(anonymousClass13, LayoutHelper.createFrame(48, 48, 51));
        anonymousClass13.setContentDescription(LocaleController.getString(R.string.Next));
        ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(activity, null, 0, themedColor, false, resourcesProvider);
        this.optionsButton = actionBarMenuItem3;
        viewArr[4] = actionBarMenuItem3;
        ChooseQualityLayout$QualityIcon chooseQualityLayout$QualityIcon = new ChooseQualityLayout$QualityIcon(activity, R.drawable.ic_ab_other, resourcesProvider);
        this.optionsIcon = chooseQualityLayout$QualityIcon;
        actionBarMenuItem3.setIcon(chooseQualityLayout$QualityIcon);
        actionBarMenuItem3.setLongClickEnabled(false);
        actionBarMenuItem3.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        final int i11 = 1;
        actionBarMenuItem3.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i8), 1, AndroidUtilities.dp(18.0f)));
        actionBarMenuItem3.setOnClickListener(new View.OnClickListener(this) {
            public final AudioPlayerAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i11) {
                    case 0:
                        AudioPlayerAlert audioPlayerAlert = this.f$0;
                        audioPlayerAlert.setMenuItemChecked(audioPlayerAlert.shuffleListItem, SharedConfig.shuffleMusic);
                        audioPlayerAlert.setMenuItemChecked(audioPlayerAlert.reverseOrderItem, SharedConfig.playOrderReversed);
                        audioPlayerAlert.setMenuItemChecked(audioPlayerAlert.repeatListItem, SharedConfig.repeatMode == 1);
                        audioPlayerAlert.setMenuItemChecked(audioPlayerAlert.repeatSongItem, SharedConfig.repeatMode == 2);
                        audioPlayerAlert.repeatButton.toggleSubMenu(null, null);
                        break;
                    default:
                        this.f$0.showMenuOptions(view4);
                        break;
                }
            }
        });
        frameLayout.addView(actionBarMenuItem3, LayoutHelper.createFrame(48, 48, 51));
        PhotoViewer.AnonymousClass17 anonymousClass17 = new PhotoViewer.AnonymousClass17(this, activity, i11);
        this.castItemButton = anonymousClass17;
        this.castAvailable = true;
        try {
            anonymousClass17.setRouteSelector(CastContext.getSharedInstance(activity).getMergedSelector());
        } catch (Exception e) {
            FileLog.e(e);
            this.castAvailable = false;
        }
        this.castItemButton.setVisibility(4);
        ChooseQualityLayout$QualityIcon chooseQualityLayout$QualityIcon2 = this.optionsIcon;
        if (chooseQualityLayout$QualityIcon2 != null) {
            chooseQualityLayout$QualityIcon2.setCasting(CastSync.isActive());
        }
        this.optionsButton.setShowedFromBottom(true);
        this.optionsButton.setDelegate(new AudioPlayerAlert$$ExternalSyntheticLambda5(this, 2));
        this.optionsButton.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.emptyView = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        this.containerView.addView(linearLayout, LayoutHelper.createFrame(-1.0f, -1));
        linearLayout.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(10));
        ImageView imageView2 = new ImageView(activity);
        this.emptyImageView = imageView2;
        imageView2.setImageResource(R.drawable.music_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogEmptyImage), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView2, LayoutHelper.createLinear(-2, -2));
        TextView textView2 = new TextView(activity);
        this.emptyTitleTextView = textView2;
        int i12 = Theme.key_dialogEmptyText;
        textView2.setTextColor(getThemedColor(i12));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.NoAudioFound));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.emptySubtitleTextView = textView3;
        textView3.setTextColor(getThemedColor(i12));
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 17, 0, 6, 0, 0));
        ?? r3 = new RecyclerListView(activity) {
            public boolean ignoreLayout;

            @Override
            public final boolean allowSelectChildAtPosition(float f2) {
                AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
                return f2 < audioPlayerAlert.playerLayout.getY() - ((float) audioPlayerAlert.listView.getTop());
            }

            @Override
            public final void onLayout(boolean z, int i13, int i14, int i15, int i16) {
                super.onLayout(z, i13, i14, i15, i16);
                AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
                int i17 = audioPlayerAlert.searchOpenPosition;
                if (i17 != -1 && !audioPlayerAlert.actionBar.isSearchFieldVisible) {
                    this.ignoreLayout = true;
                    LinearLayoutManager linearLayoutManager = audioPlayerAlert.layoutManager;
                    linearLayoutManager.scrollToPositionWithOffset(i17, audioPlayerAlert.searchOpenOffset - audioPlayerAlert.listView.getPaddingTop(), linearLayoutManager.mShouldReverseLayout);
                    super.onLayout(false, i13, i14, i15, i16);
                    this.ignoreLayout = false;
                    audioPlayerAlert.searchOpenPosition = -1;
                    return;
                }
                if (audioPlayerAlert.scrollToSong) {
                    audioPlayerAlert.scrollToSong = false;
                    this.ignoreLayout = true;
                    if (audioPlayerAlert.scrollToCurrentSong(true)) {
                        super.onLayout(false, i13, i14, i15, i16);
                    }
                    this.ignoreLayout = false;
                }
            }

            @Override
            public final void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.listView = r3;
        r3.setClipToPadding(false);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        r3.setLayoutManager(linearLayoutManager);
        r3.setHorizontalScrollBarEnabled(false);
        r3.setVerticalScrollBarEnabled(false);
        this.containerView.addView((View) r3, LayoutHelper.createFrame(-1, -1, 51));
        ListAdapter listAdapter = new ListAdapter(activity);
        this.listAdapter = listAdapter;
        r3.setAdapter(listAdapter);
        r3.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        r3.setOnItemClickListener(new AuctionBidSheet$$ExternalSyntheticLambda6(1));
        r3.setOnItemLongClickListener(new AudioPlayerAlert$$ExternalSyntheticLambda5(this, 0));
        r3.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 13));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(activity, resourcesProvider, true);
        buttonWithCounterView.setRoundRadius(24);
        this.saveToProfileButton = buttonWithCounterView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final int i13 = 0;
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.filled_track_add), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        buttonWithCounterView.setText(spannableStringBuilder);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener(this) {
            public final AudioPlayerAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i13) {
                    case 0:
                        this.f$0.lambda$new$12(resourcesProvider);
                        break;
                    default:
                        this.f$0.lambda$new$14(resourcesProvider);
                        break;
                }
            }
        });
        addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        final int i14 = 1;
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(activity, resourcesProvider, true);
        buttonWithCounterView2.setRoundRadius(24);
        buttonWithCounterView2.setNeutral();
        this.unsaveFromProfileButton = buttonWithCounterView2;
        buttonWithCounterView2.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        buttonWithCounterView2.setOnClickListener(new View.OnClickListener(this) {
            public final AudioPlayerAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i14) {
                    case 0:
                        this.f$0.lambda$new$12(resourcesProvider);
                        break;
                    default:
                        this.f$0.lambda$new$14(resourcesProvider);
                        break;
                }
            }
        });
        addView(buttonWithCounterView2, LayoutHelper.createFrame(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.savedMusicList = savedMusicList;
        boolean z = savedMusicList != null;
        this.isProfilePlaylist = z;
        this.actionBar.menuOccupyBack = z;
        this.padWithItem = isMyList();
        this.playlist = MediaController.getInstance().getPlaylist();
        if (isMyList()) {
            actionBarMenu = actionBarMenuCreateMenu;
            this.addItem = actionBarMenu.addItem(8, R.drawable.msg_add);
        } else {
            actionBarMenu = actionBarMenuCreateMenu;
        }
        ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenu.addItem(0, R.drawable.outline_header_search);
        actionBarMenuItemAddItem.setIsSearchField$1();
        actionBarMenuItemAddItem.listener = new TopicsFragment.AnonymousClass3(this, 5);
        this.searchItem = actionBarMenuItemAddItem;
        int i15 = R.string.Search;
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString(i15));
        EditTextBoldCursor searchField = actionBarMenuItemAddItem.getSearchField();
        searchField.setHint(LocaleController.getString(i15));
        int i16 = Theme.key_player_actionBarTitle;
        searchField.setTextColor(getThemedColor(i16));
        searchField.setHintTextColor(getThemedColor(Theme.key_player_time));
        searchField.setCursorColor(getThemedColor(i16));
        if (z) {
            r3.setSections();
            setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider));
            setAlpha(1.0f);
            f = 0.0f;
            this.actionBarBackground.setAlpha(0.0f);
            PhotoViewer.AnonymousClass5 anonymousClass5 = this.actionBarSlideProperty;
            AnonymousClass3 anonymousClass4 = this.actionBar;
            anonymousClass5.getClass();
            anonymousClass5.setValue(anonymousClass4, 0.0f);
        } else {
            f = 0.0f;
        }
        boolean z2 = this.playlist.size() > 1;
        listAdapter.listViewIsVisible = z2;
        if (z2) {
            r3.setVisibility(0);
            r3.setTranslationY(f);
        } else {
            r3.setVisibility(8);
            r3.setTranslationY(AndroidUtilities.displaySize.y);
        }
        listAdapter.notifyDataSetChanged();
        setTitle(LocaleController.getString(R.string.AttachMusic));
        MessagesController.SavedMusicList savedMusicList2 = this.savedMusicList;
        if (savedMusicList2 != null) {
            if (savedMusicList2.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                setTitle(LocaleController.getString(R.string.ProfilePlaylistTitleMine));
            } else {
                setTitle(LocaleController.formatString(R.string.ProfilePlaylistTitle, DialogObject.getShortName(this.savedMusicList.dialogId)));
            }
        } else if (playingMessageObject != null && !MediaController.getInstance().currentPlaylistIsGlobalSearch()) {
            long dialogId = playingMessageObject.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                TLRPC.EncryptedChat encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(MessagesController.getInstance(this.currentAccount), dialogId);
                if (encryptedChatM != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(encryptedChatM.user_id))) != null) {
                    setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                if (playingMessageObject.getSavedDialogId() == 2666000) {
                    setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else {
                    setTitle(LocaleController.getString(R.string.SavedMessages));
                }
            } else if (DialogObject.isUserDialog(dialogId)) {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                if (user2 != null) {
                    setTitle(ContactsController.formatName(user2.first_name, user2.last_name));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                if (chat != null) {
                    setTitle(chat.title);
                }
            }
        }
        if (isMyList()) {
            buttonWithCounterView.setVisibility(8);
            buttonWithCounterView2.setVisibility(8);
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.Callback() {
                @Override
                public final void clearView(RecyclerView.ViewHolder viewHolder) {
                    View view4 = viewHolder.itemView;
                    Object tag = view4.getTag();
                    if (tag instanceof Float) {
                        float fFloatValue = ((Float) tag).floatValue();
                        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                        ViewCompat.Api21Impl.setElevation(view4, fFloatValue);
                    }
                    view4.setTag(null);
                    view4.setTranslationX(0.0f);
                    view4.setTranslationY(0.0f);
                    View view5 = viewHolder.itemView;
                    view5.setPressed(false);
                    view5.setTag(R.id.dragging, null);
                }

                @Override
                public final int getMovementFlags(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder) {
                    if (viewHolder.mItemViewType != 0) {
                        return 0;
                    }
                    return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
                }

                @Override
                public final boolean onMove(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                    int adapterPosition = viewHolder.getAdapterPosition();
                    int adapterPosition2 = viewHolder2.getAdapterPosition();
                    AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
                    if (!audioPlayerAlert.padWithItem) {
                        audioPlayerAlert.savedMusicList.move(adapterPosition, adapterPosition2);
                    } else {
                        if (adapterPosition <= 0 || adapterPosition2 <= 0) {
                            return false;
                        }
                        audioPlayerAlert.savedMusicList.move(adapterPosition - 1, adapterPosition2 - 1);
                    }
                    audioPlayerAlert.playlist.clear();
                    audioPlayerAlert.playlist.addAll(audioPlayerAlert.savedMusicList.list);
                    audioPlayerAlert.listAdapter.mObservable.notifyItemMoved(adapterPosition, adapterPosition2);
                    return true;
                }

                @Override
                public final void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i17) {
                    AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
                    if (viewHolder != null) {
                        audioPlayerAlert.listView.hideSelector(false);
                    }
                    if (i17 != 0) {
                        audioPlayerAlert.listView.cancelClickRunnables(false);
                        if (viewHolder != null) {
                            viewHolder.itemView.setPressed(true);
                        }
                    }
                    if (viewHolder != null) {
                        viewHolder.itemView.setTag(R.id.dragging, i17 == 2 ? Boolean.TRUE : null);
                    }
                }

                @Override
                public final void onSwiped(RecyclerView.ViewHolder viewHolder) {
                }
            });
            this.itemTouchHelper = itemTouchHelper;
            itemTouchHelper.attachToRecyclerView(r3);
        }
        this.containerView.addView(this.playerLayout, LayoutHelper.createFrame(-1, ((isMyList() || this.noforwards) ? 0 : 52) + 179, 83));
        this.containerView.addView(this.playerShadow, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        ((FrameLayout.LayoutParams) getLayoutParams()).height = AndroidUtilities.dp(((isMyList() || this.noforwards) ? 0 : 52) + 179);
        ((FrameLayout.LayoutParams) this.playerShadow.getLayoutParams()).bottomMargin = AndroidUtilities.dp(179 + ((isMyList() || this.noforwards) ? 0 : 52));
        this.containerView.addView(this.actionBarShadow, LayoutHelper.createFrame(3.0f, -1));
        this.containerView.addView(this.actionBar);
        final int i17 = 2;
        ?? r4 = new FrameLayout(this, activity) {
            public final AudioPlayerAlert this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onLayout(boolean z3, int i18, int i19, int i110, int i111) {
                TextView textView4;
                switch (i17) {
                    case 0:
                        super.onLayout(z3, i18, i19, i110, i111);
                        AudioPlayerAlert audioPlayerAlert = this.this$0;
                        if (audioPlayerAlert.playbackSpeedButton != null && (textView4 = audioPlayerAlert.durationTextView) != null) {
                            int left = (textView4.getLeft() - AndroidUtilities.dp(4.0f)) - audioPlayerAlert.playbackSpeedButton.getMeasuredWidth();
                            ActionBarMenuItem actionBarMenuItem4 = audioPlayerAlert.playbackSpeedButton;
                            actionBarMenuItem4.layout(left, actionBarMenuItem4.getTop(), audioPlayerAlert.playbackSpeedButton.getMeasuredWidth() + left, audioPlayerAlert.playbackSpeedButton.getBottom());
                            break;
                        }
                        break;
                    case 1:
                        int iM$2 = OKLCH.m$2(248.0f, i110 - i18, 4);
                        for (int i112 = 0; i112 < 5; i112++) {
                            int iDp = (iM$2 * i112) + AndroidUtilities.dp((i112 * 48) + 4);
                            int iDp2 = AndroidUtilities.dp(9.0f);
                            AudioPlayerAlert audioPlayerAlert2 = this.this$0;
                            View view4 = audioPlayerAlert2.buttons[i112];
                            view4.layout(iDp, iDp2, view4.getMeasuredWidth() + iDp, audioPlayerAlert2.buttons[i112].getMeasuredHeight() + iDp2);
                        }
                        break;
                    default:
                        super.onLayout(z3, i18, i19, i110, i111);
                        break;
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                switch (i17) {
                    case 2:
                        AudioPlayerAlert audioPlayerAlert = this.this$0;
                        if (audioPlayerAlert.blurredView.getTag() != null) {
                            audioPlayerAlert.showAlbumCover(false, true);
                        }
                        return true;
                    default:
                        return super.onTouchEvent(motionEvent);
                }
            }
        };
        this.blurredView = r4;
        r4.setAlpha(0.0f);
        r4.setVisibility(4);
        getContainer().addView(r4);
        BackupImageView backupImageView = new BackupImageView(activity);
        this.bigAlbumConver = backupImageView;
        backupImageView.setAspectFit(true);
        backupImageView.setRoundRadius(AndroidUtilities.dp(8.0f));
        backupImageView.setScaleX(0.9f);
        backupImageView.setScaleY(0.9f);
        r4.addView(backupImageView, LayoutHelper.createFrame(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        updateTitle$1(false);
        updateRepeatButton();
        linearLayout.setVisibility((this.searching && listAdapter.getItemCount() == 0) ? 0 : 8);
        updateEmptyViewPosition$1();
    }

    public static void access$1900(AudioPlayerAlert audioPlayerAlert) {
        int i = 2;
        int childCount = audioPlayerAlert.listView.getChildCount();
        AnonymousClass15 anonymousClass15 = audioPlayerAlert.listView;
        if (childCount <= 0) {
            int paddingTop = anonymousClass15.getPaddingTop();
            audioPlayerAlert.scrollOffsetY = paddingTop;
            anonymousClass15.setTopGlowOffset(paddingTop);
            audioPlayerAlert.containerView.invalidate();
            return;
        }
        View childAt = anonymousClass15.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass15.findContainingViewHolder(childAt);
        int top = childAt instanceof AudioPlayerCell ? childAt.getTop() : childAt.getBottom();
        int iDp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || holder == null || holder.getAdapterPosition() != 0) {
            top = iDp;
        }
        boolean z = top <= AndroidUtilities.dp(12.0f);
        AnonymousClass3 anonymousClass3 = audioPlayerAlert.actionBar;
        if ((z && anonymousClass3.getTag() == null) || (!z && anonymousClass3.getTag() != null)) {
            anonymousClass3.setTag(z ? 1 : null);
            AnimatorSet animatorSet = audioPlayerAlert.actionBarAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                audioPlayerAlert.actionBarAnimation = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            audioPlayerAlert.actionBarAnimation = animatorSet2;
            View view = audioPlayerAlert.actionBarShadow;
            if (audioPlayerAlert.isProfilePlaylist) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(anonymousClass3, audioPlayerAlert.actionBarSlideProperty, z ? 1.0f : 0.0f);
                View view2 = audioPlayerAlert.actionBarBackground;
                Property property = View.ALPHA;
                animatorSet2.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z ? 1.0f : 0.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass3, (Property<AnonymousClass3, Float>) property2, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z ? 1.0f : 0.0f));
            }
            audioPlayerAlert.actionBarAnimation.setDuration(320L);
            audioPlayerAlert.actionBarAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            audioPlayerAlert.actionBarAnimation.addListener(new AnonymousClass21(audioPlayerAlert, i));
            audioPlayerAlert.actionBarAnimation.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anonymousClass15.getLayoutParams();
        int iM = zzlb.m(layoutParams.topMargin - AndroidUtilities.statusBarHeight, 11.0f, top);
        if (audioPlayerAlert.scrollOffsetY != iM) {
            audioPlayerAlert.scrollOffsetY = iM;
            anonymousClass15.setTopGlowOffset((iM - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            audioPlayerAlert.containerView.invalidate();
        }
        int iDp2 = AndroidUtilities.dp(13.0f);
        int translationY = (int) (anonymousClass15.getTranslationY() + ((audioPlayerAlert.scrollOffsetY - audioPlayerAlert.backgroundPaddingTop) - iDp2));
        boolean z2 = (audioPlayerAlert.backgroundPaddingTop + translationY < ActionBar.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((float) ((ActionBar.getCurrentActionBarHeight() - translationY) - audioPlayerAlert.backgroundPaddingTop)) / ((float) (AndroidUtilities.dp(4.0f) + iDp2))) : 1.0f) <= 0.5f && ColorUtils.calculateLuminance(audioPlayerAlert.getThemedColor(Theme.key_dialogBackground)) > 0.699999988079071d;
        if (z2 != audioPlayerAlert.wasLight) {
            audioPlayerAlert.wasLight = z2;
            AndroidUtilities.setLightStatusBar(audioPlayerAlert, z2);
        }
    }

    public static ImageLocation getArtworkThumbImageLocation(MessageObject messageObject) {
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

    public final ItemOptions buildSaveOptions(MessageObject messageObject, ItemOptions itemOptions) {
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        long j = document != null ? document.id : 0L;
        ItemOptions itemOptionsMakeSwipeback = itemOptions.makeSwipeback();
        itemOptionsMakeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ChatActivity$$ExternalSyntheticLambda326(0, itemOptions), false);
        itemOptionsMakeSwipeback.addGap();
        itemOptionsMakeSwipeback.addIf(R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new AudioPlayerAlert$$ExternalSyntheticLambda24(this, messageObject, itemOptions, 6), !savedMusicIds.ids.contains(Long.valueOf(j)));
        itemOptionsMakeSwipeback.add(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new AudioPlayerAlert$$ExternalSyntheticLambda24(this, messageObject, itemOptions, 7), false);
        itemOptionsMakeSwipeback.add(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new AudioPlayerAlert$$ExternalSyntheticLambda24(this, messageObject, itemOptions, 8), false);
        itemOptionsMakeSwipeback.addGap();
        itemOptionsMakeSwipeback.addText(12, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.AudioSaveToInfo));
        return itemOptionsMakeSwipeback;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        AudioPlayerCell audioPlayerCell;
        MessageObject messageObject;
        AudioPlayerCell audioPlayerCell2;
        MessageObject messageObject2;
        MessageObject playingMessageObject;
        int i3 = NotificationCenter.messagePlayingDidStart;
        AnonymousClass15 anonymousClass15 = this.listView;
        if (i == i3 || i == NotificationCenter.messagePlayingPlayStateChanged || i == NotificationCenter.messagePlayingDidReset) {
            int i4 = NotificationCenter.messagePlayingDidReset;
            updateTitle$1(i == i4 && ((Boolean) objArr[1]).booleanValue());
            if (i == i4 || i == NotificationCenter.messagePlayingPlayStateChanged) {
                int childCount = anonymousClass15.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = anonymousClass15.getChildAt(i5);
                    if ((childAt instanceof AudioPlayerCell) && (messageObject = (audioPlayerCell = (AudioPlayerCell) childAt).getMessageObject()) != null && (messageObject.isVoice() || messageObject.isMusic())) {
                        audioPlayerCell.updateButtonState(false, true);
                    }
                }
                if (i == NotificationCenter.messagePlayingPlayStateChanged && MediaController.getInstance().getPlayingMessageObject() != null) {
                    boolean zIsMessagePaused = MediaController.getInstance().isMessagePaused();
                    BubbleActivity.AnonymousClass1 anonymousClass1 = this.forwardSeek;
                    if (zIsMessagePaused) {
                        if (this.rewindingState == 1) {
                            this.lastRewindingTime = System.currentTimeMillis();
                            this.rewindingProgress = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                            AndroidUtilities.runOnUIThread(anonymousClass1);
                        }
                    } else if (this.rewindingState == 1 && this.rewindingProgress != -1.0f) {
                        AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                        this.lastUpdateRewindingPlayerTime = 0L;
                        anonymousClass1.run();
                        this.rewindingProgress = -1.0f;
                    }
                }
            } else {
                if (((MessageObject) objArr[0]).eventId != 0) {
                    return;
                }
                int childCount2 = anonymousClass15.getChildCount();
                for (int i6 = 0; i6 < childCount2; i6++) {
                    View childAt2 = anonymousClass15.getChildAt(i6);
                    if ((childAt2 instanceof AudioPlayerCell) && (messageObject2 = (audioPlayerCell2 = (AudioPlayerCell) childAt2).getMessageObject()) != null && (messageObject2.isVoice() || messageObject2.isMusic())) {
                        audioPlayerCell2.updateButtonState(false, true);
                    }
                }
            }
            ChooseQualityLayout$QualityIcon chooseQualityLayout$QualityIcon = this.optionsIcon;
            if (chooseQualityLayout$QualityIcon != null) {
                chooseQualityLayout$QualityIcon.setCasting(CastSync.isActive());
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagePlayingProgressDidChanged) {
            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject2 == null || !playingMessageObject2.isMusic()) {
                return;
            }
            updateProgress(playingMessageObject2, false);
            return;
        }
        if (i == NotificationCenter.messagePlayingSpeedChanged) {
            updatePlaybackButton(true);
            return;
        }
        int i7 = NotificationCenter.musicDidLoad;
        ListAdapter listAdapter = this.listAdapter;
        if (i == i7) {
            this.savedMusicList = MediaController.getInstance().currentSavedMusicList;
            this.playlist = MediaController.getInstance().getPlaylist();
            listAdapter.notifyDataSetChanged();
            return;
        }
        if (i == NotificationCenter.moreMusicDidLoad) {
            this.savedMusicList = MediaController.getInstance().currentSavedMusicList;
            this.playlist = MediaController.getInstance().getPlaylist();
            listAdapter.notifyDataSetChanged();
            if (SharedConfig.playOrderReversed) {
                anonymousClass15.stopScroll();
                int iIntValue = ((Integer) objArr[0]).intValue();
                LinearLayoutManager linearLayoutManager = this.layoutManager;
                linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (iFindLastVisibleItemPosition != -1) {
                    View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindLastVisibleItemPosition);
                    linearLayoutManager.scrollToPositionWithOffset(iFindLastVisibleItemPosition + iIntValue, viewFindViewByPosition != null ? viewFindViewByPosition.getTop() : 0, linearLayoutManager.mShouldReverseLayout);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileLoaded) {
            if (((String) objArr[0]).equals(this.currentFile)) {
                updateTitle$1(false);
                this.currentAudioFinishedLoading = true;
                return;
            }
            return;
        }
        if (i != NotificationCenter.fileLoadProgressChanged) {
            if (i == NotificationCenter.musicIdsLoaded) {
                updateTitle$1(false);
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
    public final void lambda$showGiftOfferSheet$15() {
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

    public final void forward(MessageObject messageObject) {
        ArrayList arrayListM;
        TLRPC.TL_document tL_document;
        int i = UserConfig.selectedAccount;
        int i2 = this.currentAccount;
        LaunchActivity launchActivity = this.parentActivity;
        if (i != i2) {
            launchActivity.switchToAccount(i2);
        }
        Bundle bundleM = TelegramMediaSession$$ExternalSyntheticOutline0.m(3, "onlySelect", "dialogsType", true);
        bundleM.putBoolean("canSelectTopics", true);
        DialogsActivity dialogsActivity = new DialogsActivity(bundleM);
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
        dialogsActivity.delegate = new ArticleViewer$$ExternalSyntheticLambda54(this, arrayListM, tL_document, messageObject, 5);
        launchActivity.presentFragment(dialogsActivity);
        lambda$showGiftOfferSheet$15();
    }

    @Override
    public final int getContainerViewHeight() {
        AnonymousClass5 anonymousClass5 = this.playerLayout;
        if (anonymousClass5 == null) {
            return 0;
        }
        if (this.playlist.size() <= 1) {
            return anonymousClass5.getMeasuredHeight() + this.backgroundPaddingTop;
        }
        int iDp = AndroidUtilities.dp(13.0f);
        int translationY = (int) (getTranslationY() + ((this.scrollOffsetY - this.backgroundPaddingTop) - iDp));
        if (this.backgroundPaddingTop + translationY < ActionBar.getCurrentActionBarHeight()) {
            float fDp = AndroidUtilities.dp(4.0f) + iDp;
            translationY -= (int) ((ActionBar.getCurrentActionBarHeight() - fDp) * Math.min(1.0f, ((ActionBar.getCurrentActionBarHeight() - translationY) - this.backgroundPaddingTop) / fDp));
        }
        return this.container.getMeasuredHeight() - (translationY + AndroidUtilities.statusBarHeight);
    }

    @Override
    public final int getObserverTag() {
        return this.TAG;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 12);
        int i = Theme.key_player_actionBarTitle;
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, chatActivity$$ExternalSyntheticLambda94, i));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 1024, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_player_actionBarSelector));
        arrayList.add(new ThemeDescription(this.actionBar, 134217728, null, null, null, null, i));
        int i2 = Theme.key_player_time;
        arrayList.add(new ThemeDescription(this.actionBar, 67108864, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AudioPlayerCell.class}, null, null, null, Theme.key_chat_inLoader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AudioPlayerCell.class}, null, null, null, Theme.key_chat_outLoader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AudioPlayerCell.class}, null, null, null, Theme.key_chat_inLoaderSelected));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AudioPlayerCell.class}, null, null, null, Theme.key_chat_inMediaIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AudioPlayerCell.class}, null, null, null, Theme.key_chat_inMediaIconSelected));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AudioPlayerCell.class}, null, null, null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AudioPlayerCell.class}, null, null, null, Theme.key_chat_inAudioSelectedProgress));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AudioPlayerCell.class}, null, null, null, Theme.key_chat_inAudioProgress));
        arrayList.add(new ThemeDescription(this.containerView, 0, null, null, new Drawable[]{this.shadowDrawable}, null, Theme.key_dialogBackground));
        int i3 = Theme.key_player_progressBackground;
        arrayList.add(new ThemeDescription(this.progressView, 0, null, null, null, null, i3));
        int i4 = Theme.key_player_progress;
        arrayList.add(new ThemeDescription(this.progressView, 0, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.seekBarView, 0, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.seekBarView, 0, null, null, null, null, Theme.key_player_progressCachedBackground));
        arrayList.add(new ThemeDescription(this.seekBarView, 2048, null, null, null, null, i4));
        ActionBarMenuItem actionBarMenuItem = this.playbackSpeedButton;
        arrayList.add(new ThemeDescription(actionBarMenuItem, 262152, null, null, null, null, Theme.key_inappPlayerPlayPause));
        arrayList.add(new ThemeDescription(actionBarMenuItem, 262152, null, null, null, null, Theme.key_inappPlayerClose));
        ActionBarMenuItem actionBarMenuItem2 = this.repeatButton;
        int i5 = Theme.key_player_button;
        arrayList.add(new ThemeDescription(actionBarMenuItem2, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, i5));
        arrayList.add(new ThemeDescription(actionBarMenuItem2, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_player_buttonActive));
        int i6 = Theme.key_listSelector;
        arrayList.add(new ThemeDescription(actionBarMenuItem2, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, i6));
        int i7 = Theme.key_actionBarDefaultSubmenuItem;
        arrayList.add(new ThemeDescription(actionBarMenuItem2, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, i7));
        int i8 = Theme.key_actionBarDefaultSubmenuBackground;
        arrayList.add(new ThemeDescription(actionBarMenuItem2, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, i8));
        ActionBarMenuItem actionBarMenuItem3 = this.optionsButton;
        arrayList.add(new ThemeDescription(actionBarMenuItem3, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, i5));
        arrayList.add(new ThemeDescription(actionBarMenuItem3, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, i6));
        arrayList.add(new ThemeDescription(actionBarMenuItem3, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, i7));
        arrayList.add(new ThemeDescription(actionBarMenuItem3, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, i8));
        AnonymousClass12 anonymousClass12 = this.prevButton;
        arrayList.add(new ThemeDescription(anonymousClass12, (Class[]) null, new RLottieDrawable[]{anonymousClass12.getAnimatedDrawable()}, "Triangle 3", i5));
        arrayList.add(new ThemeDescription(anonymousClass12, (Class[]) null, new RLottieDrawable[]{anonymousClass12.getAnimatedDrawable()}, "Triangle 4", i5));
        arrayList.add(new ThemeDescription(anonymousClass12, (Class[]) null, new RLottieDrawable[]{anonymousClass12.getAnimatedDrawable()}, "Rectangle 4", i5));
        arrayList.add(new ThemeDescription(this.prevButton, 131080, null, null, null, null, i6));
        ImageView imageView = this.playButton;
        arrayList.add(new ThemeDescription(imageView, 8, null, null, null, null, i5));
        arrayList.add(new ThemeDescription(imageView, 131080, null, null, null, null, i6));
        AnonymousClass13 anonymousClass13 = this.nextButton;
        arrayList.add(new ThemeDescription(anonymousClass13, (Class[]) null, new RLottieDrawable[]{anonymousClass13.getAnimatedDrawable()}, "Triangle 3", i5));
        arrayList.add(new ThemeDescription(anonymousClass13, (Class[]) null, new RLottieDrawable[]{anonymousClass13.getAnimatedDrawable()}, "Triangle 4", i5));
        arrayList.add(new ThemeDescription(anonymousClass13, (Class[]) null, new RLottieDrawable[]{anonymousClass13.getAnimatedDrawable()}, "Rectangle 4", i5));
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
        AnonymousClass7 anonymousClass7 = this.titleTextView;
        arrayList.add(new ThemeDescription(anonymousClass7.getTextView(), 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(anonymousClass7.getNextTextView(), 4, null, null, null, null, i));
        AnonymousClass7 anonymousClass8 = this.authorTextView;
        arrayList.add(new ThemeDescription(anonymousClass8.getTextView(), 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(anonymousClass8.getNextTextView(), 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.containerView, 0, null, null, null, null, Theme.key_sheet_scrollUp));
        return arrayList;
    }

    public final boolean isMyList() {
        MessagesController.SavedMusicList savedMusicList = this.savedMusicList;
        return savedMusicList != null && savedMusicList.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override
    public final boolean isTouchOutside(float f, float f2) {
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

    public final void lambda$buildSaveOptions$38(ItemOptions itemOptions) {
        setVisibleInProfile(true);
        new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.saved_messages, 36, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).show();
        itemOptions.dismiss();
    }

    public final void lambda$buildSaveOptions$40(MessageObject messageObject, ItemOptions itemOptions) {
        ArrayList<MessageObject> arrayListM;
        int i;
        char c;
        String string;
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i2 = UserConfig.selectedAccount;
        int i3 = this.currentAccount;
        if (i2 != i3) {
            this.parentActivity.switchToAccount(i3);
        }
        TLRPC.TL_document tL_document = null;
        if (messageObject.getId() < 0) {
            if (messageObject.getDocument() instanceof TLRPC.TL_document) {
                arrayListM = null;
                tL_document = (TLRPC.TL_document) messageObject.getDocument();
            } else {
                i = 36;
            }
            itemOptions.dismiss();
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.AudioSaveToSavedMessagesSaved, new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider), R.raw.saved_messages, i);
        }
        arrayListM = MediaController$$ExternalSyntheticOutline1.m(messageObject);
        if (arrayListM != null) {
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(arrayListM, clientUserId, false, false, true, 0, 0L);
            i = 36;
            c = 0;
        } else {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(this.currentAccount);
            i = 36;
            c = 0;
            SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, clientUserId, null, null, null, null, null, null, true, 0, 0, 0, this.savedMusicList, null, false, false);
            clientUserId = clientUserId;
            sendMessagesHelper.sendMessage(sendMessageParamsOf);
        }
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            BulletinFactory bulletinFactoryOf = BulletinFactory.of(lastFragment);
            int i4 = R.raw.forward;
            if (clientUserId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                string = LocaleController.getString(R.string.FwdMessageToSavedMessages);
            } else if (clientUserId > 0) {
                int i5 = R.string.FwdMessageToUser;
                Object[] objArr = new Object[1];
                objArr[c] = DialogObject.getShortName(clientUserId);
                string = LocaleController.formatString(i5, objArr);
            } else {
                int i6 = R.string.FwdMessageToGroup;
                Object[] objArr2 = new Object[1];
                objArr2[c] = DialogObject.getShortName(clientUserId);
                string = LocaleController.formatString(i6, objArr2);
            }
            bulletinFactoryOf.createSimpleBulletinWithIconSize(i4, i, string).show();
        }
        itemOptions.dismiss();
        FactCheckController$$ExternalSyntheticOutline0.m(R.string.AudioSaveToSavedMessagesSaved, new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider), R.raw.saved_messages, i);
    }

    public final void lambda$forward$53(ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, DialogsActivity dialogsActivity, ArrayList arrayList2, CharSequence charSequence, boolean z, int i) {
        String pluralStringComma;
        long j;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() <= 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId != UserConfig.getInstance(this.currentAccount).getClientUserId() && charSequence == null && arrayList3 != null) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList2.get(0);
            long j2 = topicKey.dialogId;
            Bundle bundleM = zzkw.m("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j2)) {
                bundleM.putInt("enc_id", DialogObject.getEncryptedChatId(j2));
            } else if (DialogObject.isUserDialog(j2)) {
                bundleM.putLong("user_id", j2);
            } else {
                bundleM.putLong("chat_id", -j2);
            }
            ChatActivity chatActivity = new ChatActivity(bundleM);
            if (topicKey.topicId != 0) {
                ForumUtilities.applyTopic(chatActivity, topicKey);
            }
            if (!((ActionBarLayout) this.parentActivity.getActionBarLayout()).presentFragment$1(chatActivity, true, false)) {
                dialogsActivity.finishFragment();
                return;
            }
            chatActivity.showFieldPanelForForward(arrayList3);
            if (topicKey.topicId != 0) {
                dialogsActivity.removeSelfFromStack();
                return;
            }
            return;
        }
        int i2 = 0;
        while (i2 < arrayList2.size()) {
            long j3 = ((MessagesStorage.TopicKey) arrayList2.get(i2)).dialogId;
            if (charSequence != null) {
                j = j3;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j = j3;
            }
            if (arrayList3 != null) {
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(arrayList3, j, false, false, true, 0, 0L);
            } else {
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j, null, null, null, null, null, null, z, i, 0, 0, this.savedMusicList, null, false, false));
            }
            i2++;
            arrayList3 = arrayList;
        }
        dialogsActivity.finishFragment();
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            BulletinFactory bulletinFactoryOf = BulletinFactory.of(lastFragment);
            int i3 = R.raw.forward;
            if (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                pluralStringComma = LocaleController.getString(R.string.FwdMessageToSavedMessages);
            } else if (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId <= 0) {
                pluralStringComma = (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId >= 0) ? LocaleController.formatPluralStringComma("FwdMessageToManyChats", arrayList2.size()) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId));
            } else {
                pluralStringComma = LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId));
            }
            bulletinFactoryOf.createSimpleBulletinWithIconSize(i3, 36, pluralStringComma).show();
        }
    }

    public final void lambda$new$12(Theme.ResourcesProvider resourcesProvider) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || this.parentActivity == null) {
            return;
        }
        saveToProfile(playingMessageObject, true, new ChatActivity$$ExternalSyntheticLambda470(11), false);
        setVisibleInProfile(true);
        FactCheckController$$ExternalSyntheticOutline0.m(R.string.AudioSaveToMyProfileSaved, new BulletinFactory((FrameLayout) this.containerView, resourcesProvider), R.raw.saved_messages, 36);
    }

    public final void lambda$new$14(Theme.ResourcesProvider resourcesProvider) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || this.parentActivity == null) {
            return;
        }
        saveToProfile(playingMessageObject, false, new ChatActivity$$ExternalSyntheticLambda470(11), false);
        setVisibleInProfile(false);
        FactCheckController$$ExternalSyntheticOutline0.m(R.string.AudioSaveToMyProfileUnsaved, new BulletinFactory((FrameLayout) this.containerView, resourcesProvider), R.raw.ic_delete, 36);
    }

    public final void lambda$new$3(float[] fArr) {
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
        if (i2 >= fArr.length) {
            i2 = 0;
        }
        MediaController.getInstance().setPlaybackSpeed(true, fArr[i2]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastPlaybackClick > 300) {
            int i3 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i3 > 2) {
                i3 = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i3).apply();
            if (i3 >= 0 && this.containerView != null) {
                AnonymousClass20 anonymousClass20 = new AnonymousClass20(5, getContext(), null, false);
                this.speedHintView = anonymousClass20;
                anonymousClass20.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                this.speedHintView.setText(LocaleController.getString(R.string.SpeedHint));
                addView(this.speedHintView, LayoutHelper.createFrame(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                this.speedHintView.showForView(this.playbackSpeedButton, true);
            }
        }
        this.lastPlaybackClick = jCurrentTimeMillis;
    }

    public final void lambda$onSubItemClick$15(MessageObject messageObject) {
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

    public final void lambda$onSubItemClick$16(TLObject tLObject, AlertDialog alertDialog) {
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

    public final void lambda$onSubItemClick$18(AlertDialog alertDialog, TLRPC.Document document, TLRPC.InputFile inputFile) {
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_uploadMedia, new ChatActivity$$ExternalSyntheticLambda208(24, this, alertDialog));
    }

    public final void lambda$onSubItemClick$19(MessageObject messageObject) {
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
                FileLoader.getInstance(this.currentAccount).uploadFile(file.getAbsolutePath(), new ArticleViewer$$ExternalSyntheticLambda33(this, alertDialog, document, 6));
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

    public final void lambda$saveToMusic$52() {
        FrameLayout frameLayout = (FrameLayout) this.containerView;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        new BulletinFactory(frameLayout, resourcesProvider).createDownloadBulletin(BulletinFactory.FileType.AUDIO, resourcesProvider).show();
    }

    public final void lambda$saveToProfile$22(TLRPC.TL_error tL_error) {
        zzlu.m((FrameLayout) this.containerView, this.resourcesProvider, tL_error);
    }

    public final void lambda$saveToProfile$23() {
        new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider).createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).show();
    }

    public final void lambda$saveToProfile$24(TLRPC.TL_error tL_error) {
        zzlu.m((FrameLayout) this.containerView, this.resourcesProvider, tL_error);
    }

    public final void lambda$saveToProfile$25(int i, boolean z, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new AudioPlayerAlert$$ExternalSyntheticLambda50(this, tL_error, 3));
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
            AndroidUtilities.runOnUIThread(new AudioPlayerAlert$$ExternalSyntheticLambda54(this, 1));
        }
    }

    public final void lambda$saveToProfile$26() {
        new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider).createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).show();
    }

    public final void lambda$saveToProfile$27(TLRPC.TL_error tL_error) {
        zzlu.m((FrameLayout) this.containerView, this.resourcesProvider, tL_error);
    }

    public final void lambda$saveToProfile$28(int i, boolean z, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new AudioPlayerAlert$$ExternalSyntheticLambda50(this, tL_error, 2));
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
            AndroidUtilities.runOnUIThread(new AudioPlayerAlert$$ExternalSyntheticLambda54(this, 0));
        }
    }

    public final void lambda$saveToProfile$29(TLRPC.TL_error tL_error) {
        zzlu.m((FrameLayout) this.containerView, this.resourcesProvider, tL_error);
    }

    public final void lambda$saveToProfile$30(long j, boolean z, TLRPC.Document document, Runnable runnable) {
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
        runnable.run();
    }

    public final void lambda$saveToProfile$31(boolean z, MessageObject messageObject, final boolean z2, final Runnable runnable, final long j, final TLRPC.Document document, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new AudioPlayerAlert$$ExternalSyntheticLambda50(this, tL_error, 1));
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TLRPC.Document document2 = document;
                    Runnable runnable2 = runnable;
                    this.f$0.lambda$saveToProfile$30(j, z2, document2, runnable2);
                }
            });
            return;
        }
        if (z || messageObject.getId() < 0) {
            AndroidUtilities.runOnUIThread(new AudioPlayerAlert$$ExternalSyntheticLambda50(this, tL_error, 0));
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
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$saveToProfile$25(id, z2, runnable, tLObject, tL_error2);
                            break;
                        default:
                            this.f$0.lambda$saveToProfile$28(id, z2, runnable, tLObject, tL_error2);
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
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$saveToProfile$25(id2, z2, runnable, tLObject, tL_error2);
                        break;
                    default:
                        this.f$0.lambda$saveToProfile$28(id2, z2, runnable, tLObject, tL_error2);
                        break;
                }
            }
        });
    }

    public final void lambda$showOptions$44(MessageObject messageObject, ItemOptions itemOptions) {
        this.savedMusicList.remove(messageObject);
        this.playlist.remove(messageObject);
        this.listAdapter.notifyDataSetChanged();
        itemOptions.dismiss();
        setVisibleInProfile(false);
        FactCheckController$$ExternalSyntheticOutline0.m(R.string.AudioSaveToMyProfileUnsaved, new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider), R.raw.ic_delete, 36);
    }

    public final void lambda$showOptions$49(MessageObject messageObject) {
        int i = UserConfig.selectedAccount;
        int i2 = this.currentAccount;
        LaunchActivity launchActivity = this.parentActivity;
        if (i != i2) {
            launchActivity.switchToAccount(i2);
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
        ((ActionBarLayout) launchActivity.getActionBarLayout()).presentFragment$1(new ChatActivity(bundle), false, false);
        lambda$showGiftOfferSheet$15();
    }

    @Override
    public final void lambda$openCrafting$8() {
        AnonymousClass3 anonymousClass3 = this.actionBar;
        if (anonymousClass3 != null && anonymousClass3.isSearchFieldVisible) {
            anonymousClass3.closeSearchField(true);
        } else if (getTag() != null) {
            showAlbumCover(false, true);
        } else {
            super.lambda$openCrafting$8();
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i, int i2, int i3, int i4) {
        AnonymousClass5 anonymousClass5 = this.blurredView;
        if (view != anonymousClass5) {
            return false;
        }
        anonymousClass5.layout(0, 0, anonymousClass5.getMeasuredWidth(), anonymousClass5.getMeasuredHeight());
        return true;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i, int i2) {
        AnonymousClass5 anonymousClass5 = this.blurredView;
        if (view != anonymousClass5) {
            return false;
        }
        anonymousClass5.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), 1073741824));
        return true;
    }

    @Override
    public final void onFailedDownload(String str, boolean z) {
    }

    @Override
    public final void onProgressDownload(String str, long j, long j2) {
        this.progressView.setProgress(Math.min(1.0f, j / j2), true);
    }

    @Override
    public final void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    public final void onSubItemClick(int i) {
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
                    saveToProfile(playingMessageObject, false, new AudioPlayerAlert$$ExternalSyntheticLambda21(this, playingMessageObject, 0), false);
                    return;
                }
                if (i == 8) {
                    SelectAudioAlert selectAudioAlert = new SelectAudioAlert(getContext(), true, null, new AudioPlayerAlert$$ExternalSyntheticLambda22(this, 0), null);
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
            launchActivity.switchToAccount(i3);
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
        ((ActionBarLayout) launchActivity.getActionBarLayout()).presentFragment$1(new ChatActivity(bundle), false, false);
        lambda$showGiftOfferSheet$15();
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    public final void saveToMusic(MessageObject messageObject) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && (i <= 28 || BuildVars.NO_SCOPED_STORAGE)) {
            LaunchActivity launchActivity = this.parentActivity;
            if (launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        String documentFileName = FileLoader.getDocumentFileName(messageObject.getDocument());
        if (TextUtils.isEmpty(documentFileName)) {
            documentFileName = messageObject.getFileName();
        }
        String str = documentFileName;
        String string = messageObject.messageOwner.attachPath;
        if (string != null && string.length() > 0 && !ArticleViewer.IBlock.CC.m(string)) {
            string = null;
        }
        if (string == null || string.length() == 0) {
            string = FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner).toString();
        }
        MediaController.saveFile(string, this.parentActivity, 3, str, messageObject.getDocument() != null ? messageObject.getDocument().mime_type : "", new AudioPlayerAlert$$ExternalSyntheticLambda22(this, 1));
    }

    public final void saveToProfile(MessageObject messageObject, boolean z, Runnable runnable, boolean z2) {
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, new AudioPlayerAlert$$ExternalSyntheticLambda44(this, z2, messageObject, z, runnable, j, document));
    }

    public final boolean scrollToCurrentSong(boolean z) {
        int iIndexOf;
        boolean z2;
        LinearLayoutManager linearLayoutManager;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            if (z) {
                AnonymousClass15 anonymousClass15 = this.listView;
                int childCount = anonymousClass15.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = anonymousClass15.getChildAt(i);
                    if ((childAt instanceof AudioPlayerCell) && ((AudioPlayerCell) childAt).getMessageObject() == playingMessageObject) {
                        if (childAt.getBottom() > anonymousClass15.getMeasuredHeight()) {
                            break;
                        }
                    }
                }
                iIndexOf = this.playlist.indexOf(playingMessageObject);
                if (this.padWithItem) {
                    iIndexOf++;
                }
                if (iIndexOf >= 0) {
                    z2 = SharedConfig.playOrderReversed;
                    linearLayoutManager = this.layoutManager;
                    if (z2) {
                        linearLayoutManager.scrollToPosition(iIndexOf);
                        return true;
                    }
                    linearLayoutManager.scrollToPosition(this.playlist.size() - iIndexOf);
                    return true;
                }
            } else {
                iIndexOf = this.playlist.indexOf(playingMessageObject);
                if (this.padWithItem) {
                    iIndexOf++;
                }
                if (iIndexOf >= 0) {
                    z2 = SharedConfig.playOrderReversed;
                    linearLayoutManager = this.layoutManager;
                    if (z2) {
                        linearLayoutManager.scrollToPosition(iIndexOf);
                        return true;
                    }
                    linearLayoutManager.scrollToPosition(this.playlist.size() - iIndexOf);
                    return true;
                }
            }
        }
        return false;
    }

    public final void setMenuItemChecked(ActionBarMenuSubItem actionBarMenuSubItem, boolean z) {
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

    public final void setVisibleInProfile(final boolean z) {
        boolean zIsMyList = isMyList();
        ButtonWithCounterView buttonWithCounterView = this.unsaveFromProfileButton;
        ButtonWithCounterView buttonWithCounterView2 = this.saveToProfileButton;
        if (zIsMyList || this.noforwards) {
            buttonWithCounterView2.setVisibility(8);
            buttonWithCounterView.setVisibility(8);
            return;
        }
        buttonWithCounterView2.setVisibility(0);
        buttonWithCounterView.setVisibility(0);
        ViewPropertyAnimator duration = buttonWithCounterView2.animate().alpha(z ? 0.0f : 1.0f).scaleX(z ? 0.8f : 1.0f).scaleY(z ? 0.8f : 1.0f).setDuration(420L);
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
                        this.f$0.saveToProfileButton.setVisibility(z ? 8 : 0);
                        break;
                    default:
                        this.f$0.unsaveFromProfileButton.setVisibility(z ? 0 : 8);
                        break;
                }
            }
        }).start();
        final int i2 = 1;
        buttonWithCounterView.animate().alpha(z ? 1.0f : 0.0f).scaleX(!z ? 0.8f : 1.0f).scaleY(z ? 1.0f : 0.8f).setDuration(420L).setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable(this) {
            public final AudioPlayerAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f$0.saveToProfileButton.setVisibility(z ? 8 : 0);
                        break;
                    default:
                        this.f$0.unsaveFromProfileButton.setVisibility(z ? 0 : 8);
                        break;
                }
            }
        }).start();
    }

    public final void share(MessageObject messageObject) {
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
                builder.alertDialog.title = LocaleController.getString(R.string.AppName);
                builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                builder.alertDialog.message = LocaleController.getString(R.string.PleaseDownload);
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

    @Override
    public final void show() {
        super.show();
        instance = this;
    }

    public final void showAlbumCover(boolean z, boolean z2) {
        BackupImageView backupImageView = this.bigAlbumConver;
        AnonymousClass5 anonymousClass5 = this.blurredView;
        if (z) {
            if (anonymousClass5.getVisibility() == 0 || this.blurredAnimationInProgress) {
                return;
            }
            anonymousClass5.setTag(1);
            AnonymousClass6 anonymousClass6 = this.coverContainer;
            backupImageView.setImageBitmap(anonymousClass6.imageViews[anonymousClass6.activeIndex].getImageReceiver().getBitmap());
            this.blurredAnimationInProgress = true;
            ScrimOptions.makeGlobalBlurBitmaps(new AudioPlayerAlert$$ExternalSyntheticLambda9(this, 1));
            anonymousClass5.setVisibility(0);
            anonymousClass5.animate().alpha(1.0f).setDuration(180L).setListener(new AnonymousClass21(this, 0)).start();
            backupImageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (anonymousClass5.getVisibility() != 0) {
            return;
        }
        anonymousClass5.setTag(null);
        if (z2) {
            this.blurredAnimationInProgress = true;
            anonymousClass5.animate().alpha(0.0f).setDuration(180L).setListener(new AnonymousClass21(this, 1)).start();
            backupImageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            anonymousClass5.setAlpha(0.0f);
            anonymousClass5.setVisibility(4);
            backupImageView.setImageBitmap(null);
            backupImageView.setScaleX(0.9f);
            backupImageView.setScaleY(0.9f);
        }
    }

    public final void showMenuOptions(View view) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.container, this.resourcesProvider, view, true);
        ItemOptions itemOptionsBuildSaveOptions = buildSaveOptions(playingMessageObject, itemOptionsMakeOptions);
        if (!isMyList()) {
            itemOptionsMakeOptions.addIf(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new PhotoViewer$$ExternalSyntheticLambda133(itemOptionsMakeOptions, itemOptionsBuildSaveOptions, 5), !this.noforwards);
            if (!this.noforwards && itemOptionsMakeOptions.getLast() != null) {
                itemOptionsMakeOptions.getLast().setRightIcon(R.drawable.msg_arrowright);
            }
            itemOptionsMakeOptions.addGap();
        }
        itemOptionsMakeOptions.addIf(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new AudioPlayerAlert$$ExternalSyntheticLambda32(this, itemOptionsMakeOptions, 0), !this.noforwards);
        itemOptionsMakeOptions.addIf(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new AudioPlayerAlert$$ExternalSyntheticLambda32(this, itemOptionsMakeOptions, 1), !this.noforwards);
        itemOptionsMakeOptions.addIf(R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new AudioPlayerAlert$$ExternalSyntheticLambda32(this, itemOptionsMakeOptions, 2), playingMessageObject.getId() > 0);
        if (this.castAvailable) {
            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, itemOptionsMakeOptions.context, itemOptionsMakeOptions.resourcesProvider, false, false);
            itemOptionsMakeOptions.add(actionBarMenuSubItem);
            this.castItem = actionBarMenuSubItem;
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast, null);
            this.castItem.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(this, itemOptionsMakeOptions));
            PhotoViewer.AnonymousClass17 anonymousClass17 = this.castItemButton;
            AndroidUtilities.removeFromParent(anonymousClass17);
            this.castItem.addView(anonymousClass17, 0, LayoutHelper.createFrame(-1.0f, -1));
            updateColors$1();
        }
        boolean zIsMyList = isMyList();
        int i = R.drawable.msg_delete;
        String string = LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile);
        AudioPlayerAlert$$ExternalSyntheticLambda32 audioPlayerAlert$$ExternalSyntheticLambda32 = new AudioPlayerAlert$$ExternalSyntheticLambda32(this, itemOptionsMakeOptions, 3);
        if (zIsMyList) {
            itemOptionsMakeOptions.add(i, string, audioPlayerAlert$$ExternalSyntheticLambda32, true);
        }
        itemOptionsMakeOptions.setTranslationY(AndroidUtilities.dp(64.0f));
        itemOptionsMakeOptions.show();
    }

    public final void showOptions(AudioPlayerCell audioPlayerCell, MessageObject messageObject) {
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.container, this.resourcesProvider, audioPlayerCell, true);
        if (isMyList()) {
            itemOptionsMakeOptions.addIf(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new AudioPlayerAlert$$ExternalSyntheticLambda24(this, itemOptionsMakeOptions, messageObject, 0), !this.noforwards);
            itemOptionsMakeOptions.addIf(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new AudioPlayerAlert$$ExternalSyntheticLambda24(this, itemOptionsMakeOptions, messageObject, 1), !this.noforwards);
            itemOptionsMakeOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new AudioPlayerAlert$$ExternalSyntheticLambda24(this, messageObject, itemOptionsMakeOptions, 2), true);
        } else {
            itemOptionsMakeOptions.addIf(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new PhotoViewer$$ExternalSyntheticLambda133(itemOptionsMakeOptions, buildSaveOptions(messageObject, itemOptionsMakeOptions), 4), !this.noforwards);
            if (!this.noforwards && itemOptionsMakeOptions.getLast() != null) {
                itemOptionsMakeOptions.getLast().setRightIcon(R.drawable.msg_arrowright);
            }
            itemOptionsMakeOptions.addGap();
            itemOptionsMakeOptions.addIf(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new AudioPlayerAlert$$ExternalSyntheticLambda24(this, itemOptionsMakeOptions, messageObject, 3), !this.noforwards);
            itemOptionsMakeOptions.addIf(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new AudioPlayerAlert$$ExternalSyntheticLambda24(this, itemOptionsMakeOptions, messageObject, 4), !this.noforwards);
            itemOptionsMakeOptions.addIf(R.drawable.msg_view_file, LocaleController.getString(R.string.ShowInChat), new AudioPlayerAlert$$ExternalSyntheticLambda21(this, messageObject, 1), messageObject.getId() > 0);
        }
        itemOptionsMakeOptions.setGravity(LocaleController.isRTL ? 3 : 5);
        itemOptionsMakeOptions.show();
    }

    public final void updateColors$1() {
        ActionBarMenuItem actionBarMenuItem = this.playbackSpeedButton;
        if (actionBarMenuItem != null) {
            int themedColor = getThemedColor(Math.abs(MediaController.getInstance().getPlaybackSpeed(true) - 1.0f) < 0.05f ? Theme.key_inappPlayerClose : Theme.key_featuredStickers_addButtonPressed);
            CanvasButton.AnonymousClass2 anonymousClass2 = this.speedIcon;
            if (anonymousClass2 != null) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = (AnimatedTextView.AnimatedTextDrawable) anonymousClass2.this$0;
                animatedTextDrawable.textPaint.setColor(themedColor);
                animatedTextDrawable.alpha = Color.alpha(themedColor);
                Paint paint = (Paint) anonymousClass2.val$maskPaint2;
                if (paint != null) {
                    paint.setColor(themedColor);
                }
            }
            actionBarMenuItem.setBackground(Theme.createSelectorDrawable(themedColor & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        final ActionBarMenuSubItem actionBarMenuSubItem = this.castItem;
        if (actionBarMenuSubItem != null) {
            PhotoViewer.AnonymousClass17 anonymousClass17 = this.castItemButton;
            final boolean z = anonymousClass17 != null && anonymousClass17.isConnected();
            final int themedColor2 = getThemedColor(Theme.key_actionBarDefaultSubmenuItem);
            final int themedColor3 = getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon);
            int i = Theme.key_featuredStickers_addButton;
            final int themedColor4 = getThemedColor(i);
            ValueAnimator valueAnimator = actionBarMenuSubItem.enabledAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(actionBarMenuSubItem.enabled ? 1.0f : 0.0f, z ? 1.0f : 0.0f);
            actionBarMenuSubItem.enabledAnimator = valueAnimatorOfFloat;
            actionBarMenuSubItem.enabled = z;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ActionBarMenuSubItem actionBarMenuSubItem2 = actionBarMenuSubItem;
                    actionBarMenuSubItem2.getClass();
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    int i2 = themedColor2;
                    int i3 = themedColor4;
                    actionBarMenuSubItem2.setTextColor(ColorUtils.blendARGB(fFloatValue, i2, i3));
                    actionBarMenuSubItem2.setIconColor(ColorUtils.blendARGB(fFloatValue, themedColor3, i3));
                }
            });
            actionBarMenuSubItem.enabledAnimator.addListener(new AnimatorListenerAdapter() {
                public final int val$colorEnabled;
                public final boolean val$enabled;
                public final int val$iconColorDisabled;
                public final int val$textColorDisabled;

                public AnonymousClass2() {
                    z = z;
                    i = themedColor2;
                    i = themedColor4;
                    i = themedColor3;
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    float f = z ? 1.0f : 0.0f;
                    int i2 = i;
                    int i3 = i;
                    int iBlendARGB = ColorUtils.blendARGB(f, i2, i3);
                    ActionBarMenuSubItem actionBarMenuSubItem2 = ActionBarMenuSubItem.this;
                    actionBarMenuSubItem2.setTextColor(iBlendARGB);
                    actionBarMenuSubItem2.setIconColor(ColorUtils.blendARGB(f, i, i3));
                }
            });
            actionBarMenuSubItem.enabledAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            actionBarMenuSubItem.enabledAnimator.start();
            this.castItem.setSelectorColor((anonymousClass17 == null || !anonymousClass17.isConnected()) ? getThemedColor(Theme.key_listSelector) : Theme.multAlpha(0.1f, getThemedColor(i)));
        }
    }

    public final void updateEmptyViewPosition$1() {
        LinearLayout linearLayout = this.emptyView;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.containerView.getMeasuredHeight()) - (getVisibility() == 0 ? AndroidUtilities.dp(150.0f) : -AndroidUtilities.dp(30.0f))) / 2);
    }

    public final void updatePlaybackButton(boolean z) {
        if (this.playbackSpeedButton == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
        CanvasButton.AnonymousClass2 anonymousClass2 = this.speedIcon;
        anonymousClass2.getClass();
        String str = CanvasButton.AnonymousClass2.formatNumber(playbackSpeed) + "X";
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = (AnimatedTextView.AnimatedTextDrawable) anonymousClass2.this$0;
        if (!z || !TextUtils.equals(animatedTextDrawable.currentText, str)) {
            animatedTextDrawable.cancelAnimation();
            animatedTextDrawable.setText(str, z, true);
            anonymousClass2.invalidateSelf();
        }
        this.speedSlider.setSpeed(playbackSpeed, z);
        updateColors$1();
        boolean z2 = this.slidingSpeed;
        int i = 0;
        this.slidingSpeed = false;
        while (true) {
            ActionBarMenuSubItem[] actionBarMenuSubItemArr = this.speedItems;
            if (i >= actionBarMenuSubItemArr.length) {
                return;
            }
            if (z2 || Math.abs(playbackSpeed - speeds[i]) >= 0.05f) {
                ActionBarMenuSubItem actionBarMenuSubItem = actionBarMenuSubItemArr[i];
                int i2 = Theme.key_actionBarDefaultSubmenuItem;
                int themedColor = getThemedColor(i2);
                int themedColor2 = getThemedColor(i2);
                actionBarMenuSubItem.setTextColor(themedColor);
                actionBarMenuSubItem.setIconColor(themedColor2);
            } else {
                ActionBarMenuSubItem actionBarMenuSubItem2 = actionBarMenuSubItemArr[i];
                int i3 = Theme.key_featuredStickers_addButtonPressed;
                int themedColor3 = getThemedColor(i3);
                int themedColor4 = getThemedColor(i3);
                actionBarMenuSubItem2.setTextColor(themedColor3);
                actionBarMenuSubItem2.setIconColor(themedColor4);
            }
            i++;
        }
    }

    public final void updateProgress(MessageObject messageObject, boolean z) {
        boolean z2;
        int duration;
        AnonymousClass9 anonymousClass9 = this.seekBarView;
        if (anonymousClass9 != null) {
            if (anonymousClass9.pressed) {
                duration = (int) (messageObject.getDuration() * ((double) anonymousClass9.getProgress()));
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
                    anonymousClass9.setProgress(this.rewindingProgress, z);
                } else {
                    anonymousClass9.setProgress(messageObject.audioProgress, z);
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
                    duration = (int) (messageObject.getDuration() * ((double) anonymousClass9.getProgress()));
                    messageObject.audioProgressSec = duration;
                } else {
                    duration = messageObject.audioProgressSec;
                }
            }
            if (this.lastTime != duration) {
                this.lastTime = duration;
                this.timeTextView.setText(AndroidUtilities.formatShortDuration(duration), false);
            }
            anonymousClass9.updateTimestamps(messageObject);
        }
    }

    public final void updateRepeatButton() {
        int i = SharedConfig.repeatMode;
        ActionBarMenuItem actionBarMenuItem = this.repeatButton;
        if (i != 0 && i != 1) {
            if (i == 2) {
                actionBarMenuItem.setIcon(R.drawable.player_new_repeatone);
                int i2 = Theme.key_player_buttonActive;
                actionBarMenuItem.setTag(Integer.valueOf(i2));
                actionBarMenuItem.setIconColor(getThemedColor(i2));
                Theme.setSelectorDrawableColor(actionBarMenuItem.getBackground(), getThemedColor(i2) & 436207615, true);
                actionBarMenuItem.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOne));
                return;
            }
            return;
        }
        if (SharedConfig.shuffleMusic) {
            if (i == 0) {
                actionBarMenuItem.setIcon(R.drawable.player_new_shuffle);
            } else {
                actionBarMenuItem.setIcon(R.drawable.player_new_repeat_shuffle);
            }
        } else if (!SharedConfig.playOrderReversed) {
            actionBarMenuItem.setIcon(R.drawable.player_new_repeatall);
        } else if (i == 0) {
            actionBarMenuItem.setIcon(R.drawable.player_new_order);
        } else {
            actionBarMenuItem.setIcon(R.drawable.player_new_repeat_reverse);
        }
        if (i == 0 && !SharedConfig.shuffleMusic && !SharedConfig.playOrderReversed) {
            int i3 = Theme.key_player_button;
            actionBarMenuItem.setTag(Integer.valueOf(i3));
            actionBarMenuItem.setIconColor(getThemedColor(i3));
            Theme.setSelectorDrawableColor(actionBarMenuItem.getBackground(), getThemedColor(Theme.key_listSelector), true);
            actionBarMenuItem.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOff));
            return;
        }
        int i4 = Theme.key_player_buttonActive;
        actionBarMenuItem.setTag(Integer.valueOf(i4));
        actionBarMenuItem.setIconColor(getThemedColor(i4));
        Theme.setSelectorDrawableColor(actionBarMenuItem.getBackground(), 436207615 & getThemedColor(i4), true);
        if (i != 0) {
            actionBarMenuItem.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatList));
        } else if (SharedConfig.shuffleMusic) {
            actionBarMenuItem.setContentDescription(LocaleController.getString(R.string.ShuffleList));
        } else {
            actionBarMenuItem.setContentDescription(LocaleController.getString(R.string.ReverseOrder));
        }
    }

    public final void updateTitle$1(boolean z) {
        File pathToMessage;
        BackupImageView backupImageView;
        BackupImageView backupImageView2;
        ImageView imageView;
        int i;
        Bitmap bitmap;
        int i2 = 8;
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
        long j = playingMessageObject.eventId;
        ActionBarMenuItem actionBarMenuItem = this.optionsButton;
        if (j != 0 || playingMessageObject.getId() <= -2000000000) {
            actionBarMenuItem.setVisibility(4);
        } else {
            actionBarMenuItem.setVisibility(0);
        }
        long dialogId = playingMessageObject.getDialogId();
        long j2 = playingMessageObject.getDocument() != null ? playingMessageObject.getDocument().id : 0L;
        boolean z3 = (dialogId < 0 && MessagesController.getInstance(this.currentAccount).isPeerNoForwards(dialogId)) || MessagesController.getInstance(this.currentAccount).isPeerNoForwards(playingMessageObject.getDialogId()) || playingMessageObject.messageOwner.noforwards;
        if (z3 != this.noforwards) {
            this.noforwards = z3;
            AnonymousClass5 anonymousClass5 = this.playerLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anonymousClass5.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(((z3 || isMyList()) ? 0 : 52) + 179);
            anonymousClass5.setLayoutParams(layoutParams);
            View view = this.playerShadow;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.bottomMargin = AndroidUtilities.dp(179 + ((isMyList() || z3) ? 0 : 52));
            view.setLayoutParams(layoutParams2);
        }
        if (z3) {
            actionBarMenuItem.hideSubItem(1);
            actionBarMenuItem.hideSubItem(2);
            actionBarMenuItem.hideSubItem(5);
            actionBarMenuItem.hideSubItem(6);
            actionBarMenuItem.setAdditionalYOffset(-AndroidUtilities.dp(16.0f));
        } else {
            actionBarMenuItem.showSubItem$1(1);
            actionBarMenuItem.showSubItem$1(2);
            actionBarMenuItem.showSubItem$1(5);
            actionBarMenuItem.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        }
        String str = playingMessageObject.messageOwner.attachPath;
        if (str == null || str.length() <= 0) {
            pathToMessage = null;
        } else {
            pathToMessage = new File(playingMessageObject.messageOwner.attachPath);
            if (!pathToMessage.exists()) {
                pathToMessage = null;
            }
        }
        if (pathToMessage == null) {
            pathToMessage = FileLoader.getInstance(this.currentAccount).getPathToMessage(playingMessageObject.messageOwner);
        }
        boolean z4 = SharedConfig.streamMedia && ((int) playingMessageObject.getDialogId()) != 0 && playingMessageObject.isMusic();
        boolean zExists = pathToMessage.exists();
        ImageView imageView2 = this.playButton;
        AnonymousClass9 anonymousClass9 = this.seekBarView;
        LineProgressView lineProgressView = this.progressView;
        if (zExists || z4) {
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            lineProgressView.setVisibility(4);
            anonymousClass9.setVisibility(0);
            imageView2.setEnabled(true);
        } else {
            String fileName = playingMessageObject.getFileName();
            DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(fileName, this);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
            lineProgressView.setProgress(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
            lineProgressView.setVisibility(0);
            anonymousClass9.setVisibility(4);
            imageView2.setEnabled(false);
        }
        updateProgress(playingMessageObject, !z2);
        AnonymousClass6 anonymousClass6 = this.coverContainer;
        if (z2) {
            backupImageView = anonymousClass6.imageViews[anonymousClass6.activeIndex];
        } else {
            backupImageView = anonymousClass6.imageViews[anonymousClass6.activeIndex == 0 ? (char) 1 : (char) 0];
        }
        AudioInfo audioInfo = MediaController.getInstance().getAudioInfo();
        if (!z2) {
            AnimatorSet animatorSet = anonymousClass6.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            anonymousClass6.animatorSet = new AnimatorSet();
            int i3 = anonymousClass6.activeIndex == 0 ? 1 : 0;
            anonymousClass6.activeIndex = i3;
            BackupImageView[] backupImageViewArr = anonymousClass6.imageViews;
            BackupImageView backupImageView3 = backupImageViewArr[i3 ^ 1];
            BackupImageView backupImageView4 = backupImageViewArr[i3];
            boolean zHasBitmapImage = backupImageView3.getImageReceiver().hasBitmapImage();
            backupImageView4.setAlpha(zHasBitmapImage ? 1.0f : 0.0f);
            backupImageView4.setScaleX(0.8f);
            backupImageView4.setScaleY(0.8f);
            backupImageView4.setVisibility(0);
            if (zHasBitmapImage) {
                backupImageView3.bringToFront();
            } else {
                backupImageView3.setVisibility(8);
                backupImageView3.setImageDrawable(null);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
            valueAnimatorOfFloat.setDuration(125L);
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            valueAnimatorOfFloat.addUpdateListener(new SecretVoicePlayer$$ExternalSyntheticLambda1(3, backupImageView4, zHasBitmapImage));
            if (zHasBitmapImage) {
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(backupImageView3.getScaleX(), 0.8f);
                valueAnimatorOfFloat2.setDuration(125L);
                valueAnimatorOfFloat2.setInterpolator(CubicBezierInterpolator.EASE_IN);
                valueAnimatorOfFloat2.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(i2, backupImageView3, backupImageView4));
                valueAnimatorOfFloat2.addListener(new CheckBox.AnonymousClass1(backupImageView3, i2));
                anonymousClass6.animatorSet.playSequentially(valueAnimatorOfFloat2, valueAnimatorOfFloat);
            } else {
                anonymousClass6.animatorSet.play(valueAnimatorOfFloat);
            }
            anonymousClass6.animatorSet.start();
        }
        if (audioInfo == null || (bitmap = audioInfo.cover) == null) {
            this.currentFile = FileLoader.getAttachFileName(playingMessageObject.getDocument());
            this.currentAudioFinishedLoading = false;
            String artworkUrl = playingMessageObject.getArtworkUrl(false);
            ImageLocation artworkThumbImageLocation = getArtworkThumbImageLocation(playingMessageObject);
            if (TextUtils.isEmpty(artworkUrl)) {
                backupImageView2 = backupImageView;
                imageView = imageView2;
                if (artworkThumbImageLocation != null) {
                    backupImageView2.imageReceiver.setImage(null, null, artworkThumbImageLocation, null, null, 0L, null, playingMessageObject, 1);
                    backupImageView2.onNewImageSet();
                } else {
                    backupImageView2.setImageDrawable(null);
                }
            } else {
                ImageLocation forPath = ImageLocation.getForPath(artworkUrl);
                imageView = imageView2;
                backupImageView2 = backupImageView;
                backupImageView.imageReceiver.setImage(forPath, null, artworkThumbImageLocation, null, null, 0L, null, playingMessageObject, 1);
                backupImageView2.onNewImageSet();
            }
            backupImageView2.invalidate();
        } else {
            backupImageView.setImageBitmap(bitmap);
            this.currentFile = null;
            this.currentAudioFinishedLoading = true;
            imageView = imageView2;
        }
        boolean zIsMessagePaused = MediaController.getInstance().isMessagePaused();
        PlayPauseDrawable playPauseDrawable = this.playPauseDrawable;
        if (zIsMessagePaused) {
            playPauseDrawable.setPause(false, true);
            imageView.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
        } else {
            playPauseDrawable.setPause(true, true);
            imageView.setContentDescription(LocaleController.getString(R.string.AccActionPause));
        }
        String musicTitle = playingMessageObject.getMusicTitle();
        String musicAuthor = playingMessageObject.getMusicAuthor();
        this.titleTextView.setText(musicTitle);
        this.authorTextView.setText(musicAuthor);
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        this.saveToProfileButton.setLoading(savedMusicIds.loading);
        setVisibleInProfile(savedMusicIds.ids.contains(Long.valueOf(j2)));
        int duration = (int) playingMessageObject.getDuration();
        this.lastDuration = duration;
        TextView textView = this.durationTextView;
        if (textView != null) {
            textView.setText(duration != 0 ? AndroidUtilities.formatShortDuration(duration) : "-:--");
        }
        ActionBarMenuItem actionBarMenuItem2 = this.playbackSpeedButton;
        if (duration > 600) {
            i = 0;
            actionBarMenuItem2.setVisibility(0);
        } else {
            i = 0;
            actionBarMenuItem2.setVisibility(8);
        }
        if (z2) {
            return;
        }
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
        while (i < size3) {
            MessageObject messageObject = (MessageObject) arrayList.get(i);
            ImageLocation artworkThumbImageLocation2 = getArtworkThumbImageLocation(messageObject);
            if (artworkThumbImageLocation2 != null) {
                if (artworkThumbImageLocation2.path != null) {
                    ImageLoader.getInstance().preloadArtwork(artworkThumbImageLocation2.path);
                } else {
                    FileLoader.getInstance(this.currentAccount).loadFile(artworkThumbImageLocation2, messageObject, null, 0, 1);
                }
            }
            i++;
        }
    }

    public final class AnonymousClass21 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final AudioPlayerAlert this$0;

        public AnonymousClass21(AudioPlayerAlert audioPlayerAlert, int i) {
            this.$r8$classId = i;
            this.this$0 = audioPlayerAlert;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 2:
                    this.this$0.actionBarAnimation = null;
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.blurredAnimationInProgress = false;
                    break;
                case 1:
                    AudioPlayerAlert audioPlayerAlert = this.this$0;
                    audioPlayerAlert.blurredView.setVisibility(4);
                    audioPlayerAlert.bigAlbumConver.setImageBitmap(null);
                    audioPlayerAlert.blurredAnimationInProgress = false;
                    break;
            }
        }

        private final void onAnimationEnd$org$telegram$ui$Components$AudioPlayerAlert$23(Animator animator) {
        }
    }
}
