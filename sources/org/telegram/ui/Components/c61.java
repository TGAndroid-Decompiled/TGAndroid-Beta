package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public class c61 extends org.telegram.ui.ActionBar.k3 {
    public final int f27081b;
    public final GradientDrawable f27082c;
    public final q61 d;
    public int e;

    public c61(Context context, org.telegram.ui.ActionBar.r2 r2Var, q61 q61Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, true);
        this.f27081b = AndroidUtilities.dp(12.0f);
        this.f27082c = new GradientDrawable();
        b61 b61Var = new b61(this, context);
        b61Var.addView(q61Var, kb1.g(-1.0f, -1));
        this.containerView = b61Var;
        this.d = q61Var;
        q61Var.setParentFragment(r2Var);
        q61Var.setOnScrollListener(new z51(this));
    }

    public static void m(c61 c61Var) {
        q61 q61Var = c61Var.d;
        if (q61Var.c()) {
            c61Var.e = q61Var.getContentTopOffset();
            c61Var.containerView.invalidate();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23428h5));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        q61 q61Var = this.d;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(q61Var.f31803a);
        notificationCenter.removeObserver(q61Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(q61Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        q61 q61Var = this.d;
        Objects.requireNonNull(q61Var);
        b7 b7Var = new b7(q61Var, 7);
        f61 f61Var = q61Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.h7(f61Var.f27897a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.h7(f61Var.f27898b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Q5));
        p61 p61Var = q61Var.f31809s;
        g61 g61Var = q61Var.f31807n;
        p61Var.getClass();
        org.telegram.ui.Cells.q3.a(arrayList, b7Var);
        arrayList.add(new org.telegram.ui.ActionBar.h7(g61Var, 4, new Class[]{org.telegram.ui.Cells.n3.class}, new String[]{"delButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.Qh));
        ig.d2 d2Var = q61Var.v;
        d2Var.getClass();
        org.telegram.ui.Cells.q3.a(arrayList, b7Var);
        int i10 = org.telegram.ui.ActionBar.y6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.h7(g61Var, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(g61Var, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"urlTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(g61Var, 8, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"buttonView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, i10));
        ImageView imageView = d2Var.L;
        int i11 = org.telegram.ui.ActionBar.y6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.h7(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(d2Var.M, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(q61Var.f31806f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.h7(q61Var.f31810w, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23428h5));
        return arrayList;
    }

    @Override
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 2);
    }
}
