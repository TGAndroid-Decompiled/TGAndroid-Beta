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
public abstract class tf extends xs {
    public nc Z1;
    public final ChatActivityEnterView f38406a2;

    public tf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f38406a2 = chatActivityEnterView;
    }

    @Override
    public final void D() {
        uf ufVar = this.f38406a2.f31087a3;
        if (ufVar != null) {
            ufVar.O1();
        }
    }

    @Override
    public final void E() {
        uf ufVar = this.f38406a2.f31087a3;
        if (ufVar != null) {
            ufVar.f();
        }
    }

    public final void I(Uri uri, String str) {
        boolean z10;
        org.telegram.ui.wm wmVar = this.f38406a2.Q2;
        if (wmVar != null && wmVar.z()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.f21387e.c(new e7(this, uri, org.telegram.messenger.g0.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), z10), 2));
    }

    public final void J(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f38406a2;
        org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
        if (wmVar != null && wmVar.getParentActivity() != null) {
            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) arrayList.get(0);
            if (chatActivityEnterView.A2) {
                org.telegram.messenger.g0.v1(this);
                org.telegram.messenger.g0.i3(new com.google.android.gms.common.api.internal.j1(this, arrayList, file, 8), 100L);
                return;
            }
            PhotoViewer.v1().N2(null, wmVar, chatActivityEnterView.X3);
            PhotoViewer.v1().j2(arrayList, 0, 2, false, new sf(this, yeVar, file), chatActivityEnterView.Q2);
        }
    }

    public final void K(y00 y00Var, boolean z10, int i3, int i10) {
        org.telegram.messenger.zi threadMessage;
        org.telegram.messenger.zi threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.f38406a2;
        org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
        se seVar = chatActivityEnterView.M0;
        org.telegram.messenger.zv zvVar = null;
        if (seVar != null) {
            seVar.g(true);
            chatActivityEnterView.M0 = null;
        }
        org.telegram.ui.mm mmVar = chatActivityEnterView.W2;
        if (mmVar != null && wmVar != null && mmVar.f47704f) {
            wmVar.uc();
            return;
        }
        t0.h hVar = (t0.h) y00Var.f40562a;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            org.telegram.messenger.c cVar = chatActivityEnterView.S;
            Uri a10 = hVar.a();
            long j10 = chatActivityEnterView.R2;
            org.telegram.messenger.zi ziVar = chatActivityEnterView.U2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.mm mmVar2 = chatActivityEnterView.W2;
            if (wmVar != null) {
                zvVar = wmVar.W8();
            }
            org.telegram.messenger.yy.T(cVar, null, null, a10, null, "image/gif", j10, ziVar, threadMessage2, null, mmVar2, z10, y00Var, zvVar);
        } else {
            org.telegram.messenger.c cVar2 = chatActivityEnterView.S;
            Uri a11 = hVar.a();
            long j11 = chatActivityEnterView.R2;
            org.telegram.messenger.zi ziVar2 = chatActivityEnterView.U2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            if (wmVar != null) {
                zvVar = wmVar.W8();
            }
            org.telegram.messenger.yy.Y(cVar2, a11, j11, ziVar2, threadMessage, y00Var, null, z10, 0, zvVar);
        }
        uf ufVar = chatActivityEnterView.f31087a3;
        if (ufVar != null) {
            ufVar.G(null, true, i3, i10, 0L);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tf.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        return this.f38406a2.X3;
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.f38406a2;
        org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
        if (wmVar != null) {
            wmVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.e0(menu);
        }
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f38406a2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i3 = ChatActivityEnterView.f31082t5;
            if (chatActivityEnterView.c2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !chatActivityEnterView.f31184q5) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new t(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new t(this, 18));
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            return onCreateInputConnection;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ChatActivityEnterView chatActivityEnterView = this.f38406a2;
        chatActivityEnterView.T = z10;
        super.onMeasure(i3, i10);
        if (chatActivityEnterView.T) {
            chatActivityEnterView.U = getLineCount();
            if (chatActivityEnterView.U > 2 && !TextUtils.isEmpty(getText().toString().trim())) {
                z11 = true;
            } else {
                z11 = false;
            }
            chatActivityEnterView.o1(z11);
            if (chatActivityEnterView.U <= 2 || TextUtils.isEmpty(getText().toString().trim())) {
                z12 = false;
            }
            chatActivityEnterView.u1(z12);
        }
        chatActivityEnterView.T = false;
    }

    @Override
    public final void onScrollChanged(int i3, int i10, int i11, int i12) {
        super.onScrollChanged(i3, i10, i11, i12);
        uf ufVar = this.f38406a2.f31087a3;
        if (ufVar != null) {
            ufVar.g0();
        }
    }

    @Override
    public final void onSelectionChanged(int i3, int i10) {
        boolean z10;
        f60 f60Var;
        ve veVar;
        super.onSelectionChanged(i3, i10);
        ChatActivityEnterView chatActivityEnterView = this.f38406a2;
        uf ufVar = chatActivityEnterView.f31087a3;
        if (ufVar != null) {
            ufVar.F();
        }
        ud udVar = chatActivityEnterView.R0;
        if (udVar != null) {
            if (chatActivityEnterView.Q2 != null && (veVar = chatActivityEnterView.F0) != null && veVar.getSelectionEnd() != chatActivityEnterView.F0.getSelectionStart()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (udVar.f34384x != z10) {
                udVar.f34384x = z10;
                udVar.invalidate();
            }
            if (!z10 && (f60Var = chatActivityEnterView.Z4) != null) {
                f60Var.u();
                chatActivityEnterView.Z4 = null;
            }
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i3) {
        if (i3 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f38406a2;
            chatActivityEnterView.Y1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.c2 == null) {
                I(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i3);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i3;
        ChatActivityEnterView chatActivityEnterView = this.f38406a2;
        if (!chatActivityEnterView.F3 && chatActivityEnterView.C3 == null) {
            if (!chatActivityEnterView.A0 && !chatActivityEnterView.p0()) {
                if (this.Z1 == null) {
                    nc ncVar = new nc(this);
                    this.Z1 = ncVar;
                    ncVar.h = new Runnable(this) {
                        public final tf f37718b;

                        {
                            this.f37718b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r2;
                            tf tfVar = this.f37718b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = tfVar.f38406a2;
                                    int i11 = ChatActivityEnterView.f31082t5;
                                    chatActivityEnterView2.t1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = tfVar.f38406a2;
                                    chatActivityEnterView3.f31158m3 = false;
                                    chatActivityEnterView3.H0();
                                    return;
                            }
                        }
                    };
                }
                nc ncVar2 = this.Z1;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                ncVar2.getClass();
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = 0;
                rectF.set(f10, f10, measuredWidth, measuredHeight);
                ncVar2.f36439i = false;
                ncVar2.f36435c = 0;
                ncVar2.a(rectF);
                return this.Z1.b(motionEvent);
            } else if (chatActivityEnterView.r0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.S1 != 0) {
                    chatActivityEnterView.l1(0, false);
                    chatActivityEnterView.V0.t(false);
                    requestFocus();
                }
                if (org.telegram.messenger.g0.D) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                chatActivityEnterView.s1(i3, 0, true, true);
                if (chatActivityEnterView.A3) {
                    chatActivityEnterView.m1(false, true, false, true);
                    chatActivityEnterView.f31158m3 = true;
                    org.telegram.messenger.g0.i3(new Runnable(this) {
                        public final tf f37718b;

                        {
                            this.f37718b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r2;
                            tf tfVar = this.f37718b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = tfVar.f38406a2;
                                    int i11 = ChatActivityEnterView.f31082t5;
                                    chatActivityEnterView2.t1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = tfVar.f38406a2;
                                    chatActivityEnterView3.f31158m3 = false;
                                    chatActivityEnterView3.H0();
                                    return;
                            }
                        }
                    }, 200L);
                    return true;
                }
                chatActivityEnterView.H0();
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
    public final boolean requestFocus(int i3, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.f38406a2;
        if (!chatActivityEnterView.A0 && !chatActivityEnterView.p0()) {
            return false;
        }
        chatActivityEnterView.getClass();
        return super.requestFocus(i3, rect);
    }

    @Override
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = org.telegram.messenger.g0.L(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override
    public void setOffsetY(float f10) {
        super.setOffsetY(f10);
        ChatActivityEnterView chatActivityEnterView = this.f38406a2;
        if (chatActivityEnterView.f31163n1.getForeground() != null) {
            qt0 qt0Var = chatActivityEnterView.f31163n1;
            qt0Var.invalidateDrawable(qt0Var.getForeground());
        }
    }
}
