package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.vl0;
import w7.x5;
public final class k3 extends FrameLayout {
    public final q1 f32097a;
    public j3 f32098b;
    public int f32099c;
    public final TextView d;
    public final TextView f32100e;
    public int f32101f;

    public k3(Activity activity, q1 q1Var) {
        super(activity);
        this.f32097a = q1Var;
        setWillNotDraw(true);
        j3 j3Var = new j3(activity, q1Var);
        this.f32098b = j3Var;
        addView(j3Var, x5.b(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, x5.a(-2.0f, 0.0f, 58.0f, 0.0f, 2.0f, -1, 0));
        TextView textView2 = new TextView(activity);
        this.f32100e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, x5.a(-2.0f, 0.0f, 58.0f, 0.0f, 2.0f, -1, 0));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i10) {
        this.f32098b.f32076a = new dk0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.f32098b.f32077b = new dk0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.f32098b.f32077b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        j3 j3Var = new j3(getContext(), this.f32097a);
        if (i10 == R.raw.camera_flip2) {
            dk0 dk0Var = new dk0(i10, i11, i11, true, null);
            j3Var.f32078c = dk0Var;
            dk0Var.R(j3Var);
        } else {
            j3Var.f32076a = new dk0(i10, i11, i11, true, null);
            dk0 dk0Var2 = new dk0(i10, i11, i11, true, null);
            j3Var.f32077b = dk0Var2;
            dk0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        j3Var.a(i12, z10, false);
        j3Var.setAlpha(0.0f);
        j3Var.setOnBtnClickedListener(this.f32098b.f32085x);
        addView(j3Var, x5.b(53.5f, 53.5f, 1));
        j3 j3Var2 = this.f32098b;
        this.f32098b = j3Var;
        j3Var.animate().alpha(1.0f).setDuration(250L).start();
        j3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new vl0(5, this, j3Var2)).start();
    }

    public final void c(int i10) {
        this.f32098b.f32076a = new dk0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.f32098b.f32077b = new dk0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.f32098b.f32077b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k3.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(i3 i3Var) {
        this.f32098b.setOnBtnClickedListener(i3Var);
    }
}
