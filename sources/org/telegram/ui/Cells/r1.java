package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
public final class r1 extends AccessibilityNodeProvider {
    public final Path f20861a = new Path();
    public final RectF f20862b = new RectF();
    public final Rect f20863c = new Rect();
    public final u1 d;

    public r1(u1 u1Var) {
        this.d = u1Var;
    }

    public final ClickableSpan a(int i10, boolean z10) {
        if (i10 == 5000) {
            return null;
        }
        u1 u1Var = this.d;
        if (z10) {
            int i11 = i10 - 3000;
            CharSequence charSequence = u1Var.f21607y7.caption;
            if (!(charSequence instanceof Spannable) || i11 < 0) {
                return null;
            }
            Spannable spannable = (Spannable) charSequence;
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
            if (clickableSpanArr.length <= i11) {
                return null;
            }
            return clickableSpanArr[i11];
        }
        int i12 = i10 - 2000;
        CharSequence charSequence2 = u1Var.f21607y7.messageText;
        if (!(charSequence2 instanceof Spannable) || i12 < 0) {
            return null;
        }
        Spannable spannable2 = (Spannable) charSequence2;
        ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable2.getSpans(0, spannable2.length(), ClickableSpan.class);
        if (clickableSpanArr2.length <= i12) {
            return null;
        }
        return clickableSpanArr2[i12];
    }

    public final RichMessageLayout.RichBlock b(int i10, int[] iArr) {
        RichMessageLayout richMessageLayout;
        int i11;
        MessageObject messageObject = this.d.f21607y7;
        if (messageObject != null && (richMessageLayout = messageObject.richLayout) != null && i10 - 6000 >= 0) {
            int i12 = 0;
            for (int i13 = 0; i13 < richMessageLayout.blocks.size(); i13++) {
                RichMessageLayout.RichBlock richBlock = richMessageLayout.blocks.get(i13);
                if (richBlock.isVisible()) {
                    int accessibilityElementCount = richBlock.getAccessibilityElementCount() + i12;
                    if (i11 < accessibilityElementCount) {
                        iArr[0] = i11 - i12;
                        return richBlock;
                    }
                    i12 = accessibilityElementCount;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        l1 l1Var;
        j1 j1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        u1 u1Var = this.d;
        ArrayList arrayList = u1Var.Y5;
        ArrayList arrayList2 = u1Var.f21460o7;
        if (i10 == -1) {
            u1Var.performAccessibilityAction(i11, bundle);
            return true;
        } else if (i11 == 64) {
            u1Var.I3(i10, 32768, null);
            return true;
        } else {
            boolean z10 = false;
            if (i11 == 16) {
                if (i10 == 5000) {
                    l1 l1Var2 = u1Var.Jc;
                    if (l1Var2 != null) {
                        l1Var2.t0(u1Var, u1Var.Yb, 0.0f, 0.0f);
                        return true;
                    }
                } else if (i10 >= 6000) {
                    int[] iArr = {0};
                    RichMessageLayout.RichBlock b10 = b(i10, iArr);
                    if (b10 != null && b10.onAccessibilityElementClick(iArr[0], u1Var)) {
                        u1Var.I3(i10, 1, null);
                        AndroidUtilities.makeAccessibilityAnnouncement(b10.getAccessibilityElementStateDescription(iArr[0]));
                        return true;
                    }
                } else if (i10 >= 3000) {
                    ClickableSpan a2 = a(i10, true);
                    if (a2 != null) {
                        u1Var.Jc.V0(u1Var, a2, false);
                        u1Var.I3(i10, 1, null);
                        return true;
                    }
                } else if (i10 >= 2000) {
                    ClickableSpan a10 = a(i10, false);
                    if (a10 != null) {
                        u1Var.Jc.V0(u1Var, a10, false);
                        u1Var.I3(i10, 1, null);
                        return true;
                    }
                } else {
                    if (i10 >= 1000) {
                        int i12 = i10 - 1000;
                        if (i12 < arrayList2.size()) {
                            e0 e0Var = (e0) arrayList2.get(i12);
                            l1 l1Var3 = u1Var.Jc;
                            if (l1Var3 != null && !e0Var.f20211m) {
                                BotInlineKeyboard.ButtonCustom buttonCustom = e0Var.f20208j;
                                if (buttonCustom != null) {
                                    l1Var3.E(u1Var, buttonCustom);
                                } else {
                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = e0Var.f20207i;
                                    if (keyboardInlineButton != null) {
                                        l1Var3.m1(u1Var, keyboardInlineButton);
                                    }
                                }
                            }
                            u1Var.I3(i10, 1, null);
                            return true;
                        }
                    } else if (i10 >= 500) {
                        int i13 = i10 - 500;
                        if (i13 < arrayList.size()) {
                            s1 s1Var = (s1) arrayList.get(i13);
                            if (u1Var.Jc != null) {
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(s1Var.f20914s);
                                u1Var.Jc.j(u1Var, arrayList3, -1, 0, 0);
                            }
                            u1Var.I3(i10, 1, null);
                            return true;
                        }
                    } else if (i10 == 495) {
                        u1Var.x1();
                        return true;
                    } else if (i10 == 499) {
                        l1 l1Var4 = u1Var.Jc;
                        if (l1Var4 != null) {
                            l1Var4.P0(u1Var.f21275b3, u1Var);
                            return true;
                        }
                    } else if (i10 == 492) {
                        l1 l1Var5 = u1Var.Jc;
                        if (l1Var5 != null) {
                            l1Var5.P0(5, u1Var);
                            return true;
                        }
                    } else if (i10 == 491) {
                        l1 l1Var6 = u1Var.Jc;
                        if (l1Var6 != null) {
                            l1Var6.P0(5, u1Var);
                            return true;
                        }
                    } else if (i10 == 490) {
                        l1 l1Var7 = u1Var.Jc;
                        if (l1Var7 != null) {
                            l1Var7.P0(31, u1Var);
                            return true;
                        }
                    } else if (i10 == 489) {
                        l1 l1Var8 = u1Var.Jc;
                        if (l1Var8 != null) {
                            l1Var8.P0(30, u1Var);
                            return true;
                        }
                    } else if (i10 == 498) {
                        l1 l1Var9 = u1Var.Jc;
                        if (l1Var9 != null) {
                            l1Var9.r(u1Var);
                            return true;
                        }
                    } else if (i10 == 497) {
                        if (u1Var.Jc != null && ((!u1Var.W7 || u1Var.U7 || u1Var.f21607y7.getReplyTopMsgId() != 0) && (u1Var.f21607y7.hasValidReplyMessageObject() || u1Var.f21609y9 || ((message = u1Var.f21607y7.messageOwner) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null)))) {
                            u1Var.Jc.b2(u1Var, u1Var.f21607y7.getReplyMsgId(), 0.0f, 0.0f, false);
                            return true;
                        }
                    } else if (i10 == 494) {
                        l1 l1Var10 = u1Var.Jc;
                        if (l1Var10 != null) {
                            TLRPC.Chat chat = u1Var.f21395jc;
                            if (chat != null) {
                                l1Var10.S(u1Var, chat, u1Var.f21607y7.messageOwner.fwd_from.channel_post, u1Var.f21343g1, u1Var.f21356h1, false);
                                return true;
                            }
                            TLRPC.User user = u1Var.f21366hc;
                            if (user != null) {
                                l1Var10.t0(u1Var, user, u1Var.f21343g1, u1Var.f21356h1);
                                return true;
                            } else if (u1Var.f21410kc != null) {
                                l1Var10.o(u1Var);
                                return true;
                            }
                        }
                    } else if (i10 == 496) {
                        l1 l1Var11 = u1Var.Jc;
                        if (l1Var11 != null) {
                            if (u1Var.f21294c8) {
                                l1Var11.r(u1Var);
                                return true;
                            }
                            l1Var11.u(u1Var);
                            return true;
                        }
                    } else if (i10 == 493 && (j1Var = u1Var.M5) != null) {
                        j1Var.m();
                        return true;
                    }
                    return false;
                }
            } else if (i11 == 32) {
                if (i10 >= 3000) {
                    z10 = true;
                }
                ClickableSpan a11 = a(i10, z10);
                if (a11 != null && (l1Var = u1Var.Jc) != null) {
                    l1Var.V0(u1Var, a11, true);
                    u1Var.I3(i10, 2, null);
                }
            }
            return true;
        }
    }
}
