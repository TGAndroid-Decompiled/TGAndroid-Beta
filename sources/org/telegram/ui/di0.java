package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class di0 extends FrameLayout {
    public final int f33659a;
    public final si0 f33660b;

    public di0(si0 si0Var, Context context, int i10) {
        super(context);
        this.f33659a = i10;
        this.f33660b = si0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z4;
        switch (this.f33659a) {
            case 0:
                super.dispatchDraw(canvas);
                si0 si0Var = this.f33660b;
                ei0 ei0Var = si0Var.X;
                ei0Var.e(canvas);
                ArrayList arrayList = ei0Var.C;
                boolean z10 = true;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    az azVar = (az) kh.a2.i(1, arrayList);
                    ImageReceiver imageReceiver = azVar.f32741r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (azVar.f32742s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                azVar.f32742s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                azVar.f32742s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (azVar.f32742s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(azVar.f32742s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f10 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    si0Var.U.h((f10 < 0.0f || f10 >= 1.0f) ? false : false);
                }
                if (!ei0Var.C.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                si0 si0Var2 = this.f33660b;
                lf.s0 s0Var = si0Var2.d;
                if (s0Var != null) {
                    if (si0Var2.B == 1.0f && si0Var2.f38366n != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    s0Var.a(z4);
                }
                if (si0Var2.B > 0.0f && si0Var2.f38366n != null) {
                    si0Var2.f38371r.reset();
                    float width = getWidth() / si0Var2.f38358f.getWidth();
                    si0Var2.f38371r.postScale(width, width);
                    si0Var2.h.setLocalMatrix(si0Var2.f38371r);
                    si0Var2.f38366n.setAlpha((int) (si0Var2.B * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), si0Var2.f38366n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f33659a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f33660b.onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        float f10;
        int measuredHeight;
        fi0 fi0Var;
        int height;
        switch (this.f33659a) {
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                si0 si0Var = this.f33660b;
                if (!si0Var.f38356d0 || si0Var.f38357e0) {
                    ArrayList arrayList = si0Var.K;
                    li0 li0Var = si0Var.H;
                    if (si0Var.C.getWidth() > 0) {
                        si0Var.T.getLocationOnScreen(r13);
                        int[] iArr = {b.C(6.0f, si0Var.T.getWidth() - si0Var.T.l(), iArr[0])};
                        si0Var.U.setScaleX(si0Var.T.getScaleX());
                        si0Var.U.setScaleY(si0Var.T.getScaleY());
                        int[] iArr2 = si0Var.f38365l0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = li0Var.getMeasuredHeight() - si0Var.U.getHeight();
                        if (si0Var.f38353b0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + si0Var.e.f7214b;
                        if (arrayList.isEmpty()) {
                            f10 = -6.0f;
                        } else {
                            f10 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f10);
                        ViewGroup viewGroup = si0Var.W;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (si0Var.D.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - si0Var.e.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (si0Var.T.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - si0Var.T.getHeight();
                        }
                        si0Var.U.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (fi0Var.getWidth() - si0Var.U.l())));
                        si0Var.U.setY(iArr[1]);
                        if (si0Var.f38363j0) {
                            iArr[0] = iArr[0] - (si0Var.V - si0Var.T.l());
                        }
                        li0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - li0Var.getMeasuredWidth());
                        if (si0Var.f38356d0) {
                            b.p(li0Var.animate().translationY(((si0Var.U.getHeight() + iArr[1]) - li0Var.getMeasuredHeight()) - li0Var.getTop()), wh.n.V, 250L);
                        } else {
                            li0Var.setY((si0Var.U.getHeight() + iArr[1]) - li0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = si0Var.W;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - si0Var.W.getMeasuredWidth());
                            ViewGroup viewGroup3 = si0Var.W;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = si0Var.U.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = si0Var.f38351a0;
                        if (frameLayout != null) {
                            frameLayout.setX(kh.a2.c(6.0f, (si0Var.U.l() + iArr[0]) - si0Var.f38351a0.getMeasuredWidth(), 0));
                            RectF rectF = si0Var.f38362i0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = si0Var.f38351a0;
                                float max = Math.max(si0Var.e.f7214b, rectF.top - frameLayout2.getMeasuredWidth());
                                si0Var.Z = max;
                                frameLayout2.setY(max);
                                gi0 gi0Var = si0Var.f38353b0;
                                if (gi0Var != null) {
                                    gi0Var.setY(Math.max(si0Var.e.f7214b, (si0Var.f38362i0.top - AndroidUtilities.dp(24.0f)) - si0Var.f38353b0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (si0Var.U.getHeight() + iArr[1]) - li0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = si0Var.f38351a0;
                                float max2 = Math.max(si0Var.e.f7214b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                si0Var.Z = max2;
                                frameLayout3.setY(max2);
                                gi0 gi0Var2 = si0Var.f38353b0;
                                if (gi0Var2 != null) {
                                    gi0Var2.setY(Math.max(0.0f, (height2 - gi0Var2.getMeasuredHeight()) - si0Var.Z));
                                }
                            }
                        }
                    }
                    si0Var.f38356d0 = true;
                    return;
                }
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f33659a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                si0 si0Var = this.f33660b;
                tg.c.c(si0Var.f38360g0, si0Var.C);
                ViewGroup viewGroup = si0Var.W;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
