package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

public final class mv implements org.telegram.ui.Components.wp0, org.telegram.ui.Components.qk0, org.telegram.ui.Components.rk0, z00, org.telegram.ui.ActionBar.a2, r0.o, org.telegram.ui.Components.ek0 {

    public final int f40599a;

    public final gy f40600b;

    public mv(gy gyVar, int i10) {
        this.f40599a = i10;
        this.f40600b = gyVar;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        gy gyVar = this.f40600b;
        gyVar.v.i(m1Var);
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        gyVar.f38506b4 = defaultWindowInsets.f10490b;
        gyVar.f38512c4 = defaultWindowInsets.d;
        int i10 = m1Var.f46619a.f(8).d;
        if (gyVar.f38517d4 != i10) {
            gyVar.f38517d4 = i10;
            gyVar.fragmentView.requestLayout();
        }
        gyVar.B0.setPadding(0, gyVar.f38506b4, 0, 0);
        gyVar.X4();
        for (UndoView undoView : gyVar.f38600u0) {
            if (undoView != null) {
                int i11 = gyVar.f38512c4 + gyVar.f38523e4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        bx bxVar = gyVar.B3;
        if (bxVar != null) {
            r0.j0.b(bxVar, m1Var);
        }
        return r0.m1.f46618b;
    }

    @Override
    public boolean a(int i10, View view) {
        gy.n0(this.f40600b, i10);
        return false;
    }

    @Override
    public void b() {
        gy gyVar = this.f40600b;
        gyVar.M = true;
        gyVar.fragmentView.invalidate();
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        TLRPC.Chat chat;
        switch (this.f40599a) {
            case 1:
                gy gyVar = this.f40600b;
                org.telegram.ui.Components.n41 n41VarG = gyVar.f38619y0.f29747f0.G(i10);
                Object obj = n41VarG != null ? n41VarG.G : null;
                if (!(obj instanceof TLRPC.Chat)) {
                    if (obj instanceof MessageObject) {
                        MessageObject messageObject = (MessageObject) obj;
                        Bundle bundle = new Bundle();
                        if (messageObject.getDialogId() >= 0) {
                            bundle.putLong("user_id", messageObject.getDialogId());
                        } else {
                            bundle.putLong("chat_id", -messageObject.getDialogId());
                        }
                        bundle.putInt("message_id", messageObject.getId());
                        rn rnVar = new rn(bundle);
                        gy.d4(rnVar, messageObject);
                        gyVar.presentFragment(rnVar);
                    }
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).f22380id);
                    rn rnVar2 = new rn(bundle2);
                    org.telegram.ui.Components.en0 en0Var = gyVar.f38619y0.f29747f0;
                    en0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= en0Var.f26945x.size()) {
                            rnVar2.f41998bb = arrayList;
                            gyVar.presentFragment(rnVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.n41 n41VarG2 = en0Var.G(i10);
                            if (n41VarG2 != null) {
                                Object obj2 = n41VarG2.G;
                                if (obj2 instanceof TLRPC.Chat) {
                                    chat = (TLRPC.Chat) obj2;
                                } else {
                                    chat = null;
                                }
                            } else {
                                chat = null;
                            }
                            if (chat != null) {
                                arrayList.add(chat);
                            }
                        }
                    }
                }
                break;
            case 2:
                gy gyVar2 = this.f40600b;
                org.telegram.ui.Components.n41 n41VarG3 = gyVar2.f38619y0.f29752k0.G(i10);
                Object obj3 = n41VarG3 != null ? n41VarG3.G : null;
                if (obj3 instanceof TLRPC.User) {
                    gyVar2.presentFragment(ProfileActivity.m4(((TLRPC.User) obj3).f22527id));
                } else if (obj3 instanceof MessageObject) {
                    MessageObject messageObject2 = (MessageObject) obj3;
                    Bundle bundle3 = new Bundle();
                    if (messageObject2.getDialogId() >= 0) {
                        bundle3.putLong("user_id", messageObject2.getDialogId());
                    } else {
                        bundle3.putLong("chat_id", -messageObject2.getDialogId());
                    }
                    bundle3.putInt("message_id", messageObject2.getId());
                    rn rnVar3 = new rn(bundle3);
                    gy.d4(rnVar3, messageObject2);
                    gyVar2.presentFragment(rnVar3);
                }
                break;
            default:
                gy gyVar3 = this.f40600b;
                Object objJ = gyVar3.f38619y0.U.J(i10);
                if (!(objJ instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.e6) {
                        org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                        if (e6Var.f24278j0) {
                            gyVar3.N4(e6Var.getDialogId(), view);
                        }
                    }
                    if (gyVar3.N0 != 10) {
                        gyVar3.n4(view, i10, gyVar3.f38619y0.U);
                    } else {
                        px pxVar = gyVar3.f38619y0;
                        hh.f1 f1Var = pxVar.R;
                        gyVar3.o4(view, i10, f10, pxVar.U);
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) objJ;
                    gyVar3.presentFragment(rn.R9(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.cn0 cn0Var = gyVar3.f38619y0.U;
                    cn0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(cn0Var.f45996o0).sendRequest(tL_messages_clickSponsoredMessage, null);
                }
                break;
        }
    }

    @Override
    public void c0(View view, float f10, float f11) {
        int i10 = this.f40599a;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40599a) {
            case 6:
                gy.f0(this.f40600b);
                break;
            case 7:
            default:
                gy gyVar = this.f40600b;
                gyVar.getMessagesController().hidePromoDialog();
                gyVar.b4(false);
                break;
            case 8:
                gy gyVar2 = this.f40600b;
                gyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            gyVar2.getParentActivity().startActivity(permissionManagerIntent);
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            gyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                }
                break;
            case 9:
                gy gyVar3 = this.f40600b;
                gyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    gyVar3.getParentActivity().startActivity(intent2);
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
        }
    }

    @Override
    public boolean f1(View view) {
        switch (this.f40599a) {
        }
        return false;
    }

    public void h(int i10) {
        rw rwVar = this.f40600b.f38615x1;
        if (rwVar == null) {
            return;
        }
        if (i10 == 0) {
            rwVar.q0(true);
        } else {
            rwVar.w1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f40600b.W4(z10, arrayList, arrayList2, z11, true);
    }

    private final void d(View view, float f10, float f11) {
    }

    private final void e(View view, float f10, float f11) {
    }

    private final void g(View view, float f10, float f11) {
    }
}
