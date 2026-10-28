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
public final class m4 extends ActionMode {
    public final Context f22867a;
    public final ActionMode.Callback2 f22868b;
    public final Menu f22869c;
    public final Rect d;
    public final Rect e;
    public final Rect f22870f;
    public final int[] f22871g;
    public final int[] h;
    public final int[] f22872i;
    public final Rect f22873j;
    public final Rect f22874k;
    public final Rect f22875l;
    public final View f22876m;
    public final Point f22877n;
    public final int f22878o;
    public final k4 f22879p = new k4(this, 0);
    public final k4 f22880q = new k4(this, 1);
    public final c5 f22881r;
    public final l4 f22882s;

    public m4(Context context, ActionMode.Callback2 callback2, View view, c5 c5Var) {
        this.f22867a = context;
        this.f22868b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f22869c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                m4 m4Var = m4.this;
                return m4Var.f22868b.onActionItemClicked(m4Var, menuItem);
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f22870f = new Rect();
        int[] iArr = new int[2];
        this.f22871g = iArr;
        this.h = new int[2];
        this.f22872i = new int[2];
        this.f22873j = new Rect();
        this.f22874k = new Rect();
        this.f22875l = new Rect();
        this.f22876m = view;
        view.getLocationOnScreen(iArr);
        this.f22878o = AndroidUtilities.dp(20.0f);
        this.f22877n = new Point();
        c5Var.e = menu;
        c5Var.f22510g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                m4 m4Var = m4.this;
                return m4Var.f22868b.onActionItemClicked(m4Var, menuItem);
            }
        };
        this.f22881r = c5Var;
        l4 l4Var = new l4(c5Var);
        this.f22882s = l4Var;
        l4Var.f22829b = false;
        l4Var.f22830c = false;
        l4Var.d = false;
        l4Var.e = true;
        l4Var.f22831f = true;
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
        View view = this.f22876m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f22872i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f22871g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f22867a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f22877n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f22875l;
        rect3.set(0, 0, i10, i11);
        boolean a2 = a(rect2, rect3);
        Rect rect4 = this.f22870f;
        if (a2) {
            Rect rect5 = this.f22873j;
            if (a(rect2, rect5)) {
                this.f22882s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f22878o));
                if (!rect2.equals(rect4)) {
                    k4 k4Var = this.f22879p;
                    view.removeCallbacks(k4Var);
                    l4 l4Var = this.f22882s;
                    l4Var.getClass();
                    if (System.currentTimeMillis() - l4Var.f22832g > 500) {
                        l4Var.f22830c = true;
                    }
                    view.postDelayed(k4Var, 50L);
                    this.f22881r.f22508c.set(rect2);
                    c5 c5Var = this.f22881r;
                    if (c5Var.f22507b.f()) {
                        c5Var.c();
                    }
                }
                this.f22882s.a();
                rect4.set(rect2);
            }
        }
        this.f22882s.d = true;
        rect2.setEmpty();
        this.f22882s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f22876m;
        int[] iArr = this.f22871g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f22872i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f22873j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f22874k;
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
        c5 c5Var = this.f22881r;
        c5Var.f22506a.removeOnLayoutChangeListener(c5Var.f22514l);
        a5 a5Var = c5Var.f22507b;
        if (!a5Var.F) {
            a5Var.G = false;
            a5Var.F = true;
            a5Var.f22417x.cancel();
            a5Var.f22416w.start();
            a5Var.D.setEmpty();
        }
        l4 l4Var = this.f22882s;
        l4Var.f22831f = false;
        c5 c5Var2 = l4Var.f22828a;
        c5Var2.f22506a.removeOnLayoutChangeListener(c5Var2.f22514l);
        a5 a5Var2 = c5Var2.f22507b;
        if (!a5Var2.F) {
            a5Var2.G = false;
            a5Var2.F = true;
            a5Var2.f22417x.cancel();
            a5Var2.f22416w.start();
            a5Var2.D.setEmpty();
        }
        k4 k4Var = this.f22879p;
        View view = this.f22876m;
        view.removeCallbacks(k4Var);
        view.removeCallbacks(this.f22880q);
        this.f22868b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f22869c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f22867a);
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
        View view = this.f22876m;
        k4 k4Var = this.f22880q;
        view.removeCallbacks(k4Var);
        if (min <= 0) {
            k4Var.run();
            return;
        }
        l4 l4Var = this.f22882s;
        l4Var.f22829b = true;
        l4Var.a();
        view.postDelayed(k4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f22868b.onPrepareActionMode(this, this.f22869c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f22868b;
        View view = this.f22876m;
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
        l4 l4Var = this.f22882s;
        l4Var.e = z10;
        l4Var.a();
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
