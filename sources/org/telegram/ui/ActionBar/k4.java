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
import org.telegram.messenger.tq;
import org.telegram.ui.Components.qs;
public final class k4 {
    public static final v3 f27764p = new Object();
    public static final List f27765q = Arrays.asList(2131296503, 2131296491, 2131296497, 2131296509, 2131296499, 2131296512, 2131296508, 2131296498, 2131296502, 2131296493);
    public static final List f27766r = Arrays.asList(2131296491, 2131296497, 2131296509, 2131296498, 2131296499, 2131296512, 2131296508, 2131296502);
    public final View f27767a;
    public final i4 f27768b;
    public Menu f27770e;
    public final int f27773i;
    public Runnable f27774j;
    public qs f27775k;
    public final e6 f27778n;
    public final eh.c f27779o;
    public final Rect f27769c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f27771f = new ArrayList();
    public MenuItem.OnMenuItemClickListener f27772g = f27764p;
    public boolean h = true;
    public final w3 f27776l = new w3(this);
    public final tq f27777m = new tq(13);

    public k4(Context context, View view, int i3, e6 e6Var, eh.c cVar) {
        this.f27767a = view;
        this.f27773i = i3;
        this.f27779o = cVar;
        this.f27778n = e6Var;
        this.f27768b = new i4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i3, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i3);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static android.widget.LinearLayout b(org.telegram.ui.ActionBar.k4 r25, android.content.Context r26, android.view.MenuItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k4.b(org.telegram.ui.ActionBar.k4, android.content.Context, android.view.MenuItem, boolean, boolean, boolean):android.widget.LinearLayout");
    }

    public static void e(android.view.View r4, android.view.MenuItem r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k4.e(android.view.View, android.view.MenuItem, boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k4.c():void");
    }

    public final ArrayList d(Menu menu) {
        qs qsVar;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; menu != null && i3 < menu.size(); i3++) {
            MenuItem item = menu.getItem(i3);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != 2131296502 || (qsVar = this.f27775k) == null || ((Boolean) qsVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != 2131296503 || this.f27774j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
