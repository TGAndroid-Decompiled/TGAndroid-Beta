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
import org.telegram.ui.Components.lt;
public final class y4 {
    public static final k4 f20729p = new Object();
    public static final List f20730q = Arrays.asList(Integer.valueOf(R.id.menu_regular), Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_quote), Integer.valueOf(R.id.menu_date));
    public static final List f20731r = Arrays.asList(Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_quote));
    public final View f20732a;
    public final w4 f20733b;
    public Menu e;
    public final int f20737i;
    public Runnable f20738j;
    public lt f20739k;
    public final f6 f20742n;
    public final ng.a f20743o;
    public final Rect f20734c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f20735f = new ArrayList();
    public MenuItem.OnMenuItemClickListener f20736g = f20729p;
    public boolean h = true;
    public final l4 f20740l = new l4(this);
    public final nh.e4 f20741m = new nh.e4(4);

    public y4(Context context, View view, int i10, f6 f6Var, ng.a aVar) {
        this.f20732a = view;
        this.f20737i = i10;
        this.f20743o = aVar;
        this.f20742n = f6Var;
        this.f20733b = new w4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i10, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i10);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static LinearLayout b(y4 y4Var, Context context, MenuItem menuItem, boolean z4, boolean z10, boolean z11) {
        float f10;
        int v02;
        int i10;
        int i11;
        int i12;
        float f11;
        f6 f6Var = y4Var.f20742n;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        boolean z12 = false;
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(AndroidUtilities.dp(48.0f));
        if (z4) {
            f10 = 42.0f;
        } else {
            f10 = 48.0f;
        }
        linearLayout.setMinimumHeight(AndroidUtilities.dp(f10));
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
        int v03 = j6.v0(j6.f19971i6, f6Var);
        int i13 = y4Var.f20737i;
        if (i13 == 0) {
            v02 = j6.v0(j6.f19987j5, f6Var);
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
        if (!z10 && !z11) {
            linearLayout.setBackground(j6.f0(v03, 2, -1));
        } else {
            int i14 = 12;
            if (z10) {
                i10 = 12;
            } else {
                i10 = 0;
            }
            if (z11) {
                i11 = 12;
            } else {
                i11 = 0;
            }
            if (z11) {
                i12 = 12;
            } else {
                i12 = 0;
            }
            if (!z10) {
                i14 = 0;
            }
            linearLayout.setBackground(j6.a0(v03, i10, i11, i12, i14));
        }
        textView.setPaddingRelative(AndroidUtilities.dp(11.0f), 0, 0, 0);
        if (z4) {
            f11 = 42.0f;
        } else {
            f11 = 48.0f;
        }
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, AndroidUtilities.dp(f11)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_mini_lock3);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.l1(0.4f, v02), PorterDuff.Mode.SRC_IN));
        imageView.setVisibility(8);
        linearLayout.addView(imageView, k7.b6.p(-2, -1, 0.0f, 0, 12, 0, 0, 0));
        if (menuItem != null) {
            if (y4Var.f20738j != null) {
                z12 = true;
            }
            e(linearLayout, menuItem, z12);
        }
        return linearLayout;
    }

    public static void e(android.view.View r4, android.view.MenuItem r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.y4.e(android.view.View, android.view.MenuItem, boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.y4.c():void");
    }

    public final ArrayList d(Menu menu) {
        lt ltVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; menu != null && i10 < menu.size(); i10++) {
            MenuItem item = menu.getItem(i10);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (ltVar = this.f20739k) == null || ((Boolean) ltVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.f20738j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
