package org.telegram.ui;
public final class q0 extends org.telegram.ui.Components.p6 {
    public final int f51050b;

    public q0(String str, int i7) {
        super(str, 0);
        this.f51050b = i7;
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f51050b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                return;
            case 1:
                bn.f45922md = (int) f10;
                return;
            case 2:
                ((org.telegram.ui.Cells.q1) obj).setTimeAlpha(f10);
                return;
            case 3:
                ((org.telegram.messenger.bj) obj).d = f10;
                return;
            case 4:
                ((wv0) obj).setCrossfadeProgress(f10);
                return;
            case 5:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                return;
            case 6:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                return;
            default:
                nz0 nz0Var = (nz0) obj;
                if (nz0Var.f50371a != f10) {
                    nz0Var.f50371a = f10;
                    SecretMediaViewer secretMediaViewer = nz0Var.f50377r;
                    secretMediaViewer.R.setAlpha(f10);
                    if (nz0Var.f50372b) {
                        org.telegram.ui.ActionBar.n5 n5Var = secretMediaViewer.R;
                        n5Var.setPivotX(n5Var.getWidth());
                        org.telegram.ui.ActionBar.n5 n5Var2 = secretMediaViewer.R;
                        n5Var2.setPivotY(n5Var2.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.R.setScaleX(f12);
                        secretMediaViewer.R.setScaleY(f12);
                        org.telegram.ui.Components.h61 h61Var = secretMediaViewer.P;
                        if (h61Var.f35781y != f11) {
                            h61Var.f35781y = f11;
                            h61Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (nz0Var.f50373c) {
                        nz0Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
                    }
                    secretMediaViewer.Q.setAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f51050b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(bn.f45922md);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.q1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.bj) obj).d);
            case 4:
                return Float.valueOf(((wv0) obj).T);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((nz0) obj).f50371a);
        }
    }
}
