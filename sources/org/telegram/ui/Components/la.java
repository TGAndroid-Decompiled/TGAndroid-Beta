package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;
import org.telegram.messenger.AndroidUtilities;
public final class la {
    public int f28317a;
    public final View f28318b;
    public final ArrayList f28319c;
    public final ArrayList d;
    public final ArrayList f28320e;
    public final Object f28321f;
    public EGLContext f28322g;
    public final Object h;
    public int f28323i;
    public ci.xb f28324j;
    public Object f28325k;
    public Object f28326l;
    public ra f28327m;
    public final qa f28328n;
    public Bitmap f28329o;
    public int f28330p;

    public la(View view) {
        ArrayList arrayList = new ArrayList();
        this.f28319c = arrayList;
        this.d = new ArrayList();
        this.f28320e = new ArrayList();
        this.f28321f = new Object();
        this.h = new Object();
        this.f28328n = new qa(0, new rg(this, 14));
        this.f28330p = 0;
        this.f28318b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new ai.v2(this, 5));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f28321f) {
            try {
                if (this.f28322g == null) {
                    this.f28322g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ra raVar = this.f28327m;
        if (raVar == null) {
            return this.f28329o;
        }
        synchronized (raVar.f30476n) {
            try {
                if (!raVar.f30479q) {
                    bitmap = null;
                } else {
                    bitmap = raVar.f30478p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f28329o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f28326l != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((pa) obj).f29807b.invalidate();
        }
        ArrayList arrayList2 = this.f28320e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        ra raVar = this.f28327m;
        if (raVar != null) {
            synchronized (raVar.f30476n) {
                raVar.f30479q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f28330p;
        this.f28330p = i10 + 1;
        sb2.append(i10);
        this.f28329o = this.f28328n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ci.xb xbVar, Object obj) {
        this.f28324j = xbVar;
        this.f28325k = obj;
        this.f28323i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f28326l = renderNode2;
            return;
        }
        this.f28326l = null;
    }
}
