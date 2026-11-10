package org.telegram.ui;
public final class q0 extends org.telegram.ui.Components.k6 {
    public final int f48893b;

    public q0(String str, int i7) {
        super(str, 0);
        this.f48893b = i7;
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f48893b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                return;
            case 1:
                cn.f44408kd = (int) f10;
                return;
            case 2:
                ((org.telegram.ui.Cells.q1) obj).setTimeAlpha(f10);
                return;
            case 3:
                ((org.telegram.messenger.ej) obj).d = f10;
                return;
            case 4:
                ((zv0) obj).setCrossfadeProgress(f10);
                return;
            case 5:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                return;
            case 6:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                return;
            default:
                pz0 pz0Var = (pz0) obj;
                if (pz0Var.f48884a != f10) {
                    pz0Var.f48884a = f10;
                    SecretMediaViewer secretMediaViewer = pz0Var.f48890r;
                    secretMediaViewer.Q.setAlpha(f10);
                    if (pz0Var.f48885b) {
                        org.telegram.ui.ActionBar.m5 m5Var = secretMediaViewer.Q;
                        m5Var.setPivotX(m5Var.getWidth());
                        org.telegram.ui.ActionBar.m5 m5Var2 = secretMediaViewer.Q;
                        m5Var2.setPivotY(m5Var2.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.Q.setScaleX(f12);
                        secretMediaViewer.Q.setScaleY(f12);
                        org.telegram.ui.Components.v51 v51Var = secretMediaViewer.O;
                        if (v51Var.f38885y != f11) {
                            v51Var.f38885y = f11;
                            v51Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (pz0Var.f48886c) {
                        pz0Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
                    }
                    secretMediaViewer.P.setAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f48893b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(cn.f44408kd);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.q1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.ej) obj).d);
            case 4:
                return Float.valueOf(((zv0) obj).S);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((pz0) obj).f48884a);
        }
    }
}
