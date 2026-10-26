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
public class b61 extends org.telegram.ui.ActionBar.k3 {
    public final int f26766b;
    public final GradientDrawable f26767c;
    public final p61 d;
    public int e;

    public b61(Context context, org.telegram.ui.ActionBar.r2 r2Var, p61 p61Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, true);
        this.f26766b = AndroidUtilities.dp(12.0f);
        this.f26767c = new GradientDrawable();
        a61 a61Var = new a61(this, context);
        a61Var.addView(p61Var, gb1.g(-1.0f, -1));
        this.containerView = a61Var;
        this.d = p61Var;
        p61Var.setParentFragment(r2Var);
        p61Var.setOnScrollListener(new y51(this));
    }

    public static void m(b61 b61Var) {
        p61 p61Var = b61Var.d;
        if (p61Var.c()) {
            b61Var.e = p61Var.getContentTopOffset();
            b61Var.containerView.invalidate();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23427h5));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        p61 p61Var = this.d;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(p61Var.f31451a);
        notificationCenter.removeObserver(p61Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(p61Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        p61 p61Var = this.d;
        Objects.requireNonNull(p61Var);
        b7 b7Var = new b7(p61Var, 7);
        e61 e61Var = p61Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.h7(e61Var.f27572a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.h7(e61Var.f27573b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Q5));
        o61 o61Var = p61Var.f31457s;
        f61 f61Var = p61Var.f31455n;
        o61Var.getClass();
        org.telegram.ui.Cells.q3.a(arrayList, b7Var);
        arrayList.add(new org.telegram.ui.ActionBar.h7(f61Var, 4, new Class[]{org.telegram.ui.Cells.n3.class}, new String[]{"delButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.Qh));
        ig.d2 d2Var = p61Var.v;
        d2Var.getClass();
        org.telegram.ui.Cells.q3.a(arrayList, b7Var);
        int i10 = org.telegram.ui.ActionBar.y6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.h7(f61Var, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(f61Var, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"urlTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(f61Var, 8, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"buttonView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, i10));
        ImageView imageView = d2Var.L;
        int i11 = org.telegram.ui.ActionBar.y6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.h7(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(d2Var.M, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(p61Var.f31454f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.h7(p61Var.f31458w, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23427h5));
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
