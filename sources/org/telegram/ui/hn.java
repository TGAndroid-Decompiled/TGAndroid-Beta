package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class hn extends View {
    public final ArrayList f37999a;
    public final ArrayList f38000b;
    public final un f38001c;

    public hn(un unVar, Context context) {
        super(context);
        this.f38001c = unVar;
        this.f37999a = new ArrayList();
        this.f38000b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f37999a;
        arrayList.clear();
        un unVar = this.f38001c;
        arrayList.add(unVar.Y1);
        arrayList.add(unVar.f42492z0);
        arrayList.add(unVar.Y);
        arrayList.add(unVar.Y3);
        arrayList.add(unVar.W1);
        arrayList.add(unVar.f42319l3);
        arrayList.add(unVar.Z);
        arrayList.add(unVar.f42468x1);
        arrayList.add(unVar.T);
        arrayList.add(unVar.f42246f2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        un unVar = this.f38001c;
        unVar.Nc = true;
        ArrayList arrayList = this.f38000b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        unVar.Nc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        un unVar = this.f38001c;
        unVar.Nc = true;
        ArrayList arrayList = this.f37999a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f38000b.add(view);
            }
        }
        unVar.Nc = false;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.f37999a;
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
