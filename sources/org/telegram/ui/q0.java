package org.telegram.ui;
public final class q0 extends org.telegram.ui.Components.j6 {
    public final int f50409b;

    public q0(String str, int i7) {
        super(str, 0);
        this.f50409b = i7;
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f50409b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                return;
            case 1:
                an.f45107ld = (int) f10;
                return;
            case 2:
                ((org.telegram.ui.Cells.q1) obj).setTimeAlpha(f10);
                return;
            case 3:
                ((org.telegram.messenger.cj) obj).d = f10;
                return;
            case 4:
                ((vv0) obj).setCrossfadeProgress(f10);
                return;
            case 5:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                return;
            case 6:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                return;
            default:
                jz0 jz0Var = (jz0) obj;
                if (jz0Var.f48475a != f10) {
                    jz0Var.f48475a = f10;
                    SecretMediaViewer secretMediaViewer = jz0Var.f48481r;
                    secretMediaViewer.R.setAlpha(f10);
                    if (jz0Var.f48476b) {
                        org.telegram.ui.ActionBar.j5 j5Var = secretMediaViewer.R;
                        j5Var.setPivotX(j5Var.getWidth());
                        org.telegram.ui.ActionBar.j5 j5Var2 = secretMediaViewer.R;
                        j5Var2.setPivotY(j5Var2.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.R.setScaleX(f12);
                        secretMediaViewer.R.setScaleY(f12);
                        org.telegram.ui.Components.w51 w51Var = secretMediaViewer.P;
                        if (w51Var.f41291y != f11) {
                            w51Var.f41291y = f11;
                            w51Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (jz0Var.f48477c) {
                        jz0Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
                    }
                    secretMediaViewer.Q.setAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f50409b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(an.f45107ld);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.q1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.cj) obj).d);
            case 4:
                return Float.valueOf(((vv0) obj).T);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((jz0) obj).f48475a);
        }
    }
}
