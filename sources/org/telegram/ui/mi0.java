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
public final class mi0 extends FrameLayout {
    public final int f35755a;
    public final bj0 f35756b;

    public mi0(bj0 bj0Var, Context context, int i10) {
        super(context);
        this.f35755a = i10;
        this.f35756b = bj0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f35755a) {
            case 0:
                super.dispatchDraw(canvas);
                bj0 bj0Var = this.f35756b;
                ni0 ni0Var = bj0Var.f32174a0;
                ni0Var.e(canvas);
                ArrayList arrayList = ni0Var.F;
                boolean z11 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    fz fzVar = (fz) hg.c.h(1, arrayList);
                    ImageReceiver imageReceiver = fzVar.f33734r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (fzVar.f33735s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                fzVar.f33735s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                fzVar.f33735s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (fzVar.f33735s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(fzVar.f33735s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    bj0Var.X.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!ni0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                bj0 bj0Var2 = this.f35756b;
                kb0 kb0Var = bj0Var2.d;
                if (kb0Var != null) {
                    if (bj0Var2.E == 1.0f && bj0Var2.f32189n != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    kb0Var.a(z10);
                }
                if (bj0Var2.E > 0.0f && bj0Var2.f32189n != null) {
                    bj0Var2.f32194r.reset();
                    float width = getWidth() / bj0Var2.f32181f.getWidth();
                    bj0Var2.f32194r.postScale(width, width);
                    bj0Var2.h.setLocalMatrix(bj0Var2.f32194r);
                    bj0Var2.f32189n.setAlpha((int) (bj0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), bj0Var2.f32189n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f35755a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f35756b.onBackPressed();
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
        oi0 oi0Var;
        int height;
        switch (this.f35755a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                bj0 bj0Var = this.f35756b;
                if (!bj0Var.f32183g0 || bj0Var.f32184h0) {
                    ArrayList arrayList = bj0Var.N;
                    ui0 ui0Var = bj0Var.K;
                    if (bj0Var.F.getWidth() > 0) {
                        bj0Var.W.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.vl.D(6.0f, bj0Var.W.getWidth() - bj0Var.W.l(), iArr[0])};
                        bj0Var.X.setScaleX(bj0Var.W.getScaleX());
                        bj0Var.X.setScaleY(bj0Var.W.getScaleY());
                        int[] iArr2 = bj0Var.f32191o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = ui0Var.getMeasuredHeight() - bj0Var.X.getHeight();
                        if (bj0Var.f32180e0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + bj0Var.e.f10591b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f7);
                        ViewGroup viewGroup = bj0Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (bj0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - bj0Var.e.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (bj0Var.W.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - bj0Var.W.getHeight();
                        }
                        bj0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (oi0Var.getWidth() - bj0Var.X.l())));
                        bj0Var.X.setY(iArr[1]);
                        if (bj0Var.m0) {
                            iArr[0] = iArr[0] - (bj0Var.Y - bj0Var.W.l());
                        }
                        ui0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ui0Var.getMeasuredWidth());
                        if (bj0Var.f32183g0) {
                            org.telegram.messenger.vl.r(ui0Var.animate().translationY(((bj0Var.X.getHeight() + iArr[1]) - ui0Var.getMeasuredHeight()) - ui0Var.getTop()), ji.n.V, 250L);
                        } else {
                            ui0Var.setY((bj0Var.X.getHeight() + iArr[1]) - ui0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = bj0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - bj0Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = bj0Var.Z;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = bj0Var.X.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = bj0Var.f32179d0;
                        if (frameLayout != null) {
                            frameLayout.setX(hg.c.f(6.0f, (bj0Var.X.l() + iArr[0]) - bj0Var.f32179d0.getMeasuredWidth(), 0));
                            RectF rectF = bj0Var.f32188l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = bj0Var.f32179d0;
                                float max = Math.max(bj0Var.e.f10591b, rectF.top - frameLayout2.getMeasuredWidth());
                                bj0Var.f32178c0 = max;
                                frameLayout2.setY(max);
                                pi0 pi0Var = bj0Var.f32180e0;
                                if (pi0Var != null) {
                                    pi0Var.setY(Math.max(bj0Var.e.f10591b, (bj0Var.f32188l0.top - AndroidUtilities.dp(24.0f)) - bj0Var.f32180e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (bj0Var.X.getHeight() + iArr[1]) - ui0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = bj0Var.f32179d0;
                                float max2 = Math.max(bj0Var.e.f10591b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                bj0Var.f32178c0 = max2;
                                frameLayout3.setY(max2);
                                pi0 pi0Var2 = bj0Var.f32180e0;
                                if (pi0Var2 != null) {
                                    pi0Var2.setY(Math.max(0.0f, (height2 - pi0Var2.getMeasuredHeight()) - bj0Var.f32178c0));
                                }
                            }
                        }
                    }
                    bj0Var.f32183g0 = true;
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
        switch (this.f35755a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                bj0 bj0Var = this.f35756b;
                gh.d.c(bj0Var.f32186j0, bj0Var.F);
                ViewGroup viewGroup = bj0Var.Z;
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
