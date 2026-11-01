package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class hn extends View {
    public final ArrayList f37837a;
    public final ArrayList f37838b;
    public final un f37839c;

    public hn(un unVar, Context context) {
        super(context);
        this.f37839c = unVar;
        this.f37837a = new ArrayList();
        this.f37838b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f37837a;
        arrayList.clear();
        un unVar = this.f37839c;
        arrayList.add(unVar.Y1);
        arrayList.add(unVar.f42303z0);
        arrayList.add(unVar.Y);
        arrayList.add(unVar.Y3);
        arrayList.add(unVar.W1);
        arrayList.add(unVar.f42130l3);
        arrayList.add(unVar.Z);
        arrayList.add(unVar.f42279x1);
        arrayList.add(unVar.T);
        arrayList.add(unVar.f42057f2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        un unVar = this.f37839c;
        unVar.Oc = true;
        ArrayList arrayList = this.f37838b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        unVar.Oc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        un unVar = this.f37839c;
        unVar.Oc = true;
        ArrayList arrayList = this.f37837a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f37838b.add(view);
            }
        }
        unVar.Oc = false;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.f37837a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f7);
            }
        }
    }
}
