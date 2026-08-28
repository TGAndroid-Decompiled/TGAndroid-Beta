package org.telegram.ui.Components;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class rd0 implements DialogInterface.OnClickListener {
    public final wd0 f32143a;

    public rd0(wd0 wd0Var) {
        this.f32143a = wd0Var;
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
    public final void onClick(DialogInterface dialogInterface, int i9) {
        Intent intent;
        String str;
        wd0 wd0Var;
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
        wd0 wd0Var2 = this.f32143a;
        ArrayList arrayList3 = wd0Var2.I;
        ArrayList arrayList4 = wd0Var2.H;
        Integer num13 = 0;
        if (i9 == 0) {
            intent = new Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/raw_contact");
        } else if (i9 == 1) {
            intent = new Intent("android.intent.action.INSERT_OR_EDIT");
            intent.setType("vnd.android.cursor.item/contact");
        } else {
            intent = null;
        }
        TLRPC.TL_userContact_old2 tL_userContact_old2 = wd0Var2.J;
        intent.putExtra("name", ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        int i10 = 0;
        while (true) {
            str = "data1";
            wd0Var = wd0Var2;
            str2 = "mimetype";
            if (i10 >= arrayList3.size()) {
                break;
            }
            AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) arrayList3.get(i10);
            int i11 = i10;
            ContentValues contentValues = new ContentValues();
            contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
            contentValues.put("data1", vcardItem.getValue(false));
            a(vcardItem.getRawType(false), contentValues);
            arrayList5.add(contentValues);
            i10 = i11 + 1;
            wd0Var2 = wd0Var;
            arrayList3 = arrayList3;
        }
        int i12 = 0;
        boolean z10 = false;
        while (i12 < arrayList4.size()) {
            AndroidUtilities.VcardItem vcardItem2 = (AndroidUtilities.VcardItem) arrayList4.get(i12);
            int i13 = i12;
            int i14 = vcardItem2.type;
            boolean z11 = z10;
            if (i14 == 1) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(str2, "vnd.android.cursor.item/email_v2");
                intent2 = intent;
                contentValues2.put(str, vcardItem2.getValue(false));
                a(vcardItem2.getRawType(false), contentValues2);
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
                if (i14 == 3) {
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put(str2, "vnd.android.cursor.item/website");
                    String str6 = str2;
                    contentValues3.put(str, vcardItem2.getValue(false));
                    String rawType = vcardItem2.getRawType(false);
                    if (rawType.startsWith("X-")) {
                        contentValues3.put("data2", num13);
                        contentValues3.put("data3", rawType.substring(2));
                    } else if ("HOMEPAGE".equalsIgnoreCase(rawType)) {
                        contentValues3.put("data2", (Integer) 1);
                    } else if ("BLOG".equalsIgnoreCase(rawType)) {
                        contentValues3.put("data2", (Integer) 2);
                    } else if ("PROFILE".equalsIgnoreCase(rawType)) {
                        contentValues3.put("data2", (Integer) 3);
                    } else if ("HOME".equalsIgnoreCase(rawType)) {
                        contentValues3.put("data2", num11);
                    } else if ("WORK".equalsIgnoreCase(rawType)) {
                        contentValues3.put("data2", num10);
                    } else if ("FTP".equalsIgnoreCase(rawType)) {
                        contentValues3.put("data2", num12);
                    } else {
                        if ("OTHER".equalsIgnoreCase(rawType)) {
                            num8 = num;
                            contentValues3.put("data2", num8);
                        } else {
                            num8 = num;
                            contentValues3.put("data2", num13);
                            contentValues3.put("data3", rawType);
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
                    if (i14 == 4) {
                        ContentValues contentValues4 = new ContentValues();
                        contentValues4.put(str7, "vnd.android.cursor.item/note");
                        contentValues4.put(str, vcardItem2.getValue(false));
                        arrayList.add(contentValues4);
                        num5 = num13;
                        num3 = num10;
                        str3 = str7;
                        num4 = num11;
                        num2 = num12;
                    } else {
                        num2 = num12;
                        if (i14 == 5) {
                            ContentValues contentValues5 = new ContentValues();
                            contentValues5.put(str7, "vnd.android.cursor.item/contact_event");
                            contentValues5.put(str, vcardItem2.getValue(false));
                            contentValues5.put("data2", (Integer) 3);
                            arrayList.add(contentValues5);
                            num5 = num13;
                            num3 = num10;
                            num4 = num11;
                            str3 = str7;
                        } else {
                            num3 = num10;
                            num4 = num11;
                            num5 = num13;
                            if (i14 == 2) {
                                ContentValues contentValues6 = new ContentValues();
                                contentValues6.put(str7, "vnd.android.cursor.item/postal-address_v2");
                                String[] rawValue = vcardItem2.getRawValue();
                                String str8 = str;
                                if (rawValue.length > 0) {
                                    contentValues6.put("data5", rawValue[0]);
                                }
                                if (rawValue.length > 1) {
                                    contentValues6.put("data6", rawValue[1]);
                                }
                                if (rawValue.length > 2) {
                                    contentValues6.put("data4", rawValue[2]);
                                }
                                if (rawValue.length > 3) {
                                    contentValues6.put("data7", rawValue[3]);
                                }
                                if (rawValue.length > 4) {
                                    contentValues6.put("data8", rawValue[4]);
                                }
                                if (rawValue.length > 5) {
                                    contentValues6.put("data9", rawValue[5]);
                                }
                                if (rawValue.length > 6) {
                                    contentValues6.put("data10", rawValue[6]);
                                }
                                String rawType2 = vcardItem2.getRawType(false);
                                if ("HOME".equalsIgnoreCase(rawType2)) {
                                    contentValues6.put("data2", (Integer) 1);
                                } else if ("WORK".equalsIgnoreCase(rawType2)) {
                                    contentValues6.put("data2", (Integer) 2);
                                } else if ("OTHER".equalsIgnoreCase(rawType2)) {
                                    contentValues6.put("data2", (Integer) 3);
                                }
                                arrayList.add(contentValues6);
                                str3 = str7;
                                arrayList2 = arrayList6;
                                str4 = str8;
                            } else {
                                String str9 = str;
                                if (i14 == 20) {
                                    ContentValues contentValues7 = new ContentValues();
                                    contentValues7.put(str7, "vnd.android.cursor.item/im");
                                    String rawType3 = vcardItem2.getRawType(true);
                                    String rawType4 = vcardItem2.getRawType(false);
                                    str3 = str7;
                                    contentValues7.put(str9, vcardItem2.getValue(false));
                                    if ("AIM".equalsIgnoreCase(rawType3)) {
                                        num7 = num5;
                                        contentValues7.put("data5", num7);
                                        str5 = str9;
                                    } else {
                                        str5 = str9;
                                        num7 = num5;
                                        if ("MSN".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data5", (Integer) 1);
                                        } else if ("YAHOO".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data5", (Integer) 2);
                                        } else if ("SKYPE".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data5", (Integer) 3);
                                        } else if ("QQ".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data5", num4);
                                        } else if ("GOOGLE-TALK".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data5", num3);
                                        } else if ("ICQ".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data5", num2);
                                        } else if ("JABBER".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data5", num);
                                        } else if ("NETMEETING".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data5", (Integer) 8);
                                        } else {
                                            contentValues7.put("data5", (Integer) (-1));
                                            contentValues7.put("data6", vcardItem2.getRawType(true));
                                        }
                                    }
                                    if ("HOME".equalsIgnoreCase(rawType4)) {
                                        contentValues7.put("data2", (Integer) 1);
                                    } else if ("WORK".equalsIgnoreCase(rawType4)) {
                                        contentValues7.put("data2", (Integer) 2);
                                    } else if ("OTHER".equalsIgnoreCase(rawType4)) {
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
                                    if (i14 != 6 || z11) {
                                        num5 = num14;
                                        arrayList2 = arrayList6;
                                    } else {
                                        ContentValues contentValues8 = new ContentValues();
                                        String str10 = str3;
                                        contentValues8.put(str10, "vnd.android.cursor.item/organization");
                                        int i15 = i13;
                                        while (i15 < arrayList6.size()) {
                                            ArrayList arrayList8 = arrayList6;
                                            AndroidUtilities.VcardItem vcardItem3 = (AndroidUtilities.VcardItem) arrayList8.get(i15);
                                            int i16 = i15;
                                            String str11 = str10;
                                            if (vcardItem3.type == 6) {
                                                String rawType5 = vcardItem3.getRawType(true);
                                                if ("ORG".equalsIgnoreCase(rawType5)) {
                                                    String[] rawValue2 = vcardItem3.getRawValue();
                                                    if (rawValue2.length != 0) {
                                                        num6 = num14;
                                                        if (rawValue2.length >= 1) {
                                                            contentValues8.put(str4, rawValue2[0]);
                                                        }
                                                        if (rawValue2.length >= 2) {
                                                            contentValues8.put("data5", rawValue2[1]);
                                                        }
                                                    }
                                                } else {
                                                    num6 = num14;
                                                    if ("TITLE".equalsIgnoreCase(rawType5)) {
                                                        contentValues8.put("data4", vcardItem3.getValue(false));
                                                    } else if ("ROLE".equalsIgnoreCase(rawType5)) {
                                                        contentValues8.put("data4", vcardItem3.getValue(false));
                                                    }
                                                }
                                                String rawType6 = vcardItem3.getRawType(true);
                                                if ("WORK".equalsIgnoreCase(rawType6)) {
                                                    contentValues8.put("data2", (Integer) 1);
                                                } else if ("OTHER".equalsIgnoreCase(rawType6)) {
                                                    contentValues8.put("data2", (Integer) 2);
                                                }
                                                i15 = i16 + 1;
                                                arrayList6 = arrayList8;
                                                num14 = num6;
                                                str10 = str11;
                                            }
                                            num6 = num14;
                                            i15 = i16 + 1;
                                            arrayList6 = arrayList8;
                                            num14 = num6;
                                            str10 = str11;
                                        }
                                        str3 = str10;
                                        num5 = num14;
                                        arrayList2 = arrayList6;
                                        arrayList.add(contentValues8);
                                        z10 = true;
                                        i12 = i13 + 1;
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
                    str4 = str;
                    arrayList2 = arrayList6;
                }
            }
            z10 = z11;
            i12 = i13 + 1;
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
            wd0Var.f34211r.getParentActivity().startActivity(intent3);
            wd0Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
