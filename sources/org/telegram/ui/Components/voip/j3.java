package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.yj0;
import w7.z5;
public final class j3 extends FrameLayout {
    public final o1 f29925a;
    public i3 f29926b;
    public int f29927c;
    public final TextView d;
    public final TextView e;
    public int f29928f;

    public j3(Activity activity, o1 o1Var) {
        super(activity);
        this.f29925a = o1Var;
        setWillNotDraw(true);
        i3 i3Var = new i3(activity, o1Var);
        this.f29926b = i3Var;
        addView(i3Var, z5.b(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, z5.a(-2.0f, 0.0f, 58.0f, 0.0f, 2.0f, -1, 0));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, z5.a(-2.0f, 0.0f, 58.0f, 0.0f, 2.0f, -1, 0));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i10) {
        this.f29926b.f29899a = new yj0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.f29926b.f29900b = new yj0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.f29926b.f29900b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        i3 i3Var = new i3(getContext(), this.f29925a);
        if (i10 == R.raw.camera_flip2) {
            yj0 yj0Var = new yj0(i10, i11, i11, true, null);
            i3Var.f29901c = yj0Var;
            yj0Var.R(i3Var);
        } else {
            i3Var.f29899a = new yj0(i10, i11, i11, true, null);
            yj0 yj0Var2 = new yj0(i10, i11, i11, true, null);
            i3Var.f29900b = yj0Var2;
            yj0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        i3Var.a(i12, z10, false);
        i3Var.setAlpha(0.0f);
        i3Var.setOnBtnClickedListener(this.f29926b.f29907x);
        addView(i3Var, z5.b(53.5f, 53.5f, 1));
        i3 i3Var2 = this.f29926b;
        this.f29926b = i3Var;
        i3Var.animate().alpha(1.0f).setDuration(250L).start();
        i3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new ql0(5, this, i3Var2)).start();
    }

    public final void c(int i10) {
        this.f29926b.f29899a = new yj0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.f29926b.f29900b = new yj0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.f29926b.f29900b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.j3.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(h3 h3Var) {
        this.f29926b.setOnBtnClickedListener(h3Var);
    }
}
