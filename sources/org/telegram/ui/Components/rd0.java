package org.telegram.ui.Components;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rd0 implements DialogInterface.OnClickListener {
    public final vd0 f29978a;

    public rd0(vd0 vd0Var) {
        this.f29978a = vd0Var;
    }

    public static void a(String str, ContentValues contentValues) {
        if (str.startsWith("X-")) {
            contentValues.put("data2", (Integer) 0);
            contentValues.put("data3", str.substring(2));
        } else if ("PREF".equalsIgnoreCase(str)) {
            contentValues.put("data2", (Integer) 12);
        } else if ("HOME".equalsIgnoreCase(str)) {
            contentValues.put("data2", (Integer) 1);
        } else if (!"MOBILE".equalsIgnoreCase(str) && !"CELL".equalsIgnoreCase(str)) {
            if ("OTHER".equalsIgnoreCase(str)) {
                contentValues.put("data2", (Integer) 7);
            } else if ("WORK".equalsIgnoreCase(str)) {
                contentValues.put("data2", (Integer) 3);
            } else if (!"RADIO".equalsIgnoreCase(str) && !"VOICE".equalsIgnoreCase(str)) {
                if ("PAGER".equalsIgnoreCase(str)) {
                    contentValues.put("data2", (Integer) 6);
                } else if ("CALLBACK".equalsIgnoreCase(str)) {
                    contentValues.put("data2", (Integer) 8);
                } else if ("CAR".equalsIgnoreCase(str)) {
                    contentValues.put("data2", (Integer) 9);
                } else if ("ASSISTANT".equalsIgnoreCase(str)) {
                    contentValues.put("data2", (Integer) 19);
                } else if ("MMS".equalsIgnoreCase(str)) {
                    contentValues.put("data2", (Integer) 20);
                } else if (str.startsWith("FAX")) {
                    contentValues.put("data2", (Integer) 4);
                } else {
                    contentValues.put("data2", (Integer) 0);
                    contentValues.put("data3", str);
                }
            } else {
                contentValues.put("data2", (Integer) 14);
            }
        } else {
            contentValues.put("data2", (Integer) 2);
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Intent intent;
        String str;
        vd0 vd0Var;
        String str2;
        Intent intent2;
        Integer num;
        ArrayList<? extends Parcelable> arrayList;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        String str3;
        String str4;
        ArrayList arrayList2;
        Integer num6;
        String str5;
        Integer num7;
        Integer num8;
        Integer num9 = 7;
        Integer num10 = 5;
        Integer num11 = 4;
        Integer num12 = 6;
        vd0 vd0Var2 = this.f29978a;
        ArrayList arrayList3 = vd0Var2.D1;
        ArrayList arrayList4 = vd0Var2.C1;
        Integer num13 = 0;
        if (i10 == 0) {
            intent = new Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/raw_contact");
        } else if (i10 == 1) {
            intent = new Intent("android.intent.action.INSERT_OR_EDIT");
            intent.setType("vnd.android.cursor.item/contact");
        } else {
            intent = null;
        }
        TLRPC.TL_userContact_old2 tL_userContact_old2 = vd0Var2.E1;
        intent.putExtra("name", org.telegram.messenger.i5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name));
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        int i11 = 0;
        while (true) {
            str = "data1";
            vd0Var = vd0Var2;
            str2 = "mimetype";
            if (i11 >= arrayList3.size()) {
                break;
            }
            org.telegram.messenger.h0 h0Var = (org.telegram.messenger.h0) arrayList3.get(i11);
            int i12 = i11;
            ContentValues contentValues = new ContentValues();
            contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
            contentValues.put("data1", h0Var.c(false));
            a(h0Var.a(false), contentValues);
            arrayList5.add(contentValues);
            i11 = i12 + 1;
            vd0Var2 = vd0Var;
            arrayList3 = arrayList3;
        }
        int i13 = 0;
        boolean z10 = false;
        while (i13 < arrayList4.size()) {
            org.telegram.messenger.h0 h0Var2 = (org.telegram.messenger.h0) arrayList4.get(i13);
            int i14 = i13;
            int i15 = h0Var2.f15993c;
            boolean z11 = z10;
            if (i15 == 1) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(str2, "vnd.android.cursor.item/email_v2");
                intent2 = intent;
                contentValues2.put(str, h0Var2.c(false));
                a(h0Var2.a(false), contentValues2);
                arrayList5.add(contentValues2);
                num = num9;
                num5 = num13;
                num3 = num10;
                num4 = num11;
                num2 = num12;
                str4 = str;
                str3 = str2;
                arrayList2 = arrayList4;
                arrayList = arrayList5;
            } else {
                intent2 = intent;
                ArrayList arrayList6 = arrayList4;
                ArrayList<? extends Parcelable> arrayList7 = arrayList5;
                num = num9;
                if (i15 == 3) {
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put(str2, "vnd.android.cursor.item/website");
                    String str6 = str2;
                    contentValues3.put(str, h0Var2.c(false));
                    String a2 = h0Var2.a(false);
                    if (a2.startsWith("X-")) {
                        contentValues3.put("data2", num13);
                        contentValues3.put("data3", a2.substring(2));
                    } else if ("HOMEPAGE".equalsIgnoreCase(a2)) {
                        contentValues3.put("data2", (Integer) 1);
                    } else if ("BLOG".equalsIgnoreCase(a2)) {
                        contentValues3.put("data2", (Integer) 2);
                    } else if ("PROFILE".equalsIgnoreCase(a2)) {
                        contentValues3.put("data2", (Integer) 3);
                    } else if ("HOME".equalsIgnoreCase(a2)) {
                        contentValues3.put("data2", num11);
                    } else if ("WORK".equalsIgnoreCase(a2)) {
                        contentValues3.put("data2", num10);
                    } else if ("FTP".equalsIgnoreCase(a2)) {
                        contentValues3.put("data2", num12);
                    } else {
                        if ("OTHER".equalsIgnoreCase(a2)) {
                            num8 = num;
                            contentValues3.put("data2", num8);
                        } else {
                            num8 = num;
                            contentValues3.put("data2", num13);
                            contentValues3.put("data3", a2);
                        }
                        arrayList = arrayList7;
                        arrayList.add(contentValues3);
                        num = num8;
                        num5 = num13;
                        num4 = num11;
                        num2 = num12;
                        str4 = str;
                        arrayList2 = arrayList6;
                        str3 = str6;
                        num3 = num10;
                    }
                    arrayList = arrayList7;
                    num8 = num;
                    arrayList.add(contentValues3);
                    num = num8;
                    num5 = num13;
                    num4 = num11;
                    num2 = num12;
                    str4 = str;
                    arrayList2 = arrayList6;
                    str3 = str6;
                    num3 = num10;
                } else {
                    String str7 = str2;
                    arrayList = arrayList7;
                    if (i15 == 4) {
                        ContentValues contentValues4 = new ContentValues();
                        contentValues4.put(str7, "vnd.android.cursor.item/note");
                        contentValues4.put(str, h0Var2.c(false));
                        arrayList.add(contentValues4);
                        num5 = num13;
                        num3 = num10;
                        str3 = str7;
                        num4 = num11;
                        num2 = num12;
                        str4 = str;
                        arrayList2 = arrayList6;
                    } else {
                        num2 = num12;
                        if (i15 == 5) {
                            ContentValues contentValues5 = new ContentValues();
                            contentValues5.put(str7, "vnd.android.cursor.item/contact_event");
                            contentValues5.put(str, h0Var2.c(false));
                            contentValues5.put("data2", (Integer) 3);
                            arrayList.add(contentValues5);
                            num5 = num13;
                            num3 = num10;
                            num4 = num11;
                            str3 = str7;
                            str4 = str;
                            arrayList2 = arrayList6;
                        } else {
                            num3 = num10;
                            num4 = num11;
                            num5 = num13;
                            if (i15 == 2) {
                                ContentValues contentValues6 = new ContentValues();
                                contentValues6.put(str7, "vnd.android.cursor.item/postal-address_v2");
                                String[] b10 = h0Var2.b();
                                String str8 = str;
                                if (b10.length > 0) {
                                    contentValues6.put("data5", b10[0]);
                                }
                                if (b10.length > 1) {
                                    contentValues6.put("data6", b10[1]);
                                }
                                if (b10.length > 2) {
                                    contentValues6.put("data4", b10[2]);
                                }
                                if (b10.length > 3) {
                                    contentValues6.put("data7", b10[3]);
                                }
                                if (b10.length > 4) {
                                    contentValues6.put("data8", b10[4]);
                                }
                                if (b10.length > 5) {
                                    contentValues6.put("data9", b10[5]);
                                }
                                if (b10.length > 6) {
                                    contentValues6.put("data10", b10[6]);
                                }
                                String a10 = h0Var2.a(false);
                                if ("HOME".equalsIgnoreCase(a10)) {
                                    contentValues6.put("data2", (Integer) 1);
                                } else if ("WORK".equalsIgnoreCase(a10)) {
                                    contentValues6.put("data2", (Integer) 2);
                                } else if ("OTHER".equalsIgnoreCase(a10)) {
                                    contentValues6.put("data2", (Integer) 3);
                                }
                                arrayList.add(contentValues6);
                                str3 = str7;
                                arrayList2 = arrayList6;
                                str4 = str8;
                            } else {
                                String str9 = str;
                                if (i15 == 20) {
                                    ContentValues contentValues7 = new ContentValues();
                                    contentValues7.put(str7, "vnd.android.cursor.item/im");
                                    String a11 = h0Var2.a(true);
                                    String a12 = h0Var2.a(false);
                                    str3 = str7;
                                    contentValues7.put(str9, h0Var2.c(false));
                                    if ("AIM".equalsIgnoreCase(a11)) {
                                        num7 = num5;
                                        contentValues7.put("data5", num7);
                                        str5 = str9;
                                    } else {
                                        str5 = str9;
                                        num7 = num5;
                                        if ("MSN".equalsIgnoreCase(a11)) {
                                            contentValues7.put("data5", (Integer) 1);
                                        } else if ("YAHOO".equalsIgnoreCase(a11)) {
                                            contentValues7.put("data5", (Integer) 2);
                                        } else if ("SKYPE".equalsIgnoreCase(a11)) {
                                            contentValues7.put("data5", (Integer) 3);
                                        } else if ("QQ".equalsIgnoreCase(a11)) {
                                            contentValues7.put("data5", num4);
                                        } else if ("GOOGLE-TALK".equalsIgnoreCase(a11)) {
                                            contentValues7.put("data5", num3);
                                        } else if ("ICQ".equalsIgnoreCase(a11)) {
                                            contentValues7.put("data5", num2);
                                        } else if ("JABBER".equalsIgnoreCase(a11)) {
                                            contentValues7.put("data5", num);
                                        } else if ("NETMEETING".equalsIgnoreCase(a11)) {
                                            contentValues7.put("data5", (Integer) 8);
                                        } else {
                                            contentValues7.put("data5", (Integer) (-1));
                                            contentValues7.put("data6", h0Var2.a(true));
                                        }
                                    }
                                    if ("HOME".equalsIgnoreCase(a12)) {
                                        contentValues7.put("data2", (Integer) 1);
                                    } else if ("WORK".equalsIgnoreCase(a12)) {
                                        contentValues7.put("data2", (Integer) 2);
                                    } else if ("OTHER".equalsIgnoreCase(a12)) {
                                        contentValues7.put("data2", (Integer) 3);
                                    }
                                    arrayList.add(contentValues7);
                                    num5 = num7;
                                    arrayList2 = arrayList6;
                                    str4 = str5;
                                } else {
                                    str3 = str7;
                                    Integer num14 = num5;
                                    str4 = str9;
                                    if (i15 != 6 || z11) {
                                        num5 = num14;
                                        arrayList2 = arrayList6;
                                    } else {
                                        ContentValues contentValues8 = new ContentValues();
                                        String str10 = str3;
                                        contentValues8.put(str10, "vnd.android.cursor.item/organization");
                                        int i16 = i14;
                                        while (i16 < arrayList6.size()) {
                                            ArrayList arrayList8 = arrayList6;
                                            org.telegram.messenger.h0 h0Var3 = (org.telegram.messenger.h0) arrayList8.get(i16);
                                            int i17 = i16;
                                            String str11 = str10;
                                            if (h0Var3.f15993c == 6) {
                                                String a13 = h0Var3.a(true);
                                                if ("ORG".equalsIgnoreCase(a13)) {
                                                    String[] b11 = h0Var3.b();
                                                    if (b11.length != 0) {
                                                        num6 = num14;
                                                        if (b11.length >= 1) {
                                                            contentValues8.put(str4, b11[0]);
                                                        }
                                                        if (b11.length >= 2) {
                                                            contentValues8.put("data5", b11[1]);
                                                        }
                                                    }
                                                } else {
                                                    num6 = num14;
                                                    if ("TITLE".equalsIgnoreCase(a13)) {
                                                        contentValues8.put("data4", h0Var3.c(false));
                                                    } else if ("ROLE".equalsIgnoreCase(a13)) {
                                                        contentValues8.put("data4", h0Var3.c(false));
                                                    }
                                                }
                                                String a14 = h0Var3.a(true);
                                                if ("WORK".equalsIgnoreCase(a14)) {
                                                    contentValues8.put("data2", (Integer) 1);
                                                } else if ("OTHER".equalsIgnoreCase(a14)) {
                                                    contentValues8.put("data2", (Integer) 2);
                                                }
                                                i16 = i17 + 1;
                                                arrayList6 = arrayList8;
                                                num14 = num6;
                                                str10 = str11;
                                            }
                                            num6 = num14;
                                            i16 = i17 + 1;
                                            arrayList6 = arrayList8;
                                            num14 = num6;
                                            str10 = str11;
                                        }
                                        str3 = str10;
                                        num5 = num14;
                                        arrayList2 = arrayList6;
                                        arrayList.add(contentValues8);
                                        z10 = true;
                                        i13 = i14 + 1;
                                        arrayList4 = arrayList2;
                                        arrayList5 = arrayList;
                                        intent = intent2;
                                        num12 = num2;
                                        num10 = num3;
                                        num11 = num4;
                                        num13 = num5;
                                        str2 = str3;
                                        str = str4;
                                        num9 = num;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z10 = z11;
            i13 = i14 + 1;
            arrayList4 = arrayList2;
            arrayList5 = arrayList;
            intent = intent2;
            num12 = num2;
            num10 = num3;
            num11 = num4;
            num13 = num5;
            str2 = str3;
            str = str4;
            num9 = num;
        }
        Intent intent3 = intent;
        intent3.putExtra("finishActivityOnSaveCompleted", true);
        intent3.putParcelableArrayListExtra("data", arrayList5);
        try {
            vd0Var.f31257p1.getParentActivity().startActivity(intent3);
            vd0Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
