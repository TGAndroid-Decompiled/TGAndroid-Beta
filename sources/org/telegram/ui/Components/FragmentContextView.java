package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import com.google.android.gms.internal.mlkit_vision_common.zzkc;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import java.util.ArrayList;
import me.vkryl.android.animator.ReplaceAnimator;
import me.vkryl.core.lambda.Destroyable;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSlider;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda267;
import org.telegram.ui.Components.conference.message.GroupCallMessageCell;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda112;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda44;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;

public abstract class FragmentContextView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener {
    public static final float[] speeds = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final int account;
    public AnimatorSet animatorSet;
    public AvatarsImageView avatars;
    public final ReplaceAnimator callMessagesAnimator;
    public final CapsuleBlobDrawable capsuleBlobDrawable;
    public final ChatActivityInterface chatActivity;
    public boolean checkCallAfterAnimation;
    public boolean checkImportAfterAnimation;
    public boolean checkLiveStoryAfterAnimation;
    public final BubbleActivity.AnonymousClass1 checkLocationRunnable;
    public boolean checkPlayerAfterAnimation;
    public ImageView closeButton;
    public int currentProgress;
    public int currentStyle;
    public FragmentContextViewDelegate delegate;
    public boolean drawOverlay;
    public boolean firstLocationsLoaded;
    public boolean flickOnAttach;
    public final BaseFragment fragment;
    public AnonymousClass3 frameLayout;
    public Paint gradientPaint;
    public TextPaint gradientTextPaint;
    public int gradientWidth;
    public int groupCallMessageCounter;
    public PhotoViewer.AnonymousClass19 groupCallMessagesContainer;
    public RLottieImageView importingImageView;
    public final boolean isLocation;
    public boolean isMusic;
    public boolean isMuted;
    public AnonymousClass6 joinButton;
    public CellFlickerDrawable joinButtonFlicker;
    public int joinButtonWidth;
    public int lastLocationSharingCount;
    public MessageObject lastMessageObject;
    public long lastPlaybackClick;
    public String lastString;
    public float leftMargin;
    public LinearGradient linearGradient;
    public Matrix matrix;
    public float micAmplitude;
    public AnonymousClass7 muteButton;
    public RLottieDrawable muteDrawable;
    public final AnimationNotificationsLocker notificationsLocker;
    public final AnimationNotificationsLocker notificationsLocker2;
    public ButtonBounce notifyButtonBounce;
    public boolean notifyButtonEnabled;
    public final AnimatedTextView.AnimatedTextDrawable notifyText;
    public ImageView playButton;
    public PlayPauseDrawable playPauseDrawable;
    public ActionBarMenuItem playbackSpeedButton;
    public final Paint progressPaint;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean scheduleRunnableScheduled;
    public View selector;
    public FrameLayout silentButton;
    public ImageView silentButtonImage;
    public boolean slidingSpeed;
    public float speakerAmplitude;
    public AnonymousClass9 speedHintView;
    public CanvasButton.AnonymousClass2 speedIcon;
    public final ActionBarMenuItem.Item[] speedItems;
    public ActionBarMenuSlider.SpeedSlider speedSlider;
    public AnonymousClass4 subtitleTextView;
    public boolean supportsCalls;
    public AnonymousClass4 titleTextView;
    public int toggleGroupCallStartSubscriptionReqId;
    public float topPadding;
    public final AnonymousClass1 updateScheduleTimeRunnable;
    public boolean visible;
    public boolean wasDraw;
    public boolean willBeNotified;

    public final class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override
        public final void run() {
            FragmentContextView fragmentContextView = FragmentContextView.this;
            if (fragmentContextView.gradientTextPaint == null || !(fragmentContextView.fragment instanceof ChatActivity)) {
                fragmentContextView.scheduleRunnableScheduled = false;
                return;
            }
            ChatObject.Call groupCall = fragmentContextView.chatActivity.getGroupCall();
            if (groupCall == null || !groupCall.isScheduled()) {
                fragmentContextView.notifyButtonEnabled = false;
                fragmentContextView.scheduleRunnableScheduled = false;
                return;
            }
            int currentTime = groupCall.call.schedule_date - fragmentContextView.fragment.getConnectionsManager().getCurrentTime();
            String pluralString = currentTime >= 86400 ? LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]) : AndroidUtilities.formatFullDuration(currentTime);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = fragmentContextView.notifyText;
            if (!fragmentContextView.willBeNotified) {
                pluralString = LocaleController.getString(R.string.VoipChatNotify);
            }
            animatedTextDrawable.setText(pluralString, true, true);
            AndroidUtilities.runOnUIThread(fragmentContextView.updateScheduleTimeRunnable, 1000L);
            fragmentContextView.frameLayout.invalidate();
        }
    }

    public final class AnonymousClass10 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final FragmentContextView this$0;

        public AnonymousClass10(FragmentContextView fragmentContextView, int i) {
            this.$r8$classId = i;
            this.this$0 = fragmentContextView;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    FragmentContextView fragmentContextView = this.this$0;
                    AnimatorSet animatorSet = fragmentContextView.animatorSet;
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        fragmentContextView.setVisibility(8);
                        fragmentContextView.animatorSet = null;
                        break;
                    }
                    break;
                case 1:
                    FragmentContextView fragmentContextView2 = this.this$0;
                    AnimatorSet animatorSet2 = fragmentContextView2.animatorSet;
                    if (animatorSet2 != null && animatorSet2.equals(animator)) {
                        fragmentContextView2.animatorSet = null;
                        break;
                    }
                    break;
                case 2:
                    FragmentContextView fragmentContextView3 = this.this$0;
                    fragmentContextView3.notificationsLocker.unlock();
                    AnimatorSet animatorSet3 = fragmentContextView3.animatorSet;
                    if (animatorSet3 != null && animatorSet3.equals(animator)) {
                        fragmentContextView3.setVisibility(8);
                        FragmentContextViewDelegate fragmentContextViewDelegate = fragmentContextView3.delegate;
                        if (fragmentContextViewDelegate != null) {
                            ((SharedMediaLayout$$ExternalSyntheticLambda11) fragmentContextViewDelegate).onAnimation(false);
                        }
                        fragmentContextView3.animatorSet = null;
                        if (fragmentContextView3.checkLiveStoryAfterAnimation) {
                            fragmentContextView3.checkLiveStory(false);
                        } else if (fragmentContextView3.checkCallAfterAnimation) {
                            fragmentContextView3.checkCall(false);
                        } else if (fragmentContextView3.checkPlayerAfterAnimation) {
                            fragmentContextView3.checkPlayer(false);
                        } else if (fragmentContextView3.checkImportAfterAnimation) {
                            fragmentContextView3.checkImport(false);
                        }
                        fragmentContextView3.checkLiveStoryAfterAnimation = false;
                        fragmentContextView3.checkCallAfterAnimation = false;
                        fragmentContextView3.checkPlayerAfterAnimation = false;
                        fragmentContextView3.checkImportAfterAnimation = false;
                        break;
                    }
                    break;
                case 3:
                    FragmentContextView fragmentContextView4 = this.this$0;
                    fragmentContextView4.notificationsLocker.unlock();
                    AnimatorSet animatorSet4 = fragmentContextView4.animatorSet;
                    if (animatorSet4 != null && animatorSet4.equals(animator)) {
                        FragmentContextViewDelegate fragmentContextViewDelegate2 = fragmentContextView4.delegate;
                        if (fragmentContextViewDelegate2 != null) {
                            ((SharedMediaLayout$$ExternalSyntheticLambda11) fragmentContextViewDelegate2).onAnimation(false);
                        }
                        fragmentContextView4.animatorSet = null;
                        if (fragmentContextView4.checkLiveStoryAfterAnimation) {
                            fragmentContextView4.checkLiveStory(false);
                        } else if (fragmentContextView4.checkCallAfterAnimation) {
                            fragmentContextView4.checkCall(false);
                        } else if (fragmentContextView4.checkPlayerAfterAnimation) {
                            fragmentContextView4.checkPlayer(false);
                        } else if (fragmentContextView4.checkImportAfterAnimation) {
                            fragmentContextView4.checkImport(false);
                        }
                        fragmentContextView4.checkLiveStoryAfterAnimation = false;
                        fragmentContextView4.checkCallAfterAnimation = false;
                        fragmentContextView4.checkPlayerAfterAnimation = false;
                        fragmentContextView4.checkImportAfterAnimation = false;
                        break;
                    }
                    break;
                case 4:
                    FragmentContextView fragmentContextView5 = this.this$0;
                    fragmentContextView5.notificationsLocker.unlock();
                    AnimatorSet animatorSet5 = fragmentContextView5.animatorSet;
                    if (animatorSet5 != null && animatorSet5.equals(animator)) {
                        fragmentContextView5.setVisibility(8);
                        fragmentContextView5.animatorSet = null;
                        if (fragmentContextView5.checkLiveStoryAfterAnimation) {
                            fragmentContextView5.checkLiveStory(false);
                        } else if (fragmentContextView5.checkCallAfterAnimation) {
                            fragmentContextView5.checkCall(false);
                        } else if (fragmentContextView5.checkPlayerAfterAnimation) {
                            fragmentContextView5.checkPlayer(false);
                        } else if (fragmentContextView5.checkImportAfterAnimation) {
                            fragmentContextView5.checkImport(false);
                        }
                        fragmentContextView5.checkLiveStoryAfterAnimation = false;
                        fragmentContextView5.checkCallAfterAnimation = false;
                        fragmentContextView5.checkPlayerAfterAnimation = false;
                        fragmentContextView5.checkImportAfterAnimation = false;
                        break;
                    }
                    break;
                case 5:
                    FragmentContextView fragmentContextView6 = this.this$0;
                    fragmentContextView6.notificationsLocker.unlock();
                    AnimatorSet animatorSet6 = fragmentContextView6.animatorSet;
                    if (animatorSet6 != null && animatorSet6.equals(animator)) {
                        FragmentContextViewDelegate fragmentContextViewDelegate3 = fragmentContextView6.delegate;
                        if (fragmentContextViewDelegate3 != null) {
                            ((SharedMediaLayout$$ExternalSyntheticLambda11) fragmentContextViewDelegate3).onAnimation(false);
                        }
                        fragmentContextView6.animatorSet = null;
                        if (fragmentContextView6.checkLiveStoryAfterAnimation) {
                            fragmentContextView6.checkLiveStory(false);
                        } else if (fragmentContextView6.checkCallAfterAnimation) {
                            fragmentContextView6.checkCall(false);
                        } else if (fragmentContextView6.checkPlayerAfterAnimation) {
                            fragmentContextView6.checkPlayer(false);
                        } else if (fragmentContextView6.checkImportAfterAnimation) {
                            fragmentContextView6.checkImport(false);
                        }
                        fragmentContextView6.checkLiveStoryAfterAnimation = false;
                        fragmentContextView6.checkCallAfterAnimation = false;
                        fragmentContextView6.checkPlayerAfterAnimation = false;
                        fragmentContextView6.checkImportAfterAnimation = false;
                        break;
                    }
                    break;
                case 6:
                    FragmentContextView fragmentContextView7 = this.this$0;
                    fragmentContextView7.notificationsLocker.unlock();
                    AnimatorSet animatorSet7 = fragmentContextView7.animatorSet;
                    if (animatorSet7 != null && animatorSet7.equals(animator)) {
                        fragmentContextView7.setVisibility(8);
                        fragmentContextView7.animatorSet = null;
                        if (fragmentContextView7.checkLiveStoryAfterAnimation) {
                            fragmentContextView7.checkLiveStory(false);
                        } else if (fragmentContextView7.checkCallAfterAnimation) {
                            fragmentContextView7.checkCall(false);
                        } else if (fragmentContextView7.checkPlayerAfterAnimation) {
                            fragmentContextView7.checkPlayer(false);
                        } else if (fragmentContextView7.checkImportAfterAnimation) {
                            fragmentContextView7.checkImport(false);
                        }
                        fragmentContextView7.checkLiveStoryAfterAnimation = false;
                        fragmentContextView7.checkCallAfterAnimation = false;
                        fragmentContextView7.checkPlayerAfterAnimation = false;
                        fragmentContextView7.checkImportAfterAnimation = false;
                        break;
                    }
                    break;
                case 7:
                    FragmentContextView fragmentContextView8 = this.this$0;
                    fragmentContextView8.notificationsLocker.unlock();
                    AnimatorSet animatorSet8 = fragmentContextView8.animatorSet;
                    if (animatorSet8 != null && animatorSet8.equals(animator)) {
                        fragmentContextView8.visible = false;
                        fragmentContextView8.animatorSet = null;
                        fragmentContextView8.checkLiveStory(false);
                        break;
                    }
                    break;
                case 8:
                    FragmentContextView fragmentContextView9 = this.this$0;
                    fragmentContextView9.notificationsLocker2.unlock();
                    AnimatorSet animatorSet9 = fragmentContextView9.animatorSet;
                    if (animatorSet9 != null && animatorSet9.equals(animator)) {
                        fragmentContextView9.animatorSet = null;
                    }
                    if (fragmentContextView9.checkLiveStoryAfterAnimation) {
                        fragmentContextView9.checkLiveStory(false);
                    } else if (fragmentContextView9.checkCallAfterAnimation) {
                        fragmentContextView9.checkCall(false);
                    } else if (fragmentContextView9.checkPlayerAfterAnimation) {
                        fragmentContextView9.checkPlayer(false);
                    } else if (fragmentContextView9.checkImportAfterAnimation) {
                        fragmentContextView9.checkImport(false);
                    }
                    fragmentContextView9.checkLiveStoryAfterAnimation = false;
                    fragmentContextView9.checkCallAfterAnimation = false;
                    fragmentContextView9.checkPlayerAfterAnimation = false;
                    fragmentContextView9.checkImportAfterAnimation = false;
                    fragmentContextView9.startJoinFlickerAnimation();
                    break;
                case 9:
                    FragmentContextView fragmentContextView10 = this.this$0;
                    fragmentContextView10.notificationsLocker.unlock();
                    AnimatorSet animatorSet10 = fragmentContextView10.animatorSet;
                    if (animatorSet10 != null && animatorSet10.equals(animator)) {
                        fragmentContextView10.setVisibility(8);
                        fragmentContextView10.animatorSet = null;
                        if (fragmentContextView10.checkLiveStoryAfterAnimation) {
                            fragmentContextView10.checkLiveStory(false);
                        } else if (fragmentContextView10.checkCallAfterAnimation) {
                            fragmentContextView10.checkCall(false);
                        } else if (fragmentContextView10.checkPlayerAfterAnimation) {
                            fragmentContextView10.checkPlayer(false);
                        } else if (fragmentContextView10.checkImportAfterAnimation) {
                            fragmentContextView10.checkImport(false);
                        }
                        fragmentContextView10.checkLiveStoryAfterAnimation = false;
                        fragmentContextView10.checkCallAfterAnimation = false;
                        fragmentContextView10.checkPlayerAfterAnimation = false;
                        fragmentContextView10.checkImportAfterAnimation = false;
                        break;
                    }
                    break;
                case 10:
                    FragmentContextView fragmentContextView11 = this.this$0;
                    fragmentContextView11.notificationsLocker.unlock();
                    AnimatorSet animatorSet11 = fragmentContextView11.animatorSet;
                    if (animatorSet11 != null && animatorSet11.equals(animator)) {
                        fragmentContextView11.visible = false;
                        fragmentContextView11.animatorSet = null;
                        fragmentContextView11.checkCall(false);
                        break;
                    }
                    break;
                default:
                    FragmentContextView fragmentContextView12 = this.this$0;
                    fragmentContextView12.notificationsLocker2.unlock();
                    AnimatorSet animatorSet12 = fragmentContextView12.animatorSet;
                    if (animatorSet12 != null && animatorSet12.equals(animator)) {
                        fragmentContextView12.animatorSet = null;
                    }
                    if (fragmentContextView12.checkLiveStoryAfterAnimation) {
                        fragmentContextView12.checkLiveStory(false);
                    } else if (fragmentContextView12.checkCallAfterAnimation) {
                        fragmentContextView12.checkCall(false);
                    } else if (fragmentContextView12.checkPlayerAfterAnimation) {
                        fragmentContextView12.checkPlayer(false);
                    } else if (fragmentContextView12.checkImportAfterAnimation) {
                        fragmentContextView12.checkImport(false);
                    }
                    fragmentContextView12.checkLiveStoryAfterAnimation = false;
                    fragmentContextView12.checkCallAfterAnimation = false;
                    fragmentContextView12.checkPlayerAfterAnimation = false;
                    fragmentContextView12.checkImportAfterAnimation = false;
                    fragmentContextView12.startJoinFlickerAnimation();
                    break;
            }
        }
    }

    public final class AnonymousClass3 extends FrameLayout {
        public final RectF notifyButtonRect;

        public AnonymousClass3(Context context) {
            super(context);
            this.notifyButtonRect = new RectF();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            FragmentContextView fragmentContextView = FragmentContextView.this;
            if (fragmentContextView.currentStyle == 4 && fragmentContextView.notifyButtonEnabled) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = fragmentContextView.notifyText;
                int iDp = AndroidUtilities.dp(24.0f) + ((int) Math.ceil(animatedTextDrawable.getCurrentWidth()));
                float f = 1.0f;
                if (iDp != fragmentContextView.gradientWidth) {
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, iDp, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    fragmentContextView.linearGradient = linearGradient;
                    fragmentContextView.gradientPaint.setShader(linearGradient);
                    fragmentContextView.gradientWidth = iDp;
                }
                ChatObject.Call groupCall = fragmentContextView.chatActivity.getGroupCall();
                BaseFragment baseFragment = fragmentContextView.fragment;
                if (baseFragment == null || groupCall == null || !groupCall.isScheduled()) {
                    f = 0.0f;
                } else {
                    long currentTimeMillis = (((long) groupCall.call.schedule_date) * 1000) - baseFragment.getConnectionsManager().getCurrentTimeMillis();
                    if (currentTimeMillis >= 0) {
                        f = currentTimeMillis < 5000 ? 1.0f - (currentTimeMillis / 5000.0f) : 0.0f;
                    }
                    if (currentTimeMillis < 6000) {
                        invalidate();
                    }
                }
                fragmentContextView.matrix.reset();
                fragmentContextView.matrix.postTranslate((-fragmentContextView.gradientWidth) * 0.7f * f, 0.0f);
                fragmentContextView.linearGradient.setLocalMatrix(fragmentContextView.matrix);
                int measuredWidth = (getMeasuredWidth() - iDp) - AndroidUtilities.dp(10.0f);
                int iDp2 = AndroidUtilities.dp(10.0f);
                RectF rectF = this.notifyButtonRect;
                float f2 = measuredWidth;
                float f3 = iDp2;
                rectF.set(f2, f3, measuredWidth + iDp, AndroidUtilities.dp(28.0f) + iDp2);
                canvas.save();
                float scale = fragmentContextView.notifyButtonBounce.getScale(0.1f);
                canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
                canvas.translate(f2, f3);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, iDp, AndroidUtilities.dp(28.0f));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), fragmentContextView.gradientPaint);
                canvas.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                animatedTextDrawable.setBounds(0, 0, AndroidUtilities.displaySize.x, AndroidUtilities.dp(16.0f));
                animatedTextDrawable.draw(canvas);
                canvas.restore();
            }
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            BaseFragment baseFragment;
            ChatActivityInterface chatActivityInterface;
            ChatObject.Call groupCall;
            FragmentContextView fragmentContextView = FragmentContextView.this;
            if (fragmentContextView.currentStyle == 4 && fragmentContextView.notifyButtonEnabled && fragmentContextView.notifyButtonBounce != null) {
                boolean zContains = this.notifyButtonRect.contains(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0) {
                    fragmentContextView.notifyButtonBounce.setPressed(zContains);
                } else if (motionEvent.getAction() == 2) {
                    if (!zContains) {
                        fragmentContextView.notifyButtonBounce.setPressed(false);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (zContains && (baseFragment = fragmentContextView.fragment) != null && (chatActivityInterface = fragmentContextView.chatActivity) != null && (groupCall = chatActivityInterface.getGroupCall()) != null && groupCall.call != null) {
                        if (fragmentContextView.toggleGroupCallStartSubscriptionReqId != 0) {
                            baseFragment.getConnectionsManager().cancelRequest(fragmentContextView.toggleGroupCallStartSubscriptionReqId, true);
                            fragmentContextView.toggleGroupCallStartSubscriptionReqId = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.getInputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupCall.call;
                        boolean z = !fragmentContextView.willBeNotified;
                        fragmentContextView.willBeNotified = z;
                        groupCall2.schedule_start_subscribed = z;
                        togglegroupcallstartsubscription.subscribed = z;
                        fragmentContextView.toggleGroupCallStartSubscriptionReqId = baseFragment.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        boolean z2 = fragmentContextView.scheduleRunnableScheduled;
                        AnonymousClass1 anonymousClass1 = fragmentContextView.updateScheduleTimeRunnable;
                        if (z2) {
                            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                            fragmentContextView.scheduleRunnableScheduled = false;
                        }
                        anonymousClass1.run();
                        BulletinFactory bulletinFactoryOf = BulletinFactory.of(baseFragment);
                        boolean z3 = fragmentContextView.willBeNotified;
                        FactCheckController$$ExternalSyntheticOutline0.m(z3 ? R.string.LiveStreamWillNotify : R.string.LiveStreamWillNotNotify, bulletinFactoryOf, z3 ? R.raw.silent_unmute : R.raw.silent_mute, 36);
                    }
                    fragmentContextView.notifyButtonBounce.setPressed(false);
                } else if (motionEvent.getAction() == 3) {
                    fragmentContextView.notifyButtonBounce.setPressed(false);
                }
            } else {
                ButtonBounce buttonBounce = fragmentContextView.notifyButtonBounce;
                if (buttonBounce != null) {
                    buttonBounce.setPressed(false);
                }
            }
            ButtonBounce buttonBounce2 = fragmentContextView.notifyButtonBounce;
            return (buttonBounce2 != null && buttonBounce2.isPressed) || super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            FragmentContextView fragmentContextView = FragmentContextView.this;
            AvatarsImageView avatarsImageView = fragmentContextView.avatars;
            if (avatarsImageView == null || avatarsImageView.getVisibility() != 0) {
                return;
            }
            fragmentContextView.avatars.invalidate();
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return drawable == FragmentContextView.this.notifyText || super.verifyDrawable(drawable);
        }
    }

    public final class AnonymousClass6 extends TextView {
        public AnonymousClass6(Context context) {
            super(context);
        }

        @Override
        public final void draw(Canvas canvas) {
            super.draw(canvas);
            int iDp = AndroidUtilities.dp(1.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            float f = iDp;
            rectF.set(f, f, getWidth() - iDp, getHeight() - iDp);
            FragmentContextView.this.joinButtonFlicker.draw(AndroidUtilities.dp(16.0f), canvas, rectF, this);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            updateJoinButtonWidth(getMeasuredWidth());
        }

        @Override
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            FragmentContextView.this.joinButtonFlicker.parentWidth = getWidth();
        }

        @Override
        public final void setVisibility(int i) {
            super.setVisibility(i);
            if (i != 0) {
                updateJoinButtonWidth(0);
                FragmentContextView.this.joinButtonWidth = 0;
            }
        }

        public final void updateJoinButtonWidth(int i) {
            FragmentContextView fragmentContextView = FragmentContextView.this;
            if (fragmentContextView.joinButtonWidth != i) {
                AnonymousClass4 anonymousClass4 = fragmentContextView.titleTextView;
                anonymousClass4.setPadding(anonymousClass4.getPaddingLeft(), fragmentContextView.titleTextView.getPaddingTop(), (fragmentContextView.titleTextView.getPaddingRight() - fragmentContextView.joinButtonWidth) + i, fragmentContextView.titleTextView.getPaddingBottom());
                fragmentContextView.joinButtonWidth = i;
            }
        }
    }

    public final class AnonymousClass7 extends RLottieImageView {
        public final FragmentContextView$7$$ExternalSyntheticLambda0 pressRunnable;
        public boolean pressed;
        public boolean scheduled;
        public final FragmentContextView$7$$ExternalSyntheticLambda0 toggleMicRunnable;

        public AnonymousClass7(Context context) {
            super(context);
            final int i = 0;
            this.toggleMicRunnable = new Runnable(this) {
                public final FragmentContextView.AnonymousClass7 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i) {
                        case 0:
                            FragmentContextView.AnonymousClass7 anonymousClass7 = this.f$0;
                            anonymousClass7.getClass();
                            if (VoIPService.getSharedInstance() != null) {
                                VoIPService.getSharedInstance().setMicMute(false, true, false);
                                FragmentContextView fragmentContextView = FragmentContextView.this;
                                if (fragmentContextView.muteDrawable.setCustomEndFrame(fragmentContextView.isMuted ? 15 : 29)) {
                                    if (fragmentContextView.isMuted) {
                                        fragmentContextView.muteDrawable.setCurrentFrame(0, true, false);
                                    } else {
                                        fragmentContextView.muteDrawable.setCurrentFrame(14, true, false);
                                    }
                                }
                                fragmentContextView.muteButton.playAnimation();
                                Theme.getFragmentContextViewWavesDrawable().updateState(true);
                                fragmentContextView.capsuleBlobDrawable.updateState(true);
                                break;
                            }
                            break;
                        default:
                            FragmentContextView.AnonymousClass7 anonymousClass8 = this.f$0;
                            if (anonymousClass8.scheduled && VoIPService.getSharedInstance() != null) {
                                anonymousClass8.scheduled = false;
                                anonymousClass8.pressed = true;
                                FragmentContextView fragmentContextView2 = FragmentContextView.this;
                                fragmentContextView2.isMuted = false;
                                AndroidUtilities.runOnUIThread(anonymousClass8.toggleMicRunnable, 90L);
                                try {
                                    fragmentContextView2.muteButton.performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                    return;
                                }
                                break;
                            }
                            break;
                    }
                }
            };
            final int i2 = 1;
            this.pressRunnable = new Runnable(this) {
                public final FragmentContextView.AnonymousClass7 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            FragmentContextView.AnonymousClass7 anonymousClass7 = this.f$0;
                            anonymousClass7.getClass();
                            if (VoIPService.getSharedInstance() != null) {
                                VoIPService.getSharedInstance().setMicMute(false, true, false);
                                FragmentContextView fragmentContextView = FragmentContextView.this;
                                if (fragmentContextView.muteDrawable.setCustomEndFrame(fragmentContextView.isMuted ? 15 : 29)) {
                                    if (fragmentContextView.isMuted) {
                                        fragmentContextView.muteDrawable.setCurrentFrame(0, true, false);
                                    } else {
                                        fragmentContextView.muteDrawable.setCurrentFrame(14, true, false);
                                    }
                                }
                                fragmentContextView.muteButton.playAnimation();
                                Theme.getFragmentContextViewWavesDrawable().updateState(true);
                                fragmentContextView.capsuleBlobDrawable.updateState(true);
                                break;
                            }
                            break;
                        default:
                            FragmentContextView.AnonymousClass7 anonymousClass8 = this.f$0;
                            if (anonymousClass8.scheduled && VoIPService.getSharedInstance() != null) {
                                anonymousClass8.scheduled = false;
                                anonymousClass8.pressed = true;
                                FragmentContextView fragmentContextView2 = FragmentContextView.this;
                                fragmentContextView2.isMuted = false;
                                AndroidUtilities.runOnUIThread(anonymousClass8.toggleMicRunnable, 90L);
                                try {
                                    fragmentContextView2.muteButton.performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                    return;
                                }
                                break;
                            }
                            break;
                    }
                }
            };
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setText(LocaleController.getString(FragmentContextView.this.isMuted ? R.string.VoipUnmute : R.string.VoipMute));
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            FragmentContextView fragmentContextView = FragmentContextView.this;
            int i = fragmentContextView.currentStyle;
            if (i != 3 && i != 1) {
                return super.onTouchEvent(motionEvent);
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            FragmentContextView$7$$ExternalSyntheticLambda0 fragmentContextView$7$$ExternalSyntheticLambda0 = this.toggleMicRunnable;
            FragmentContextView$7$$ExternalSyntheticLambda0 fragmentContextView$7$$ExternalSyntheticLambda1 = this.pressRunnable;
            if (sharedInstance == null) {
                AndroidUtilities.cancelRunOnUIThread(fragmentContextView$7$$ExternalSyntheticLambda1);
                AndroidUtilities.cancelRunOnUIThread(fragmentContextView$7$$ExternalSyntheticLambda0);
                this.scheduled = false;
                this.pressed = false;
                return true;
            }
            if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
                AndroidUtilities.runOnUIThread(fragmentContextView$7$$ExternalSyntheticLambda1, 300L);
                this.scheduled = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                AndroidUtilities.cancelRunOnUIThread(fragmentContextView$7$$ExternalSyntheticLambda0);
                if (this.scheduled) {
                    AndroidUtilities.cancelRunOnUIThread(fragmentContextView$7$$ExternalSyntheticLambda1);
                    this.scheduled = false;
                } else if (this.pressed) {
                    fragmentContextView.isMuted = true;
                    if (fragmentContextView.muteDrawable.setCustomEndFrame(15)) {
                        if (fragmentContextView.isMuted) {
                            fragmentContextView.muteDrawable.setCurrentFrame(0, true, false);
                        } else {
                            fragmentContextView.muteDrawable.setCurrentFrame(14, true, false);
                        }
                    }
                    fragmentContextView.muteButton.playAnimation();
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().setMicMute(true, true, false);
                        try {
                            fragmentContextView.muteButton.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    this.pressed = false;
                    Theme.getFragmentContextViewWavesDrawable().updateState(true);
                    fragmentContextView.capsuleBlobDrawable.updateState(true);
                    MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    return true;
                }
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public final class AnonymousClass9 extends HintView {
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

    public final class CallMessageItem implements Destroyable {
        public final GroupCallMessageCell cell;
        public final PhotoViewer.AnonymousClass19 parent;

        public CallMessageItem(PhotoViewer.AnonymousClass19 anonymousClass19, GroupCallMessage groupCallMessage) {
            GroupCallMessageCell groupCallMessageCell = new GroupCallMessageCell(anonymousClass19.getContext());
            this.cell = groupCallMessageCell;
            groupCallMessageCell.setBackgroundColor(ColorUtils.setAlphaComponent(-16777216, 34));
            SpoilersTextView spoilersTextView = groupCallMessageCell.messageTextView;
            spoilersTextView.setMaxLines(1);
            spoilersTextView.setSingleLine(true);
            spoilersTextView.setEllipsize(TextUtils.TruncateAt.END);
            groupCallMessageCell.set(groupCallMessage);
            groupCallMessageCell.setAlpha(0.0f);
            this.parent = anonymousClass19;
            anonymousClass19.addView(groupCallMessageCell);
        }

        @Override
        public final void performDestroy() {
            this.parent.removeView(this.cell);
        }
    }

    public interface FragmentContextViewDelegate {
    }

    public FragmentContextView(Context context, BaseFragment baseFragment, FrameLayout frameLayout, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.capsuleBlobDrawable = new CapsuleBlobDrawable();
        this.speedItems = new ActionBarMenuItem.Item[6];
        this.currentProgress = -1;
        this.currentStyle = -1;
        this.supportsCalls = true;
        this.notifyText = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
        this.updateScheduleTimeRunnable = new AnonymousClass1();
        this.account = UserConfig.selectedAccount;
        this.lastLocationSharingCount = -1;
        this.checkLocationRunnable = new BubbleActivity.AnonymousClass1(this, 20);
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.notificationsLocker2 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.progressPaint = new Paint(1);
        this.toggleGroupCallStartSubscriptionReqId = 0;
        this.callMessagesAnimator = new ReplaceAnimator(new FragmentContextView$$ExternalSyntheticLambda0(this), CubicBezierInterpolator.EASE_OUT_QUINT, 450L);
        this.groupCallMessageCounter = 0;
        this.resourcesProvider = resourcesProvider;
        this.fragment = baseFragment;
        if (baseFragment instanceof ChatActivityInterface) {
            this.chatActivity = (ChatActivityInterface) baseFragment;
        }
        this.visible = true;
        this.isLocation = z;
        if (frameLayout == null) {
            ((ViewGroup) baseFragment.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }

    public static boolean equals$1(float f, float f2) {
        return Math.abs(f - f2) < 0.05f;
    }

    private int getTitleTextColor() {
        int i = this.currentStyle;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (i == 4) {
            return Theme.getColor(Theme.key_inappPlayerPerformer, resourcesProvider);
        }
        return (i == 1 || i == 3) ? Theme.getColor(Theme.key_returnToCallText, resourcesProvider) : Theme.getColor(Theme.key_inappPlayerTitle, resourcesProvider);
    }

    public static boolean isPlayingVoice() {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        return playingMessageObject != null && playingMessageObject.isVoice();
    }

    public final void checkCall(boolean z) {
        boolean z2;
        ChatObject.Call groupCall;
        boolean z3;
        ChatObject.Call call;
        int i;
        int i2;
        boolean z4;
        AnimatorSet animatorSet;
        boolean z5;
        ChatObject.Call groupCall2;
        TLRPC.Chat currentChat;
        TLRPC.GroupCall groupCall3;
        int i3;
        String str;
        int i4;
        boolean z6;
        TLRPC.GroupCall groupCall4;
        boolean z7;
        boolean z8;
        int i5;
        int i6;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (this.visible && this.currentStyle == 5 && (sharedInstance == null || sharedInstance.isHangingUp())) {
            return;
        }
        BaseFragment baseFragment = this.fragment;
        View fragmentView = baseFragment.getFragmentView();
        boolean z9 = (z || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z : true;
        boolean zIsShowing = GroupCallPip.isShowing();
        ChatActivityInterface chatActivityInterface = this.chatActivity;
        if (!zIsShowing) {
            z2 = (GroupCallActivity.groupCallUiVisible || !this.supportsCalls || sharedInstance == null || sharedInstance.isHangingUp()) ? false : true;
            if (sharedInstance != null && (call = sharedInstance.groupCall) != null && (call.call instanceof TLRPC.TL_groupCallDiscarded)) {
                z2 = false;
            }
            if (!isPlayingVoice() && !GroupCallActivity.groupCallUiVisible && this.supportsCalls && !z2 && chatActivityInterface != null && (groupCall = chatActivityInterface.getGroupCall()) != null && groupCall.shouldShowPanel()) {
                z2 = true;
                z3 = true;
            }
            AnimationNotificationsLocker animationNotificationsLocker = this.notificationsLocker;
            if (!z2) {
                z8 = this.visible;
                if (!z8 && ((z9 && this.currentStyle == -1) || (i6 = this.currentStyle) == 4 || i6 == 3 || i6 == 1)) {
                    this.visible = false;
                    if (z9) {
                        if (getVisibility() != 8) {
                            setVisibility(8);
                        }
                        setTopPadding(0.0f);
                    } else {
                        AnimatorSet animatorSet2 = this.animatorSet;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                            this.animatorSet = null;
                        }
                        animationNotificationsLocker.lock();
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.animatorSet = animatorSet3;
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.animatorSet.setDuration(220L);
                        this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        this.animatorSet.addListener(new AnonymousClass10(this, 9));
                        this.animatorSet.start();
                    }
                } else if (z8 && ((i5 = this.currentStyle) == -1 || i5 == 4 || i5 == 3 || i5 == 1)) {
                    this.visible = false;
                    setVisibility(8);
                }
                if (z9 || chatActivityInterface == null || !chatActivityInterface.openedWithLivestream() || GroupCallPip.isShowing()) {
                    return;
                }
                FactCheckController$$ExternalSyntheticOutline0.m(R.string.InviteExpired, BulletinFactory.of(baseFragment), R.raw.linkbroken, 36);
                return;
            }
            checkCreateView();
            if (z3) {
                i = 4;
            } else if (sharedInstance.groupCall != null) {
                i = 3;
            } else {
                i = 1;
            }
            i2 = this.currentStyle;
            if (i == i2 && this.animatorSet != null && !z9) {
                this.checkCallAfterAnimation = true;
                return;
            }
            if (i == i2 && this.visible && !z9) {
                AnimatorSet animatorSet4 = this.animatorSet;
                if (animatorSet4 != null) {
                    animatorSet4.cancel();
                    this.animatorSet = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.animatorSet = animatorSet5;
                animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.animatorSet.setDuration(220L);
                this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animatorSet.addListener(new AnonymousClass10(this, 10));
                this.animatorSet.start();
                return;
            }
            if (z3) {
                if (i2 == 4 || !this.visible) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                updateStyle(4);
                groupCall2 = chatActivityInterface.getGroupCall();
                currentChat = chatActivityInterface.getCurrentChat();
                if (groupCall2.isScheduled()) {
                    if (this.gradientPaint == null) {
                        TextPaint textPaint = new TextPaint(1);
                        this.gradientTextPaint = textPaint;
                        textPaint.setColor(-1);
                        this.gradientTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        this.gradientTextPaint.setTypeface(AndroidUtilities.bold());
                        Paint paint = new Paint(1);
                        this.gradientPaint = paint;
                        paint.setColor(-1);
                        this.matrix = new Matrix();
                    }
                    this.notifyButtonEnabled = true;
                    LocaleController.getString(R.string.VoipChatNotify);
                    groupCall4 = groupCall2.call;
                    if (groupCall4 == null && groupCall4.schedule_start_subscribed) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    this.willBeNotified = z7;
                    this.joinButton.setVisibility(8);
                    if (!TextUtils.isEmpty(groupCall2.call.title)) {
                        setText(groupCall2.call.title, false);
                    } else if (ChatObject.isChannelOrGiga(currentChat)) {
                        setText(LocaleController.getString(R.string.VoipChannelScheduledVoiceChat), false);
                    } else {
                        setText(LocaleController.getString(R.string.VoipGroupScheduledVoiceChat), false);
                    }
                    setText(LocaleController.formatStartsTime(groupCall2.call.schedule_date, 4), false);
                    if (!this.scheduleRunnableScheduled) {
                        this.scheduleRunnableScheduled = true;
                        this.updateScheduleTimeRunnable.run();
                    }
                } else {
                    this.notifyButtonEnabled = false;
                    this.joinButton.setVisibility(0);
                    this.joinButton.setText(LocaleController.getString(R.string.VoipChatJoin));
                    if (!TextUtils.isEmpty(groupCall2.call.title)) {
                        setText(groupCall2.call.title, false);
                    } else if (groupCall2.call.rtmp_stream && !ChatObject.isChannelOrGiga(currentChat)) {
                        setText(LocaleController.getString(R.string.VoipGroupVoiceChat), false);
                    } else {
                        setText(LocaleController.getString(R.string.VoipChannelVoiceChat), false);
                    }
                    groupCall3 = groupCall2.call;
                    i3 = groupCall3.participants_count;
                    if (i3 == 0) {
                        AnonymousClass4 anonymousClass4 = this.subtitleTextView;
                        if (groupCall3.rtmp_stream) {
                            i4 = R.string.ViewersWatchingNobody;
                        } else {
                            i4 = R.string.MembersTalkingNobody;
                        }
                        anonymousClass4.setText(LocaleController.getString(i4), false);
                    } else {
                        AnonymousClass4 anonymousClass5 = this.subtitleTextView;
                        if (groupCall3.rtmp_stream) {
                            str = "ViewersWatching";
                        } else {
                            str = "Participants";
                        }
                        anonymousClass5.setText(LocaleController.formatPluralString(str, i3, new Object[0]), false);
                    }
                    this.frameLayout.invalidate();
                }
                if (this.avatars.avatarsDrawable.wasDraw || !z5) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                updateAvatars(z6);
            } else if (sharedInstance != null || sharedInstance.groupCall == null) {
                if (i2 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                updateAvatars(z4);
                updateStyle(1);
            } else {
                updateAvatars(i2 == 3);
                updateStyle(3);
            }
            if (this.visible) {
            }
            if (z9) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                startJoinFlickerAnimation();
            } else {
                animatorSet = this.animatorSet;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.animatorSet = null;
                }
                this.animatorSet = new AnimatorSet();
                this.notificationsLocker2.lock();
                this.animatorSet.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.animatorSet.setDuration(220L);
                this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animatorSet.addListener(new AnonymousClass10(this, 11));
                this.animatorSet.start();
            }
            this.visible = true;
            setVisibility(0);
        }
        z2 = false;
        z3 = false;
        AnimationNotificationsLocker animationNotificationsLocker2 = this.notificationsLocker;
        if (!z2) {
            z8 = this.visible;
            if (!z8) {
                if (z8) {
                    this.visible = false;
                    setVisibility(8);
                }
            } else if (z8) {
                this.visible = false;
                setVisibility(8);
            }
            if (z9) {
                return;
            } else {
                return;
            }
        }
        checkCreateView();
        if (z3) {
            i = 4;
        } else if (sharedInstance.groupCall != null) {
            i = 3;
        } else {
            i = 1;
        }
        i2 = this.currentStyle;
        if (i == i2) {
        }
        if (i == i2) {
        }
        if (z3) {
            if (i2 == 4) {
                z5 = false;
            } else {
                z5 = false;
            }
            updateStyle(4);
            groupCall2 = chatActivityInterface.getGroupCall();
            currentChat = chatActivityInterface.getCurrentChat();
            if (groupCall2.isScheduled()) {
                if (this.gradientPaint == null) {
                    TextPaint textPaint2 = new TextPaint(1);
                    this.gradientTextPaint = textPaint2;
                    textPaint2.setColor(-1);
                    this.gradientTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.gradientTextPaint.setTypeface(AndroidUtilities.bold());
                    Paint paint2 = new Paint(1);
                    this.gradientPaint = paint2;
                    paint2.setColor(-1);
                    this.matrix = new Matrix();
                }
                this.notifyButtonEnabled = true;
                LocaleController.getString(R.string.VoipChatNotify);
                groupCall4 = groupCall2.call;
                if (groupCall4 == null) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                this.willBeNotified = z7;
                this.joinButton.setVisibility(8);
                if (!TextUtils.isEmpty(groupCall2.call.title)) {
                    setText(groupCall2.call.title, false);
                } else if (ChatObject.isChannelOrGiga(currentChat)) {
                    setText(LocaleController.getString(R.string.VoipChannelScheduledVoiceChat), false);
                } else {
                    setText(LocaleController.getString(R.string.VoipGroupScheduledVoiceChat), false);
                }
                setText(LocaleController.formatStartsTime(groupCall2.call.schedule_date, 4), false);
                if (!this.scheduleRunnableScheduled) {
                    this.scheduleRunnableScheduled = true;
                    this.updateScheduleTimeRunnable.run();
                }
            } else {
                this.notifyButtonEnabled = false;
                this.joinButton.setVisibility(0);
                this.joinButton.setText(LocaleController.getString(R.string.VoipChatJoin));
                if (!TextUtils.isEmpty(groupCall2.call.title)) {
                    setText(groupCall2.call.title, false);
                } else if (groupCall2.call.rtmp_stream) {
                    setText(LocaleController.getString(R.string.VoipChannelVoiceChat), false);
                } else {
                    setText(LocaleController.getString(R.string.VoipGroupVoiceChat), false);
                }
                groupCall3 = groupCall2.call;
                i3 = groupCall3.participants_count;
                if (i3 == 0) {
                    AnonymousClass4 anonymousClass6 = this.subtitleTextView;
                    if (groupCall3.rtmp_stream) {
                        i4 = R.string.ViewersWatchingNobody;
                    } else {
                        i4 = R.string.MembersTalkingNobody;
                    }
                    anonymousClass6.setText(LocaleController.getString(i4), false);
                } else {
                    AnonymousClass4 anonymousClass7 = this.subtitleTextView;
                    if (groupCall3.rtmp_stream) {
                        str = "ViewersWatching";
                    } else {
                        str = "Participants";
                    }
                    anonymousClass7.setText(LocaleController.formatPluralString(str, i3, new Object[0]), false);
                }
                this.frameLayout.invalidate();
            }
            if (this.avatars.avatarsDrawable.wasDraw) {
                z6 = false;
            } else {
                z6 = false;
            }
            updateAvatars(z6);
        } else if (sharedInstance != null) {
            if (i2 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            updateAvatars(z4);
            updateStyle(1);
        } else {
            if (i2 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            updateAvatars(z4);
            updateStyle(1);
        }
        if (this.visible) {
            if (z9) {
                animatorSet = this.animatorSet;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.animatorSet = null;
                }
                this.animatorSet = new AnimatorSet();
                this.notificationsLocker2.lock();
                this.animatorSet.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.animatorSet.setDuration(220L);
                this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animatorSet.addListener(new AnonymousClass10(this, 11));
                this.animatorSet.start();
            } else {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                startJoinFlickerAnimation();
            }
            this.visible = true;
            setVisibility(0);
        }
    }

    public final void checkCreateView() {
        if (this.frameLayout != null) {
            return;
        }
        final Context context = getContext();
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(context);
        this.frameLayout = anonymousClass3;
        this.notifyButtonBounce = new ButtonBounce(anonymousClass3, 1.0f, 5.0f);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.notifyText;
        animatedTextDrawable.overrideFullWidth = AndroidUtilities.displaySize.x;
        animatedTextDrawable.scaleAmplitude = 0.4f;
        animatedTextDrawable.setCallback(anonymousClass3);
        TextPaint textPaint = animatedTextDrawable.textPaint;
        textPaint.setColor(-1);
        animatedTextDrawable.alpha = Color.alpha(-1);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        addView(this.frameLayout, LayoutHelper.createFrame(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.selector = view;
        this.frameLayout.addView(view, LayoutHelper.createFrame(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.playButton = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.playButton;
        int i = Theme.key_inappPlayerPlayPause;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int color = Theme.getColor(i, resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(color, mode));
        ImageView imageView3 = this.playButton;
        PlayPauseDrawable playPauseDrawable = new PlayPauseDrawable(16);
        this.playPauseDrawable = playPauseDrawable;
        imageView3.setImageDrawable(playPauseDrawable);
        this.playButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(i, resourcesProvider) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.playButton, LayoutHelper.createFrame(36, 36, 51));
        final int i2 = 0;
        this.playButton.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int currentAccount;
                long dialogId;
                int i3 = 15;
                boolean z = false;
                FragmentContextView fragmentContextView = this.f$0;
                switch (i2) {
                    case 0:
                        if (fragmentContextView.currentStyle == 0) {
                            if (!MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                            } else {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                            }
                        }
                        break;
                    case 1:
                        fragmentContextView.getClass();
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.isMuted = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.muteDrawable.setCustomEndFrame(fragmentContextView.isMuted ? 15 : 29)) {
                                if (fragmentContextView.isMuted) {
                                    fragmentContextView.muteDrawable.setCurrentFrame(0, true, false);
                                } else {
                                    fragmentContextView.muteDrawable.setCurrentFrame(14, true, false);
                                }
                            }
                            fragmentContextView.muteButton.playAnimation();
                            Theme.getFragmentContextViewWavesDrawable().updateState(true);
                            fragmentContextView.capsuleBlobDrawable.updateState(true);
                            try {
                                fragmentContextView.muteButton.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                                return;
                            }
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.currentStyle != 2) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        } else {
                            BaseFragment baseFragment = fragmentContextView.fragment;
                            Activity parentActivity = baseFragment.getParentActivity();
                            Theme.ResourcesProvider resourcesProvider2 = fragmentContextView.resourcesProvider;
                            AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, 0, resourcesProvider2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.title = string;
                            if (baseFragment instanceof DialogsActivity) {
                                alertDialog.message = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                ChatActivityInterface chatActivityInterface = fragmentContextView.chatActivity;
                                TLRPC.Chat currentChat = chatActivityInterface.getCurrentChat();
                                TLRPC.User currentUser = chatActivityInterface.getCurrentUser();
                                if (currentChat != null) {
                                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, currentChat.title));
                                } else if (currentUser != null) {
                                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(currentUser)));
                                } else {
                                    alertDialog.message = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            builder.setPositiveButton(LocaleController.getString(R.string.Stop), new FragmentContextView$$ExternalSyntheticLambda0(fragmentContextView));
                            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                            builder.show();
                            TextView textView = (TextView) alertDialog.getButton(-1);
                            if (textView != null) {
                                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider2));
                            }
                        }
                        break;
                    case 3:
                        int i4 = fragmentContextView.currentStyle;
                        if (i4 != 6) {
                            ChatActivityInterface chatActivityInterface2 = fragmentContextView.chatActivity;
                            Theme.ResourcesProvider resourcesProvider3 = fragmentContextView.resourcesProvider;
                            BaseFragment baseFragment2 = fragmentContextView.fragment;
                            if (i4 == 0) {
                                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                                if (baseFragment2 != null && playingMessageObject != null) {
                                    if (playingMessageObject.isMusic()) {
                                        Activity activityFindActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                        if (activityFindActivity instanceof LaunchActivity) {
                                            new AudioPlayerAlert(activityFindActivity, resourcesProvider3).show();
                                        } else if (AndroidUtilities.isContextSafe(LaunchActivity.instance)) {
                                            new AudioPlayerAlert(LaunchActivity.instance, resourcesProvider3).show();
                                        }
                                    } else if (playingMessageObject.getDialogId() != (chatActivityInterface2 != null ? chatActivityInterface2.getDialogId() : 0L)) {
                                        long dialogId2 = playingMessageObject.getDialogId();
                                        Bundle bundle = new Bundle();
                                        if (DialogObject.isEncryptedDialog(dialogId2)) {
                                            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId2));
                                        } else if (DialogObject.isUserDialog(dialogId2)) {
                                            bundle.putLong("user_id", dialogId2);
                                        } else {
                                            bundle.putLong("chat_id", -dialogId2);
                                        }
                                        bundle.putInt("message_id", playingMessageObject.getId());
                                        baseFragment2.presentFragment(new ChatActivity(bundle), baseFragment2 instanceof ChatActivity);
                                    } else {
                                        fragmentContextView.chatActivity.scrollToMessageId(playingMessageObject.getId(), 0, false, 0, true, 0);
                                    }
                                    break;
                                }
                            } else if (i4 == 1) {
                                fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                                break;
                            } else if (i4 == 2) {
                                int i5 = UserConfig.selectedAccount;
                                if (chatActivityInterface2 != null) {
                                    dialogId = chatActivityInterface2.getDialogId();
                                    currentAccount = baseFragment2.getCurrentAccount();
                                } else if (LocationController.getLocationsCount() == 1) {
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= 4) {
                                            currentAccount = i5;
                                            dialogId = 0;
                                        } else if (LocationController.getInstance(i6).sharingLocationsUI.isEmpty()) {
                                            i6++;
                                        } else {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i6).sharingLocationsUI.get(0);
                                            long j = sharingLocationInfo.did;
                                            currentAccount = sharingLocationInfo.messageObject.currentAccount;
                                            dialogId = j;
                                        }
                                    }
                                } else {
                                    currentAccount = i5;
                                    dialogId = 0;
                                }
                                if (dialogId == 0) {
                                    baseFragment2.showDialog(new SharingLocationsAlert(fragmentContextView.getContext(), new FragmentContextView$$ExternalSyntheticLambda0(fragmentContextView), resourcesProvider3));
                                } else {
                                    fragmentContextView.openSharingLocation(LocationController.getInstance(currentAccount).getSharingLocationInfo(dialogId));
                                }
                                break;
                            } else if (i4 != 3) {
                                if (i4 == 4) {
                                    if (baseFragment2.getParentActivity() != null && (groupCall = chatActivityInterface2.getGroupCall()) != null) {
                                        TLRPC.Chat chat2 = baseFragment2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                        TLRPC.GroupCall groupCall2 = groupCall.call;
                                        if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                            z = true;
                                        }
                                        VoIPHelper.startCall(chat2, null, false, Boolean.valueOf(z), baseFragment2.getParentActivity(), baseFragment2, baseFragment2.getAccountInstance());
                                    }
                                    break;
                                } else if (i4 == 5) {
                                    SendMessagesHelper sendMessagesHelper = baseFragment2.getSendMessagesHelper();
                                    ChatActivity chatActivity = (ChatActivity) baseFragment2;
                                    if (sendMessagesHelper.getImportingHistory(chatActivity.getDialogId()) != null) {
                                        ImportingAlert importingAlert = new ImportingAlert(fragmentContextView.getContext(), null, chatActivity, resourcesProvider3);
                                        importingAlert.setOnHideListener(new OAuthSheet$$ExternalSyntheticLambda11(fragmentContextView, i3));
                                        baseFragment2.showDialog(importingAlert);
                                        fragmentContextView.checkImport(false);
                                        break;
                                    }
                                }
                            } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                GroupCallActivity.create((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                break;
                            }
                        } else {
                            LivePlayer livePlayer = LivePlayer.recording;
                            if (livePlayer != null) {
                                int i7 = UserConfig.selectedAccount;
                                int i8 = livePlayer.currentAccount;
                                if (i8 != i7) {
                                    LaunchActivity launchActivity = LaunchActivity.instance;
                                    if (launchActivity != null) {
                                        launchActivity.switchToAccount(i8);
                                    }
                                }
                                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                if (safeLastFragment != null) {
                                    StoriesController storiesController = MessagesController.getInstance(i8).getStoriesController();
                                    int i9 = livePlayer.storyId;
                                    long j2 = livePlayer.dialogId;
                                    TL_stories.StoryItem storyItemFindStory = storiesController.findStory(i9, j2);
                                    if (storyItemFindStory != null) {
                                        storyItemFindStory.dialogId = j2;
                                        safeLastFragment.getOrCreateStoryViewer(i8).open(i8, fragmentContextView.getContext(), storyItemFindStory, (StoriesListPlaceProvider) null);
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        fragmentContextView.callOnClick();
                        break;
                }
            }
        });
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.importingImageView = rLottieImageView;
        rLottieImageView.setScaleType(scaleType);
        this.importingImageView.setAutoRepeat(true);
        this.importingImageView.setAnimation(R.raw.import_progress, 30, 30, null);
        this.importingImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(22.0f), Theme.getColor(i, resourcesProvider)));
        addView(this.importingImageView, LayoutHelper.createFrame(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        final int i3 = 0;
        ?? r2 = new AudioPlayerAlert.ClippingTextViewSwitcher(this, context) {
            public final FragmentContextView this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final TextView createTextView() {
                switch (i3) {
                    case 0:
                        TextView textView = new TextView(context);
                        textView.setMaxLines(1);
                        textView.setLines(1);
                        textView.setSingleLine(true);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setTextSize(1, 15.0f);
                        textView.setGravity(19);
                        FragmentContextView fragmentContextView = this.this$0;
                        int i4 = fragmentContextView.currentStyle;
                        if (i4 == 0 || i4 == 2) {
                            textView.setGravity(19);
                            textView.setTypeface(Typeface.DEFAULT);
                            textView.setTextSize(1, 15.0f);
                        } else if (i4 == 4) {
                            textView.setGravity(51);
                            textView.setTextColor(Theme.getColor(Theme.key_inappPlayerPerformer, fragmentContextView.resourcesProvider));
                            textView.setTypeface(AndroidUtilities.bold());
                            textView.setTextSize(1, 15.0f);
                        } else if (i4 == 1 || i4 == 3) {
                            textView.setGravity(19);
                            textView.setTextColor(Theme.getColor(Theme.key_returnToCallText, fragmentContextView.resourcesProvider));
                            textView.setTypeface(AndroidUtilities.bold());
                            textView.setTextSize(1, 14.0f);
                        }
                        return textView;
                    default:
                        TextView textView2 = new TextView(context);
                        textView2.setMaxLines(1);
                        textView2.setLines(1);
                        textView2.setSingleLine(true);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(3);
                        textView2.setTextSize(1, 13.0f);
                        textView2.setTextColor(Theme.getColor(Theme.key_inappPlayerClose, this.this$0.resourcesProvider));
                        return textView2;
                }
            }
        };
        this.titleTextView = r2;
        float f = 36;
        addView((View) r2, LayoutHelper.createFrame(-1, 36.0f, 51, 35.0f, 0.0f, f, 0.0f));
        final int i4 = 1;
        ?? r3 = new AudioPlayerAlert.ClippingTextViewSwitcher(this, context) {
            public final FragmentContextView this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final TextView createTextView() {
                switch (i4) {
                    case 0:
                        TextView textView = new TextView(context);
                        textView.setMaxLines(1);
                        textView.setLines(1);
                        textView.setSingleLine(true);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setTextSize(1, 15.0f);
                        textView.setGravity(19);
                        FragmentContextView fragmentContextView = this.this$0;
                        int i5 = fragmentContextView.currentStyle;
                        if (i5 == 0 || i5 == 2) {
                            textView.setGravity(19);
                            textView.setTypeface(Typeface.DEFAULT);
                            textView.setTextSize(1, 15.0f);
                        } else if (i5 == 4) {
                            textView.setGravity(51);
                            textView.setTextColor(Theme.getColor(Theme.key_inappPlayerPerformer, fragmentContextView.resourcesProvider));
                            textView.setTypeface(AndroidUtilities.bold());
                            textView.setTextSize(1, 15.0f);
                        } else if (i5 == 1 || i5 == 3) {
                            textView.setGravity(19);
                            textView.setTextColor(Theme.getColor(Theme.key_returnToCallText, fragmentContextView.resourcesProvider));
                            textView.setTypeface(AndroidUtilities.bold());
                            textView.setTextSize(1, 14.0f);
                        }
                        return textView;
                    default:
                        TextView textView2 = new TextView(context);
                        textView2.setMaxLines(1);
                        textView2.setLines(1);
                        textView2.setSingleLine(true);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(3);
                        textView2.setTextSize(1, 13.0f);
                        textView2.setTextColor(Theme.getColor(Theme.key_inappPlayerClose, this.this$0.resourcesProvider));
                        return textView2;
                }
            }
        };
        this.subtitleTextView = r3;
        addView((View) r3, LayoutHelper.createFrame(-1, 36.0f, 51, 35.0f, 10.0f, f, 0.0f));
        CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable(64, 204, 160);
        this.joinButtonFlicker = cellFlickerDrawable;
        cellFlickerDrawable.progress = 1.0f;
        cellFlickerDrawable.repeatEnabled = false;
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(context);
        this.joinButton = anonymousClass6;
        anonymousClass6.setText(LocaleController.getString(R.string.VoipChatJoin));
        this.joinButton.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
        AnonymousClass6 anonymousClass7 = this.joinButton;
        int iDp = AndroidUtilities.dp(16.0f);
        int color2 = Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider);
        int color3 = Theme.getColor(Theme.key_featuredStickers_addButtonPressed, resourcesProvider);
        anonymousClass7.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color2, color3, color3));
        this.joinButton.setTextSize(1, 14.0f);
        this.joinButton.setTypeface(AndroidUtilities.bold());
        this.joinButton.setGravity(17);
        this.joinButton.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.joinButton, LayoutHelper.createFrame(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        final int i5 = 4;
        this.joinButton.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int currentAccount;
                long dialogId;
                int i6 = 15;
                boolean z = false;
                FragmentContextView fragmentContextView = this.f$0;
                switch (i5) {
                    case 0:
                        if (fragmentContextView.currentStyle == 0) {
                            if (!MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                            } else {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                            }
                        }
                        break;
                    case 1:
                        fragmentContextView.getClass();
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.isMuted = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.muteDrawable.setCustomEndFrame(fragmentContextView.isMuted ? 15 : 29)) {
                                if (fragmentContextView.isMuted) {
                                    fragmentContextView.muteDrawable.setCurrentFrame(0, true, false);
                                } else {
                                    fragmentContextView.muteDrawable.setCurrentFrame(14, true, false);
                                }
                            }
                            fragmentContextView.muteButton.playAnimation();
                            Theme.getFragmentContextViewWavesDrawable().updateState(true);
                            fragmentContextView.capsuleBlobDrawable.updateState(true);
                            try {
                                fragmentContextView.muteButton.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                                return;
                            }
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.currentStyle != 2) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        } else {
                            BaseFragment baseFragment = fragmentContextView.fragment;
                            Activity parentActivity = baseFragment.getParentActivity();
                            Theme.ResourcesProvider resourcesProvider2 = fragmentContextView.resourcesProvider;
                            AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, 0, resourcesProvider2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.title = string;
                            if (baseFragment instanceof DialogsActivity) {
                                alertDialog.message = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                ChatActivityInterface chatActivityInterface = fragmentContextView.chatActivity;
                                TLRPC.Chat currentChat = chatActivityInterface.getCurrentChat();
                                TLRPC.User currentUser = chatActivityInterface.getCurrentUser();
                                if (currentChat != null) {
                                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, currentChat.title));
                                } else if (currentUser != null) {
                                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(currentUser)));
                                } else {
                                    alertDialog.message = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            builder.setPositiveButton(LocaleController.getString(R.string.Stop), new FragmentContextView$$ExternalSyntheticLambda0(fragmentContextView));
                            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                            builder.show();
                            TextView textView = (TextView) alertDialog.getButton(-1);
                            if (textView != null) {
                                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider2));
                            }
                        }
                        break;
                    case 3:
                        int i7 = fragmentContextView.currentStyle;
                        if (i7 != 6) {
                            ChatActivityInterface chatActivityInterface2 = fragmentContextView.chatActivity;
                            Theme.ResourcesProvider resourcesProvider3 = fragmentContextView.resourcesProvider;
                            BaseFragment baseFragment2 = fragmentContextView.fragment;
                            if (i7 == 0) {
                                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                                if (baseFragment2 != null && playingMessageObject != null) {
                                    if (playingMessageObject.isMusic()) {
                                        Activity activityFindActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                        if (activityFindActivity instanceof LaunchActivity) {
                                            new AudioPlayerAlert(activityFindActivity, resourcesProvider3).show();
                                        } else if (AndroidUtilities.isContextSafe(LaunchActivity.instance)) {
                                            new AudioPlayerAlert(LaunchActivity.instance, resourcesProvider3).show();
                                        }
                                    } else if (playingMessageObject.getDialogId() != (chatActivityInterface2 != null ? chatActivityInterface2.getDialogId() : 0L)) {
                                        long dialogId2 = playingMessageObject.getDialogId();
                                        Bundle bundle = new Bundle();
                                        if (DialogObject.isEncryptedDialog(dialogId2)) {
                                            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId2));
                                        } else if (DialogObject.isUserDialog(dialogId2)) {
                                            bundle.putLong("user_id", dialogId2);
                                        } else {
                                            bundle.putLong("chat_id", -dialogId2);
                                        }
                                        bundle.putInt("message_id", playingMessageObject.getId());
                                        baseFragment2.presentFragment(new ChatActivity(bundle), baseFragment2 instanceof ChatActivity);
                                    } else {
                                        fragmentContextView.chatActivity.scrollToMessageId(playingMessageObject.getId(), 0, false, 0, true, 0);
                                    }
                                    break;
                                }
                            } else if (i7 == 1) {
                                fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                                break;
                            } else if (i7 == 2) {
                                int i8 = UserConfig.selectedAccount;
                                if (chatActivityInterface2 != null) {
                                    dialogId = chatActivityInterface2.getDialogId();
                                    currentAccount = baseFragment2.getCurrentAccount();
                                } else if (LocationController.getLocationsCount() == 1) {
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= 4) {
                                            currentAccount = i8;
                                            dialogId = 0;
                                        } else if (LocationController.getInstance(i9).sharingLocationsUI.isEmpty()) {
                                            i9++;
                                        } else {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i9).sharingLocationsUI.get(0);
                                            long j = sharingLocationInfo.did;
                                            currentAccount = sharingLocationInfo.messageObject.currentAccount;
                                            dialogId = j;
                                        }
                                    }
                                } else {
                                    currentAccount = i8;
                                    dialogId = 0;
                                }
                                if (dialogId == 0) {
                                    baseFragment2.showDialog(new SharingLocationsAlert(fragmentContextView.getContext(), new FragmentContextView$$ExternalSyntheticLambda0(fragmentContextView), resourcesProvider3));
                                } else {
                                    fragmentContextView.openSharingLocation(LocationController.getInstance(currentAccount).getSharingLocationInfo(dialogId));
                                }
                                break;
                            } else if (i7 != 3) {
                                if (i7 == 4) {
                                    if (baseFragment2.getParentActivity() != null && (groupCall = chatActivityInterface2.getGroupCall()) != null) {
                                        TLRPC.Chat chat2 = baseFragment2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                        TLRPC.GroupCall groupCall2 = groupCall.call;
                                        if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                            z = true;
                                        }
                                        VoIPHelper.startCall(chat2, null, false, Boolean.valueOf(z), baseFragment2.getParentActivity(), baseFragment2, baseFragment2.getAccountInstance());
                                    }
                                    break;
                                } else if (i7 == 5) {
                                    SendMessagesHelper sendMessagesHelper = baseFragment2.getSendMessagesHelper();
                                    ChatActivity chatActivity = (ChatActivity) baseFragment2;
                                    if (sendMessagesHelper.getImportingHistory(chatActivity.getDialogId()) != null) {
                                        ImportingAlert importingAlert = new ImportingAlert(fragmentContextView.getContext(), null, chatActivity, resourcesProvider3);
                                        importingAlert.setOnHideListener(new OAuthSheet$$ExternalSyntheticLambda11(fragmentContextView, i6));
                                        baseFragment2.showDialog(importingAlert);
                                        fragmentContextView.checkImport(false);
                                        break;
                                    }
                                }
                            } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                GroupCallActivity.create((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                break;
                            }
                        } else {
                            LivePlayer livePlayer = LivePlayer.recording;
                            if (livePlayer != null) {
                                int i10 = UserConfig.selectedAccount;
                                int i11 = livePlayer.currentAccount;
                                if (i11 != i10) {
                                    LaunchActivity launchActivity = LaunchActivity.instance;
                                    if (launchActivity != null) {
                                        launchActivity.switchToAccount(i11);
                                    }
                                }
                                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                if (safeLastFragment != null) {
                                    StoriesController storiesController = MessagesController.getInstance(i11).getStoriesController();
                                    int i12 = livePlayer.storyId;
                                    long j2 = livePlayer.dialogId;
                                    TL_stories.StoryItem storyItemFindStory = storiesController.findStory(i12, j2);
                                    if (storyItemFindStory != null) {
                                        storyItemFindStory.dialogId = j2;
                                        safeLastFragment.getOrCreateStoryViewer(i11).open(i11, fragmentContextView.getContext(), storyItemFindStory, (StoriesListPlaceProvider) null);
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        fragmentContextView.callOnClick();
                        break;
                }
            }
        });
        if (this.flickOnAttach) {
            startJoinFlickerAnimation();
        }
        this.silentButton = new FrameLayout(context);
        ImageView imageView4 = new ImageView(context);
        this.silentButtonImage = imageView4;
        imageView4.setImageResource(R.drawable.msg_mute);
        ImageView imageView5 = this.silentButtonImage;
        int i6 = Theme.key_inappPlayerClose;
        imageView5.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i6, resourcesProvider), mode));
        this.silentButton.addView(this.silentButtonImage, LayoutHelper.createFrame(20, 20, 17));
        this.silentButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(i6, resourcesProvider) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.silentButton.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.silentButton.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda267(5));
        this.silentButton.setVisibility(8);
        addView(this.silentButton, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.isLocation) {
            createPlaybackSpeedButton();
        }
        AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
        this.avatars = avatarsImageView;
        avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.avatars.setDelegate(new FragmentContextView$$ExternalSyntheticLambda5(this, 1));
        this.avatars.setVisibility(8);
        addView(this.avatars, LayoutHelper.createFrame(108, 36, 51));
        int i7 = R.raw.voice_muted;
        this.muteDrawable = new RLottieDrawable(i7, SurfaceContainer$$ExternalSyntheticOutline0.m(i7, ""), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        AnonymousClass7 anonymousClass8 = new AnonymousClass7(context);
        this.muteButton = anonymousClass8;
        anonymousClass8.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_returnToCallText, resourcesProvider), PorterDuff.Mode.SRC_IN));
        this.muteButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(i6, resourcesProvider) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.muteButton.setAnimation(this.muteDrawable);
        this.muteButton.setScaleType(scaleType);
        this.muteButton.setVisibility(8);
        addView(this.muteButton, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        final int i8 = 1;
        this.muteButton.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int currentAccount;
                long dialogId;
                int i9 = 15;
                boolean z = false;
                FragmentContextView fragmentContextView = this.f$0;
                switch (i8) {
                    case 0:
                        if (fragmentContextView.currentStyle == 0) {
                            if (!MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                            } else {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                            }
                        }
                        break;
                    case 1:
                        fragmentContextView.getClass();
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.isMuted = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.muteDrawable.setCustomEndFrame(fragmentContextView.isMuted ? 15 : 29)) {
                                if (fragmentContextView.isMuted) {
                                    fragmentContextView.muteDrawable.setCurrentFrame(0, true, false);
                                } else {
                                    fragmentContextView.muteDrawable.setCurrentFrame(14, true, false);
                                }
                            }
                            fragmentContextView.muteButton.playAnimation();
                            Theme.getFragmentContextViewWavesDrawable().updateState(true);
                            fragmentContextView.capsuleBlobDrawable.updateState(true);
                            try {
                                fragmentContextView.muteButton.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                                return;
                            }
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.currentStyle != 2) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        } else {
                            BaseFragment baseFragment = fragmentContextView.fragment;
                            Activity parentActivity = baseFragment.getParentActivity();
                            Theme.ResourcesProvider resourcesProvider2 = fragmentContextView.resourcesProvider;
                            AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, 0, resourcesProvider2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.title = string;
                            if (baseFragment instanceof DialogsActivity) {
                                alertDialog.message = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                ChatActivityInterface chatActivityInterface = fragmentContextView.chatActivity;
                                TLRPC.Chat currentChat = chatActivityInterface.getCurrentChat();
                                TLRPC.User currentUser = chatActivityInterface.getCurrentUser();
                                if (currentChat != null) {
                                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, currentChat.title));
                                } else if (currentUser != null) {
                                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(currentUser)));
                                } else {
                                    alertDialog.message = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            builder.setPositiveButton(LocaleController.getString(R.string.Stop), new FragmentContextView$$ExternalSyntheticLambda0(fragmentContextView));
                            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                            builder.show();
                            TextView textView = (TextView) alertDialog.getButton(-1);
                            if (textView != null) {
                                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider2));
                            }
                        }
                        break;
                    case 3:
                        int i10 = fragmentContextView.currentStyle;
                        if (i10 != 6) {
                            ChatActivityInterface chatActivityInterface2 = fragmentContextView.chatActivity;
                            Theme.ResourcesProvider resourcesProvider3 = fragmentContextView.resourcesProvider;
                            BaseFragment baseFragment2 = fragmentContextView.fragment;
                            if (i10 == 0) {
                                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                                if (baseFragment2 != null && playingMessageObject != null) {
                                    if (playingMessageObject.isMusic()) {
                                        Activity activityFindActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                        if (activityFindActivity instanceof LaunchActivity) {
                                            new AudioPlayerAlert(activityFindActivity, resourcesProvider3).show();
                                        } else if (AndroidUtilities.isContextSafe(LaunchActivity.instance)) {
                                            new AudioPlayerAlert(LaunchActivity.instance, resourcesProvider3).show();
                                        }
                                    } else if (playingMessageObject.getDialogId() != (chatActivityInterface2 != null ? chatActivityInterface2.getDialogId() : 0L)) {
                                        long dialogId2 = playingMessageObject.getDialogId();
                                        Bundle bundle = new Bundle();
                                        if (DialogObject.isEncryptedDialog(dialogId2)) {
                                            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId2));
                                        } else if (DialogObject.isUserDialog(dialogId2)) {
                                            bundle.putLong("user_id", dialogId2);
                                        } else {
                                            bundle.putLong("chat_id", -dialogId2);
                                        }
                                        bundle.putInt("message_id", playingMessageObject.getId());
                                        baseFragment2.presentFragment(new ChatActivity(bundle), baseFragment2 instanceof ChatActivity);
                                    } else {
                                        fragmentContextView.chatActivity.scrollToMessageId(playingMessageObject.getId(), 0, false, 0, true, 0);
                                    }
                                    break;
                                }
                            } else if (i10 == 1) {
                                fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                                break;
                            } else if (i10 == 2) {
                                int i11 = UserConfig.selectedAccount;
                                if (chatActivityInterface2 != null) {
                                    dialogId = chatActivityInterface2.getDialogId();
                                    currentAccount = baseFragment2.getCurrentAccount();
                                } else if (LocationController.getLocationsCount() == 1) {
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 >= 4) {
                                            currentAccount = i11;
                                            dialogId = 0;
                                        } else if (LocationController.getInstance(i12).sharingLocationsUI.isEmpty()) {
                                            i12++;
                                        } else {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i12).sharingLocationsUI.get(0);
                                            long j = sharingLocationInfo.did;
                                            currentAccount = sharingLocationInfo.messageObject.currentAccount;
                                            dialogId = j;
                                        }
                                    }
                                } else {
                                    currentAccount = i11;
                                    dialogId = 0;
                                }
                                if (dialogId == 0) {
                                    baseFragment2.showDialog(new SharingLocationsAlert(fragmentContextView.getContext(), new FragmentContextView$$ExternalSyntheticLambda0(fragmentContextView), resourcesProvider3));
                                } else {
                                    fragmentContextView.openSharingLocation(LocationController.getInstance(currentAccount).getSharingLocationInfo(dialogId));
                                }
                                break;
                            } else if (i10 != 3) {
                                if (i10 == 4) {
                                    if (baseFragment2.getParentActivity() != null && (groupCall = chatActivityInterface2.getGroupCall()) != null) {
                                        TLRPC.Chat chat2 = baseFragment2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                        TLRPC.GroupCall groupCall2 = groupCall.call;
                                        if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                            z = true;
                                        }
                                        VoIPHelper.startCall(chat2, null, false, Boolean.valueOf(z), baseFragment2.getParentActivity(), baseFragment2, baseFragment2.getAccountInstance());
                                    }
                                    break;
                                } else if (i10 == 5) {
                                    SendMessagesHelper sendMessagesHelper = baseFragment2.getSendMessagesHelper();
                                    ChatActivity chatActivity = (ChatActivity) baseFragment2;
                                    if (sendMessagesHelper.getImportingHistory(chatActivity.getDialogId()) != null) {
                                        ImportingAlert importingAlert = new ImportingAlert(fragmentContextView.getContext(), null, chatActivity, resourcesProvider3);
                                        importingAlert.setOnHideListener(new OAuthSheet$$ExternalSyntheticLambda11(fragmentContextView, i9));
                                        baseFragment2.showDialog(importingAlert);
                                        fragmentContextView.checkImport(false);
                                        break;
                                    }
                                }
                            } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                GroupCallActivity.create((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                break;
                            }
                        } else {
                            LivePlayer livePlayer = LivePlayer.recording;
                            if (livePlayer != null) {
                                int i13 = UserConfig.selectedAccount;
                                int i14 = livePlayer.currentAccount;
                                if (i14 != i13) {
                                    LaunchActivity launchActivity = LaunchActivity.instance;
                                    if (launchActivity != null) {
                                        launchActivity.switchToAccount(i14);
                                    }
                                }
                                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                if (safeLastFragment != null) {
                                    StoriesController storiesController = MessagesController.getInstance(i14).getStoriesController();
                                    int i15 = livePlayer.storyId;
                                    long j2 = livePlayer.dialogId;
                                    TL_stories.StoryItem storyItemFindStory = storiesController.findStory(i15, j2);
                                    if (storyItemFindStory != null) {
                                        storyItemFindStory.dialogId = j2;
                                        safeLastFragment.getOrCreateStoryViewer(i14).open(i14, fragmentContextView.getContext(), storyItemFindStory, (StoriesListPlaceProvider) null);
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        fragmentContextView.callOnClick();
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.closeButton = imageView6;
        imageView6.setImageResource(R.drawable.miniplayer_close);
        this.closeButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i6, resourcesProvider), mode));
        this.closeButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(i6, resourcesProvider) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.closeButton.setScaleType(scaleType);
        addView(this.closeButton, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i9 = 2;
        this.closeButton.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int currentAccount;
                long dialogId;
                int i10 = 15;
                boolean z = false;
                FragmentContextView fragmentContextView = this.f$0;
                switch (i9) {
                    case 0:
                        if (fragmentContextView.currentStyle == 0) {
                            if (!MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                            } else {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                            }
                        }
                        break;
                    case 1:
                        fragmentContextView.getClass();
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.isMuted = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.muteDrawable.setCustomEndFrame(fragmentContextView.isMuted ? 15 : 29)) {
                                if (fragmentContextView.isMuted) {
                                    fragmentContextView.muteDrawable.setCurrentFrame(0, true, false);
                                } else {
                                    fragmentContextView.muteDrawable.setCurrentFrame(14, true, false);
                                }
                            }
                            fragmentContextView.muteButton.playAnimation();
                            Theme.getFragmentContextViewWavesDrawable().updateState(true);
                            fragmentContextView.capsuleBlobDrawable.updateState(true);
                            try {
                                fragmentContextView.muteButton.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                                return;
                            }
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.currentStyle != 2) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        } else {
                            BaseFragment baseFragment = fragmentContextView.fragment;
                            Activity parentActivity = baseFragment.getParentActivity();
                            Theme.ResourcesProvider resourcesProvider2 = fragmentContextView.resourcesProvider;
                            AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, 0, resourcesProvider2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.title = string;
                            if (baseFragment instanceof DialogsActivity) {
                                alertDialog.message = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                ChatActivityInterface chatActivityInterface = fragmentContextView.chatActivity;
                                TLRPC.Chat currentChat = chatActivityInterface.getCurrentChat();
                                TLRPC.User currentUser = chatActivityInterface.getCurrentUser();
                                if (currentChat != null) {
                                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, currentChat.title));
                                } else if (currentUser != null) {
                                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(currentUser)));
                                } else {
                                    alertDialog.message = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            builder.setPositiveButton(LocaleController.getString(R.string.Stop), new FragmentContextView$$ExternalSyntheticLambda0(fragmentContextView));
                            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                            builder.show();
                            TextView textView = (TextView) alertDialog.getButton(-1);
                            if (textView != null) {
                                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider2));
                            }
                        }
                        break;
                    case 3:
                        int i11 = fragmentContextView.currentStyle;
                        if (i11 != 6) {
                            ChatActivityInterface chatActivityInterface2 = fragmentContextView.chatActivity;
                            Theme.ResourcesProvider resourcesProvider3 = fragmentContextView.resourcesProvider;
                            BaseFragment baseFragment2 = fragmentContextView.fragment;
                            if (i11 == 0) {
                                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                                if (baseFragment2 != null && playingMessageObject != null) {
                                    if (playingMessageObject.isMusic()) {
                                        Activity activityFindActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                        if (activityFindActivity instanceof LaunchActivity) {
                                            new AudioPlayerAlert(activityFindActivity, resourcesProvider3).show();
                                        } else if (AndroidUtilities.isContextSafe(LaunchActivity.instance)) {
                                            new AudioPlayerAlert(LaunchActivity.instance, resourcesProvider3).show();
                                        }
                                    } else if (playingMessageObject.getDialogId() != (chatActivityInterface2 != null ? chatActivityInterface2.getDialogId() : 0L)) {
                                        long dialogId2 = playingMessageObject.getDialogId();
                                        Bundle bundle = new Bundle();
                                        if (DialogObject.isEncryptedDialog(dialogId2)) {
                                            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId2));
                                        } else if (DialogObject.isUserDialog(dialogId2)) {
                                            bundle.putLong("user_id", dialogId2);
                                        } else {
                                            bundle.putLong("chat_id", -dialogId2);
                                        }
                                        bundle.putInt("message_id", playingMessageObject.getId());
                                        baseFragment2.presentFragment(new ChatActivity(bundle), baseFragment2 instanceof ChatActivity);
                                    } else {
                                        fragmentContextView.chatActivity.scrollToMessageId(playingMessageObject.getId(), 0, false, 0, true, 0);
                                    }
                                    break;
                                }
                            } else if (i11 == 1) {
                                fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                                break;
                            } else if (i11 == 2) {
                                int i12 = UserConfig.selectedAccount;
                                if (chatActivityInterface2 != null) {
                                    dialogId = chatActivityInterface2.getDialogId();
                                    currentAccount = baseFragment2.getCurrentAccount();
                                } else if (LocationController.getLocationsCount() == 1) {
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= 4) {
                                            currentAccount = i12;
                                            dialogId = 0;
                                        } else if (LocationController.getInstance(i13).sharingLocationsUI.isEmpty()) {
                                            i13++;
                                        } else {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i13).sharingLocationsUI.get(0);
                                            long j = sharingLocationInfo.did;
                                            currentAccount = sharingLocationInfo.messageObject.currentAccount;
                                            dialogId = j;
                                        }
                                    }
                                } else {
                                    currentAccount = i12;
                                    dialogId = 0;
                                }
                                if (dialogId == 0) {
                                    baseFragment2.showDialog(new SharingLocationsAlert(fragmentContextView.getContext(), new FragmentContextView$$ExternalSyntheticLambda0(fragmentContextView), resourcesProvider3));
                                } else {
                                    fragmentContextView.openSharingLocation(LocationController.getInstance(currentAccount).getSharingLocationInfo(dialogId));
                                }
                                break;
                            } else if (i11 != 3) {
                                if (i11 == 4) {
                                    if (baseFragment2.getParentActivity() != null && (groupCall = chatActivityInterface2.getGroupCall()) != null) {
                                        TLRPC.Chat chat2 = baseFragment2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                        TLRPC.GroupCall groupCall2 = groupCall.call;
                                        if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                            z = true;
                                        }
                                        VoIPHelper.startCall(chat2, null, false, Boolean.valueOf(z), baseFragment2.getParentActivity(), baseFragment2, baseFragment2.getAccountInstance());
                                    }
                                    break;
                                } else if (i11 == 5) {
                                    SendMessagesHelper sendMessagesHelper = baseFragment2.getSendMessagesHelper();
                                    ChatActivity chatActivity = (ChatActivity) baseFragment2;
                                    if (sendMessagesHelper.getImportingHistory(chatActivity.getDialogId()) != null) {
                                        ImportingAlert importingAlert = new ImportingAlert(fragmentContextView.getContext(), null, chatActivity, resourcesProvider3);
                                        importingAlert.setOnHideListener(new OAuthSheet$$ExternalSyntheticLambda11(fragmentContextView, i10));
                                        baseFragment2.showDialog(importingAlert);
                                        fragmentContextView.checkImport(false);
                                        break;
                                    }
                                }
                            } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                GroupCallActivity.create((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                break;
                            }
                        } else {
                            LivePlayer livePlayer = LivePlayer.recording;
                            if (livePlayer != null) {
                                int i14 = UserConfig.selectedAccount;
                                int i15 = livePlayer.currentAccount;
                                if (i15 != i14) {
                                    LaunchActivity launchActivity = LaunchActivity.instance;
                                    if (launchActivity != null) {
                                        launchActivity.switchToAccount(i15);
                                    }
                                }
                                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                if (safeLastFragment != null) {
                                    StoriesController storiesController = MessagesController.getInstance(i15).getStoriesController();
                                    int i16 = livePlayer.storyId;
                                    long j2 = livePlayer.dialogId;
                                    TL_stories.StoryItem storyItemFindStory = storiesController.findStory(i16, j2);
                                    if (storyItemFindStory != null) {
                                        storyItemFindStory.dialogId = j2;
                                        safeLastFragment.getOrCreateStoryViewer(i15).open(i15, fragmentContextView.getContext(), storyItemFindStory, (StoriesListPlaceProvider) null);
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        fragmentContextView.callOnClick();
                        break;
                }
            }
        });
        PhotoViewer.AnonymousClass19 anonymousClass19 = new PhotoViewer.AnonymousClass19(getContext(), 14);
        this.groupCallMessagesContainer = anonymousClass19;
        addView(anonymousClass19, LayoutHelper.createFrame(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        final int i10 = 3;
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int currentAccount;
                long dialogId;
                int i11 = 15;
                boolean z = false;
                FragmentContextView fragmentContextView = this.f$0;
                switch (i10) {
                    case 0:
                        if (fragmentContextView.currentStyle == 0) {
                            if (!MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                            } else {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                            }
                        }
                        break;
                    case 1:
                        fragmentContextView.getClass();
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.isMuted = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.muteDrawable.setCustomEndFrame(fragmentContextView.isMuted ? 15 : 29)) {
                                if (fragmentContextView.isMuted) {
                                    fragmentContextView.muteDrawable.setCurrentFrame(0, true, false);
                                } else {
                                    fragmentContextView.muteDrawable.setCurrentFrame(14, true, false);
                                }
                            }
                            fragmentContextView.muteButton.playAnimation();
                            Theme.getFragmentContextViewWavesDrawable().updateState(true);
                            fragmentContextView.capsuleBlobDrawable.updateState(true);
                            try {
                                fragmentContextView.muteButton.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                                return;
                            }
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.currentStyle != 2) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        } else {
                            BaseFragment baseFragment = fragmentContextView.fragment;
                            Activity parentActivity = baseFragment.getParentActivity();
                            Theme.ResourcesProvider resourcesProvider2 = fragmentContextView.resourcesProvider;
                            AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, 0, resourcesProvider2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.title = string;
                            if (baseFragment instanceof DialogsActivity) {
                                alertDialog.message = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                ChatActivityInterface chatActivityInterface = fragmentContextView.chatActivity;
                                TLRPC.Chat currentChat = chatActivityInterface.getCurrentChat();
                                TLRPC.User currentUser = chatActivityInterface.getCurrentUser();
                                if (currentChat != null) {
                                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, currentChat.title));
                                } else if (currentUser != null) {
                                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(currentUser)));
                                } else {
                                    alertDialog.message = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            builder.setPositiveButton(LocaleController.getString(R.string.Stop), new FragmentContextView$$ExternalSyntheticLambda0(fragmentContextView));
                            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                            builder.show();
                            TextView textView = (TextView) alertDialog.getButton(-1);
                            if (textView != null) {
                                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider2));
                            }
                        }
                        break;
                    case 3:
                        int i12 = fragmentContextView.currentStyle;
                        if (i12 != 6) {
                            ChatActivityInterface chatActivityInterface2 = fragmentContextView.chatActivity;
                            Theme.ResourcesProvider resourcesProvider3 = fragmentContextView.resourcesProvider;
                            BaseFragment baseFragment2 = fragmentContextView.fragment;
                            if (i12 == 0) {
                                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                                if (baseFragment2 != null && playingMessageObject != null) {
                                    if (playingMessageObject.isMusic()) {
                                        Activity activityFindActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                        if (activityFindActivity instanceof LaunchActivity) {
                                            new AudioPlayerAlert(activityFindActivity, resourcesProvider3).show();
                                        } else if (AndroidUtilities.isContextSafe(LaunchActivity.instance)) {
                                            new AudioPlayerAlert(LaunchActivity.instance, resourcesProvider3).show();
                                        }
                                    } else if (playingMessageObject.getDialogId() != (chatActivityInterface2 != null ? chatActivityInterface2.getDialogId() : 0L)) {
                                        long dialogId2 = playingMessageObject.getDialogId();
                                        Bundle bundle = new Bundle();
                                        if (DialogObject.isEncryptedDialog(dialogId2)) {
                                            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId2));
                                        } else if (DialogObject.isUserDialog(dialogId2)) {
                                            bundle.putLong("user_id", dialogId2);
                                        } else {
                                            bundle.putLong("chat_id", -dialogId2);
                                        }
                                        bundle.putInt("message_id", playingMessageObject.getId());
                                        baseFragment2.presentFragment(new ChatActivity(bundle), baseFragment2 instanceof ChatActivity);
                                    } else {
                                        fragmentContextView.chatActivity.scrollToMessageId(playingMessageObject.getId(), 0, false, 0, true, 0);
                                    }
                                    break;
                                }
                            } else if (i12 == 1) {
                                fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                                break;
                            } else if (i12 == 2) {
                                int i13 = UserConfig.selectedAccount;
                                if (chatActivityInterface2 != null) {
                                    dialogId = chatActivityInterface2.getDialogId();
                                    currentAccount = baseFragment2.getCurrentAccount();
                                } else if (LocationController.getLocationsCount() == 1) {
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 >= 4) {
                                            currentAccount = i13;
                                            dialogId = 0;
                                        } else if (LocationController.getInstance(i14).sharingLocationsUI.isEmpty()) {
                                            i14++;
                                        } else {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i14).sharingLocationsUI.get(0);
                                            long j = sharingLocationInfo.did;
                                            currentAccount = sharingLocationInfo.messageObject.currentAccount;
                                            dialogId = j;
                                        }
                                    }
                                } else {
                                    currentAccount = i13;
                                    dialogId = 0;
                                }
                                if (dialogId == 0) {
                                    baseFragment2.showDialog(new SharingLocationsAlert(fragmentContextView.getContext(), new FragmentContextView$$ExternalSyntheticLambda0(fragmentContextView), resourcesProvider3));
                                } else {
                                    fragmentContextView.openSharingLocation(LocationController.getInstance(currentAccount).getSharingLocationInfo(dialogId));
                                }
                                break;
                            } else if (i12 != 3) {
                                if (i12 == 4) {
                                    if (baseFragment2.getParentActivity() != null && (groupCall = chatActivityInterface2.getGroupCall()) != null) {
                                        TLRPC.Chat chat2 = baseFragment2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                        TLRPC.GroupCall groupCall2 = groupCall.call;
                                        if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                            z = true;
                                        }
                                        VoIPHelper.startCall(chat2, null, false, Boolean.valueOf(z), baseFragment2.getParentActivity(), baseFragment2, baseFragment2.getAccountInstance());
                                    }
                                    break;
                                } else if (i12 == 5) {
                                    SendMessagesHelper sendMessagesHelper = baseFragment2.getSendMessagesHelper();
                                    ChatActivity chatActivity = (ChatActivity) baseFragment2;
                                    if (sendMessagesHelper.getImportingHistory(chatActivity.getDialogId()) != null) {
                                        ImportingAlert importingAlert = new ImportingAlert(fragmentContextView.getContext(), null, chatActivity, resourcesProvider3);
                                        importingAlert.setOnHideListener(new OAuthSheet$$ExternalSyntheticLambda11(fragmentContextView, i11));
                                        baseFragment2.showDialog(importingAlert);
                                        fragmentContextView.checkImport(false);
                                        break;
                                    }
                                }
                            } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                GroupCallActivity.create((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                break;
                            }
                        } else {
                            LivePlayer livePlayer = LivePlayer.recording;
                            if (livePlayer != null) {
                                int i15 = UserConfig.selectedAccount;
                                int i16 = livePlayer.currentAccount;
                                if (i16 != i15) {
                                    LaunchActivity launchActivity = LaunchActivity.instance;
                                    if (launchActivity != null) {
                                        launchActivity.switchToAccount(i16);
                                    }
                                }
                                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                if (safeLastFragment != null) {
                                    StoriesController storiesController = MessagesController.getInstance(i16).getStoriesController();
                                    int i17 = livePlayer.storyId;
                                    long j2 = livePlayer.dialogId;
                                    TL_stories.StoryItem storyItemFindStory = storiesController.findStory(i17, j2);
                                    if (storyItemFindStory != null) {
                                        storyItemFindStory.dialogId = j2;
                                        safeLastFragment.getOrCreateStoryViewer(i16).open(i16, fragmentContextView.getContext(), storyItemFindStory, (StoriesListPlaceProvider) null);
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        fragmentContextView.callOnClick();
                        break;
                }
            }
        });
        setLeftMargin(this.leftMargin);
    }

    public final void checkImport(boolean z) {
        int i;
        int i2 = 5;
        ChatActivityInterface chatActivityInterface = this.chatActivity;
        if (chatActivityInterface != null) {
            if (this.visible && ((i = this.currentStyle) == 1 || i == 3)) {
                return;
            }
            checkCreateView();
            BaseFragment baseFragment = this.fragment;
            SendMessagesHelper.ImportingHistory importingHistory = baseFragment.getSendMessagesHelper().getImportingHistory(chatActivityInterface.getDialogId());
            View fragmentView = baseFragment.getFragmentView();
            if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                z = true;
            }
            Dialog visibleDialog = baseFragment.getVisibleDialog();
            if ((isPlayingVoice() || chatActivityInterface.shouldShowImport() || ((visibleDialog instanceof ImportingAlert) && !((ImportingAlert) visibleDialog).isDismissed())) && importingHistory != null) {
                importingHistory = null;
            }
            AnimationNotificationsLocker animationNotificationsLocker = this.notificationsLocker;
            if (importingHistory == null) {
                if (!this.visible || ((!z || this.currentStyle != -1) && this.currentStyle != 5)) {
                    int i3 = this.currentStyle;
                    if (i3 == -1 || i3 == 5) {
                        this.visible = false;
                        setVisibility(8);
                        return;
                    }
                    return;
                }
                this.visible = false;
                if (z) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.animatorSet;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.animatorSet = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.animatorSet = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.animatorSet.setDuration(220L);
                this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animatorSet.addListener(new AnonymousClass10(this, 4));
                this.animatorSet.start();
                return;
            }
            if (this.currentStyle != 5 && this.animatorSet != null && !z) {
                this.checkImportAfterAnimation = true;
                return;
            }
            updateStyle(5);
            if (z && this.topPadding == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                FragmentContextViewDelegate fragmentContextViewDelegate = this.delegate;
                if (fragmentContextViewDelegate != null) {
                    ((SharedMediaLayout$$ExternalSyntheticLambda11) fragmentContextViewDelegate).onAnimation(true);
                    ((SharedMediaLayout$$ExternalSyntheticLambda11) this.delegate).onAnimation(false);
                }
            }
            if (!this.visible) {
                if (!z) {
                    AnimatorSet animatorSet3 = this.animatorSet;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.animatorSet = null;
                    }
                    animationNotificationsLocker.lock();
                    this.animatorSet = new AnimatorSet();
                    FragmentContextViewDelegate fragmentContextViewDelegate2 = this.delegate;
                    if (fragmentContextViewDelegate2 != null) {
                        ((SharedMediaLayout$$ExternalSyntheticLambda11) fragmentContextViewDelegate2).onAnimation(true);
                    }
                    this.animatorSet.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.animatorSet.setDuration(200L);
                    this.animatorSet.addListener(new AnonymousClass10(this, i2));
                    this.animatorSet.start();
                }
                this.visible = true;
                setVisibility(0);
            }
            int i4 = this.currentProgress;
            int i5 = importingHistory.uploadProgress;
            if (i4 != i5) {
                this.currentProgress = i5;
                setText(AndroidUtilities.replaceTags(LocaleController.formatString("ImportUploading", R.string.ImportUploading, Integer.valueOf(i5))), false);
            }
        }
    }

    public final void checkLiveLocation(boolean z) {
        String pluralString;
        String string;
        int i = 0;
        BaseFragment baseFragment = this.fragment;
        View fragmentView = baseFragment.getFragmentView();
        int i2 = 1;
        if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z = true;
        }
        boolean z2 = baseFragment instanceof DialogsActivity;
        boolean zIsSharingLocation = z2 ? LocationController.getLocationsCount() != 0 : LocationController.getInstance(baseFragment.getCurrentAccount()).isSharingLocation(this.chatActivity.getDialogId());
        BubbleActivity.AnonymousClass1 anonymousClass1 = this.checkLocationRunnable;
        if (!zIsSharingLocation) {
            this.lastLocationSharingCount = -1;
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            if (this.visible) {
                this.visible = false;
                if (z) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.animatorSet;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.animatorSet = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.animatorSet = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.animatorSet.setDuration(200L);
                this.animatorSet.addListener(new AnonymousClass10(this, i));
                this.animatorSet.start();
                return;
            }
            return;
        }
        checkCreateView();
        updateStyle(2);
        this.playButton.setImageDrawable(new ShareLocationDrawable(getContext(), 1));
        if (z && this.topPadding == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.visible) {
            if (!z) {
                AnimatorSet animatorSet3 = this.animatorSet;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.animatorSet = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.animatorSet = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.animatorSet.setDuration(200L);
                this.animatorSet.addListener(new AnonymousClass10(this, i2));
                this.animatorSet.start();
            }
            this.visible = true;
            setVisibility(0);
        }
        if (!z2) {
            anonymousClass1.run();
            checkLocationString();
            return;
        }
        String string2 = LocaleController.getString(R.string.LiveLocationContext);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < 4; i3++) {
            arrayList.addAll(LocationController.getInstance(i3).sharingLocationsUI);
        }
        if (arrayList.size() == 1) {
            LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) arrayList.get(0);
            long dialogId = sharingLocationInfo.messageObject.getDialogId();
            if (DialogObject.isUserDialog(dialogId)) {
                pluralString = UserObject.getFirstName(MessagesController.getInstance(sharingLocationInfo.messageObject.currentAccount).getUser(Long.valueOf(dialogId)));
                string = LocaleController.getString(R.string.AttachLiveLocationIsSharing);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(sharingLocationInfo.messageObject.currentAccount).getChat(Long.valueOf(-dialogId));
                pluralString = chat != null ? chat.title : "";
                string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChat);
            }
        } else {
            pluralString = LocaleController.formatPluralString("Chats", arrayList.size(), new Object[0]);
            string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChats);
        }
        String str = String.format(string, string2, pluralString);
        int iIndexOf = str.indexOf(string2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i4 = 0;
        while (i4 < 2) {
            TextView textView = i4 == 0 ? getTextView() : getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i4++;
        }
        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), Theme.getColor(Theme.key_inappPlayerPerformer, this.resourcesProvider)), iIndexOf, string2.length() + iIndexOf, 18);
        setText(spannableStringBuilder, false);
    }

    public final void checkLiveStory(boolean z) {
        int i = 8;
        int i2 = 6;
        View fragmentView = this.fragment.getFragmentView();
        if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z = true;
        }
        LivePlayer livePlayer = LivePlayer.recording;
        AnimationNotificationsLocker animationNotificationsLocker = this.notificationsLocker;
        if (livePlayer != null) {
            checkCreateView();
            int i3 = this.currentStyle;
            if (6 != i3 && this.animatorSet != null && !z) {
                this.checkLiveStoryAfterAnimation = true;
                return;
            }
            if (6 != i3 && this.visible && !z) {
                AnimatorSet animatorSet = this.animatorSet;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.animatorSet = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.animatorSet = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.animatorSet.setDuration(220L);
                this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animatorSet.addListener(new AnonymousClass10(this, 7));
                this.animatorSet.start();
                return;
            }
            updateStyle(6);
            if (this.visible) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                setVisibility(0);
            } else {
                if (z) {
                    setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                    startJoinFlickerAnimation();
                } else {
                    AnimatorSet animatorSet3 = this.animatorSet;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.animatorSet = null;
                    }
                    this.animatorSet = new AnimatorSet();
                    this.notificationsLocker2.lock();
                    this.animatorSet.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.animatorSet.setDuration(220L);
                    this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    this.animatorSet.addListener(new AnonymousClass10(this, i));
                    this.animatorSet.start();
                }
                this.visible = true;
                setVisibility(0);
            }
        } else {
            boolean z2 = this.visible;
            if (z2 && ((z && this.currentStyle == -1) || this.currentStyle == 6)) {
                this.visible = false;
                if (z) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                } else {
                    AnimatorSet animatorSet4 = this.animatorSet;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.animatorSet = null;
                    }
                    animationNotificationsLocker.lock();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.animatorSet = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.animatorSet.setDuration(220L);
                    this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    this.animatorSet.addListener(new AnonymousClass10(this, i2));
                    this.animatorSet.start();
                }
            } else if (z2 && this.currentStyle == -1) {
                this.visible = false;
                setVisibility(8);
            }
        }
        LivePlayer livePlayer2 = LivePlayer.recording;
        if (livePlayer2 == null || this.currentStyle != 6) {
            return;
        }
        AnonymousClass4 anonymousClass4 = this.titleTextView;
        TLRPC.GroupCall groupCall = livePlayer2.call;
        anonymousClass4.setText(LocaleController.formatPluralStringComma("LiveStoryTopPanelWatching", Math.max(1, groupCall != null ? groupCall.participants_count : 0)));
    }

    public final void checkLocationString() {
        int i;
        String str;
        ChatActivityInterface chatActivityInterface = this.chatActivity;
        if (chatActivityInterface == null || this.titleTextView == null) {
            return;
        }
        checkCreateView();
        long dialogId = chatActivityInterface.getDialogId();
        int currentAccount = this.fragment.getCurrentAccount();
        ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.get(dialogId);
        if (!this.firstLocationsLoaded) {
            LocationController.getInstance(currentAccount).loadLiveLocations(dialogId);
            this.firstLocationsLoaded = true;
        }
        TLRPC.User user = null;
        if (arrayList != null) {
            long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
            int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
            i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i2);
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                    long fromChatId = MessageObject.getFromChatId(message);
                    if (user == null && fromChatId != clientUserId) {
                        user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(fromChatId));
                    }
                    i++;
                }
            }
        } else {
            i = 0;
        }
        if (this.lastLocationSharingCount == i) {
            return;
        }
        this.lastLocationSharingCount = i;
        String string = LocaleController.getString(R.string.LiveLocationContext);
        if (i == 0) {
            str = string;
        } else {
            int i3 = i - 1;
            if (!LocationController.getInstance(currentAccount).isSharingLocation(dialogId)) {
                str = i3 != 0 ? String.format("%1$s - %2$s %3$s", string, UserObject.getFirstName(user), LocaleController.formatPluralString("AndOther", i3, new Object[0])) : String.format("%1$s - %2$s", string, UserObject.getFirstName(user));
            } else if (i3 != 0) {
                str = (i3 != 1 || user == null) ? String.format("%1$s - %2$s %3$s", string, LocaleController.getString(R.string.ChatYourSelfName), LocaleController.formatPluralString("AndOther", i3, new Object[0])) : String.format("%1$s - %2$s", string, LocaleController.formatString("SharingYouAndOtherName", R.string.SharingYouAndOtherName, UserObject.getFirstName(user)));
            } else {
                str = String.format("%1$s - %2$s", string, LocaleController.getString(R.string.ChatYourSelfName));
            }
        }
        if (str.equals(this.lastString)) {
            return;
        }
        this.lastString = str;
        int iIndexOf = str.indexOf(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i4 = 0;
        while (i4 < 2) {
            TextView textView = i4 == 0 ? getTextView() : getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i4++;
        }
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), Theme.getColor(Theme.key_inappPlayerPerformer, this.resourcesProvider)), iIndexOf, string.length() + iIndexOf, 18);
        }
        setText(spannableStringBuilder, false);
    }

    public final void checkPlayer(boolean z) {
        ChatActivityInterface chatActivityInterface;
        SpannableStringBuilder spannableStringBuilder;
        int i = 2;
        int i2 = 3;
        boolean z2 = false;
        if (this.visible) {
            int i3 = this.currentStyle;
            if (i3 == 1 || i3 == 3) {
                return;
            }
            if ((i3 == 4 || i3 == 5) && !isPlayingVoice()) {
                return;
            }
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        View fragmentView = this.fragment.getFragmentView();
        if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z = true;
        }
        boolean z3 = this.visible;
        AnimationNotificationsLocker animationNotificationsLocker = this.notificationsLocker;
        if (playingMessageObject == null || playingMessageObject.getId() == 0 || playingMessageObject.isVideo()) {
            this.lastMessageObject = null;
            boolean z4 = (!this.supportsCalls || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || GroupCallPip.isShowing()) ? false : true;
            if (!isPlayingVoice() && !z4 && (chatActivityInterface = this.chatActivity) != null && !GroupCallPip.isShowing()) {
                ChatObject.Call groupCall = chatActivityInterface.getGroupCall();
                z4 = groupCall != null && groupCall.shouldShowPanel();
            }
            if (z4) {
                checkCall(false);
                return;
            }
            if (!this.visible) {
                setVisibility(8);
                return;
            }
            ActionBarMenuItem actionBarMenuItem = this.playbackSpeedButton;
            if (actionBarMenuItem != null) {
                ActionBarPopupWindow actionBarPopupWindow = actionBarMenuItem.popupWindow;
                if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                    this.playbackSpeedButton.toggleSubMenu(null, null);
                }
            }
            this.visible = false;
            if (z) {
                if (getVisibility() != 8) {
                    setVisibility(8);
                }
                setTopPadding(0.0f);
                return;
            }
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.animatorSet = null;
            }
            animationNotificationsLocker.lock();
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.animatorSet.setDuration(200L);
            FragmentContextViewDelegate fragmentContextViewDelegate = this.delegate;
            if (fragmentContextViewDelegate != null) {
                ((SharedMediaLayout$$ExternalSyntheticLambda11) fragmentContextViewDelegate).onAnimation(true);
            }
            this.animatorSet.addListener(new AnonymousClass10(this, i));
            this.animatorSet.start();
            return;
        }
        checkCreateView();
        int i4 = this.currentStyle;
        if (i4 != 0 && this.animatorSet != null && !z) {
            this.checkPlayerAfterAnimation = true;
            return;
        }
        updateStyle(0);
        if (z && this.topPadding == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            FragmentContextViewDelegate fragmentContextViewDelegate2 = this.delegate;
            if (fragmentContextViewDelegate2 != null) {
                ((SharedMediaLayout$$ExternalSyntheticLambda11) fragmentContextViewDelegate2).onAnimation(true);
                ((SharedMediaLayout$$ExternalSyntheticLambda11) this.delegate).onAnimation(false);
            }
        }
        if (!this.visible) {
            if (!z) {
                AnimatorSet animatorSet3 = this.animatorSet;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.animatorSet = null;
                }
                animationNotificationsLocker.lock();
                this.animatorSet = new AnimatorSet();
                FragmentContextViewDelegate fragmentContextViewDelegate3 = this.delegate;
                if (fragmentContextViewDelegate3 != null) {
                    ((SharedMediaLayout$$ExternalSyntheticLambda11) fragmentContextViewDelegate3).onAnimation(true);
                }
                this.animatorSet.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.animatorSet.setDuration(200L);
                this.animatorSet.addListener(new AnonymousClass10(this, i2));
                this.animatorSet.start();
            }
            this.visible = true;
            setVisibility(0);
        }
        if (MediaController.getInstance().isMessagePaused()) {
            this.playPauseDrawable.setPause(false, !z);
            this.playButton.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
        } else {
            this.playPauseDrawable.setPause(true, !z);
            this.playButton.setContentDescription(LocaleController.getString(R.string.AccActionPause));
        }
        if (this.lastMessageObject == playingMessageObject && i4 == 0) {
            return;
        }
        this.lastMessageObject = playingMessageObject;
        if (playingMessageObject.isVoice() || this.lastMessageObject.isRoundVideo()) {
            this.isMusic = false;
            ActionBarMenuItem actionBarMenuItem2 = this.playbackSpeedButton;
            if (actionBarMenuItem2 != null) {
                actionBarMenuItem2.setAlpha(1.0f);
                this.playbackSpeedButton.setEnabled(true);
            }
            setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.joinButtonWidth, 0);
            spannableStringBuilder = new SpannableStringBuilder(zzkc.m(playingMessageObject.getMusicAuthor(), " ", playingMessageObject.getMusicTitle()));
            int i5 = 0;
            while (i5 < 2) {
                TextView textView = i5 == 0 ? getTextView() : getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                }
                i5++;
            }
            updatePlaybackButton$1(false);
        } else {
            this.isMusic = true;
            if (this.playbackSpeedButton == null) {
                setPadding(0, 0, this.joinButtonWidth, 0);
            } else if (playingMessageObject.getDuration() >= 600.0d) {
                this.playbackSpeedButton.setAlpha(1.0f);
                this.playbackSpeedButton.setEnabled(true);
                setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.joinButtonWidth, 0);
                updatePlaybackButton$1(false);
            } else {
                this.playbackSpeedButton.setAlpha(0.0f);
                this.playbackSpeedButton.setEnabled(false);
                setPadding(0, 0, this.joinButtonWidth, 0);
            }
            spannableStringBuilder = new SpannableStringBuilder(zzkc.m(playingMessageObject.getMusicAuthor(), " - ", playingMessageObject.getMusicTitle()));
            int i6 = 0;
            while (i6 < 2) {
                TextView textView2 = i6 == 0 ? getTextView() : getNextTextView();
                if (textView2 != null) {
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                }
                i6++;
            }
        }
        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), Theme.getColor(Theme.key_inappPlayerPerformer, this.resourcesProvider)), 0, playingMessageObject.getMusicAuthor().length(), 18);
        AnonymousClass4 anonymousClass4 = this.titleTextView;
        if (!z && z3 && this.isMusic) {
            z2 = true;
        }
        anonymousClass4.setText(spannableStringBuilder, z2);
    }

    public final void createPlaybackSpeedButton() {
        int i = 1;
        if (this.playbackSpeedButton != null) {
            return;
        }
        Context context = getContext();
        int i2 = Theme.key_dialogTextBlack;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 0, Theme.getColor(i2, resourcesProvider), false, this.resourcesProvider);
        this.playbackSpeedButton = actionBarMenuItem;
        actionBarMenuItem.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        this.playbackSpeedButton.setLongClickEnabled(false);
        this.playbackSpeedButton.setVisibility(8);
        this.playbackSpeedButton.setTag(null);
        this.playbackSpeedButton.setShowSubmenuByMove(false);
        this.playbackSpeedButton.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.playbackSpeedButton.setDelegate(new FragmentContextView$$ExternalSyntheticLambda0(this));
        ActionBarMenuItem actionBarMenuItem2 = this.playbackSpeedButton;
        CanvasButton.AnonymousClass2 anonymousClass2 = new CanvasButton.AnonymousClass2();
        this.speedIcon = anonymousClass2;
        actionBarMenuItem2.setIcon(anonymousClass2);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        ActionBarMenuSlider.SpeedSlider speedSlider = new ActionBarMenuSlider.SpeedSlider(getContext(), resourcesProvider);
        this.speedSlider = speedSlider;
        speedSlider.setRoundRadiusDp(6.0f);
        this.speedSlider.setDrawShadow(true);
        this.speedSlider.setOnValueChange(new GiftSheet$$ExternalSyntheticLambda8(this, i));
        ActionBarMenuItem.Item itemLazilyAddSubItem = this.playbackSpeedButton.lazilyAddSubItem(0, R.drawable.msg_speed_slow, null, LocaleController.getString(R.string.SpeedSlow));
        ActionBarMenuItem.Item[] itemArr = this.speedItems;
        itemArr[0] = itemLazilyAddSubItem;
        itemArr[1] = this.playbackSpeedButton.lazilyAddSubItem(1, R.drawable.msg_speed_normal, null, LocaleController.getString(R.string.SpeedNormal));
        itemArr[2] = this.playbackSpeedButton.lazilyAddSubItem(2, R.drawable.msg_speed_medium, null, LocaleController.getString(R.string.SpeedMedium));
        itemArr[3] = this.playbackSpeedButton.lazilyAddSubItem(3, R.drawable.msg_speed_fast, null, LocaleController.getString(R.string.SpeedFast));
        itemArr[4] = this.playbackSpeedButton.lazilyAddSubItem(4, R.drawable.msg_speed_veryfast, null, LocaleController.getString(R.string.SpeedVeryFast));
        itemArr[5] = this.playbackSpeedButton.lazilyAddSubItem(5, R.drawable.msg_speed_superfast, null, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            this.playbackSpeedButton.setPadding(0, 1, 0, 0);
        }
        this.playbackSpeedButton.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        addView(this.playbackSpeedButton, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.playbackSpeedButton.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(25, this, fArr));
        this.playbackSpeedButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda44(this, 6));
        updatePlaybackButton$1(false);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (i == NotificationCenter.liveLocationsChanged) {
            checkLiveLocation(false);
            return;
        }
        if (i == NotificationCenter.liveStoryUpdated) {
            checkLiveStory(false);
            return;
        }
        int i3 = NotificationCenter.liveLocationsCacheChanged;
        ChatActivityInterface chatActivityInterface = this.chatActivity;
        if (i == i3) {
            if (chatActivityInterface != null) {
                if (chatActivityInterface.getDialogId() == ((Long) objArr[0]).longValue()) {
                    checkLocationString();
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagePlayingDidStart || i == NotificationCenter.messagePlayingPlayStateChanged || i == NotificationCenter.messagePlayingDidReset || i == NotificationCenter.didEndCall) {
            int i4 = this.currentStyle;
            if (i4 == 1 || i4 == 3 || i4 == 4) {
                checkCall(false);
            }
            checkPlayer(false);
            return;
        }
        int i5 = NotificationCenter.didStartedCall;
        if (i == i5 || i == NotificationCenter.groupCallUpdated || i == NotificationCenter.groupCallVisibilityChanged) {
            checkCall(false);
            if (this.currentStyle != 3 || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null) {
                return;
            }
            if (i == i5) {
                sharedInstance.registerStateListener(this);
            }
            int callState = sharedInstance.getCallState();
            if (callState == 1 || callState == 2 || callState == 6 || callState == 5 || this.muteButton == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.get(sharedInstance.getSelfId())) == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                return;
            }
            sharedInstance.setMicMute(true, false, false);
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.muteButton.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            return;
        }
        if (i == NotificationCenter.groupCallTypingsUpdated) {
            checkCreateView();
            if (this.visible && this.currentStyle == 4) {
                ChatObject.Call groupCall = chatActivityInterface.getGroupCall();
                if (groupCall != null && this.subtitleTextView != null) {
                    if (groupCall.isScheduled()) {
                        setText(LocaleController.formatStartsTime(groupCall.call.schedule_date, 4), false);
                    } else {
                        TLRPC.GroupCall groupCall2 = groupCall.call;
                        int i6 = groupCall2.participants_count;
                        if (i6 == 0) {
                            setText(LocaleController.getString(groupCall2.rtmp_stream ? R.string.ViewersWatchingNobody : R.string.MembersTalkingNobody), false);
                        } else {
                            setText(LocaleController.formatPluralString(groupCall2.rtmp_stream ? "ViewersWatching" : "Participants", i6, new Object[0]), false);
                        }
                    }
                }
                updateAvatars(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.historyImportProgressChanged) {
            int i7 = this.currentStyle;
            if (i7 == 1 || i7 == 3 || i7 == 4) {
                checkCall(false);
            }
            checkImport(false);
            return;
        }
        if (i == NotificationCenter.messagePlayingSpeedChanged) {
            updatePlaybackButton$1(true);
            return;
        }
        int i8 = NotificationCenter.webRtcMicAmplitudeEvent;
        CapsuleBlobDrawable capsuleBlobDrawable = this.capsuleBlobDrawable;
        if (i == i8) {
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                this.micAmplitude = 0.0f;
            } else {
                this.micAmplitude = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
            }
            if (VoIPService.getSharedInstance() != null) {
                FragmentContextViewWavesDrawable fragmentContextViewWavesDrawable = Theme.getFragmentContextViewWavesDrawable();
                float fMax = Math.max(this.speakerAmplitude, this.micAmplitude);
                fragmentContextViewWavesDrawable.animateToAmplitude = fMax;
                float f = fMax - fragmentContextViewWavesDrawable.amplitude;
                fragmentContextViewWavesDrawable.animateAmplitudeDiff = f / 250.0f;
                fragmentContextViewWavesDrawable.animateAmplitudeDiff2 = f / 120.0f;
                capsuleBlobDrawable.setAmplitude(Math.max(this.speakerAmplitude, this.micAmplitude));
                return;
            }
            return;
        }
        if (i != NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            if (i == NotificationCenter.messagePlayingProgressDidChanged && this.currentStyle == 0) {
                invalidate();
                return;
            }
            return;
        }
        checkCreateView();
        this.speakerAmplitude = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            this.micAmplitude = 0.0f;
        }
        if (VoIPService.getSharedInstance() != null) {
            FragmentContextViewWavesDrawable fragmentContextViewWavesDrawable2 = Theme.getFragmentContextViewWavesDrawable();
            float fMax2 = Math.max(this.speakerAmplitude, this.micAmplitude);
            fragmentContextViewWavesDrawable2.animateToAmplitude = fMax2;
            float f2 = fMax2 - fragmentContextViewWavesDrawable2.amplitude;
            fragmentContextViewWavesDrawable2.animateAmplitudeDiff = f2 / 250.0f;
            fragmentContextViewWavesDrawable2.animateAmplitudeDiff2 = f2 / 120.0f;
            capsuleBlobDrawable.setAmplitude(Math.max(this.speakerAmplitude, this.micAmplitude));
        }
        this.avatars.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        long j;
        float f;
        float f2;
        float f3;
        boolean z3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        FragmentContextViewWavesDrawable.WeavingState weavingState;
        MessageObject playingMessageObject;
        if (this.frameLayout == null) {
            return;
        }
        if (!this.drawOverlay || getVisibility() == 0) {
            int i = this.currentStyle;
            float f9 = 1.0f;
            if (i == 3 || i == 1) {
                Theme.getFragmentContextViewWavesDrawable().updateState(this.wasDraw);
                this.capsuleBlobDrawable.updateState(this.wasDraw);
                AndroidUtilities.dp(getStyleHeight());
                FragmentContextViewWavesDrawable fragmentContextViewWavesDrawable = Theme.getFragmentContextViewWavesDrawable();
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                int i2 = 0;
                while (true) {
                    FragmentContextViewWavesDrawable.WeavingState[] weavingStateArr = fragmentContextViewWavesDrawable.states;
                    if (i2 >= weavingStateArr.length) {
                        break;
                    }
                    FragmentContextViewWavesDrawable.WeavingState weavingState2 = weavingStateArr[i2];
                    int i3 = weavingState2.currentState;
                    if (i3 == 0) {
                        if (weavingState2.color1 != Theme.getColor(null, weavingState2.greenKey1, false) || weavingState2.color2 != Theme.getColor(null, weavingState2.greenKey2, false)) {
                            weavingState2.createGradients();
                        }
                    } else if (i3 == 1) {
                        if (weavingState2.color1 != Theme.getColor(null, weavingState2.blueKey1, false) || weavingState2.color2 != Theme.getColor(null, weavingState2.blueKey2, false)) {
                            weavingState2.createGradients();
                        }
                    } else if (i3 == 3 && (weavingState2.color1 != Theme.getColor(null, weavingState2.mutedByAdmin, false) || weavingState2.color2 != Theme.getColor(null, weavingState2.mutedByAdmin2, false))) {
                        weavingState2.createGradients();
                    }
                    i2++;
                }
                boolean z4 = fragmentContextViewWavesDrawable.parents.size() > 0;
                if (0.0f > measuredHeight) {
                    f2 = 1.0f;
                    break;
                }
                FragmentContextViewWavesDrawable.WeavingState weavingState3 = fragmentContextViewWavesDrawable.currentState;
                if (weavingState3 == null || (weavingState = fragmentContextViewWavesDrawable.previousState) == null) {
                    z = false;
                } else {
                    int i4 = weavingState.currentState;
                    int i5 = weavingState3.currentState;
                    if ((i5 == 1 && i4 == 0) || (i4 == 1 && i5 == 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z4) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    z2 = z4;
                    j = jElapsedRealtime - fragmentContextViewWavesDrawable.lastUpdateTime;
                    fragmentContextViewWavesDrawable.lastUpdateTime = jElapsedRealtime;
                    if (j > 20) {
                        j = 17;
                    }
                    if (j < 3) {
                        z2 = false;
                    }
                } else {
                    z2 = z4;
                    j = 0;
                }
                if (z2) {
                    float f10 = fragmentContextViewWavesDrawable.animateToAmplitude;
                    float f11 = fragmentContextViewWavesDrawable.amplitude;
                    if (f10 != f11) {
                        float f12 = fragmentContextViewWavesDrawable.animateAmplitudeDiff;
                        f = 0.0f;
                        float f13 = (j * f12) + f11;
                        fragmentContextViewWavesDrawable.amplitude = f13;
                        if (f12 > 0.0f) {
                            if (f13 > f10) {
                                fragmentContextViewWavesDrawable.amplitude = f10;
                            }
                        } else if (f13 < f10) {
                            fragmentContextViewWavesDrawable.amplitude = f10;
                        }
                        invalidate();
                    } else {
                        f = 0.0f;
                    }
                    float f14 = fragmentContextViewWavesDrawable.animateToAmplitude;
                    float f15 = fragmentContextViewWavesDrawable.amplitude2;
                    if (f14 != f15) {
                        float f16 = fragmentContextViewWavesDrawable.animateAmplitudeDiff2;
                        float f17 = (j * f16) + f15;
                        fragmentContextViewWavesDrawable.amplitude2 = f17;
                        if (f16 > 0.0f) {
                            if (f17 > f14) {
                                fragmentContextViewWavesDrawable.amplitude2 = f14;
                            }
                        } else if (f17 < f14) {
                            fragmentContextViewWavesDrawable.amplitude2 = f14;
                        }
                        invalidate();
                    }
                    if (fragmentContextViewWavesDrawable.previousState != null) {
                        float f18 = (j / 250.0f) + fragmentContextViewWavesDrawable.progressToState;
                        fragmentContextViewWavesDrawable.progressToState = f18;
                        if (f18 > 1.0f) {
                            fragmentContextViewWavesDrawable.progressToState = 1.0f;
                            fragmentContextViewWavesDrawable.previousState = null;
                        }
                        invalidate();
                    }
                } else {
                    f = 0.0f;
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= 2) {
                        f2 = 1.0f;
                        break;
                    }
                    if (i6 == 0 && fragmentContextViewWavesDrawable.previousState == null) {
                        z3 = z;
                    } else {
                        Paint paint = fragmentContextViewWavesDrawable.paint;
                        if (i6 == 0) {
                            f4 = f9 - fragmentContextViewWavesDrawable.progressToState;
                            fragmentContextViewWavesDrawable.previousState.setToPaint(paint);
                            z3 = z;
                        } else {
                            f2 = 1.0f;
                            FragmentContextViewWavesDrawable.WeavingState weavingState4 = fragmentContextViewWavesDrawable.currentState;
                            if (weavingState4 == null) {
                                break;
                            }
                            float f19 = fragmentContextViewWavesDrawable.previousState != null ? fragmentContextViewWavesDrawable.progressToState : 1.0f;
                            if (z2) {
                                int i7 = (int) (measuredHeight - f);
                                int i8 = (int) (measuredWidth - 0.0f);
                                float f20 = fragmentContextViewWavesDrawable.amplitude;
                                int i9 = weavingState4.currentState;
                                if (i9 == 2) {
                                    f3 = f19;
                                    z3 = z;
                                } else {
                                    float f21 = weavingState4.duration;
                                    if (f21 != 0.0f) {
                                        f5 = f20;
                                        if (weavingState4.time < f21) {
                                            f3 = f19;
                                            z3 = z;
                                        }
                                        float f22 = j;
                                        f6 = (f22 * 0.02f * f5) + (f22 * 1.0f) + weavingState4.time;
                                        weavingState4.time = f6;
                                        f7 = weavingState4.duration;
                                        if (f6 > f7) {
                                            weavingState4.time = f7;
                                        }
                                        float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(weavingState4.time / f7);
                                        float f23 = i8;
                                        float f24 = weavingState4.startX;
                                        float f25 = ((((weavingState4.targetX - f24) * interpolation) + f24) * f23) - 200.0f;
                                        float f26 = weavingState4.startY;
                                        float f27 = ((((weavingState4.targetY - f26) * interpolation) + f26) * i7) - 200.0f;
                                        float f28 = f23 / 400.0f;
                                        if (i9 != 0 || i9 == 3) {
                                            f8 = 3.0f;
                                        } else {
                                            f8 = 1.5f;
                                        }
                                        float f29 = f28 * f8;
                                        Matrix matrix = weavingState4.matrix;
                                        matrix.reset();
                                        matrix.postTranslate(f25, f27);
                                        matrix.postScale(f29, f29, f25 + 200.0f, f27 + 200.0f);
                                        weavingState4.shader.setLocalMatrix(matrix);
                                    } else {
                                        f5 = f20;
                                    }
                                    weavingState4.duration = Utilities.random.nextInt(700) + 500;
                                    weavingState4.time = 0.0f;
                                    if (weavingState4.targetX != -1.0f) {
                                        f3 = f19;
                                        z3 = z;
                                    } else if (i9 == 3) {
                                        f3 = f19;
                                        z3 = z;
                                        weavingState4.targetX = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Utilities.random.nextInt(100), 0.05f, 100.0f, -0.3f);
                                        weavingState4.targetY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Utilities.random.nextInt(100), 0.05f, 100.0f, 0.7f);
                                    } else {
                                        f3 = f19;
                                        z3 = z;
                                        if (i9 == 0) {
                                            weavingState4.targetX = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Utilities.random.nextInt(100), 0.2f, 100.0f, -0.3f);
                                            weavingState4.targetY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
                                        } else {
                                            weavingState4.targetX = zzjd.m(Utilities.random.nextInt(100), 100.0f, 0.2f, 1.1f);
                                            weavingState4.targetY = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                                        }
                                    }
                                    weavingState4.startX = weavingState4.targetX;
                                    weavingState4.startY = weavingState4.targetY;
                                    if (i9 == 3) {
                                        weavingState4.targetX = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Utilities.random.nextInt(100), 0.05f, 100.0f, -0.3f);
                                        weavingState4.targetY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Utilities.random.nextInt(100), 0.05f, 100.0f, 0.7f);
                                    } else if (i9 == 0) {
                                        weavingState4.targetX = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Utilities.random.nextInt(100), 0.2f, 100.0f, -0.3f);
                                        weavingState4.targetY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
                                    } else {
                                        weavingState4.targetX = zzjd.m(Utilities.random.nextInt(100), 100.0f, 0.2f, 1.1f);
                                        weavingState4.targetY = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                                    }
                                    float f210 = j;
                                    f6 = (f210 * 0.02f * f5) + (f210 * 1.0f) + weavingState4.time;
                                    weavingState4.time = f6;
                                    f7 = weavingState4.duration;
                                    if (f6 > f7) {
                                        weavingState4.time = f7;
                                    }
                                    float interpolation2 = CubicBezierInterpolator.EASE_OUT.getInterpolation(weavingState4.time / f7);
                                    float f211 = i8;
                                    float f212 = weavingState4.startX;
                                    float f213 = ((((weavingState4.targetX - f212) * interpolation2) + f212) * f211) - 200.0f;
                                    float f214 = weavingState4.startY;
                                    float f215 = ((((weavingState4.targetY - f214) * interpolation2) + f214) * i7) - 200.0f;
                                    float f216 = f211 / 400.0f;
                                    if (i9 != 0) {
                                        f8 = 3.0f;
                                    } else {
                                        f8 = 3.0f;
                                    }
                                    float f217 = f216 * f8;
                                    Matrix matrix2 = weavingState4.matrix;
                                    matrix2.reset();
                                    matrix2.postTranslate(f213, f215);
                                    matrix2.postScale(f217, f217, f213 + 200.0f, f215 + 200.0f);
                                    weavingState4.shader.setLocalMatrix(matrix2);
                                }
                            } else {
                                f3 = f19;
                                z3 = z;
                            }
                            fragmentContextViewWavesDrawable.currentState.setToPaint(paint);
                            f4 = f3;
                        }
                        if (!(i6 == 1 && z3) && i6 == 1) {
                            paint.setAlpha((int) (255.0f * f4));
                        } else {
                            paint.setAlpha(255);
                        }
                        if (i6 == 1 && z3) {
                            Path path = fragmentContextViewWavesDrawable.path;
                            path.rewind();
                            path.addCircle(measuredWidth - AndroidUtilities.dp(18.0f), ImageReceiver$$ExternalSyntheticOutline0.m(measuredHeight, 0.0f, 2.0f, 0.0f), ImageReceiver$$ExternalSyntheticOutline2.m(measuredWidth, 0.0f, 1.1f, f4), Path.Direction.CW);
                            canvas.save();
                            canvas.clipPath(path);
                            canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                            canvas.restore();
                        } else {
                            canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                        }
                    }
                    i6++;
                    j = j;
                    z = z3;
                    f9 = 1.0f;
                    f = 0.0f;
                }
                invalidate();
            } else {
                f2 = 1.0f;
            }
            super.dispatchDraw(canvas);
            if (this.currentStyle == 0 && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                float f30 = -AndroidUtilities.dpf2(f2);
                float fLerp = AndroidUtilities.lerp(f30, AndroidUtilities.dpf2(f2) + getMeasuredWidth(), playingMessageObject.audioProgress);
                float measuredHeight2 = getMeasuredHeight();
                float fDpf2 = measuredHeight2 - AndroidUtilities.dpf2(2.0f);
                Paint paint2 = this.progressPaint;
                paint2.setColor(Theme.getColor(Theme.key_telegram_color, this.resourcesProvider));
                canvas.drawRoundRect(f30, fDpf2, fLerp, measuredHeight2, AndroidUtilities.dpf2(f2), AndroidUtilities.dpf2(f2), paint2);
            }
            this.wasDraw = true;
        }
    }

    public CapsuleBlobDrawable getCapsuleBlobDrawable() {
        return this.capsuleBlobDrawable;
    }

    public int getCurrentStyle() {
        return this.currentStyle;
    }

    public int getStyleHeight() {
        return this.currentStyle == 4 ? 48 : 36;
    }

    public float getTopPadding() {
        return this.topPadding;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i = this.currentStyle;
        if ((i == 3 || i == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isLocation) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsCacheChanged);
            checkLiveLocation(true);
        } else {
            for (int i = 0; i < 4; i++) {
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingDidReset);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingDidStart);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.groupCallUpdated);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.groupCallTypingsUpdated);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.historyImportProgressChanged);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i).subscribeToCallMessages(0L, this);
            }
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.messagePlayingSpeedChanged);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didStartedCall);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.groupCallVisibilityChanged);
            if (LivePlayer.recording != null) {
                checkLiveStory(true);
            } else if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || GroupCallPip.isShowing()) {
                ChatActivityInterface chatActivityInterface = this.chatActivity;
                if (chatActivityInterface != null && this.fragment.getSendMessagesHelper().getImportingHistory(chatActivityInterface.getDialogId()) != null && !isPlayingVoice()) {
                    checkImport(true);
                } else if (chatActivityInterface == null || chatActivityInterface.getGroupCall() == null || !chatActivityInterface.getGroupCall().shouldShowPanel() || GroupCallPip.isShowing() || isPlayingVoice()) {
                    checkCall(true);
                    checkPlayer(true);
                    updatePlaybackButton$1(false);
                } else {
                    checkCall(true);
                }
            } else {
                checkCall(true);
            }
        }
        int i2 = this.currentStyle;
        if (i2 == 3 || i2 == 1) {
            FragmentContextViewWavesDrawable fragmentContextViewWavesDrawable = Theme.getFragmentContextViewWavesDrawable();
            if (!fragmentContextViewWavesDrawable.parents.contains(this)) {
                fragmentContextViewWavesDrawable.parents.add(this);
            }
            CapsuleBlobDrawable capsuleBlobDrawable = this.capsuleBlobDrawable;
            if (!capsuleBlobDrawable.running) {
                capsuleBlobDrawable.running = true;
                capsuleBlobDrawable.lastFrameTime = SystemClock.elapsedRealtime();
                Choreographer60FpsContent.getInstance().addFrameCallback(60, capsuleBlobDrawable.mInvalidateSelf);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            if (this.isMuted != z && this.muteButton != null) {
                this.isMuted = z;
                this.muteDrawable.setCustomEndFrame(z ? 15 : 29);
                RLottieDrawable rLottieDrawable = this.muteDrawable;
                rLottieDrawable.setCurrentFrame(rLottieDrawable.customEndFrame - 1, false, true);
                this.muteButton.invalidate();
            }
        } else if (i2 == 4 && !this.scheduleRunnableScheduled) {
            this.scheduleRunnableScheduled = true;
            this.updateScheduleTimeRunnable.run();
        }
        if (this.visible && this.topPadding == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        this.speakerAmplitude = 0.0f;
        this.micAmplitude = 0.0f;
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        boolean z2 = this.isMuted;
        CapsuleBlobDrawable capsuleBlobDrawable = this.capsuleBlobDrawable;
        if (z2 != z) {
            this.isMuted = z;
            this.muteDrawable.setCustomEndFrame(z ? 15 : 29);
            RLottieDrawable rLottieDrawable = this.muteDrawable;
            rLottieDrawable.setCurrentFrame(rLottieDrawable.customEndFrame - 1, false, true);
            this.muteButton.invalidate();
            Theme.getFragmentContextViewWavesDrawable().updateState(this.visible);
            capsuleBlobDrawable.updateState(this.visible);
        }
        if (this.isMuted) {
            this.micAmplitude = 0.0f;
            FragmentContextViewWavesDrawable fragmentContextViewWavesDrawable = Theme.getFragmentContextViewWavesDrawable();
            fragmentContextViewWavesDrawable.animateToAmplitude = 0.0f;
            float f = 0.0f - fragmentContextViewWavesDrawable.amplitude;
            fragmentContextViewWavesDrawable.animateAmplitudeDiff = f / 250.0f;
            fragmentContextViewWavesDrawable.animateAmplitudeDiff2 = f / 120.0f;
            capsuleBlobDrawable.setAmplitude(0.0f);
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        VoIPService.StateListener.CC.$default$onCameraFirstFrameAvailable(this);
    }

    @Override
    public final void onCameraSwitch(boolean z) {
        VoIPService.StateListener.CC.$default$onCameraSwitch(this, z);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.animatorSet = null;
        }
        if (this.scheduleRunnableScheduled) {
            AndroidUtilities.cancelRunOnUIThread(this.updateScheduleTimeRunnable);
            this.scheduleRunnableScheduled = false;
        }
        this.visible = false;
        this.notificationsLocker.unlock();
        this.topPadding = 0.0f;
        if (this.isLocation) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsCacheChanged);
        } else {
            for (int i = 0; i < 4; i++) {
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingDidReset);
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingDidStart);
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.groupCallUpdated);
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.groupCallTypingsUpdated);
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.historyImportProgressChanged);
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i).unsubscribeFromCallMessages(0L, this);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.messagePlayingSpeedChanged);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didStartedCall);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.groupCallVisibilityChanged);
        }
        int i2 = this.currentStyle;
        if (i2 == 3 || i2 == 1) {
            FragmentContextViewWavesDrawable fragmentContextViewWavesDrawable = Theme.getFragmentContextViewWavesDrawable();
            fragmentContextViewWavesDrawable.parents.remove(this);
            if (fragmentContextViewWavesDrawable.parents.isEmpty()) {
                fragmentContextViewWavesDrawable.pausedState = fragmentContextViewWavesDrawable.currentState;
                fragmentContextViewWavesDrawable.currentState = null;
                fragmentContextViewWavesDrawable.previousState = null;
            }
            CapsuleBlobDrawable capsuleBlobDrawable = this.capsuleBlobDrawable;
            if (capsuleBlobDrawable.running) {
                capsuleBlobDrawable.running = false;
                Choreographer60FpsContent.getInstance().removeFrameCallback(capsuleBlobDrawable.mInvalidateSelf);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.wasDraw = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, AndroidUtilities.dp2(getStyleHeight()));
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
        VoIPService.StateListener.CC.$default$onMediaStateUpdated(this, i, i2);
    }

    @Override
    public final void onNewGroupCallMessage(long j, GroupCallMessage groupCallMessage) {
        if (this.groupCallMessagesContainer == null) {
            return;
        }
        int i = this.currentStyle;
        if ((i == 1 || i == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j) {
            this.groupCallMessageCounter++;
            if (groupCallMessage.isOut()) {
                return;
            }
            this.callMessagesAnimator.replace(new CallMessageItem(this.groupCallMessagesContainer, groupCallMessage), true);
        }
    }

    @Override
    public final void onPopGroupCallMessage() {
        int i = this.groupCallMessageCounter;
        if (i > 0) {
            int i2 = i - 1;
            this.groupCallMessageCounter = i2;
            if (i2 == 0) {
                this.callMessagesAnimator.replace(null, true);
            }
        }
    }

    @Override
    public final void onScreenOnChange(boolean z) {
        VoIPService.StateListener.CC.$default$onScreenOnChange(this, z);
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
        VoIPService.StateListener.CC.$default$onSignalBarsCountChanged(this, i);
    }

    @Override
    public final void onStateChanged(int i) {
        updateCallTitle();
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
        VoIPService.StateListener.CC.$default$onVideoAvailableChange(this, z);
    }

    public final void openSharingLocation(LocationController.SharingLocationInfo sharingLocationInfo) {
        if (sharingLocationInfo != null) {
            BaseFragment baseFragment = this.fragment;
            if (baseFragment.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) baseFragment.getParentActivity();
                launchActivity.switchToAccount(sharingLocationInfo.messageObject.currentAccount);
                LocationActivity locationActivity = new LocationActivity(2);
                MessageObject messageObject = sharingLocationInfo.messageObject;
                locationActivity.messageObject = messageObject;
                locationActivity.dialogId = messageObject.getDialogId();
                locationActivity.delegate = new LaunchActivity$$ExternalSyntheticLambda112(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 4);
                launchActivity.presentFragment(locationActivity);
            }
        }
    }

    public final void playbackSpeedChanged(float f, float f2, boolean z) {
        String string;
        int i;
        if (equals$1(f, f2)) {
            return;
        }
        if (Math.abs(f2 - 1.0f) < 0.05f) {
            if (f < f2) {
                return;
            }
            string = LocaleController.getString(R.string.AudioSpeedNormal);
            if (Math.abs(f - 2.0f) < 0.05f) {
                i = R.raw.speed_2to1;
            } else {
                i = f2 < f ? R.raw.speed_slow : R.raw.speed_fast;
            }
        } else if (z && equals$1(f2, 1.5f) && equals$1(f, 1.0f)) {
            string = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, CanvasButton.AnonymousClass2.formatNumber(f2));
            i = R.raw.speed_1to15;
        } else if (z && equals$1(f2, 2.0f) && equals$1(f, 1.5f)) {
            string = LocaleController.getString(R.string.AudioSpeedFast);
            i = R.raw.speed_15to2;
        } else {
            string = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, CanvasButton.AnonymousClass2.formatNumber(f2));
            i = f2 < 1.0f ? R.raw.speed_slow : R.raw.speed_fast;
        }
        BulletinFactory.of(this.fragment).createSimpleBulletinWithIconSize(i, 36, string).show();
    }

    public void setDelegate(FragmentContextViewDelegate fragmentContextViewDelegate) {
        this.delegate = fragmentContextViewDelegate;
    }

    public void setDrawOverlay(boolean z) {
        this.drawOverlay = z;
    }

    public void setLeftMargin(float f) {
        if (this.frameLayout == null) {
            this.leftMargin = f;
            return;
        }
        ImageView imageView = this.playButton;
        if (imageView != null) {
            imageView.setTranslationX(f);
        }
        RLottieImageView rLottieImageView = this.importingImageView;
        if (rLottieImageView != null) {
            rLottieImageView.setTranslationX(f);
        }
        AnonymousClass4 anonymousClass4 = this.titleTextView;
        if (anonymousClass4 != null) {
            anonymousClass4.setTranslationX(f);
        }
        AnonymousClass4 anonymousClass5 = this.subtitleTextView;
        if (anonymousClass5 != null) {
            anonymousClass5.setTranslationX(f);
        }
        AvatarsImageView avatarsImageView = this.avatars;
        if (avatarsImageView != null) {
            avatarsImageView.setTranslationX(f);
        }
    }

    public void setSupportsCalls(boolean z) {
        this.supportsCalls = z;
    }

    public void setTopPadding(float f) {
        this.topPadding = f;
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        setTopPadding(this.topPadding);
        if (i == 8) {
            this.wasDraw = false;
        }
    }

    public final void startJoinFlickerAnimation() {
        CellFlickerDrawable cellFlickerDrawable = this.joinButtonFlicker;
        if (cellFlickerDrawable == null || cellFlickerDrawable.progress < 1.0f) {
            this.flickOnAttach = true;
        } else {
            this.flickOnAttach = false;
            AndroidUtilities.runOnUIThread(new FragmentContextView$$ExternalSyntheticLambda5(this, 0), 150L);
        }
    }

    public final void updateAvatars(boolean z) {
        ChatObject.Call groupCall;
        int account;
        TLRPC.User user;
        ValueAnimator valueAnimator;
        checkCreateView();
        if (!z && (valueAnimator = this.avatars.avatarsDrawable.transitionProgressAnimator) != null) {
            valueAnimator.cancel();
            this.avatars.avatarsDrawable.transitionProgressAnimator = null;
        }
        AvatarsDrawable avatarsDrawable = this.avatars.avatarsDrawable;
        if (avatarsDrawable.transitionProgressAnimator != null) {
            avatarsDrawable.updateAfterTransition = true;
            return;
        }
        int i = this.currentStyle;
        int currentAccount = this.account;
        ChatActivityInterface chatActivityInterface = this.chatActivity;
        if (i == 4) {
            if (chatActivityInterface != null) {
                groupCall = chatActivityInterface.getGroupCall();
                currentAccount = this.fragment.getCurrentAccount();
            } else {
                groupCall = null;
            }
            account = currentAccount;
            user = null;
        } else if (VoIPService.getSharedInstance() != null) {
            groupCall = VoIPService.getSharedInstance().groupCall;
            user = chatActivityInterface != null ? null : VoIPService.getSharedInstance().getUser();
            account = VoIPService.getSharedInstance().getAccount();
        } else {
            groupCall = null;
            account = currentAccount;
            user = null;
        }
        if (groupCall != null) {
            int size = groupCall.sortedParticipants.size();
            for (int i2 = 0; i2 < 3; i2++) {
                if (i2 < size) {
                    this.avatars.avatarsDrawable.setObject(i2, groupCall.sortedParticipants.get(i2), account);
                } else {
                    this.avatars.avatarsDrawable.setObject(i2, null, account);
                }
            }
        } else if (user != null) {
            this.avatars.avatarsDrawable.setObject(0, user, account);
            for (int i3 = 1; i3 < 3; i3++) {
                this.avatars.avatarsDrawable.setObject(i3, null, account);
            }
        } else {
            for (int i4 = 0; i4 < 3; i4++) {
                this.avatars.avatarsDrawable.setObject(i4, null, account);
            }
        }
        this.avatars.avatarsDrawable.commitTransition(z, true);
        if (this.currentStyle != 4 || groupCall == null) {
            return;
        }
        int iMin = groupCall.call.rtmp_stream ? 0 : Math.min(3, groupCall.sortedParticipants.size());
        int iM = (iMin == 0 ? 10 : zzkv.m(iMin, 1, 24, 52)) + 3;
        if (z) {
            int i5 = ((FrameLayout.LayoutParams) getLayoutParams()).leftMargin;
            float f = iM;
            if (AndroidUtilities.dp(f) != i5) {
                float translationX = (getTranslationX() + i5) - AndroidUtilities.dp(f);
                setTranslationX(translationX);
                setTranslationX(translationX);
                ViewPropertyAnimator duration = animate().translationX(0.0f).setDuration(220L);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                duration.setInterpolator(cubicBezierInterpolator);
                animate().translationX(0.0f).setDuration(220L).setInterpolator(cubicBezierInterpolator);
            }
        } else {
            animate().cancel();
            animate().cancel();
            setTranslationX(0.0f);
            setTranslationX(0.0f);
        }
        float f2 = iM;
        setLayoutParams(LayoutHelper.createFrame(-1, 20.0f, 51, f2, 5.0f, groupCall.isScheduled() ? 90 : 36, 0.0f));
        setLayoutParams(LayoutHelper.createFrame(-1, 20.0f, 51, f2, 25.0f, groupCall.isScheduled() ? 90 : 36, 0.0f));
    }

    public final void updateCallTitle() {
        ChatObject.Call call;
        checkCreateView();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i = this.currentStyle;
            if (i == 1 || i == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    setText(LocaleController.getString(R.string.VoipGroupConnecting), false);
                    return;
                }
                if (sharedInstance.isConference() && (call = sharedInstance.groupCall) != null) {
                    if (call.sortedParticipants.size() <= 1) {
                        setText(LocaleController.getString(R.string.ConferenceChat), false);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < Math.min(3, sharedInstance.groupCall.sortedParticipants.size()); i2++) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(DialogObject.getShortName(sharedInstance.getAccount(), DialogObject.getPeerDialogId(sharedInstance.groupCall.sortedParticipants.get(i2).peer)));
                    }
                    if (sharedInstance.groupCall.sortedParticipants.size() > 3) {
                        sb.append(" ");
                        sb.append(LocaleController.formatPluralString("AndOther", sharedInstance.groupCall.sortedParticipants.size() - 3, new Object[0]));
                    }
                    setText(sb.toString(), false);
                    return;
                }
                TLRPC.Chat chat = sharedInstance.getChat();
                ChatActivityInterface chatActivityInterface = this.chatActivity;
                if (chat == null) {
                    if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (chatActivityInterface == null || chatActivityInterface.getCurrentUser() == null || chatActivityInterface.getCurrentUser().id != user.id) {
                            setText(ContactsController.formatName(user.first_name, user.last_name));
                            return;
                        } else {
                            setText(LocaleController.getString(R.string.ReturnToCall));
                            return;
                        }
                    }
                    return;
                }
                if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                    setText(sharedInstance.groupCall.call.title, false);
                    return;
                }
                if (chatActivityInterface == null || chatActivityInterface.getCurrentChat() == null || chatActivityInterface.getCurrentChat().id != sharedInstance.getChat().id) {
                    setText(sharedInstance.getChat().title, false);
                    return;
                }
                TLRPC.Chat currentChat = chatActivityInterface.getCurrentChat();
                if (VoIPService.hasRtmpStream()) {
                    setText(LocaleController.getString(R.string.VoipChannelViewVoiceChat), false);
                } else if (ChatObject.isChannelOrGiga(currentChat)) {
                    setText(LocaleController.getString(R.string.VoipChannelViewVoiceChat), false);
                } else {
                    setText(LocaleController.getString(R.string.VoipGroupViewVoiceChat), false);
                }
            }
        }
    }

    public final void updateColors$1() {
        TypefaceSpan[] typefaceSpanArr;
        int i = !equals$1(MediaController.getInstance().getPlaybackSpeed(this.isMusic), 1.0f) ? Theme.key_featuredStickers_addButtonPressed : Theme.key_inappPlayerClose;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int color = Theme.getColor(i, resourcesProvider);
        CanvasButton.AnonymousClass2 anonymousClass2 = this.speedIcon;
        if (anonymousClass2 != null) {
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = (AnimatedTextView.AnimatedTextDrawable) anonymousClass2.this$0;
            animatedTextDrawable.textPaint.setColor(color);
            animatedTextDrawable.alpha = Color.alpha(color);
            Paint paint = (Paint) anonymousClass2.val$maskPaint2;
            if (paint != null) {
                paint.setColor(color);
            }
        }
        ActionBarMenuItem actionBarMenuItem = this.playbackSpeedButton;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setBackground(Theme.createSelectorDrawable(color & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        ImageView imageView = this.playButton;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_inappPlayerPlayPause, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.closeButton;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_inappPlayerClose, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        }
        if (this.subtitleTextView != null) {
            int i2 = 0;
            while (i2 < 2) {
                TextView textView = i2 == 0 ? getTextView() : getNextTextView();
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_inappPlayerClose, resourcesProvider));
                }
                i2++;
            }
        }
        AnonymousClass4 anonymousClass4 = this.titleTextView;
        if (anonymousClass4 != null) {
            Object tag = anonymousClass4.getTag();
            if (tag instanceof Integer) {
                int iIntValue = ((Integer) tag).intValue();
                int i3 = 0;
                while (i3 < 2) {
                    TextView textView2 = i3 == 0 ? getTextView() : getNextTextView();
                    if (textView2 != null) {
                        textView2.setTextColor(Theme.getColor(iIntValue, resourcesProvider));
                        CharSequence text = textView2.getText();
                        if ((text instanceof Spanned) && (typefaceSpanArr = (TypefaceSpan[]) ((Spanned) text).getSpans(0, text.length(), TypefaceSpan.class)) != null) {
                            for (TypefaceSpan typefaceSpan : typefaceSpanArr) {
                                typefaceSpan.color = Theme.getColor(Theme.key_inappPlayerPerformer, resourcesProvider);
                            }
                        }
                    }
                    i3++;
                }
            }
        }
    }

    public final void updatePlaybackButton$1(boolean z) {
        if (this.speedIcon == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.isMusic);
        CanvasButton.AnonymousClass2 anonymousClass2 = this.speedIcon;
        anonymousClass2.getClass();
        String str = CanvasButton.AnonymousClass2.formatNumber(playbackSpeed) + "X";
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = (AnimatedTextView.AnimatedTextDrawable) anonymousClass2.this$0;
        if (!z || !TextUtils.equals(animatedTextDrawable.currentText, str)) {
            animatedTextDrawable.cancelAnimation();
            animatedTextDrawable.setText(str, z, true);
            anonymousClass2.invalidateSelf();
        }
        updateColors$1();
        boolean z2 = this.slidingSpeed;
        int i = 0;
        this.slidingSpeed = false;
        while (true) {
            ActionBarMenuItem.Item[] itemArr = this.speedItems;
            if (i >= itemArr.length) {
                this.speedSlider.setSpeed(playbackSpeed, z);
                return;
            }
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (z2 || Math.abs(playbackSpeed - speeds[i]) >= 0.05f) {
                ActionBarMenuItem.Item item = itemArr[i];
                int i2 = Theme.key_actionBarDefaultSubmenuItem;
                item.setColors(Theme.getColor(i2, resourcesProvider), Theme.getColor(i2, resourcesProvider));
            } else {
                ActionBarMenuItem.Item item2 = itemArr[i];
                int i3 = Theme.key_featuredStickers_addButtonPressed;
                item2.setColors(Theme.getColor(i3, resourcesProvider), Theme.getColor(i3, resourcesProvider));
            }
            i++;
        }
    }

    public final void updateStyle(int i) {
        if (this.currentStyle == i) {
            return;
        }
        checkCreateView();
        int i2 = this.currentStyle;
        CapsuleBlobDrawable capsuleBlobDrawable = this.capsuleBlobDrawable;
        if (i2 == 3 || i2 == 1) {
            FragmentContextViewWavesDrawable fragmentContextViewWavesDrawable = Theme.getFragmentContextViewWavesDrawable();
            fragmentContextViewWavesDrawable.parents.remove(this);
            if (fragmentContextViewWavesDrawable.parents.isEmpty()) {
                fragmentContextViewWavesDrawable.pausedState = fragmentContextViewWavesDrawable.currentState;
                fragmentContextViewWavesDrawable.currentState = null;
                fragmentContextViewWavesDrawable.previousState = null;
            }
            if (capsuleBlobDrawable.running) {
                capsuleBlobDrawable.running = false;
                Choreographer60FpsContent.getInstance().removeFrameCallback(capsuleBlobDrawable.mInvalidateSelf);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
            ReplaceAnimator replaceAnimator = this.callMessagesAnimator;
            if (replaceAnimator != null) {
                replaceAnimator.replace(null, true);
            }
        }
        this.currentStyle = i;
        this.frameLayout.setWillNotDraw(i != 4);
        if (i != 4) {
            this.notifyButtonEnabled = false;
        }
        AvatarsImageView avatarsImageView = this.avatars;
        if (avatarsImageView != null) {
            avatarsImageView.setStyle(this.currentStyle);
            this.avatars.setLayoutParams(LayoutHelper.createFrame(108, getStyleHeight(), 51));
        }
        this.frameLayout.setLayoutParams(LayoutHelper.createFrame(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
        float f = this.topPadding;
        if (f > 0.0f && f != AndroidUtilities.dp2(getStyleHeight())) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (i == 6) {
            this.selector.setBackground(Theme.getSelectorDrawable(false));
            this.frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.getColor(Theme.key_stories_circle_live1, resourcesProvider), Theme.getColor(Theme.key_stories_circle_live2, resourcesProvider)}));
            this.frameLayout.setTag(null);
            setVisibility(8);
            this.joinButton.setVisibility(8);
            this.closeButton.setVisibility(8);
            this.playButton.setVisibility(8);
            this.muteButton.setVisibility(8);
            this.importingImageView.setVisibility(8);
            this.importingImageView.stopAnimation();
            this.avatars.setVisibility(8);
            setTag(Integer.valueOf(Theme.key_returnToCallText));
            int i3 = 0;
            while (i3 < 2) {
                TextView textView = i3 == 0 ? getTextView() : getNextTextView();
                if (textView != null) {
                    textView.setGravity(19);
                    textView.setTextColor(Theme.getColor(Theme.key_returnToCallText, resourcesProvider));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextSize(1, 15.0f);
                }
                i3++;
            }
            setLayoutParams(LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            return;
        }
        if (i == 5) {
            this.selector.setBackground(Theme.getSelectorDrawable(false));
            this.frameLayout.setBackgroundColor(0);
            this.frameLayout.setTag(Integer.valueOf(Theme.key_inappPlayerBackground));
            int i4 = 0;
            while (i4 < 2) {
                TextView textView2 = i4 == 0 ? getTextView() : getNextTextView();
                if (textView2 != null) {
                    textView2.setGravity(19);
                    textView2.setTextColor(Theme.getColor(Theme.key_inappPlayerTitle, resourcesProvider));
                    textView2.setTypeface(Typeface.DEFAULT);
                    textView2.setTextSize(1, 15.0f);
                }
                i4++;
            }
            setTag(Integer.valueOf(Theme.key_inappPlayerTitle));
            setVisibility(8);
            this.joinButton.setVisibility(8);
            this.closeButton.setVisibility(8);
            this.playButton.setVisibility(8);
            this.muteButton.setVisibility(8);
            this.avatars.setVisibility(8);
            this.importingImageView.setVisibility(0);
            this.importingImageView.playAnimation();
            this.closeButton.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
            ActionBarMenuItem actionBarMenuItem = this.playbackSpeedButton;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(8);
                this.playbackSpeedButton.setTag(null);
            }
            setLayoutParams(LayoutHelper.createFrame(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            return;
        }
        if (i == 0 || i == 2) {
            this.selector.setBackground(Theme.getSelectorDrawable(false));
            this.frameLayout.setBackgroundColor(0);
            this.frameLayout.setTag(Integer.valueOf(Theme.key_inappPlayerBackground));
            setVisibility(8);
            this.joinButton.setVisibility(8);
            this.closeButton.setVisibility(0);
            this.playButton.setVisibility(0);
            this.muteButton.setVisibility(8);
            this.importingImageView.setVisibility(8);
            this.importingImageView.stopAnimation();
            this.avatars.setVisibility(8);
            int i5 = 0;
            while (i5 < 2) {
                TextView textView3 = i5 == 0 ? getTextView() : getNextTextView();
                if (textView3 != null) {
                    textView3.setGravity(19);
                    textView3.setTextColor(Theme.getColor(Theme.key_inappPlayerTitle, resourcesProvider));
                    textView3.setTypeface(Typeface.DEFAULT);
                    textView3.setTextSize(1, 15.0f);
                }
                i5++;
            }
            setTag(Integer.valueOf(Theme.key_inappPlayerTitle));
            if (i == 6) {
                this.playButton.setLayoutParams(LayoutHelper.createFrame(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                setLayoutParams(LayoutHelper.createFrame(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                this.closeButton.setVisibility(8);
                return;
            } else {
                if (i != 0) {
                    this.playButton.setLayoutParams(LayoutHelper.createFrame(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    setLayoutParams(LayoutHelper.createFrame(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.closeButton.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                    return;
                }
                this.playButton.setLayoutParams(LayoutHelper.createFrame(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                setLayoutParams(LayoutHelper.createFrame(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                createPlaybackSpeedButton();
                ActionBarMenuItem actionBarMenuItem2 = this.playbackSpeedButton;
                if (actionBarMenuItem2 != null) {
                    actionBarMenuItem2.setVisibility(0);
                    this.playbackSpeedButton.setTag(1);
                }
                this.closeButton.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                return;
            }
        }
        if (i == 4) {
            this.selector.setBackground(Theme.getSelectorDrawable(false));
            this.frameLayout.setBackgroundColor(0);
            this.frameLayout.setTag(Integer.valueOf(Theme.key_inappPlayerBackground));
            this.muteButton.setVisibility(8);
            setVisibility(0);
            int i6 = 0;
            while (i6 < 2) {
                TextView textView4 = i6 == 0 ? getTextView() : getNextTextView();
                if (textView4 != null) {
                    textView4.setGravity(51);
                    textView4.setTextColor(Theme.getColor(Theme.key_inappPlayerPerformer, resourcesProvider));
                    textView4.setTypeface(AndroidUtilities.bold());
                    textView4.setTextSize(1, 15.0f);
                }
                i6++;
            }
            setTag(Integer.valueOf(Theme.key_inappPlayerPerformer));
            setPadding(0, 0, this.joinButtonWidth, 0);
            this.importingImageView.setVisibility(8);
            this.importingImageView.stopAnimation();
            ChatActivityInterface chatActivityInterface = this.chatActivity;
            this.avatars.setVisibility(!((chatActivityInterface == null || chatActivityInterface.getGroupCall() == null || chatActivityInterface.getGroupCall().call == null || !chatActivityInterface.getGroupCall().call.rtmp_stream) ? false : true) ? 0 : 8);
            if (this.avatars.getVisibility() != 8) {
                updateAvatars(false);
            } else {
                setTranslationX(-AndroidUtilities.dp(36.0f));
                setTranslationX(-AndroidUtilities.dp(36.0f));
            }
            this.closeButton.setVisibility(8);
            this.playButton.setVisibility(8);
            ActionBarMenuItem actionBarMenuItem3 = this.playbackSpeedButton;
            if (actionBarMenuItem3 != null) {
                actionBarMenuItem3.setVisibility(8);
                this.playbackSpeedButton.setTag(null);
                return;
            }
            return;
        }
        if (i == 1 || i == 3) {
            this.selector.setBackground(null);
            updateCallTitle();
            boolean zHasRtmpStream = VoIPService.hasRtmpStream();
            this.avatars.setVisibility(!zHasRtmpStream ? 0 : 8);
            if (i == 3 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (this.avatars.getVisibility() != 8) {
                updateAvatars(false);
            } else {
                setTranslationX(0.0f);
                setTranslationX(0.0f);
            }
            this.muteButton.setVisibility(!zHasRtmpStream ? 0 : 8);
            boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            this.isMuted = z;
            this.muteDrawable.setCustomEndFrame(z ? 15 : 29);
            RLottieDrawable rLottieDrawable = this.muteDrawable;
            rLottieDrawable.setCurrentFrame(rLottieDrawable.customEndFrame - 1, false, true);
            this.muteButton.invalidate();
            this.frameLayout.setBackground(null);
            this.frameLayout.setBackgroundColor(0);
            this.importingImageView.setVisibility(8);
            this.importingImageView.stopAnimation();
            FragmentContextViewWavesDrawable fragmentContextViewWavesDrawable2 = Theme.getFragmentContextViewWavesDrawable();
            if (!fragmentContextViewWavesDrawable2.parents.contains(this)) {
                fragmentContextViewWavesDrawable2.parents.add(this);
            }
            if (!capsuleBlobDrawable.running) {
                capsuleBlobDrawable.running = true;
                capsuleBlobDrawable.lastFrameTime = SystemClock.elapsedRealtime();
                Choreographer60FpsContent.getInstance().addFrameCallback(60, capsuleBlobDrawable.mInvalidateSelf);
            }
            invalidate();
            int i7 = 0;
            while (i7 < 2) {
                TextView textView5 = i7 == 0 ? getTextView() : getNextTextView();
                if (textView5 != null) {
                    textView5.setGravity(19);
                    textView5.setTextColor(Theme.getColor(Theme.key_returnToCallText, resourcesProvider));
                    textView5.setTypeface(AndroidUtilities.bold());
                    textView5.setTextSize(1, 14.0f);
                }
                i7++;
            }
            setTag(Integer.valueOf(Theme.key_returnToCallText));
            this.closeButton.setVisibility(8);
            this.playButton.setVisibility(8);
            setVisibility(8);
            this.joinButton.setVisibility(8);
            setLayoutParams(LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
            setPadding(AndroidUtilities.dp(88.0f), 0, AndroidUtilities.dp(88.0f) + this.joinButtonWidth, 0);
            ActionBarMenuItem actionBarMenuItem4 = this.playbackSpeedButton;
            if (actionBarMenuItem4 != null) {
                actionBarMenuItem4.setVisibility(8);
                this.playbackSpeedButton.setTag(null);
            }
        }
    }
}
