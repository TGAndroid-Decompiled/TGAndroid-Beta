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
public final class pi0 extends FrameLayout {
    public final int f40974a;
    public final ej0 f40975b;

    public pi0(ej0 ej0Var, Context context, int i10) {
        super(context);
        this.f40974a = i10;
        this.f40975b = ej0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f40974a) {
            case 0:
                super.dispatchDraw(canvas);
                ej0 ej0Var = this.f40975b;
                qi0 qi0Var = ej0Var.f37131a0;
                qi0Var.e(canvas);
                ArrayList arrayList = qi0Var.F;
                boolean z11 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    gz gzVar = (gz) hg.c.h(1, arrayList);
                    ImageReceiver imageReceiver = gzVar.f38193r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (gzVar.f38194s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                gzVar.f38194s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                gzVar.f38194s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (gzVar.f38194s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(gzVar.f38194s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    ej0Var.X.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!qi0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                ej0 ej0Var2 = this.f40975b;
                jb0 jb0Var = ej0Var2.d;
                if (jb0Var != null) {
                    if (ej0Var2.E == 1.0f && ej0Var2.f37147n != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jb0Var.a(z10);
                }
                if (ej0Var2.E > 0.0f && ej0Var2.f37147n != null) {
                    ej0Var2.f37152r.reset();
                    float width = getWidth() / ej0Var2.f37139f.getWidth();
                    ej0Var2.f37152r.postScale(width, width);
                    ej0Var2.h.setLocalMatrix(ej0Var2.f37152r);
                    ej0Var2.f37147n.setAlpha((int) (ej0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ej0Var2.f37147n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f40974a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f40975b.onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        float f7;
        int measuredHeight;
        ri0 ri0Var;
        int height;
        switch (this.f40974a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                ej0 ej0Var = this.f40975b;
                if (!ej0Var.f37141g0 || ej0Var.f37142h0) {
                    ArrayList arrayList = ej0Var.N;
                    xi0 xi0Var = ej0Var.K;
                    if (ej0Var.F.getWidth() > 0) {
                        ej0Var.W.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.am.D(6.0f, ej0Var.W.getWidth() - ej0Var.W.l(), iArr[0])};
                        ej0Var.X.setScaleX(ej0Var.W.getScaleX());
                        ej0Var.X.setScaleY(ej0Var.W.getScaleY());
                        int[] iArr2 = ej0Var.f37149o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = xi0Var.getMeasuredHeight() - ej0Var.X.getHeight();
                        if (ej0Var.f37138e0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + ej0Var.f37137e.f11575b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f7);
                        ViewGroup viewGroup = ej0Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (ej0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - ej0Var.f37137e.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (ej0Var.W.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - ej0Var.W.getHeight();
                        }
                        ej0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (ri0Var.getWidth() - ej0Var.X.l())));
                        ej0Var.X.setY(iArr[1]);
                        if (ej0Var.m0) {
                            iArr[0] = iArr[0] - (ej0Var.Y - ej0Var.W.l());
                        }
                        xi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - xi0Var.getMeasuredWidth());
                        if (ej0Var.f37141g0) {
                            org.telegram.messenger.am.t(xi0Var.animate().translationY(((ej0Var.X.getHeight() + iArr[1]) - xi0Var.getMeasuredHeight()) - xi0Var.getTop()), ji.n.V, 250L);
                        } else {
                            xi0Var.setY((ej0Var.X.getHeight() + iArr[1]) - xi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = ej0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ej0Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = ej0Var.Z;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = ej0Var.X.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = ej0Var.f37136d0;
                        if (frameLayout != null) {
                            frameLayout.setX(hg.c.f(6.0f, (ej0Var.X.l() + iArr[0]) - ej0Var.f37136d0.getMeasuredWidth(), 0));
                            RectF rectF = ej0Var.f37146l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = ej0Var.f37136d0;
                                float max = Math.max(ej0Var.f37137e.f11575b, rectF.top - frameLayout2.getMeasuredWidth());
                                ej0Var.f37135c0 = max;
                                frameLayout2.setY(max);
                                si0 si0Var = ej0Var.f37138e0;
                                if (si0Var != null) {
                                    si0Var.setY(Math.max(ej0Var.f37137e.f11575b, (ej0Var.f37146l0.top - AndroidUtilities.dp(24.0f)) - ej0Var.f37138e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (ej0Var.X.getHeight() + iArr[1]) - xi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = ej0Var.f37136d0;
                                float max2 = Math.max(ej0Var.f37137e.f11575b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                ej0Var.f37135c0 = max2;
                                frameLayout3.setY(max2);
                                si0 si0Var2 = ej0Var.f37138e0;
                                if (si0Var2 != null) {
                                    si0Var2.setY(Math.max(0.0f, (height2 - si0Var2.getMeasuredHeight()) - ej0Var.f37135c0));
                                }
                            }
                        }
                    }
                    ej0Var.f37141g0 = true;
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f40974a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                ej0 ej0Var = this.f40975b;
                gh.d.c(ej0Var.f37144j0, ej0Var.F);
                ViewGroup viewGroup = ej0Var.Z;
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
