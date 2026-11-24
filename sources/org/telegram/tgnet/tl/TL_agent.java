package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public class TL_agent {

    public static class Providers extends TLObject {
        public static Providers TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (Providers) TLObject.TLdeserialize(Providers.class, fromConstructor(i), inputSerializedData, i, z);
        }

        private static Providers fromConstructor(int i) {
            if (i != -2027776014) {
                if (i != 1140283053) {
                    return null;
                }
                return new TL_providersNotModified();
            }
            return new TL_providers();
        }
    }

    public static class TL_models extends TLObject {
        public static final int constructor = 852822840;
        public int flags;
        public ArrayList<agentModel> models = new ArrayList<>();
        public String next_offset;

        public static TL_models TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TL_models tL_models;
            if (i == 852822840) {
                tL_models = new TL_models();
            } else {
                tL_models = null;
            }
            return (TL_models) TLObject.TLdeserialize(TL_models.class, tL_models, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.models = Vector.deserialize(inputSerializedData, new rfb((byte) 14), z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(852822840);
            int i = this.flags;
            if (this.next_offset != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(i, 1, z);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            Vector.serialize(outputSerializedData, this.models);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
        }
    }

    public static class TL_providers extends Providers {
        public static final int constructor = -2027776014;
        public long hash;
        public ArrayList<agentProvider> providers = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.hash = inputSerializedData.readInt64(z);
            this.providers = Vector.deserialize(inputSerializedData, new rfb((byte) 15), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2027776014);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.providers);
        }
    }

    public static class agentModel extends TLObject {
        public static final int constructor = -707511254;
        public String description;
        public boolean effort_supported;
        public int flags;
        public long icon_emoji_id;
        public String id;
        public String name;

        public static agentModel TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            agentModel agentmodel;
            if (i == -707511254) {
                agentmodel = new agentModel();
            } else {
                agentmodel = null;
            }
            return (agentModel) TLObject.TLdeserialize(agentModel.class, agentmodel, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.effort_supported = TLObject.hasFlag(readInt32, 4);
            this.id = inputSerializedData.readString(z);
            this.name = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.description = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.icon_emoji_id = inputSerializedData.readInt64(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(-707511254);
            int i = this.flags;
            if (this.description != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(i, 1, z);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 4, this.effort_supported);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeString(this.id);
            outputSerializedData.writeString(this.name);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt64(this.icon_emoji_id);
            }
        }
    }

    public static class agentProvider extends TLObject {
        public static final int constructor = 1194491015;
        public int flags;
        public long icon_emoji_id;
        public String id;
        public String key_url;
        public boolean models_searchable;
        public String title;
        public String vendor;

        public static agentProvider TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            agentProvider agentprovider;
            if (i == 1194491015) {
                agentprovider = new agentProvider();
            } else {
                agentprovider = null;
            }
            return (agentProvider) TLObject.TLdeserialize(agentProvider.class, agentprovider, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.id = inputSerializedData.readString(z);
            this.title = inputSerializedData.readString(z);
            this.vendor = inputSerializedData.readString(z);
            this.key_url = inputSerializedData.readString(z);
            this.models_searchable = TLObject.hasFlag(this.flags, 1);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.icon_emoji_id = inputSerializedData.readInt64(z);
            }
        }

        public void serializeParams(OutputSerializedData outputSerializedData) {
            int flag = TLObject.setFlag(this.flags, 1, this.models_searchable);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.vendor);
            outputSerializedData.writeString(this.key_url);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt64(this.icon_emoji_id);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1194491015);
            serializeParams(outputSerializedData);
        }
    }

    public static class providerKey extends TLObject {
        public static final int constructor = 2018344464;
        public int date_connected;
        public String key_last4;
        public String provider;

        public static providerKey TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            providerKey providerkey;
            if (i == 2018344464) {
                providerkey = new providerKey();
            } else {
                providerkey = null;
            }
            return (providerKey) TLObject.TLdeserialize(providerKey.class, providerkey, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.provider = inputSerializedData.readString(z);
            this.key_last4 = inputSerializedData.readString(z);
            this.date_connected = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2018344464);
            outputSerializedData.writeString(this.provider);
            outputSerializedData.writeString(this.key_last4);
            outputSerializedData.writeInt32(this.date_connected);
        }
    }

    public static class settings extends TLObject {
        public static final int constructor = 1107246551;
        public String active_provider;
        public String effort;
        public boolean effort_supported;
        public int flags;
        public ArrayList<providerKey> keys = new ArrayList<>();
        public String model;
        public String model_name;

        public static settings TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            settings settingsVar;
            if (i == 1107246551) {
                settingsVar = new settings();
            } else {
                settingsVar = null;
            }
            return (settings) TLObject.TLdeserialize(settings.class, settingsVar, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.effort_supported = TLObject.hasFlag(readInt32, 16);
            this.keys = Vector.deserialize(inputSerializedData, new rfb((byte) 16), z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.active_provider = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.model = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.model_name = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.effort = inputSerializedData.readString(z);
            }
        }

        public void serializeParams(OutputSerializedData outputSerializedData) {
            boolean z;
            boolean z2;
            boolean z3;
            int i = this.flags;
            boolean z4 = false;
            if (this.active_provider != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(i, 1, z);
            this.flags = flag;
            if (this.model != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            int flag2 = TLObject.setFlag(flag, 2, z2);
            this.flags = flag2;
            if (this.model_name != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            int flag3 = TLObject.setFlag(flag2, 4, z3);
            this.flags = flag3;
            if (this.effort != null) {
                z4 = true;
            }
            int flag4 = TLObject.setFlag(flag3, 8, z4);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16, this.effort_supported);
            this.flags = flag5;
            outputSerializedData.writeInt32(flag5);
            Vector.serialize(outputSerializedData, this.keys);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.active_provider);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.model);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.model_name);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.effort);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1107246551);
            serializeParams(outputSerializedData);
        }
    }

    public static class updateAgentSettings extends TLRPC.Update {
        public static final int constructor = -1164453001;
        public settings settings;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.settings = settings.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1164453001);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    public static class connect extends TLMethod<settings> {
        public static final int constructor = -14388756;
        public String key;
        public String provider;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-14388756);
            outputSerializedData.writeString(this.provider);
            outputSerializedData.writeString(this.key);
        }

        @Override
        public settings deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return settings.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class disconnect extends TLMethod<settings> {
        public static final int constructor = -1698892007;
        public String provider;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1698892007);
            outputSerializedData.writeString(this.provider);
        }

        @Override
        public settings deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return settings.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class getModels extends TLMethod<TL_models> {
        public static final int constructor = -388683502;
        public int limit;
        public String offset;
        public String provider;
        public String query;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(-388683502);
            boolean z2 = false;
            if (this.query != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            if (this.offset != null) {
                z2 = true;
            }
            int flag2 = TLObject.setFlag(flag, 2, z2);
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeString(this.provider);
            if (TLObject.hasFlag(flag2, 1)) {
                outputSerializedData.writeString(this.query);
            }
            if (TLObject.hasFlag(flag2, 2)) {
                outputSerializedData.writeString(this.offset);
            }
            outputSerializedData.writeInt32(this.limit);
        }

        @Override
        public TL_models deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_models.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class getProviders extends TLMethod<Providers> {
        public static final int constructor = -837913581;
        public long hash;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-837913581);
            outputSerializedData.writeInt64(this.hash);
        }

        @Override
        public Providers deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return Providers.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class getSettings extends TLMethod<settings> {
        public static final int constructor = -82864297;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-82864297);
        }

        @Override
        public settings deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return settings.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class setActiveProvider extends TLMethod<settings> {
        public static final int constructor = -1129164408;
        public String provider;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1129164408);
            outputSerializedData.writeString(this.provider);
        }

        @Override
        public settings deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return settings.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class setEffort extends TLMethod<settings> {
        public static final int constructor = 2029114055;
        public String effort;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2029114055);
            outputSerializedData.writeString(this.effort);
        }

        @Override
        public settings deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return settings.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class setModel extends TLMethod<settings> {
        public static final int constructor = 561927239;
        public String model;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(561927239);
            outputSerializedData.writeString(this.model);
        }

        @Override
        public settings deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return settings.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class TL_providersNotModified extends Providers {
        public static final int constructor = 1140283053;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1140283053);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }
    }
}
