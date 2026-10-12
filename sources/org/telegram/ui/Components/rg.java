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
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public abstract class rg extends uu {
    public hd f30153c;
    public final ChatActivityEnterView d;

    public rg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.d = chatActivityEnterView;
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rg.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
        if (eoVar != null) {
            eoVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.i0(menu);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        return this.d.f23775z4;
    }

    public final void m(Uri uri, String str) {
        boolean z10;
        org.telegram.ui.eo eoVar = this.d.P2;
        if (eoVar != null && eoVar.v()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.tgnet.h(this, uri, AndroidUtilities.generatePicturePath(z10, MimeTypeMap.getSingleton().getExtensionFromMimeType(str)), 12));
    }

    public final void n(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
        if (eoVar != null && eoVar.getParentActivity() != null) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
            if (chatActivityEnterView.f23773z2) {
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.runOnUIThread(new c5.v(this, arrayList, file, false, 8), 100L);
                return;
            }
            PhotoViewer.t1().K2(null, eoVar, chatActivityEnterView.f23775z4);
            PhotoViewer.t1().g2(arrayList, 0, 2, false, new qg(this, photoEntry, file), chatActivityEnterView.P2);
        }
    }

    public final void o(t0.i iVar, boolean z10, int i10, int i11) {
        MessageObject threadMessage;
        int i12;
        MessageObject threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
        rf rfVar = chatActivityEnterView.L0;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (rfVar != null) {
            rfVar.h(true);
            chatActivityEnterView.L0 = null;
        }
        org.telegram.ui.tn tnVar = chatActivityEnterView.V2;
        if (tnVar != null && eoVar != null && tnVar.f42248f) {
            eoVar.Vb();
            return;
        }
        t0.h hVar = iVar.f48430a;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            AccountInstance accountInstance = chatActivityEnterView.R;
            Uri c10 = hVar.c();
            long j3 = chatActivityEnterView.Q2;
            MessageObject messageObject = chatActivityEnterView.T2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.tn tnVar2 = chatActivityEnterView.V2;
            if (eoVar != null) {
                sendMessageChatArguments = eoVar.H8();
            }
            SendMessagesHelper.prepareSendingDocument(accountInstance, null, null, c10, null, "image/gif", j3, messageObject, threadMessage2, null, tnVar2, null, z10, 0, iVar, sendMessageChatArguments, false);
        } else {
            AccountInstance accountInstance2 = chatActivityEnterView.R;
            Uri c11 = hVar.c();
            long j10 = chatActivityEnterView.Q2;
            MessageObject messageObject2 = chatActivityEnterView.T2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.tn tnVar3 = chatActivityEnterView.V2;
            if (eoVar == null) {
                i12 = 0;
            } else {
                i12 = eoVar.R3;
            }
            int i13 = i12;
            if (eoVar != null) {
                sendMessageChatArguments = eoVar.H8();
            }
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, null, c11, j10, messageObject2, threadMessage, tnVar3, null, null, null, iVar, 0, null, z10, 0, i13, sendMessageChatArguments);
        }
        sg sgVar = chatActivityEnterView.Z2;
        if (sgVar != null) {
            sgVar.H(null, true, i10, i11, 0L);
        }
    }

    @Override
    public final void onContextMenuClose() {
        sg sgVar = this.d.Z2;
        if (sgVar != null) {
            sgVar.j2();
        }
    }

    @Override
    public final void onContextMenuOpen() {
        sg sgVar = this.d.Z2;
        if (sgVar != null) {
            sgVar.l();
        }
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.d;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i10 = ChatActivityEnterView.S5;
            if (chatActivityEnterView.f23626b2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !chatActivityEnterView.Q5 && !chatActivityEnterView.f23692m3) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new s(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new s(this, 18));
        } catch (Throwable th2) {
            FileLog.e(th2);
            return onCreateInputConnection;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ChatActivityEnterView chatActivityEnterView = this.d;
        chatActivityEnterView.S = z10;
        super.onMeasure(i10, i11);
        if (chatActivityEnterView.S) {
            chatActivityEnterView.T = getLineCount();
            if (chatActivityEnterView.T > 2 && !TextUtils.isEmpty(getText().toString().trim())) {
                z11 = true;
            } else {
                z11 = false;
            }
            chatActivityEnterView.r1(z11);
            if (chatActivityEnterView.T <= 2 || TextUtils.isEmpty(getText().toString().trim())) {
                z12 = false;
            }
            chatActivityEnterView.x1(z12);
        }
        chatActivityEnterView.S = false;
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        sg sgVar = this.d.Z2;
        if (sgVar != null) {
            sgVar.p0();
        }
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        sg sgVar = this.d.Z2;
        if (sgVar != null) {
            sgVar.J0(i10, i11);
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.d;
            chatActivityEnterView.X1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.f23626b2 == null) {
                m(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f23661g4 && chatActivityEnterView.f23641d4 == null) {
            if (!chatActivityEnterView.f23771z0 && !chatActivityEnterView.s0()) {
                if (this.f30153c == null) {
                    hd hdVar = new hd(this);
                    this.f30153c = hdVar;
                    hdVar.h = new Runnable(this) {
                        public final rg f29496b;

                        {
                            this.f29496b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            rg rgVar = this.f29496b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = rgVar.d;
                                    int i12 = ChatActivityEnterView.S5;
                                    chatActivityEnterView2.w1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = rgVar.d;
                                    chatActivityEnterView3.N3 = false;
                                    chatActivityEnterView3.K0();
                                    return;
                            }
                        }
                    };
                }
                hd hdVar2 = this.f30153c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                hdVar2.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = 0;
                rectF.set(f7, f7, measuredWidth, measuredHeight);
                hdVar2.f26758i = false;
                hdVar2.f26754c = 0;
                hdVar2.a(rectF);
                return this.f30153c.b(motionEvent);
            } else if (chatActivityEnterView.u0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.o1(0, false);
                    chatActivityEnterView.U0.u(false);
                    requestFocus();
                }
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                chatActivityEnterView.v1(i10, 0, true, true);
                if (chatActivityEnterView.f23628b4) {
                    chatActivityEnterView.p1(false, true, false, true);
                    chatActivityEnterView.N3 = true;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final rg f29496b;

                        {
                            this.f29496b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            rg rgVar = this.f29496b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = rgVar.d;
                                    int i12 = ChatActivityEnterView.S5;
                                    chatActivityEnterView2.w1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = rgVar.d;
                                    chatActivityEnterView3.N3 = false;
                                    chatActivityEnterView3.K0();
                                    return;
                            }
                        }
                    }, 200L);
                    return true;
                }
                chatActivityEnterView.K0();
                return true;
            } else {
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean requestFocus(int i10, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f23771z0 && !chatActivityEnterView.s0()) {
            return false;
        }
        chatActivityEnterView.getClass();
        return super.requestFocus(i10, rect);
    }

    @Override
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = AndroidUtilities.dp(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override
    public void setOffsetY(float f7) {
        super.setOffsetY(f7);
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (chatActivityEnterView.f23690m1.getForeground() != null) {
            yw0 yw0Var = chatActivityEnterView.f23690m1;
            yw0Var.invalidateDrawable(yw0Var.getForeground());
        }
    }
}
