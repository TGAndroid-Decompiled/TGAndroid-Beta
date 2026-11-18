package org.telegram.ui.ActionBar;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.dl;
import org.telegram.ui.Components.dt;
public final class m4 {
    public static final z3 f29233p = new Object();
    public static final List f29234q = Arrays.asList(2131296503, 2131296491, 2131296497, 2131296509, 2131296499, 2131296512, 2131296508, 2131296498, 2131296502, 2131296493);
    public static final List f29235r = Arrays.asList(2131296491, 2131296497, 2131296509, 2131296498, 2131296499, 2131296512, 2131296508, 2131296502);
    public final View f29236a;
    public final k4 f29237b;
    public Menu f29239e;
    public final int f29242i;
    public Runnable f29243j;
    public dt f29244k;
    public final i6 f29247n;
    public final dh.c f29248o;
    public final Rect f29238c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f29240f = new ArrayList();
    public MenuItem.OnMenuItemClickListener f29241g = f29233p;
    public boolean h = true;
    public final a4 f29245l = new a4(this);
    public final dl f29246m = new dl(22);

    public m4(Context context, View view, int i7, i6 i6Var, dh.c cVar) {
        this.f29236a = view;
        this.f29242i = i7;
        this.f29248o = cVar;
        this.f29247n = i6Var;
        this.f29237b = new k4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i7, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i7);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static android.widget.LinearLayout b(org.telegram.ui.ActionBar.m4 r25, android.content.Context r26, android.view.MenuItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.m4.b(org.telegram.ui.ActionBar.m4, android.content.Context, android.view.MenuItem, boolean, boolean, boolean):android.widget.LinearLayout");
    }

    public static void e(android.view.View r4, android.view.MenuItem r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.m4.e(android.view.View, android.view.MenuItem, boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.m4.c():void");
    }

    public final ArrayList d(Menu menu) {
        dt dtVar;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; menu != null && i7 < menu.size(); i7++) {
            MenuItem item = menu.getItem(i7);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != 2131296502 || (dtVar = this.f29244k) == null || ((Boolean) dtVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != 2131296503 || this.f29243j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
