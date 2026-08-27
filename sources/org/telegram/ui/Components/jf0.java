package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

public final class jf0 extends FrameLayout {

    public float f29679a;

    public float f29680b;

    public boolean f29681c;
    public boolean d;

    public final PipRoundVideoView f29682e;

    public jf0(PipRoundVideoView pipRoundVideoView, Activity activity) {
        super(activity);
        this.f29682e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f5 f5Var = org.telegram.ui.ActionBar.g6.f23178k3;
        if (f5Var != null) {
            f5Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.g6.f23178k3.setBounds(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(125.0f), AndroidUtilities.dp(125.0f));
            org.telegram.ui.ActionBar.g6.f23178k3.draw(canvas);
            org.telegram.ui.ActionBar.g6.S1.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23305ra, false));
            org.telegram.ui.ActionBar.g6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(AndroidUtilities.dp(63.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(59.5f), org.telegram.ui.ActionBar.g6.S1);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f29679a = motionEvent.getRawX();
            this.f29680b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        boolean z10;
        ArrayList arrayList;
        AnimatorSet animatorSet;
        boolean z11;
        char c10;
        MessageObject playingMessageObject;
        if (!this.d && !this.f29681c) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        float fC = 1.0f;
        PipRoundVideoView pipRoundVideoView = this.f29682e;
        if (action == 2) {
            float f11 = rawX - this.f29679a;
            float f12 = rawY - this.f29680b;
            if (this.d) {
                if (Math.abs(f11) < AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(f12) < AndroidUtilities.getPixelsInCM(0.3f, false)) {
                    return true;
                }
                this.f29681c = true;
                this.d = false;
                return true;
            }
            if (!this.f29681c) {
                return true;
            }
            WindowManager.LayoutParams layoutParams = pipRoundVideoView.v;
            int i10 = (int) (layoutParams.x + f11);
            layoutParams.x = i10;
            layoutParams.y = (int) (layoutParams.y + f12);
            int i11 = pipRoundVideoView.h / 2;
            int i12 = -i11;
            if (i10 < i12) {
                layoutParams.x = i12;
            } else {
                int i13 = (AndroidUtilities.displaySize.x - layoutParams.width) + i11;
                if (i10 > i13) {
                    layoutParams.x = i13;
                }
            }
            int i14 = layoutParams.x;
            if (i14 < 0) {
                fC = s3.c.c(i14, i11, 0.5f, 1.0f);
            } else {
                int i15 = AndroidUtilities.displaySize.x;
                int i16 = layoutParams.width;
                if (i14 > i15 - i16) {
                    fC = org.telegram.messenger.rl.c((i14 - i15) + i16, i11, 0.5f, 1.0f);
                }
            }
            if (pipRoundVideoView.f26420a.getAlpha() != fC) {
                pipRoundVideoView.f26420a.setAlpha(fC);
            }
            WindowManager.LayoutParams layoutParams2 = pipRoundVideoView.v;
            int i17 = layoutParams2.y;
            if (i17 < 0) {
                layoutParams2.y = 0;
            } else {
                int i18 = AndroidUtilities.displaySize.y - layoutParams2.height;
                if (i17 > i18) {
                    layoutParams2.y = i18;
                }
            }
            pipRoundVideoView.f26428w.updateViewLayout(pipRoundVideoView.f26420a, layoutParams2);
            this.f29679a = rawX;
            this.f29680b = rawY;
            return true;
        }
        if (motionEvent.getAction() != 1) {
            return true;
        }
        if (this.d && !this.f29681c && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
            if (MediaController.getInstance().isMessagePaused()) {
                MediaController.getInstance().playMessage(playingMessageObject);
            } else {
                MediaController.getInstance().lambda$startAudioAgain$7(playingMessageObject);
            }
        }
        this.f29681c = false;
        this.d = false;
        int iB = PipRoundVideoView.b(true, 0, 0.0f, pipRoundVideoView.h);
        int iB2 = PipRoundVideoView.b(true, 1, 0.0f, pipRoundVideoView.h);
        int iB3 = PipRoundVideoView.b(false, 0, 0.0f, pipRoundVideoView.f26425n);
        int iB4 = PipRoundVideoView.b(false, 1, 0.0f, pipRoundVideoView.f26425n);
        SharedPreferences.Editor editorEdit = pipRoundVideoView.f26429x.edit();
        int iDp = AndroidUtilities.dp(20.0f);
        int iAbs = Math.abs(iB - pipRoundVideoView.v.x);
        Property property = View.ALPHA;
        if (iAbs > iDp) {
            int i19 = pipRoundVideoView.v.x;
            f10 = 1.0f;
            if (i19 >= 0 || i19 <= (-pipRoundVideoView.h) / 4) {
                if (Math.abs(iB2 - i19) > iDp) {
                    int i20 = pipRoundVideoView.v.x;
                    int i21 = AndroidUtilities.displaySize.x;
                    c10 = 0;
                    int i22 = pipRoundVideoView.h;
                    if (i20 <= i21 - i22 || i20 >= i21 - ((i22 / 4) * 3)) {
                        if (pipRoundVideoView.f26420a.getAlpha() != 1.0f) {
                            arrayList = new ArrayList();
                            if (pipRoundVideoView.v.x < 0) {
                                arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", -pipRoundVideoView.h));
                            } else {
                                arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", AndroidUtilities.displaySize.x));
                            }
                            z10 = true;
                        } else {
                            editorEdit.putFloat("px", (pipRoundVideoView.v.x - iB) / (iB2 - iB));
                            editorEdit.putInt("sidex", 2);
                            arrayList = null;
                        }
                        if (!z10) {
                            if (Math.abs(iB3 - pipRoundVideoView.v.y) > iDp || pipRoundVideoView.v.y <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                editorEdit.putInt("sidey", 0);
                                arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", iB3));
                            } else if (Math.abs(iB4 - pipRoundVideoView.v.y) <= iDp) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                editorEdit.putInt("sidey", 1);
                                arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", iB4));
                            } else {
                                editorEdit.putFloat("py", (pipRoundVideoView.v.y - iB3) / (iB4 - iB3));
                                editorEdit.putInt("sidey", 2);
                            }
                            editorEdit.commit();
                        }
                        if (arrayList == null) {
                            return true;
                        }
                        if (pipRoundVideoView.f26430y == null) {
                            pipRoundVideoView.f26430y = new DecelerateInterpolator();
                        }
                        animatorSet = new AnimatorSet();
                        animatorSet.setInterpolator(pipRoundVideoView.f26430y);
                        animatorSet.setDuration(150L);
                        if (z10) {
                            z11 = true;
                            arrayList.add(ObjectAnimator.ofFloat(pipRoundVideoView.f26420a, (Property<jf0, Float>) property, 0.0f));
                            animatorSet.addListener(new lf0(pipRoundVideoView, 1));
                        } else {
                            z11 = true;
                        }
                        animatorSet.playTogether(arrayList);
                        animatorSet.start();
                        return z11;
                    }
                } else {
                    c10 = 0;
                }
                arrayList = new ArrayList();
                editorEdit.putInt("sidex", 1);
                if (pipRoundVideoView.f26420a.getAlpha() != 1.0f) {
                    jf0 jf0Var = pipRoundVideoView.f26420a;
                    float[] fArr = new float[1];
                    fArr[c10] = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(jf0Var, (Property<jf0, Float>) property, fArr));
                }
                arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", iB2));
            }
            z10 = false;
            if (!z10) {
                if (Math.abs(iB3 - pipRoundVideoView.v.y) > iDp) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    editorEdit.putInt("sidey", 0);
                    arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", iB3));
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    editorEdit.putInt("sidey", 0);
                    arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", iB3));
                }
                editorEdit.commit();
            }
            if (arrayList == null) {
                return true;
            }
            if (pipRoundVideoView.f26430y == null) {
                pipRoundVideoView.f26430y = new DecelerateInterpolator();
            }
            animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(pipRoundVideoView.f26430y);
            animatorSet.setDuration(150L);
            if (z10) {
                z11 = true;
                arrayList.add(ObjectAnimator.ofFloat(pipRoundVideoView.f26420a, (Property<jf0, Float>) property, 0.0f));
                animatorSet.addListener(new lf0(pipRoundVideoView, 1));
            } else {
                z11 = true;
            }
            animatorSet.playTogether(arrayList);
            animatorSet.start();
            return z11;
        }
        f10 = 1.0f;
        ArrayList arrayList2 = new ArrayList();
        editorEdit.putInt("sidex", 0);
        if (pipRoundVideoView.f26420a.getAlpha() != f10) {
            arrayList2.add(ObjectAnimator.ofFloat(pipRoundVideoView.f26420a, (Property<jf0, Float>) property, f10));
        }
        arrayList2.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", iB));
        arrayList = arrayList2;
        z10 = false;
        if (!z10) {
            if (Math.abs(iB3 - pipRoundVideoView.v.y) > iDp) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                editorEdit.putInt("sidey", 0);
                arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", iB3));
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                editorEdit.putInt("sidey", 0);
                arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", iB3));
            }
            editorEdit.commit();
        }
        if (arrayList == null) {
            return true;
        }
        if (pipRoundVideoView.f26430y == null) {
            pipRoundVideoView.f26430y = new DecelerateInterpolator();
        }
        animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(pipRoundVideoView.f26430y);
        animatorSet.setDuration(150L);
        if (z10) {
            z11 = true;
            arrayList.add(ObjectAnimator.ofFloat(pipRoundVideoView.f26420a, (Property<jf0, Float>) property, 0.0f));
            animatorSet.addListener(new lf0(pipRoundVideoView, 1));
        } else {
            z11 = true;
        }
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        return z11;
    }
}
