package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class dp extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f27510a;
    public final ImageView f27511b;
    public final org.telegram.ui.ActionBar.b6 f27512c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final org.telegram.ui.ActionBar.b6 e;
    public final org.telegram.ui.il f27513f;
    public boolean h;
    public boolean f27514n;

    public dp(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f27510a = u6Var;
        ImageView imageView = new ImageView(context);
        this.f27511b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, kb1.i(52, 46, 51));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f27512c = b6Var;
        b6Var.setTextSize(14);
        b6Var.setTypeface(AndroidUtilities.bold());
        addView(b6Var, kb1.h(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(context);
        this.d = b6Var2;
        b6Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(b6Var2);
        addView(b6Var2, kb1.h(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var3 = new org.telegram.ui.ActionBar.b6(context);
        this.e = b6Var3;
        b6Var3.setTextSize(14);
        b6Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        b6Var3.setAlpha(0.0f);
        addView(b6Var3, kb1.h(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.il ilVar = new org.telegram.ui.il(this, context, new xh.g());
        this.f27513f = ilVar;
        ilVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(ilVar, kb1.h(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23662te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23700ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Xk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.gc));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f27514n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.f23662te;
        org.telegram.ui.ActionBar.u6 u6Var = this.f27510a;
        this.f27511b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(i10, u6Var), PorterDuff.Mode.MULTIPLY));
        this.f27512c.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23700ve, u6Var));
        int i11 = org.telegram.ui.ActionBar.y6.Xk;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        b6Var.setTextColor(w02);
        b6Var.setLinkTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.gc, u6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
    }
}
