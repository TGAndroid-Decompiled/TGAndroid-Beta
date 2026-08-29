package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.xi0;
public final class m3 extends FrameLayout {
    public final o1 f33855a;
    public l3 f33856b;
    public int f33857c;
    public final TextView d;
    public final TextView f33858e;
    public int f33859f;

    public m3(Activity activity, o1 o1Var) {
        super(activity);
        this.f33855a = o1Var;
        setWillNotDraw(true);
        l3 l3Var = new l3(activity, o1Var);
        this.f33856b = l3Var;
        addView(l3Var, f6.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, f6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.f33858e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, f6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i10) {
        l3 l3Var = this.f33856b;
        int i11 = R.raw.bt_to_speaker;
        l3Var.f33836a = new xi0(i11, "" + R.raw.bt_to_speaker, i10, i10, true, null);
        l3 l3Var2 = this.f33856b;
        int i12 = R.raw.bt_to_speaker;
        l3Var2.f33837b = new xi0(i12, "" + R.raw.bt_to_speaker, i10, i10, true, null);
        this.f33856b.f33837b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        l3 l3Var = new l3(getContext(), this.f33855a);
        if (i10 == R.raw.camera_flip2) {
            xi0 xi0Var = new xi0(i10, j7.l1.k(i10, ""), i11, i11, true, null);
            l3Var.f33838c = xi0Var;
            xi0Var.f34753r0 = l3Var;
        } else {
            l3Var.f33836a = new xi0(i10, j7.l1.k(i10, ""), i11, i11, true, null);
            xi0 xi0Var2 = new xi0(i10, j7.l1.k(i10, ""), i11, i11, true, null);
            l3Var.f33837b = xi0Var2;
            xi0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        l3Var.a(i12, z10, false);
        l3Var.setAlpha(0.0f);
        l3Var.setOnBtnClickedListener(this.f33856b.f33845x);
        addView(l3Var, f6.a(53.5f, 53.5f, 1));
        l3 l3Var2 = this.f33856b;
        this.f33856b = l3Var;
        l3Var.animate().alpha(1.0f).setDuration(250L).start();
        l3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new ok0(6, this, l3Var2)).start();
    }

    public final void c(int i10) {
        l3 l3Var = this.f33856b;
        int i11 = R.raw.speaker_to_bt;
        l3Var.f33836a = new xi0(i11, "" + R.raw.speaker_to_bt, i10, i10, true, null);
        l3 l3Var2 = this.f33856b;
        int i12 = R.raw.speaker_to_bt;
        l3Var2.f33837b = new xi0(i12, "" + R.raw.speaker_to_bt, i10, i10, true, null);
        this.f33856b.f33837b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.m3.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(k3 k3Var) {
        this.f33856b.setOnBtnClickedListener(k3Var);
    }
}
