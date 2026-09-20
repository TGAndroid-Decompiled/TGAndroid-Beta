package org.telegram.ui;
public final class ni implements org.telegram.ui.Components.dh0 {
    public boolean f36032a = true;
    public final org.telegram.ui.Components.pk0 f36033b;

    public ni(org.telegram.ui.Components.pk0 pk0Var) {
        this.f36033b = pk0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.pk0 pk0Var = this.f36033b;
        if (f7 == 0.0f && !this.f36032a) {
            pk0Var.r(false);
            this.f36032a = true;
        } else if (f7 == 1.0f && this.f36032a) {
            pk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f36032a = false;
            }
        }
    }
}
