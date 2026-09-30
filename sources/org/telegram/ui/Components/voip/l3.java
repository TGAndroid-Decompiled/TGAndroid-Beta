package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.lj0;
import w7.y5;
public final class l3 extends FrameLayout {
    public final r1 f29371a;
    public k3 f29372b;
    public int f29373c;
    public final TextView d;
    public final TextView e;
    public int f29374f;

    public l3(Activity activity, r1 r1Var) {
        super(activity);
        this.f29371a = r1Var;
        setWillNotDraw(true);
        k3 k3Var = new k3(activity, r1Var);
        this.f29372b = k3Var;
        addView(k3Var, y5.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, y5.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, y5.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i10) {
        this.f29372b.f29351a = new lj0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.f29372b.f29352b = new lj0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.f29372b.f29352b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        k3 k3Var = new k3(getContext(), this.f29371a);
        if (i10 == R.raw.camera_flip2) {
            lj0 lj0Var = new lj0(i10, i11, i11, true, null);
            k3Var.f29353c = lj0Var;
            lj0Var.R(k3Var);
        } else {
            k3Var.f29351a = new lj0(i10, i11, i11, true, null);
            lj0 lj0Var2 = new lj0(i10, i11, i11, true, null);
            k3Var.f29352b = lj0Var2;
            lj0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        k3Var.a(i12, z10, false);
        k3Var.setAlpha(0.0f);
        k3Var.setOnBtnClickedListener(this.f29372b.f29359x);
        addView(k3Var, y5.a(53.5f, 53.5f, 1));
        k3 k3Var2 = this.f29372b;
        this.f29372b = k3Var;
        k3Var.animate().alpha(1.0f).setDuration(250L).start();
        k3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new dl0(5, this, k3Var2)).start();
    }

    public final void c(int i10) {
        this.f29372b.f29351a = new lj0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.f29372b.f29352b = new lj0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.f29372b.f29352b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l3.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(j3 j3Var) {
        this.f29372b.setOnBtnClickedListener(j3Var);
    }
}
