package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.su0;
public final class j3 extends FrameLayout {
    public final n1 f33588a;
    public i3 f33589b;
    public int f33590c;
    public final TextView d;
    public final TextView f33591e;
    public int f33592f;

    public j3(Activity activity, n1 n1Var) {
        super(activity);
        this.f33588a = n1Var;
        setWillNotDraw(true);
        i3 i3Var = new i3(activity, n1Var);
        this.f33589b = i3Var;
        addView(i3Var, e6.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, e6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.f33591e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, e6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i9) {
        i3 i3Var = this.f33589b;
        int i10 = R.raw.bt_to_speaker;
        i3Var.f33566a = new mi0(i10, "" + R.raw.bt_to_speaker, i9, i9, true, null);
        i3 i3Var2 = this.f33589b;
        int i11 = R.raw.bt_to_speaker;
        i3Var2.f33567b = new mi0(i11, "" + R.raw.bt_to_speaker, i9, i9, true, null);
        this.f33589b.f33567b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i9, int i10, int i11, boolean z10) {
        i3 i3Var = new i3(getContext(), this.f33588a);
        if (i9 == R.raw.camera_flip2) {
            mi0 mi0Var = new mi0(i9, j3.r0.l(i9, ""), i10, i10, true, null);
            i3Var.f33568c = mi0Var;
            mi0Var.f30863r0 = i3Var;
        } else {
            i3Var.f33566a = new mi0(i9, j3.r0.l(i9, ""), i10, i10, true, null);
            mi0 mi0Var2 = new mi0(i9, j3.r0.l(i9, ""), i10, i10, true, null);
            i3Var.f33567b = mi0Var2;
            mi0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        i3Var.a(i11, z10, false);
        i3Var.setAlpha(0.0f);
        i3Var.setOnBtnClickedListener(this.f33589b.f33575x);
        addView(i3Var, e6.a(53.5f, 53.5f, 1));
        i3 i3Var2 = this.f33589b;
        this.f33589b = i3Var;
        i3Var.animate().alpha(1.0f).setDuration(250L).start();
        i3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new su0(3, this, i3Var2)).start();
    }

    public final void c(int i9) {
        i3 i3Var = this.f33589b;
        int i10 = R.raw.speaker_to_bt;
        i3Var.f33566a = new mi0(i10, "" + R.raw.speaker_to_bt, i9, i9, true, null);
        i3 i3Var2 = this.f33589b;
        int i11 = R.raw.speaker_to_bt;
        i3Var2.f33567b = new mi0(i11, "" + R.raw.speaker_to_bt, i9, i9, true, null);
        this.f33589b.f33567b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.j3.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(h3 h3Var) {
        this.f33589b.setOnBtnClickedListener(h3Var);
    }
}
