package org.telegram.ui.Components;

public final class vb extends cb {

    public float f33340a;

    public ub f33341b;

    public n9 f33342c;
    public j6 d;

    public boolean f33343e;

    @Override
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f10) {
        if (this.f33343e != (f10 < 1.0f)) {
            this.f33343e = f10 < 1.0f;
            this.f33342c.animate().scaleX(this.f33343e ? 0.78f : 1.0f).scaleY(this.f33343e ? 0.78f : 1.0f).setDuration(320L).setInterpolator(er.h).start();
        }
        this.f33340a = f10;
        this.f33341b.invalidate();
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }
}
