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
public final class fi0 extends FrameLayout {
    public final int f34096a;
    public final ui0 f34097b;

    public fi0(ui0 ui0Var, Context context, int i10) {
        super(context);
        this.f34096a = i10;
        this.f34097b = ui0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z4;
        switch (this.f34096a) {
            case 0:
                super.dispatchDraw(canvas);
                ui0 ui0Var = this.f34097b;
                gi0 gi0Var = ui0Var.X;
                gi0Var.e(canvas);
                ArrayList arrayList = gi0Var.C;
                boolean z10 = true;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    cz czVar = (cz) kf.k0.i(1, arrayList);
                    ImageReceiver imageReceiver = czVar.f33273r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (czVar.f33274s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                czVar.f33274s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                czVar.f33274s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (czVar.f33274s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(czVar.f33274s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f10 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    ui0Var.U.h((f10 < 0.0f || f10 >= 1.0f) ? false : false);
                }
                if (!gi0Var.C.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                ui0 ui0Var2 = this.f34097b;
                kf.t0 t0Var = ui0Var2.d;
                if (t0Var != null) {
                    if (ui0Var2.B == 1.0f && ui0Var2.f38841n != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    t0Var.a(z4);
                }
                if (ui0Var2.B > 0.0f && ui0Var2.f38841n != null) {
                    ui0Var2.f38846r.reset();
                    float width = getWidth() / ui0Var2.f38833f.getWidth();
                    ui0Var2.f38846r.postScale(width, width);
                    ui0Var2.h.setLocalMatrix(ui0Var2.f38846r);
                    ui0Var2.f38841n.setAlpha((int) (ui0Var2.B * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ui0Var2.f38841n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f34096a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f34097b.onBackPressed();
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
        hi0 hi0Var;
        int height;
        switch (this.f34096a) {
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                ui0 ui0Var = this.f34097b;
                if (!ui0Var.f38831d0 || ui0Var.f38832e0) {
                    ArrayList arrayList = ui0Var.K;
                    ni0 ni0Var = ui0Var.H;
                    if (ui0Var.C.getWidth() > 0) {
                        ui0Var.T.getLocationOnScreen(r13);
                        int[] iArr = {b.C(6.0f, ui0Var.T.getWidth() - ui0Var.T.l(), iArr[0])};
                        ui0Var.U.setScaleX(ui0Var.T.getScaleX());
                        ui0Var.U.setScaleY(ui0Var.T.getScaleY());
                        int[] iArr2 = ui0Var.f38840l0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = ni0Var.getMeasuredHeight() - ui0Var.U.getHeight();
                        if (ui0Var.f38828b0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + ui0Var.e.f7197b;
                        if (arrayList.isEmpty()) {
                            f10 = -6.0f;
                        } else {
                            f10 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f10);
                        ViewGroup viewGroup = ui0Var.W;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (ui0Var.D.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - ui0Var.e.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (ui0Var.T.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - ui0Var.T.getHeight();
                        }
                        ui0Var.U.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (hi0Var.getWidth() - ui0Var.U.l())));
                        ui0Var.U.setY(iArr[1]);
                        if (ui0Var.f38838j0) {
                            iArr[0] = iArr[0] - (ui0Var.V - ui0Var.T.l());
                        }
                        ni0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ni0Var.getMeasuredWidth());
                        if (ui0Var.f38831d0) {
                            b.p(ni0Var.animate().translationY(((ui0Var.U.getHeight() + iArr[1]) - ni0Var.getMeasuredHeight()) - ni0Var.getTop()), wh.n.V, 250L);
                        } else {
                            ni0Var.setY((ui0Var.U.getHeight() + iArr[1]) - ni0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = ui0Var.W;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ui0Var.W.getMeasuredWidth());
                            ViewGroup viewGroup3 = ui0Var.W;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = ui0Var.U.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = ui0Var.f38826a0;
                        if (frameLayout != null) {
                            frameLayout.setX(kf.k0.c(6.0f, (ui0Var.U.l() + iArr[0]) - ui0Var.f38826a0.getMeasuredWidth(), 0));
                            RectF rectF = ui0Var.f38837i0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = ui0Var.f38826a0;
                                float max = Math.max(ui0Var.e.f7197b, rectF.top - frameLayout2.getMeasuredWidth());
                                ui0Var.Z = max;
                                frameLayout2.setY(max);
                                ii0 ii0Var = ui0Var.f38828b0;
                                if (ii0Var != null) {
                                    ii0Var.setY(Math.max(ui0Var.e.f7197b, (ui0Var.f38837i0.top - AndroidUtilities.dp(24.0f)) - ui0Var.f38828b0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (ui0Var.U.getHeight() + iArr[1]) - ni0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = ui0Var.f38826a0;
                                float max2 = Math.max(ui0Var.e.f7197b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                ui0Var.Z = max2;
                                frameLayout3.setY(max2);
                                ii0 ii0Var2 = ui0Var.f38828b0;
                                if (ii0Var2 != null) {
                                    ii0Var2.setY(Math.max(0.0f, (height2 - ii0Var2.getMeasuredHeight()) - ui0Var.Z));
                                }
                            }
                        }
                    }
                    ui0Var.f38831d0 = true;
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
        switch (this.f34096a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                ui0 ui0Var = this.f34097b;
                tg.c.c(ui0Var.f38835g0, ui0Var.C);
                ViewGroup viewGroup = ui0Var.W;
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
