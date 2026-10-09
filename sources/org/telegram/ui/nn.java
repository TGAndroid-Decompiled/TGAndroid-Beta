package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class nn extends View {
    public final ArrayList f40237a;
    public final ArrayList f40238b;
    public final zn f40239c;

    public nn(zn znVar, Context context) {
        super(context);
        this.f40239c = znVar;
        this.f40237a = new ArrayList();
        this.f40238b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f40237a;
        arrayList.clear();
        zn znVar = this.f40239c;
        arrayList.add(znVar.K1);
        arrayList.add(znVar.f44990x0);
        arrayList.add(znVar.X);
        arrayList.add(znVar.K3);
        arrayList.add(znVar.I1);
        arrayList.add(znVar.X2);
        arrayList.add(znVar.Y);
        arrayList.add(znVar.f44815j1);
        arrayList.add(znVar.S);
        arrayList.add(znVar.R1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zn znVar = this.f40239c;
        znVar.f44923rc = true;
        ArrayList arrayList = this.f40238b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        znVar.f44923rc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        zn znVar = this.f40239c;
        znVar.f44923rc = true;
        ArrayList arrayList = this.f40237a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f40238b.add(view);
            }
        }
        znVar.f44923rc = false;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.f40237a;
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
