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
public final class ei0 extends FrameLayout {
    public final int f36608a;
    public final ti0 f36609b;

    public ei0(ti0 ti0Var, Context context, int i10) {
        super(context);
        this.f36608a = i10;
        this.f36609b = ti0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z4;
        switch (this.f36608a) {
            case 0:
                super.dispatchDraw(canvas);
                ti0 ti0Var = this.f36609b;
                fi0 fi0Var = ti0Var.X;
                fi0Var.e(canvas);
                ArrayList arrayList = fi0Var.C;
                boolean z10 = true;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    bz bzVar = (bz) l.d.i(1, arrayList);
                    ImageReceiver imageReceiver = bzVar.f35628r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (bzVar.f35629s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                bzVar.f35629s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                bzVar.f35629s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (bzVar.f35629s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(bzVar.f35629s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f10 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    ti0Var.U.h((f10 < 0.0f || f10 >= 1.0f) ? false : false);
                }
                if (!fi0Var.C.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                ti0 ti0Var2 = this.f36609b;
                lf.s0 s0Var = ti0Var2.d;
                if (s0Var != null) {
                    if (ti0Var2.B == 1.0f && ti0Var2.f41641n != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    s0Var.a(z4);
                }
                if (ti0Var2.B > 0.0f && ti0Var2.f41641n != null) {
                    ti0Var2.f41646r.reset();
                    float width = getWidth() / ti0Var2.f41633f.getWidth();
                    ti0Var2.f41646r.postScale(width, width);
                    ti0Var2.h.setLocalMatrix(ti0Var2.f41646r);
                    ti0Var2.f41641n.setAlpha((int) (ti0Var2.B * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ti0Var2.f41641n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f36608a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f36609b.onBackPressed();
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
        gi0 gi0Var;
        int height;
        switch (this.f36608a) {
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                ti0 ti0Var = this.f36609b;
                if (!ti0Var.f41630d0 || ti0Var.f41632e0) {
                    ArrayList arrayList = ti0Var.K;
                    mi0 mi0Var = ti0Var.H;
                    if (ti0Var.C.getWidth() > 0) {
                        ti0Var.T.getLocationOnScreen(r13);
                        int[] iArr = {b.C(6.0f, ti0Var.T.getWidth() - ti0Var.T.l(), iArr[0])};
                        ti0Var.U.setScaleX(ti0Var.T.getScaleX());
                        ti0Var.U.setScaleY(ti0Var.T.getScaleY());
                        int[] iArr2 = ti0Var.f41640l0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = mi0Var.getMeasuredHeight() - ti0Var.U.getHeight();
                        if (ti0Var.f41627b0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + ti0Var.f41631e.f7758b;
                        if (arrayList.isEmpty()) {
                            f10 = -6.0f;
                        } else {
                            f10 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f10);
                        ViewGroup viewGroup = ti0Var.W;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (ti0Var.D.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - ti0Var.f41631e.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (ti0Var.T.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - ti0Var.T.getHeight();
                        }
                        ti0Var.U.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (gi0Var.getWidth() - ti0Var.U.l())));
                        ti0Var.U.setY(iArr[1]);
                        if (ti0Var.f41638j0) {
                            iArr[0] = iArr[0] - (ti0Var.V - ti0Var.T.l());
                        }
                        mi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - mi0Var.getMeasuredWidth());
                        if (ti0Var.f41630d0) {
                            b.p(mi0Var.animate().translationY(((ti0Var.U.getHeight() + iArr[1]) - mi0Var.getMeasuredHeight()) - mi0Var.getTop()), xh.n.V, 250L);
                        } else {
                            mi0Var.setY((ti0Var.U.getHeight() + iArr[1]) - mi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = ti0Var.W;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ti0Var.W.getMeasuredWidth());
                            ViewGroup viewGroup3 = ti0Var.W;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = ti0Var.U.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = ti0Var.f41625a0;
                        if (frameLayout != null) {
                            frameLayout.setX(l.d.c(6.0f, (ti0Var.U.l() + iArr[0]) - ti0Var.f41625a0.getMeasuredWidth(), 0));
                            RectF rectF = ti0Var.f41637i0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = ti0Var.f41625a0;
                                float max = Math.max(ti0Var.f41631e.f7758b, rectF.top - frameLayout2.getMeasuredWidth());
                                ti0Var.Z = max;
                                frameLayout2.setY(max);
                                hi0 hi0Var = ti0Var.f41627b0;
                                if (hi0Var != null) {
                                    hi0Var.setY(Math.max(ti0Var.f41631e.f7758b, (ti0Var.f41637i0.top - AndroidUtilities.dp(24.0f)) - ti0Var.f41627b0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (ti0Var.U.getHeight() + iArr[1]) - mi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = ti0Var.f41625a0;
                                float max2 = Math.max(ti0Var.f41631e.f7758b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                ti0Var.Z = max2;
                                frameLayout3.setY(max2);
                                hi0 hi0Var2 = ti0Var.f41627b0;
                                if (hi0Var2 != null) {
                                    hi0Var2.setY(Math.max(0.0f, (height2 - hi0Var2.getMeasuredHeight()) - ti0Var.Z));
                                }
                            }
                        }
                    }
                    ti0Var.f41630d0 = true;
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
        switch (this.f36608a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                ti0 ti0Var = this.f36609b;
                ug.c.c(ti0Var.f41635g0, ti0Var.C);
                ViewGroup viewGroup = ti0Var.W;
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
