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
public abstract class og extends nu {
    public hd f27953c;
    public final ChatActivityEnterView d;

    public og(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.d = chatActivityEnterView;
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.og.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.fo foVar = chatActivityEnterView.P2;
        if (foVar != null) {
            foVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.f0(menu);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        return this.d.W3;
    }

    public final void m(Uri uri, String str) {
        boolean z10;
        org.telegram.ui.fo foVar = this.d.P2;
        if (foVar != null && foVar.x()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.globalQueue.postRunnable(new n2.h(this, uri, AndroidUtilities.generatePicturePath(z10, MimeTypeMap.getSingleton().getExtensionFromMimeType(str)), 17));
    }

    public final void n(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.fo foVar = chatActivityEnterView.P2;
        if (foVar != null && foVar.getParentActivity() != null) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
            if (chatActivityEnterView.f22995z2) {
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.runOnUIThread(new c5.w(this, arrayList, file, false, 8), 100L);
                return;
            }
            PhotoViewer.t1().K2(null, foVar, chatActivityEnterView.W3);
            PhotoViewer.t1().g2(arrayList, 0, 2, false, new ng(this, photoEntry, file), chatActivityEnterView.P2);
        }
    }

    public final void o(t0.j jVar, boolean z10, int i10, int i11) {
        MessageObject threadMessage;
        int i12;
        MessageObject threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.fo foVar = chatActivityEnterView.P2;
        of ofVar = chatActivityEnterView.L0;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (ofVar != null) {
            ofVar.h(true);
            chatActivityEnterView.L0 = null;
        }
        org.telegram.ui.un unVar = chatActivityEnterView.V2;
        if (unVar != null && foVar != null && unVar.f40713f) {
            foVar.Vb();
            return;
        }
        t0.i iVar = jVar.f45502a;
        if (iVar.getDescription().hasMimeType("image/gif")) {
            AccountInstance accountInstance = chatActivityEnterView.R;
            Uri c10 = iVar.c();
            long j10 = chatActivityEnterView.Q2;
            MessageObject messageObject = chatActivityEnterView.T2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.un unVar2 = chatActivityEnterView.V2;
            if (foVar != null) {
                sendMessageChatArguments = foVar.H8();
            }
            SendMessagesHelper.prepareSendingDocument(accountInstance, null, null, c10, null, "image/gif", j10, messageObject, threadMessage2, null, unVar2, null, z10, 0, jVar, sendMessageChatArguments, false);
        } else {
            AccountInstance accountInstance2 = chatActivityEnterView.R;
            Uri c11 = iVar.c();
            long j11 = chatActivityEnterView.Q2;
            MessageObject messageObject2 = chatActivityEnterView.T2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.un unVar3 = chatActivityEnterView.V2;
            if (foVar == null) {
                i12 = 0;
            } else {
                i12 = foVar.R3;
            }
            int i13 = i12;
            if (foVar != null) {
                sendMessageChatArguments = foVar.H8();
            }
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, null, c11, j11, messageObject2, threadMessage, unVar3, null, null, null, jVar, 0, null, z10, 0, i13, sendMessageChatArguments);
        }
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar != null) {
            pgVar.J(null, true, i10, i11, 0L);
        }
    }

    @Override
    public final void onContextMenuClose() {
        pg pgVar = this.d.Z2;
        if (pgVar != null) {
            pgVar.T1();
        }
    }

    @Override
    public final void onContextMenuOpen() {
        pg pgVar = this.d.Z2;
        if (pgVar != null) {
            pgVar.k();
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
            int i10 = ChatActivityEnterView.f22849n5;
            if (chatActivityEnterView.f22859b2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !chatActivityEnterView.f22922l5) {
                t0.c.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.g.a(onCreateInputConnection, editorInfo, new s(this, 18));
            }
            t0.c.b(editorInfo, null);
            return t0.g.a(onCreateInputConnection, editorInfo, new s(this, 18));
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
            chatActivityEnterView.n1(z11);
            if (chatActivityEnterView.T <= 2 || TextUtils.isEmpty(getText().toString().trim())) {
                z12 = false;
            }
            chatActivityEnterView.t1(z12);
        }
        chatActivityEnterView.S = false;
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        pg pgVar = this.d.Z2;
        if (pgVar != null) {
            pgVar.m0();
        }
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        pg pgVar = this.d.Z2;
        if (pgVar != null) {
            pgVar.D0(i10, i11);
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.d;
            chatActivityEnterView.X1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.f22859b2 == null) {
                m(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.E3 && chatActivityEnterView.B3 == null) {
            if (!chatActivityEnterView.f22993z0 && !chatActivityEnterView.p0()) {
                if (this.f27953c == null) {
                    hd hdVar = new hd(this);
                    this.f27953c = hdVar;
                    hdVar.h = new Runnable(this) {
                        public final og f27391b;

                        {
                            this.f27391b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            og ogVar = this.f27391b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = ogVar.d;
                                    int i12 = ChatActivityEnterView.f22849n5;
                                    chatActivityEnterView2.s1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = ogVar.d;
                                    chatActivityEnterView3.f22921l3 = false;
                                    chatActivityEnterView3.G0();
                                    return;
                            }
                        }
                    };
                }
                hd hdVar2 = this.f27953c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                hdVar2.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = 0;
                rectF.set(f7, f7, measuredWidth, measuredHeight);
                hdVar2.f25637i = false;
                hdVar2.f25634c = 0;
                hdVar2.a(rectF);
                return this.f27953c.b(motionEvent);
            } else if (chatActivityEnterView.r0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.k1(0, false);
                    chatActivityEnterView.U0.u(false);
                    requestFocus();
                }
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                chatActivityEnterView.r1(i10, 0, true, true);
                if (chatActivityEnterView.f22996z3) {
                    chatActivityEnterView.l1(false, true, false, true);
                    chatActivityEnterView.f22921l3 = true;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final og f27391b;

                        {
                            this.f27391b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            og ogVar = this.f27391b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = ogVar.d;
                                    int i12 = ChatActivityEnterView.f22849n5;
                                    chatActivityEnterView2.s1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = ogVar.d;
                                    chatActivityEnterView3.f22921l3 = false;
                                    chatActivityEnterView3.G0();
                                    return;
                            }
                        }
                    }, 200L);
                    return true;
                }
                chatActivityEnterView.G0();
                return true;
            } else {
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean requestFocus(int i10, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f22993z0 && !chatActivityEnterView.p0()) {
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
        if (chatActivityEnterView.f22923m1.getForeground() != null) {
            ow0 ow0Var = chatActivityEnterView.f22923m1;
            ow0Var.invalidateDrawable(ow0Var.getForeground());
        }
    }
}
