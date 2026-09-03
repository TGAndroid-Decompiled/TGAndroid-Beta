package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f11 extends View {
    public static final String[] f33914s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f33915a;
    public c11 f33916b;
    public c11 f33917c;
    public final PointF d;
    public boolean e;
    public boolean f33918f;
    public float h;
    public long f33919n;
    public boolean f33920r;

    public f11(ProfileActivity profileActivity, c11 c11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f33920r = false;
        this.f33915a = profileActivity;
        this.f33916b = c11Var;
    }

    public final boolean a() {
        c11 c11Var = this.f33916b;
        if (!c11Var.f32987b || this.h < 1.0f) {
            return false;
        }
        if (c11Var.f32988c.getLottieAnimation() != null) {
            this.f33916b.f32988c.getLottieAnimation().L(0, false, false);
            this.f33916b.f32988c.getLottieAnimation().F(true);
        }
        this.f33920r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(c11 c11Var) {
        if (this.f33916b != c11Var && c11Var != null) {
            ArrayList arrayList = c11Var.e;
            if (this.f33920r) {
                this.f33917c = c11Var;
                return;
            }
            if (this.f33918f) {
                for (int i10 = 0; i10 < this.f33916b.e.size(); i10++) {
                    ((e11) this.f33916b.e.get(i10)).setParentView(null);
                }
                this.f33918f = false;
            }
            c11 c11Var2 = this.f33916b;
            ArrayList arrayList2 = c11Var2.f32992j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && c11Var2.f32991i) {
                c11Var2.b(true);
                c11Var2.f32991i = false;
            }
            this.f33916b = c11Var;
            if (!this.f33918f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((e11) arrayList.get(i11)).setParentView(this);
                }
                this.f33918f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33916b.f32992j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f33918f) {
            for (int i10 = 0; i10 < this.f33916b.e.size(); i10++) {
                ((e11) this.f33916b.e.get(i10)).setParentView(null);
            }
            this.f33918f = false;
        }
        c11 c11Var = this.f33916b;
        ArrayList arrayList = c11Var.f32992j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && c11Var.f32991i) {
            c11Var.b(true);
            c11Var.f32991i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f33916b.f32987b) {
            if (!this.f33918f) {
                for (int i10 = 0; i10 < this.f33916b.e.size(); i10++) {
                    ((e11) this.f33916b.e.get(i10)).setParentView(this);
                }
                this.f33918f = true;
                if (!this.e) {
                    this.e = true;
                    post(new sz0(this, 3));
                }
            }
            if (!this.f33920r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f33919n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f33919n = currentTimeMillis;
            ProfileActivity profileActivity = this.f33915a;
            ty0 ty0Var = profileActivity.f32002a;
            int i11 = profileActivity.R2;
            PointF pointF = this.d;
            float f10 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= ty0Var.getChildCount()) {
                        break;
                    }
                    View childAt = ty0Var.getChildAt(i12);
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.x8)) {
                        ih.s sVar = ((org.telegram.ui.Cells.x8) childAt).f22552a;
                        pointF.set(sVar.getX() + childAt.getX() + ty0Var.getX() + AndroidUtilities.dp(12.0f), (sVar.getMeasuredHeight() / 2.0f) + sVar.getY() + childAt.getY() + ty0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f11 = dz.f();
            this.f33916b.f32988c.setImageCoords((getWidth() - AndroidUtilities.dp(f11)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f11) * 0.5f)), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f33916b.f32988c.draw(canvas);
            this.f33916b.f32988c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f33916b.d.size() - 1;
            while (size >= 0) {
                e11 e11Var = (e11) this.f33916b.d.get(size);
                float f12 = size;
                float cascade = AndroidUtilities.cascade(this.h, f12, this.f33916b.d.size(), 1.8f);
                float f13 = dp;
                float f14 = 0.88f * f13;
                float d = e2.c.d(f14, this.f33916b.d.size() - 1, getWidth(), f10);
                float f15 = pointF.x;
                float f16 = pointF.y;
                float f17 = ((d - f15) * cascade) + (f14 * f12) + f15;
                float interpolation = org.telegram.ui.Components.mr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f18 = (f13 / 2.0f) * interpolation;
                float f19 = f13 * interpolation;
                e11Var.setImageCoords(f17 - f18, (f16 - ((f16 + f13) * ((float) Math.pow(this.h, 2.0d)))) - f18, f19, f19);
                e11Var.draw(canvas);
                size--;
                f10 = 2.0f;
            }
            if (this.h >= 1.0f) {
                this.f33920r = false;
                b(this.f33917c);
                this.f33917c = null;
                return;
            }
            invalidate();
        }
    }
}
