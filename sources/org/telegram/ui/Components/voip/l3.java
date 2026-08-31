package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.ij0;
public final class l3 extends FrameLayout {
    public final o1 f32180a;
    public k3 f32181b;
    public int f32182c;
    public final TextView d;
    public final TextView f32183e;
    public int f32184f;

    public l3(Activity activity, o1 o1Var) {
        super(activity);
        this.f32180a = o1Var;
        setWillNotDraw(true);
        k3 k3Var = new k3(activity, o1Var);
        this.f32181b = k3Var;
        addView(k3Var, c6.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, c6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.f32183e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, c6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i10) {
        k3 k3Var = this.f32181b;
        int i11 = R.raw.bt_to_speaker;
        k3Var.f32122a = new ij0(i11, "" + R.raw.bt_to_speaker, i10, i10, true, null);
        k3 k3Var2 = this.f32181b;
        int i12 = R.raw.bt_to_speaker;
        k3Var2.f32123b = new ij0(i12, "" + R.raw.bt_to_speaker, i10, i10, true, null);
        this.f32181b.f32123b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z4) {
        k3 k3Var = new k3(getContext(), this.f32180a);
        if (i10 == R.raw.camera_flip2) {
            ij0 ij0Var = new ij0(i10, l.d.j(i10, ""), i11, i11, true, null);
            k3Var.f32124c = ij0Var;
            ij0Var.f27835s0 = k3Var;
        } else {
            k3Var.f32122a = new ij0(i10, l.d.j(i10, ""), i11, i11, true, null);
            ij0 ij0Var2 = new ij0(i10, l.d.j(i10, ""), i11, i11, true, null);
            k3Var.f32123b = ij0Var2;
            ij0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        k3Var.a(i12, z4, false);
        k3Var.setAlpha(0.0f);
        k3Var.setOnBtnClickedListener(this.f32181b.f32131x);
        addView(k3Var, c6.a(53.5f, 53.5f, 1));
        k3 k3Var2 = this.f32181b;
        this.f32181b = k3Var;
        k3Var.animate().alpha(1.0f).setDuration(250L).start();
        k3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new fx0(2, this, k3Var2)).start();
    }

    public final void c(int i10) {
        k3 k3Var = this.f32181b;
        int i11 = R.raw.speaker_to_bt;
        k3Var.f32122a = new ij0(i11, "" + R.raw.speaker_to_bt, i10, i10, true, null);
        k3 k3Var2 = this.f32181b;
        int i12 = R.raw.speaker_to_bt;
        k3Var2.f32123b = new ij0(i12, "" + R.raw.speaker_to_bt, i10, i10, true, null);
        this.f32181b.f32123b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l3.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(j3 j3Var) {
        this.f32181b.setOnBtnClickedListener(j3Var);
    }
}
