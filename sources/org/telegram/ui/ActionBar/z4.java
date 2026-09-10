package org.telegram.ui.ActionBar;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ut;
public final class z4 {
    public static final l4 f18821p = new Object();
    public static final List f18822q = Arrays.asList(Integer.valueOf(R.id.menu_regular), Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_quote), Integer.valueOf(R.id.menu_date));
    public static final List f18823r = Arrays.asList(Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_quote));
    public final View f18824a;
    public final x4 f18825b;
    public Menu e;
    public final int f18829i;
    public Runnable f18830j;
    public ut f18831k;
    public final f6 f18834n;
    public final zg.a f18835o;
    public final Rect f18826c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f18827f = new ArrayList();
    public MenuItem.OnMenuItemClickListener f18828g = f18821p;
    public boolean h = true;
    public final m4 f18832l = new m4(this);
    public final a4.e f18833m = new a4.e(16);

    public z4(Context context, View view, int i10, f6 f6Var, zg.a aVar) {
        this.f18824a = view;
        this.f18829i = i10;
        this.f18835o = aVar;
        this.f18834n = f6Var;
        this.f18825b = new x4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i10, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i10);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static LinearLayout b(z4 z4Var, Context context, MenuItem menuItem, boolean z10, boolean z11, boolean z12) {
        float f7;
        int v02;
        int i10;
        int i11;
        int i12;
        float f10;
        f6 f6Var = z4Var.f18834n;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        boolean z13 = false;
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(AndroidUtilities.dp(48.0f));
        if (z10) {
            f7 = 42.0f;
        } else {
            f7 = 48.0f;
        }
        linearLayout.setMinimumHeight(AndroidUtilities.dp(f7));
        linearLayout.setPaddingRelative(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setFocusable(false);
        textView.setImportantForAccessibility(2);
        textView.setFocusableInTouchMode(false);
        int v03 = j6.v0(j6.f18017i6, f6Var);
        int i13 = z4Var.f18829i;
        if (i13 == 0) {
            v02 = j6.v0(j6.f18034j5, f6Var);
            textView.setTextColor(v02);
        } else if (i13 == 2) {
            v02 = -328966;
            textView.setTextColor(-328966);
            v03 = 553648127;
        } else if (i13 == 1) {
            v02 = j6.v0(j6.G6, f6Var);
            textView.setTextColor(v02);
        } else {
            v02 = j6.v0(j6.G6, f6Var);
        }
        if (!z11 && !z12) {
            linearLayout.setBackground(j6.f0(v03, 2, -1));
        } else {
            int i14 = 12;
            if (z11) {
                i10 = 12;
            } else {
                i10 = 0;
            }
            if (z12) {
                i11 = 12;
            } else {
                i11 = 0;
            }
            if (z12) {
                i12 = 12;
            } else {
                i12 = 0;
            }
            if (!z11) {
                i14 = 0;
            }
            linearLayout.setBackground(j6.a0(v03, i10, i11, i12, i14));
        }
        textView.setPaddingRelative(AndroidUtilities.dp(11.0f), 0, 0, 0);
        if (z10) {
            f10 = 42.0f;
        } else {
            f10 = 48.0f;
        }
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, AndroidUtilities.dp(f10)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_mini_lock3);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.l1(0.4f, v02), PorterDuff.Mode.SRC_IN));
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.a6.p(-2, -1, 0.0f, 0, 12, 0, 0, 0));
        if (menuItem != null) {
            if (z4Var.f18830j != null) {
                z13 = true;
            }
            e(linearLayout, menuItem, z13);
        }
        return linearLayout;
    }

    public static void e(android.view.View r4, android.view.MenuItem r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.z4.e(android.view.View, android.view.MenuItem, boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.z4.c():void");
    }

    public final ArrayList d(Menu menu) {
        ut utVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; menu != null && i10 < menu.size(); i10++) {
            MenuItem item = menu.getItem(i10);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (utVar = this.f18831k) == null || ((Boolean) utVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.f18830j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
