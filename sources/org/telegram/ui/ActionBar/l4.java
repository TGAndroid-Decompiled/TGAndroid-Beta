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
import org.telegram.messenger.el;
import org.telegram.ui.Components.ft;
public final class l4 {
    public static final y3 f29182p = new Object();
    public static final List f29183q = Arrays.asList(2131296505, 2131296493, 2131296499, 2131296511, 2131296501, 2131296514, 2131296510, 2131296500, 2131296504, 2131296495);
    public static final List f29184r = Arrays.asList(2131296493, 2131296499, 2131296511, 2131296500, 2131296501, 2131296514, 2131296510, 2131296504);
    public final View f29185a;
    public final j4 f29186b;
    public Menu f29188e;
    public final int f29191i;
    public Runnable f29192j;
    public ft f29193k;
    public final h6 f29196n;
    public final dh.c f29197o;
    public final Rect f29187c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f29189f = new ArrayList();
    public MenuItem.OnMenuItemClickListener f29190g = f29182p;
    public boolean h = true;
    public final z3 f29194l = new z3(this);
    public final el f29195m = new el(22);

    public l4(Context context, View view, int i7, h6 h6Var, dh.c cVar) {
        this.f29185a = view;
        this.f29191i = i7;
        this.f29197o = cVar;
        this.f29196n = h6Var;
        this.f29186b = new j4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i7, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i7);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static android.widget.LinearLayout b(org.telegram.ui.ActionBar.l4 r25, android.content.Context r26, android.view.MenuItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l4.b(org.telegram.ui.ActionBar.l4, android.content.Context, android.view.MenuItem, boolean, boolean, boolean):android.widget.LinearLayout");
    }

    public static void e(android.view.View r4, android.view.MenuItem r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l4.e(android.view.View, android.view.MenuItem, boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l4.c():void");
    }

    public final ArrayList d(Menu menu) {
        ft ftVar;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; menu != null && i7 < menu.size(); i7++) {
            MenuItem item = menu.getItem(i7);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != 2131296504 || (ftVar = this.f29193k) == null || ((Boolean) ftVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != 2131296505 || this.f29192j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
