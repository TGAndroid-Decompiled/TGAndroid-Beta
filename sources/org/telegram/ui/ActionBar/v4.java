package org.telegram.ui.ActionBar;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Property;
import android.util.Size;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.bt;
import org.telegram.ui.ra1;

public final class v4 {

    public static final h4 f23900p = new h4();

    public static final List f23901q = Arrays.asList(Integer.valueOf(R.id.menu_regular), Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_quote), Integer.valueOf(R.id.menu_date));

    public static final List f23902r = Arrays.asList(Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_quote));

    public final View f23903a;

    public final t4 f23904b;

    public Menu f23906e;

    public final int f23909i;

    public Runnable f23910j;

    public bt f23911k;

    public final c6 f23914n;

    public final jg.a f23915o;

    public final Rect f23905c = new Rect();
    public final Rect d = new Rect();

    public ArrayList f23907f = new ArrayList();

    public MenuItem.OnMenuItemClickListener f23908g = f23900p;
    public boolean h = true;

    public final i4 f23912l = new i4(this);

    public final k9.a f23913m = new k9.a(7);

    public v4(Context context, View view, int i10, c6 c6Var, jg.a aVar) {
        this.f23903a = view;
        this.f23909i = i10;
        this.f23915o = aVar;
        this.f23914n = c6Var;
        this.f23904b = new t4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i10, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, (Property<RelativeLayout, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i10);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static LinearLayout b(v4 v4Var, Context context, MenuItem menuItem, boolean z10, boolean z11, boolean z12) {
        int iV0;
        c6 c6Var = v4Var.f23914n;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(AndroidUtilities.dp(48.0f));
        linearLayout.setMinimumHeight(AndroidUtilities.dp(z10 ? 42.0f : 48.0f));
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
        int iV1 = g6.v0(g6.f23144i6, c6Var);
        int i10 = v4Var.f23909i;
        if (i10 == 0) {
            iV0 = g6.v0(g6.f23161j5, c6Var);
            textView.setTextColor(iV0);
        } else if (i10 == 2) {
            iV0 = -328966;
            textView.setTextColor(-328966);
            iV1 = 553648127;
        } else if (i10 == 1) {
            iV0 = g6.v0(g6.G6, c6Var);
            textView.setTextColor(iV0);
        } else {
            iV0 = g6.v0(g6.G6, c6Var);
        }
        if (z11 || z12) {
            linearLayout.setBackground(g6.a0(iV1, z11 ? 12 : 0, z12 ? 12 : 0, z12 ? 12 : 0, z11 ? 12 : 0));
        } else {
            linearLayout.setBackground(g6.f0(iV1, 2, -1));
        }
        textView.setPaddingRelative(AndroidUtilities.dp(11.0f), 0, 0, 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, AndroidUtilities.dp(z10 ? 42.0f : 48.0f)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_mini_lock3);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.l1(0.4f, iV0), PorterDuff.Mode.SRC_IN));
        imageView.setVisibility(8);
        linearLayout.addView(imageView, h7.z5.p(-2, -1, 0.0f, 0, 12, 0, 0, 0));
        if (menuItem != null) {
            e(linearLayout, menuItem, v4Var.f23910j != null);
        }
        return linearLayout;
    }

    public static void e(View view, MenuItem menuItem, boolean z10) {
        boolean z11;
        ViewGroup viewGroup = (ViewGroup) view;
        TextView textView = (TextView) viewGroup.getChildAt(0);
        textView.setEllipsize(null);
        if (TextUtils.isEmpty(menuItem.getTitle())) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(menuItem.getTitle());
        }
        textView.setPaddingRelative(0, 0, 0, 0);
        if (z10) {
            if (f23902r.contains(Integer.valueOf(menuItem.getItemId()))) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        viewGroup.getChildAt(2).setVisibility(z11 ? 0 : 8);
    }

    public final void c() {
        boolean z10;
        v4 v4Var;
        Size size;
        ra1 ra1Var;
        s4 s4Var;
        int iMin;
        LinkedList linkedList;
        Iterator it;
        int i10;
        boolean z11;
        boolean zHasNext;
        List list;
        List list2;
        int i11;
        ArrayAdapter arrayAdapter;
        int size2;
        boolean zPremiumFeaturesBlocked;
        int i12;
        int count;
        int i13;
        int iMax;
        com.google.firebase.messaging.o oVar;
        boolean z12;
        MenuItem menuItem;
        List list3;
        boolean z13;
        MenuItem menuItem2;
        boolean zHasNext2;
        boolean z14;
        int i14;
        double d;
        int iMin2;
        boolean z15;
        boolean z16;
        ArrayList arrayListD = d(this.f23906e);
        Collections.sort(arrayListD, this.f23913m);
        ArrayList arrayList = this.f23907f;
        t4 t4Var = this.f23904b;
        if (arrayList == null || arrayListD.size() != this.f23907f.size()) {
            z10 = t4Var.F;
            Rect rect = t4Var.A;
            v4Var = t4Var.Q;
            if (!z10) {
                t4Var.G = false;
                t4Var.F = true;
                t4Var.f23802x.cancel();
                t4Var.f23801w.start();
                t4Var.D.setEmpty();
            }
            MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f23908g;
            size = t4Var.H;
            t4Var.K = onMenuItemClickListener;
            t4Var.d();
            t4Var.I = null;
            t4Var.J = null;
            t4Var.N = false;
            t4Var.n();
            ra1Var = t4Var.f23787g;
            ra1Var.removeAllViews();
            ra1Var.setPaddingRelative(0, 0, 0, 0);
            s4Var = t4Var.h;
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) s4Var.getAdapter();
            arrayAdapter2.clear();
            s4Var.setAdapter((ListAdapter) arrayAdapter2);
            t4Var.f23786f.removeAllViews();
            t4Var.f23783b.getWindowVisibleDisplayFrame(rect);
            iMin = Math.min(AndroidUtilities.dp(400.0f), rl.z(16.0f, 2, rect.width()));
            linkedList = new LinkedList(arrayListD);
            it = linkedList.iterator();
            i10 = iMin;
            z11 = true;
            while (true) {
                zHasNext = it.hasNext();
                list = f23902r;
                if (zHasNext) {
                    list2 = list;
                    break;
                }
                menuItem2 = (MenuItem) it.next();
                zHasNext2 = it.hasNext();
                z14 = !zHasNext2;
                if (menuItem2 != null || v4Var.f23910j == null || !list.contains(Integer.valueOf(menuItem2.getItemId()))) {
                    i14 = i10;
                    list2 = list;
                    LinearLayout linearLayoutB = b(v4Var, t4Var.f23782a, menuItem2, false, z11, z14);
                    linearLayoutB.setGravity(17);
                    if (z11) {
                        d = 1.5d;
                    } else {
                        d = 1.0d;
                    }
                    int i15 = iMin;
                    linearLayoutB.setPaddingRelative((int) (d * ((double) linearLayoutB.getPaddingStart())), linearLayoutB.getPaddingTop(), (int) (((double) linearLayoutB.getPaddingEnd()) * (zHasNext2 ? 1.0d : 1.5d)), linearLayoutB.getPaddingBottom());
                    linearLayoutB.measure(0, 0);
                    iMin = i15;
                    iMin2 = Math.min(linearLayoutB.getMeasuredWidth(), iMin);
                    if (iMin2 <= i14 - size.getWidth()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!zHasNext2 || iMin2 > i14) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    if (z15 && !z16) {
                        break;
                    }
                    linearLayoutB.setTag(menuItem2);
                    linearLayoutB.setOnClickListener(t4Var.L);
                    ra1Var.addView(linearLayoutB);
                    ViewGroup.LayoutParams layoutParams = linearLayoutB.getLayoutParams();
                    layoutParams.width = iMin2;
                    linearLayoutB.setLayoutParams(layoutParams);
                    i10 = i14 - iMin2;
                    it.remove();
                    z11 = false;
                }
            }
            if (linkedList.isEmpty()) {
                i11 = 0;
            } else {
                i11 = 0;
                ra1Var.setPaddingRelative(0, 0, size.getWidth(), 0);
            }
            ra1Var.measure(i11, i11);
            t4Var.J = new Size(ra1Var.getMeasuredWidth(), ra1Var.getMeasuredHeight());
            if (!linkedList.isEmpty()) {
                arrayAdapter = (ArrayAdapter) s4Var.getAdapter();
                arrayAdapter.clear();
                if (v4Var.f23910j != null) {
                    Collections.sort(linkedList, new k9.a(8));
                }
                size2 = linkedList.size();
                zPremiumFeaturesBlocked = MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked();
                i12 = 0;
                while (i12 < size2) {
                    menuItem = (MenuItem) linkedList.get(i12);
                    if (v4Var.f23910j == null) {
                        list3 = list2;
                    } else {
                        list3 = list2;
                        z13 = list3.contains(Integer.valueOf(menuItem.getItemId())) ? !zPremiumFeaturesBlocked : true;
                        if (z13) {
                            arrayAdapter.add(menuItem);
                        }
                        i12++;
                        list2 = list3;
                    }
                    if (z13) {
                        arrayAdapter.add(menuItem);
                    }
                    i12++;
                    list2 = list3;
                }
                s4Var.setAdapter((ListAdapter) arrayAdapter);
                if (t4Var.M) {
                    s4Var.setY(0.0f);
                } else {
                    s4Var.setY(size.getHeight());
                }
                count = s4Var.getAdapter().getCount();
                iMax = 0;
                for (i13 = 0; i13 < count; i13++) {
                    MenuItem menuItem3 = (MenuItem) s4Var.getAdapter().getItem(i13);
                    oVar = t4Var.f23796q;
                    LinearLayout linearLayout = (LinearLayout) oVar.d;
                    if (((t4) oVar.f4613e).Q.f23910j != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    e(linearLayout, menuItem3, z12);
                    linearLayout.measure(0, 0);
                    iMax = Math.max(linearLayout.getMeasuredWidth(), iMax);
                }
                Size size3 = new Size(Math.max(iMax, size.getWidth()), t4Var.c(4));
                t4Var.I = size3;
                t4.m(s4Var, size3);
            }
            t4Var.p();
            this.f23907f = arrayListD;
        } else {
            int size4 = arrayListD.size();
            int i16 = 0;
            while (true) {
                if (i16 < size4) {
                    MenuItem menuItem4 = (MenuItem) arrayListD.get(i16);
                    MenuItem menuItem5 = (MenuItem) this.f23907f.get(i16);
                    if (menuItem4.getItemId() == menuItem5.getItemId() && TextUtils.equals(menuItem4.getTitle(), menuItem5.getTitle()) && Objects.equals(menuItem4.getIcon(), menuItem5.getIcon()) && menuItem4.getGroupId() == menuItem5.getGroupId()) {
                        i16++;
                    }
                } else if (this.h) {
                }
                z10 = t4Var.F;
                Rect rect2 = t4Var.A;
                v4Var = t4Var.Q;
                if (!z10) {
                    t4Var.G = false;
                    t4Var.F = true;
                    t4Var.f23802x.cancel();
                    t4Var.f23801w.start();
                    t4Var.D.setEmpty();
                }
                MenuItem.OnMenuItemClickListener onMenuItemClickListener2 = this.f23908g;
                size = t4Var.H;
                t4Var.K = onMenuItemClickListener2;
                t4Var.d();
                t4Var.I = null;
                t4Var.J = null;
                t4Var.N = false;
                t4Var.n();
                ra1Var = t4Var.f23787g;
                ra1Var.removeAllViews();
                ra1Var.setPaddingRelative(0, 0, 0, 0);
                s4Var = t4Var.h;
                ArrayAdapter arrayAdapter3 = (ArrayAdapter) s4Var.getAdapter();
                arrayAdapter3.clear();
                s4Var.setAdapter((ListAdapter) arrayAdapter3);
                t4Var.f23786f.removeAllViews();
                t4Var.f23783b.getWindowVisibleDisplayFrame(rect2);
                iMin = Math.min(AndroidUtilities.dp(400.0f), rl.z(16.0f, 2, rect2.width()));
                linkedList = new LinkedList(arrayListD);
                it = linkedList.iterator();
                i10 = iMin;
                z11 = true;
                while (true) {
                    zHasNext = it.hasNext();
                    list = f23902r;
                    if (zHasNext) {
                        list2 = list;
                        break;
                    }
                    menuItem2 = (MenuItem) it.next();
                    zHasNext2 = it.hasNext();
                    z14 = !zHasNext2;
                    if (menuItem2 != null) {
                        i14 = i10;
                        list2 = list;
                        LinearLayout linearLayoutB2 = b(v4Var, t4Var.f23782a, menuItem2, false, z11, z14);
                        linearLayoutB2.setGravity(17);
                        if (z11) {
                            d = 1.5d;
                        } else {
                            d = 1.0d;
                        }
                        int i17 = iMin;
                        linearLayoutB2.setPaddingRelative((int) (d * ((double) linearLayoutB2.getPaddingStart())), linearLayoutB2.getPaddingTop(), (int) (((double) linearLayoutB2.getPaddingEnd()) * (zHasNext2 ? 1.0d : 1.5d)), linearLayoutB2.getPaddingBottom());
                        linearLayoutB2.measure(0, 0);
                        iMin = i17;
                        iMin2 = Math.min(linearLayoutB2.getMeasuredWidth(), iMin);
                        if (iMin2 <= i14 - size.getWidth()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (zHasNext2) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (z15) {
                        }
                        linearLayoutB2.setTag(menuItem2);
                        linearLayoutB2.setOnClickListener(t4Var.L);
                        ra1Var.addView(linearLayoutB2);
                        ViewGroup.LayoutParams layoutParams2 = linearLayoutB2.getLayoutParams();
                        layoutParams2.width = iMin2;
                        linearLayoutB2.setLayoutParams(layoutParams2);
                        i10 = i14 - iMin2;
                        it.remove();
                        z11 = false;
                    } else {
                        i14 = i10;
                        list2 = list;
                        LinearLayout linearLayoutB3 = b(v4Var, t4Var.f23782a, menuItem2, false, z11, z14);
                        linearLayoutB3.setGravity(17);
                        if (z11) {
                            d = 1.5d;
                        } else {
                            d = 1.0d;
                        }
                        int i18 = iMin;
                        linearLayoutB3.setPaddingRelative((int) (d * ((double) linearLayoutB3.getPaddingStart())), linearLayoutB3.getPaddingTop(), (int) (((double) linearLayoutB3.getPaddingEnd()) * (zHasNext2 ? 1.0d : 1.5d)), linearLayoutB3.getPaddingBottom());
                        linearLayoutB3.measure(0, 0);
                        iMin = i18;
                        iMin2 = Math.min(linearLayoutB3.getMeasuredWidth(), iMin);
                        if (iMin2 <= i14 - size.getWidth()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (zHasNext2) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (z15) {
                        }
                        linearLayoutB3.setTag(menuItem2);
                        linearLayoutB3.setOnClickListener(t4Var.L);
                        ra1Var.addView(linearLayoutB3);
                        ViewGroup.LayoutParams layoutParams3 = linearLayoutB3.getLayoutParams();
                        layoutParams3.width = iMin2;
                        linearLayoutB3.setLayoutParams(layoutParams3);
                        i10 = i14 - iMin2;
                        it.remove();
                        z11 = false;
                    }
                }
                if (linkedList.isEmpty()) {
                    i11 = 0;
                    ra1Var.setPaddingRelative(0, 0, size.getWidth(), 0);
                } else {
                    i11 = 0;
                }
                ra1Var.measure(i11, i11);
                t4Var.J = new Size(ra1Var.getMeasuredWidth(), ra1Var.getMeasuredHeight());
                if (!linkedList.isEmpty()) {
                    arrayAdapter = (ArrayAdapter) s4Var.getAdapter();
                    arrayAdapter.clear();
                    if (v4Var.f23910j != null) {
                        Collections.sort(linkedList, new k9.a(8));
                    }
                    size2 = linkedList.size();
                    zPremiumFeaturesBlocked = MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked();
                    i12 = 0;
                    while (i12 < size2) {
                        menuItem = (MenuItem) linkedList.get(i12);
                        if (v4Var.f23910j == null) {
                            list3 = list2;
                        } else {
                            list3 = list2;
                            if (list3.contains(Integer.valueOf(menuItem.getItemId()))) {
                            }
                            if (z13) {
                                arrayAdapter.add(menuItem);
                            }
                            i12++;
                            list2 = list3;
                        }
                        if (z13) {
                            arrayAdapter.add(menuItem);
                        }
                        i12++;
                        list2 = list3;
                    }
                    s4Var.setAdapter((ListAdapter) arrayAdapter);
                    if (t4Var.M) {
                        s4Var.setY(0.0f);
                    } else {
                        s4Var.setY(size.getHeight());
                    }
                    count = s4Var.getAdapter().getCount();
                    iMax = 0;
                    while (i13 < count) {
                        MenuItem menuItem6 = (MenuItem) s4Var.getAdapter().getItem(i13);
                        oVar = t4Var.f23796q;
                        LinearLayout linearLayout2 = (LinearLayout) oVar.d;
                        if (((t4) oVar.f4613e).Q.f23910j != null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        e(linearLayout2, menuItem6, z12);
                        linearLayout2.measure(0, 0);
                        iMax = Math.max(linearLayout2.getMeasuredWidth(), iMax);
                    }
                    Size size5 = new Size(Math.max(iMax, size.getWidth()), t4Var.c(4));
                    t4Var.I = size5;
                    t4.m(s4Var, size5);
                }
                t4Var.p();
                this.f23907f = arrayListD;
            }
        }
        boolean zF = t4Var.f();
        Point point = t4Var.B;
        PopupWindow popupWindow = t4Var.f23784c;
        Rect rect3 = this.d;
        Rect rect4 = this.f23905c;
        if (zF) {
            if (!rect3.equals(rect4) && t4Var.f() && popupWindow.isShowing()) {
                t4Var.d();
                t4Var.i(rect4);
                t4Var.h();
                popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
            }
        } else if (!t4Var.f()) {
            t4Var.G = false;
            t4Var.F = false;
            t4Var.f23801w.cancel();
            t4Var.f23802x.cancel();
            t4Var.d();
            t4Var.i(rect4);
            t4Var.h();
            popupWindow.showAtLocation(t4Var.f23783b, 0, point.x, point.y);
            t4Var.v.start();
        }
        this.h = false;
        rect3.set(rect4);
    }

    public final ArrayList d(Menu menu) {
        bt btVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; menu != null && i10 < menu.size(); i10++) {
            MenuItem item = menu.getItem(i10);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (btVar = this.f23911k) == null || ((Boolean) btVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.f23910j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
