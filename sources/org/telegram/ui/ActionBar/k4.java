package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.PopupMenu;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class k4 extends ActionMode {
    public final Context f21098a;
    public final ActionMode.Callback2 f21099b;
    public final Menu f21100c;
    public final Rect d;
    public final Rect e;
    public final Rect f21101f;
    public final int[] f21102g;
    public final int[] h;
    public final int[] f21103i;
    public final Rect f21104j;
    public final Rect f21105k;
    public final Rect f21106l;
    public final View f21107m;
    public final Point f21108n;
    public final int f21109o;
    public final i4 f21110p = new i4(this, 0);
    public final i4 f21111q = new i4(this, 1);
    public final a5 f21112r;
    public final j4 f21113s;

    public k4(Context context, ActionMode.Callback2 callback2, View view, a5 a5Var) {
        this.f21098a = context;
        this.f21099b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f21100c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                k4 k4Var = k4.this;
                return k4Var.f21099b.onActionItemClicked(k4Var, menuItem);
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f21101f = new Rect();
        int[] iArr = new int[2];
        this.f21102g = iArr;
        this.h = new int[2];
        this.f21103i = new int[2];
        this.f21104j = new Rect();
        this.f21105k = new Rect();
        this.f21106l = new Rect();
        this.f21107m = view;
        view.getLocationOnScreen(iArr);
        this.f21109o = AndroidUtilities.dp(20.0f);
        this.f21108n = new Point();
        a5Var.e = menu;
        a5Var.f20696g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                k4 k4Var = k4.this;
                return k4Var.f21099b.onActionItemClicked(k4Var, menuItem);
            }
        };
        this.f21112r = a5Var;
        j4 j4Var = new j4(a5Var);
        this.f21113s = j4Var;
        j4Var.f20994b = false;
        j4Var.f20995c = false;
        j4Var.d = false;
        j4Var.e = true;
        j4Var.f20996f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.e;
        rect2.set(rect);
        View view = this.f21107m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f21103i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f21102g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f21098a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f21108n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f21106l;
        rect3.set(0, 0, i10, i11);
        boolean a2 = a(rect2, rect3);
        Rect rect4 = this.f21101f;
        if (a2) {
            Rect rect5 = this.f21104j;
            if (a(rect2, rect5)) {
                this.f21113s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f21109o));
                if (!rect2.equals(rect4)) {
                    i4 i4Var = this.f21110p;
                    view.removeCallbacks(i4Var);
                    j4 j4Var = this.f21113s;
                    j4Var.getClass();
                    if (System.currentTimeMillis() - j4Var.f20997g > 500) {
                        j4Var.f20995c = true;
                    }
                    view.postDelayed(i4Var, 50L);
                    this.f21112r.f20694c.set(rect2);
                    a5 a5Var = this.f21112r;
                    if (a5Var.f20693b.f()) {
                        a5Var.c();
                    }
                }
                this.f21113s.a();
                rect4.set(rect2);
            }
        }
        this.f21113s.d = true;
        rect2.setEmpty();
        this.f21113s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f21107m;
        int[] iArr = this.f21102g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f21103i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f21104j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f21105k;
        if (equals && rect.equals(rect2)) {
            return;
        }
        b();
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        rect2.set(rect);
    }

    @Override
    public final void finish() {
        a5 a5Var = this.f21112r;
        a5Var.f20692a.removeOnLayoutChangeListener(a5Var.f20700l);
        y4 y4Var = a5Var.f20693b;
        if (!y4Var.F) {
            y4Var.G = false;
            y4Var.F = true;
            y4Var.f22011x.cancel();
            y4Var.f22010w.start();
            y4Var.D.setEmpty();
        }
        j4 j4Var = this.f21113s;
        j4Var.f20996f = false;
        a5 a5Var2 = j4Var.f20993a;
        a5Var2.f20692a.removeOnLayoutChangeListener(a5Var2.f20700l);
        y4 y4Var2 = a5Var2.f20693b;
        if (!y4Var2.F) {
            y4Var2.G = false;
            y4Var2.F = true;
            y4Var2.f22011x.cancel();
            y4Var2.f22010w.start();
            y4Var2.D.setEmpty();
        }
        i4 i4Var = this.f21110p;
        View view = this.f21107m;
        view.removeCallbacks(i4Var);
        view.removeCallbacks(this.f21111q);
        this.f21099b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f21100c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f21098a);
    }

    @Override
    public final CharSequence getSubtitle() {
        return null;
    }

    @Override
    public final CharSequence getTitle() {
        return null;
    }

    @Override
    public final void hide(long j10) {
        if (j10 == -1) {
            j10 = ViewConfiguration.getDefaultActionModeHideDuration();
        }
        long min = Math.min(3000L, j10);
        View view = this.f21107m;
        i4 i4Var = this.f21111q;
        view.removeCallbacks(i4Var);
        if (min <= 0) {
            i4Var.run();
            return;
        }
        j4 j4Var = this.f21113s;
        j4Var.f20994b = true;
        j4Var.a();
        view.postDelayed(i4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f21099b.onPrepareActionMode(this, this.f21100c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f21099b;
        View view = this.f21107m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        b();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        j4 j4Var = this.f21113s;
        j4Var.e = z10;
        j4Var.a();
    }

    @Override
    public final void setSubtitle(int i10) {
    }

    @Override
    public final void setTitle(int i10) {
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
    }

    @Override
    public final void setCustomView(View view) {
    }
}
