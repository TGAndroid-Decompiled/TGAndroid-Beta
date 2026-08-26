package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DiffUtil;
import com.google.firebase.messaging.GmsRpc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.audioinfo.mp3.ID3v1Genre$EnumUnboxingLocalUtility;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.PhotoViewer$41$1;
import org.telegram.ui.QrActivity;

public final class VoIpSwitchLayout extends FrameLayout {
    public int animationDelay;
    public final VoIPBackgroundProvider backgroundProvider;
    public final TextView currentTextView;
    public final TextView newTextView;
    public int type;
    public VoIpButtonView voIpButtonView;

    public final class VoIpButtonView extends View {
        public ValueAnimator animator;
        public final VoIPBackgroundProvider backgroundProvider;
        public final Path clipPath;
        public final Paint darkPaint;
        public boolean isSelectedState;
        public final Paint maskPaint;
        public final int maxRadius;
        public OnBtnClickedListener onBtnClickedListener;
        public float pressedScale;
        public ValueAnimator pressedScaleAnimator;
        public RLottieDrawable selectedIcon;
        public int selectedRadius;
        public RLottieDrawable singleIcon;
        public int singleIconBackgroundAlphaPercent;
        public float startX;
        public float startY;
        public RLottieDrawable unSelectedIcon;
        public int unselectedRadius;
        public final Paint whiteCirclePaint;

        public interface OnBtnClickedListener {
            void onClicked(VoIpButtonView voIpButtonView);
        }

        public VoIpButtonView(Context context, VoIPBackgroundProvider voIPBackgroundProvider) {
            super(context);
            Paint paint = new Paint(1);
            this.maskPaint = paint;
            Paint paint2 = new Paint(1);
            this.whiteCirclePaint = paint2;
            Paint paint3 = new Paint(1);
            this.darkPaint = paint3;
            this.clipPath = new Path();
            int iDp = AndroidUtilities.dp(26.0f);
            this.maxRadius = iDp;
            this.unselectedRadius = iDp;
            this.selectedRadius = 0;
            this.isSelectedState = false;
            this.singleIconBackgroundAlphaPercent = 0;
            this.pressedScale = 1.0f;
            this.backgroundProvider = voIPBackgroundProvider;
            voIPBackgroundProvider.views.add(this);
            setLayerType(1, null);
            paint2.setColor(-1);
            paint.setColor(-16777216);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            paint3.setColor(-16777216);
            paint3.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
            paint3.setAlpha(35);
        }

        private void setPressedBtn(boolean z) {
            ValueAnimator valueAnimator = this.pressedScaleAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.pressedScale, z ? 0.8f : 1.0f);
            this.pressedScaleAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new VoIpSwitchLayout$VoIpButtonView$$ExternalSyntheticLambda0(this, 0));
            this.pressedScaleAnimator.setDuration(150L);
            this.pressedScaleAnimator.start();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int i;
            canvas.save();
            float f = this.pressedScale;
            canvas.scale(f, f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            float x = ((View) getParent()).getX() + getX();
            float y = ((View) ((View) getParent()).getParent()).getY() + getY();
            VoIPBackgroundProvider voIPBackgroundProvider = this.backgroundProvider;
            float f2 = voIPBackgroundProvider.totalHeight * 1.12f;
            GmsRpc gmsRpc = voIPBackgroundProvider.lightShaderTools;
            float height2 = f2 / ((Bitmap) gmsRpc.rpc).getHeight();
            float f3 = voIPBackgroundProvider.totalHeight;
            float f4 = 1.12f * f3;
            float f5 = (f4 - voIPBackgroundProvider.totalWidth) / 2.0f;
            float f6 = (f4 - f3) / 2.0f;
            float f7 = -x;
            float f8 = -y;
            float f9 = voIPBackgroundProvider.degree;
            Matrix matrix = (Matrix) gmsRpc.firebaseInstallations;
            matrix.reset();
            Bitmap bitmap = (Bitmap) gmsRpc.rpc;
            matrix.postRotate(f9, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
            matrix.postScale(height2, height2);
            matrix.postTranslate(f7 - f5, f8 - f6);
            ((BitmapShader) gmsRpc.heartbeatInfo).setLocalMatrix(matrix);
            voIPBackgroundProvider.revealShaderTools.setBounds(f7, f8, voIPBackgroundProvider.totalWidth - x, voIPBackgroundProvider.totalHeight - y);
            RLottieDrawable rLottieDrawable = this.singleIcon;
            Paint paint = this.whiteCirclePaint;
            Paint paint2 = this.maskPaint;
            Paint paint3 = voIPBackgroundProvider.whiteVideoPaint;
            int i2 = this.maxRadius;
            if (rLottieDrawable != null) {
                int i3 = this.singleIconBackgroundAlphaPercent;
                if (i3 > 20) {
                    Paint paint4 = this.darkPaint;
                    paint4.setAlpha((int) ((i3 * 35) / 100.0f));
                    paint.setAlpha((int) ((this.singleIconBackgroundAlphaPercent * 255) / 100.0f));
                    canvas.drawCircle(width, height, i2, paint);
                    this.singleIcon.drawInternal(canvas, paint2, false, 0L, 0);
                    this.singleIcon.drawInternal(canvas, paint4, false, 0L, 0);
                    return;
                }
                float f10 = i2;
                if (!voIPBackgroundProvider.hasVideo) {
                    paint3 = (Paint) gmsRpc.app;
                }
                canvas.drawCircle(width, height, f10, paint3);
                if (voIPBackgroundProvider.isReveal) {
                    canvas.drawCircle(width, height, f10, (Paint) voIPBackgroundProvider.revealShaderTools.app);
                }
                this.singleIcon.draw(canvas);
                return;
            }
            if (this.selectedIcon == null || this.unSelectedIcon == null) {
                return;
            }
            int i4 = this.unselectedRadius;
            boolean z = i4 == i2 && this.selectedRadius == 0;
            int i5 = this.selectedRadius;
            boolean z2 = i5 == i2 && i4 == 0;
            Path path = this.clipPath;
            if (i5 != i2 || i4 <= 0 || i4 == i2) {
                i = i2;
            } else {
                canvas.drawCircle(width, height, i5, paint);
                canvas.drawCircle(width, height, this.unselectedRadius, paint2);
                this.selectedIcon.setAlpha(255);
                i = i2;
                this.selectedIcon.drawInternal(canvas, paint2, false, 0L, 0);
                this.selectedIcon.setAlpha(35);
                this.selectedIcon.draw(canvas);
                path.reset();
                path.addCircle(width, height, this.unselectedRadius, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.unselectedRadius, paint2);
            }
            if (z || this.unselectedRadius > 0) {
                path = path;
                path = path;
                float f11 = this.unselectedRadius;
                if (!voIPBackgroundProvider.hasVideo) {
                    paint3 = (Paint) gmsRpc.app;
                }
                canvas.drawCircle(width, height, f11, paint3);
                if (voIPBackgroundProvider.isReveal) {
                    canvas.drawCircle(width, height, this.unselectedRadius, (Paint) voIPBackgroundProvider.revealShaderTools.app);
                }
                this.unSelectedIcon.draw(canvas);
            }
            if (z2 || (this.selectedRadius > 0 && this.unselectedRadius == i)) {
                path.reset();
                path.addCircle(width, height, this.selectedRadius, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.selectedRadius, paint);
                this.selectedIcon.setAlpha(255);
                this.selectedIcon.drawInternal(canvas, paint2, false, 0L, 0);
                this.selectedIcon.setAlpha(35);
                this.selectedIcon.draw(canvas);
            }
            canvas.restore();
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            OnBtnClickedListener onBtnClickedListener;
            int action = motionEvent.getAction();
            if (action == 0) {
                setPressedBtn(true);
                this.startX = motionEvent.getX();
                this.startY = motionEvent.getY();
                return true;
            }
            boolean z = false;
            if (action == 1) {
                setPressedBtn(false);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float f = this.startX;
                float f2 = this.startY;
                float fAbs = Math.abs(f - x);
                float fAbs2 = Math.abs(f2 - y);
                if (fAbs <= AndroidUtilities.dp(48.0f) && fAbs2 <= AndroidUtilities.dp(48.0f)) {
                    int i = this.unselectedRadius;
                    int i2 = this.maxRadius;
                    boolean z2 = i == i2 && this.selectedRadius == 0;
                    if (this.selectedRadius == i2 && i == 0) {
                        z = true;
                    }
                    if ((z2 || z) && (onBtnClickedListener = this.onBtnClickedListener) != null) {
                        onBtnClickedListener.onClicked(this);
                    }
                }
            } else if (action == 3) {
                setPressedBtn(false);
                return true;
            }
            return true;
        }

        public void setOnBtnClickedListener(OnBtnClickedListener onBtnClickedListener) {
            this.onBtnClickedListener = onBtnClickedListener;
        }

        public final void setSelectedState(int i, boolean z, boolean z2) {
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.animator.removeAllUpdateListeners();
                this.animator.cancel();
                z2 = false;
            }
            int i2 = this.maxRadius;
            if (z2) {
                if (this.singleIcon != null) {
                    ValueAnimator valueAnimator2 = this.animator;
                    if (valueAnimator2 != null) {
                        valueAnimator2.removeAllUpdateListeners();
                        this.animator.cancel();
                    }
                    ValueAnimator valueAnimatorOfInt = z ? ValueAnimator.ofInt(20, 100) : ValueAnimator.ofInt(100, 20);
                    this.animator = valueAnimatorOfInt;
                    valueAnimatorOfInt.addUpdateListener(new VoIpSwitchLayout$VoIpButtonView$$ExternalSyntheticLambda0(this, 1));
                    this.animator.setDuration(200L);
                    this.animator.start();
                    if (i == 2) {
                        this.singleIcon.setCurrentFrame(0, false, false);
                        this.singleIcon.start();
                    }
                } else {
                    ValueAnimator valueAnimator3 = this.animator;
                    if (valueAnimator3 != null) {
                        valueAnimator3.removeAllUpdateListeners();
                        this.animator.cancel();
                    }
                    ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, i2);
                    this.animator = valueAnimatorOfInt2;
                    if (z) {
                        this.unselectedRadius = i2;
                        valueAnimatorOfInt2.addUpdateListener(new VoIpSwitchLayout$VoIpButtonView$$ExternalSyntheticLambda0(this, 2));
                        final int i3 = 0;
                        this.animator.addListener(new AnimatorListenerAdapter(this) {
                            public final VoIpButtonView this$0;

                            {
                                this.this$0 = this;
                            }

                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                switch (i3) {
                                    case 0:
                                        VoIpButtonView voIpButtonView = this.this$0;
                                        voIpButtonView.unselectedRadius = 0;
                                        voIpButtonView.invalidate();
                                        break;
                                    default:
                                        VoIpButtonView voIpButtonView2 = this.this$0;
                                        voIpButtonView2.selectedRadius = 0;
                                        voIpButtonView2.invalidate();
                                        break;
                                }
                            }
                        });
                        this.animator.setDuration(200L);
                        this.animator.start();
                        this.selectedIcon.setCurrentFrame(0, false, false);
                        this.selectedIcon.start();
                    } else {
                        this.selectedRadius = i2;
                        valueAnimatorOfInt2.addUpdateListener(new VoIpSwitchLayout$VoIpButtonView$$ExternalSyntheticLambda0(this, 3));
                        this.animator.setDuration(200L);
                        final int i4 = 1;
                        this.animator.addListener(new AnimatorListenerAdapter(this) {
                            public final VoIpButtonView this$0;

                            {
                                this.this$0 = this;
                            }

                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                switch (i4) {
                                    case 0:
                                        VoIpButtonView voIpButtonView = this.this$0;
                                        voIpButtonView.unselectedRadius = 0;
                                        voIpButtonView.invalidate();
                                        break;
                                    default:
                                        VoIpButtonView voIpButtonView2 = this.this$0;
                                        voIpButtonView2.selectedRadius = 0;
                                        voIpButtonView2.invalidate();
                                        break;
                                }
                            }
                        });
                        this.animator.start();
                    }
                }
            } else if (z) {
                this.selectedRadius = i2;
                this.unselectedRadius = 0;
                this.singleIconBackgroundAlphaPercent = 100;
                if (i == 3 || i == 1) {
                    RLottieDrawable rLottieDrawable = this.selectedIcon;
                    rLottieDrawable.setCurrentFrame(rLottieDrawable.metaData[0] - 1, false, false);
                }
            } else {
                this.selectedRadius = 0;
                this.unselectedRadius = i2;
                this.singleIconBackgroundAlphaPercent = 20;
            }
            this.isSelectedState = z;
            invalidate();
        }
    }

    public VoIpSwitchLayout(Activity activity, VoIPBackgroundProvider voIPBackgroundProvider) {
        super(activity);
        this.backgroundProvider = voIPBackgroundProvider;
        setWillNotDraw(true);
        VoIpButtonView voIpButtonView = new VoIpButtonView(activity, voIPBackgroundProvider);
        this.voIpButtonView = voIpButtonView;
        addView(voIpButtonView, new FrameLayout.LayoutParams(LayoutHelper.getSize(53.5f), LayoutHelper.getSize(53.5f), 1));
        TextView textView = new TextView(activity);
        this.currentTextView = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.newTextView = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void attachBtToSpeaker(int i) {
        VoIpButtonView voIpButtonView = this.voIpButtonView;
        int i2 = R.raw.bt_to_speaker;
        voIpButtonView.unSelectedIcon = new RLottieDrawable(i2, SurfaceContainer$$ExternalSyntheticOutline0.m(i2, ""), i, i, true, null);
        this.voIpButtonView.selectedIcon = new RLottieDrawable(i2, SurfaceContainer$$ExternalSyntheticOutline0.m(i2, ""), i, i, true, null);
        this.voIpButtonView.selectedIcon.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void attachNewButton(int i, int i2, int i3, boolean z) {
        VoIpButtonView voIpButtonView = new VoIpButtonView(getContext(), this.backgroundProvider);
        if (i == R.raw.camera_flip2) {
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, DiffUtil.m(i, ""), i2, i2, true, null);
            voIpButtonView.singleIcon = rLottieDrawable;
            rLottieDrawable.masterParent = voIpButtonView;
        } else {
            voIpButtonView.unSelectedIcon = new RLottieDrawable(i, DiffUtil.m(i, ""), i2, i2, true, null);
            RLottieDrawable rLottieDrawable2 = new RLottieDrawable(i, DiffUtil.m(i, ""), i2, i2, true, null);
            voIpButtonView.selectedIcon = rLottieDrawable2;
            rLottieDrawable2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        voIpButtonView.setSelectedState(i3, z, false);
        voIpButtonView.setAlpha(0.0f);
        voIpButtonView.setOnBtnClickedListener(this.voIpButtonView.onBtnClickedListener);
        addView(voIpButtonView, new FrameLayout.LayoutParams(LayoutHelper.getSize(53.5f), LayoutHelper.getSize(53.5f), 1));
        VoIpButtonView voIpButtonView2 = this.voIpButtonView;
        this.voIpButtonView = voIpButtonView;
        voIpButtonView.animate().alpha(1.0f).setDuration(250L).start();
        voIpButtonView2.animate().alpha(0.0f).setDuration(250L).setListener(new QrActivity.AnonymousClass4(4, this, voIpButtonView2)).start();
    }

    public final void attachSpeakerToBt(int i) {
        VoIpButtonView voIpButtonView = this.voIpButtonView;
        int i2 = R.raw.speaker_to_bt;
        voIpButtonView.unSelectedIcon = new RLottieDrawable(i2, SurfaceContainer$$ExternalSyntheticOutline0.m(i2, ""), i, i, true, null);
        this.voIpButtonView.selectedIcon = new RLottieDrawable(i2, SurfaceContainer$$ExternalSyntheticOutline0.m(i2, ""), i, i, true, null);
        this.voIpButtonView.selectedIcon.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public void setOnBtnClickedListener(VoIpButtonView.OnBtnClickedListener onBtnClickedListener) {
        this.voIpButtonView.setOnBtnClickedListener(onBtnClickedListener);
    }

    public final void setType(int i, boolean z, boolean z2) {
        int i2;
        int iOrdinal;
        CharSequence string;
        TextView textView;
        int visibility;
        TextView textView2;
        boolean z3;
        boolean z4;
        if (this.type == i && z == this.voIpButtonView.isSelectedState) {
            if (getVisibility() != 0) {
                setVisibility(0);
                return;
            }
            return;
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        int iDp = AndroidUtilities.dp(53.5f);
        int iOrdinal2 = ID3v1Genre$EnumUnboxingLocalUtility.ordinal(i);
        String str = "";
        boolean z5 = true;
        if (iOrdinal2 != 0) {
            if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 == 3) {
                        int i3 = this.type;
                        if (i3 == 5) {
                            VoIpButtonView voIpButtonView = this.voIpButtonView;
                            z4 = z == voIpButtonView.isSelectedState;
                            RLottieDrawable rLottieDrawable = z ? voIpButtonView.selectedIcon : voIpButtonView.unSelectedIcon;
                            rLottieDrawable.masterParent = voIpButtonView;
                            rLottieDrawable.onAnimationEndListener = new VoIpSwitchLayout$$ExternalSyntheticLambda0(this, iDp, 1);
                            rLottieDrawable.start();
                            z5 = z4;
                            i2 = 1;
                        } else if (i3 == 2) {
                            attachNewButton(R.raw.bt_to_speaker, iDp, i, z);
                            i2 = 1;
                        } else if (i3 != 4) {
                            attachBtToSpeaker(iDp);
                        }
                    } else if (iOrdinal2 == 4) {
                        int i4 = this.type;
                        if (i4 == 4) {
                            VoIpButtonView voIpButtonView2 = this.voIpButtonView;
                            z4 = z == voIpButtonView2.isSelectedState;
                            RLottieDrawable rLottieDrawable2 = z ? voIpButtonView2.selectedIcon : voIpButtonView2.unSelectedIcon;
                            rLottieDrawable2.masterParent = voIpButtonView2;
                            rLottieDrawable2.onAnimationEndListener = new VoIpSwitchLayout$$ExternalSyntheticLambda0(this, iDp, 0);
                            rLottieDrawable2.start();
                            z5 = z4;
                            i2 = 1;
                        } else if (i4 == 2) {
                            attachNewButton(R.raw.speaker_to_bt, iDp, i, z);
                            i2 = 1;
                        } else if (i4 != 5) {
                            attachSpeakerToBt(iDp);
                        }
                    }
                } else if (this.type != 3) {
                    VoIpButtonView voIpButtonView3 = this.voIpButtonView;
                    int i5 = R.raw.video_stop;
                    str = "";
                    i2 = 1;
                    voIpButtonView3.unSelectedIcon = new RLottieDrawable(i5, SurfaceContainer$$ExternalSyntheticOutline0.m(i5, ""), iDp, iDp, true, null);
                    this.voIpButtonView.selectedIcon = new RLottieDrawable(i5, SurfaceContainer$$ExternalSyntheticOutline0.m(i5, str), iDp, iDp, true, null);
                    this.voIpButtonView.selectedIcon.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                    VoIpButtonView voIpButtonView4 = this.voIpButtonView;
                    voIpButtonView4.selectedIcon.masterParent = voIpButtonView4;
                }
                str = "";
                i2 = 1;
            } else {
                str = "";
                i2 = 1;
                int i6 = this.type;
                if (i6 == 5 || i6 == 4) {
                    attachNewButton(R.raw.camera_flip2, iDp, i, z);
                    z5 = true;
                } else if (i6 != 2) {
                    VoIpButtonView voIpButtonView5 = this.voIpButtonView;
                    int i7 = R.raw.camera_flip2;
                    voIpButtonView5.singleIcon = new RLottieDrawable(i7, SurfaceContainer$$ExternalSyntheticOutline0.m(i7, str), iDp, iDp, true, null);
                    VoIpButtonView voIpButtonView6 = this.voIpButtonView;
                    voIpButtonView6.singleIcon.masterParent = voIpButtonView6;
                }
            }
            if (!z5) {
                VoIpButtonView voIpButtonView7 = this.voIpButtonView;
                if (this.type != 0 || z2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                voIpButtonView7.setSelectedState(i, z, z3);
            }
            iOrdinal = ID3v1Genre$EnumUnboxingLocalUtility.ordinal(i);
            if (iOrdinal != 0) {
                if (iOrdinal != i2) {
                    string = LocaleController.getString(R.string.VoipFlip);
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        string = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                    } else if (iOrdinal != 4) {
                        string = str;
                    } else {
                        string = LocaleController.getString(R.string.VoipSpeaker);
                    }
                } else if (z) {
                    string = LocaleController.getString(R.string.VoipStartVideo);
                } else {
                    string = LocaleController.getString(R.string.VoipStopVideo);
                }
            } else if (z) {
                string = LocaleController.getString(R.string.VoipUnmute);
            } else {
                string = LocaleController.getString(R.string.VoipMute);
            }
            setContentDescription(string);
            textView = this.currentTextView;
            visibility = textView.getVisibility();
            textView2 = this.newTextView;
            if (visibility != 8 && textView2.getVisibility() == 8) {
                textView.setVisibility(0);
                textView.setText(string);
                textView2.setText(string);
            } else if (textView2.getText().equals(string) || !textView.getText().equals(string)) {
                textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new QrActivity.AnonymousClass4(3, this, string)).start();
                textView2.setText(string);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(AndroidUtilities.dp(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new PhotoViewer$41$1(this, 4)).start();
            }
            this.type = i;
        }
        str = "";
        i2 = 1;
        if (this.type != 1) {
            VoIpButtonView voIpButtonView8 = this.voIpButtonView;
            int i8 = R.raw.call_mute;
            voIpButtonView8.unSelectedIcon = new RLottieDrawable(i8, SurfaceContainer$$ExternalSyntheticOutline0.m(i8, str), iDp, iDp, true, null);
            this.voIpButtonView.selectedIcon = new RLottieDrawable(i8, SurfaceContainer$$ExternalSyntheticOutline0.m(i8, str), iDp, iDp, true, null);
            this.voIpButtonView.selectedIcon.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            VoIpButtonView voIpButtonView9 = this.voIpButtonView;
            voIpButtonView9.selectedIcon.masterParent = voIpButtonView9;
        }
        z5 = false;
        if (!z5) {
            VoIpButtonView voIpButtonView10 = this.voIpButtonView;
            if (this.type != 0) {
                z3 = false;
            } else {
                z3 = false;
            }
            voIpButtonView10.setSelectedState(i, z, z3);
        }
        iOrdinal = ID3v1Genre$EnumUnboxingLocalUtility.ordinal(i);
        if (iOrdinal != 0) {
            if (iOrdinal != i2) {
                string = LocaleController.getString(R.string.VoipFlip);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    string = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                } else if (iOrdinal != 4) {
                    string = str;
                } else {
                    string = LocaleController.getString(R.string.VoipSpeaker);
                }
            } else if (z) {
                string = LocaleController.getString(R.string.VoipStartVideo);
            } else {
                string = LocaleController.getString(R.string.VoipStopVideo);
            }
        } else if (z) {
            string = LocaleController.getString(R.string.VoipUnmute);
        } else {
            string = LocaleController.getString(R.string.VoipMute);
        }
        setContentDescription(string);
        textView = this.currentTextView;
        visibility = textView.getVisibility();
        textView2 = this.newTextView;
        if (visibility != 8) {
            if (textView2.getText().equals(string)) {
                textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new QrActivity.AnonymousClass4(3, this, string)).start();
                textView2.setText(string);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(AndroidUtilities.dp(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new PhotoViewer$41$1(this, 4)).start();
            } else {
                textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new QrActivity.AnonymousClass4(3, this, string)).start();
                textView2.setText(string);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(AndroidUtilities.dp(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new PhotoViewer$41$1(this, 4)).start();
            }
        } else if (textView2.getText().equals(string)) {
            textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new QrActivity.AnonymousClass4(3, this, string)).start();
            textView2.setText(string);
            textView2.setVisibility(0);
            textView2.setAlpha(0.0f);
            textView2.setTranslationY(AndroidUtilities.dp(5.0f));
            textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new PhotoViewer$41$1(this, 4)).start();
        } else {
            textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new QrActivity.AnonymousClass4(3, this, string)).start();
            textView2.setText(string);
            textView2.setVisibility(0);
            textView2.setAlpha(0.0f);
            textView2.setTranslationY(AndroidUtilities.dp(5.0f));
            textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new PhotoViewer$41$1(this, 4)).start();
        }
        this.type = i;
    }
}
