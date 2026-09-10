package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.vv0;
import w7.a6;
public final class k3 extends FrameLayout {
    public final p1 f28217a;
    public j3 f28218b;
    public int f28219c;
    public final TextView d;
    public final TextView e;
    public int f28220f;

    public k3(Activity activity, p1 p1Var) {
        super(activity);
        this.f28217a = p1Var;
        setWillNotDraw(true);
        j3 j3Var = new j3(activity, p1Var);
        this.f28218b = j3Var;
        addView(j3Var, a6.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, a6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, a6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i10) {
        this.f28218b.f28195a = new hj0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.f28218b.f28196b = new hj0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.f28218b.f28196b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        j3 j3Var = new j3(getContext(), this.f28217a);
        if (i10 == R.raw.camera_flip2) {
            hj0 hj0Var = new hj0(i10, i11, i11, true, null);
            j3Var.f28197c = hj0Var;
            hj0Var.f23672v0 = j3Var;
        } else {
            j3Var.f28195a = new hj0(i10, i11, i11, true, null);
            hj0 hj0Var2 = new hj0(i10, i11, i11, true, null);
            j3Var.f28196b = hj0Var2;
            hj0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        j3Var.a(i12, z10, false);
        j3Var.setAlpha(0.0f);
        j3Var.setOnBtnClickedListener(this.f28218b.f28203x);
        addView(j3Var, a6.a(53.5f, 53.5f, 1));
        j3 j3Var2 = this.f28218b;
        this.f28218b = j3Var;
        j3Var.animate().alpha(1.0f).setDuration(250L).start();
        j3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new vv0(3, (Object) this, (Object) j3Var2)).start();
    }

    public final void c(int i10) {
        this.f28218b.f28195a = new hj0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.f28218b.f28196b = new hj0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.f28218b.f28196b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k3.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(i3 i3Var) {
        this.f28218b.setOnBtnClickedListener(i3Var);
    }
}
