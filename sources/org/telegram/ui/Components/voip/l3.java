package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.xj0;
public final class l3 extends FrameLayout {
    public final r1 f33940a;
    public k3 f33941b;
    public int f33942c;
    public final TextView d;
    public final TextView e;
    public int f33943f;

    public l3(Activity activity, r1 r1Var) {
        super(activity);
        this.f33940a = r1Var;
        setWillNotDraw(true);
        k3 k3Var = new k3(activity, r1Var);
        this.f33941b = k3Var;
        addView(k3Var, gb1.e(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, gb1.h(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, gb1.h(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i10) {
        this.f33941b.f33887a = new xj0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.f33941b.f33888b = new xj0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.f33941b.f33888b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        k3 k3Var = new k3(getContext(), this.f33940a);
        if (i10 == R.raw.camera_flip2) {
            xj0 xj0Var = new xj0(i10, i11, i11, true, null);
            k3Var.f33889c = xj0Var;
            xj0Var.R(k3Var);
        } else {
            k3Var.f33887a = new xj0(i10, i11, i11, true, null);
            xj0 xj0Var2 = new xj0(i10, i11, i11, true, null);
            k3Var.f33888b = xj0Var2;
            xj0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        k3Var.a(i12, z10, false);
        k3Var.setAlpha(0.0f);
        k3Var.setOnBtnClickedListener(this.f33941b.f33895x);
        addView(k3Var, gb1.e(53.5f, 53.5f, 1));
        k3 k3Var2 = this.f33941b;
        this.f33941b = k3Var;
        k3Var.animate().alpha(1.0f).setDuration(250L).start();
        k3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new ll0(6, this, k3Var2)).start();
    }

    public final void c(int i10) {
        this.f33941b.f33887a = new xj0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.f33941b.f33888b = new xj0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.f33941b.f33888b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l3.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(j3 j3Var) {
        this.f33941b.setOnBtnClickedListener(j3Var);
    }
}
