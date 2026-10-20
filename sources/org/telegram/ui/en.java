package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class en extends View {
    public final ArrayList f36687a;
    public final ArrayList f36688b;
    public final qn f36689c;

    public en(qn qnVar, Context context) {
        super(context);
        this.f36689c = qnVar;
        this.f36687a = new ArrayList();
        this.f36688b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f36687a;
        arrayList.clear();
        qn qnVar = this.f36689c;
        arrayList.add(qnVar.K1);
        arrayList.add(qnVar.f40901x0);
        arrayList.add(qnVar.X);
        arrayList.add(qnVar.K3);
        arrayList.add(qnVar.I1);
        arrayList.add(qnVar.X2);
        arrayList.add(qnVar.Y);
        arrayList.add(qnVar.f40725j1);
        arrayList.add(qnVar.S);
        arrayList.add(qnVar.R1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qn qnVar = this.f36689c;
        qnVar.f40848sc = true;
        ArrayList arrayList = this.f36688b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        qnVar.f40848sc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        qn qnVar = this.f36689c;
        qnVar.f40848sc = true;
        ArrayList arrayList = this.f36687a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f36688b.add(view);
            }
        }
        qnVar.f40848sc = false;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.f36687a;
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
