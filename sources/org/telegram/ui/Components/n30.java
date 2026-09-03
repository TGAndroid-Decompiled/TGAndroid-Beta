package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class n30 extends m2.a {
    public final o30 f29374c;

    public n30(o30 o30Var) {
        this.f29374c = o30Var;
    }

    @Override
    public final void a(m2.h hVar, Object obj) {
        hVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f29374c.f29652e.length;
    }

    @Override
    public final Object e(m2.h hVar, int i10) {
        int i11;
        m30 m30Var = new m30(this, this.f29374c.getContext(), i10, 0);
        m30Var.setOnClickListener(new mh.x0(this, i10, 7));
        m30Var.setFocusable(true);
        m30Var.setTag(Integer.valueOf(i10));
        m30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        m30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        m30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            m30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            m30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            m30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
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
        m30Var.setImageDrawable(drawable);
        if (m30Var.getParent() != null) {
            ((ViewGroup) m30Var.getParent()).removeView(m30Var);
        }
        hVar.addView(m30Var, 0);
        return m30Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override
    public final void h(int i10) {
    }
}
