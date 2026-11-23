package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public abstract class mg extends ot {
    public tc f37508e2;
    public final ChatActivityEnterView f37509f2;

    public mg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f37509f2 = chatActivityEnterView;
    }

    @Override
    public final void E() {
        ng ngVar = this.f37509f2.P3;
        if (ngVar != null) {
            ngVar.i2();
        }
    }

    @Override
    public final void F() {
        ng ngVar = this.f37509f2.P3;
        if (ngVar != null) {
            ngVar.g();
        }
    }

    public final void J(Uri uri, String str) {
        boolean z10;
        org.telegram.ui.bn bnVar = this.f37509f2.F3;
        if (bnVar != null && bnVar.z()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.f22810e.c(new g(this, uri, org.telegram.messenger.g0.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), z10), 4));
    }

    public final void K(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f37509f2;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null && bnVar.getParentActivity() != null) {
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList.get(0);
            if (chatActivityEnterView.f32691p3) {
                org.telegram.messenger.g0.v1(this);
                org.telegram.messenger.g0.h3(new a9.h(this, arrayList, file, false, 9), 100L);
                return;
            }
            PhotoViewer.p1().I2(null, bnVar, chatActivityEnterView.M4);
            PhotoViewer.p1().f2(arrayList, 0, 2, false, new lg(this, ffVar, file), chatActivityEnterView.F3);
        }
    }

    public final void L(qf qfVar, boolean z10, int i7, int i10) {
        org.telegram.messenger.gj threadMessage;
        org.telegram.messenger.gj threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.f37509f2;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        org.telegram.ui.eg0 eg0Var = chatActivityEnterView.M0;
        org.telegram.messenger.cw cwVar = null;
        if (eg0Var != null) {
            eg0Var.h(true);
            chatActivityEnterView.M0 = null;
        }
        org.telegram.ui.rm rmVar = chatActivityEnterView.L3;
        if (rmVar != null && bnVar != null && rmVar.f51623f) {
            bnVar.yc();
            return;
        }
        t0.h hVar = (t0.h) qfVar.f38896b;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            org.telegram.messenger.c cVar = chatActivityEnterView.S;
            Uri c10 = hVar.c();
            long j3 = chatActivityEnterView.G3;
            org.telegram.messenger.gj gjVar = chatActivityEnterView.J3;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.rm rmVar2 = chatActivityEnterView.L3;
            if (bnVar != null) {
                cwVar = bnVar.Y8();
            }
            org.telegram.messenger.az.T(cVar, null, null, c10, null, "image/gif", j3, gjVar, threadMessage2, null, rmVar2, z10, qfVar, cwVar);
        } else {
            org.telegram.messenger.c cVar2 = chatActivityEnterView.S;
            Uri c11 = hVar.c();
            long j10 = chatActivityEnterView.G3;
            org.telegram.messenger.gj gjVar2 = chatActivityEnterView.J3;
            threadMessage = chatActivityEnterView.getThreadMessage();
            if (bnVar != null) {
                cwVar = bnVar.Y8();
            }
            org.telegram.messenger.az.Y(cVar2, c11, j10, gjVar2, threadMessage, qfVar, null, z10, 0, cwVar);
        }
        ng ngVar = chatActivityEnterView.P3;
        if (ngVar != null) {
            ngVar.H(null, true, i7, i10, 0L);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mg.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 getResourcesProvider() {
        return this.f37509f2.M4;
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.f37509f2;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null) {
            bnVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.C0(menu);
        }
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f37509f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i7 = ChatActivityEnterView.f32569s7;
            if (chatActivityEnterView.R2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !chatActivityEnterView.f32695p7) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new c0(this, 17));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new c0(this, 17));
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            return onCreateInputConnection;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ChatActivityEnterView chatActivityEnterView = this.f37509f2;
        chatActivityEnterView.T = z10;
        super.onMeasure(i7, i10);
        if (chatActivityEnterView.T) {
            chatActivityEnterView.U = getLineCount();
            if (chatActivityEnterView.U > 2 && !TextUtils.isEmpty(getText().toString().trim())) {
                z11 = true;
            } else {
                z11 = false;
            }
            chatActivityEnterView.T1(z11);
            if (chatActivityEnterView.U <= 2 || TextUtils.isEmpty(getText().toString().trim())) {
                z12 = false;
            }
            chatActivityEnterView.Z1(z12);
        }
        chatActivityEnterView.T = false;
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        ng ngVar = this.f37509f2.P3;
        if (ngVar != null) {
            ngVar.b0();
        }
    }

    @Override
    public final void onSelectionChanged(int i7, int i10) {
        boolean z10;
        a70 a70Var;
        gf gfVar;
        super.onSelectionChanged(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.f37509f2;
        ng ngVar = chatActivityEnterView.P3;
        if (ngVar != null) {
            ngVar.G();
        }
        fe feVar = chatActivityEnterView.R0;
        if (feVar != null) {
            if (chatActivityEnterView.F3 != null && (gfVar = chatActivityEnterView.F0) != null && gfVar.getSelectionEnd() != chatActivityEnterView.F0.getSelectionStart()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (feVar.f33520x != z10) {
                feVar.f33520x = z10;
                feVar.invalidate();
            }
            if (!z10 && (a70Var = chatActivityEnterView.V6) != null) {
                a70Var.v();
                chatActivityEnterView.V6 = null;
            }
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i7) {
        if (i7 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f37509f2;
            chatActivityEnterView.N2 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.R2 == null) {
                J(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f37509f2;
        if (!chatActivityEnterView.f32730u4 && chatActivityEnterView.f32709r4 == null) {
            if (!chatActivityEnterView.A0 && !chatActivityEnterView.Q0()) {
                if (this.f37508e2 == null) {
                    tc tcVar = new tc(this);
                    this.f37508e2 = tcVar;
                    tcVar.h = new Runnable(this) {
                        public final mg f36910b;

                        {
                            this.f36910b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r2;
                            mg mgVar = this.f36910b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = mgVar.f37509f2;
                                    int i11 = ChatActivityEnterView.f32569s7;
                                    chatActivityEnterView2.Y1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = mgVar.f37509f2;
                                    chatActivityEnterView3.f32584b4 = false;
                                    chatActivityEnterView3.j1();
                                    return;
                            }
                        }
                    };
                }
                tc tcVar2 = this.f37508e2;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                tcVar2.getClass();
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = 0;
                rectF.set(f10, f10, measuredWidth, measuredHeight);
                tcVar2.f39856i = false;
                tcVar2.f39852c = 0;
                tcVar2.a(rectF);
                return this.f37508e2.b(motionEvent);
            } else if (chatActivityEnterView.S0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.H2 != 0) {
                    chatActivityEnterView.P1(0, false);
                    chatActivityEnterView.V0.t(false);
                    requestFocus();
                }
                if (org.telegram.messenger.g0.D) {
                    i7 = 0;
                } else {
                    i7 = 2;
                }
                chatActivityEnterView.X1(i7, 0, true, true);
                if (chatActivityEnterView.f32692p4) {
                    chatActivityEnterView.Q1(false, true, false, true);
                    chatActivityEnterView.f32584b4 = true;
                    org.telegram.messenger.g0.h3(new Runnable(this) {
                        public final mg f36910b;

                        {
                            this.f36910b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r2;
                            mg mgVar = this.f36910b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = mgVar.f37509f2;
                                    int i11 = ChatActivityEnterView.f32569s7;
                                    chatActivityEnterView2.Y1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = mgVar.f37509f2;
                                    chatActivityEnterView3.f32584b4 = false;
                                    chatActivityEnterView3.j1();
                                    return;
                            }
                        }
                    }, 200L);
                    return true;
                }
                chatActivityEnterView.j1();
                return true;
            } else {
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean requestFocus(int i7, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.f37509f2;
        if (!chatActivityEnterView.A0 && !chatActivityEnterView.Q0()) {
            return false;
        }
        chatActivityEnterView.getClass();
        return super.requestFocus(i7, rect);
    }

    @Override
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = org.telegram.messenger.g0.L(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override
    public void setOffsetY(float f10) {
        super.setOffsetY(f10);
        ChatActivityEnterView chatActivityEnterView = this.f37509f2;
        if (chatActivityEnterView.f32591c2.getForeground() != null) {
            du0 du0Var = chatActivityEnterView.f32591c2;
            du0Var.invalidateDrawable(du0Var.getForeground());
        }
    }
}
