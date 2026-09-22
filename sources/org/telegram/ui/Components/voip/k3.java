package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.kj0;
import w7.y5;
public final class k3 extends FrameLayout {
    public final q1 f29403a;
    public j3 f29404b;
    public int f29405c;
    public final TextView d;
    public final TextView e;
    public int f29406f;

    public k3(Activity activity, q1 q1Var) {
        super(activity);
        this.f29403a = q1Var;
        setWillNotDraw(true);
        j3 j3Var = new j3(activity, q1Var);
        this.f29404b = j3Var;
        addView(j3Var, y5.a(53.5f, 53.5f, 1));
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
        this.f29404b.f29383a = new kj0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.f29404b.f29384b = new kj0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.f29404b.f29384b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        j3 j3Var = new j3(getContext(), this.f29403a);
        if (i10 == R.raw.camera_flip2) {
            kj0 kj0Var = new kj0(i10, i11, i11, true, null);
            j3Var.f29385c = kj0Var;
            kj0Var.R(j3Var);
        } else {
            j3Var.f29383a = new kj0(i10, i11, i11, true, null);
            kj0 kj0Var2 = new kj0(i10, i11, i11, true, null);
            j3Var.f29384b = kj0Var2;
            kj0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        j3Var.a(i12, z10, false);
        j3Var.setAlpha(0.0f);
        j3Var.setOnBtnClickedListener(this.f29404b.f29391x);
        addView(j3Var, y5.a(53.5f, 53.5f, 1));
        j3 j3Var2 = this.f29404b;
        this.f29404b = j3Var;
        j3Var.animate().alpha(1.0f).setDuration(250L).start();
        j3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new cl0(5, this, j3Var2)).start();
    }

    public final void c(int i10) {
        this.f29404b.f29383a = new kj0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.f29404b.f29384b = new kj0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.f29404b.f29384b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k3.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(i3 i3Var) {
        this.f29404b.setOnBtnClickedListener(i3Var);
    }
}
