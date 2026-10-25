package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class hn extends View {
    public final ArrayList f40036a;
    public final ArrayList f40037b;
    public final un f40038c;

    public hn(un unVar, Context context) {
        super(context);
        this.f40038c = unVar;
        this.f40036a = new ArrayList();
        this.f40037b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f40036a;
        arrayList.clear();
        un unVar = this.f40038c;
        arrayList.add(unVar.W1);
        arrayList.add(unVar.f44468x0);
        arrayList.add(unVar.X);
        arrayList.add(unVar.W3);
        arrayList.add(unVar.U1);
        arrayList.add(unVar.f44294j3);
        arrayList.add(unVar.Y);
        arrayList.add(unVar.f44442v1);
        arrayList.add(unVar.S);
        arrayList.add(unVar.f44219d2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        un unVar = this.f40038c;
        unVar.Oc = true;
        ArrayList arrayList = this.f40037b;
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
        un unVar = this.f40038c;
        unVar.Oc = true;
        ArrayList arrayList = this.f40036a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f40037b.add(view);
            }
        }
        unVar.Oc = false;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.f40036a;
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
