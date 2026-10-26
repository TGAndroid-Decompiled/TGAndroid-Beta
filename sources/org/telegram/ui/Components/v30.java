package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class v30 extends a5.a {
    public final org.telegram.ui.u40 f33561c;

    public v30(org.telegram.ui.u40 u40Var) {
        this.f33561c = u40Var;
    }

    @Override
    public final void a(a5.m mVar, Object obj) {
        mVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f33561c.e.length;
    }

    @Override
    public final Object e(a5.m mVar, int i10) {
        int i11;
        u30 u30Var = new u30(this, this.f33561c.getContext(), i10, 0);
        u30Var.setOnClickListener(new ai.w(this, i10, 14));
        u30Var.setFocusable(true);
        u30Var.setTag(Integer.valueOf(i10));
        u30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        u30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        u30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            u30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            u30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            u30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
        }
        if (i10 == 0) {
            i11 = R.raw.record_audio;
        } else if (i10 == 1) {
            i11 = R.raw.record_video_p;
        } else {
            i11 = R.raw.record_video_l;
        }
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i11));
        drawable.setAspectFill(false);
        u30Var.setImageDrawable(drawable);
        if (u30Var.getParent() != null) {
            ((ViewGroup) u30Var.getParent()).removeView(u30Var);
        }
        mVar.addView(u30Var, 0);
        return u30Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override
    public final void h(int i10) {
    }
}
